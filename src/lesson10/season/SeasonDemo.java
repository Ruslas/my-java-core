package lesson10.season;

public class SeasonDemo {
    public static void main(String[] args) {
        Season myFavoriteSeason = Season.AUTUMN;
        printSeason(myFavoriteSeason);

        printAllSeasons();

        Season season = Season.valueOf("SuMmEr".toUpperCase());
        System.out.println(season);

        printSeasonsInfo();
    }

    private static void printSeasonsInfo(){
        Season[] seasons = Season.values();
        for (Season season: seasons){
            System.out.println(season);
            System.out.println(season.getDescription());
            System.out.println("Срдняя температура - " + season.getTemperature());
            System.out.println("---------");
        }
    }

    private static void printAllSeasons() {
        Season[] seasons = Season.values();
        for (Season season: seasons){
            System.out.println(season);
        }
    }

    public static void printSeason(Season season){
        switch (season){
            case WINTER:
                System.out.println("I love winter");
                break;
            case SPRING:
                System.out.println("I love spring");
                break;
            case SUMMER:
                System.out.println("I love summer");
                break;
            case AUTUMN:
                System.out.println("I love autumn");
        }
    }
}
