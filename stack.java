import java.util.*;
class stack{
   static void display(Stack<Integer> s1){
    System.out.println("the stack elements are:"+" ");
    while(!(s1.isEmpty())){
        System.out.print(s1.pop());
    }
   }
   static void search(Stack<Integer> s1,int y){
       Integer pos = (Integer) s1.search(y);
       System.out.println("element is found at:"+pos);
   }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        Stack <Integer> s1 = new Stack <Integer>();
        System.out.println("enter stack size");
        int size=sc.nextInt();
        System.out.println("enter numbers");
        for(int i=0;i<size;i++){
            int x=sc.nextInt();
             s1.push(x);
        }
      //display(s1);
      
      System.out.println("enter element to search is");
      int k=sc.nextInt();
      search(s1,k);
      sc.close();
    }
    
}