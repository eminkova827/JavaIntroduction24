package Arrays;

import java.util.Arrays;

public class ArrayDemos {

    public static void main(String[] args) {
        String[] someRandomSentences = {"first", "second", "next one", "Last one"};
        int[] intArray = new int[20];

        System.out.println(SomeRandomSentences[3]); // ste izpe4ata Last one
        System.out.println(someRandomSentences);// statikata

        for (int i = 0; i < someRandomSentences.length; i++) {
            System.out.println(someRandomSentences[i]);// pe4ata wsi4ki elementi
        }
        for (int i = 0; i < intArray.Length; i++) {
            intArray[i] = i * 3;
            System.out.println(intArray[i]);

        }
        System.out.println(intArray[20]);
        System.out.println(intArray[intArray.Length - 1]);//posledniq element na masiwa
        System.out.println(intArray[intArray.Length]); //dylgina n amasiwa

        System.out.println("---------foreach-----------");
        for (String sentence : someRandomSentences) {
            System.out.println("Curent line sentence is: %s\n", sentence);
        }
        System.out.println("---------foreach-----------");

        for (int niumber : intArray) {
            System.out.println("current element is:  " + number);
        }


    //dwumeren masiw
    int[][] _2dArray = {
            {9, 45, 234},
            {54, 22, 4},
            {8, 4},
            {34, 2, 2, 2, 1, 1, 1, 4, 45}
    };
for(
    int i = 0;
    i<_2dArray.length;i++)

    {
        for (int j = 0; j <= _2dArray.length; j++) {
            System.out.println("elementite sa : %d%d. Elemeta e %d:", i, j, _2dArray[i][j]);
        }
    }
}
    }

