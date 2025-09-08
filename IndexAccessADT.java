/** interface to describe operations supported by built-in array */
interface IndexAccessADT {
    
    /**
     * 
     * @param num
     * returns element at accessed index
     * will throw an exception if specified index is out of bounds
     */
    public void accessIndex(int num);


    /**
     * 
     * @param num
     * access and change the element at specified index
     * will throw an exception if the specified index is out of bounds
     */
    public void changeEle(int num);




    /**
     * @param num
     */
    public void sortSome(int num);

    /**
     * @param num
     */
    public void getSome(int num);
}



