package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description 克隆图
 * @Author csc
 * @Date 2019/8/12 15:41
 * @Version 1.0
 **/
public class CloneGraph {
    Map<Node, Node> map = new HashMap<>();

    public Node cloneGraph(Node node) {
        if (node == null) return null;
        Node clone = new Node(node.val, new ArrayList<Node>());
        map.put(node, clone);
        for (Node neighbor : node.neighbors) {
            if (!map.containsKey(neighbor)) {
                Node newNeighbor = cloneGraph(neighbor);
                clone.neighbors.add(newNeighbor);
            } else {
                clone.neighbors.add(map.get(neighbor));
            }
        }
        return clone;
    }
}

class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {
    }

    public Node(int _val, List<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
};