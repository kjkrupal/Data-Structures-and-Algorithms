public class Implementation {
    public static void main(String[] args) {
        Student krupal = new Student("Krupal", 11599514);
        Student deepesh = new Student("Deepesh", 11599515);
        Student bhavesh = new Student("Bhavesh", 11599516);
        Student priyank = new Student("Priyank", 11599517);
        Student dharmil = new Student("Dharmil", 11599518);

        HashTable table = new HashTable(5);

        table.put("krupal", krupal);
        table.put("deepesh", deepesh);
        table.put("bhavesh", bhavesh);
        table.put("priyank", priyank);
        table.put("dharmil", dharmil);

        System.out.println(table.get("krupal"));

    }
}
