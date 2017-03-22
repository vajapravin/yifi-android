/**
 * (c) 2017 Vajapravin.com
 * All rights reserved
 *
 * Please see the accompanying LICENSE file for licensing information
 */

package com.vajapravin.yifi.data;

import org.json.JSONObject;

/**
 * Data representation of the Movie object
 * @author vajapravin
 *
 */

public class Torrent {

    public Torrent(JSONObject torrentJSON){
        url = torrentJSON.optString("url");
        hash = torrentJSON.optString("hash");
        quality = torrentJSON.optString("quality");
        seeds = torrentJSON.optInt("seeds");
        peers = torrentJSON.optInt("peers");
        size = torrentJSON.optString("size");
        size_bytes = torrentJSON.optString("size_bytes");
        date_uploaded = torrentJSON.optString("date_uploaded");
        date_uploaded_unix = torrentJSON.optString("date_uploaded_unix");
    }

    /**
     * Torrent url
     */
    private String url;

    /**
     * Return Torrent Url
     * @return url
     */
    public String geturl(){
        return url;
    }

    /**
     * Set Torrent Url
     * @param url
     */
    public void seturl(String url){
        this.url = url;
    }

    /**
     * Torrent hash
     */
    private String hash;

    /**
     * Return Torrent hash
     * @return hash
     */
    public String getHash(){
        return hash;
    }

    /**
     * Set Torrent hash
     * @param hash
     */
    public void setHash(String hash){
        this.hash = hash;
    }

    /**
     * Torrent Quality
     */
    private String quality;

    /**
     * Return Torrent Quality
     * @return quality
     */
    public String getQuality(){
        return quality;
    }

    /**
     * Set Torrent Quality
     * @param quality
     */
    public void setQuality(String quality){
        this.quality = quality;
    }

    /**
     * Torrent Seeds
     */
    private Integer seeds;

    /**
     * Return Torrent Seeds
     * @return seeds
     */
    public Integer getSeeds(){
        return seeds;
    }

    /**
     * Set Torrent Seeds
     * @param seeds
     */
    public void setSeeds(Integer seeds){
        this.seeds = seeds;
    }

    /**
     * Torrent Peers
     */
    private Integer peers;

    /**
     * Return Torrent Peers
     * @return peers
     */
    public Integer getPeers(){
        return peers;
    }

    /**
     * Set Torrent Peers
     * @param peers
     */
    public void setPeers(Integer peers){
        this.peers = peers;
    }

    /**
     * Torrent Size
     */
    private String size;

    /**
     * Return Torrent Size
     * @return size
     */
    public String getSize(){
        return size;
    }

    /**
     * Set Torrent Size
     * @param size
     */
    public void setSize(String size){
        this.size = size;
    }

    /**
     * Torrent Size in Bytes
     */
    private String size_bytes;

    /**
     * Return Torrent Size in Bytes
     * @return size_bytes
     */
    public String getSizeBytes(){
        return size_bytes;
    }

    /**
     * Set Torrent Size in Bytes
     * @param size_bytes
     */
    public void setSizeBytes(String size_bytes){
        this.size_bytes = size_bytes;
    }

    /**
     * Torrent date_uploaded
     */
    private String date_uploaded;

    /**
     * Return Torrent date_uploaded
     * @return date_uploaded
     */
    public String getDateUploaded(){
        return date_uploaded;
    }

    /**
     * Set Torrent date_uploaded
     * @param date_uploaded
     */
    public void setDateUploaded(String date_uploaded){
        this.date_uploaded = date_uploaded;
    }

    /**
     * Torrent date_uploaded_unix
     */
    private String date_uploaded_unix;

    /**
     * Return Torrent date_uploaded_unix
     * @return date_uploaded_unix
     */
    public String getDateUploadedUnix(){
        return date_uploaded_unix;
    }

    /**
     * Set Torrent date_uploaded_unix
     * @param date_uploaded_unix
     */
    public void setDateUploadedUnix(String date_uploaded_unix){
        this.date_uploaded_unix = date_uploaded_unix;
    }

}
