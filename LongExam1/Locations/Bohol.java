package Location;
import Tourists.*;

public class Bohol implements Locations {

    public int airFare = 170;

    

    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}