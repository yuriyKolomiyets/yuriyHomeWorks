package week04.node;

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
        }

        else {
            return chain.value + " -> " + toString(chain.next);
        }
    }

    public static Node[] toArray(Node chain) {

        return

    }

    public static Node insertByIndex(int index, Node newNode, Node chain) {

        if (index <= 0) {

            return chain;
        }

        public static Node remove ( int index, Node chain){
            return null;
        }

        // use equals method
        public static int indexOf (Object target, Node chain){
            if (chain == null) {
                return -1;
            }

        }

        // 1,2,3,4,5 - 5,4,3,2,1
        // create new
        // use existed, one loop
        // advanced *
        public static Node reverse (Node chain){
            return null;
        }

    }
}
