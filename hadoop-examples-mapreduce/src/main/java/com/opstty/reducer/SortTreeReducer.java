package com.opstty.reducer;
import org.apache.hadoop.io.FloatWritable;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.io.Text;
import java.io.IOException;
import java.lang.*;

public class SortTreeReducer extends Reducer<FloatWritable, Text, Text, FloatWritable> {
    public void reduce(FloatWritable key1, Iterable<Text> values, Context context) throws IOException, InterruptedException {
        for (Text val : values) {
            context.write(val,key1);
        }
    }
}
