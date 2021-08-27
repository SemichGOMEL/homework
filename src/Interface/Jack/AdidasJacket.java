package Interface.Jack;

public class AdidasJacket implements IJacket{
    @Override
    public void puton() {
        System.out.println("надета куртка adidas");
    }

    @Override
    public void takeoff() {
        System.out.println("снята куртка adidas");
    }
}
