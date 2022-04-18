/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package beecrowd.solutions;

import java.util.Locale;

public class BeecrowdSolver {

    private final double PI = 3.14159;


    public String sphere1011(double r) {
        double volume = (PI * r * r * r * 4) / 3;
        return "VOLUME = " + String.format(Locale.CANADA, "%.3f", volume, 3);
    }
}
