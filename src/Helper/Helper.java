/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helper;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JTable;

/**
 *
 * @author hp
 */
public class Helper {

    public Date parseStringToDate(String _date) throws ParseException {
        return new SimpleDateFormat("dd-MM-yyyy").parse(_date);
    }

    public String parseDateToString (Date _date) throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd");
        return dateFormat.format(_date);
    }

    public String parseStringToDatePickerFormat(String _date)
        throws ParseException{
        Date date = new SimpleDateFormat ("yyyy-mm-dd").parse(_date);
        String formatted = new SimpleDateFormat ("mm/dd/yy").format(date);
        return formatted;
    }

    public String getValueRows(JTable table, int index) {
        return table.getValueAt(table.getSelectedRow(), index).toString();
    }
    
    public String parseLikeQuery(String query) {
        return "%" + query + "%";
    }
}
