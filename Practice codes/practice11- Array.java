class practice{
    public static void main(String[] args){
       int[] intArray = {1,2,3,4,5};
       System.out.println("Array element at index 3: " + intArray[3]);
       System.out.println("Accessing array elements by normal loop");
       for(int i=0; i< intArray.length; i++){
           System.out.println(intArray[i]);
       }
       System.out.println("Accessing array elements by enhanced loop");
       for(int element : intArray){
           System.out.println(element);
       }
    }
}
