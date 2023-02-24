import Transport.AirTransport.AirTransport;
import Transport.WaterTransport.WaterTransport;
import Transport.WheeledTransport.WheeledTransport;

public class Lessons2_9_6 {
    public static void main(String[] args) {
        WheeledTransport transport = new WheeledTransport();
        WaterTransport watertransport = new WaterTransport();
        AirTransport airtransport = new AirTransport();
        WheeledTransport bus = new WheeledTransport("Автобус");
        WheeledTransport trolleybus = new WheeledTransport("Троллейбус");
        WheeledTransport tank = new WheeledTransport("Танк");
        AirTransport fighteraircraft = new AirTransport("Истребитель");
        WheeledTransport locomotive = new WheeledTransport("Паровоз");
        WaterTransport steamship = new WaterTransport("Пароход");
    }
}
