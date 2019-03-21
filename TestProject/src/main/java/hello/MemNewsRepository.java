package hello;

import java.io.IOException;
import java.util.List;

import static java.util.Arrays.asList;

public class MemNewsRepository implements NewsRepository {
    @Override
    public List<NewsView> readNews() throws IOException {
        return asList(new NewsView(new News("title1", "text1")),
                new NewsView(new News("title1", "text1")),
                new NewsView(new News("title1", "text1")));
    }
}