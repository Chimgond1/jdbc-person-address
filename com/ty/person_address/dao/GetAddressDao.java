package com.ty.person_address.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ty.person_address.dto.Address;
import com.ty.person_address.util.ConnectionObject;

public class GetAddressDao {
	public List<Address> getAddress(int id) {
		String query = "select * from address where pid=(select pid from person where pid=?)";
		Connection connection = ConnectionObject.getConnection();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			List<Address> list = new ArrayList();
			while (resultSet.next()) {
				Address address = new Address();
				address.setAid(resultSet.getInt(1));
				address.setStreet(resultSet.getString(2));
				address.setDoor_num(resultSet.getString(3));
				address.setCity(resultSet.getString(4));
				address.setPin(resultSet.getString(5));
				address.setPid(resultSet.getInt(6));
				list.add(address);
				
			}
			return list;
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}

		return null;

	}

}
