package test2Avito.data;

import java.text.DecimalFormat;
import java.util.Random;

public class DataGenerator {

    private DataGenerator(){

    }

    public static Integer randValues(){
        Random rand = new Random();
        int x  =  1 +  rand.nextInt(999 - 1 + 1);
        return x;
    }

    public static String randValuesDouble(){
        Random rand = new Random();
        double dx  = 1 +  rand.nextDouble()*(999 - 1);

        DecimalFormat decimalFormat = new DecimalFormat( "#.###" );
        String result = decimalFormat.format(dx);

        return result;
    }
}
