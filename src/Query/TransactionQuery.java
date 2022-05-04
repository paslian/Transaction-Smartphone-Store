/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Query;

/**
 *
 * @author hp
 */
public class TransactionQuery {

    public String create = "INSERT INTO transactions (id_employee, id_product	, total_order"
                            + ", total_amount , customer_name , transaction_date) VALUES (?,?,?,?,?,?)";

    public String update = "UPDATE transactions SET id_product = ?, total_order = ?, "
            + "total_amount = ?, customer_name = ?, transaction_date = ? WHERE id_transactions = ?";

    public String delete = "DELETE FROM transactions WHERE id_transactions = ?";

    public String get = "SELECT * FROM relasi ORDER by id_transactions ASC";
    public String showById = "SELECT * FROM relasi where id_transactions = ?";
    public String showByDate = "SELECT * FROM relasi where transaction_date LIKE ?";
}
