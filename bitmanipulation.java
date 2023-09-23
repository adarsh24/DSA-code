import java.util.*;
public class bitmanipulation {
    public static int GetIthBit(int n,int i){
        int BitMask = 1;
        BitMask = 1<<i;
        if((n & BitMask) == 0){
            return 0;
        }
        else{
            return 1;
        }
    }

    public static int SetIthBit(int n,int i){
         int BitMask = 1;
         BitMask = 1<<i;
         return n| BitMask;
    }
     public static int ClearIthBit(int n,int i){
        int BitMask = 1;
        BitMask = ~(1<<i);
        return n & BitMask;

     }

     public static int UpadateIthBit(int n,int i,int NewBit){
        // if(NewBit == 0){
        //    return ClearIthBit(n,i);
        // }
        // else{
        //    return SetIthBit(n,i);
        // }
        n = ClearIthBit(n,i); 
        NewBit = NewBit<<i;
        return n| NewBit;
     }

     public static Boolean PowerOfTwo(int n){
        if((n|n+1) == n+1){
            return true;
        }
        else{
            return false;
        }
     }

     public static int CountSetBit(int n){
        int count = 0;
        while(n>0){
            if((n & 1) != 0){
                count++;
            }
            n = n>>1;
        }
        return count;
     }

     public static int RangeItoJ(int n,int i,int j){
        int a =  (~0)<<(j+1);
        int b =  1<<i -1;
        //int BitMask = a|b;
        return n & (a|b);
     }

     public static int FindDistinct(int arr[]){
            int XOR = 0;
            int XOR1 = 0; 
        for(int i=0;i<arr.length;i++){
            
            if((arr[i] & 1) == 0){
                 XOR = XOR^arr[i];
            }
            else{
                XOR1 = XOR1^arr[i];
            }
        }
        int ans = sort(XOR,XOR1);
        return 
     }
    public static void main(String args[]){
      //System.out.print(GetIthBit(10,0));
      //System.out.print(SetIthBit(10,0));
     // System.out.print(ClearIthBit(5,2));
     // System.out.print(UpadateIthBit(10,2,1));
      //System.out.println(PowerOfTwo(9));
      //System.out.println(CountSetBit(10));
      //System.out.println(RangeItoJ(10,2,4));
      int arr[] = {1,2,3,2,1,4};
      System.out.println(FindDistinct(arr));
    }
}
