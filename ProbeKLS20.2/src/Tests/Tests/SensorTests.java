package Tests;

import Sensor.Sensor;
import Sensor.SensorImpl;
import org.junit.Test;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class SensorTests {

    @Test
    public void goodSend() throws IOException {
        long timeStamp = System.currentTimeMillis();
        float value = 2.3f;
        String name = "testSensor";

        Sensor data = new SensorImpl(timeStamp, value, name);
        FileOutputStream fos = new FileOutputStream("test.txt");
        DataOutputStream dos = new DataOutputStream(fos);

        dos.writeLong(data.getTimeStamp());
        dos.writeFloat(data.getValue());
        dos.writeUTF(data.getSensorName());

    }

    @Test
    public void createConnection(){



    }


}
