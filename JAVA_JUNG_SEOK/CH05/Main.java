package JAVA_JUNG_SEOK.CH05;


public class Main {
    public static void main(String[] args) {
        
        // ex4

        // char[] abc = { 'A', 'B', 'C', 'D'};
        // char[] num = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', };

        // System.out.println(abc);
        // System.out.println(num);

        // char[] result = new char[abc.length+num.length];

        // System.arraycopy(abc, 0, result, 0, abc.length);
        // System.arraycopy(num, 0, result, abc.length, num.length);
        // System.out.println(Arrays.toString(result));

        //==============================================================

        //ex5

        // int sum = 0;
        // float average = 0f;

        // int [] score = {100, 88, 100, 100, 90};

        // for(int i = 0; i < score.length; i++){
        //     sum += score[i];
        // }
        // average = sum / (float)score.length;

        // System.out.println(average);

        //==============================================================

        //ex6 최대 값 최소 값

        // int[] score = {79,88,91,33,100,55,95};

        // int max = score[0];// 첫번째 값으로 초기화
        // int min = score[0];
        
        // for(int i = 0; i< score.length; i++){
        //     if(score[i] > max){
        //         max = score[i];
        //     }else if(score[i] < min){
        //         min = score[i];
        //     }
        // }
        // System.out.println("최대 값 : "+max);
        // System.out.println("최소 값 : "+min);

        //==============================================================

        //ex 11 갯수 세기

        // int [] numArr = new int[10];
        // int [] counter = new int[10];

        // for(int i = 0 ; i < numArr.length; i++){
        //     numArr[i] = (int)(Math.random()*10);
        //     System.out.print(numArr[i]);
        // }
        // System.out.println();

        // for(int i = 0 ; i < numArr.length; i++){
        //     counter[numArr[i]]++;
        // }
        // for(int i = 0 ; i < numArr.length; i++){
        //     System.out.println(i+"의 갯수 : "+counter[i]);
        // }

        //==============================================================

        //ex 12 String List

        // String[] names = {"Kim", "Park","Yi"};

        // for(int i = 0; i < names.length; i++){
        //     System.out.println("names["+i+"]"+names[i]);
        // }
        
        // String temp = names[2];
        // System.out.println("temp : "+temp);
        // names[0] = "YU";

        // for(String str : names) System.out.println("str : "+str);

        //==============================================================

        //ex 18

        // int[][] score = {
        //                     { 100, 100, 100}
        //                     ,{ 20, 20, 20}
        //                     ,{ 35, 30, 30}
        //                     ,{ 40, 40, 40}
        // };

        // int sum = 0;

        // for(int i = 0; i < score.length; i++){
        //     for(int j = 0; j <  score[i].length; j++){
        //         System.out.printf("score[%d][%d]=%d%n", i, j, score[i][j]);
        //     }
        // }

        // for(int[] tmp : score){
        //     System.out.println(tmp[0]);
        //     for(int i : tmp){
        //         sum += i;
        //     }
        // }
        // System.out.println("sum = "+sum);
        




    }
}
