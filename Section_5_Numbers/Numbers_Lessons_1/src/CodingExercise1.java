public class CodingExercise1 {

    public static void main(String[] args) {
        System.out.println(calcArea(3));
    }

    /**
     * This method calculates the area of a circle
     * PI * R ^ 2
     * @param radius
     * @return
     */
    public static double calcArea(double radius) {
        // A = PI * r^2
        return Math.PI * Math.pow(radius, 2);
    }
}
