package com.util.basic.tree;

import com.util.basic.list.QueueUsingLinkedList;
import com.util.basic.list.StackUsingLinkedList;

import java.util.*;

public class BinarySearchTree {
    public Node root;
    private int count = 0;

    public class Node {
        public int data;
        public Node left;
        public Node right;

        Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    public void add(int data) {
        if(root == null) {
            root = new Node(data, null, null);
        } else {
            add(root, data);
        }
        count++;
    }

    private void add(Node node, int data) {
        if(data <= node.data) {
            if(node.left != null) {
                add(node.left, data);
            } else {
                node.left = new Node(data, null, null);
            }
        } else {
            if(node.right != null) {
                add(node.right, data);
            } else {
                node.right = new Node(data, null, null);
            }
        }
    }

    public boolean search(int data) {
        if(root == null) {
            return false;
        }
        return search(root, data);
    }

    private boolean search(Node node, int data) {
        if(node.data == data) {
            return true;
        }
        if(data < node.data) {
            if(node.left != null) {
               return search(node.left, data);
            } else {
                return false;
            }
        } else {
            if(node.right != null) {
                return search(node.right, data);
            } else {
                return false;
            }
        }
    }



    public int height() {
        return getHeight(root);
    }

    private int getHeight(Node node) {
        if(node == null) {
            return 0;
        }
        return 1 + Math.max(getHeight(node.left) , getHeight(node.right));
    }

    public void printLevelOrder() {
        QueueUsingLinkedList<Node> queue = new QueueUsingLinkedList<Node>();
        Node boundaryNode = new Node(-1, null, null);
        if(root != null) {
            queue.enqueue(root);
            queue.enqueue(boundaryNode);
        }
        printLevelOrder(queue, boundaryNode);
    }

    public void printAlternateOrder() {
        if(root == null) {
            return;
        }
        StackUsingLinkedList<Node> stack = new StackUsingLinkedList<>();
        stack.push(root);
        printAlternateOrder(stack, true);
    }

    private void printAlternateOrder(StackUsingLinkedList<Node> stack, boolean isInLine) {
        StackUsingLinkedList<Node> tempStack = new StackUsingLinkedList<>();
        while(stack.size() != 0) {
            Node node = stack.pop();
            System.out.print(node.data + " ");
            if (order(node, isInLine) != null) {
                tempStack.push(order(node, isInLine));
            }
            if (order(node, !isInLine) != null) {
                tempStack.push(order(node, !isInLine));
            }
        }
        System.out.println();
        if(tempStack.size() != 0) {
            printAlternateOrder(tempStack, !isInLine);
        }
    }

    private Node order(Node orderNode, boolean isInLine) {
        return isInLine ? orderNode.left : orderNode.right;
    }

    private void printLevelOrder(QueueUsingLinkedList<Node> queue, Node boundaryNode) {
        while(queue.getCount() != 0) {
            Node node = queue.dequeue();
            if(node != boundaryNode) {
                if(node.left != null) {
                    queue.enqueue(node.left);
                }
                if(node.right != null) {
                    queue.enqueue(node.right);
                }
                System.out.print(node.data + " ");
            }
            else {
                if(queue.getCount() != 0) {
                    queue.enqueue(boundaryNode);
                }
                System.out.println();
            }
        }
    }

    public void printLeftNodes() {
        if(root != null) {
            printLeftNodes(root);
        }
    }

    private void printLeftNodes(Node node) {
       if(node != null) {
           System.out.print(node.data + ", ");
           printLeftNodes(node.left);
       }
    }

    public void printRightNodes() {
        if(root != null) {
            printRightNodes(root);
        }
    }

    private void printRightNodes(Node node) {
        if(node != null) {
            System.out.print(node.data + ", ");
            printRightNodes(node.right);
        }
    }

    public void printLeafNodes() {
        if(root != null) {
            printLeafNodes(root);
        }
    }

    private void printLeafNodes(Node node) {
        if(node.left == null && node.right == null) {
            System.out.print(node.data + ", ");
        }
        if (node.left != null) {
            printLeafNodes(node.left);
        }
        if (node.right != null) {
            printLeafNodes(node.right);
        }
    }


