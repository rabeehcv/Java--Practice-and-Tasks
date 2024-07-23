class practice{
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println("Before Manipulation: " + sb);
        System.out.println("After appending: " + sb.append(" World"));
        System.out.println("After insertion: " + sb.insert(5,","));
        System.out.println("After replacing: " + sb.replace(5,6," "));
        System.out.println("After Deletion: " + sb.delete(5,7));
        StringBuffer sbf = new StringBuffer("Hello");
        System.out.println("Before Manipulation: " + sbf);
        System.out.println("After appending: " + sbf.append(" World"));
        System.out.println("After insertion: " + sbf.insert(5,","));
        System.out.println("After replacing: " + sbf.replace(5,6," "));
        System.out.println("After Deletion: " + sbf.delete(5,7));
    }
}
