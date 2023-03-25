package computer;

public class Laptop extends Computer implements Music, Video {

    private int batteryLevel;

    public Laptop(String name, String type, Hdd hdd, Ram ram, int batteryLevel) {
        super(name, type, hdd, ram);
        this.batteryLevel = batteryLevel;
    }


    public int volumeUp() {
        return volumeLevel += 5;
    }

    @Override
    public int volumeDown() {
        volumeLevel -= 1;
        if (volumeLevel <= 0) {
            return 0;
        } else {
            return volumeLevel;
        }
    }

    @Override
    public int volumeUp(int newVolumeLevel) {
        return 0;
    }

    @Override
    public int volumeDown(int newVolumeLevel) {
        return 0;
    }


    public void switchOn() {
        System.out.println("Sprawdzam poziom baterii");
        if (batteryLevel > 0) {
            super.switchOn();
        } else {
            System.out.println("Zbyt niski poziom baterii");
        }
    }

    public void setBatteryLevel(int newBatteryLevel) {
        batteryLevel = newBatteryLevel;


    }

    public void switchOff() {
        System.out.println("Wyłącz laptop: " + name);
        state = false;
    }

    @Override
    public void playMusic() {
        System.out.println("Play music");
    }

    @Override
    public void pauseMusic() {
        System.out.println("Pause music");

    }

    @Override
    public void stopMusic() {
        System.out.println("Stop music");
    }

    @Override
    public void sayHello() {
        Music.super.sayHello();
    }

    @Override
    public void playVideo() {
        System.out.println("Play music");
    }

    @Override
    public void pauseVideo() {
        System.out.println("Play music");

    }

    @Override
    public void stopVideo() {
        System.out.println("Play music");

    }
}
