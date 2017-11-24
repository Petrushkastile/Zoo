import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) throws Exception {
        out.println( "Виртуальный зоопарк" );
        int vibor = 0;
        Scanner scanner = new Scanner( System.in );
        Scanner scanner1 = new Scanner( System.in );

        out.println( "Выберите пункт" );
        out.println( "[1]Создание зоопарка" );
        out.println( "[2]Создание случайного зоопарка " );
        out.println( "[3]Создание зоопарка из файла" );
        out.println( "[4]Выход" );
        vibor = scanner1.nextInt();
        switch (vibor) {
            case 1:
                out.println( "Введите имя зоопарка" );
                Zoo zooV = new Zoo( scanner.nextLine() );
                zooV.Zoo();
                break;
            case 2:
                out.println( "Введите имя зоопарка" );
                ZooRandom zoo = new ZooRandom( scanner.nextLine() );
                zoo.info();
                break;
            case 3:
                ZooFromFile.zooFromFile();
                break;
            case 4:
                out.println( "------------" );
                break;
            default:
                out.println( "Повторите ввод" );
        }
    }
   }



