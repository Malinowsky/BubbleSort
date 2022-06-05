package main.functions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class BubbleSort {
    public ArrayList<Double> sort(ArrayList<Double> input){
        if (input != null) {

            sortedAscending(input);

        }else if(input.contains(input)){

            while (input.remove(null));

            sortedAscending(input);
        }else{

            throw new RuntimeException("RuntimeException");

        }
        return input;
    }

    private void sortedAscending(ArrayList<Double> input) {
        for (int i = 0; i < input.size() - 1; ++i) {

            for (int j = 0; j < input.size() - i - 1; ++j) {

                if (input.get(j) > input.get(j + 1)) {

                    double temp = input.get(j);
                    input.set(j, input.get(j + 1));
                    input.set(j + 1, temp);
                }
            }
        }
    }
}
