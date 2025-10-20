public class HumanWithName {
    private Name name;
    private int height;

    public HumanWithName(Name name, int height) {
        this.name = name;
        this.height = height;
    }
     public HumanWithName() {
        this.name = null;
        setHeight(160);
     }

     public HumanWithName(HumanWithName humanWithName) {
        setName(humanWithName.name);
        setHeight((humanWithName.height));
     }

     public void setName(Name name) {
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

     public Name getName() {
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
