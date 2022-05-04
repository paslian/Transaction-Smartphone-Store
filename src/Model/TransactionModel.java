/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author hp
 */
public class TransactionModel {
    private String id_employee;
    private String id_product;
    private String total_order;
    private String total_amount;
    private String customer_name;
    private Date transaction_date;

    public void setId_employee(String id_employee) {
        this.id_employee = id_employee;
    }

    public String getId_employee() {
        return id_employee;
    }

    public void setId_product(String id_product) {
        this.id_product = id_product;
    }

    public String getId_product() {
        return id_product;
    }

    public void setTotal_amount(String total_amount) {
        this.total_amount = total_amount;
    }

    public String getTotal_amount() {
        return total_amount;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setTotal_order(String total_order) {
        this.total_order = total_order;
    }

    public String getTotal_order() {
        return total_order;
    }


    public void setTransaction_date(Date transaction_date) {
        this.transaction_date = transaction_date;
    }

    public Date getTransaction_date() {
        return transaction_date;
    }
}