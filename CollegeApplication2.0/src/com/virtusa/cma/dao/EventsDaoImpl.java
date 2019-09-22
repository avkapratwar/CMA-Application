package com.virtusa.cma.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.virtusa.cma.util.DaoConnection;
import com.virtusa.cma.entity.Events;

public class EventsDaoImpl implements EventsDaoIface{
	Connection connection;
	PreparedStatement preparedStatement=null;
	static Logger logger = Logger.getLogger(EventsDaoImpl.class); 
	public EventsDaoImpl() {
		connection=DaoConnection.getConnection();
	}

	@Override
	public String addEvents(Events events) {
		
		String command=("insert into events values(?,?,?,?)");
		 try {
			preparedStatement=connection.prepareStatement(command);
			preparedStatement.setString(1, events.getEventId());
			preparedStatement.setString(2, events.getEventName());
			preparedStatement.setDate(3, events.getEventDate());
			preparedStatement.setString(4, events.getVenue());
			preparedStatement.executeUpdate();
			return "Sucessfully Inserted";
			
		} catch (SQLException e) {
			logger.info(e);
		}finally {
			
				try {
					if(preparedStatement!=null) {
					preparedStatement.close();
					}
				} catch (SQLException e) {
					logger.info(e);
				}
			}
		 return "NotInserted or Duplicates not allowed";
	}

	@SuppressWarnings("resource")
	@Override
	public List<Events> showAllEvents() {
		ResultSet resultSet = null;
		ResultSet resultSet1=null;
		@SuppressWarnings("unused")
		Events[] event = null;
		List<Events> list = new ArrayList<>();
		try {
			preparedStatement = connection.prepareStatement("select count(*) cnt from Events");
			resultSet = preparedStatement.executeQuery();
			resultSet.next();
			int cnt = resultSet.getInt("cnt");
		
			event = new Events[cnt];
			preparedStatement= connection.prepareStatement("select * from events");
			resultSet1 = preparedStatement.executeQuery();
			Events newEvent = null;
			while (resultSet1.next()) {
				newEvent = new Events();
				newEvent.setEventId(resultSet1.getString("eventid"));
				newEvent.setEventName(resultSet1.getString("eventname"));
				newEvent.setEventDate(resultSet1.getDate("eventdate"));
				newEvent.setVenue(resultSet1.getString("venue"));
				list.add(newEvent);
			}
		} catch (SQLException e) {
			logger.info(e);
		}finally {
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
			} catch (SQLException e) {
				logger.error(e);

			}

			try {
				if (resultSet != null) {
					resultSet.close();
				}
			} catch (SQLException e) {
				logger.error(e);

			}
			try {
				if (resultSet1 != null) {
					resultSet1.close();
				}
			} catch (SQLException e) {
				logger.error(e);

			}
		}
		return list;
		
		
	}

}

