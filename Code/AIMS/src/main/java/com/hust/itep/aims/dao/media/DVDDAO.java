package com.hust.itep.aims.dao.media;

import com.hust.itep.aims.database.ConnectJDBC;
import com.hust.itep.aims.entity.media.Dvd;
import com.hust.itep.aims.entity.media.Media;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

/**
 * @author
 */
public class DVDDAO extends MediaDAO {

    @Override
    public Media getMediaById(int id) throws SQLException {
        String sql = "SELECT * FROM "+
                "DVD " +
                "INNER JOIN Media " +
                "ON Media.id = DVD.id " +
                "where Media.id = " + id + ";";
        Connection conn = null;
        // Connnect to database
        conn = ConnectJDBC.getConnection();
        // Create statement
        Statement stmt = conn.createStatement();
        ResultSet res = stmt.executeQuery(sql);
        if(res.next()) {

// from media table
            String category = res.getString("category");
            int price = res.getInt("price");
            int value = res.getInt("value");
            String title = res.getString("title");
            String description = res.getString("description");
            int quantity = res.getInt("quantity");
            String barcode = res.getString("barcode");
            Date importDate = res.getDate("importDate");
            Boolean rushOrderSupport = res.getBoolean("rushOrderSupport");
            String imageUrl = res.getString("imageUrl");
            String productDimension = res.getString("productDimension");

            // from DVD table
            String dvdType = res.getString("discType");
            String director = res.getString("director");
            int runtime = res.getInt("runtime");
            String studio = res.getString("studio");
            String language = res.getString("language");
            String subtitles = res.getString("subtitle");
            Date releasedDate = res.getDate("releasedDate");
            String filmType = res.getString("filmType");

            return new Dvd(id, category, price, value, title, description, quantity, importDate, rushOrderSupport, barcode, productDimension, imageUrl,
                    dvdType, director, runtime, studio, language, subtitles, releasedDate, filmType);
        } else {
            throw new SQLException();
        }
    }
}
