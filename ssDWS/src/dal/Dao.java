package dal;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public interface Dao {
	public String getSql();
	public void unpackResultSet(ResultSet rs) throws SQLException;
	public boolean InsertUpdate(Object o)  ;
	public List<?> Select();
	public Object SelectFirstOrDefault();
}
