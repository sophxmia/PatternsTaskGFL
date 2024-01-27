package patterns.example;

public class Client implements Observer{
    private final String name;

    public Client(String name){
        this.name = name;
    }

    @Override
    public void update(String message){
        System.out.println("Client " + name + "received update " + message);
    }
}
