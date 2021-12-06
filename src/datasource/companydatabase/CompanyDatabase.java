package datasource.companydatabase;

import business.businesslogic.*;
import business.usermodels.*;
import java.sql.*;
import java.util.*;

/**
 * Class CompanyDatabase
 * @since December 4th, 2021
 * @author Azlan Amjad
 * @author Rohan Amjad
 * @author Gibran Akmal
 * @author Ibrahim Asad
 * @version 1.0
 */
public class CompanyDatabase {
    private final String DATABASENAME;
    private final String DBURL;
    private final String USERNAME;
    private final String PASSWORD;
    private Connection dbConnect;

    private ArrayList<Renter> cachedRenters;
    private ArrayList<Landlord> cachedLandlords;
    private ArrayList<Manager> cachedManagers;
    private ArrayList<Property> cachedProperties;
    private ArrayList<String> cachedManagerKeys;

    private Fee f;

    public CompanyDatabase(String databaseName, String dburl, String username, String password) {
        this.DATABASENAME = databaseName;
        this.DBURL = dburl;
        this.USERNAME = username;
        this.PASSWORD = password;

        cachedRenters = new ArrayList<Renter>();
        cachedLandlords = new ArrayList<Landlord>();
        cachedManagers = new ArrayList<Manager>();
        cachedProperties = new ArrayList<Property>();
        cachedManagerKeys = new ArrayList<String>();

        try {
            initializeConnection();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void initializeConnection() throws SQLException {
        try {
            this.dbConnect = DriverManager.getConnection(DBURL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean validSignup(String email, String password, String firstName, String lastName, String userType) {
        String sqlInsert = "INSERT INTO users (email, password, first_name, last_name, user_type) VALUES (?, ?, ?, ?, ?)";
        String sqlCheck = "SELECT * FROM users WHERE email=(?) AND user_type=(?)";

        int userID = 0;
        
        try {
            PreparedStatement checkStmt = dbConnect.prepareStatement(sqlCheck);
            checkStmt.setString(1, email);
            checkStmt.setString(2, userType);
            ResultSet rs = checkStmt.executeQuery();

            if (rs.isBeforeFirst()) {
                throw new SQLException("User already exists!");
            }

            PreparedStatement insertStmt = dbConnect.prepareStatement(sqlInsert, Statement.RETURN_GENERATED_KEYS);
            insertStmt.setString(1, email);
            insertStmt.setString(2, password);
            insertStmt.setString(3, firstName);
            insertStmt.setString(4, lastName);
            insertStmt.setString(5, userType);

            int affectedRows = insertStmt.executeUpdate();
            if (affectedRows == 0) {
                throw new SQLException("Could not create user!");
            }
            ResultSet generatedKeys = insertStmt.getGeneratedKeys();
            if (generatedKeys.next()) {
                userID = generatedKeys.getInt(1);
            }
            else {
                throw new SQLException("Could not get user ID!");
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

        if (userType.equalsIgnoreCase("renter")) {
            Renter r = new Renter(email, password, firstName, lastName, userID);
            cachedRenters.add(r);
        }
        else if (userType.equalsIgnoreCase("landlord")) {
            Landlord l = new Landlord(email, password, firstName, lastName, userID);
            cachedLandlords.add(l);
        }
        else if (userType.equalsIgnoreCase("manager")) {
            Manager m = new Manager(email, password, firstName, lastName, userID);
            cachedManagers.add(m);
        }

        return true;
    }

}
