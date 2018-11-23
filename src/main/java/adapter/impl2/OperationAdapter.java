package adapter.impl2;

/**
 * @author ShenSha on 2018/11/19
 */
public class OperationAdapter implements ScoreOperation {
    /**
     * 定义适配者quickSort对象
     */
    private QuickSort quickSort;

    /**
     * 定义适配者binarySearch对象
     */
    private BinarySearch binarySearch;

    public OperationAdapter() {
        quickSort = new QuickSort();
        binarySearch = new BinarySearch();
    }

    @Override
    public int[] sort(int[] array) {
        return quickSort.quickSort(array);
    }

    @Override
    public int search(int[] array, int key) {
        return binarySearch.binarySearch(array, key);
    }
}
