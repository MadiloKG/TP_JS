package Light;

import java.util.ArrayList;
import java.util.List;

public class LightControlPanel {
    private List<Light> lights;

    public LightControlPanel() {
        this.lights = new ArrayList<>();
    }

    public void addLight(Light light) {
        this.lights.add(light);
    }

    public void removeLight(Light light) {
        this.lights.remove(light);
    }

    public void turnOnAllLights() {
        for (Light light : lights) {
            light.turnOn();
        }
    }

    public void turnOffAllLights() {
        for (Light light : lights) {
            light.turnOff();
        }
    }

    public void adjustBrightnessAllLights(int brightness) {
        for (Light light : lights) {
            light.adjustBrightness(brightness);
        }
    }
}
