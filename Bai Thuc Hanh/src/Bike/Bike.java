package bike;

public abstract class Bike {
    abstract void Run();

    public static void main(String[] args) {
        Bike obj = new Honda4();
        obj.Run();
    }
}
