public class CodingExercise2 {

    public static void main(String[] args) {
        System.out.println();
        System.out.println(calcPathVelocity(.8,3.0));
        System.out.println(calcCentripetalAccel(1.676,.8));
        System.out.println(calcCentripetalForce(.2, 3.5));
        System.out.println();
        //This uses each individual method

        System.out.println(calcCentripetalForce(.2,
                calcCentripetalAccel((calcPathVelocity(.8,3.0)), .8)));
        System.out.println();
        //I DID THIS: This activates all 3 methods using a single print!

        System.out.println(calcCentripetalForce(.2,.8,3.0));
        //This uses the combined method
    }

    private static  double calcPathVelocity(double radius, double period) {
        double circumfrence = 2 * Math.PI * radius;
        return circumfrence / period;
    }

    private static double calcCentripetalAccel(double pathVel, double radius) {
        return Math.pow(pathVel, 2) / radius;
    }

    public static double calcCentripetalForce(double mass, double acc) {
        return mass * acc;
    }

    //overload
    public static double calcCentripetalForce(double mass, double radius, double period) {
        double pathVelocity = calcPathVelocity(radius, period);
        double centripetalAccel = calcCentripetalAccel(pathVelocity, radius);
        return calcCentripetalForce(mass, centripetalAccel);
    }

}
