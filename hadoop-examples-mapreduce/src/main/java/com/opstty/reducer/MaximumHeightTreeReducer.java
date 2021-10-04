package com.opstty.reducer;
import org.apache.hadoop.io.FloatWritable;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;

public class MaximumHeightTreeReducer  extends Reducer<Text, FloatWritable, Text, FloatWritable> {
    private FloatWritable result3 = new FloatWritable();

    public void reduce(Text key, Iterable<FloatWritable> values, Context context)
            throws IOException, InterruptedException {
        float maximum = 0;
        for (FloatWritable val : values) {
            if(val.get() > maximum) {
                maximum = val.get();
            }
        }
        result3.set(maximum);
        context.write(key, result3);
    }
}

