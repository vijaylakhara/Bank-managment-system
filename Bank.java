import java.util.*;
class create{
    String name1;
    long number1,amount1,amount2=750000;
    int pass1=0,conf,pass2,pass3;
    Random rm=new Random();
   long AccountNO=rm.nextLong(999999999);
     void create(){
         System.out.print("Enter Your Name : ");
         Scanner sc=new Scanner(System.in);
         name1=sc.nextLine();
         System.out.print("Enter Phone Number : ");
         number1 =sc.nextLong();
         System.out.print("Enter the amount : ");
         amount1 =sc.nextLong();
          while(true){
                  System.out.print("Create the Password : ");
                  pass1=sc.nextInt();
                  System.out.print("Confirm the Password : ");
                  conf=sc.nextInt();
              if(pass1==conf){
                  return;
              }
            }
          }
          void ShowInfo(){
         System.out.println("Your name is:"+name1);
         System.out.println("Password is:"+pass1);
         System.out.println("Amount:"+amount1);
         System.out.println("Phone Number"+number1);
         System.out.println("Account NUmber is :"+AccountNO);
          }
     }
class login extends create{
    Scanner sc=new Scanner(System.in);
    long acc;
    int num2;
    void login(){
        System.out.print("Enter Our Account no.:");
        acc=sc.nextLong();
        System.out.print("Enter Our Password:");
          pass2=sc.nextInt();
        if(acc==123456789 && pass2==0000) {
            while(true) {
                System.out.println("check Balance  press 1 :");
                System.out.println("Change Your Password press 2 :");
                System.out.println("logout press 3 :");
                System.out.print("Enter your choice :");
                num2 = sc.nextInt();
                if (num2 == 1) {
                    System.out.println("Balance :" + amount2);
                } else if (num2 == 2) {
                    System.out.println("Enter a New password :");
                    pass2 = sc.nextInt();
                    System.out.println("New password is :"+pass2);
                } else {

                    return;
                }
            }
        }
    }
}
class transfer extends login{
    int am;
    void transfer(){
        while(true){
        System.out.print("Enter Your Account no. : ");
        acc=sc.nextLong();
        System.out.print("Enter password : ");
        pass2=sc.nextInt();
        if(acc==123456789 && pass2==0000) {
            System.out.print("Enter amount your will be transfer: ");
            am = sc.nextInt();
            System.out.print("Enter Account number your will be transferring ");
            pass3 = sc.nextInt();
            if (pass3 != 0 && am <= amount2) {
                System.out.println("money hava be transferred!!!");
                System.out.println("your current balance is :" + (amount2 - am));
                return;
            } else {
                System.out.println("Enter correct amount :" + amount2);
            }
        }
       }
    }
}
public class Bank {
    public static void main(String[] args) {
      System.out.println("******Welcome To Freedom Bank******");
      System.out.println("Create New Account press 1");
      System.out.println("Login  Account press 2");
      System.out.println("Amount transfer press 3");
      System.out.println("Exit press 4");
      Scanner sc=new Scanner(System.in);
      System.out.print("\nEnter Your Choice :");
      int num1=sc.nextInt();
      if(num1==1){
          transfer ac=new transfer();
          ac.create();
          ac.ShowInfo();
      }
      else if (num1==2){
          transfer ac=new transfer();
          ac.login();
      } else if (num1==3) {
          transfer tf=new transfer();
          tf.transfer();

      }
      else if (num1==4){
          return;
      }
    }
}
