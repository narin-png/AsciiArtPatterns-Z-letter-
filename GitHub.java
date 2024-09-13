package taskexamples;

import java.util.Scanner;

public class GitHub {
    public static void main(String[] args) {

        int height=5;
        int width=5;
        for(int i=1;i<=height;i++){
            for(int j=1;j<=width;j++){
                if(i==1|| i==5 || j==4 && i==2 || j==3 && i==3 || j==2 && i==4)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
