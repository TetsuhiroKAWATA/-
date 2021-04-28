/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 乱数出力機;


import java.math.*;
/**
 *
 * @author philo
 */
public class 乱数出力機 {
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int M=3;//作りたい乱数のパターンの数
        int N=21;//出したい乱数の数
        int min=0;//最小値
        double random = 0;
        
        for(int i=0; i<N; i++){
            random = Math.random();
            System.out.println((int)(random*M)+min);
        }
    }
    
}
