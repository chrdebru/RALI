package rali;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

import com.github.freva.asciitable.AsciiTable;

public class Util {

	public static String toASCIITable(ResultSet rs) throws SQLException {
		int columnCount = rs.getMetaData().getColumnCount();

		String[] headers = new String[columnCount];
		for(int i = 0; i < columnCount; i++) {
			String type = "";
			if(rs.getMetaData().getColumnType(i + 1) != Types.VARCHAR) {
				type = " : " + rs.getMetaData().getColumnTypeName(i + 1);
			}
			
			headers[i] = rs.getMetaData().getColumnName(i + 1) + type;
		}
		
		List<Object[]> records = new ArrayList<Object[]>();
		Object[] record = null;
		while(rs.next()) {
			record = new String[columnCount];
			for(int i = 0; i < columnCount; i++) {
				record[i] = rs.getObject(i + 1).toString();
			}
			records.add(record);
		}
		
		// If the result set is empty, then only show the headers
		if(records.size() == 0) {
			Object[][] tmp = { headers };
			return AsciiTable.getTable(tmp);
		}

		return AsciiTable.getTable(headers, records.toArray(new Object[1][1]));
	}

}
