package wrapper;
import org.apache.commons.cli.*;

public class cli {
    public static String init(String[] args) throws ParseException {
        // create Options object
        Options options = new Options();

        // add f option
        options.addOption("f", true, "Indicate file path");
        options.addOption("o", true, "Indicate output path");

        CommandLineParser parser = new DefaultParser();
        CommandLine cmd = parser.parse(options, args);

        if(cmd.hasOption("f")) {
            return cmd.getOptionValue("f");
        }
        else {
            System.out.println("Please provide -f {file_path}");
        }
        return null;
    }
}
