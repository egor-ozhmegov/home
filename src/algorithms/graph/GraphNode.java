package algorithms.graph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class GraphNode {

    public GraphNode(String name) {
        this.name = name;
    }

    private String name;

    private List<GraphNode> shortestPath = new LinkedList<>();

    private Integer distance = Integer.MAX_VALUE;

    Map<GraphNode, Integer> neighborNodes = new HashMap<>();

    public void addDestination(GraphNode destination, int distance) {
        neighborNodes.put(destination, distance);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<GraphNode> getShortestPath() {
        return shortestPath;
    }

    public void setShortestPath(List<GraphNode> shortestPath) {
        this.shortestPath = shortestPath;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public Map<GraphNode, Integer> getNeighborNodes() {
        return neighborNodes;
    }

    public void setNeighborNodes(Map<GraphNode, Integer> neighborNodes) {
        this.neighborNodes = neighborNodes;
    }

    @Override
    public String toString() {
        return "GraphNode{" +
                "name='" + name + '\'' +
                ", distance=" + distance +
                '}';
    }
}
