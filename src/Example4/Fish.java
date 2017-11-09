package Example4;

public class Fish {
    public static void main(String[] args)
        throws java.io.IOException{

        char fish, ignore;

        do {
            System.out.println(" 1. karas ");
            System.out.println(" 2. okyn ");
            System.out.println(" 3. karp ");
            System.out.println(" 4. golavl ");
            System.out.println(" viberite ribu:");

            fish = (char) System.in.read();

            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');
        }while (fish<'1'|fish>'5');

         switch (fish){

             case '1':
                 System.out.println("mirnaja riba");
                 break;

             case '2':

                 System.out.println("hisnaja riba");
                 break;

             case '3':

                 System.out.println(" mirnaja riba");
                 break;

             case '4':

                 System.out.println(" mirnaja riba");
                 break;


            }

        }



    }

