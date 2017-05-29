/**
 * Created by Андрей on 27.05.2017.
 */
public class Solution {

    public static int solution(int A, int B) {

        int count = 0;

        if (A > B) {
            System.out.println("Ошибка: А больше B");
        } else if (A < 0 && B < 0){
            return 0; // если интервал отрицательный то количество не может быть больше 0.
        } else {
            if (A >= -10000 && A <= 10000 && B >= -10000 && B<= 10000) {
                for (int i = A; i <= B; i++){
                    if ((Math.sqrt(i) % 1) == 0 ){
                        System.out.print(i + " "); //удалить перед сдачей
                        count++;
                    }
                }
                System.out.println(" "); //Удалить перед сдачей
            } else {
                System.out.println("Ошибка. Значения переменных А и B должны находиться в пределах интервала от -10 000 до 10 000 ");
            }
        }
        return count;
    }


    public static void main(String[] args) {
        int A = 0, B = 0;
        System.out.println("В диапазоне чисел от " + A + " до " + B + " количество int корней = " + solution(A,B));
    }



}
