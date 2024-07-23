class practice{
    public static void main(String[] args){
        //creating wrapper objects
        Integer intobj = Integer.valueOf(100);
        Double doubleobj = Double.valueOf(100.10);
        System.out.println(intobj);
        //converting to primitive
        int intprimitive = intobj.intValue();
        double doubleprimitive = doubleobj.doubleValue();
        //parsing string to primitive
        int intvalue = Integer.parseInt("100");
        double doublevalue = Double.parseDouble("100.10");
        System.out.println(intvalue);
        System.out.println(doublevalue);
    }
}
