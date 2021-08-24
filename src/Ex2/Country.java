package Ex2;

public enum Country {
    POLAND(714), RUSSIA(4403), USA(8560);
    private int arrange;
    Country(int arrange){
        this.arrange = arrange;
    }
    public int getArrange(){
        return this.arrange;
    }
}
