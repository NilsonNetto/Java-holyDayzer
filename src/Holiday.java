public class Holiday implements IHoliday {
  private String date;
  private String description;

  Holiday(String date, String description) {
    this.date = date;
    this.description = description;
  }

  public String getDate() {
    return date;
  }

  public String getDescription() {
    return description;
  }
}
