package wad.hellodatabase;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import org.h2.tools.RunScript;

public class HelloDatabase {

    public static void main(String[] args) throws Exception {
        // Open connection to a database
        Connection connection = DriverManager.getConnection("jdbc:h2:./database", "sa", "");

        try {
            // If database has not yet been created,  insert content
            RunScript.execute(connection, new FileReader("schema.sql"));
            RunScript.execute(connection, new FileReader("data.sql"));
        } catch (Throwable t) {
        }

    }
}
