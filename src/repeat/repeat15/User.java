package repeat.repeat15;

public class User {
    private String login, password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    class Query{
        public void printToLog(){
            System.out.printf("User %s with password %s send massage%n",
                    login, password);
        }
    }

    public void createQuery(){
        new Query().printToLog();
    }

    public static void main(String[] args) {
        User user1 = new User("Gosha", "1234");
        user1.createQuery();
        user1.new Query().printToLog();
        new User("Grisha", "qwer").new Query().printToLog();
    }
}
