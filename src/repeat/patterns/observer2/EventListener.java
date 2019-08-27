package repeat.patterns.observer2;

import java.io.File;

public interface EventListener {
    void update(String eventType, File file);
}
