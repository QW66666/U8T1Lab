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

    public static double average(int[][] arr)
    {
        double total = 0;
        for(int[] row: arr)
        {
            for(int num : row)
            {
                total += num;
            }
        }
        int row = arr.length;
        int column = arr[0].length;
        return total/(row*column);
    }

    public static int[] indexFound(String[][] arr, String target)
    {
        int[] index = new int[2];
        for(int row = 0; row < arr.length; row++)
        {
            for(int column = 0; column < arr[0].length; column++)
            {
                if(arr[row][column].equals(target))
                {
                    index[0] = row;
                    index[1] = column;
                    return index;
                }
            }
        }
        index[0] = -1;
        index[1] = -1;
        return index;
    }




}
