public class Dog extends AbstractAnimal implements Animal {
    private int age;
    private String name;
    private String infoD;
    private String imageD;
    private int maxAge;

    @Override
    public String getImage() {
    imageD=     '\n'+"_______________________**$_______________________"+'\n'+
                "_____________________****$B$_____________________"+'\n'+
                "________*$$************$$**BB____________________"+'\n'+
                "________*$*************$***$B____________________"+'\n'+
                "_______**********$$$**$**$B$_____________________"+'\n'+
                "______***********$BBB***$*_______________________"+'\n'+
                "*$$****$$BB$******$*****$________________________"+'\n'+
                "$B*****$*$Bo$*****$**$$$*________________________"+'\n'+
                "_$B****B******$ooo*`*$$*_________________________"+'\n'+
                "___*$$$$$*$$$***oo```*$*_________________________"+'\n'+
                "___________$$***````*****________________________"+'\n'+
                "__________***************_________________*$$$**_"+'\n'+
                "_________****************_______________*$*_*$$$$"+'\n'+
                "________***`````********$*______________*$___*$$$"+'\n'+
                "________***````*$**********______________**___*$$"+'\n'+
                "_________***````*************_____________**____$"+'\n'+
                "__________***````*************______________**___"+'\n'+
                "___________***```*$*******$*****__****_______**__"+'\n'+
                "_________**$***``*$*******$************_______**_"+'\n'+
                "_________***$***`*$*******$`***********________**"+'\n'+
                "__________***$***$*******$```**$******________**_"+'\n'+
                "___________**$***$******$````*$*******___******__"+'\n'+
                "___________**$***$*****$````*$***$*$*******______"+'\n'+
                "________*``*`**`**`*``*`*``***``****`*___________"+'\n';
        return imageD;}

    @Override
    public String getInfo() {
        return infoD;
    }

    @Override
    public void setInfo(String infoD) {
        this.infoD=infoD;
    }

    @Override
    public String say() {
   return  "Гав-гав" ;
    }

    @Override
    public String getAnimalClass() {
        return "Собака:";
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
        return maxAge=13;
    }



    @Override
    public String toString() {
        return getAnimalClass() +
                " name= '" + name + "',  age=" + age +
                ";";
    }
}
