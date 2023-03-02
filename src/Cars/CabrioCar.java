package Cars;

public class CabrioCar extends Car {
    private boolean sunroof = true;
    private boolean isSunroofEnabled;

    public CabrioCar() {
        this("NO_COLOR", 0, 200);
    }
    public CabrioCar(String color) {
        super(color);
    }
    public CabrioCar(String color, int hp) {
        super(color, hp);
    }

    public CabrioCar(String color, int speed, int hp) {
        super(color, speed, hp);
    }

    public boolean getSunroof() {
        return sunroof;
    }

    public void setSunroof(boolean sunroof) {
        this.sunroof = sunroof;
    }

    public boolean getSunroofEnabled() {
        return isSunroofEnabled;
    }

    public void setSunroofEnabled(boolean sunroofEnabled) {
        isSunroofEnabled = sunroofEnabled;
    }

    public void openRoof() {
        this.setSunroofEnabled(!getSunroofEnabled());
    }

    @Override
    public String toString() {
        return "\nCabrio car: " +
                super.toString() +
                "\nHas a sunroof? -> " + (sunroof ? "yes" : "no") +
                "\nIs sunroof enabled? -> " + (isSunroofEnabled ? "yes" : "no");
    }
}
