package algorithms.graph;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class GraphMain {

    public static void main(String[] args) {
        var graph = new Graph();

        var nodeA = new GraphNode("A");
        var nodeB = new GraphNode("B");
        var nodeC = new GraphNode("C");
        var nodeD = new GraphNode("D");
        var nodeE = new GraphNode("E");
        var nodeF = new GraphNode("F");

        nodeA.addDestination(nodeB, 10);
        nodeA.addDestination(nodeC, 15);

        nodeB.addDestination(nodeD, 12);
        nodeB.addDestination(nodeF, 15);

        nodeC.addDestination(nodeE, 10);

        nodeD.addDestination(nodeE, 2);
        nodeD.addDestination(nodeF, 1);

        nodeF.addDestination(nodeE, 5);

        graph.addNode(nodeA);
        graph.addNode(nodeB);
        graph.addNode(nodeC);
        graph.addNode(nodeD);
        graph.addNode(nodeE);
        graph.addNode(nodeF);

        var result = dijkstraAlgorithm(graph, nodeA);
        System.out.println(graph);
    }

    private static Graph dijkstraAlgorithm(Graph graph, GraphNode rootNode) {
        Set<GraphNode> markedNodes = new HashSet<>();
        Set<GraphNode> unmarkedNodes = new HashSet<>();

        rootNode.setDistance(0);
        unmarkedNodes.add(rootNode);

        while (unmarkedNodes.size() != 0) {
            var currentNode = getLowestDistanceNode(unmarkedNodes);
            unmarkedNodes.remove(currentNode);
            var neighbors = currentNode.getNeighborNodes();
            neighbors.forEach((node, distance) -> {
                if (!markedNodes.contains(node)) {
                    calculateMinimumDistance(node, distance, currentNode);
                    unmarkedNodes.add(node);
                }
            });
            markedNodes.add(currentNode);
        }
        return graph;
    }

    private static GraphNode getLowestDistanceNode(Set<GraphNode> unmarkedNodes) {
        GraphNode lowestDistanceNode = null;
        Integer lowestDistance = Integer.MAX_VALUE;
        for (GraphNode node : unmarkedNodes) {
            if (node.getDistance() < lowestDistance) {
                lowestDistance = node.getDistance();
                lowestDistanceNode = node;
            }
        }
        return lowestDistanceNode;
    }

    private static void calculateMinimumDistance(GraphNode neighborNode,
                                                 Integer neighborDistance,
                                                 GraphNode targetNode) {
        Integer targetNodeDistance = targetNode.getDistance();
        if (targetNodeDistance + neighborDistance < neighborNode.getDistance()) {
            neighborNode.setDistance(targetNodeDistance + neighborDistance);
            var shortestPath = new LinkedList<>(targetNode.getShortestPath());
            shortestPath.add(targetNode);
            neighborNode.setShortestPath(shortestPath);
        }
    }
}
