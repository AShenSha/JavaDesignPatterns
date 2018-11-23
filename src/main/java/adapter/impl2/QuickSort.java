package adapter.impl2;

/**
 * @author ShenSha on 2018/11/19
 */
public class QuickSort {
    public int[] quickSort(int array[]) {
        sort(array, 0, array.length - 1);
        return array;
    }

    public void sort(int array[], int left, int right) {
        if (left >= right) {
            return;
        }
        int index = partition(array, left, right);
        sort(array, left, index - 1);
        sort(array, index + 1, right);
    }

    public int partition(int array[], int leftIndex, int rightIndex) {
        //获取第一个位置的元素作为基准元素
        int pivot = array[leftIndex];
        int left = leftIndex;
        int right = rightIndex;
        //坑的位置
        int index = leftIndex;
        //外部循环在左右指针交错或者重合的时候跳出
        while (right >= left) {
            while (right >= left) {
                if (array[right] < pivot) {
                    array[left] = array[right];
                    index = right;
                    left++;
                    break;
                }
                right--;
            }
            while (right >= left) {
                if (array[left] > pivot) {
                    array[right] = array[left];
                    index = left;
                    right--;
                    break;
                }
                left++;
            }
        }
        array[index] = pivot;
        return index;
    }
}
