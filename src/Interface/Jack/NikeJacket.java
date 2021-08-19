package Interface.Jack;

public class NikeJacket implements IJacket{
    @Override
    public void puton() {
        System.out.println("надета куртка nike");
    }

    @Override
    public void takeoff() {
        System.out.println("снята куртка nike");
    }
}
