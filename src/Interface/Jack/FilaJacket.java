package Interface.Jack;

public class FilaJacket implements IJacket{
    @Override
    public void puton() {
        System.out.println("надета куртка fila");
    }

    @Override
    public void takeoff() {
        System.out.println("снята куртка fila");
    }
}
