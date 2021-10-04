package com.opstty.mapper;
import org.apache.hadoop.io.FloatWritable;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import java.io.IOException;

public class SortTreeMapper extends Mapper<Object, Text, FloatWritable, Text> {

    public void map(Object key, Text value, Mapper.Context context) throws IOException, InterruptedException {
        if (!value.toString().contains("OBJECTID")){
            try{
                FloatWritable hauteur = new FloatWritable(Float.parseFloat(value.toString().split(";")[6]));
                Text objectid1 = new Text(value.toString().split(";")[11]);
                context.write(hauteur,objectid1);
            }
            catch(NumberFormatException e){

            }
        }
    }
}
