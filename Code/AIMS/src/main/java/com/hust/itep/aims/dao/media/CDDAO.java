package com.hust.itep.aims.dao.media;

import com.hust.itep.aims.database.ConnectJDBC;
import com.hust.itep.aims.entity.media.CdAndLp;
import com.hust.itep.aims.entity.media.Media;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

/**
 * @author
 */
public class CDDAO extends MediaDAO {

    @Override
    public Media getMediaById(int id) throws SQLException {
        String sql = "SELECT * FROM "+
                "cd_and_lp as CD " +
                "INNER JOIN Media " +
                "ON Media.id = CD.id " +
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

            // from CD table
            String artists = res.getString("artists");
            String recordLabel = res.getString("recordLabel");
            String trackList = res.getString("trackList");
            Date releasedDate = res.getDate("releasedDate");
            String musicType = res.getString("musicType");

            return new CdAndLp(id, category, price, value, title, description, quantity, importDate, rushOrderSupport, barcode, productDimension, imageUrl,
                    artists, recordLabel, trackList, releasedDate, musicType);
        } else {
            throw new SQLException();
        }
    }
}
