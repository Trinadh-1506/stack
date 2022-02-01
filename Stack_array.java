import java.util.*;
public class Stack_array {
    int top;
    boolean isEmpty(){
        return (top<0); 
    }
    Stack_array(){
        top=-1;
    }
     boolean push(Scanner sc,int n,int arr[]){
       if(top > (n-1)){
           System.out.println("stack overflow");
           return false;
       }
       else{
           System.out.println("Enter the element to push");
           int k=sc.nextInt();
           arr[++top]=k;
           System.out.println(k+" is pushed into stack");
           return true;
       }
    }
     int pop(int arr[]){
        if(top < 0){
            System.out.println("stack underflow");
            return 0;
        }else{
            int x =arr[top--];
            return x;
        }
    }
     int peek(int arr[]){
        if(top<0){
            System.out.println("stack is empty");
            return 0;
        }
        else{
        return arr[top];
        }
    }
     void dispaly(int arr[]){
         System.out.print("The elements in the stack are : ");
        for(int i=top;i>-1;i--){
          System.out.print(" "+arr[i]);
        }
        System.out.println();
    }
    public static void main(String args[]){
        Stack_array s=new Stack_array();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of stack : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            //to take user input we take scanner as a parameter
            s.push(sc,n,arr);
        }
        s.dispaly(arr);
        System.out.println("Popped element is : "+s.pop(arr));
        System.out.println("Element at peek is  : "+s.peek(arr));
        s.dispaly(arr);
        sc.close();
    }
    
}
