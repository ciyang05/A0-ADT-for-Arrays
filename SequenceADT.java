/**
 * interface to describe operations to keep track of sequences of elements
 * A hypothetical sequence object would be created in a constructor. The constructor is not featured in the interface. 
 * In this case, a seqeunce of elements can be organized by using an array.
 * The object would be declared by defining the type the array will hold followed by its name. Then, it would be initialized by defining the size.
 */
interface SequenceADT {
    
    
    /**
     * accesses and returns the sequence
     */
    public <T> T getSeq();


    /**
     * 
     * @param num
     * returns element at accessed index
     * will throw an exception if specified index is out of bounds
     */
    public <T> T accessEle(int num);


    /**
     * 
     * @param num
     * access and change the element at specified index
     * will throw an exception if the specified index is out of bounds
     */
    public <T> T changeEle(int num);


    /**
     * @param num
     * sorts the sequence in whichever order
     * will throw an exception if the specified index is out of bounds
     */
    public <T> T sortSeq(int num);


    /**
     * @param num
     * allows you to add an element from another sequence by extending the sequence
     * will throw an exception if element is added to an out of bounds index
     */
    public <T> T extendSeq(int num);


}

 

