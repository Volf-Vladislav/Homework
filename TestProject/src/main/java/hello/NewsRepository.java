package hello;

import java.io.IOException;
import java.util.List;

public interface NewsRepository {

    List<NewsView> readNews() throws IOException;
}