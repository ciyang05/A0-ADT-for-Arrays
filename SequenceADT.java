/**
 * interface to describe operations to keep track of elements
 */
interface SequenceADT {
    
    
    /**
     * accesses and returns the sequence
     */
    public void getSeq();


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
     * sorts the sequence in whichever order
     * will throw an exception if the specified index is out of bounds
     */
    public void sortSeq(int num);


    /**
     * @param num
     * allows you to add an element from another sequence by extending the sequence
     * will throw an exception if element is added to an out of bounds index
     */
    public void extendSeq(int num);


}

 

