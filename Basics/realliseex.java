public class realliseex {
    public static void main(String[] args) {
        int items = 50;
        float costperitem = 9.99f;
        float totalcost = items * costperitem;
        char currency = '$';
        System.out.println("Number of items is : " + items);
        System.out.println("cost per item : " + costperitem + currency);
        System.out.println("Total cost is : " + totalcost + currency);
    }
}
