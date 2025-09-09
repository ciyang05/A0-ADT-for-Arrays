public /**
* interface to describe operations to keep track of sequences of elements
* A hypothetical sequence object would be created in a constructor. The constructor is not featured in the interface.
* In this case, a seqeunce of elements can be organized by using an array.
* The object would be declared by defining the type the array will hold followed by its name. Then, it would be initialized by defining the size.
*/
interface SequenceADT <T> {
  
  
   /**
    * accesses and returns the sequence
    @return sequence
    */
   public T getSeq();




   /**
    *
    * @param num the index for the element which the user is trying to access
    * returns element at accessed index
    * will throw an exception if specified index is out of bounds
    * @return the element the user is trying to access
    */
   public T accessEle(int num);




   /**
    *
    * @param num the index for the element the user is trying to change
    * access and change the element at specified index
    * will throw an exception if the specified index is out of bounds
    * @return the element that the user changed
    */
   public T changeEle(int num);




   /**
    * @param num the array the user is attempting to sort
    * sorts the sequence in whichever order
    * will throw an exception if the specified index is out of bounds
    * @return the sorted sequence
    */
   public T sortSeq(int num);




   /**
    * @param num the element the user is trying to add
    * allows you to add an element from another sequence by extending the sequence
    * will throw an exception if user attempts to add to an out of bounds index
    * @return the extended sequence
    */
   public T extendSeq(int num);


}







 

