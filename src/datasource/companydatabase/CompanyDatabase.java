package datasource.companydatabase;

import business.businesslogic.*;
import business.usermodels.*;
import java.sql.*;
import java.util.*;
import java.io.*;

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
    private final String DBURL;
    private final String USERNAME;
    private final String PASSWORD;
    private Connection dbConnect;

    /**
     * 
     * @param dburl
     * @param username
     * @param password
     */
    public CompanyDatabase(String dburl, String username, String password) {
        this.DBURL = dburl;
        this.USERNAME = username;
        this.PASSWORD = password;

        try {
            initializeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * 
     */
    public void initializeConnection() throws SQLException {
        try {
            this.dbConnect = DriverManager.getConnection(DBURL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
            System.exit(0);
        }
    }

    /**
     * 
     * @param u
     * @return
     * @throws SQLException
     */
    public boolean validSignup(User u) throws SQLException {
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
            throw new SQLException("Signup failed!");
        }

        return true;
    }

    /**
     * 
     * @param email
     * @param password
     * @param userType
     * @return
     * @throws SQLException
     */
    public User login(String email, String password, String userType) throws SQLException {
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
            throw new SQLException("Login failed!");
        }

        return u;
    }

    /**
     * 
     * @param p
     * @return
     * @throws SQLException
     */
    public boolean registerProperty(Property p) throws SQLException {
        String sqlInsert = "INSERT INTO properties VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

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
            stmt.setString(20, p.getRentalDate().getDateFormatted());

            int affectedRows = stmt.executeUpdate();
            if (affectedRows == 0) {
                throw new SQLException("Could not register property!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
            throw new SQLException("Property registration failed!");
        }
        return true;
    }

    /**
     * 
     * @param p
     * @return
     * @throws SQLException
     */
    public boolean updateProperty(Property p) throws SQLException {
        String sqlUpdate = "UPDATE properties SET " +
                "title=?, " +
                "description=?, " +
                "property_type=?, " +
                "rent=?, " +
                "bedrooms=?, " +
                "bathrooms=?, " +
                "square_feet=?, " +
                "furnished=?, " +
                "landlord_id=?, " +
                "state=?, " +
                "fee_expiry=?, " +
                "fee_amount=?, " +
                "listing_date=?, " +
                "street_name=?, " +
                "postal_code=?, " +
                "city_quadrant=?, " +
                "city=?, " +
                "state_province=?, " +
                "country=?, " +
                "rental_date=?" +
                "WHERE postal_code=?";

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
            stmt.setString(21, p.getRentalDate().getDateFormatted());

            int affectedRows = stmt.executeUpdate();
            if (affectedRows == 0) {
                throw new SQLException("Could not update property!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
            throw new SQLException("Property update failed!");
        }
        return true;
    }

    /**
     * 
     * @param postalCode
     * @return
     * @throws SQLException
     */
    public boolean deleteProperty(String postalCode) throws SQLException {
        String sqlDelete = "DELETE FROM properties WHERE postal_code=(?)";

        try {
            PreparedStatement stmt = dbConnect.prepareStatement(sqlDelete);
            stmt.setString(1, postalCode);

            int affectedRows = stmt.executeUpdate();
            if (affectedRows == 0) {
                throw new SQLException("Could not delete property!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
            throw new SQLException("Property delete failed!");
        }

        return true;
    }

    /**
     * 
     * @param landlordID
     * @return
     * @throws SQLException
     */
    public ArrayList<Property> getProperties(String landlordID) throws SQLException {
        ArrayList<Property> properties = new ArrayList<Property>();
        String sql = "SELECT * FROM properties WHERE landlord_id=?";

        try {
            PreparedStatement stmt = dbConnect.prepareStatement(sql);
            stmt.setString(1, landlordID);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                String[] feeExp = rs.getString("fee_expiry").split("-");
                String[] listDate = rs.getString("listing_date").split("-");
                String[] rental = rs.getString("rental_date").split("-");
                DateModel feeExpiry = new DateModel(feeExp[0], feeExp[1], feeExp[2]);
                DateModel listingDate = new DateModel(listDate[0], listDate[1], listDate[2]);
                DateModel rentalDate = new DateModel(rental[0], rental[1], rental[2]);

                Address address = new Address(rs.getString("street_name"), rs.getString("postal_code"),
                        rs.getString("city_quadrant"), rs.getString("city"), rs.getString("state_province"),
                        rs.getString("country"));

                properties.add(new Property(rs.getString("title"), rs.getString("description"),
                        rs.getString("property_type"), rs.getInt("rent"), rs.getInt("bedrooms"), rs.getInt("bathrooms"),
                        rs.getInt("square_feet"), rs.getString("furnished"), rs.getString("landlord_id"),
                        rs.getString("state"), feeExpiry, rs.getInt("fee_amount"), listingDate, address, rentalDate));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new SQLException("Could not get properties!");
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            throw new SQLException("Illegal arguments for Address!");
        }

        return properties;
    }

    /**
     * 
     * @return
     * @throws SQLException
     */
    public ArrayList<Property> getAllProperties() throws SQLException {
        ArrayList<Property> properties = new ArrayList<Property>();
        String sql = "SELECT * FROM properties";

        try {
            Statement stmt = dbConnect.createStatement();

            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                String[] feeExp = rs.getString("fee_expiry").split("-");
                String[] listDate = rs.getString("listing_date").split("-");
                String[] rental = rs.getString("rental_date").split("-");
                DateModel feeExpiry = new DateModel(feeExp[0], feeExp[1], feeExp[2]);
                DateModel listingDate = new DateModel(listDate[0], listDate[1], listDate[2]);
                DateModel rentalDate = new DateModel(rental[0], rental[1], rental[2]);

                Address address = new Address(rs.getString("street_name"), rs.getString("postal_code"),
                        rs.getString("city_quadrant"), rs.getString("city"), rs.getString("state_province"),
                        rs.getString("country"));

                properties.add(new Property(rs.getString("title"), rs.getString("description"),
                        rs.getString("property_type"), rs.getInt("rent"), rs.getInt("bedrooms"), rs.getInt("bathrooms"),
                        rs.getInt("square_feet"), rs.getString("furnished"), rs.getString("landlord_id"),
                        rs.getString("state"), feeExpiry, rs.getInt("fee_amount"), listingDate, address, rentalDate));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new SQLException("Could not get properties!");
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            throw new SQLException("Illegal arguments for Address!");
        }

        return properties;
    }

    /**
     * 
     * @param state
     * @return
     * @throws SQLException
     */
    public ArrayList<Property> getStateProperties(String state) throws SQLException {
        ArrayList<Property> properties = new ArrayList<Property>();
        String sql = "SELECT * FROM properties WHERE state=?";

        try {
            PreparedStatement stmt = dbConnect.prepareStatement(sql);
            stmt.setString(1, state);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                String[] feeExp = rs.getString("fee_expiry").split("-");
                String[] listDate = rs.getString("listing_date").split("-");
                String[] rental = rs.getString("rental_date").split("-");
                if (rs.wasNull()) rental = new String[]{"0000", "00", "00"};
                DateModel feeExpiry = new DateModel(feeExp[0], feeExp[1], feeExp[2]);
                DateModel listingDate = new DateModel(listDate[0], listDate[1], listDate[2]);
                DateModel rentalDate = new DateModel(rental[0], rental[1], rental[2]);

                Address address = new Address(rs.getString("street_name"), rs.getString("postal_code"),
                        rs.getString("city_quadrant"), rs.getString("city"), rs.getString("state_province"),
                        rs.getString("country"));

                properties.add(new Property(rs.getString("title"), rs.getString("description"),
                        rs.getString("property_type"), rs.getInt("rent"), rs.getInt("bedrooms"), rs.getInt("bathrooms"),
                        rs.getInt("square_feet"), rs.getString("furnished"), rs.getString("landlord_id"),
                        rs.getString("state"), feeExpiry, rs.getInt("fee_amount"), listingDate, address, rentalDate));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new SQLException("Could not get properties!");
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            throw new SQLException("Illegal arguments for Address!");
        }

        return properties;
    }

    /**
     * 
     * @param criteria
     * @return
     * @throws SQLException
     */
    public ArrayList<Property> getSearchProperties(SearchCriteria criteria) throws SQLException {
        ArrayList<Property> properties = new ArrayList<Property>();
        String sql = "SELECT * FROM properties WHERE property_type=? AND bedrooms >=? AND bathrooms>=? AND furnished=? AND rent<=? AND city_quadrant=?";

        try {
            PreparedStatement stmt = dbConnect.prepareStatement(sql);
            stmt.setString(1, criteria.getPropertyType());
            stmt.setInt(2, criteria.getBedrooms());
            stmt.setInt(3, criteria.getBathrooms());
            stmt.setString(4, criteria.getFurnished());
            stmt.setInt(5, criteria.getMaxRent());
            stmt.setString(6, criteria.getCityQuadrant());

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                String[] feeExp = rs.getString("fee_expiry").split("-");
                String[] listDate = rs.getString("listing_date").split("-");
                String[] rental = rs.getString("rental_date").split("-");
                DateModel feeExpiry = new DateModel(feeExp[0], feeExp[1], feeExp[2]);
                DateModel listingDate = new DateModel(listDate[0], listDate[1], listDate[2]);
                DateModel rentalDate = new DateModel(rental[0], rental[1], rental[2]);

                Address address = new Address(rs.getString("street_name"), rs.getString("postal_code"),
                        rs.getString("city_quadrant"), rs.getString("city"), rs.getString("state_province"),
                        rs.getString("country"));

                properties.add(new Property(rs.getString("title"), rs.getString("description"),
                        rs.getString("property_type"), rs.getInt("rent"), rs.getInt("bedrooms"), rs.getInt("bathrooms"),
                        rs.getInt("square_feet"), rs.getString("furnished"), rs.getString("landlord_id"),
                        rs.getString("state"), feeExpiry, rs.getInt("fee_amount"), listingDate, address, rentalDate));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new SQLException("Could not get properties!");
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            throw new SQLException("Illegal arguments for Address!");
        }

        return properties;
    }

    /**
     * 
     * @return
     * @throws SQLException
     */
    public ArrayList<User> getAllUsers() throws SQLException {
        ArrayList<User> users = new ArrayList<User>();
        String sql = "SELECT * FROM users";

        try {
            Statement stmt = dbConnect.createStatement();

            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                users.add(new User(rs.getString("email"), rs.getString("password"), rs.getString("first_name"),
                        rs.getString("last_name"), rs.getString("user_type")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new SQLException("Could not get users!");
        }
        return users;
    }

    /**
     * 
     * @param user_type
     * @return
     * @throws SQLException
     */
    public ArrayList<User> getSpecificUsers(String user_type) throws SQLException {
        ArrayList<User> users = new ArrayList<User>();
        String sql = "SELECT * FROM users WHERE user_type=?";

        try {
            PreparedStatement stmt = dbConnect.prepareStatement(sql);
            stmt.setString(1, user_type);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                users.add(new User(rs.getString("email"), rs.getString("password"), rs.getString("first_name"),
                        rs.getString("last_name"), rs.getString("user_type")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new SQLException("Could not get users!");
        }
        return users;
    }

    /**
     * 
     * @param postalCode
     * @return
     * @throws SQLException
     */
    public Property getProperty(String postalCode) throws SQLException {
        Property p = new Property();
        String sql = "SELECT * FROM properties WHERE postal_code=?";

        try {
            PreparedStatement stmt = dbConnect.prepareStatement(sql);
            stmt.setString(1, postalCode);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                String[] feeExp = rs.getString("fee_expiru").split("-");
                String[] listDate = rs.getString("listing_date").split("-");
                String[] rental = rs.getString("rental_date").split("-");

                DateModel feeExpiry = new DateModel(feeExp[0], feeExp[1], feeExp[2]);
                DateModel listingDate = new DateModel(listDate[0], listDate[1], listDate[2]);
                DateModel rentalDate = new DateModel(rental[0], rental[1], rental[2]);

                Address address = new Address(rs.getString("street_name"), rs.getString("postal_code"),
                        rs.getString("city_quadrant"), rs.getString("city"), rs.getString("state_province"),
                        rs.getString("country"));

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
                p.setRentalDate(rentalDate);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new SQLException("Could not get property!");
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            throw new SQLException("Illegal arguments for Address!");
        }
        return p;
    }

    /**
     * 
     * @param fee
     * @return
     * @throws SQLException
     */
    public boolean setFee(Fee fee) throws SQLException {
        String sql = "UPDATE fees SET fee_period=?, fee_amount=? WHERE fee_id=?";

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
        } catch (SQLException e) {
            e.printStackTrace();
            throw new SQLException("Set fee failed!");
        }
        return true;
    }

    /**
     * 
     * @return
     * @throws SQLException
     */
    public Fee getFee() throws SQLException {
        String sql = "SELECT * FROM fees";
        Fee f = new Fee();

        try {
            Statement stmt = dbConnect.createStatement();

            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                f.setFeeAmound(rs.getInt("fee_amount"));
                f.setFeePeriod(rs.getInt("fee_period"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new SQLException("Could not get fee!");
        }
        return f;
    }

    /**
     * 
     * @param criteria
     * @return
     * @throws SQLException
     */
    public boolean subscribe(SearchCriteria criteria) throws SQLException {
        String sql = "INSERT INTO subscriptions VALUES (?, ?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement stmt = dbConnect.prepareStatement(sql);
            stmt.setString(1, criteria.getRenterID());
            stmt.setString(2, criteria.getPropertyType());
            stmt.setInt(3, criteria.getBedrooms());
            stmt.setInt(4, criteria.getBathrooms());
            stmt.setInt(5, criteria.getMaxRent());
            stmt.setString(6, criteria.getCityQuadrant());
            stmt.setString(7, criteria.getFurnished());

            int affectedRows = stmt.executeUpdate();
            if (affectedRows == 0) {
                throw new SQLException("Unable to subscribe to criteria!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new SQLException("Subscribe failed!");
        }
        return true;
    }

    /**
     * 
     * @param renterID
     * @return
     * @throws SQLException
     */
    public boolean unsubscribe(String renterID) throws SQLException {
        String sql = "DELETE FROM subscriptions WHERE renter_id=?";

        try {
            PreparedStatement stmt = dbConnect.prepareStatement(sql);
            stmt.setString(1, renterID);

            int affectedRows = stmt.executeUpdate();
            if (affectedRows == 0) {
                throw new SQLException("Unable to unsubscribe from criteria!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new SQLException("Unsubscribe failed!");
        }
        return true;
    }

    /**
     * 
     * @param renterID
     * @return
     * @throws SQLException
     */
    public SearchCriteria getSubscription(String renterID) throws SQLException {
        String sql = "SELECT * FROM subscriptions WHERE renter_id=?";
        SearchCriteria s = new SearchCriteria();

        try {
            PreparedStatement stmt = dbConnect.prepareStatement(sql);
            stmt.setString(1, renterID);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                s.setRenterID(rs.getString("renter_id"));
                s.setPropertyType(rs.getString("property_type"));
                s.setBedrooms(rs.getInt("bedrooms"));
                s.setBathrooms(rs.getInt("bathrooms"));
                s.setMaxRent(rs.getInt("max_rent"));
                s.setCityQuadrant(rs.getString("city_quadrant"));
                s.setFurnished(rs.getString("furnished"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new SQLException("Could not get subscription!");
        }
        return s;
    }

    /**
     * 
     * @param criteria
     * @return
     * @throws SQLException
     */
    public boolean updateSearchCriteria(SearchCriteria criteria) throws SQLException {
        String sql = "UPDATE subscriptions SET property_type=?, bedrooms=?, bathrooms=?, max_rent=?, city_quadrant=?, furnished=? WHERE renter_id=?";

        try {
            PreparedStatement stmt = dbConnect.prepareStatement(sql);
            stmt.setString(1, criteria.getPropertyType());
            stmt.setInt(2, criteria.getBedrooms());
            stmt.setInt(3, criteria.getBathrooms());
            stmt.setInt(4, criteria.getMaxRent());
            stmt.setString(5, criteria.getCityQuadrant());
            stmt.setString(6, criteria.getFurnished());
            stmt.setString(7, criteria.getRenterID());

            int affectedRows = stmt.executeUpdate();
            if (affectedRows == 0) {
                throw new SQLException("Failed to update subscription!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new SQLException("Update subscription failed!");
        }
        return true;
    }

    /**
     * 
     * @return
     * @throws SQLException
     */
    public ArrayList<String> getManagerKeys() throws SQLException {
        String sql = "SELECT * FROM manager_keys";
        ArrayList<String> managerKeys = new ArrayList<String>();

        try {
            Statement stmt = dbConnect.createStatement();

            ResultSet rs = stmt.executeQuery(sql);

            if (!rs.isBeforeFirst()) {
                throw new SQLException("Could not get manager keys!");
            }

            while (rs.next()) {
                managerKeys.add(rs.getString(1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new SQLException("Could not get manager keys!");
        }

        return managerKeys;
    }

    /**
     * 
     * @param start
     * @param end
     * @return
     */
    public boolean getPeriodicalSummary(DateModel start, DateModel end) throws SQLException {
        String startDate = start.getDateFormatted();
        String endDate = end.getDateFormatted();
        int numberOfPropertiesListedInPeriod;
        int numberOfPropertiesRentedInPeriod;
        int numberOfActiveListings;
        ArrayList<Property> listOfPropertiesRentedInPeriod = new ArrayList<Property>();
        ArrayList<String> landlordNames = new ArrayList<String>();

        String sql1 = "SELECT COUNT(*) FROM properties WHERE listing_date >=? AND listing_date <=?";
        String sql2 = "SELECT COUNT(*) FROM properties WHERE rental_date >=? AND rental_date <=? AND state=?";
        String sql3 = "SELECT COUNT(*) FROM properties WHERE state=?";
        String sql4 = "SELECT * FROM properties INNER JOIN users ON properties.landlord_id = users.email WHERE rental_date >=? AND rental_date <=? AND users.user_type=? AND state=?";

        try {
            PreparedStatement stmt1 = dbConnect.prepareStatement(sql1);
            stmt1.setString(1, startDate);
            stmt1.setString(2, endDate);
            PreparedStatement stmt2 = dbConnect.prepareStatement(sql2);
            stmt2.setString(1, startDate);
            stmt2.setString(2, endDate);
            stmt2.setString(3, "rented");
            PreparedStatement stmt3 = dbConnect.prepareStatement(sql3);
            stmt3.setString(1, "active");
            PreparedStatement stmt4 = dbConnect.prepareStatement(sql4);
            stmt4.setString(1, startDate);
            stmt4.setString(2, endDate);
            stmt4.setString(3, "landlord");
            stmt4.setString(4, "rented");

            ResultSet rs1 = stmt1.executeQuery();
            rs1.next();
            ResultSet rs2 = stmt2.executeQuery();
            rs2.next();
            ResultSet rs3 = stmt3.executeQuery();
            rs3.next();
            ResultSet rs4 = stmt4.executeQuery();

            while (rs4.next()) {
                String[] feeExp = rs4.getString("fee_expiry").split("-");
                String[] listDate = rs4.getString("listing_date").split("-");
                String[] rental = rs4.getString("rental_date").split("-");
                DateModel feeExpiry = new DateModel(feeExp[0], feeExp[1], feeExp[2]);
                DateModel listingDate = new DateModel(listDate[0], listDate[1], listDate[2]);
                DateModel rentalDate = new DateModel(rental[0], rental[1], rental[2]);

                Address address = new Address(rs4.getString("street_name"), rs4.getString("postal_code"),
                        rs4.getString("city_quadrant"), rs4.getString("city"), rs4.getString("state_province"),
                        rs4.getString("country"));

                listOfPropertiesRentedInPeriod.add(new Property(rs4.getString("title"), rs4.getString("description"),
                        rs4.getString("property_type"), rs4.getInt("rent"), rs4.getInt("bedrooms"), rs4.getInt("bathrooms"),
                        rs4.getInt("square_feet"), rs4.getString("furnished"), rs4.getString("landlord_id"),
                        rs4.getString("state"), feeExpiry, rs4.getInt("fee_amount"), listingDate, address, rentalDate));
                landlordNames.add(rs4.getString("first_name") + " " + rs4.getString("last_name"));
            }

            numberOfPropertiesListedInPeriod = rs1.getInt(1);
            numberOfPropertiesRentedInPeriod = rs2.getInt(1);
            numberOfActiveListings = rs3.getInt(1);
        }
        catch (SQLException e) {
            e.printStackTrace();
            throw new SQLException("Could not get summary data!");
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            throw new SQLException("Illegal arguments for Address!");
        }
        
        try {
            System.out.println("writing to file");
            FileWriter myWriter = new FileWriter("summary_report_" + startDate + "_" + endDate + ".txt");
            myWriter.write("Number of Properties listed from " + startDate + " to " + endDate + ": " + numberOfPropertiesListedInPeriod + "\n");
            myWriter.write("Number of Properties rented from " + startDate + " to " + endDate + ": " + numberOfPropertiesRentedInPeriod + "\n");
            myWriter.write("Number of Active listings: " + numberOfActiveListings + "\n");

            for (int i = 0; i < listOfPropertiesRentedInPeriod.size(); i++) {
                myWriter.write(landlordNames.get(i) + " " + listOfPropertiesRentedInPeriod.get(i).getAddress().getAddressFormatted() + "\n");
            }

            myWriter.close();

        } 
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return true;
    }
}
