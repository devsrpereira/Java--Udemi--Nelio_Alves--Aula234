package entities;

public class Line implements Comparable <Line>{
    private String name;
    private double num;

    public Line(String name, double num) {
        this.name = name;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getNum() {
        return num;
    }

    public void setNum(double num) {
        this.num = num;
    }

    @Override
    public int compareTo(Line o) {
        return name.compareTo(o.getName());
    }
}
