package Lesson2;

public class HomeWork2 {

    /* method 1 */
    public static void main(String[] args) {

        TaskOne (a:12,b:3)

    }

    private void TaskOne (int a, int b){

       /*nt a=7;
        int b=-5;
        int sum = a + b;
        if (sum > 10 && sum < 20)  System.out.println("true");
        else System.out.println("false");*/

        int result = check(a,b);
        System.out.println("Результат проверки: " + result);
    }

     static int check(int c) {

         int sum = a + b;
         c = (sum > 10 && sum < 20);
         return c;
     }








}
