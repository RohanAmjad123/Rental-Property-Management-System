package datasource.companydatabase;

import business.businesslogic.*;
import business.usermodels.*;
import java.sql.*;
import java.util.*;

/**
 * Class CompanyDatabase
 * 
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

    public CompanyDatabase(String databaseName, String dburl, String username, String password) {
        this.DATABASENAME = databaseName;
        this.DBURL = dburl;
        this.USERNAME = username;
        this.PASSWORD = password;

        try {
            initializeConnection();
        } catch (SQLException e) {
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

    public boolean validSignup(User u) {
        String sqlInsert = "INSERT INTO users VALUES (?, ?, ?, ?, ?)";

        try {
            PreparedStatement stmt = dbConnect.prepareStatement(sqlInsert, Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, u.getEmail());
            stmt.setString(2, u.getPassword());
            stmt.setString(3, u.getFirstName());
            stmt.setString(4, u.getLastName());
            stmt.setString(5, u.getUserType());

            int affectedRows = stmt.executeUpdate();
            if (affectedRows == 0) {
                throw new SQLException("Could not create user!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }

    public User login(String email, String password, String userType) {
        String sqlCheck = "SELECT * FROM users WHERE email=(?) AND password=(?) AND user_type=(?)";
        User u = new User();

        try {
            PreparedStatement checkStmt = dbConnect.prepareStatement(sqlCheck);
            checkStmt.setString(1, email);
            checkStmt.setString(2, password);
            checkStmt.setString(3, userType);
            ResultSet rs = checkStmt.executeQuery();

            if (!rs.isBeforeFirst()) {
                throw new SQLException("User not found!");
            }

            rs.next();

            u.setEmail(rs.getString("email"));
            u.setPassword(rs.getString("password"));
            u.setFirstName(rs.getString("first_name"));
            u.setLastName(rs.getString("last_name"));
            u.setUserType(rs.getString("user_type"));

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return u;
    }

    public boolean registerProperty(Property p) {
        String sqlInsert = "INSERT INTO properties VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement stmt = dbConnect.prepareStatement(sqlInsert);
            stmt.setString(1, p.getTitle());
            stmt.setString(2, p.getDescription());
            stmt.setString(3, p.getPropertyType());
            stmt.setInt(4, p.getRent());
            stmt.setInt(5, p.getBedrooms());
            stmt.setInt(6, p.getBathrooms());
            stmt.setInt(7, p.getSquareFeet());
            stmt.setString(8, p.getFurnished());
            stmt.setString(9, p.getLandlordID());
            stmt.setString(10, p.getState());
            stmt.setString(11, p.getFeeExpiry().getDateFormatted());
            stmt.setInt(12, p.getFeeAmount());
            stmt.setString(13, p.getListingDate().getDateFormatted());
            stmt.setString(14, p.getAddress().getStreetName());
            stmt.setString(15, p.getAddress().getPostalCode());
            stmt.setString(16, p.getAddress().getCityQuadrant());
            stmt.setString(17, p.getAddress().getCity());
            stmt.setString(18, p.getAddress().getStateProvince());
            stmt.setString(19, p.getAddress().getCountry());

            int affectedRows = stmt.executeUpdate();
            if (affectedRows == 0) {
                throw new SQLException("Could not register property!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean updateProperty(Property p) {
        String sqlUpdate = "UPDATE properties SET " + 
        "title=(?), " + 
        "description=(?), " + 
        "property_type=(?), " + 
        "rent=(?), " + 
        "bedrooms=(?), " + 
        "bathrooms=(?), " + 
        "square_feet=(?), " + 
        "furnished=(?), " + 
        "landlord_id=(?), " + 
        "state=(?), " + 
        "fee_expiry=(?), " + 
        "fee_amount=(?), " + 
        "listing_date=(?), " + 
        "street_name=(?), " + 
        "postal_code=(?), " + 
        "city_quadrant=(?), " + 
        "city=(?), " + 
        "state_province=(?), " + 
        "country=(?) " + 
        "WHERE postal_code=(?)";

        try {
            PreparedStatement stmt = dbConnect.prepareStatement(sqlUpdate);
            stmt.setString(1, p.getTitle());
            stmt.setString(2, p.getDescription());
            stmt.setString(3, p.getPropertyType());
            stmt.setInt(4, p.getRent());
            stmt.setInt(5, p.getBedrooms());
            stmt.setInt(6, p.getBathrooms());
            stmt.setInt(7, p.getSquareFeet());
            stmt.setString(8, p.getFurnished());
            stmt.setString(9, p.getLandlordID());
            stmt.setString(10, p.getState());
            stmt.setString(11, "");
            stmt.setInt(12, 0);
            stmt.setString(13, p.getListingDate().getDateFormatted());
            stmt.setString(14, p.getAddress().getStreetName());
            stmt.setString(15, p.getAddress().getPostalCode());
            stmt.setString(16, p.getAddress().getCityQuadrant());
            stmt.setString(17, p.getAddress().getCity());
            stmt.setString(18, p.getAddress().getStateProvince());
            stmt.setString(19, p.getAddress().getCountry());
            stmt.setString(20, p.getAddress().getPostalCode());

            int affectedRows = stmt.executeUpdate();
            if (affectedRows == 0) {
                throw new SQLException("Could not update property!");
            }

        }
        catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean deleteProperty(String postalCode) {
        String sqlDelete = "DELETE FROM properties WHERE postal_code=(?)";

        try {
            PreparedStatement stmt = dbConnect.prepareStatement(sqlDelete);
            stmt.setString(1, postalCode);
            
            int affectedRows = stmt.executeUpdate();
            if (affectedRows == 0) {
                throw new SQLException("Could not delete property!");
            }

        }
        catch(SQLException e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }

    public ArrayList<Property> getProperties(String landlordID) {
        ArrayList<Property> properties = new ArrayList<Property>();
        String sql = "SELECT * FROM properties WHERE landlord_id=(?)";

        try {
            PreparedStatement stmt = dbConnect.prepareStatement(sql);
            stmt.setString(1, landlordID);

            ResultSet rs = stmt.executeQuery(sql);

            while(rs.next()) {
                String[] feeExp = rs.getString("fee_expiru").split("-");
                String[] listDate = rs.getString("listing_date").split("-");
                DateModel feeExpiry = new DateModel(feeExp[0], feeExp[1], feeExp[2]);
                DateModel listingDate = new DateModel(listDate[0], listDate[1], listDate[2]);
                Address address = new Address(rs.getString("street_name"), rs.getString("postal_code"), rs.getString("city_quadrant"), rs.getString("city"), rs.getString("state_province"), rs.getString("country"));

                properties.add(new Property(rs.getString("title"), rs.getString("description"), rs.getString("property_type"), rs.getInt("rent"), rs.getInt("bedrooms"), rs.getInt("bathrooms"), rs.getInt("square_feet"), rs.getString("furnished"), rs.getString("landlord_id"), rs.getString("state"), feeExpiry, rs.getInt("fee_amount"), listingDate, address));
            }
        }
        catch(SQLException e) {
            e.printStackTrace();
            return properties;
        }
        return properties;
    }

    public ArrayList<Property> getAllProperties() {
        ArrayList<Property> properties = new ArrayList<Property>();
        String sql = "SELECT * FROM properties";

        try {
            Statement stmt = dbConnect.createStatement();

            ResultSet rs = stmt.executeQuery(sql);

            while(rs.next()) {
                String[] feeExp = rs.getString("fee_expiru").split("-");
                String[] listDate = rs.getString("listing_date").split("-");
                DateModel feeExpiry = new DateModel(feeExp[0], feeExp[1], feeExp[2]);
                DateModel listingDate = new DateModel(listDate[0], listDate[1], listDate[2]);
                Address address = new Address(rs.getString("street_name"), rs.getString("postal_code"), rs.getString("city_quadrant"), rs.getString("city"), rs.getString("state_province"), rs.getString("country"));

                properties.add(new Property(rs.getString("title"), rs.getString("description"), rs.getString("property_type"), rs.getInt("rent"), rs.getInt("bedrooms"), rs.getInt("bathrooms"), rs.getInt("square_feet"), rs.getString("furnished"), rs.getString("landlord_id"), rs.getString("state"), feeExpiry, rs.getInt("fee_amount"), listingDate, address));
            }
        }
        catch(SQLException e) {
            e.printStackTrace();
            return properties;
        }
        return properties;
    }

    public ArrayList<Property> getStateProperties(String state) {
        ArrayList<Property> properties = new ArrayList<Property>();
        String sql = "SELECT * FROM properties WHERE state=(?)";

        try {
            PreparedStatement stmt = dbConnect.prepareStatement(sql);
            stmt.setString(1, state);

            ResultSet rs = stmt.executeQuery(sql);

            while(rs.next()) {
                String[] feeExp = rs.getString("fee_expiru").split("-");
                String[] listDate = rs.getString("listing_date").split("-");
                DateModel feeExpiry = new DateModel(feeExp[0], feeExp[1], feeExp[2]);
                DateModel listingDate = new DateModel(listDate[0], listDate[1], listDate[2]);
                Address address = new Address(rs.getString("street_name"), rs.getString("postal_code"), rs.getString("city_quadrant"), rs.getString("city"), rs.getString("state_province"), rs.getString("country"));

                properties.add(new Property(rs.getString("title"), rs.getString("description"), rs.getString("property_type"), rs.getInt("rent"), rs.getInt("bedrooms"), rs.getInt("bathrooms"), rs.getInt("square_feet"), rs.getString("furnished"), rs.getString("landlord_id"), rs.getString("state"), feeExpiry, rs.getInt("fee_amount"), listingDate, address));
            }
        }
        catch(SQLException e) {
            e.printStackTrace();
            return properties;
        }
        return properties;
    }

    public ArrayList<User> getAllUsers() {
        ArrayList<User> users = new ArrayList<User>();
        String sql = "SELECT * FROM users";

        try {
            Statement stmt = dbConnect.createStatement();

            ResultSet rs = stmt.executeQuery(sql);

            while(rs.next()) {
                users.add(new User(rs.getString("email"), rs.getString("password"), rs.getString("first_name"), rs.getString("last_name"), rs.getString("user_type")));
            }
        }
        catch(SQLException e) {
            e.printStackTrace();
            return users;
        }
        return users;
    }

    public ArrayList<User> getSpecificUsers(String user_type) {
        ArrayList<User> users = new ArrayList<User>();
        String sql = "SELECT * FROM users WHERE user_type=(?)";

        try {
            PreparedStatement stmt = dbConnect.prepareStatement(sql);
            stmt.setString(1, user_type);

            ResultSet rs = stmt.executeQuery();

            while(rs.next()) {
                users.add(new User(rs.getString("email"), rs.getString("password"), rs.getString("first_name"), rs.getString("last_name"), rs.getString("user_type")));
            }
        }
        catch(SQLException e) {
            e.printStackTrace();
            return users;
        }
        return users;
    }

    public Property getProperty(String postalCode) {
        Property p = new Property();
        String sql = "SELECT * FROM properties WHERE postal_code=(?)";

        try {
            PreparedStatement stmt = dbConnect.prepareStatement(sql);
            stmt.setString(1, postalCode);

            ResultSet rs = stmt.executeQuery(sql);

            while(rs.next()) {
                String[] feeExp = rs.getString("fee_expiru").split("-");
                String[] listDate = rs.getString("listing_date").split("-");
                DateModel feeExpiry = new DateModel(feeExp[0], feeExp[1], feeExp[2]);
                DateModel listingDate = new DateModel(listDate[0], listDate[1], listDate[2]);
                Address address = new Address(rs.getString("street_name"), rs.getString("postal_code"), rs.getString("city_quadrant"), rs.getString("city"), rs.getString("state_province"), rs.getString("country"));

                p.setTitle(rs.getString("title"));
                p.setDescription(rs.getString("description"));
                p.setPropertyType(rs.getString("property_type")); 
                p.setRent(rs.getInt("rent"));
                p.setBedrooms(rs.getInt("bedrooms"));
                p.setBathrooms(rs.getInt("bathrooms")); 
                p.setSquareFeet(rs.getInt("square_feet")); 
                p.setFurnished(rs.getString("furnished"));
                p.setLandlordID(rs.getString("landlord_id"));
                p.setState(rs.getString("state")); 
                p.setFeeExpiry(feeExpiry);
                p.setFeeAmount(rs.getInt("fee_amount")); 
                p.setListingDate(listingDate);
                p.setAddress(address);
            }
        }
        catch(SQLException e) {
            e.printStackTrace();
            return p;
        }
        return p;
    }

    public boolean setFee(Fee fee) {
        String sql = "UPDATE fees SET fee_period=(?), fee_amount=(?) WHERE fee_id=(?)";
        
        int feeID = 1; 

        try {
            PreparedStatement stmt = dbConnect.prepareStatement(sql);
            stmt.setInt(1, fee.getFeePeriod());
            stmt.setInt(2, fee.getFeeAmount());
            stmt.setInt(3, feeID);

            int affectedRows = stmt.executeUpdate();
            if (affectedRows == 0) {
                throw new SQLException("Failed to update fee!");
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public Fee getFee() {
        String sql = "SELECT * FROM fees";
        Fee f = new Fee();

        try {
            Statement stmt = dbConnect.createStatement();

            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                f.setFeeAmound(rs.getInt("fee_amount"));
                f.setFeePeriod(rs.getInt("fee_period"));
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
            return f;
        }
        return f;
    }

    public void subscribe(SearchCriteria s) {}

    public void unsubscribe(String renterID) {}

    public SearchCriteria getSubscription(String renterID) {}

    public void updateSearchCriteria(SearchCriteria criteria) {}

}