    public void printPerimeterNodes() {
        if(root != null) {
            StackUsingLinkedList<Node> stack = new StackUsingLinkedList<>();
            printPerimeterNodes(root,0,0, stack);
            while(stack.size() != 0) {
                System.out.println(stack.pop().data);
            }
        }
    }

    private void printPerimeterNodes(Node node, int left, int right, StackUsingLinkedList<Node> stack) {
        if (node != null) {
            if (left == 0 && right == 0) {
                stack.push(node);
                System.out.println(stack.pop().data + ", ");
            } else if (right == 0 && left != 0) {
                stack.push(node);
                System.out.println(stack.pop().data + ", ");

            } else if (left == 0 && right != 0) {
                stack.push(node);
            } else {
                if (node.left == null && node.right == null) {
                    stack.push(node);
                    System.out.println(stack.pop().data + ", ");

                }
            }
            printPerimeterNodes(node.left, left + 1, right, stack);
            printPerimeterNodes(node.right, left, right + 1, stack);

        }
    }


    private class NodePair {
        private int horizontal;
        private Node node;

        NodePair(int horizontal, Node node) {
            this.horizontal = horizontal;
            this.node = node;
        }

        public Node getNode() {
            return node;
        }

        public int getHorizontal() {
            return horizontal;
        }
    }

    public void printBottomView() {
       printView(true);
    }
    public void TopView() {
        printView(false);
    }

    private void printView(boolean isBottom) {
        if(root != null) {
            Map<Integer, NodePair> map = new HashMap<>();
            printView(root, 0,0, map, isBottom);
            SortedSet<Integer> keys = new TreeSet<>(map.keySet());
            for(Integer key : keys) {
                System.out.print(map.get(key).getNode().data + ", ");
            }
        }
    }

    private void printView(Node node, int horizontal, int vertical, Map<Integer, NodePair> map, boolean isBottom) {
        if(node != null) {
            if(!map.containsKey(vertical) ||
                    (map.containsKey(vertical) && isBottom == map.get(vertical).getHorizontal() <= horizontal)) {
                map.put(vertical, new NodePair(horizontal, node));
            }
            printView(node.left, horizontal + 1, vertical - 1, map, isBottom);
            printView(node.right,  horizontal + 1, vertical + 1, map, isBottom);
        }
    }


    public int getWidth() {
        QueueUsingLinkedList<Node> queue = new QueueUsingLinkedList<Node>();
        Node boundaryNode = new Node(-1, null, null);
        int maxWidth = 0;
        if(root != null) {
            queue.enqueue(root);
            queue.enqueue(boundaryNode);
            maxWidth = 1;
            maxWidth = getWidth(maxWidth, queue, boundaryNode);
        }
        return maxWidth;
    }

    private int getWidth(int maxWidth, QueueUsingLinkedList<Node> queue, Node boundaryNode) {
        while(queue.getCount() != 0) {
            Node node = queue.dequeue();
            if(node != boundaryNode) {
                if(node.left != null) {
                    queue.enqueue(node.left);
                }
                if(node.right != null) {
                    queue.enqueue(node.right);
                }
            } else {
                if(queue.getCount() != 0) {
                    if(queue.getCount() > maxWidth) {
                        maxWidth = queue.getCount();
                    }
                    queue.enqueue(boundaryNode);
                }
            }
        }
        return maxWidth;
    }


    public int getCount() {
        return count;
    }

    public boolean areSiblings(Node firstNode, Node secondNode) {
        if(root == null) {
            throw new IllegalArgumentException("list is empty");
        }
        return areSiblings(root, firstNode, secondNode);
    }

    private boolean areSiblings(Node node, Node firstNode, Node secondNode) {
        if(node.left == null || node.right == null) {
            return false;
        } else if((node.left == firstNode && node.right == secondNode)
                || (node.right == firstNode && node.left == secondNode)) {
            return true;
        } else if(node.left == firstNode || node.right == secondNode
                || node.left == secondNode || node.right == firstNode) {
            return false;
        }
        return areSiblings(node.left, firstNode, secondNode) || areSiblings(node.right, firstNode, secondNode);
    }

