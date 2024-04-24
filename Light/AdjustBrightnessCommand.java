package Design Pattern Command;

public class AdjustBrightnessCommand implements Command {
    private Light light;
    private int newBrightness;
    private int previousBrightness;

    public AdjustBrightnessCommand(Light light, int newBrightness) {
        this.light = light;
        this.newBrightness = newBrightness;
    }

    @Override
    public void execute() {
        // Sauvegarde l'intensité lumineuse actuelle avant de la modifier
        previousBrightness = light.getBrightness();
        // Régle la nouvelle intensité lumineuse de la lampe
        light.adjustBrightness(newBrightness);
    }

    @Override
    public void undo() {
        // Restaure l'intensité lumineuse précédente
        light.adjustBrightness(previousBrightness);
    }
}
