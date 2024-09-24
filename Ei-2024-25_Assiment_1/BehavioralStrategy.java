//person can cme by walking or twowheeler or fourwheeler or combination of this. so I have implemented a interface Trasnport
// Image is attached with it please refer that to see the implemented logic
interface Transport{
    public String transportMethod();
}

class walking implements Transport{
    @Override
    public String transportMethod(){
        return " walking";
    }
}
class TwoWheeler implements Transport{
    @Override
    public String transportMethod(){
        return " TwoWheeler";
    }
}
class FourWheeler implements Transport{
    @Override
    public String transportMethod(){
        return " FourWheeler";
    }
}
class Person{
    String name;
    int age;
    String transport = "";
    Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void setTransport(Transport transport){
        this.transport = this.transport + transport.transportMethod();
    }
}

public class BehavioralStrategy{
    public static void main(String[] args){
        Person suraj = new Person("Suraj",21);
        suraj.setTransport(new FourWheeler());
        System.out.println(suraj.transport);

        suraj.setTransport(new TwoWheeler());
        System.out.println(suraj.transport);

    }
}
