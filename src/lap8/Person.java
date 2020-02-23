package lap8;

public class Person {
    private  String pid;
    private  String name;
    private  String dateOfBirth;
    //Constructor

    public Person(String pid, String name, String dateOfBirth) {
        this.pid = pid;
        this.name = name;
        this.dateOfBirth = dateOfBirth;

    }
    public  void running(){
        System.out.println("I'm running");
    }
    //getter

    public String getPid() {
        return pid;
    }

    public String getName() {
        return name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }
    //toString

    @Override
    public String toString() {
        return "Person{" +
                "pid='" + pid + '\'' +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }
}





