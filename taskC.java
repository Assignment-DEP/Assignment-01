public class taskC {
    public static void main(String[] args) {
        String column1 = "CITY";
        String column2 = "STATE";
        String column3 = "POPULATION";

        String city1 = "Los Angeles";
        String state1 = "California";
        long pop1 = 3966936;

        String city2  = "New York";
        String state2 = "New York";
        // String city2  = "\033[32mNew\033[0m York";
        // String state2 = "\033[32mNew\033[0m York";
        long pop2 = 8336817;

        System.out.println("+---------------+--------------+--------------+");
        System.out.printf("| \033[34;1m%-14s\033[0m|\033[34;1m %-12s \033[0m|\033[34;1m %-12s \033[0m|\n",column1,column2,column3);
        System.out.println("+---------------+--------------+--------------+");
        System.out.printf("| %-14s| %-12s |\033[31m %-,12d \033[0m|\n",city1,state1,pop1);
        System.out.printf("| %-14s| %-12s |\033[31m %-,12d \033[0m|\n",city2,state2,pop2);
        System.out.println("+---------------+--------------+--------------+");
     
        // System.out.printf("| %-14s|\033[32m%4d\033[0m |\n",name1,age1);
        // System.out.printf("| %-14s|\033[32m%4d\033[0m |\n",name2,age2);
       



      
    }
    
}
