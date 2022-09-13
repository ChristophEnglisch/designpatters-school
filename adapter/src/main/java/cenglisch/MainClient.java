package cenglisch;

public class MainClient {
    public static void main (String[] args) {
        int[]zahlen = new int[10];
        for (int zahl=0;zahl<zahlen.length;zahl++) {
            zahlen[zahl] = (int)(Math.random()*100);
        }

        System.out.println("Das Array zahlen:");

        for (int zahl: zahlen )
            System.out.print(zahl+" ");
        System.out.println();
        Sorter sorter = new SorterAdapter();

        zahlen = sorter.sort(zahlen);

        System.out.println("Das Array aufsteigend sortiert:");
        for (int zahl : zahlen)
        {
            System.out.print(zahl+" ");
        }
    }
}