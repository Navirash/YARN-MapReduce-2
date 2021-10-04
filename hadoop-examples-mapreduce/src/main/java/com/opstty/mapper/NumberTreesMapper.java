package com.opstty.mapper;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class NumberTreesMapper extends Mapper<LongWritable, Text, Text, IntWritable> {
    private final static IntWritable intW = new IntWritable(1);
    public void map(LongWritable key, Text value, Mapper.Context context) throws IOException, InterruptedException {
        if (!value.toString().contains("ESPECE")) {
            Text txt = new Text(value.toString().split(";")[3]);
            context.write(txt, intW);
        }
    }
}
