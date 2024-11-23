package software.ulpgc;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        TitleReader reader = new TsvTitleReader(new File("./title.basics.tsv"), true);
        generateHistograms(reader);

    }

    private static void generateHistograms(TitleReader reader) throws IOException {
        List<Title> titles = reader.read();
        Map<Title.TitleType, Integer> histogram = new HistogramGenerator().generate(titles);
    }

}
