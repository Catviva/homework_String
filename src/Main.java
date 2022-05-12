import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Exercise 1

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = firstName + " " +  middleName +" " + lastName;
        {
            System.out.println("ФИО сотрудника —  " + fullName);

        // Exercise 2

        fullName = fullName.toUpperCase();
            System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName);

        // Exercise 3

        fullName = "Иванов Семён Семёнович";
            System.out.print("Данные ФИО сотрудника — " + fullName.replace('ё','е'));
        }

    }
}
