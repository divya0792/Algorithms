package com.util.basic.tree;

import java.util.HashMap;
import java.util.Map;

public class TrieUsingMap {
    class TrieNode {
        Map<Character, TrieNode> children;
        boolean isWord;

        TrieNode() {
            children = new HashMap<>();
        }
    }

    TrieUsingMap() {
        root = new TrieNode();
    }
    private TrieNode root;

    public void insert(String key) {
        if(key == null) {
            throw new IllegalArgumentException();
        }
        TrieNode current = root;
        for(char character : key.toCharArray()) {
            if(!current.children.containsKey(character)) {
                current.children.put(character, new TrieNode());
            }
            current = current.children.get(character);
        }
        current.isWord = true;
    }

    public boolean search(String key) {
        TrieNode current = root;
        for(char character : key.toCharArray()) {
            if(!current.children.containsKey(character)) {
                return false;
            }
            current = current.children.get(character);
        }
        return current.isWord;
    }

    public boolean startsWith(String prefix) {
        TrieNode current = root;
        for(char character : prefix.toCharArray()) {
            if(!current.children.containsKey(character)) {
                return false;
            }
            current = current.children.get(character);
        }
        return true;
    }

    public static void main(String[] args) {
        TrieUsingMap trie = new TrieUsingMap();
        trie.insert("apple");
        trie.insert("appy");
        trie.search("apple");
        trie.startsWith("app");
    }
}
