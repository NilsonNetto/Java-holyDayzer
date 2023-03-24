import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Holidays holidaysList = new Holidays();
        Scanner input = new Scanner(System.in);
        System.out.println("Insira a data desejada (dd/mm/2023) ou 'todos' para listar todos:");
        final String searchDate = input.nextLine();

        if (searchDate.equals("todos")) {
            holidaysList.getAllHolidays();
        } else {
            System.out.println(searchDate);
        }
    }
}
