package Temp;

public class LevelDang {
    private String title;
    public LevelDang(String title){
        this.title = title;
    }
    public static void main(String[] args) {
        LevelDang level = new LevelDang("HIGH");
        System.out.println(level);
    }

    @Override
    public String toString() {
        return "LevelDang{" +
                "title='" + title + '\'' +
                '}';
    }
}
