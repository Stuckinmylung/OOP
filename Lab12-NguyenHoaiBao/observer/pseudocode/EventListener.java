package lab12.observer.pseudocode;

import java.io.File;

public interface EventListener {
    void update(String eventType, File file);
}

