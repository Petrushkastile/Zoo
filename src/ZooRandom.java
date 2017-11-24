import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static java.lang.System.out;

public class ZooRandom {

    private String zooName;
    private int size = 0;

    private Animal[] animals = ZooRandom();

    public ZooRandom(String zooName) {
        this.zooName = zooName;
    }

    public Animal[] ZooRandom() {
        Scanner input = new Scanner( System.in );
        System.out.println( "Введите размер зоопарка: " );
        size = input.nextInt();

        Animal[] animals = new Animal[size];
        Animal animal = null;
        Random randomizer = new Random();
        DogRandom sobaka = new DogRandom();
        CatRandom kot = new CatRandom();
        ElephantRandom slonik = new ElephantRandom();
        TigerRandom tigr = new TigerRandom();
        for (int i = 0; i < size; i++) {
            int randomNumber = randomizer.nextInt( 4 );
            switch (randomNumber) {
                case 0:
                    animal = sobaka;
                    break;
                case 1:
                    animal = kot;
                    break;
                case 2:
                    animal = slonik;
                    break;
                case 3:
                    animal = tigr;
                    break;
            }
            animals[i] = animal;
        }
        return animals;
    }

    public String toString() {

        return "Рандомный зоопарк:  " + zooName + '\n' + Arrays.asList( animals );
    }

    public void info() {

        Animal Chupacabra = new Animal() {

            public int age() {
                return 666;
            }


            public String name() {
                return "Chupa-zalupa";
            }

            @Override
            public String goToToilet() {
                return "Nableval begemotu v past";
            }

            @Override
            public String say() {
                return "Здесь все будет обосрано!";
            }

            @Override
            public String getAnimalClass() {
                return "Чупакабра";
            }

            public String toString() {
                return getAnimalClass() + " " + name() + " " + goToToilet();
            }

        };

        int chanseChupakabra = (int) (Math.random() * 100);
        int get;
        int det;

        System.out.println( "Зоопарк:" + zooName );

        for (int k = 0; k < animals.length; k++) {
            System.out.println( "[" + (k + 1) + "]  " + animals[k] );
        }
        if (chanseChupakabra <= 50) {
            System.out.println( "OH MY GOD  " + Chupacabra );
        }
        try {

                FileUtils.update( "F:/projectsIdea/Zoo/src/RandomZoopark.txt", "Рандомный зоопарк:  " + zooName + '\n' + Arrays.asList( animals ) );
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        }

        Scanner vvod = new Scanner( System.in );

        DogRandom sobaka = new DogRandom();
        TigerRandom tigr = new TigerRandom();
        CatRandom kot = new CatRandom();
        ElephantRandom slonik = new ElephantRandom();

        out.println( "Если желаете просмотреть информацию о животном выберите номер клетки " );

        get = vvod.nextInt();
        det = get - 1;
        if (animals[det].toString().startsWith( "Собака" )) {
            System.out.println( sobaka.getInfo() + sobaka.getImage() );
        }
        if (animals[det].toString().startsWith( "Кот" )) {
            System.out.println( kot.getInfo() + kot.getImage() );
        }
        if (animals[det].toString().startsWith( "лон", 1 )) {
            System.out.println( slonik.getInfo() + slonik.getImage() );
        }
        if (animals[det].toString().startsWith( "Тигр" )) {
            System.out.println( tigr.getInfo() + tigr.getImage() );
        }

    }
}







