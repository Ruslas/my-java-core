package onlineStore;

import java.util.*;

public class OnlineStore {
    private Set<Category> categories;
    private Map<String, User> users;

    public OnlineStore(Set<Category> categories) {
        this.categories = categories;
        users = new HashMap<>();
    }

    public OnlineStore(Set<Category> categories, Map<String, User> users) {
        this.categories = categories;
        this.users = users;
    }

    public OnlineStore() {
        categories = new HashSet<>();
        users = new HashMap<>();
    }

    public Set<Category> getCategories() {
        return categories;
    }

    public void setCategories(Set<Category> categories) {
        this.categories = categories;
    }

    public Map<String, User> getUsers() {
        return users;
    }

    public void setUsers(Map<String, User> users) {
        this.users = users;
    }

    public boolean addCategories(Category... category) {
        return this.categories.addAll(Arrays.asList(category));
    }

    public boolean removeCategories(Category... category) {
        return this.categories.removeAll(Arrays.asList(category));
    }

    public void addUser(String login, String password) {
        this.users.put(login, new User(login, password));
    }

    public void addUser(User... user) {
        for (User u : user) {
            this.users.put(u.getLogin(), u);
        }
    }

    public void removeUser(String login) {
        this.users.remove(login);
    }

    public User getUser(String login){
        return users.get(login);
    }

    public boolean userAuthentication(String login, String password) {
        return users.containsKey(login) &&
                users.containsValue(users.get(login)) &&
                users.get(login).getPassword().equals(password);
    }

    public boolean containsCategory(String categoryName) {
        return categories.contains(new Category(categoryName));
    }

    public void printCategories() {
        for (Category category : categories) {
            System.out.println(category.getName());
        }
    }

    public Commodity getCommodity(String commodityName) {
        Commodity co = new Commodity();
        for (Category category : categories) {
            if (category.containsCommodity(commodityName)) {
                co = category.getCommodity(commodityName);
            }
        }
        return co;
    }

    public void raitUpCommodity(String commodityName) {
        for (Category category : categories) {
            if (category.containsCommodity(commodityName)) {
                category.getCommodity(commodityName).raitUp();
            }
        }
    }

    public void printCommodity(String categoryName) {
        if (this.containsCategory(categoryName)) {
            for (Category category : categories) {
                if (category.equals(new Category(categoryName))) {
                    category.printCommodities();
                }
            }
        } else {
            System.out.println("Указанная категория не существует");
        }
    }

    public void printCommodity(String categoryName, String command) {
        if (this.containsCategory(categoryName)) {
            for (Category category : categories) {
                if (category.equals(new Category(categoryName))) {
                    switch (command) {
                        case "Name":
                            category.sortByName();
                            break;
                        case "Prise":
                            category.sortByPrise();
                            break;
                        case "Rating":
                            category.sortByRating();
                            break;
                        default:
                            category.printCommodities();
                    }
                }
            }
        } else {
            System.out.println("Указанная категория не существует");
        }
    }

    public void pickCommodity(String commodityName, User user) {
        users.get(user.getLogin()).pickCommodity(this.getCommodity(commodityName));
        raitUpCommodity(commodityName);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OnlineStore that = (OnlineStore) o;

        if (categories != null ? !categories.equals(that.categories) : that.categories != null) return false;
        return users != null ? users.equals(that.users) : that.users == null;
    }

    @Override
    public int hashCode() {
        int result = categories != null ? categories.hashCode() : 0;
        result = 31 * result + (users != null ? users.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "OnlineStore{" +
                "categories=" + categories +
                ", users=" + users +
                '}';
    }
}
