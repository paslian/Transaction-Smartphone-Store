/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Query;

/**
 *
 * @author hp
 */
public class EmployeeQuery {
        public String login = "SELECT * FROM employee WHERE "
            + "username = ? AND password = ?";
}
