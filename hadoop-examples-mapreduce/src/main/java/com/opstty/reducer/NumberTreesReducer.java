package com.opstty.reducer;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;

public class NumberTreesReducer extends Reducer<Text, IntWritable, Text, IntWritable>  {
    private IntWritable result1 = new IntWritable();

    public void reduce(Text key, Iterable<IntWritable> values, Context context)
            throws IOException, InterruptedException {
        int sum = 0;
        for (IntWritable val1 : values) {
            sum += val1.get();
        }
        result1.set(sum);
        context.write(key, result1);
    }
}
