public class Main {
    public static void main(String[] args) {

        //      Урок Строки. Задание 1.
        System.out.println("Урок Строки. Задание 1.");
        String firstName = "Иван";
        String middleName = "Иванович";
        String lastName = "Иванов";
        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println("ФИО сотрудника - " + firstName + " " + middleName + " " + lastName);

        //      Урок Строки. Задание 2.
        System.out.println("Урок Строки. Задание 2.");
        String fullNameUpper = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullNameUpper);

        //      Урок Строки. Задание 3.
        System.out.println("Урок Строки. Задание 3.");
       fullName = "Иванов Семён Семёнович";
       fullName = fullName.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника — " + fullName);


            }

        }



