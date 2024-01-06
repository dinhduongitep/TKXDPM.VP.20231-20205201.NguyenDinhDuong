package com.hust.itep.aims.entity.media;

import java.util.Date;

public class CdAndLp extends Media {

   private String artists;
   private String recordLabel;
   private String trackList;
   private Date releaseDate;
   private String musicType;

   public CdAndLp(Integer id, String category, int price, int value, String title, String description, int quantity, Date importDate, Boolean rushOrderSupport, String barcode, String productDimension, String imageUrl, String artists, String recordLabel, String trackList, Date releaseDate, String musicType) {
       super(id, category, price, value, title, description, quantity, importDate, rushOrderSupport, barcode, productDimension, imageUrl);
       this.artists = artists;
       this.recordLabel = recordLabel;
       this.trackList = trackList;
       this.releaseDate = releaseDate;
       this.musicType = musicType;
   }

   public CdAndLp() {
       super();
   }

   public String getArtists() {
       return artists;
   }

   public void setArtists(String artists) {
       this.artists = artists;
   }

   public String getRecordLabel() {
       return recordLabel;
   }

   public void setRecordLabel(String recordLabel) {
       this.recordLabel = recordLabel;
   }

   public String getTrackList() {
       return trackList;
   }

   public void setTrackList(String trackList) {
       this.trackList = trackList;
   }

   public Date getReleaseDate() {
       return releaseDate;
   }

   public void setReleaseDate(Date releaseDate) {
       this.releaseDate = releaseDate;
   }

   public String getMusicType() {
       return musicType;
   }

   public void setMusicType(String musicType) {
       this.musicType = musicType;
   }
}
