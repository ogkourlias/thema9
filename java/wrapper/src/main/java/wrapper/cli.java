package wrapper;

// Java Imports.
import org.apache.commons.cli.*;

public class cli {
    /**
     * Apache commons CLI handler.
     */
    public static CommandLine init(String[] args) throws ParseException {
        // create Options object
        Options options = new Options();

        // add f option for input file path
        options.addOption("f", true, "Indicate file path");
        // add o option for output file path
        options.addOption("o", true, "Indicate output path");

        CommandLineParser parser = new DefaultParser();
        CommandLine cmd = parser.parse(options, args);

        return cmd;
    }
}
