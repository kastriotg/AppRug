package com.shije.bookshop.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Image implements Parcelable
{

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("date_created")
    @Expose
    private String dateCreated;
    @SerializedName("date_created_gmt")
    @Expose
    private String dateCreatedGmt;
    @SerializedName("date_modified")
    @Expose
    private String dateModified;
    @SerializedName("date_modified_gmt")
    @Expose
    private String dateModifiedGmt;
    @SerializedName("src")
    @Expose
    private String src;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("alt")
    @Expose
    private String alt;

    protected Image(Parcel in) {
        if (in.readByte() == 0) {
            id = null;
        } else {
            id = in.readInt();
        }
        dateCreated = in.readString();
        dateCreatedGmt = in.readString();
        dateModified = in.readString();
        dateModifiedGmt = in.readString();
        src = in.readString();
        name = in.readString();
        alt = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        if (id == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(id);
        }
        dest.writeString(dateCreated);
        dest.writeString(dateCreatedGmt);
        dest.writeString(dateModified);
        dest.writeString(dateModifiedGmt);
        dest.writeString(src);
        dest.writeString(name);
        dest.writeString(alt);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Image> CREATOR = new Creator<Image>() {
        @Override
        public Image createFromParcel(Parcel in) {
            return new Image(in);
        }

        @Override
        public Image[] newArray(int size) {
            return new Image[size];
        }
    };

    public Integer getId() {
        return id;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public String getDateCreatedGmt() {
        return dateCreatedGmt;
    }

    public String getDateModified() {
        return dateModified;
    }

    public String getDateModifiedGmt() {
        return dateModifiedGmt;
    }

    public String getSrc() {
        return src;
    }

    public String getName() {
        return name;
    }

    public String getAlt() {
        return alt;
    }
}