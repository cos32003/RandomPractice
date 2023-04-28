package PracticeCoding;

import java.util.LinkedList;

/*
Merge two sorted linklist, {1,3,5,7},{2,4}
The output should be {1,2,3,4,5,7}
Use recursive to resolve the problem.
 */
public class MergeTwoLinkedList {

  /* public ListNode mergeTwoLists(ListNode1 list1,ListNode2 list2){
      LinkedList<Integer> linkedlist = new LinkedList<>();
      if(list1 == null){
          return list2;
      }
      if(list2 == null){
          return list1;
      }
      if(list1.val<list2.val){
          list1.next=mergeTwoLists(list1.next,list2);
          return list1;
      }
      if(list1.val>list2.val){
          list2.next=mergeTwoLists(list2.next,list1);
          return list2;
      }
  }

*/
}
