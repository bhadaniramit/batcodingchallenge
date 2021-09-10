public class ClassArray {

    public static void main(String[] args) {
        ClassArray classArray = new ClassArray();
//        System.out.println(classArray.sum2(new int[]{1,1,1,1}));
//        System.out.println(classArray.middleWay(new int[]{1, 2, 3}, new int[]{4, 5, 6}));
//        System.out.println(classArray.makeEnds(new int[]{1, 2, 3}));
//        System.out.println(classArray.has23(new int[]{2,2}));
        System.out.println(classArray.makeLast(new int[]{4, 5, 6}));
    }

    public int sum2(int[] nums) {
        if (nums.length == 0) {
            return 0;
        } else if (nums.length < 2) {
            return nums[0];
        }
        return nums[0] + nums[1];

    }

    public int[] middleWay(int[] a, int[] b) {
        int[] z = new int[2];

        z[0] = a[1];
        z[1] = b[1];
        return new int[]{z[0], z[1]};
    }

    public int[] makeEnds(int[] nums) {

        return new int[]{nums[0], nums[nums.length - 1]};
    }

    public boolean has23(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2 || nums[i] == 3) {
                return false;
            }
        }
        return true;
    }

    public int[] makeLast(int[] nums) {
        int a = nums.length - 1;
        int[] newArray = new int[nums.length * 2];
        newArray[newArray.length-1] = nums[a];
        return newArray;
    }

}
