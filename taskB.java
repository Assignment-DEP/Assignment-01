public class taskB{
    public static void main(String[] args) {
        // %[parameter$][Flag][width][.Precision][Length]type
        String column1 = "NAME";
        String column2 = "AGE";
       
        String name1 = "Alice";
        int age1 = 24;

      
        String name2= "Bob";
        int age2 = 30;

       
        
        System.out.println("+---------------+-----+");
        System.out.printf("| \033[34;1m%-14s\033[0m|\033[34;1m%4s \033[0m|\n",column1,column2);
        System.out.println("+---------------+-----+");
        System.out.printf("| %-14s|\033[32m%4d\033[0m |\n",name1,age1);
        System.out.printf("| %-14s|\033[32m%4d\033[0m |\n",name2,age2);
        System.out.println("+---------------+-----+");



    }
}