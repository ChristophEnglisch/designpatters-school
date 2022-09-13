package cenglisch;

import java.util.Arrays;
import java.util.List;

public class SorterAdapter implements Sorter {
    public int[] sort(int[] sorter) {
        var sortFremdProdukt = new SortFremdProdukt();
        List<Integer> sortList = sortFremdProdukt.sortiere(Arrays.stream(sorter).boxed().toList());
        return sortList.stream().mapToInt(i->i).toArray();
    }
}
