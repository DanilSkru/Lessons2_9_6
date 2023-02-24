package Transport.WaterTransport;
import Transport.Transport;

public class WaterTransport  extends Transport {
    public WaterTransport() {

    }
    public WaterTransport(String transportname) {
        switch(transportname) {
            case "Пароход":
                Steamship steamship = new Steamship(transportname);
                break;
        }
    }
    @Override
    public void info() {
        System.out.println("Инициализирован класс водный транспорт.");
    }
}
interface SteamTransport {
    void description();
}
class Steamship extends WaterTransport implements SteamTransport {
    String transportname;
    public Steamship(String transportname) {
        this.transportname = transportname;
        description();
    }
    @Override
    public void description() {
        System.out.println(transportname + " - это паровая техника (вода).");
    }
}