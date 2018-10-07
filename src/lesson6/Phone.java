package lesson6;

/**
 * Created by student on 07.10.2018.
 */
public class Phone {
    private String nomber;
    private String model;
    private double weight;

    public void setNomber (String nomber){
        this.nomber = nomber;
    }

    public void setModel (String model){
        this.model = model;
    }

    public void setWeight (double weight){
        this.weight = weight;
    }

    public String getNomber (){
        return nomber;
    }

    public String getModel(){
        return model;
    }

    public double getWeight(){
        return weight;
    }

    public void phoneToString(){
        System.out.println("nomber - " + this.getNomber() + "\tmodel - " + this.getModel() + "\tweight - " + this.getWeight());
    }
}
