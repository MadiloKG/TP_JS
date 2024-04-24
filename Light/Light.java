package Light;

public class Light {
    private boolean On;
    private int brightness;

    public Light() {
        this.On = false;
        this.brightness = 0;
    }

    public void turnOn() {
        this.On = true;
        System.out.println("Light is on");
    }

    public void turnOff() {
        this.On = false;
        System.out.println("Light is off");
    }

    public void adjustBrightness(int brightness) {
        this.brightness = brightness;
        System.out.println("Brightness adjusted to " + brightness);
    }

    public int getBrightness() {
        return brightness;
    }

}
