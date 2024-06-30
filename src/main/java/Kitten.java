import com.google.gson.annotations.Expose;

public class Kitten {
    @Expose
    private String name;

    public Kitten(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
