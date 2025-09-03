package java_advanced_01.day16.listEx;

public class SingleLinkedListEx<T> {

    public Node<T> head = null;


    public class Node<T> {
        T data;
        Node<T> next = null;

        // constructor
        public Node(T data){
            this.data = data;
        }
    }

    // methods
    public void addNode(T data){
        if(head == null) {
            head = new Node<T>(data);
        } else {
            Node<T> node = this.head;
            while (node.next != null) {
                node = node.next;
            }
            node.next = new Node<T>(data);
        }
    }

    /* head가 비어있으면 head는 현재 node의 head가 됨
    * head가 이미 있으면 - node의 다음 값이 있는지를 반복문으로 검사
    * 다음 값이 있으면 node의 다음 값을 node에 대입, 이후 node의 다음 값에는 새 node 대입
    * 다음 값이 없으면 수행 안하고 그냥 다음 값에 새 node 바로 대입
    * */

    public void printAll(){
        if(head != null) {
            Node<T> node = this.head;
            System.out.println(node.data);
            while(node.next != null){
                node = node.next;
                System.out.println(node.data);
            }
        }
    }

    public Node<T> search(T data){
        // node를 반환할건데 세부 로직 필요
        // = 파라미터 data가 node.data와 일치하면 검색 결과 반환(Node타입)
        if (head != null) {
            Node<T> node = this.head;
            while (node.next != null) {
                if (data.equals(node.data)) {
                    return node;
                }
                node = node.next;
            }
        }
        return null;
    }

    /*
     * node.data = 1 -> node.next = 2
     * node.data = 2 -> node.next = 3
     * node.data = 3 -> node.next = 4
     * node.data = 4 -> node.next = 5
     * node.data = 5 -> node.next = null
     * node 5, 1 addIn하면
     * node.data = 1 -> node.next = 5
     * node.data = 5 -> node.next = 2
     * node.data = 2 -> node.next = 3
     * node.data = 3 -> node.next = 4
     * node.data = 4 -> node.next = 5
     * node.data = 5 -> node.next = null
     *
     * */

    public void addNodeInside(T data, T isData){
        // 1,2,3, addNodeInside(5,1)   1,5,2,3
        // data 앞에 isData 넣어줌
        if (head != null) {
            Node<T> node = this.head;
            Node<T> temp = null;

            while (node.next != null) {
                if (search(isData).data.equals(node.data)) {
                    temp = node.next;
                    Node<T> addedNode = new Node<>(data);
                    node.next = addedNode;
                    addedNode.next = temp;
                }
                node = node.next;
            }
        }
    }
    /*
    * node.data = 1 -> node.next = 2
    * node.data = 2 -> node.next = 3
    * node.data = 3 -> node.next = 4
    * node.data = 4 -> node.next = 5
    * node.data = 5 -> node.next = null
    * node 2를 delete하면
    * node.data = 1 -> node.next = 3
    * node.data = 3 -> node.next = 4
    * node.data = 4 -> node.next = 5
    * node.data = 5 -> node.next = null
    * 이 뒤부터는 null이라 출력 안하면 됨
    *
    * */
    public boolean deleteNode(T isData){
        // isData를 삭제
        if (head != null) {
            Node<T> node = this.head;
            Node<T> temp = null;

            while (node.next != null) {
                if (search(isData).data.equals(node.data)) {
                    temp = node.next;
                    node.data = node.next.data;
                    node.next = temp.next;

                } else {
                    node = node.next;
                }
            }
            return true;
        }
        return false;
    }

    // main
    public static void main(String[] args) {
        SingleLinkedListEx<Integer> myLinkedList = new SingleLinkedListEx<Integer>();
        myLinkedList.addNode(1);
        myLinkedList.addNode(2);
        myLinkedList.addNode(3);
        myLinkedList.addNode(4);
        myLinkedList.addNode(5);

        myLinkedList.addNodeInside(5, 1);
        System.out.println(myLinkedList.deleteNode(2));

//        System.out.println(myLinkedList.head.data);
//        System.out.println(myLinkedList.head.next.data);
//        System.out.println(myLinkedList.head.next.next.data);

//        System.out.println(myLinkedList.search(5).data);
//        System.out.println(myLinkedList.deleteNode(3));
        myLinkedList.printAll();


    }
}