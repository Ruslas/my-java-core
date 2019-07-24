package repeat.repeat7;

public class User {
    private String name;
    private String password;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void createQuery(){
        Query query = new Query();
        query.printToLog();
    }

    public class Query {
        public void printToLog(){
            System.out.printf("User name %s password %s send message%n", name, password);
        }
    }

    public static void main(String[] args) {
        User user1 = new User("Bill", "123456");
        user1.createQuery();

        User user2 = new User("Murray", "11235813");
        Query query1 = user2.new Query();
        query1.printToLog();

        Query query2 = new User().new Query();
        query2.printToLog();
    }
}
