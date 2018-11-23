package onlineStore;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class OnlineStore {
    private Set<Category> categories;
    private Set<User> users;

    public OnlineStore(Set<Category> categories) {
        this.categories = categories;
        users = new HashSet<>();
    }

    public OnlineStore(Set<Category> categories, Set<User> users) {
        this.categories = categories;
        this.users = users;
    }

    public OnlineStore() {
        categories = new HashSet<>();
        users = new HashSet<>();
    }

    public Set<Category> getCategories() {
        return categories;
    }

    public void setCategories(Set<Category> categories) {
        this.categories = categories;
    }

    public Set<User> getUsers() {
        return users;
    }

    public boolean addCategories(Category... category) {
        return this.categories.addAll(Arrays.asList(category));
    }

    public boolean removeCategories(Category... category) {
        return this.categories.removeAll(Arrays.asList(category));
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    public boolean addUser(String login, String password) {
        return this.users.add(new User(login, password));
    }

    public boolean addUser(User... user) {
        return this.users.addAll(Arrays.asList(user));
    }

    public boolean removeUser(String login, String password) {
        return this.users.remove(new User(login, password));
    }

    public boolean userAuthentication(String login, String password) {
        return users.contains(new User(login, password));
    }

    public void printCategories() {
        for (Category category : categories) {
            System.out.println(category.getName());
        }
    }

    public void printCommodity(String categoryName) {
        if (categories.contains(new Category(categoryName))) {
            for (Category category : categories) {
                if (category.equals(new Category(categoryName))) {
                    for (Commodity commodity : category.getCommodities()) {
                        System.out.println(commodity.getName());
                    }
                }
            }
        } else {
            System.out.println("Указанная категория не существует");
        }
    }

    public void pickCommodity(String commodityName, String userLogin) {
        Commodity c = new Commodity();
        for (Category category : categories) {
            if (category.getCommodities().contains(new Commodity(commodityName))) {
                for (Commodity commodity : category.getCommodities()) {
                    if (commodity.getName().equals(commodityName)) {
                        c = commodity;
                    }
                }
                for (User user : users) {
                    if (user.getLogin().equals(userLogin)) {
                        user.pickCommodity(c);
                    }
                }
            }
        }
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
