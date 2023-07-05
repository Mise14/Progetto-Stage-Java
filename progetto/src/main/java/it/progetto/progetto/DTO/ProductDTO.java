package it.progetto.progetto.DTO;

public class ProductDTO {

    private int idProduct;
    private String productName;
    private Long nrAcquisti;

    public ProductDTO() {
    }

    public ProductDTO(int idProduct, String productName, Long nrAcquisti) {
        this.idProduct = idProduct;
        this.productName = productName;
        this.nrAcquisti = nrAcquisti;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Long getNrAcquisti() {
        return nrAcquisti;
    }

    public void setNrOrder(Long nrAcquisti) {
        this.nrAcquisti = nrAcquisti;
    }
}
