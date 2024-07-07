import LinkedList.LL;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class ListNode{
    int val;
    ListNode next;

    ListNode(int data){
        this.val = data;
        this.next = null;
    }
    ListNode(){

    }
}
public class rough {
    public static void main(String[] args) {
        int[] arr = {5,3,1,2,5,1,2};
        ListNode head = new ListNode(arr[0]);
        for(int i=1;i<arr.length;i++){
            ListNode temp = new ListNode(arr[i]);
            ListNode curr = head;
            while(curr.next!=null){
                curr = curr.next;
            }
            curr.next = temp;

        }

        int[] ans = Solution.nodesBetweenCriticalPoints(head);
        System.out.println(Arrays.toString(ans));

    }
}


class Solution {
    public static int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] arr = {-1,-1};
        int[] ans = {5,3,1,2,5,1,2};
        ListNode prev = head;
        ListNode curr = head.next;
        ListNode critical = null;
        int maxCount = 0;
        int minCount = 0;

        while(curr.next!=null){

            if(isCritical(prev,curr)){
                if(maxCount!=0){
                    if(arr[0]==-1){
                        arr[0] = ++minCount;
                    }
                    else arr[0] = Math.min(arr[0],++minCount);
                    minCount = 0;
                    arr[1] = ++maxCount;
                }
                critical = curr;
            }
            else if(critical!=null){
                maxCount++;
                minCount++;
            }

            curr = curr.next;
            prev = prev.next;
        }

        return arr;
    }

    public static boolean isCritical(ListNode prev,ListNode curr){
        if(curr.val>curr.next.val && curr.val>prev.val){
            return true;
        }
        if(curr.val<curr.next.val && curr.val<prev.val){
            return true;
        }

        return false;
    }
}