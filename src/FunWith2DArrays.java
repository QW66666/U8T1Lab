public class FunWith2DArrays {
    public static int totalElements(int[][] arr)
    {
        return arr.length * arr[0].length;
    }

    public static void fourCorners(String[][] str)
    {
        System.out.println(str[0][0]);
        System.out.println(str[0][str[0].length-1]);
        System.out.println(str[str.length-1][0]);
        System.out.println(str[str.length-1][str[0].length-1]);
    }

}
