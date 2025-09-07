/** interface to describe operations supported by built-in array */
interface IndexAccessADT {
    
    /**
     * 
     * @param num
     * returns element at accessed index
     */
    public void accessIndex(int num);


    /**
     * 
     * @param num
     * access and change the element at specified index
     */
    public void changeEle(int num);
    /**
    * @param num (position of the element)
    * add an element to the end of the array
    */
    public void addEle(int num);

    /**
    * @param num (position of the element)
    * removes an element at a specified index
    */
    public void removeEle(int num);

}



