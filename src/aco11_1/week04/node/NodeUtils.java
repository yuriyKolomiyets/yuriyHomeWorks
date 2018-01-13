package aco11_1.week04.node;

public class NodeUtils {
    public static Node addToHead(Node newNode, Node chainHead) {
        return newNode.next = chainHead;
    }

    public static void addToTail(Node newNode, Node chainHead) {
        if (chainHead.next == null) {
            chainHead.next = newNode;
            return;
        }
        addToTail(newNode, chainHead.next);
    }

    public static String toString(Node chain) {
        if (chain == null) {
            return null;
        } else {
            return chain.value + " -> " + toString(chain.next);
        }
    }

    public static Node[] toArray(Node chain) {

        if (chain == null) {
            return new Node[]{};

        } else {
            Node[] ret = toArray(chain.next);
            Node[] res = new Node[ret.length + 1];
            res[0] = chain;
            System.arraycopy(ret, 0, res, 1, ret.length);
            return res;
        }
    }

    public static Node insertByIndex(int index, Node newNode, Node chain) {

        if (index <= 0) {
            newNode.next = chain;
            return newNode;

        } else {
            int currentIndex = 0;
            if (currentIndex != index) {
                currentIndex++;
                insertByIndex(index, newNode, chain.next);
            }
            newNode.next = chain.next;
            chain.next = newNode;
        }
        return chain;
    }

    public static Node remove(int index, Node chain) {

        int currentIndex = 0;
        Node leftChain = null;
        if (currentIndex != index) {
            if (currentIndex == (index - 1)) {
                leftChain = chain;
            } else {
                currentIndex++;
                remove(index, chain.next);
            }
            leftChain.next = chain.next;
        }
        return chain;
    }

        // use equals method

    public static int indexOf (Object target, Node chain){
            if (chain == null) {
                return -1;
            }

            int currentIndex = 0;

            if (chain.value.equals(target)) {
                return currentIndex;
            } else {
                currentIndex++;
                indexOf(target, chain.next);
                return currentIndex;
            }
    }
}
