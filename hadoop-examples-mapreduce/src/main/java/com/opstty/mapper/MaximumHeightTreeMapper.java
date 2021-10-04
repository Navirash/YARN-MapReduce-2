package com.opstty.mapper;
import org.apache.hadoop.io.FloatWritable;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import java.io.IOException;

public class MaximumHeightTreeMapper extends Mapper<Object, Text, Text, FloatWritable> {

    public void map(Object key, Text value, Mapper.Context context) throws IOException, InterruptedException {
        if(!value.toString().contains("ESPECE")){
            try {
                Text espece1 = new Text(value.toString().split(";")[3]);
                FloatWritable hauteur = new FloatWritable(Float.parseFloat(value.toString().split(";")[6]));
                context.write(espece1, hauteur);
            }
            catch (NumberFormatException e){
            }
        }
    }

}
