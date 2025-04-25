package Lesson12.Task1;

public class ArrayValueCalculator {
    public int doCalc(String[][] array) throws ArrayDataException, ArraySizeException{
        if(array.length != 4 || array[0].length != 4){
            throw new ArraySizeException(" The size of the array must be 4x4. ");
        }
        int sum = 0;

        for (int i = 0; i< array.length; i++ ){
            for(int j = 0; j < array[i].length; j++ ){
                try{
                    sum += Integer.parseInt(array[i][j]);
                }catch (NumberFormatException e) {

                    throw new ArrayDataException("Incorrect data in cell [ " + i +  "] [ " + j +  "]: " + array[i][j]);
                }
            }
        }
        return sum;
    }
}
