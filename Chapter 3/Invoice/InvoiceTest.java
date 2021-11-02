public class InvoiceTest {
    public static void main(String[] args) {

        Invoice myInvoice = new Invoice("486-B","Really old processor",10,200.00);

        System.out.printf("Part Number: %s%n",myInvoice.getPartNumber());
        System.out.printf("Description: %s%n",myInvoice.getDescription());
        System.out.printf("Price: %.2f%n",myInvoice.getPrice());
        System.out.printf("Quantity: %d%n",myInvoice.getQuantity());
        System.out.printf("Invoice: %.2f%n",myInvoice.getInvoiceAmount());


        System.out.println();
        System.out.println("Changing stuff...\n");

        myInvoice.setPartNumber("i5 - 3570k");
        myInvoice.setDescription("Quadcore processor");
        myInvoice.setPrice(-100);
        myInvoice.setQuantity(-1);

        System.out.printf("Part Number: %s%n",myInvoice.getPartNumber());
        System.out.printf("Description: %s%n",myInvoice.getDescription());
        System.out.printf("Price: %.2f%n",myInvoice.getPrice());
        System.out.printf("Quantity: %d%n",myInvoice.getQuantity());
        System.out.printf("Invoice: %.2f%n",myInvoice.getInvoiceAmount());


        System.out.printf("Part Number: %s%n",myInvoice.getPartNumber());
        System.out.printf("Description: %s%n",myInvoice.getDescription());
        System.out.printf("Price: %.2f%n",myInvoice.getPrice());
        System.out.printf("Quantity: %d%n",myInvoice.getQuantity());
    }
}
