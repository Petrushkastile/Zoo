public class CatRandom extends AdditionalInfo implements Animal {
private int age;
private String name;
private String imageC;
private String infoC;



    private String []randomName = {"Вася","Матроскин","Жопошник","Иваныч","Барсик","Матрона","Людася"};
private String [] additional= {"Пойман и отправлен в зоопарк за транспортировку наркоты","Просто охуел","Жрал колбасу в магазе,выгнали",
            "Вместо молока просил пивас, заебал","Навалил в кеды Хозяйки","Обожрался до полусмерти,после этого поместили в зоопарк"};


    public int age() {
        age=(int) (Math.random()*10);
        return age;
    }

    @Override
    public String getImage() {
      imageC=  '\n'+"____$$"+'\n'+
                "___$__$$$"+'\n'+
                "___$_____$$$$$$$$____$$$$$$$$"+'\n'+
                "___$_$$$_$_$____$$$$$$$____$"+'\n'+
                "___$__$$_$___________$_$$$_$"+'\n'+
                "___$$__________________$__$$"+'\n'+
                "__$$_____________________$$"+'\n'+
                "_$$______$$______$______$$"+'\n'+
                "_$______$$$$___$$$$_______$"+'\n'+
                "_$__$$$$$$_$$__$_$________$"+'\n'+
                "_$$______$__$$$__$$$$$$__$$"+'\n'+
                "__$$_________$____$$$_$_$$"+'\n'+
                "___$$$___$$_$$$_$$_____$$"+'\n'+
                "__$$_________$_________$$$$"+'\n'+
                "__$____________________$___$$$"+'\n'+
                "__$_________________________$$$____$$"+'\n'+
                "__$__________________________$$$_$$$$"+'\n'+
                "__$______________________________$$$__$"+'\n'+
                "___$$_____________$_____$$_______$$___$"+'\n'+
                "____$$_$$_______$$$______$________$___$"+'\n'+
                "____$$__$$____$$$________$_________$__$"+'\n'+
                "_____$___$$$__$_________$$_________$_$$"+'\n'+
                "_____$$____$$$$________$$_____$____$$"+'\n'+
                "______$______$$_____$$$_____$$$$___$"+'\n'+
                "______$______$_______$__$$$$______$$"+'\n'+
                "______$$_____$_______$_$________$$"+'\n'+
                "_______$_____$_______$$$$_$_$_$$$"+'\n'+
                "______$$_______$$$$$$__$$$$$$$$"+'\n'+
                "______$________$"+'\n'+
                "______$$$$$$$$$$";
        return imageC;
                }


    @Override
    public String getInfo() {
        infoC=additional[(int) (Math.random()*6)];
        return infoC+'\n';
    }


    public String name() {
      name = randomName [(int) (Math.random()*7)];
        return name;}

    @Override
    public String goToToilet() {
        return null;
    }

    @Override
    public String say() {return  "мррррр-Мяу" ;
    }

    @Override
    public String getAnimalClass() {
        return "Кот:  ";
    }



    @Override
    public String toString() {
        return getAnimalClass() +
                "age=" + age() +
                " name='" + name() + ";"+'\n';

    }}
