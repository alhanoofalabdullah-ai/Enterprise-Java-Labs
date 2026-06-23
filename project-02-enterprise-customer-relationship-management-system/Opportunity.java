package src.models;

public class Opportunity {

    private int id;
    private String title;
    private double value;

    public Opportunity(
            int id,
            String title,
            double value) {

        this.id = id;
        this.title = title;
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
