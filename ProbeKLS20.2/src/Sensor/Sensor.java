package Sensor;

import Code.Datenspeicher;

import java.util.List;

public interface Sensor extends Datenspeicher {
    List<Sensordata> getData();

    long getTimeStamp();

    float getValue();

    String getSensorName();
}
