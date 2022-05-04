/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Query;

/**
 *
 * @author hp
 */
public class ProductQuery {
        public String create = "INSERT INTO product (merk, series, " + 
            "price, stock) VALUES (?, ?, ?, ?)";

    public String get = "SELECT * FROM product ORDER by merk asc";
    public String showById = "SELECT * FROM product where id_product = ?";
    public String showBySeries = "SELECT * FROM product where series LIKE ?";
    public String update = "UPDATE product SET merk = ?, series = ?, "
            + "price = ?, stock = ? WHERE id_product = ?";
    public String getStock = "SELECT stock FROM product where id_product = ?";
    public String update_stock = "UPDATE product SET stock = ? WHERE id_product = ?";
    public String delete = "DELETE FROM product WHERE id_product = ?";
    public String duplikat = "SELECT * FROM product where series = ?";
}
