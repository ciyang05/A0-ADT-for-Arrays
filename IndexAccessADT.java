/** interface to describe operations supported by built-in array */
interface IndexAccessADT {
    
    /**
     * @param num
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
     * 
     */
    public void sortArray(int num);


}

// JUNIT TESTS

// public void accessEle(int num) - method call w/expected return value
// The length of this array is 5. Each index holds an element (char). For instance, the array is B L U E S. 
// The method should return the element at the specific index. In this case, if the user wants to access the element at index 2, the method should return 'U'.
// We will use AssertEqual to check if the expected value aligns with the returned value. If the method returns with expected value, test case should pass. 

// public void accessEle(int num) - method call w/expected exception
// In this case, we will use AssertEqual again. However, if the specified index is out of bounds, the test will not pass.

// ASK HALIE ABOUT THIS EXCEPTION WHAT IT WOULD BE CALLED?
// public void access(int num) - method call w/expected exception when String doesn't align

// public void changeEle(int num) - method call w/expected return value
// The length of this array is 5. Each index holds an element (char). For instance, the array is B L U E S. 
// We want to change the element at the 3rd index to an 'I'. The method should return the changed array as a String. 
// We will again use AssertEqual to check if the expected String aligns with the returned String. If the method returns with expected value, test case should pass. 

// public void changeEle(int num) - method call w/expected exception
// In this case, we will use AssertEqual again. However, if the specified index is out of bounds, the test will not pass.

// ASK HALIE ABOUT THIS EXCEPTION WHAT IT WOULD BE CALLED?
// public void changeEle(int num) - method call w/expected exception when String doesn't align

// public void sortArray(int num) - method call w/expected return value
// The length of this array is 4. Each index holds an element (int). For instance, the array is 1 2 3 4. 
// We want to sort the array in descending order. The method should return the changed array as a string.
// We will use AssertEqual to check if the expected String (array turned to String) aligns with the returned String. If the method returns with expected value, test case should pass. 

// ASK HALIE ABOUT THIS EXCEPTION WHAT IT WOULD BE CALLED?
// public void sortArray(int num) - method call w/expected exception 

// public void getArray() - method w/expected return value
// The length of this array is 5. Each index holds an element (char). For instance, the array is B L U E S. 
// The method should get/access the array. It should return the array. 
// We will use AssertEqual to test the expected case and returned case. If the expected value aligns with the returned value (array), the test should pass. 

// ASK HALIE ABOUT THIS EXCEPTION WHAT IT WOULD BE CALLED?
// public void getArray - method call w/expected exception

