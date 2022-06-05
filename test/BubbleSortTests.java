import main.functions.BubbleSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import static org.junit.Assert.assertEquals;

public class BubbleSortTests {


    @Test
    public void allIntegers(){

        ArrayList<Double> input = new ArrayList<>(
                Arrays.asList(1.0,4.0,5.0,6.0,8.0,3.0,8.0)
        );

        BubbleSort instance = new BubbleSort();

        ArrayList<Double> expResult = new ArrayList<>(
                Arrays.asList(1.0,3.0,4.0,5.0,6.0,8.0,8.0)
        );
        ArrayList<Double> result = instance.sort(input);
        assertEquals(result,expResult);
        System.out.println("1.input = [1,4,5,6,8,3,8] result = [1,3,4,5,6,8,8]");
    }
    @Test
    public void notAllIntegers(){
        ArrayList<Double> input = new ArrayList<>(
                Arrays.asList(-9.3,0.2,4.0,0.1,5.0,9.0)
        );

        BubbleSort instance = new BubbleSort();

        ArrayList<Double> expResult = new ArrayList<>(
                Arrays.asList(-9.3,0.1,0.2,4.0,5.0,9.0)
        );
        ArrayList<Double> result = instance.sort(input);
        assertEquals(result,expResult);
        System.out.println("2.input = [-9.3,0.2,4,0.1,5,9] result = [-9.3,0.1,0.2,4,5,9]");
    }
    @Test
    public void emptyArray(){
        ArrayList<Double> input = new ArrayList<>(
                Arrays.asList()
        );


        BubbleSort instance = new BubbleSort();

        ArrayList<Double> expResult = new ArrayList<>(
                Arrays.asList()
        );
        ArrayList<Double> result = instance.sort(input);
        assertEquals(result,expResult);
        System.out.println("3.input = [] result = []");
    }



    @Test
    public void integersWithNull(){
        ArrayList<Double> input = new ArrayList<>(
                Arrays.asList(null,5.0001)
        );
        while (input.remove(null));


        BubbleSort instance = new BubbleSort();

        ArrayList<Double> expResult = new ArrayList<>(
                Arrays.asList(5.0001)
        );

        ArrayList<Double> result = instance.sort(input);

        assertEquals(result,expResult);
        System.out.println("4.input = [null,5.0001] result = [5.0001]");
    }
    @Test
    public void onlyNull (){
        try {
            ArrayList<Double> input = new ArrayList<>(
                    Arrays.asList(null)
            );

            RuntimeException expResult = null;

            assertEquals(input, expResult);
        }catch (RuntimeException e){
            System.out.println("5.input = null   result = "+e.getMessage());
        }
    }
}