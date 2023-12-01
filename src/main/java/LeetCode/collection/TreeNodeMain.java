package LeetCode.collection;

import java.util.*;

/**
 * @Description:
 * @PackageName: LeetCode.collection
 * @Author: csc
 * @Create: 2022-10-12 9:47
 * @Version: 1.0
 */
public class TreeNodeMain {
    public static void main(String[] args) {
        TreeNodeMain main = new TreeNodeMain();
        TreeNode root = main.buildTree(new Integer[]{4, 1, 6, 0, 2, 5, 7, null, null, null, 3, null, null, null, 8});

//        TreeNode treeNode = main.constructMaximumBinaryTree(new int[]{2, 1, 5, 4});
//        TreeNode node = main.insertIntoMaxTree(treeNode, 3);

//        System.out.println(main.longestUnivaluePath(treeNode));
//        List<TreeNode> treeNodes = main.findDuplicateSubtrees(main.buildTree());

//        main.buildTree(new int[]{3, 9, 20, 15, 7}, new int[]{9, 3, 15, 20, 7});

//        main.maxPathSum(main.buildTree());
//        main.invertTree(main.buildTree());

//        Codec codec = new TreeNodeMain.Codec();
//        String serialize = codec.serialize(root);
//        System.out.println(serialize);
//        TreeNode deserialize = codec.deserialize(serialize);
//        System.out.println(deserialize);
//        System.out.println(main.pathSum(root, 8));
        System.out.println(main.convertBST(root));
    }

    TreeNode buildTree(Integer[] nums) {
        if (nums.length == 0) return new TreeNode(0);
        Deque<TreeNode> nodeQueue = new LinkedList<>();
        TreeNode root = new TreeNode(nums[0]);
        nodeQueue.offer(root);
        TreeNode cur;
        // 记录当前行节点的数量（注意不一定是2的幂，而是上一行中非空节点的数量乘2）
        int lineNodeNum = 2;
        // 记录当前行中数字在数组中的开始位置
        int startIndex = 1;
        // 记录数组中剩余的元素的数量
        int restLength = nums.length - 1;

        while (restLength > 0) {
            // 只有最后一行可以不满，其余行必须是满的
//            // 若输入的数组的数量是错误的，直接跳出程序
//            if (restLength < lineNodeNum) {
//                System.out.println("Wrong Input!");
//                return new TreeNode(0);
//            }
            for (int i = startIndex; i < startIndex + lineNodeNum; i = i + 2) {
                // 说明已经将nums中的数字用完，此时应停止遍历，并可以直接返回root
                if (i == nums.length) return root;
                cur = nodeQueue.poll();
                if (nums[i] != null) {
                    cur.left = new TreeNode(nums[i]);
                    nodeQueue.offer(cur.left);
                }
                // 同上，说明已经将nums中的数字用完，此时应停止遍历，并可以直接返回root
                if (i + 1 == nums.length) return root;
                if (nums[i + 1] != null) {
                    cur.right = new TreeNode(nums[i + 1]);
                    nodeQueue.offer(cur.right);
                }
            }
            startIndex += lineNodeNum;
            restLength -= lineNodeNum;
            lineNodeNum = nodeQueue.size() * 2;
        }

        return root;
    }

    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null) return root2;
        if (root2 == null) return root1;
        TreeNode mergeRoot = new TreeNode(root1.val + root2.val);
        mergeRoot.left = mergeTrees(root1.left, root2.left);
        mergeRoot.right = mergeTrees(root1.right, root2.right);
        return mergeRoot;
    }

    private int sum = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return sum - 1;
    }

    private int depth(TreeNode root) {
        if (root == null) return 0;
        int L = depth(root.left);
        int R = depth(root.right);
        sum = Math.max(sum, L + R + 1);
        return Math.max(L, R) + 1;
    }


    public TreeNode convertBST(TreeNode root) {
        rfs(root);
        return root;
    }

    private void rfs(TreeNode root) {
        if (root == null) return;
        rfs(root.right);
        sum += root.val;
        root.val = sum;
        rfs(root.left);
    }

    public int pathSum(TreeNode root, int targetSum) {
        Map<Long, Integer> prefix = new HashMap<Long, Integer>();
        prefix.put(0L, 1);
        return dfs(root, prefix, 0, targetSum);
    }

    public int dfs(TreeNode root, Map<Long, Integer> prefix, long curr, int targetSum) {
        if (root == null) return 0;

        curr += root.val;
        int ret = prefix.getOrDefault(curr - targetSum, 0);
        prefix.put(curr, prefix.getOrDefault(curr, 0) + 1);
        ret += dfs(root.left, prefix, curr, targetSum);
        ret += dfs(root.right, prefix, curr, targetSum);
        //回溯
        prefix.put(curr, prefix.getOrDefault(curr, 0) - 1);
        return ret;
    }


    public int rob(TreeNode root) {
        int[] rootStatus = dfs(root);
        return Math.max(rootStatus[0], rootStatus[1]);
    }

    private int[] dfs(TreeNode root) {
        if (root == null) return new int[]{0, 0};
        int[] l = dfs(root.left);
        int[] r = dfs(root.right);
        int selected = root.val + l[1] + r[1];
        int notSelected = Math.max(l[0], l[1]) + Math.max(r[0], r[1]);
        return new int[]{selected, notSelected};
    }

    static class Codec {
        public static final String NONE = "none";
        public static final String NODE_SPLIT = ",";
        public static final String NULL_STR = NONE + NODE_SPLIT;

        // Encodes a tree to a single string.
        public String serialize(TreeNode root) {
            return serialize(root, "");
        }

        private String serialize(TreeNode root, String str) {
            if (root == null) {
                str += NULL_STR;
            } else {
                str += root.val + NODE_SPLIT;
                str = serialize(root.left, str);
                str = serialize(root.right, str);
            }
            return str;
        }

        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
            String[] split = data.split(NODE_SPLIT);
            List<String> dataList = new LinkedList<>(Arrays.asList(split));
            return deserialize(dataList);
        }

        private TreeNode deserialize(List<String> dataList) {
            if (NONE.equals(dataList.get(0))) {
                dataList.remove(0);
                return null;
            }
            TreeNode root = new TreeNode(Integer.valueOf(dataList.get(0)));
            dataList.remove(0);
            root.left = deserialize(dataList);
            root.right = deserialize(dataList);
            return root;
        }
    }

    public TreeNode invertTree(TreeNode root) {
        if (root == null) return root;
        TreeNode temp = root.right;
        root.right = root.left;
        root.left = temp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }

    static int max = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        return getSum(root);
    }

    public int getSum(TreeNode root) {
        if (root == null) return 0;
        int leftSum = Math.max(getSum(root.left), 0);
        int rightSum = Math.max(getSum(root.right), 0);
        int sum = leftSum + rightSum + root.val;
        max = Math.max(max, sum);
        return root.val + Math.max(leftSum, rightSum);
    }

    public void flatten(TreeNode root) {
        while (root != null) {
            if (root.left == null) {
                root = root.right;
            } else {
                TreeNode temp = root.left;
                while (temp.right != null) {
                    temp = temp.right;
                }
                temp.right = root.right;
                root.right = root.left;
                root.left = null;
                root = root.right;
            }
        }
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTreeHelper(preorder, inorder, (long) Integer.MAX_VALUE + 1);
    }

    int pre = 0;
    int in = 0;

    private TreeNode buildTreeHelper(int[] preorder, int[] inorder, long stop) {
        //到达末尾返回 null
        if (pre == preorder.length) {
            return null;
        }
        //到达停止点返回 null
        //当前停止点已经用了，in 后移
        if (inorder[in] == stop) {
            in++;
            return null;
        }
        int root_val = preorder[pre++];
        TreeNode root = new TreeNode(root_val);
        //左子树的停止点是当前的根节点
        root.left = buildTreeHelper(preorder, inorder, root_val);
        //右子树的停止点是当前树的停止点
        root.right = buildTreeHelper(preorder, inorder, stop);
        return root;
    }


