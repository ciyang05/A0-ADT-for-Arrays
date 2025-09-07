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
}
