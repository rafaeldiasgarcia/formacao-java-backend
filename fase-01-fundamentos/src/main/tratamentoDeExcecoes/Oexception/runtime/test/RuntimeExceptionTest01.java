package tratamentoDeExcecoes.Oexception.runtime.test;

public class RuntimeExceptionTest01 {
    public static void main(String[] args) {
        // Checked e Unchecked

        Object object = null;
        System.out.println(object.toString()); // NullPoiterException

        int[] nums = {1, 2};
        System.out.println(nums[2]); // ArrayIndexOutOfBoundsException
    }
}