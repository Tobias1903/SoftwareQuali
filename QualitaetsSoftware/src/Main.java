import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String args[]) throws IOException {
        String valuesString[] = getValues();
        double inputValues[] = convertToDouble(valuesString);
        ASystem s1 = new ASystem1();
        ASystem s2 = new ASystem2();
        ASystem s3 = new ASystem3();
        double rp1 = s1.getRP();
        double rp2 = s2.getRP();
        double rp3 = s3.getRP();
        double fp1 = s1.getFP();
        double fp2 = s2.getFP();
        double fp3 = s3.getFP();
    }

    public static String[] getValues() throws IOException {
        String fileLocation = "data.csv";
        BufferedReader readCSV = new BufferedReader(new FileReader(fileLocation));
        String[] values = readCSV.readLine().split(",");
        readCSV.close();
        return values;
    }

    public static double[] convertToDouble(String values[]) {
        int i = 0;
        double doubleValues[] = new double[values.length];
        for (String str: values)
        {
            doubleValues[i] = Double.valueOf(str);
            i++;
        }
        return doubleValues;
    }
}
