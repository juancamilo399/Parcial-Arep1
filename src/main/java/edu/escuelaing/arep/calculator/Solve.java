package edu.escuelaing.arep.calculator;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Clase que implementa la logica del servidor
 */
public class Solve {

    /**
     *
     * @param data los datos a ser procesados
     * @return un json en formato string
     */
    public static String calculate(String data){
        List<Double> nums = new ArrayList<Double>();
        List<String> doubles = Arrays.asList(data.split(","));
        Double sum=0.0;
        for (String str : doubles) {
            Double newNum = Double.parseDouble(str);
            nums.add(newNum);
            sum+=newNum;
        }
        Double avg=sum/doubles.size();

        BubbleSort<Double> bubblesorter = new BubbleSort<>();
        Double[] doubles1= nums.toArray(new Double[0]);
        List<Double> result= bubblesorter.bubbleSort(doubles1);

        String json ="{\"List\":"+result.toString()+",\"avg\":"+avg+",\"sum\":"+sum+"}";

        return json;

    }
}
