package com.util.basic.tree;

public class TrieUsingArray {
    class TrieNode {

        private final TrieNode[] children;
        boolean isWord = false;

        TrieNode() {
            children = new TrieNode[26];
        }
    }

    private final TrieNode root;

    TrieUsingArray() {
        root = new TrieNode();
    }

    public void insert(String key) {
        if(key == null) {
            throw new IllegalArgumentException();
        }
        TrieNode current = root;

        for(char c : key.toCharArray()) {
            if(current.children[c - 'a'] == null) {
                current.children[c - 'a'] = new TrieNode();
            }
            current = current.children[c - 'a'];
        }
        current.isWord = true;
    }

    public boolean search(String key) {
        if(key == null) {
            throw new IllegalArgumentException();
        }
        TrieNode current = root;

        for(char c : key.toCharArray()) {
            if(current.children[c - 'a'] == null) {
                return false;
            }
            current = current.children[c - 'a'];
        }
       return current.isWord;
    }

    public boolean startsWith(String prefix) {
        if(prefix == null) {
            throw new IllegalArgumentException();
        }
        TrieNode current = root;

        for(char c : prefix.toCharArray()) {
            if(current.children[c - 'a'] == null) {
                return false;
            }
            current = current.children[c - 'a'];
        }
        return true;
    }
}
