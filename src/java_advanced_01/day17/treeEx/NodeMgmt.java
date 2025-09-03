package java_advanced_01.day17.treeEx;

public class NodeMgmt {
    // 주소값 넣을 자리
    Node head = null;

    public class Node {
        Node left, right;
        int value;
        public Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }

        public boolean insertNode(int data) {
            // case 1. Node가 하나도 없을 때
            if (head == null) {
                head = new Node(data);
            } else {
                Node findNode = head;
                while (true) {

                }
            }

            // case 2. Node가 하나 이상 있을 때
                // case 2-1. 현재 Node 왼쪽에 Node가 들어가야 할 때

                // case 2-2. 현재 Node 오른쪽에 Node가 들어가야 할 때

            return true;
        }

    }
}
