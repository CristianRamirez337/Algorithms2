public class MergeSort {

    private static boolean isSorted(Comparable[] a, int lo, int hi)
    {
        return true;
    }

    private static boolean less(Comparable a, Comparable b)
    {
        return a.compareTo(b) > 0 ;
    }

    private static void merge(Comparable[] a, Comparable[] aux, int lo, int mid, int hi) {
        assert isSorted(a, lo, mid);
        assert isSorted(a, mid+1, hi);

        for (int k = lo; k <= hi; k++)
            aux[k] = a[k];

        int i = lo, j = mid + 1;

        for (int k = lo; k <= hi; k++)
        {
            if (i > mid) a[k] = aux[j++];
            if (j > hi) a[k] = aux[i++];
            else if (less(aux[j], a[i])) a[k] = aux[j++];
            else a[k] = aux[i++];
        }

        assert isSorted(a, lo, hi);
    }

    private static void sort(Comparable[] a, Comparable[] aux, int lo, int hi)
    {
        if (hi <= lo) return;
        int mid = lo + (hi - lo) / 2;


    }

    public static void main(String[] args) {
        // write your code here
        System.out.println("Hello World MergeSort");
    }
}

package SortAlgorithms;
