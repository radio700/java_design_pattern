package HW;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for (int q = 0; q < number ; q++){

            int[] lotto = new int[6];

            for(int i = 0; i < 6 ; i++){
                lotto[i] = (int)(Math.random()*45+1);
                for(int j = 0; j<i; j++){
                    if(lotto[i]==lotto[j]){
                        i--;
                        break;
                    }
                }
            }

            for(int i = 0; i < 6 ; i++){
                for(int j = 0; j<i; j++){
                    if(lotto[i] < lotto[j]){
                        int Temp = lotto[i];
                        lotto[i] = lotto[j];
                        lotto[j] = Temp;
                    }
                }
            }

            
            for(int i=0; i <6 ; i++){
                if(i == 0){
                    System.out.print("[");
                }
                if(i != 5){
                    System.out.print(lotto[i]+ ", ");
                }
                else{
                    System.out.print(lotto[i]+"]");
                }
            }
            System.out.println("");
        }
    }
}    