package com.ty.person_address.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.ty.person_address.dto.Address;
import com.ty.person_address.util.ConnectionObject;

public class AddressDao {
	public int saveAddress(int pid, Address address) {
		String query = "insert into address values(?,?,?,?,?,?)";
		Connection connection = ConnectionObject.getConnection();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, address.getAid());
			preparedStatement.setString(2, address.getStreet());
			preparedStatement.setString(3, address.getDoor_num());
			preparedStatement.setString(4, address.getCity());
			preparedStatement.setString(5, address.getPin());
			preparedStatement.setInt(6, pid);
			return preparedStatement.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return 0;
	}

}
