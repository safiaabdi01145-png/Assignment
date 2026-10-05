package Assignments;

public class BMI {


        private String name;
        private int age;
        private double weight;
        private double height;

        public BMI(String name, int age, double weight, double height) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.height = height;
        }

        public BMI(String name, double weight, double height) {
            this(name, 20, weight, height);
        }

        public double getBMI() {
            double bmi = (weight * 703) / (height * height);
            return bmi;
        }

        public String getStatus() {
            double bmi = getBMI();
            if (bmi < 18.5) {
                return "Underweight";
            } else if (bmi < 25.0) {
                return "Normal";
            } else if (bmi < 30.0) {
                return "Overweight";
            } else {
                return "Obese";
            }
        }


        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public double getWeight() {
            return weight;
        }

        public double getHeight() {
            return height;
        }
    }

 class TestBMI {
    public static void main(String[] args) {

        BMI bmi1 = new BMI("Amina", 25, 145, 65);
        System.out.println("Magaca: " + bmi1.getName());
        System.out.println("BMI: " + String.format("%.2f", bmi1.getBMI()));
        System.out.println("Status: " + bmi1.getStatus());

        System.out.println("===============");

        BMI bmi2 = new BMI("Hassan", 215, 70);
        System.out.println("Name Is: " + bmi2.getName());
        System.out.println("Age IS (Default): " + bmi2.getAge());
        System.out.println("BMI: " + String.format("%.2f", bmi2.getBMI()));
        System.out.println("Status: " + bmi2.getStatus());
    }
}
