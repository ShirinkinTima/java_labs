public class Human {
    private String name;
    private int height;

    public Human(String name, int height){
        setName(name);
        setHeight(height);
    }

    public Human() {
        this.name = null;
        this.height = 160;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(int height){
        if (height > 100 && height < 220) {
            this.height = height;
        }
        else {
            System.out.println("Set Height Error :(");
        }
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return this.name + ", рост: " + this.height;
    }
}
