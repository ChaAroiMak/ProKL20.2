package Collector;

import java.io.IOException;

public interface Collector {
    void acceptConnection(int portNumber) throws IOException;

}
