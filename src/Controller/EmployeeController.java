/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Helper.Helper;
import Model.EmployeeModel;
import Query.EmployeeQuery;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author hp
 */
public class EmployeeController extends BaseController{
    Helper helper = new Helper();
    EmployeeQuery query = new EmployeeQuery();
    
    public ResultSet login(EmployeeModel model) {
        String sql = this.query.login;
        
        Map<Integer, Object> map = new HashMap<>();
        map.put(1, model.getUsername());
        map.put(2, model.getPassword());
        
        return this.getWithParameter(map, sql);
    }
}
