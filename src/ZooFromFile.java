import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

import static java.nio.file.Files.exists;

public class ZooFromFile {
    String zooName;
    String[] zoo;
    ArrayList<String> zoopark;


    public static void zooFromFile() throws Exception {


        LineNumberReader reader = new LineNumberReader( new FileReader( "F:/projectsIdea/Zoo/src/zooFile.txt" ) );

        String line = null;
        ArrayList<String> zoopark = new ArrayList<String>();
        while ((line = reader.readLine()) != null) {
            zoopark.add( line );
        }

        String[] zoo = zoopark.toArray( new String[zoopark.size()] );
        System.out.println( "Зоопарк:" + zoo[0] + '\n' );
        for (int l = 1; l < zoo.length; l++) {
            System.out.println( zoo[l] );
        }


        Cat kot = new Cat();
        Dog sobaka = new Dog();
        Elephant slon = new Elephant();
        Tiger tigr = new Tiger();

        int i = 1;
   do {
            String type[] = zoo[i].split( " " );
            String getclass = type[0];
            String name = type[1];
            String vozrast = type[2];
            int foo = Integer.parseInt( vozrast );

            if (getclass.startsWith( "Собака" )) {
                try {
                    if (foo >= sobaka.getMaxAge()){
                        FileUtils.update( "F:/projectsIdea/Zoo/src/output.txt", "неправильно указан возраст" + "\n" + sobaka.getAnimalClass() +
                                " " + name + ".   Возраст должен быть до" +
                                "-" + sobaka.getMaxAge() + ". Возраст который указали Вы - " +
                                foo + ".\n - - - - - - - - - - - - - - - - - - - - - -" );}
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            }

            if (getclass.startsWith( "Кот" )) {
                try {
                    if (foo >= kot.getMaxAge()){
                        FileUtils.update( "F:/projectsIdea/Zoo/src/output.txt", "неправильно указан возраст" + "\n" + kot.getAnimalClass() +
                                " " + name + ".   Возраст должен быть до" +
                                "-" + kot.getMaxAge() + ". Возраст который указали Вы - " +
                                foo + ".\n - - - - - - - - - - - - - - - - - - - - - -" );}
                } catch (FileNotFoundException e1) {
                    e1.printStackTrace();
                }
            }
            if (getclass.startsWith( "лон", 1 )) {
                try {
                    if (foo >= slon.getMaxAge()){
                        FileUtils.update( "F:/projectsIdea/Zoo/src/output.txt", "неправильно указан возраст" + "\n" + slon.getAnimalClass() +
                                " " + name + ".   Возраст должен быть до" +
                                "-" + slon.getMaxAge() + ". Возраст который указали Вы - " +
                                foo + ".\n - - - - - - - - - - - - - - - - - - - - - -" );}
                } catch (FileNotFoundException e1) {
                    e1.printStackTrace();
                }
            }
            if (getclass.startsWith( "Тигр" )) {
                try {
                    if (foo > tigr.getMaxAge()){
                        FileUtils.update( "F:/projectsIdea/Zoo/src/output.txt", "неправильно указан возраст" + "\n" + tigr.getAnimalClass() +
                                " " + name + ".   Возраст должен быть до" +
                                "-" + tigr.getMaxAge() + ". Возраст который указали Вы - " +
                                foo + ".\n - - - - - - - - - - - - - - - - - - - - - -" );}
                } catch (FileNotFoundException e1) {
                    e1.printStackTrace();
                }
            }
i++;
        }while (i < zoo.length );

    }

}







