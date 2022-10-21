public class Product {
    private String productName;
    private String productType;

    Product(){

    }

    public Product(String productName,String productType){
        this.productName = productName;
        this.productType = productType;
    }

    public String getProductName(){
        return productName;
    }

    public String getProductType(){
        return productType;
    }

    public void setProductName(String productName){
        this.productName = productName;
    }

    public void setProductType(String productType){
        this.productType = productType;
    }

    public void accept(ReminderVisitor visitor){

    }

    public void SelectProduct() {
    }

    public void createProductList() {
    }

    public void attachProductToUser() {
    }

    public void productOperation() {
    }

}
