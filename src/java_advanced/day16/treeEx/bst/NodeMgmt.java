package java_advanced.day16.treeEx.bst;
//노드 클래스 만들기
public class NodeMgmt {

    Node head = null;

    public class Node {
        Node left, right;
        int value;
        public Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public boolean insertNode(int data) {
        //CASE1 : 노드가 하나도 없을 때
            if (head == null) {
                head = new Node(data);
            } else {
                Node find = this.head;
                while (true) {
                    //CASE2 : 노드가 하나 이상 들어가 있을 때


                    //CASE2-1 : 현재 노드 왼쪽에 노드가 들어가야 할 때


                    //CASE2-2 : 현재 노드 오른쪽에 노드가 들어가야 할 때


                }
            }
        return true;
    }
}
