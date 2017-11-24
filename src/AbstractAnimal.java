public abstract class AbstractAnimal extends AdditionalInfo implements Animal {

   private int age;
   private String name;
   private String info;
   private int maxAge;

    @Override
    public String getImage() {
        return null;
    }

    @Override
    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String goToToilet() {
        return "=^-^= срунь срунь";
    }

    @Override
    public String say() {
        return null;
    }

    @Override
    public String getAnimalClass() {
        return null;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxAge(){
        return maxAge;
    }

}
