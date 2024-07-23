class practice{
    public static void main(String[] args){
        String string = "Hello World";
        String s2 = string.concat(" !");
        System.out.println(s2);
        System.out.println("Length of the String is: " + string.length());
        System.out.println("Character at index 3: " + string.charAt(3));
        System.out.println("String content in Upper case: " + string.toUpperCase());
        System.out.println("String content in lower case: " + string.toLowerCase());
        System.out.println("Substring: " + string.substring(1,4));
        System.out.println("After replacing character: " + string.replace("World","Students"));
    }
}
