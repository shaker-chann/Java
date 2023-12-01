package LeetCode;

/**
 * @Description
 * @Author csc
 * @Date 2019/8/13 14:42
 * @Version 1.0
 **/

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Trie trie = new Trie();
        System.out.println(trie);
        System.out.println(trie.children);
        System.out.println(trie.children.length);
        System.out.println(trie.children[0]);
        System.out.println(trie.children[0] == null);
        trie.children[0] = new Trie();
        System.out.println(trie.children[0] == null);

    }

    static class Trie {
        private Trie[] children;
        //区分search和startsWith
        private boolean end;

        public Trie() {
            children = new Trie[26];

        }


        public void insert(String word) {
            Trie node = this;
            for (int i = 0; i < word.length(); i++) {
                int index = word.charAt(i) - 'a';
                if (node.children[index] == null) {
                    node.children[index] = new Trie();
                }
                node = node.children[index];
            }
            node.end = true;
        }

        public boolean search(String word) {
            Trie node = searchPrefix(word);
            return node != null && node.end;
        }

        public boolean startsWith(String prefix) {
            return searchPrefix(prefix) != null;
        }

        public Trie searchPrefix(String word) {
            Trie node = this;
            for (int i = 0; i < word.length(); i++) {
                int index = word.charAt(i) - 'a';
                if (node.children[index] == null) {
                    return null;
                }
                node = node.children[index];
            }
            return node;
        }
    }

    //哈希表+双向链表
    class LRUCache {
        class DLinkedNode {
            int key;
            int value;
            DLinkedNode pre;
            DLinkedNode next;

            public DLinkedNode() {
            }

            public DLinkedNode(int key, int value) {
                this.key = key;
                this.value = value;
            }
        }

        int size;
        int capacity;
        DLinkedNode head;
        DLinkedNode tail;
        Map<Integer, DLinkedNode> cache;

        public LRUCache(int capacity) {
            size = 0;
            this.capacity = capacity;
            head = new DLinkedNode();
            tail = new DLinkedNode();
            head.next = tail;
            tail.pre = head;
            cache = new HashMap<>();
        }

        public int get(int key) {
            DLinkedNode node = cache.get(key);
            if (node == null) return -1;
            moveToHead(node);
            return node.value;
        }


        public void put(int key, int value) {
            DLinkedNode node = cache.get(key);
            if (node == null) {
                node = new DLinkedNode(key, value);
                addToHead(node);
                cache.put(key, node);
                size++;
                if (size > capacity) {
                    DLinkedNode tail = removeTail();
                    cache.remove(tail.key);
                    size--;
                }
            } else {
                node.value = value;
                moveToHead(node);
            }
        }

        private void moveToHead(DLinkedNode node) {
            removeNode(node);
            addToHead(node);
        }

        private void removeNode(DLinkedNode node) {
            node.pre.next = node.next;
            node.next.pre = node.pre;
        }

        private void addToHead(DLinkedNode node) {
            //node与head的next相连
            node.next = head.next;
            head.next.pre = node;
            //head与node相连
            head.next = node;
            node.pre = head;
        }

        private DLinkedNode removeTail() {
            DLinkedNode node = tail.pre;
            removeNode(node);
            return node;
        }
    }
}