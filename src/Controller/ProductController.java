/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Helper.Helper;
import Model.ProductModel;
import Query.ProductQuery;
import java.sql.ResultSet;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author hp
 */
public class ProductController extends BaseController {
        Helper helper = new Helper ();
        ProductQuery query = new ProductQuery();
    
    public boolean create(ProductModel model) throws ParseException {
        
        Map<Integer, Object> map = new HashMap<>();
        map.put(1, model.getMerk());
        map.put(2, model.getSeries());
        map.put(3, model.getPrice());
        map.put(4, model.getStock());
        
        String sql = this.query.create;
        
        return this.preparedStatement(map, sql);
    }

    public ResultSet get() {
        String sql = this.query.get;
        return this.get(sql);
    }
    
    public ResultSet showById(String id) {
        String sql = this.query.showById;
        
        Map<Integer, Object> map = new HashMap<>();
        map.put(1, id);
        
        return this.getWithParameter(map, sql);
    }
    
    public ResultSet showBySeries(String series) {
        String sql = this.query.showBySeries;
        
        Map<Integer, Object> map = new HashMap<>();
        map.put(1, helper.parseLikeQuery(series));
        
        return this.getWithParameter(map, sql);
    }

    public boolean update(String id, ProductModel model) throws ParseException {
        
        Map<Integer, Object> map = new HashMap<>();
        map.put(1, model.getMerk());
        map.put(2, model.getSeries());
        map.put(3, model.getPrice());
        map.put(4, model.getStock());
        map.put(5, id);
        
        String sql = this.query.update;
        
        return this.preparedStatement(map, sql);
    }
    

    public boolean update_stock(String id, ProductModel model) throws ParseException {
        
        Map<Integer, Object> map = new HashMap<>();
        map.put(1, model.getRemaining_stock());
        map.put(2, id);
        
        String sql = this.query.update_stock;
        
        return this.preparedStatement(map, sql);
    }


    public boolean delete(String id) throws ParseException {
        
        Map<Integer, Object> map = new HashMap<>();
        map.put(1, id);
        
        String sql = this.query.delete;
        
        return this.preparedStatement(map, sql);
    }

    public ResultSet duplikat (ProductModel model) {
        String sql = this.query.duplikat;
        
        Map<Integer, Object> map = new HashMap<>();
        map.put(1, model.getSeries());
        
        return this.getWithParameter(map, sql);
    }

    public boolean GetStock(String id) throws ParseException {

        String sql = this.query.getStock;
        
        Map<Integer, Object> map = new HashMap<>();
        map.put(1, id);
        
        
        return this.preparedStatement(map, sql);
    }

}
