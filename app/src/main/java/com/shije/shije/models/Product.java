package com.shije.shije.models;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Product implements Parcelable {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("title")
    @Expose
    private Title title;
    @SerializedName("content")
    @Expose
    private Content content;
    @SerializedName("excerpt")
    @Expose
    private Excerpt excerpt;
    @SerializedName("categories")
    @Expose
    private List<Integer> categories = null;
    @SerializedName("tags")
    @Expose
    private List<Object> tags = null;
    @SerializedName("custom_fields")
    @Expose
    private CustomFields customFields;
    @SerializedName("fimg_url")
    @Expose
    private String fimgUrl;

    public final static Parcelable.Creator<Product> CREATOR = new Creator<Product>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Product createFromParcel(Parcel in) {
            return new Product(in);
        }

        public Product[] newArray(int size) {
            return (new Product[size]);
        }

    };

    protected Product(Parcel in) {
        this.id = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.date = ((String) in.readValue((String.class.getClassLoader())));
        this.title = ((Title) in.readValue((Title.class.getClassLoader())));
        this.content = ((Content) in.readValue((Content.class.getClassLoader())));
        this.excerpt = ((Excerpt) in.readValue((Excerpt.class.getClassLoader())));
//        in.readList(this.categories, (java.lang.Integer.class.getClassLoader()));
//        in.readList(this.tags, (java.lang.Object.class.getClassLoader()));
//        this.customFields = ((CustomFields) in.readValue((CustomFields.class.getClassLoader())));
        this.fimgUrl = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Product() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }

    public Excerpt getExcerpt() {
        return excerpt;
    }

    public void setExcerpt(Excerpt excerpt) {
        this.excerpt = excerpt;
    }

    public List<Integer> getCategories() {
        return categories;
    }

    public void setCategories(List<Integer> categories) {
        this.categories = categories;
    }

    public List<Object> getTags() {
        return tags;
    }

    public void setTags(List<Object> tags) {
        this.tags = tags;
    }

    public CustomFields getCustomFields() {
        return customFields;
    }

    public void setCustomFields(CustomFields customFields) {
        this.customFields = customFields;
    }

    public String getFimgUrl() {
        return fimgUrl;
    }

    public void setFimgUrl(String fimgUrl) {
        this.fimgUrl = fimgUrl;
    }

    public void writeToParcel(Parcel dest, int flags) {
        Log.e("fmgUrl", fimgUrl);
        dest.writeValue(id);
        dest.writeValue(date);
        dest.writeValue(title);
        dest.writeValue(content);
        dest.writeValue(excerpt);
//        dest.writeList(categories);
//        dest.writeList(tags);
//        dest.writeValue(customFields);
        dest.writeValue(fimgUrl);
    }

    public int describeContents() {
        return 0;
    }

}