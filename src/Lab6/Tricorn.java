package Lab6;

import java.awt.geom.Rectangle2D;

public class Tricorn extends FractalGenerator {

    public String toString()
    {
        return "Tricorn";
    }

    /**
     * Константа с максимальным количеством итераций
     **/
    public static final int MAX_ITERATIONS = 2000;

    /**
     * Метод для определения наиболее «интересной» области комплексной плоскости для конкретного фрактала
     **/
    public void getInitialRange(Rectangle2D.Double range) {
        range.x = -2;
        range.y = -2;
        range.height = 4;
        range.width = 4;
    }

    /**
     * Реализация итеративной функции для фрактала Tricorn
     **/
    public int numIterations(double x, double y) {
        double re = x;
        double im = y;
        int iter = 0;
        while ((iter < MAX_ITERATIONS)) {
            iter++;
            double re2 = x * x - y * y + re;
            double im2 = -2 * x * y + im;
            x = re2;
            y = im2;
            if ((x * x + y * y) > 4)
                break;
        }
        if (iter == MAX_ITERATIONS)
            return -1;
        return iter;
    }
}
