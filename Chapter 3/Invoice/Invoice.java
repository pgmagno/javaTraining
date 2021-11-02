public class Invoice {

    private String partNumber;
    private String description;
    private int quantity;
    private double price;

    public Invoice (String partNumber, String description, int quantity, double price) {
        this.partNumber = partNumber;
        this.quantity = quantity;
        this.description = description;
        this.price = price;
    }

    public void setPartNumber (String partNumber) {
        this.partNumber = partNumber;
    }

    public void setDescription(String description) {
         this.description = description;
    }

    public void setQuantity (int quantity) {
        this.quantity = quantity;
    }

    public void setPrice (double price) {
        this.price = price;
    }

    public String getPartNumber () {
        return partNumber;
    }

    public String getDescription() {
        return description;
    }

    public int getQuantity () {
        return quantity;
    }

    public double getPrice () {
        return price;
    }

    public double getInvoiceAmount() {

        if (quantity <= 0) {
            this.quantity = 0;
        }
        if (price <= 0) {
            this.price = 0.0;
        }

        return quantity * price;
    }


}
