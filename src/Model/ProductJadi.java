
package Model;


public class ProductJadi extends Product{
    String productId;

    public ProductJadi(String productId, String title, int price, String kategori, String deskripsi) {
        super(title, price, kategori, deskripsi);
        this.productId = productId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }
    
}
