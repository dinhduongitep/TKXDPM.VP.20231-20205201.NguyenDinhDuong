package com.hust.itep.aims.entity.media;

import java.math.BigInteger;
import java.util.Date;

public class CdAndLp extends Media {

    private String artists;
    private String recordLabel;
    private String trackList;
    private Date publicationDate;
    private String musicType;

    public CdAndLp(BigInteger id, String category, int price, int value, String title, String description, int quantity, Date importDate, Boolean rushOrderSupport, String type, String artists, String recordLabel, String trackList, Date publicationDate, String musicType) {
        super(id, category, price, value, title, description, quantity, importDate, rushOrderSupport, type);
        this.artists = artists;
        this.recordLabel = recordLabel;
        this.trackList = trackList;
        this.publicationDate = publicationDate;
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

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getMusicType() {
        return musicType;
    }

    public void setMusicType(String musicType) {
        this.musicType = musicType;
    }
}
