package Ex2;

public enum Country {
    POLAND("LOW"), RUSSIA("LOW"), USA("LOW"), PITER("LOW"), UKRAINE("MEDIUM"), SIRIYA("HIGH");
    private String dang;
    Country(String dang){
        this.dang = dang;
    }
    public String getArrange(){
        return this.dang;
    }
}
