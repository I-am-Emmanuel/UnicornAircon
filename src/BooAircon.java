public class BooAircon {
    private boolean power;
    private int temperature;

    public BooAircon(boolean power) {
        temperature = 16;
        this.power = power;

    }

          public boolean turnOn() {
        if (power) {
            return true;
        } else {
            return false;
        }
    }

    public int increasetemperature() {
        if (temperature < 30) {
            return temperature = temperature + 1;
        } else {
            return 30;
        }
    }
        public int getTemperature() {
            return temperature;
        }

        public int decreasetemp() {
            if (temperature <= 16) {
                return 16;
            } else {
                return temperature = temperature - 1;
            }
        }
    public boolean getOn() {
        return power;
    }
}



