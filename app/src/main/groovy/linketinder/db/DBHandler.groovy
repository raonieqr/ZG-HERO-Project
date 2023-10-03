package linketinder.db
import groovy.sql.*

class DBHandler {
    static DBHandler instance
    Sql sql

    DBHandler(String dbUrl, String dbUser, String dbPassword) {
        sql = Sql.newInstance(dbUrl, dbUser, dbPassword)
    }

    DBHandler() {
        String dbUrl = "jdbc:postgresql://localhost/linketinder"
        String dbUser = "postgres"
        String dbPassword = ""
        String dbDriver = "org.postgresql.Driver"

        sql = Sql.newInstance(dbUrl, dbUser, dbPassword, dbDriver)
    }

    static DBHandler getInstance() {
        if (instance == null)
            instance = new DBHandler()

        return instance
    }

    Sql getSql() {
        return sql
    }

    void close() {
        if (sql != null) {
            sql.close()
        }
    }
}
