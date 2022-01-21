public class BMI {
    private double height;
    private double weight;

    public BMI(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    public double calculateBMI() {
        double BMICalculated = weight / (height * height) *10000;

        return BMICalculated;
    }

    public boolean isUnderWeight(double calculatedBMI) {
        double underWeight = 18.5;
        if (calculatedBMI < underWeight) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isOverWeight(double calculatedBMI) {
        double overWeight = 25;
        if (calculatedBMI > overWeight) {
            return true;
        } else {
            return false;
        }
    }


    public boolean isNormalWeight(double calculatedBMI) {
        double underWeight = 18.5;
        double overWeight = 25;

        if (calculatedBMI > underWeight && calculatedBMI < overWeight) {
            return true;
        } else {
            return false;
        }
    }

}
