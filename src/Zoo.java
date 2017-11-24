import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.out;

public class Zoo {
    int img = 0;
    int age = 0;
    int push = 0;
    private String zooName;

    public Zoo(String zooName) {
        this.zooName = zooName;
    }

    public void Zoo() {
        Scanner info = new Scanner( System.in );
        ArrayList<Animal> animals = new ArrayList<>();
        ArrayList<String> infos = new ArrayList<>();

        Cat kot = new Cat();
        Dog sobaka = new Dog();
        Tiger tiger = new Tiger();
        Elephant slon = new Elephant();

        System.out.println( "Из данных животных составьте зоопарк" );
        System.out.println( "[1]Кот" );
        System.out.println( "[2]Собака" );
        System.out.println( "[3]Тигр" );
        System.out.println( "[4]Слон" );

        Scanner get = new Scanner( System.in );
        Scanner ageC = new Scanner( System.in );
        Scanner kletka = new Scanner( System.in );
        while (push != 5) {
            System.out.println( "Выберите животное или [5] для просмотра созданного зоопарка" );
            push = get.nextInt();

            switch (push) {
                case 1:
                    animals.add( kot );

                    out.println( "Введите имя кота" );
                    kot.setName( info.nextLine() );

                    out.println( "Введите возраст кота" );
                    age = ageC.nextInt();
                    while (age >= kot.getMaxAge()) {
                        System.out.println( "За этим котом сегодня придет котосмерть, выберите возраст котейки помоложе " );
                        age = ageC.nextInt();
                    }
                    kot.setAge( age );


                    out.println( "Введите информацию про кота" );
                    kot.setInfo( info.nextLine() );
                    infos.add( kot.getInfo() + kot.getImage() );
                    break;
                case 2:
                    animals.add( sobaka );
                    out.println( "Введите имя собаки" );
                    sobaka.setName( info.nextLine() );

                    out.println( "Введите возраст собаки" );
                    age = ageC.nextInt();
                    while (age >= sobaka.getMaxAge()) {
                        System.out.println( "За этим котом сегодня придет котосмерть, выберите возраст котейки помоложе " );
                        age = ageC.nextInt();
                    }
                    sobaka.setAge( age );

                    out.println( "Введите информацию про собаку" );
                    sobaka.setInfo( info.nextLine() );
                    infos.add( sobaka.getInfo() + sobaka.getImage() );
                    break;
                case 3:
                    animals.add( tiger );
                    out.println( "Введите имя тигра" );
                    tiger.setName( info.nextLine() );

                    out.println( "Введите возраст тигра" );
                    age = ageC.nextInt();
                    while (age >= tiger.getMaxAge()) {
                        System.out.println( "За этим котом сегодня придет котосмерть, выберите возраст котейки помоложе " );
                        age = ageC.nextInt();
                    }
                    tiger.setAge( age );

                    out.println( "Введите информацию про тигра" );
                    tiger.setInfo( info.nextLine() );
                    infos.add( tiger.getInfo() + tiger.getImage() );
                    break;

                case 4:
                    animals.add( slon );
                    out.println( "Введите имя слона" );
                    slon.setName( info.nextLine() );

                    out.println( "Введите возраст слона" );
                    age = ageC.nextInt();
                    while (age >= slon.getMaxAge()) {
                        System.out.println( "За этим котом сегодня придет котосмерть, выберите возраст котейки помоложе " );
                        age = ageC.nextInt();
                    }
                    slon.setAge( age );


                    out.println( "Введите информацию про слона" );
                    slon.setInfo( info.nextLine() );
                    infos.add( slon.getInfo() + slon.getImage() );
                    break;
                case 5:
                    out.println( '\n'+"Рассаживаем выбранных животных по клеткам"+'\n' );
                    break;
                default:
                    out.println( "Повторите ввод" );
            }

        }

        System.out.println( "Зоопарк:" + zooName );
        for (int i = 0; i < animals.size(); i++) {
            System.out.println( (i + 1) + " " + animals.get( i ) );
        }
        System.out.println( "Eсли желаете просмотреть инфо про животное выберите номер клетки" );
        img = kletka.nextInt();
        System.out.println( infos.get( img - 1 ) );

    }
}