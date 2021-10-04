package com.opstty.job;
import com.opstty.mapper.SortTreeMapper;
import com.opstty.mapper.TokenizerMapper;
import com.opstty.reducer.IntSumReducer;
import com.opstty.reducer.SortTreeReducer;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.FloatWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.util.GenericOptionsParser;

public class SortTree {
    public static void main(String[] args) throws Exception {
        Configuration conf = new Configuration();
        String[] otherArgs = new GenericOptionsParser(conf, args).getRemainingArgs();
        if (otherArgs.length < 2) {
            System.err.println("Usage: sortTree <in> [<in>...] <out>");
            System.exit(2);
        }
        Job job = Job.getInstance(conf, "SortTree");
        job.setJarByClass(SortTree.class);
        job.setMapperClass(SortTreeMapper.class);
        // job.setCombinerClass(SortTreeReducer.class);
        job.setReducerClass(SortTreeReducer.class);

        job.setMapOutputKeyClass(FloatWritable.class);
        job.setMapOutputValueClass(Text.class);

        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(FloatWritable.class);

        for (int i = 0; i < otherArgs.length - 1; ++i) {
            FileInputFormat.addInputPath(job, new Path(otherArgs[i]));
        }
        FileOutputFormat.setOutputPath(job,
                new Path(otherArgs[otherArgs.length - 1]));
        System.exit(job.waitForCompletion(true) ? 0 : 1);
    }
}
