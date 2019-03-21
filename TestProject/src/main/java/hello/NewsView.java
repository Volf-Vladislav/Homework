package hello;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Optional;
import java.util.stream.Stream;

public class NewsView {

    private String title;
    private String content;

    public NewsView(Object o) {
        Optional<Method> titleMethod = Stream.of(o.getClass().getMethods())
                .filter(method -> method.isAnnotationPresent(Title.class)).findFirst();
        Optional<Method> contentMethod = Stream.of(o.getClass().getMethods())
                .filter(method -> method.isAnnotationPresent(Content.class)).findFirst();

        titleMethod.ifPresent(m -> {
            try {
                title = (String) m.invoke(o);
            } catch (IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
            }
        });

        contentMethod.ifPresent(m -> {
            try {
                content = (String) m.invoke(o);
            } catch (IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
            }
        });
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "NewsView{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}