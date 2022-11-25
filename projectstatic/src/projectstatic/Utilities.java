package projectstatic;

public class Utilities {

    public static double PI = 3.14;

    public static int sum(int x, int y){
        return x + y;
    }

    public static int exponentiation(int x, int y){
        if(y == 0){
            return 1;
        }else{
            int exp = 1;
            for(int i = 1; i <= y; i++){
                exp = exp * x;
            }
            return exp;
        }
    }
}