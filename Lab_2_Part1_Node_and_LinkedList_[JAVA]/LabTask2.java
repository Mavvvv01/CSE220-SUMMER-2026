// LabTask2: Word Decoder
public class LabTask2 {
    
    // No need to submit this task
    public static Node wordDecoder( Node head ){
        Node temp = head;
        int count = 0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }

        int r = 13%count;
        int index = 1;
        Node newHead = new Node(null);
        Node nTemp = head.next;
        while(nTemp!=null){
            if(index%r==0){
                Node newNode = new Node(nTemp.elem);
                newNode.next = newHead.next;
                newHead.next = newNode;
            }
            index++;
            nTemp = nTemp.next;
        }
        return newHead;
    }

    //NOTE: if you find any issue with the driver code please inform AIB
    //DO NOT TOUCH THE DRIVER CODE BELOW
    public static void main(String[] args){
        System.out.println("==============Test Case 1=============");
        Node head = LinkedList.createList(new Character[]{'B', 'M', 'D', 'T', 'N', 'O', 'A', 'P', 'S', 'C'});
        System.out.print("Encoded Word: ");
        LinkedList.printLL(head);
        System.out.println("\nExpected output: null -> C -> A -> T");
        Node result = wordDecoder(head);
        System.out.println( "Your output: ");
        LinkedList.printLL(result); //This should print null -> C -> A -> T
        System.out.println();
        System.out.println("==============Test Case 2=============");
        head = LinkedList.createList(new Character[]{'Z', 'O', 'T', 'N', 'X'});
        System.out.print("Encoded Word: ");
        LinkedList.printLL(head);
        System.out.println("\nExpected output: null -> N");
        result = wordDecoder(head);
        System.out.println( "Your output: ");
        LinkedList.printLL(result); //This should print null -> N
        System.out.println();
    }
}
