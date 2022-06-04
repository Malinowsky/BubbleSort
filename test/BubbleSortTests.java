import main.functions.BubbleSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;


import static org.junit.Assert.assertEquals;

public class BubbleSortTests {

    @Test
    public void allIntegers(){

        ArrayList<Double> input = new ArrayList<>(
                Arrays.asList(1.0,4.0,5.0,6.0,8.0,3.0,8.0)
        );
        int size = input.size();

        BubbleSort instance = new BubbleSort();

        ArrayList<Double> expResult = new ArrayList<>(
                Arrays.asList(1.0,3.0,4.0,5.0,6.0,8.0,8.0)
        );
        ArrayList<Double> result = instance.sort(input,size);
        assertEquals(result,expResult);
        System.out.println("Test is successful");
    }
    @Test
    public void notAllIntegers(){
        ArrayList<Double> input = new ArrayList<>(
                Arrays.asList(-9.3,0.2,4.0,0.1,5.0,9.0)
        );
        int size = input.size();

        BubbleSort instance = new BubbleSort();

        ArrayList<Double> expResult = new ArrayList<>(
                Arrays.asList(-9.3,0.1,0.2,4.0,5.0,9.0)
        );
        ArrayList<Double> result = instance.sort(input,size);
        assertEquals(result,expResult);
        System.out.println("Test is successful");
    }
    @Test
    public void emptyArray(){
        ArrayList<Double> input = new ArrayList<>(
                Arrays.asList()
        );
        int size = input.size();

        BubbleSort instance = new BubbleSort();

        ArrayList<Double> expResult = new ArrayList<>(
                Arrays.asList()
        );
        ArrayList<Double> result = instance.sort(input,size);
        assertEquals(result,expResult);
        System.out.println("Test is successful");
    }



    @Test
    public void integersWithNull(){
        ArrayList<Double> input = new ArrayList<>(
                Arrays.asList(null,5.0001)
        );
        while (input.remove(null));
        int size = input.size();

        BubbleSort instance = new BubbleSort();

        ArrayList<Double> expResult = new ArrayList<>(
                Arrays.asList(5.0001)
        );

        ArrayList<Double> result = instance.sort(input,size);

        assertEquals(result,expResult);
        System.out.println("Test is successful");
    }
    @Test
    public void onlyNull (){
        try {
            ArrayList<Double> input = new ArrayList<>(
                    Arrays.asList(null)
            );
            int size = input.size();
        }catch (RuntimeException e){
            RuntimeException expResult = null;
            assertEquals(e,expResult);
        }

        System.out.println("Test is successful");
    }
}