    public void printAtLevel(int level) {
        if(root == null) {
            throw new IllegalArgumentException("list is null");
        }
        if(level <= 0) {
            throw new IllegalArgumentException("level cant be 0 or negative");
        }

        printAtLevel(root, level - 1);
    }

    private void printAtLevel(Node node, int level) {
        if(node == null) {
            return;
        }
        if(level == 0) {
            System.out.print(node.data + ", ");
        }
        printAtLevel(node.left, level - 1);
        printAtLevel(node.right, level - 1);
    }

    public boolean isSumExists(int num) {
        if(root == null) {
            throw new IllegalArgumentException("list is null");
        }
        return isSumExists(root, num);
    }

    private boolean isSumExists(Node node, int num) {
        if(node == null) {
            return false;
        }
        num = num - node.data;
        if(num == 0 && node.left == null && node.right == null) {
            return true;
        }

        return isSumExists(node.left, num) || isSumExists(node.right, num);
    }

    public boolean isPerfect() {
        if(root == null) {
            throw new IllegalArgumentException("list is null");
        }
        int height = height();
        return isPerfect(root, height, 0);
    }

    private boolean isPerfect(Node node, int height, int level) {
        if(node == null) {
            return false;
        }
        level++;

        if(level == height && node.left == null && node.right == null) {
            return true;
        }
        return isPerfect(node.left, height, level) && isPerfect(node.right, height, level);
    }

    public boolean isMirrorImage(BinarySearchTree tree) {
        if(tree == null) {
            throw new IllegalArgumentException("tree cannot be null");
        }
        if(tree.root == null || root == null) {
            throw new IllegalArgumentException("list is empty");
        }
        if(height() != tree.height() || getCount() != tree.getCount()) {
            return false;
        }

        return isMirrorImage(root, tree.root);
    }

    private boolean isMirrorImage(Node firstNode, Node secondNode) {
        if(firstNode == null && secondNode == null) {
            return true;
        }
        if(firstNode == null || secondNode == null) {
            return false;
        }
        if(firstNode.data == secondNode.data) {
            return isMirrorImage(firstNode.left, secondNode.right) && isMirrorImage(firstNode.right, secondNode.left);
        }
        return false;
    }


    public boolean isSame(BinarySearchTree tree) {
        if(tree == null) {
            throw new IllegalArgumentException("tree cannot be null");
        }
        if(tree.root == null || root == null) {
            throw new IllegalArgumentException("list is empty");
        }
        if(height() != tree.height() || getCount() != tree.getCount()) {
            return false;
        }
        return isSame(root, tree.root);
    }

    private boolean isSame(Node firstNode, Node secondNode) {
        if(firstNode == null && secondNode == null) {
            return true;
        }
        if(firstNode == null || secondNode == null) {
            return false;
        }
        if(firstNode.data == secondNode.data) {
            return isSame(firstNode.left, secondNode.left) && isSame(firstNode.right, secondNode.right);
        }
        return false;
    }

    public void printMidLevel() {
        if(root == null) {
            throw new IllegalArgumentException("list is empty");
        }
        Node front = root;
        Node back = root;
        printMidLevel(front, back);
    }


    private void printMidLevel(Node front, Node back) {
        if(front == null) {
            System.out.print(back.data + ", ");
            return;
        }

        front = front.left;
        if(front != null) {
            front = front.left;
        }

        printMidLevel(front, back.left);
        printMidLevel(front, back.right);
    }

    public boolean hasDuplicates() {
        if(root == null) {
            throw new IllegalArgumentException("list is empty");
        }
        HashSet<Integer> set = new HashSet<>();
        return hasDuplicates(root, set);
    }

    private boolean hasDuplicates(Node node, HashSet<Integer> set) {
        if(node == null) {
            return false;
        }
        if(set.contains(node.data)) {
            return true;
         }
        set.add(node.data);
       return hasDuplicates(node.left, set) || hasDuplicates(node.right, set);
    }

    public void printAllPaths() {
        if(root == null) {
            throw new IllegalArgumentException("list is empty");
        }
        String str = "";
        printAllPaths(root, str);
    }

