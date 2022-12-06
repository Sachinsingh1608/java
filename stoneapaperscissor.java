import java.util.*;
public class Main{
    public static void main(String[] args)
    {
    Random random=new Random();
    int comp=random.nextInt(3);
   int c=0,u=0;
   Scanner sc=new Scanner(System.in);
   System.out.print("0:-Rock\n 1:- Paper\n 2:- Scissor\n");
   for(int i=1;i<=5;i++){
       System.out.println("*****************************************************");
   System.out.print("\nEnter your choice\n");
   int user=sc.nextInt();
   if(comp==0 && user==1)
   u++;
   //System.out.printf("you win computer choice %d and yours %d\n",comp,user);
   else if(user==0 && comp==1)
   c++;
    //System.out.printf("you lose choice %d and yours %d\n",comp,user);
    else if(comp==1 && user==2)
    u++;
    // System.out.printf("you win computer choice %d and yours %d\n",comp,user);
     else if(comp==2 && user==1)
     c++;
     // System.out.printf("you lose computer choice %d and yours %d\n",comp,user);
      else if(comp==2 && user==0)
      u++;
       //System.out.printf("you win computer choice %d and yours %d\n",comp,user);
       else if(comp==0 && user==2)
       c++;
       // System.out.printf("you lose computer choice %d and yours %d\n",comp,user);
    
  //else
  //System.out.printf("computer choice %d user choice %d drwa",comp,user);
   }
   if(u>c)
   System.out.println("you win:");
   else
   System.out.println("you lose");
   System.out.printf("your point %d computer point %d",u,c);
}
}
