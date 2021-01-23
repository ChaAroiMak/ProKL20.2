package Sensor;

import java.util.List;

public class SensorImpl implements Sensor {

    long timeStamp;
    float value;
    String name;

    public SensorImpl(long timeStamp, float value, String name) {
        this.timeStamp = timeStamp;
        this.value = value;
        this.name = name;
    }

    @Override
    public List<Sensordata> getData() {
        return null;
    }

    @Override
    public void saveData(Sensordata data) {

    }



    @Override
    public int avg(String sensorName) {
        return 0;
    }

    @Override
    public int avg() {
        return 0;
    }
}
