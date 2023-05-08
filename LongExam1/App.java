import Location.*;
import Tourists.*;

public class App {
    public static void main(String[] args)  {

            Locations boracay = new Boracay();
            Locations bohol = new Bohol();
            Locations cebu = new Cebu();
            Locations bacolod = new Bacolod();
            Locations iloilo = new Iloilo();
             Locations palawan = new Palawan();

            Tourist me = new Me();
            
            boracay.accept(me);
            bohol.accept(me);
            cebu.accept(me);
            bacolod.accept(me);
            iloilo.accept(me);
             palawan.accept(me);
        
        // Long exam 1

        // 1. Add 5 new locations to visit
        // 2. Each location should have an airFare.
        // 3. Each time you visit a new location, your budget should decrease.
        // 4. In the visit method, print a message if you can visit the new location and
        // print another message if you cannot visit the location.
        // 5. Each time you visit a location, call the checkBudgetMethod

    }
}
