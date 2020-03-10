package com.employee.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.employee.bean.Employee;
@Service
public class EmployeeDaoImpl {
	
@Autowired
private JdbcTemplate template;
	
	public int save(Employee p){    
	    String sql="insert into Employee(id,name,swipeIn,swipeOut,ceatedate,LocationName) values"
	    		+ "('"+p.getId()+"',"+p.getName()+",'"+p.getSwipein()+"','"+p.getSwipeout()+"',"
	    		+ "'"+p.getDate()+",'"+p.getLocationName()+"' ";
	    return template.update(sql);    
	} 
	
	
	
	public List<Employee> getEmployees(){    
	    return template.query("select * from Employee",new RowMapper<Employee>(){    
	        public Employee mapRow(ResultSet rs, int row) throws SQLException {    
	            Employee e=new Employee();    
	            e.setId(rs.getInt(1));    
	            e.setName(rs.getString(2));    
	            e.setSwipein(rs.getString(3));    
	            e.setSwipeout(rs.getString(4));
	            e.setDate(rs.getDate(5));
	            e.setLocationName(rs.getString(6)); 
	            
	            return e;    
	        }    
	    });    
	}
	
	
	
	public List<Employee> getEmployeeById(String empid) {

   String sql = "SELECT * FROM Employee WHERE empId = ?";
        List<Map<String, Object>> list = template.queryForList(sql);
        List<Employee> resultEmployeeId = new ArrayList<Employee>();
        for(Map<String, Object> row:list){
            Employee emp = new Employee();
            emp.setId((Integer)row.get("empId"));
            emp.setName((String)row.get("empName"));
            resultEmployeeId.add(emp);
        }        
        return resultEmployeeId;    
    }
	

	
	
	
}
