package Tourists;
import Location.Boracay;
import Location.Bohol;
import Location.Cebu;
import Location.Iloilo;
import Location.Bacolod;
import Location.Palawan;

public class Me implements Tourist {

    static int budget = 1000;

    public void visit() {
        System.out.print("Enjoying my stay");
    }

    public void visit(Boracay boracay) {
        if (budget >= boracay.airFare) {
            budget -= boracay.airFare;
            System.out.println("Visiting Boracay");
        } else {
            System.out.println("ok lng yan puro vlogger lng namn nandito");
        }
        checkBudget();
    }

    public void visit(Palawan palawan) {
        if (budget >= palawan.airFare) {
            budget -= palawan.airFare;
            System.out.println("Visiting Palawan");
        } else {
            System.out.println("Kulang pera mo");
        }
        checkBudget();
    }

    public void visit(Cebu cebu) {
        if (budget >= cebu.airFare) {
            budget -= cebu.airFare;
            System.out.println("NAMISS KITA CEBUUU");
        } else {
            System.out.println("BKT UBOS NA PERA KO");
        }
        checkBudget();
    }

    public void visit(Iloilo iloilo) {
        if (budget >= iloilo.airFare) {
            budget -= iloilo.airFare;
            System.out.println("Visiting iloilo");
        } else {
            System.out.println("Next time for sure");
        }
        checkBudget();
    }

    public void visit(Bacolod bacolod) {
        if (budget >= bacolod.airFare) {
            budget -= bacolod.airFare;
            System.out.println("Visiting The ruins");
        } else {
            System.out.println("Next time nlng ulit");
        }
        checkBudget();
    }

    public void visit(Bohol bohol) {
        if (budget >= bohol.airFare) {
            budget -= bohol.airFare;
            System.out.println("Visiting Bohol");
        } else {
            System.out.println("sayng di ko natikman ang chocolate hills");
        }
        checkBudget();
    }

    public void checkBudget() {
        System.out.println("my budget is " + budget);
    }

}
