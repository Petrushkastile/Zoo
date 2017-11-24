import java.util.Random;

public class TigerRandom extends AdditionalInfo implements Animal {
    private int age;
    private String name;
    private String imageT;
    private String infoT;

    private String[] randomName = {"Лютый", "Плешивый", "Очкорванец", "Бобер", "Коляныч", "Ебалай", "Гриша"};
    private String[] additional = {"Убежал от наркоторговцев", "Охранял военную базу", "Жрал колбасу в магазе,выгнали",
            "Отчебучил подушку хозяина", "Навалил в кеды Хозяйки", "Обожрался до полусмерти,после этого поместили в зоопарк"};


    public int age() {
        Random ageTiger = new Random();
        age = ageTiger.nextInt( (20) + 1 );
        return age;
    }

    @Override
    public String getImage() {
        imageT = '\n' + "_____________________$$o____________________o$$$$$o__" + '\n' +
                "___________________o$o_$$o____oo$$$$$$$oo______o$$$$o" + '\n' +
                "______________$o________o$$$$$o___oo$$$$$$$o______$$$" + '\n' +
                "______________$$$ooo________o$$$$o______o$$$$$o_____o" + '\n' +
                "____________oo_____oo_____oo___o$$$$$______$$$$$$____" + '\n' +
                "_________ooooo___$$o_$___oooooo___o$$$$o__o__o$$$$___" + '\n' +
                "_______ooo__ooo$$$$o_$$ooooooooooo__o$$$o__oo_oo$$$o_" + '\n' +
                "______oo_o$$o_$$_o$o_o$o__oooooooooo__o$$$o_oo__o$$$o" + '\n' +
                "____oooooo$$$$o___oo__$$o_ooo_oooooooo__o$$o_ooo_o$$$" + '\n' +
                "___ooooooo__o___oooo__$$ooooo$_oooooooo__o$$__ooo_$$$" + '\n' +
                "_$$o_ooooo___o$$$$$o__o$o__o_$o__oooooooo_o$$o_oo__$$" + '\n' +
                "_$$$o_ooo_________o$$_$$o____$$o_ooooooooo_$$$o_oo_$$" + '\n' +
                "__oo________o$$o____o_$$o____o$ooooooooooo_o$$o_oo_o$" + '\n' +
                "___o$$$$$$$$$$$$$o___$$$o____$$o_oooooooooo_$$$o_o_o$" + '\n' +
                "________o__oo$$$$$o__$$$o____$$o____oooooo__$$$o_o_o$" + '\n' +
                "_________$$$$$$$$$o__$$_____$$$o___________$$$oooooo_" + '\n' +
                "__________o$$$$$$$o_________$$___________o$o___oooooo" + '\n' +
                "___________o$$$$o_______________ooooo__oo$__ooo__oooo" + '\n' +
                "________________________________ooo_$$oo___oooo$o____" + '\n' +
                "________________________________oooo_$$$$$o___oo$$$o_" + '\n' +
                "________________________________ooooo_o$$$$$o_____$$$" + '\n' +
                "________________________________oooooo_o$$$$$$ooo___o" + '\n' +
                "________________________________ooooooo__o$$$$$o_____" + '\n';
        return imageT;
    }


    @Override
    public String getInfo() {
        infoT = additional[(int) (Math.random() * 6)];
        return infoT + '\n';
    }


    public String name() {
        name = randomName[(int) (Math.random() * 7)];
        return name;
    }

    @Override
    public String goToToilet() {
        return null;
    }

    @Override
    public String say() {
        return "PPP-PPPPP-PPP";
    }

    public String getAnimalClass() {
        return "Тигр:  ";
    }

    public String toString() {
        return getAnimalClass() +
                "age=" + age() +
                " name='" + name() + "';" + '\n';

    }
}

