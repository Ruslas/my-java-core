package onlineStore;

public enum UsersCommands {
    SIGN_IN("sign in"),
    SIGN_UP("sign up"),
    SHOW_CATEGORY_COMMODITY("commodity in category"),
    SHOW_COMMODITY_INFO("commodity info"),
    SHOW_CATEGORIES("categories list"),
    ADD_COMMODITY_TO_BASKET("to basket"),
    SHOW_BASKET_CONTENT("basket content"),
    BUY_COMMODITY_FROM_BASKET("buy basket content"),
    END_OPERATIONS("end");

    private final String name;

    public String getName() {
        return name;
    }

    private UsersCommands(String name){
        this.name = name;
    }
}
