package wrapper;
import org.apache.commons.cli.*;

public class Main {
    public static void main(String[] args) throws ParseException {
        String file = cli.init(args);
        System.out.println(file);
    }
}