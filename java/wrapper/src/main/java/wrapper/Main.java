package wrapper;

// Java Imports.
import org.apache.commons.cli.*;

public class Main {
    /**
     * Main class to instantiate others.
     */
    public static void main(String[] args) throws Exception {
        CommandLine mainCli = cli.init(args);
        String file = mainCli.getOptionValue("f");
        String outFile = mainCli.getOptionValue("o");
        weka.runWeka(file, outFile);
    }
}