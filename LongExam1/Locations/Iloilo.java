package Location;
import Tourists.*;

public class Iloilo implements Locations {

    public int airFare = 350;

    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}