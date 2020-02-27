package Lab8_2;

public class Police extends Person {
    private String workContry;

    //constructor


    public Police(String name, String bornYear, String workContry) {
        super(name, bornYear);
        this.workContry = workContry;
    }

    @Override
    public void introduce() {
        super.introduce();
    }
    //gatter and setter

    public String getWorkContry() {
        return workContry;
    }

    public void setWorkContry(String workContry) {
        this.workContry = workContry;
    }
}





