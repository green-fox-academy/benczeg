import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

// Read all data from 'log.txt'.
// Each line represents a log message from a web server
// Write a function that returns an array with the unique IP adresses.
// Write a function that returns the GET / POST request ratio.
public class Logs {
    public static void main(String[] args) {
        System.out.println(IpAdresses("log.txt"));
        System.out.println("Get/Post ratio: " + GetPostRatio("log.txt"));
    }

    public static List<String> IpAdresses(String path) {
        List<String> logLines = ReadToList(path);
        List<String> ipAdresses = new ArrayList<>();
        for (int i = 0; i < logLines.size(); i++) {
            String[] logs = logLines.get(i).split(" ");
            ipAdresses.add(i, logs[8]);
        }
        return ipAdresses;
    }

    public static double GetPostRatio(String path) {
        List<String> logLines = ReadToList(path);
        int get = 0;
        int post = 0;
        for (int i = 0; i < logLines.size(); i++) {
            String[] logs = logLines.get(i).split(" ");
            if (logs[11].equals("GET")) {
                get++;
            } else {
                post++;
            }
        }
        double ratio = (double) get / post;
        return ratio;
    }

    public static List<String> ReadToList(String path) {
        List<String> lines = new ArrayList<>();
        lines = null;
        try {
            lines = Files.readAllLines(Paths.get(path));
            return lines;
        } catch (Exception e) {
            //Log it
            System.err.println(e);
        }
        return lines;
    }
}
