package DeclarationAccessControl;

public enum City {

    SEOUL("Seoul"),
    BUSAN("Busan"),
    ILSAN("Ilsan");

    public final String cityName;

    City(String cityName){ this.cityName = cityName;}

    public String getCityName() {
        return cityName;
    }
}
