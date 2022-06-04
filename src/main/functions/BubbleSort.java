package main.functions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class BubbleSort {
    public static ArrayList<Double> sort(ArrayList<Double> array, int length){
        for(int i = 0; i<length-1; ++i){

            for(int j = 0; j<length-i-1; ++j){

                if(array.get(j) > array.get(j + 1)){
                    double temp = array.get(j);
                    array.set(j, array.get(j + 1));
                    array.set(j + 1, temp);
                }
            }
        }
        return array;
    }

    private static void showAll(ArrayList<Double> array, int length){
        for (int i = 0; i < length; ++i) {
            System.out.print(array.get(i) + " ");
        }
    }

    private static ArrayList<Double> run(List<Double> input){
        try {
           input = new ArrayList<>(
                    Arrays.asList(null)
            );

            int length = input.size();

            sort((ArrayList<Double>) input, length);
            showAll((ArrayList<Double>) input,length);


        } catch (NullPointerException e) {
            while (input.remove(null));
            System.out.print(input);
        } catch (RuntimeException e){
            e.getMessage();
        }
        return (ArrayList<Double>) input;
    }

    public static void main( String args[] ) {
        List<Double> input = null;
        run(input);
    }
}
