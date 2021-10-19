class Moj1Exception extends Exception {}

    public class Test {

    public static void main(String[] args) {
        int n = 0, p = 0;
        int k;

        try {
            n = Integer.parseInt( args[0] );
            WierszTrojkataPascala wiersz = new WierszTrojkataPascala(n);
            //dla elementow
            for ( int i = 1; i < args.length; i++ ) {
                try {
                    p = Integer.parseInt( args[i] );
                    if ( p < 0 || p > n ) {
                        System.out.println(args[i] + " - liczba spoza zakresu");
                    } else System.out.println(args[i] + " - " + wiersz.wspolczynnik(p) );
                } catch ( NumberFormatException ex ) {
                    System.out.println( args[i] + " - nieprawidlowa dana" );
                }
            }
        }
        //jesli puste wejscie
        catch ( ArrayIndexOutOfBoundsException e ) {
            System.out.println( "Brak danych na wejscie" );
        }
        //jesli wiersz nie jest  liczba calkowita
        catch ( NumberFormatException ex ) {
            System.out.println( args[0] + " - nieprawidlowa dana" );
        }
        //jesli wiersz jest < 0
        catch ( Moj1Exception e ) {
            System.out.println( n + " - nieprawidlowy numer wiersza" );
        }
    }
}
