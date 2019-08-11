package repeat.patterns.singleton;

import java.util.Scanner;

public class PlanetsDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Создайте планету");
        String planet = "";
        Planet planet1 = null;
        while (!planet.equals("end")){
            if (scanner.hasNextLine()){
                planet = scanner.nextLine();
            }
            switch (planet){
                case "Earth":
                    planet1 = Earth.getInstance();
                    break;
                case "Mars":
                    planet1 = Mars.getInstance();
                    break;
                case "Moon":
                    planet1 = Moon.getInstance();
                    break;
            }
        }
        if (planet1 instanceof Earth){
            System.out.println(((Earth) planet1).getPopulation());
            System.out.println(((Earth) planet1).getRADIUS());
        } else if (planet1 instanceof Mars){
            System.out.println(((Mars) planet1).getPopulation());
            System.out.println(((Mars) planet1).getRADIUS());
        } else if (planet1 instanceof Moon){
            System.out.println(((Moon) planet1).getPopulation());
            System.out.println(((Moon) planet1).getRADIUS());
        }
        planet1.printInfo();
    }
}
