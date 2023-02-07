package controller.validator;

public class DataRegex {
  public static final String E_MAIL =
      "^([a-zA-Z0-9_\\-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$";
  public static final String PHONE_NUMBER = "^\\+?3?8?(0\\d{9})$";
  public static final String YEAR = "^[0-9]{3,4}+$";
  public static final String ENG_LANG = "^[a-zA-z '.,-]+$";
  public static final String UKR_LANG = "^[А-Яа-яёЁЇїІіЄєҐґ '.,-]+$";
  public static final String PASSWORD = "^([a-zA-Z0-9@*#]{4,10})$";
  public static final String NAME = "^[A-Za-zА-Яа-яёЁЇїІіЄєҐґ]+$";
  public static final String NUMBER = "[0-9]+";

  private DataRegex() {}
}
