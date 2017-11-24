public class Elephant extends AbstractAnimal implements Animal {
    private int age;
    private String name;
    private String infoE;
    private String imageE;
    private int maxAge;

    @Override
    public String getImage() {
       imageE=  '\n'+"_________¶¶¶¶¶¶¶¶¶"+'\n'+
                "________¶¶¶_____¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶"+'\n'+
                "______¶¶¶____¶¶¶¶¶¶¶¶___________¶¶¶"+'\n'+
                "____¶¶¶______¶______¶¶____________¶¶"+'\n'+
                "___¶¶_______________¶¶_____________¶¶"+'\n'+
                "___¶¶__¶¶___¶_______¶_______________¶"+'\n'+
                "__¶¶___¶¶___¶¶¶____¶¶_______________¶¶"+'\n'+
                "__¶¶_________¶¶¶¶__¶_________________¶"+'\n'+
                "__¶___¶¶¶¶¶¶___¶¶¶_¶__________¶______¶¶"+'\n'+
                "_¶__¶¶¶¶¶¶¶______¶¶¶_________¶¶______¶¶¶"+'\n'+
                "_¶_¶¶¶¶¶__¶¶_¶______________¶¶______¶¶¶¶"+'\n'+
                "¶¶_¶¶¶_____¶¶¶¶_____¶¶_____¶¶¶______¶_¶¶¶"+'\n'+
                "¶__¶¶¶¶_____¶¶¶_____¶¶____¶¶¶______¶___¶¶"+'\n'+
                "¶__¶¶_¶¶____¶¶¶_____¶¶__¶¶¶¶_____¶¶____¶¶¶"+'\n'+
                "¶__¶¶_¶¶_____¶_____¶¶¶¶¶¶¶¶_____¶¶______¶¶¶"+'\n'+
                "¶¶____¶¶____¶¶____¶¶__¶¶¶¶¶_____¶________¶¶¶¶"+'\n'+
                "_¶¶¶¶¶¶_____¶¶____¶¶____¶_¶¶___¶¶_________¶¶¶"+'\n'+
                "___¶¶_______¶¶____¶¶____¶¶¶¶___¶"+'\n'+
                "____________¶¶____¶¶____¶¶¶____¶"+'\n'+
                "____________¶¶_____¶___¶¶¶¶____¶"+'\n'+
                "____________¶¶_____¶___¶¶¶¶¶¶¶_¶"+'\n'+
                "____________¶¶¶¶¶¶¶¶_____¶¶¶¶¶¶¶"+'\n'+
                "____________¶¶¶¶¶¶¶";
        return imageE; }

    @Override
    public String getInfo() {
        return infoE;
    }

    @Override
    public void setInfo(String infoE) {
        this.infoE=infoE;
    }

    @Override
    public String say() {
        return  "Туу-тууууу" ;
    }

    @Override
    public String getAnimalClass() {
        return "Слон:  ";
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age=age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public int getMaxAge() {
        return maxAge=60;
    }



    @Override
    public String toString() {
        return getAnimalClass() +
                " name= " + name + "',  age=" + age +
                ";";
    }
}

