package home.ndrew;

/**
 * Created by Андрей on 27.05.2017.
 * updated 04.06
 */
public class Solution {

    final public static int LEFT_BOUNDARY = -10000;
    final public static int RIGHT_BOUNDARY = 10000;
    final public static int ILLEGAL_INPUT_ERROR_CODE = -1;
    final public static int ILLEGAL_RANGE_ERROR_CODE = -2;


    public static int solution(int a, int b) {

        int count = 0;

        if (a > b) {
            return ILLEGAL_INPUT_ERROR_CODE;
        } else if (a < 0 && b < 0) {
            return 0; // если интервал отрицательный то количество не может быть больше 0.
        } else {
            if (a >= LEFT_BOUNDARY && a <= RIGHT_BOUNDARY && b >= LEFT_BOUNDARY && b<= RIGHT_BOUNDARY) {
                for (int i = a; i <= b; i++){
                    if ((Math.sqrt(i) % 1) == 0 ){
                        count++;
                    }
                }
            } else {
                return ILLEGAL_RANGE_ERROR_CODE;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        int a = 0, b = 100;

        int result = solution(a, b);
        switch(result) {
            case ILLEGAL_INPUT_ERROR_CODE:
                System.out.println("Ошибка: А больше B");
                break;
            case ILLEGAL_RANGE_ERROR_CODE:
                System.out.println("A, B должны быть в диапазоне [-10000, 10000]");
                break;
            default:
                System.out.println("В диапазоне чисел от " + a + " до " + b + " количество int корней = " + result);
        }

    }



}
