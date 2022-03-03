public class Runner2 {
    public static void main(String[] args) {
        /* --- PROBLEM 1 --- */
        System.out.println("PROBLEM 1:");

        int[][] testArr1 = {{1, 2}, {3, 4}, {5, 6}};
        // write code below that uses nested INDEX-BASED for loops
        // to print each element in testArr1 in ROW-MAJOR order; i.e. 1, 2, 3, 4, 5, 6

        /* WRITE CODE HERE! */
        for(int i = 0; i < testArr1.length; i++)
        {
            for(int j = 0; j < testArr1[i].length; j++)
            {
                System.out.println(testArr1[i][j]);
            }
        }
        System.out.println("---------");
        // now, write code below that uses nested ENHANCED for loops
        // to print each element in testArr1 in row-major order AGAIN; i.e. 1, 2, 3, 4, 5, 6

        /* WRITE CODE HERE! */
        for(int[] row : testArr1)
        {
            for(int num : row)
            {
                System.out.println(num);
            }
        }
        System.out.println("---------");
        // lastly, write code below that uses nested INDEX-BASED for loops
        // to print each element in testArr1 in COLUMN-MAJOR order; i.e. 1, 3, 5, 2, 4, 6

        /* WRITE CODE HERE! */
        for(int i = 0; i < testArr1[0].length; i++)
        {
            for(int j = 0; j < testArr1.length; j++)
            {
                System.out.println(testArr1[j][i]);
            }
        }
        /* --- PROBLEM 2 --- */
        System.out.println("---------");
        System.out.println("PROBLEM 2:");

        String[][] testArr2 = {{"ant", "bird", "camel"}, {"dog", "elephant", "fish"}};
        // write code below using a nested ENHANCED for loop to print each element in
        // testArr2 in ROW-MAJOR order; i.e. ant, bird, camel, dog, elephant, fish

        /* WRITE CODE HERE! */
        for(String[] row : testArr2)
        {
            for(String str : row)
            {
                System.out.println(str);
            }
        }
        System.out.println("---------");
        // write code below using an INDEX-BASED nested for loop to print each element in
        // testArr2 in COLUMN-MAJOR order; i.e. ant, dog, bird, elephant, camel, fish

        /* WRITE CODE HERE! */
        for(int colum = 0; colum < testArr1[0].length; colum++)
        {
            for(int row = 0; row < testArr1.length; row++)
            {
                System.out.println(testArr2[colum][row]);
            }
        }

    }


}
