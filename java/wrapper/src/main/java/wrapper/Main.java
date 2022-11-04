package wrapper;
import org.apache.commons.cli.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String file = cli.init(args);
        weka.runWeka(file);
    }
}