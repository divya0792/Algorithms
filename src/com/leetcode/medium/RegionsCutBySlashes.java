package com.leetcode.medium;

public class RegionsCutBySlashes {
    public int regionsBySlashes(String[] grid) {
        int N = grid.length;
        int[][] arr = new int[3 * N][3 * N];

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if(grid[i].charAt(j) == '/') {
                    arr[3 * i][3 * j + 2] = 1;
                    arr[3 * i + 1][3 * j + 1] = 1;
                    arr[3 * i + 2][3 * j] = 1;
                } else if(grid[i].charAt(j) == '\\') {
                    arr[3 * i][3 * j] = 1;
                    arr[3 * i + 1][3 * j + 1] = 1;
                    arr[3 * i + 2][3 * j + 2] = 1;
                }
            }
        }
        return calculateConnectedComponents(arr);
    }

    private int calculateConnectedComponents(int[][] arr) {
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                if(arr[i][j] == 0) {
                    update(i, j, arr);
                    count++;
                }
            }
        }
        return count;
    }

    private void update(int i, int j, int[][] arr) {
        if(i >= 0 && j >= 0 && i < arr.length && j < arr.length && arr[i][j] == 0) {
            arr[i][j] = 1;
            update(i - 1, j, arr);
            update(i, j - 1, arr);
            update(i + 1, j, arr);
            update(i, j + 1, arr);
        }
    }
}
