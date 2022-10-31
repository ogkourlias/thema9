package wrapper;
import org.apache.commons.cli.*;

public class cli {
    public static void main(String[] args) throws ParseException {
        init(args);
    }

    public static void init(String[] args) throws ParseException {
        // create Options object
        Options options = new Options();

        // add t option
        options.addOption("t", false, "display current time");

        CommandLineParser parser = new DefaultParser();
        CommandLine cmd = parser.parse(options, args);

        if(cmd.hasOption("t")) {
            System.out.println("time");
        }
        else {
            System.out.println("no");
        }
    }

}
