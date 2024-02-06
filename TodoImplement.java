package dao;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import Util.DBConnectionUtil;
import entity.Todo;

public class TodoImplement implements TodoDao{

	Connection connection = null;
	ResultSet resultSet = null;
	Statement statement = null;
	PreparedStatement preparedStatement = null;
	public List<Todo> get() {
		return null;
	}
	public boolean save(Todo todo) {
		boolean flag = false;
		try {
			String sql = "INSERT INTO Todo(email, phone,name)VALUES ('" + todo.getMail() + "', '"+ todo.getPhone() + "', '"+todo.getName()+"')";
			connection = DBConnectionUtil.openConnection();
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.executeUpdate();
			flag = true;
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return flag;
	}

	public boolean delete(int id) {
		return false;
	}

	public boolean update(Todo todo) {
		return false;
	}
}
