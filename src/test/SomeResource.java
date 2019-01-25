package test;

import java.io.IOException;

public class SomeResource implements java.io.Closeable {
    public void close() throws IOException {
        throw new IOException("Close Exception");
    }
}
