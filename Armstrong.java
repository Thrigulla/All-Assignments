package Practice;

import java.util.Scanner;
import java.util.SortedMap;

public class Armstrong {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.println("Enter your number");
        int num=r.nextInt();
        int sum=0;
        int temp=num;
        while (num>0){
        int j=num%10;
        sum=sum+(j*j*j);
        num=num/10;

    }
        if(sum==temp){
            System.out.println("Its an armstrong number");
        }
        else {
            System.out.println("It is not an armstrong number");
        }
    }
}
