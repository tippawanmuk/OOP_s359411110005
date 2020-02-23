package lap8;

public class Studrnt extends Person {
    private String sid;
    private String program;



    public Studrnt(String pid, String name, String dateOfBirth, String sid, String program) {
        super(pid, name, dateOfBirth);
        this.sid = sid;
        this.program = program;
    }
    public  void addSubjiect(){
        System.out.println("I'm adding subject.");
    }
    //toString

    @Override
    public String toString() {
        return "Studrnt{" +
                "sid='" + sid + '\'' +
                ", program='" + program + '\'' +
                "} " + super.toString();
    }
}
