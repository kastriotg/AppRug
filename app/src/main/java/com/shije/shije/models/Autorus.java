package com.shije.shije.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Autorus implements Parcelable {

    @SerializedName("ID")
    @Expose
    private Integer iD;
    @SerializedName("post_author")
    @Expose
    private String postAuthor;
    @SerializedName("post_date")
    @Expose
    private String postDate;
    @SerializedName("post_date_gmt")
    @Expose
    private String postDateGmt;
    @SerializedName("post_content")
    @Expose
    private String postContent;
    @SerializedName("post_title")
    @Expose
    private String postTitle;
    @SerializedName("post_excerpt")
    @Expose
    private String postExcerpt;
    @SerializedName("post_status")
    @Expose
    private String postStatus;
    @SerializedName("comment_status")
    @Expose
    private String commentStatus;
    @SerializedName("ping_status")
    @Expose
    private String pingStatus;
    @SerializedName("post_password")
    @Expose
    private String postPassword;
    @SerializedName("post_name")
    @Expose
    private String postName;
    @SerializedName("to_ping")
    @Expose
    private String toPing;
    @SerializedName("pinged")
    @Expose
    private String pinged;
    @SerializedName("post_modified")
    @Expose
    private String postModified;
    @SerializedName("post_modified_gmt")
    @Expose
    private String postModifiedGmt;
    @SerializedName("post_content_filtered")
    @Expose
    private String postContentFiltered;
    @SerializedName("post_parent")
    @Expose
    private Integer postParent;
    @SerializedName("guid")
    @Expose
    private String guid;
    @SerializedName("menu_order")
    @Expose
    private Integer menuOrder;
    @SerializedName("post_type")
    @Expose
    private String postType;
    @SerializedName("post_mime_type")
    @Expose
    private String postMimeType;
    @SerializedName("comment_count")
    @Expose
    private String commentCount;
    @SerializedName("filter")
    @Expose
    private String filter;
    public final static Parcelable.Creator<Autorus> CREATOR = new Creator<Autorus>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Autorus createFromParcel(Parcel in) {
            return new Autorus(in);
        }

        public Autorus[] newArray(int size) {
            return (new Autorus[size]);
        }

    };

    protected Autorus(Parcel in) {
        this.iD = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.postAuthor = ((String) in.readValue((String.class.getClassLoader())));
        this.postDate = ((String) in.readValue((String.class.getClassLoader())));
        this.postDateGmt = ((String) in.readValue((String.class.getClassLoader())));
        this.postContent = ((String) in.readValue((String.class.getClassLoader())));
        this.postTitle = ((String) in.readValue((String.class.getClassLoader())));
        this.postExcerpt = ((String) in.readValue((String.class.getClassLoader())));
        this.postStatus = ((String) in.readValue((String.class.getClassLoader())));
        this.commentStatus = ((String) in.readValue((String.class.getClassLoader())));
        this.pingStatus = ((String) in.readValue((String.class.getClassLoader())));
        this.postPassword = ((String) in.readValue((String.class.getClassLoader())));
        this.postName = ((String) in.readValue((String.class.getClassLoader())));
        this.toPing = ((String) in.readValue((String.class.getClassLoader())));
        this.pinged = ((String) in.readValue((String.class.getClassLoader())));
        this.postModified = ((String) in.readValue((String.class.getClassLoader())));
        this.postModifiedGmt = ((String) in.readValue((String.class.getClassLoader())));
        this.postContentFiltered = ((String) in.readValue((String.class.getClassLoader())));
        this.postParent = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.guid = ((String) in.readValue((String.class.getClassLoader())));
        this.menuOrder = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.postType = ((String) in.readValue((String.class.getClassLoader())));
        this.postMimeType = ((String) in.readValue((String.class.getClassLoader())));
        this.commentCount = ((String) in.readValue((String.class.getClassLoader())));
        this.filter = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Autorus() {
    }

    public Integer getID() {
        return iD;
    }

    public void setID(Integer iD) {
        this.iD = iD;
    }

    public String getPostAuthor() {
        return postAuthor;
    }

    public void setPostAuthor(String postAuthor) {
        this.postAuthor = postAuthor;
    }

    public String getPostDate() {
        return postDate;
    }

    public void setPostDate(String postDate) {
        this.postDate = postDate;
    }

    public String getPostDateGmt() {
        return postDateGmt;
    }

    public void setPostDateGmt(String postDateGmt) {
        this.postDateGmt = postDateGmt;
    }

    public String getPostContent() {
        return postContent;
    }

    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    public String getPostExcerpt() {
        return postExcerpt;
    }

    public void setPostExcerpt(String postExcerpt) {
        this.postExcerpt = postExcerpt;
    }

    public String getPostStatus() {
        return postStatus;
    }

    public void setPostStatus(String postStatus) {
        this.postStatus = postStatus;
    }

    public String getCommentStatus() {
        return commentStatus;
    }

    public void setCommentStatus(String commentStatus) {
        this.commentStatus = commentStatus;
    }

    public String getPingStatus() {
        return pingStatus;
    }

    public void setPingStatus(String pingStatus) {
        this.pingStatus = pingStatus;
    }

    public String getPostPassword() {
        return postPassword;
    }

    public void setPostPassword(String postPassword) {
        this.postPassword = postPassword;
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }

    public String getToPing() {
        return toPing;
    }

    public void setToPing(String toPing) {
        this.toPing = toPing;
    }

    public String getPinged() {
        return pinged;
    }

    public void setPinged(String pinged) {
        this.pinged = pinged;
    }

    public String getPostModified() {
        return postModified;
    }

    public void setPostModified(String postModified) {
        this.postModified = postModified;
    }

    public String getPostModifiedGmt() {
        return postModifiedGmt;
    }

    public void setPostModifiedGmt(String postModifiedGmt) {
        this.postModifiedGmt = postModifiedGmt;
    }

    public String getPostContentFiltered() {
        return postContentFiltered;
    }

    public void setPostContentFiltered(String postContentFiltered) {
        this.postContentFiltered = postContentFiltered;
    }

    public Integer getPostParent() {
        return postParent;
    }

    public void setPostParent(Integer postParent) {
        this.postParent = postParent;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public Integer getMenuOrder() {
        return menuOrder;
    }

    public void setMenuOrder(Integer menuOrder) {
        this.menuOrder = menuOrder;
    }

    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }

    public String getPostMimeType() {
        return postMimeType;
    }

    public void setPostMimeType(String postMimeType) {
        this.postMimeType = postMimeType;
    }

    public String getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(String commentCount) {
        this.commentCount = commentCount;
    }

    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(iD);
        dest.writeValue(postAuthor);
        dest.writeValue(postDate);
        dest.writeValue(postDateGmt);
        dest.writeValue(postContent);
        dest.writeValue(postTitle);
        dest.writeValue(postExcerpt);
        dest.writeValue(postStatus);
        dest.writeValue(commentStatus);
        dest.writeValue(pingStatus);
        dest.writeValue(postPassword);
        dest.writeValue(postName);
        dest.writeValue(toPing);
        dest.writeValue(pinged);
        dest.writeValue(postModified);
        dest.writeValue(postModifiedGmt);
        dest.writeValue(postContentFiltered);
        dest.writeValue(postParent);
        dest.writeValue(guid);
        dest.writeValue(menuOrder);
        dest.writeValue(postType);
        dest.writeValue(postMimeType);
        dest.writeValue(commentCount);
        dest.writeValue(filter);
    }

    public int describeContents() {
        return 0;
    };
}

