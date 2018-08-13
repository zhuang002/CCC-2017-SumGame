/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumgame;

import java.util.Scanner;

/**
 *
 * @author zhuan
 */
public class SumGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] team1=new int[n];
        
        int days=-1;
        int sum1=0;
        int sum2=0;
        for (int i=0;i<n;i++) {
            team1[i]=sc.nextInt();
        }
        for (int i=0;i<n;i++) {
            sum1+=team1[i];
            sum2+=sc.nextInt();
            if (sum1==sum2) days=i;
        }
        days++;
        System.out.print(days);
    }
    
}
