package Lesson2;


public class HomeWork2 {


    public static void main(String[] args) {

        TaskOne ( 7, 8);
        TaskTwo(-15 );
        TaskThree( 3 );
        TaskFour("*", 6);
        final int YEAR = 2000;
        TaskFive(YEAR);

    }
//    method 1
    private static void TaskOne(int a, int b){

        int sum = (a + b);
        if (sum > 10 && sum < 20)  System.out.println("true");
        else System.out.println("false");
        System.out.println( " " );


        }

//    method 2
    private static void TaskTwo(int i) {

        if (i >=0)
        System.out.println("Число положительное");
        else System.out.println("Число отрицательное");
        System.out.println( " " );

    }

//    method 3
    private static void TaskThree(int c){

        boolean d = c>=0;
        System.out.println(d);
        System.out.println("  ");


    }

//    Method 4
    private static void TaskFour(String line,int number){


        for (int i = 0; i < number ; i++) {
            for (int j = 0; j < number ; j++) {
                System.out.print(line + " ");
            }
            System.out.println(" ");

        }
        System.out.println(" ");


    }

//    Method 5*
     private static void TaskFive(int YEAR){

         System.out.println("К сожалению, я так и не смог разобраться с 5й задачей...Возможно, не хватило времени...");

     }

}
