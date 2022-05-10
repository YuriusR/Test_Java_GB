package Lesson5;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Николай", "Директор", "nikolay@mail.ru", 89555555555L, 72000, 42);
        Employee employee2 = new Employee("Юрий", "Администратор", "yuriy@gmail.com", 8345582L, 56000, 33);
        Employee employee3 = new Employee("Константин", "Менеджер", "sales@abc.ru", 888555L, 60000, 25);
        Employee employee4 = new Employee("Сармат", "Повар", "sarmat@mail.ru", 89552568444L, 45000, 29);
        Employee employee5 = new Employee("Алексей", "Техник", "techwin@abc.ru", 89588888888L, 55000, 40);

        Employee[] employees = {employee1, employee2, employee3, employee4, employee5};
        int empNumber = 0;


            System.out.println("Информация обо Всех сотрудниках:");
            System.out.println(Arrays.toString(employees));
            System.out.println("--------------------------");
            System.out.println("Сотрудники старше сорока:");
            for (Employee employee : employees) {
            if (employee.getAge() >= 40) {
                employee.printInfo();
            }
        }
    }
}


