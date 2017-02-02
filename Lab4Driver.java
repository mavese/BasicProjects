/**
 * Created by Matthew Mantese on 1/31/17.
 */

import java.util.Scanner;
import java.io.*;
import java.util.Vector;

public class Lab4Driver {

    private Vector<Double> vDoubles = new Vector<Double>();

    public static void main(String[] args) {
        Lab4Driver driver = new Lab4Driver();
        driver.readFile();
    }

    public void readFile(){
        Scanner in = new Scanner(System.in);
        String fileName;
        File fileToRead = new File("");
        boolean notValidFile = true;
        boolean notDone = true;

        while (notDone) {

            while (notValidFile) {
                System.out.print("Please enter file name without extension: ");
                fileName = in.nextLine() + ".dat";
                fileToRead = new File(fileName);
                if (fileToRead.exists() && !fileToRead.isDirectory()) {
                    notValidFile = false;
                }
                else {
                    System.out.print("\nThis is not a valid file.\n");
                }
            }

            try {
                Scanner fileReader = new Scanner(fileToRead);
                while (fileReader.hasNextDouble()){
                    vDoubles.add(vDoubles.size(), fileReader.nextDouble());
                }
                System.out.printf("\nThe number of doubles in the file was: %d%n", vDoubles.size());
                System.out.print("The file contained: ");
                for (Double item : vDoubles) {
                    System.out.printf("%.2f, ",item);
                }
                MinMaxObject extremes = new MinMaxObject();
                extremes = findXtremes(vDoubles, 0, vDoubles.size() - 1, extremes);
                System.out.printf("%n%nThe maximum is: %.2f%nAt index of: %d" +
                        "%nThe minimum is: %.2f%nAt index: %d",
                        extremes.getMax(), extremes.getMaxPos(), extremes.getMin(), extremes.getMinPos());
                fileReader.close();
                in.close();
                notDone = false;
            }
            catch (IOException e){
                System.out.print("\nThere was an error reading the file try again." + e.getMessage());
            }
            catch (Exception e){
                System.out.print("\nThere was an error try again." + e.getMessage());
            }
        }
    }
    public MinMaxObject findXtremes(Vector<Double> vector, int start, int end, MinMaxObject xtremes){
        double locMax, locMin;
        if (end - start > 0){
            if (vector.get(start) > vector.get(end)){
                locMax = vector.get(start);
                locMin = vector.get(end);
                if (locMax > xtremes.getMax()){
                    xtremes.setMax(locMax, start);
                }
                if (locMin < xtremes.getMin()){
                    xtremes.setMin(locMin, end);
                }
            }
            else {
                locMax = vector.get(end);
                locMin = vector.get(start);
                if (locMax > xtremes.getMax()){
                    xtremes.setMax(locMax, end);
                }
                if (locMin < xtremes.getMin()){
                    xtremes.setMin(locMin, start);
                }
            }
            findXtremes(vector, start + 1, end - 1, xtremes);
        }
        return xtremes;
    }
}
