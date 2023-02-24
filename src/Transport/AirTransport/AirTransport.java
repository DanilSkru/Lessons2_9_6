package Transport.AirTransport;
import Transport.Transport;

public class AirTransport  extends Transport {
    public AirTransport() {

    }
    public AirTransport(String transportname) {
        switch(transportname) {
            case "Истребитель":
                FighterAircraft fighteraircraft = new FighterAircraft(transportname);
                break;
        }
    }
    @Override
    public void info() {
        System.out.println("Инициализирован класс воздушный транспорт.");
    }
}
interface MilitaryTransport {
    void description();
}
class FighterAircraft extends AirTransport implements MilitaryTransport {
    String transportname;
    public FighterAircraft(String transportname) {
        this.transportname = transportname;
        description();
    }
    @Override
    public void description() {
        System.out.println(transportname + " - это военная техника (авиа).");
    }
}