    private void printAllPaths(Node node, String str) {
        if(node == null) {
            return;
        }
        str += node.data + ", ";
        if(node.left == null && node.right == null) {
            System.out.print(str);
            System.out.println();
            return;
        }
        printAllPaths(node.left, str);
        printAllPaths(node.right, str);
    }

    public void printFullNodes() {
        if(root == null) {
            throw new IllegalArgumentException("list is empty");
        }
        printFullNodes(root);
    }

    private void printFullNodes(Node node) {
        if(node == null) {
            return;
        }
        if(node.left != null && node.right != null) {
            System.out.print(node.data + ", ");
        }
        printFullNodes(node.left);
        printFullNodes(node.right);
    }

    public boolean isSameShape(Node firstNode, Node secondNode) {
        if(firstNode == null && secondNode == null) {
            return true;
        }
        if(firstNode == null || secondNode == null) {
            return false;
        }
        return isSameShape(firstNode.left, secondNode.left) && isSameShape(firstNode.right, secondNode.right);
    }

    public boolean areLeafNodesAtSameLevel() {
        if(root == null) {
            throw new IllegalArgumentException("list is empty");
        }
        int height = height();

        return areLeafNodesAtSameLevel(root, height, 0);
    }

    private boolean areLeafNodesAtSameLevel(Node node, int height, int level) {
        if (node == null) {
            return false;
        }
        level++;
        if (node.left == null && node.right == null) {
            return level == height;
        }
        if (node.right == null) {
            return areLeafNodesAtSameLevel(node.left, height, level);
        } else if(node.left == null) {
            return areLeafNodesAtSameLevel(node.right, height, level);
        } else {
            return areLeafNodesAtSameLevel(node.left, height, level) && areLeafNodesAtSameLevel(node.right, height, level);
        }

    }

    public int findKthSmallest(int k) {
        if(root == null) {
            throw new IllegalArgumentException("root is null");
        }
        List<Integer> list = new ArrayList<>();

         findKthSmallest(root, k, list);
         return list.get(0);
    }

    private int findKthSmallest(Node node, int k, List<Integer> list) {
        if(node == null) {
            return k;
        }
        k = findKthSmallest(node.left, k, list);
        k--;
        if(k == 0) {
            list.add(node.data);
            return -1;
        }
         return findKthSmallest(node.right, k, list);

    }

    public int findKthLargest(int k) {
        if(root == null) {
            throw new IllegalArgumentException("root is null");
        }
        List<Integer> list = new ArrayList<>();

        findKthLargest(root, k, list);
        return list.get(0);
    }

    private int findKthLargest(Node node, int k, List<Integer> list) {
        if(node == null) {
            return k;
        }
        k = findKthLargest(node.right, k, list);
        k--;
        if(k == 0) {
            list.add(node.data);
            return -1;
        }
        return findKthLargest(node.left, k, list);

    }

    public void printRange(int lowerRange, int upperRange) {
        if(root == null) {
            return;
        }
        if(upperRange < lowerRange) {
            throw new IllegalArgumentException("upper range cant be smaller than lower range");
        }
        printRange(root, lowerRange, upperRange);
    }

    private void printRange(Node node, int lowerRange, int upperRange) {
        if(node == null) {
            return;
        }
        if(node.data >= lowerRange && node.data <= upperRange) {
            System.out.print(node.data + ", ");
        }
        if(node.data >= lowerRange) {
            printRange(node.left, lowerRange, upperRange);
        }
        if(node.data < upperRange) {
            printRange(node.right, lowerRange, upperRange);
        }
    }

    public int findCeiling(int k) {
        if(root == null) {
            return -1;
        }

       return findCeiling(root, k, Integer.MAX_VALUE);
    }

    private int findCeiling(Node node, int k, int value) {
        if(node == null) {
            return value;
        }
        if(node.data == k) {
            value = node.data;
            return value;
        }
        if(node.data > k) {
            value = node.data;
            value = findCeiling(node.left, k, value);
            return value;
        } else {
           return findCeiling(node.right, k, value);
        }
    }



}
