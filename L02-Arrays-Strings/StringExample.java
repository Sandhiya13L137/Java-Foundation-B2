public class StringExample {
    public static void main(String args[]) {
        String str = "Steve Jobs Good evening";
        String names[] = str.split(",");
        for(String each:names) {
            System.out.println("\t"+each);
        }
        String st = ""+46;
        System.out.println("Int to String : "+st instanceof String);
        System.out.println("Char at 0 : "+str.charAt(0));
        System.out.println("Length : "+str.length());
        System.out.println("1st Occurence of 'eve' : "+str.indexOf("eve"));
        System.out.println("Last Occurence of 'eve' : "+str.lastIndexOf("eve"));
        System.out.println("Starts With 'Steve' ? : "+str.startsWith("Steve"));
        System.out.println("Ends With 'Steve' ? : "+str.endsWith("Steve"));
        System.out.println("Starts With 'evening' ? : "+str.startsWith("evening"));
        System.out.println("Ends With 'evening' ? : "+str.endsWith("evening"));
        System.out.println("Compared Result : "+str.compareTo(str));
        System.out.println("Compared Result : "+str.compareTo("Steve Jobs Good Evening"));
        System.out.println("Compared Result : "+"Steve Jobs Good Evening".compareTo(str));
        System.out.println("Compared Result (Ignored) : "+"Steve Jobs Good Evening".compareToIgnoreCase(str));
        System.out.println("Equals Result : "+"Steve Jobs Good Evening".equals(str));
        System.out.println("Equals Result (Ignored) : "+"Steve Jobs Good Evening".equalsIgnoreCase(str));
    }
}
