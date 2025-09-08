/**
 * interface to describe operations to keep track of elements
 */
interface SequenceADT {
    
    
    /**
     * accesses and returns the array
     */
    public void getArray();


    /**
     * 
     * @param num
     * returns element at accessed index
     * will throw an exception if specified index is out of bounds
     */
    public void accessEle(int num);


    /**
     * 
     * @param num
     * access and change the element at specified index
     * will throw an exception if the specified index is out of bounds
     */
    public void changeEle(int num);


    /**
     * @param num
     * sorts the array in whichever order
     * will throw an exception if the specified index is out of bounds
     */
    public void sortArray(int num);


}


