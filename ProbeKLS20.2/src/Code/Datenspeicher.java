package Code;

import Sensor.Sensordata;

public interface Datenspeicher {
    void saveData(Sensordata data);
    int avg(String sensorName);
    int avg();
}
