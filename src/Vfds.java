public class Vfds {
    public static void main(String[] args)  {

        String[][] animals = new String [5][2];


        for (int i = 0; i < 5; i++) {
            for (int k=0;k<2;k++){
                if (k==0) {  animals[i][k]="собака";}
                if (k==1) {  animals[i][k]="sdfsdf";}
            }
        }

        for (int y = 0; y < 5; y++)
        {
            for (int x = 0; x < 2; x++)
            {
// разделяем элементы пробелами
                System.out.print (animals[y][x] + " ");
            }
            System.out.println ("");// переводим на новую строку );
        }


    }
}

