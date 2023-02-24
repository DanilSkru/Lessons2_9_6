package Transport.WheeledTransport;
import Transport.Transport;

public class WheeledTransport extends Transport {
    public WheeledTransport() {

    }
    public WheeledTransport(String transportname) {
        switch(transportname) {
            case "Автобус":
                Bus bus = new Bus(transportname);
                break;
            case "Троллейбус":
                Bus trolleybus = new Bus(transportname);
                break;
            case "Танк":
                Tank tank = new Tank(transportname);
                break;
            case "Паровоз":
                Locomotive locomotive = new Locomotive(transportname);
                break;
        }
    }
    @Override
    public void info() {
        System.out.println("Инициализирован класс колесный транспорт.");
    }
}
interface PublicTransport {
    void description();
}
interface MilitaryTransport {
    void description();
}
interface SteamTransport {
    void description();
}
class Bus extends WheeledTransport implements PublicTransport {
    String transportname;
    public Bus(String transportname) {
        this.transportname = transportname;
        description();
    }
    @Override
    public void description() {
        System.out.println(transportname + " - это общественный транспорт.");
    }
}
class Tank extends WheeledTransport implements MilitaryTransport {
    String transportname;
    public Tank(String transportname) {
        this.transportname = transportname;
        description();
    }
    @Override
    public void description() {
        System.out.println(transportname + " - это военная техника (броня).");
    }
}
class Locomotive extends WheeledTransport implements SteamTransport {
    String transportname;
    public Locomotive(String transportname) {
        this.transportname = transportname;
        description();
    }
    @Override
    public void description() {
        System.out.println(transportname + " - это военная паровая техника (поезд).");
    }
}