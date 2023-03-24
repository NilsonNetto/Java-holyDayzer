import java.util.ArrayList;
import java.util.Arrays;

public class Holidays {
  private ArrayList<Holiday> dates = new ArrayList<>(Arrays.asList(
      new Holiday("01/01/2023", "Confraternização Mundial"),
      new Holiday("21/02/2023", "Carnaval"),
      new Holiday("17/04/2023", "Páscoa"),
      new Holiday("21/04/2023", "Tiradentes"),
      new Holiday("01/05/2023", "Dia do trabalho"),
      new Holiday("08/06/2023", "Corpus Christi"),
      new Holiday("07/09/2023", "Independência do Brasil"),
      new Holiday("12/10/2023", "Nossa Senhora Aparecida"),
      new Holiday("02/11/2023", "Finados"),
      new Holiday("15/11/2023", "Proclamação da República"),
      new Holiday("25/12/2023", "Natal")));

  public void getAllHolidays() {
    int length = this.dates.size();

    for (int i = 0; i < length; i++) {
      Holiday date = this.dates.get(i);
      System.out.println(date.getDate() + " - " + date.getDescription());
    }
  }
}