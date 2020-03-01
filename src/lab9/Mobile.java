package lab9;

public class Mobile {
    //attributes
    private  int Mid;
    private String name;
    private String gen;
    private double price;
    private String version;

    public Mobile(int mid, String name, String gen, double price, String version) {
        Mid = mid;
        this.name = name;
        this.gen = gen;
        this.price = price;
        this.version = version;
    }

    public int getMid() {
        return Mid;
    }

    public void setMid(int mid) {
        Mid = mid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGen() {
        return gen;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
