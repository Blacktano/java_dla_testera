package enums;

public enum WeekDays {

    PONIEDZIAŁEK("Poniedziałek"),
    WTOREK("Wtorek"),
    ŚRODA("Środa"),
    CZWARTEK("Czwartek"),
    PIĄTEK("Piątek"),
    SOBOTA("Sobota"),
    NIEDZIELA("Niedziela");

    private String name;

    WeekDays(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
