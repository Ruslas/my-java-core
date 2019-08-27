package repeat.patterns.observer;

import java.util.*;

public class JobSite implements Observed {
    Map<String, List<Vocation>> vocations = new HashMap<>();
    Map<Observer, List<String>> subscribers = new HashMap<>();

    public JobSite() {
    }

    public void addVocation(Vocation vocation){
        String vocationName = vocation.getPositionName();
        if (vocations.containsKey(vocationName)){
            List<Vocation> vocationsList = vocations.get(vocationName);
            vocationsList.add(vocation);
        } else {
            List<Vocation> tempList = new ArrayList<>();
            tempList.add(vocation);
            vocations.put(vocation.getPositionName(), tempList);
        }

        notifyObserver(vocationName);
    }

    public void removeVocation(String vocationName){
        vocations.remove(vocationName);
    }

    public void addObserverVocation(Observer observer, String vocation){
        List<String> vocationsList =  subscribers.get(observer);
        vocationsList.add(vocation);
    }

    public void removeObserverVocation(Observer observer, String vocation){
        List<String> vocationsList =  subscribers.get(observer);
        vocationsList.remove(vocation);
    }

    @Override
    public void addObserver(Observer observer) {
        subscribers.put(observer, new ArrayList<>());
    }

    @Override
    public void removeObserver(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifyObserver(String... vocations) {
        Set<Map.Entry<Observer, List<String>>> subscribersEntry = subscribers.entrySet();
        for (String vocation:vocations) {
            for (Map.Entry<Observer, List<String>> entry : subscribersEntry) {
                if (entry.getValue().contains(vocation)){
                    entry.getKey().handelEvent(this.vocations.get(vocation));
                }
            }
        }
    }
}
