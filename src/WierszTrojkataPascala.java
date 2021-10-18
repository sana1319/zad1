public class WierszTrojkataPascala {
    int numerWiersza = 0;
    int[] tablica;
    public WierszTrojkataPascala( int n ) throws Moj1Exception {
        numerWiersza = n;

        if( numerWiersza < 0 ) throw new Moj1Exception();

        tablica = new int[numerWiersza+1];
        int poprzedni = 1;
        tablica[0] = poprzedni;
        int obecny = 0;
        for(int i = 1; i <= numerWiersza; i++)
        {
            obecny = (poprzedni * (numerWiersza - i + 1)) / i;
            tablica[i] = obecny;
            poprzedni = obecny;
        }

    }

    int wspolczynnik( int m ){
        return tablica[m];
    }
}