//    Map<String, TreeNode> seen = new HashMap<>();
//    Set<TreeNode> repeat = new HashSet<>();
//
//    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
//        dfs(root);
//        return new ArrayList<>(repeat);
//    }
//
//    private String dfs(TreeNode root) {
//        if (root == null) return "";
//
//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append(root.val)
//                .append("(").append(dfs(root.left)).append(")(")
//                .append(dfs(root.right)).append(")");
//        String serial = stringBuilder.toString();
//        if (seen.containsKey(serial)) {
//            //不能直接add(root)，防止重复的多次添加
//            repeat.add(seen.get(serial));
//        } else {
//            seen.put(serial, root);
//        }
//        return serial;
//    }


//    static int max = 0;

    public int longestUnivaluePath(TreeNode root) {
        if (root == null) return 0;
        getMaxL(root, root.val);
        return max;
    }

    private int getMaxL(TreeNode root, int val) {
        if (root == null) return 0;
        int left = getMaxL(root.left, root.val);
        int right = getMaxL(root.right, root.val);
        max = Math.max(max, left + right);
        if (root.val == val) return Math.max(left, right) + 1;
        return 0;
    }

    public TreeNode insertIntoMaxTree(TreeNode root, int val) {
        if (root == null || root.val < val) {
            TreeNode node = new TreeNode(val);
            node.left = root;
            return node;
        } else {
            root.right = insertIntoMaxTree(root.right, val);
            return root;
        }
    }

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return constructBinaryTree(nums, 0, nums.length - 1);
    }

    public TreeNode constructBinaryTree(int[] nums, int l, int r) {
        int maxIndex = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = l; i <= r; i++) {
            if (max < nums[i]) {
                max = nums[i];
                maxIndex = i;
            }
        }
        if (max == Integer.MIN_VALUE) return null;
        return new TreeNode(max, constructBinaryTree(nums, l, maxIndex - 1), constructBinaryTree(nums, maxIndex + 1, r));
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
