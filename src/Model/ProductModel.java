/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author hp
 */
public class ProductModel {
    private String merk;
    private String series;
    private String price;
    private String stock;
    private String remaining_stock;

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getMerk() {
        return merk;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPrice() {
        return price;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getSeries() {
        return series;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getStock() {
        return stock;
    }

    public String getRemaining_stock() {
        return remaining_stock;
    }

    public void setRemaining_stock(String remaining_stock) {
        this.remaining_stock = remaining_stock;
    }




}
