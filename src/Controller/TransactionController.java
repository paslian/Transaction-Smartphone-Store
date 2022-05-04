/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Helper.Helper;
import Model.TransactionModel;
import Query.TransactionQuery;
import java.sql.ResultSet;
import java.text.ParseException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


/**
 *
 * @author hp
 */
public class TransactionController extends BaseController {
        TransactionQuery query = new TransactionQuery();
        TransactionModel model = new TransactionModel();
        Helper helper =new Helper();

        public ResultSet get() {
        String sql = this.query.get;
        return this.get(sql);
    }

    public boolean create(TransactionModel model) throws ParseException{
        String date = helper.parseDateToString(model.getTransaction_date());

        Map<Integer, Object >map = new HashMap<>();
        map.put(1, model.getId_employee());
        map.put(2, model.getId_product());
        map.put(3, model.getTotal_order());
        map.put(4, model.getTotal_amount());
        map.put(5, model.getCustomer_name());
        map.put(6, date);

        String sql = this.query.create;

        return this.preparedStatement(map, sql);
        }

    public boolean update(String id, TransactionModel model) throws ParseException {
        String date = helper.parseDateToString(model.getTransaction_date());
        
        Map<Integer, Object> map = new HashMap<>();
        map.put(1, model.getId_product());
        map.put(2, model.getTotal_order());
        map.put(3, model.getTotal_amount());
        map.put(4, model.getCustomer_name());
        map.put(5, date);
        map.put(6, id);
        
        String sql = this.query.update;
        
        return this.preparedStatement(map, sql);
    }

    public ResultSet showById(String id) {
        String sql = this.query.showById;
        
        Map<Integer, Object> map = new HashMap<>();
        map.put(1, id);
        
        return this.getWithParameter(map, sql);
    }
    
    public ResultSet showByDate(String date) throws ParseException {
        String sql = this.query.showByDate;
        
        Map<Integer, Object> map = new HashMap<>();
        map.put(1, helper.parseLikeQuery(date));
        
        return this.getWithParameter(map, sql);

    }

    public boolean delete(String id) throws ParseException {
        
        Map<Integer, Object> map = new HashMap<>();
        map.put(1, id);
        
        String sql = this.query.delete;
        
        return this.preparedStatement(map, sql);
    }

}
