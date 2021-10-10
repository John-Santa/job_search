package com.johncode.functional.jobsearch;

import com.beust.jcommander.JCommander;
import com.johncode.functional.jobsearch.cli.CLIArguments;

import static com.johncode.functional.jobsearch.CommanderFunctions.buildCommanderWithName;

public class JobSearch {
    public static void main(String[] args) {
        JCommander jCommander = buildCommanderWithName("job-search", CLIArguments::newInstance);
    }
}
