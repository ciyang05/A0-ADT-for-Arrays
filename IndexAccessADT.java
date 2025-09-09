/**  
 * Interface to describe operations supported by built-in array
 * A hypothetical IndexAccess object would be created in a constructor. The constructor is not featured in the interface. 
 * The object would be declared by defining the type the array will hold followed by its name. Then, it would be initialized by defining the size.
*/
interface IndexAccessADT <T> {
    
    

    /**
     * 
     * @param index index of element the user is attempting to access
     * returns element at accessed index
     * will throw an exception if specified index is out of bounds
     * @return element which was accessed
     */
    public T getEle(int index);

    /**
     * 
     * @param index of element the user is attempting to modify
     * change the element at specified index
     * will throw an exception if the specified index is out of bounds
     * @return element which was modified
     */
    public T setEle(int index); 

    /**
     * 
     * @param arr array which user is passing in
     * will throw an excpetion if array is null
     * @return length of the array
     */
    public T lenArray(T[] arr);





}

// JUNIT TESTS

// public T accessEle(int num) - method call w/expected return value
// The length of this array is 5. Each index holds an element (char). For instance, the array is B L U E S. 
// The method should return the element at the specific index. In this case, if the user wants to access the element at index 2, the method should return 'U'.
// We will use AssertEqual to check if the expected value aligns with the returned value. If the method returns with expected value, test case should pass. 

// public T accessEle(int num) - method call w/expected exception
// The length of this array is 5. Each index holds an element (char). For instance, the array is B L U E S. 
// The method should return the element at the specific index. In this case, if the user wants to access the element at index 2, the method should return 'U'.
// In this case, we will use AssertEqual again. However, if the specified index is out of bounds, the test will not pass.

// public T accessEle(int num) - method call w/fail test
// The length of this array is 5. Each index holds an element (char). For instance, the array is B L U E S. 
// The method should return the element at the specific index. In this case, if the user wants to access the element at index 2, the method should return 'U'.
// We will again use AssertEqual to check if the expected element aligns with the returned element. However, if the elements do not match, the test will fail.

// public T changeEle(int num) - method call w/expected return value
// The length of this array is 5. Each index holds an element (char). For instance, the array is B L U E S. 
// We want to change the element at the 3rd index to an 'I'. The method will return the changed array. 
// We will again use AssertEqual to check if the expected String aligns with the returned String. If the method returns with the expected value, test case should pass. 

// public T changeEle(int num) - method call w/expected exception
// The length of this array is 5. Each index holds an element (char). For instance, the array is B L U E S. 
// We want to change the element at the 3rd index to an 'I'. The method will return the changed array.
// In this case, we will use AssertEqual again. However, if the specified index is out of bounds, the test will not pass.

// public T changeEle(int num) - method call w/fail test
// The length of this array is 5. Each index holds an element (char). For instance, the array is B L U E S. 
// We want to change the element at the 3rd index to an 'I'. The method will return the changed array.
// We will again use AssertEqual to check if the expected String aligns with the changed array as a String. If the two elements do not match, the test will fail.

// public T sortArray(int num) - method call w/expected return value
// The length of this array is 4. Each index holds an element (int). For instance, the array is 1 2 3 4. 
// We want to sort the array in descending order. The method will return the changed array.
// We will use AssertEqual to check if the expected String (array turned to String) aligns with the returned String. If the two elements match, the test case will pass. 

// public T sortArray(int num) - method call w/fail test
// The length of this array is 4. Each index holds an element (int). For instance, the array is 1 2 3 4. 
// We want to sort the array in descending order. The method will return the changed array.
// We will use AssertEqual to check if the expected String (array turned to String) aligns with the returned String. If the two elements do not match, the test will fail.

// public T getArray() - method w/expected return value
// The length of this array is 5. Each index holds an element (char). For instance, the array is B L U E S. 
// The method should get/access the array. The method will return the array. 
// We will use AssertEqual to test the expected case and returned case. If the expected value aligns with the returned value (array), the test should pass. 

// public T getArray() - method call w/fail test
// The length of this array is 5. Each index holds an element (char). For instance, the array is B L U E S. 
// The method should get/access the array. The method will return the array. 
// We will use AssertEqual to test the expected and returned case. If the expected value does not match with the returned value (array), the test will not pass.

