package HW;

public class stars {

    
    public static void 사곱사(){
        for (int i = 0 ; i < 5 ; i++){
            for (int j = 0 ; j < 5 ; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }



    public static void 왼쪽정렬_일_오(){
        for(int i = 0; i < 5; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            if(i != 4){
                System.out.println("");
            }
        }
    }
    // for(int i = 0 ; i < 5 ; i++){//other version
    //     for(int j = 0; j < 5 ; j++){
    //         if(i >= j){
    //             System.out.print("*");
    //         }
    //     }
    //     System.out.println("");
    // }
    
    public static void 왼쪽정렬_오_일(){
        for(int i = 0; i < 5; i++){
            for(int j = 5; j > 0; j--){
                if(i < j){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            if(i != 4){
                System.out.println("");
            }
        }
    }
    // for(int i = 0 ; i < 5; i++){
    //     for(int j = 4; j > -1 ; j--){
    //         if(i >= j){
    //             System.out.print("*");
    //         }
    //         else{
    //             System.out.print(" ");
    //         }
    //     }
    //     if(i != 4){
    //         System.out.println("");
    //     }
    // }

    // for(int i = 0 ; i < 5; i++){
    //     for(int j = 4; j >= i ; j--){
    //         System.out.print("*");    
    //     }
    //     if(i != 4){
    //         System.out.println("");
    //     }
    // }

    
    public static void 오른정렬_일_오(){
        for(int i = 1 ; i < 6 ; i++){
            for (int j = 5 ; j > 0; j--){
                if(i < j){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            if(i != 5){
                System.out.println("");
            }
        }
    }
    // for(int i = 0; i < 5 ; i++){
    //     for(int j = 4 ; j > -1 ;j--){
    //         if(i <= j){
    //             System.out.print("*");
    //         }
    //         else{
    //             System.out.print(" ");
    //         }
    //     }
    //     if(i != 4){
    //         System.out.println("");
    //     }
    // }

    public static void 오른정렬_오_일(){
        for(int i = 0 ; i < 5 ; i++){
            for(int j = 0; j < 5; j++){
                if(i <= j){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            if(i != 4){
                System.out.println("");
            }
        }
    }

    public static void 피라미드(){
        for(int i = 0 ; i <4 ; i++){
            for(int j = 0; i < 3 - j; j++){
                System.out.print(" ");
            }
            for(int j = 0; i*2 > j-1; j++){//앞에 포문에서 다 띄웠기 때문에 카운트는 {i:j} = {0:0},{1,0},{1,1},{1,2}가 된다
                System.out.print("*");
            }

            if(i != 3){
                System.out.println("");
            }
        }
    }

}
