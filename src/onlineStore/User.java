package onlineStore;

public class User {
    private String login, password;
    private Basket userBasket;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
        this.userBasket = new Basket();
    }

    public User() {
        this.userBasket = new Basket();
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Basket getUserBasket() {
        return userBasket;
    }

    public void setUserBasket(Basket userBasket) {
        this.userBasket = userBasket;
    }

    public void pickCommodity(Commodity commodity) {
        userBasket.addCommodity(commodity);
    }

    public void basketContent(){
        userBasket.printBasketContents();
    }

    public void buyAll() {
        if (!userBasket.getBoughtCommodities().isEmpty()) {
            System.out.print("Вы преобрели ");
            userBasket.printBasketContents();
            System.out.println("На сумму " + userBasket.getBasketPrice());
            userBasket.clear();
            System.out.println("Благодарим за покупку");
        } else {
            System.out.println("Покупательская корзина пуста");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (login != null ? !login.equals(user.login) : user.login != null) return false;
        if (password != null ? !password.equals(user.password) : user.password != null) return false;
        return userBasket != null ? userBasket.equals(user.userBasket) : user.userBasket == null;
    }

    @Override
    public int hashCode() {
        int result = login != null ? login.hashCode() : 0;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (userBasket != null ? userBasket.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "\nUser{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", userBasket=" + userBasket +
                "}";
    }
}
