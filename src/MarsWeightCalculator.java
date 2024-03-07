public class MarsWeightCalculator {
    float earthWeightRuwizhi;
    final float marsGravityRuwizhi = 0.38f;
    float marsWeightRuwizhi;
    double marsWeightDoubleRuwizhi;
    int marsWeightIntRuwizhi;
    char marsWeightCharRuwizhi;
    int mathOperationResultRuwizhi;

    public MarsWeightCalculator(float earthWeight) {
        earthWeightRuwizhi = earthWeight;
    }

    public void calculateWeightOnMars() {

        marsWeightRuwizhi = earthWeightRuwizhi * marsGravityRuwizhi;

        marsWeightDoubleRuwizhi = marsWeightRuwizhi;
        System.out.printf("Weight on Mars (double): %.4f%n", marsWeightDoubleRuwizhi);


        marsWeightIntRuwizhi = (int) marsWeightDoubleRuwizhi;
        System.out.println("Weight on Mars (int): " + marsWeightIntRuwizhi);


        marsWeightCharRuwizhi = (char) marsWeightIntRuwizhi;
        System.out.println("Weight on Mars represented as char: " + marsWeightCharRuwizhi);


        mathOperationResultRuwizhi = marsWeightCharRuwizhi + 1;
        System.out.println("Result of math operation on char type: " + mathOperationResultRuwizhi);
    }

    public static void main(String[] args) {
        MarsWeightCalculator calculator = new MarsWeightCalculator(70.0f);
        calculator.calculateWeightOnMars();
    }
}
