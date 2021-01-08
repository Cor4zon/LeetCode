import java.util.Arrays;

public class MoveZeroes1 {
    public static void shiftArray(int[] nums, int pos_beg, int pos_end) {
        for (int i = pos_beg; i < pos_end; i++) nums[i] = nums[i+1];
    }

    public static void moveZeroes(int[] nums) {
        int notNullElementsCount = nums.length;
        for (int i = notNullElementsCount - 1; i >= 0; i--) {
            if (nums[i] == 0) {
                notNullElementsCount--;
                shiftArray(nums, i, notNullElementsCount);
                nums[notNullElementsCount] = 0;
            }
        }

        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int[] numbersSetOne = {1, 0, 2, 3, 0};
        int[] numbersSetTwo = {0, 1, 0, 3, 12};
        int[] numbersSetThree = {0, 0, 0, 0, 1};

        System.out.println(Arrays.toString(numbersSetOne));
        moveZeroes(numbersSetOne);

        System.out.println(Arrays.toString(numbersSetTwo));
        moveZeroes(numbersSetTwo);

        System.out.println(Arrays.toString(numbersSetThree));
        moveZeroes(numbersSetThree);
    }
}
