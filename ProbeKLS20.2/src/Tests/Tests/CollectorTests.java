package Tests;

import Collector.Collector;
import Sensor.Sensor;
import org.junit.Test;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CollectorTests {

    @Test
    public void test1() throws IOException {
        long timeStamp = System.currentTimeMillis();
        float value = 2.3f;
        String name = "testSensor";

        Collector data = new CollectorImpl();
        FileOutputStream fos = new FileOutputStream("test.txt");
        DataOutputStream dos = new DataOutputStream(fos);

        dos.writeLong(data.getTimeStamp());
        dos.writeFloat(data.getValue());
        dos.writeUTF(data.getSensorName());

    }
}
