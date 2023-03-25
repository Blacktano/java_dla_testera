package computer;

public interface Music {

    String NAME = "MUSIC";

    void playMusic();
    void pauseMusic();
    void stopMusic();

    default void sayHello() {
        System.out.println("Hello from default");
    }


    static String getName(){
        return NAME;
    }

    private  static void privateMethod() {
        System.out.println("Say hello from private method");
    }





}
