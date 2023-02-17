import java.util.*;

public class QueueFramWork {
    static class Queue{
        static Stack <Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty(){
            return s1.isEmpty();

        }

        public static void add(int data){
            while(!s1.isEmpty()){
             s2.push(s1.pop());
            }
            s1.push(data);

            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }


        }

        public static int remove(){
            while(isEmpty()){
                System.out.println("Empty Queue");
                return -1;

            }
          return  s1.pop();
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Empty queue");
                return -1;
            }
             return s1.peek();
        }

    }
    public static void main (String args[]){
        //  They both implement Deque interface.
      
        /*Linked structures are possibly the worst structure to iterate with a cache miss on each element. On top of it they consume way more memory.
         If you need add/remove of the both ends, ArrayDeque is significantly better than a linked list. Random access each element is also O(1) for a cyclic queue.
         The only better operation of a linked list is removing the current element during iteration. */

        // or Queue<Integer> q =new LinkedList<>();
     // Queue<Integer> q = new ArrayDeque<>();
     Queue q = new Queue();

       q.add(1);
       q.add(2);
       q.add(3);
       q.add(4);

       while(!q.isEmpty()){
        System.out.println(q.peek());
        q.remove();
       }
    
    }
}
