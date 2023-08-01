public class taskD {
    public static void main(String[] args) {
        String column1 = "ITEM";
        String column2 = "QUANTITY";
        String column3 = "PRICE";

        String item1 = "Apples";
        int quantity1 = 5;
        float price1 = 0.99f;

        String item2 = "Oranges";
        int quantity2 = 10;
        float price2 = 1.49f;

        System.out.println("+-----------+----------+----------+");
        System.out.printf("| \033[0;1m%-10s\033[0m|\033[0;1m %-8s \033[0m|\033[0;1m %-8s \033[0m|\n",column1,column2,column3);
        System.out.println("+-----------+----------+----------+");
        System.out.printf("| %-10s| \033[34m%8s\033[0m |\033[32m$\033[0m\033[31m%-,8.2f \033[0m|\n",item1,quantity1,price1);
        System.out.printf("| %-10s| \033[34m%8s\033[0m |\033[32m$\033[0m\033[31m%-,8.2f \033[0m|\n",item2,quantity2,price2);
        System.out.println("+-----------+----------+----------+");
        System.out.println();
    }
    
}
