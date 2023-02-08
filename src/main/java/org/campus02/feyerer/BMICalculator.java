package org.campus02.feyerer;

public class BMICalculator {

    private double heightInMeters;
    private double weightInKG;

    private double calculateBMI(){
        return weightInKG / (heightInMeters*heightInMeters);
    }

    public BMICalculator(double heightInMeters, double weightInKG) {
        this.heightInMeters = heightInMeters;
        this.weightInKG = weightInKG;
    }

    public double getHeightInMeters() {
        return heightInMeters;
    }

    public double getWeightInKG() {
        return weightInKG;
    }
    public String result(){
        double bmi = calculateBMI();
        if(bmi < 18.5){
            return "underweight";
        }
        else if(bmi < 25){
            return "normal";
        }
        else if(bmi < 30){
            return "overweight";
        }
        else{
            return "obese";
        }
    }
}
