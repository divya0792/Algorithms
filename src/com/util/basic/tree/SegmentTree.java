package com.util.basic.tree;

public class SegmentTree {
    private int[] tree;
    private int[] nums;

    public SegmentTree(int[] nums) {
        this.nums = nums;
        tree = new int[4 * nums.length];
        createTree(0, 0, nums.length - 1, nums);
    }

    private void createTree(int node, int start, int end, int[] nums) {
        if(start == end) {
            tree[node] = nums[start];
        } else {
            int mid = (start + end) / 2;
            createTree(2 * node + 1, start, mid, nums);
            createTree(2 * node + 2, mid + 1, end, nums);
            tree[node] = tree[2 * node + 1] + tree[2 * node + 2];
        }
    }

    public void update(int index, int val) {
        int diff = val - nums[index];
        update(0, index, diff, 0, nums.length - 1);
    }

    private void update(int node, int index, int diff, int start, int end) {
        tree[node] += diff;

        if(start == end && start == index) {
            nums[index] += diff;
        } else {
           int mid = (start + end) / 2;
           if(index >= start && index <= mid) {
               update(2 * node + 1, index, diff, start, mid);
           } else {
               update(2 * node + 2, index, diff, mid + 1, end);
           }
        }
    }


    public int query(int startIndex, int endIndex) {
        return query(0,0,nums.length - 1, startIndex, endIndex);
    }

    private int query(int node, int start, int end, int left, int right) {
        if(start == left && end == right) {
            return tree[node];

        } else {
            int mid = (start + end) / 2;

            if(left >= start && right <= mid) {
                return query(2 * node + 1, start, mid, left, right);

            } else if(left > mid && right <= end){
                return query(2 * node + 2, mid + 1, end, left, right);

            } else {
                return query(2 * node + 1, start, mid, left, mid) +
                        query(2 * node + 2, mid + 1, end, mid + 1, right);
            }
        }
    }

}