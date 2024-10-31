public class Main {
    public static void main(String[] args) {
        System.out.println("\ntask1\n");

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;

        System.out.println("Ф. И. О. сотрудника - " + fullName);

        System.out.println("\ntask2\n");

        String employeeFullNameForReport = fullName.toUpperCase();

        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета - " + employeeFullNameForReport);

        System.out.println("\ntask3\n");

        firstName = "Семён";
        middleName = "Семёнович";
        lastName = "Иванов";
        fullName = lastName + " " + firstName + " " + middleName;

        fullName = fullName.replace("ё", "е");

        System.out.println("Ф. И. О. сотрудника - " + fullName);
    }
}