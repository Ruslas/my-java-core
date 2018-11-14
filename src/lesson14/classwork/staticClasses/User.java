package lesson14.classwork.staticClasses;

/**
 * Created by student on 11.11.2018.
 */
public class User {
    static private String login, password;

    public static void initialize(String login, String password){
        User.login = login;
        User.password = password;
    }

    static class Query {
        public void printToLog() {
            System.out.printf("User with login %s and password %s send query%n",
                    login, password);
        }
    }

    public static void createQuery() {
        Query query = new Query();
        query.printToLog();
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

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public static void main(String[] args) {
        initialize("Login1", "pass");
        Query query = new Query();
        query.printToLog();

        User.Query query1 = new User.Query();
        query1.printToLog();

        createQuery();
    }
}
