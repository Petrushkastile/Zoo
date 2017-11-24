public class DogRandom extends AdditionalInfo implements Animal {
    private int age;
    private String[] randomName = {"Тузик", "Шмара", "Петя", "Валик", "Хлебец", "Утырок", "Барбос"};
   private String name;
   private String imageD;
   private String info;



    public int age() {
        age=(int) (Math.random()*10);
        return age;}

    public String name() {
        name = randomName [(int) (Math.random()*7)];
        return name;}

    @Override
    public String goToToilet() {
        return null;
    }

    @Override
    public String say() {return  "Гав-гав" ;

    }

    private String [] additional= {"Убежал от наркоторговцев","Охранял военную базу","Навалил у порога президента",
            "Отчебучил подушку хозяина","Навалил в кеды Хозяйки","Лаял когда ссал,заебало"};




    @Override
    public String getImage() {
         imageD=   '\n'+"_______________________**$_______________________"+'\n'+
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
        return imageD;
    }


    @Override
    public String getInfo() {
        info = additional[(int) (Math.random() * 6)];
        return info ;
    }


    public String getAnimalClass(){
        return "Собака:  ";}

    public String toString() {
        return getAnimalClass() +
                "age=" + age() +
                " name='" + name() + ";" + '\n';
    }

}







