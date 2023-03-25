package computer;

public class PC extends Computer {

    private boolean isPowerSupply;

    public PC(String name, String type, Hdd hdd, Ram ram) {
        super(name, type, hdd, ram);
        isPowerSupply = false;
    }

    public void setPowerSupply(boolean powerSupply) {
        isPowerSupply = powerSupply;
    }

    public void showComputerName() {

        System.out.println(name);
    }



    @Override
    public void switchOn() {
        System.out.println("Sprawdzam zasilanie");

        if (isPowerSupply) {
            super.switchOn();
        } else {
            System.out.println("nie ma zasilania");
        }

    }

    public void switchOff() {
        System.out.println("Wyłącz komputer: " + name);
        state = false;
    }

    @Override
    public int volumeUp() {
        return 0;
    }

    @Override
    public int volumeDown() {
        return 0;
    }

    @Override
    public int volumeUp(int newVolumeLevel) {
        return 0;
    }

    @Override
    public int volumeDown(int newVolumeLevel) {
        return 0;
    }

}
