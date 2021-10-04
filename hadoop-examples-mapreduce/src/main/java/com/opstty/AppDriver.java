package com.opstty;

import com.opstty.job.*;
import org.apache.hadoop.util.ProgramDriver;

public class AppDriver {
    public static void main(String argv[]) {
        int exitCode = -1;
        ProgramDriver programDriver = new ProgramDriver();

        try {
            programDriver.addClass("wordcount", WordCount.class,
                    "A map/reduce program that counts the words in the input files.");
            programDriver.addClass("DistrictTrees", DistrictTrees.class,
                    "The number of district with trees");
            programDriver.addClass("ExistingSpecies", ExistingSpecies.class,
                    "Displays the list of different species trees in this file.\n");
            programDriver.addClass("NumberTrees", NumberTrees.class,
                    "Calculates the number of trees of each kinds\n");
            programDriver.addClass("MaximumHeightTree", MaximumHeightTree.class,
                    "Maximum Height tree\n");
            programDriver.addClass("SortTree", SortTree.class,
                    "Sort height tree\n");


            exitCode = programDriver.run(argv);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

        System.exit(exitCode);
    }
}
