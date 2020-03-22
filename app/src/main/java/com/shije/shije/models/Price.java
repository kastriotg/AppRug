package com.shije.shije.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.lang.reflect.Array;

public class Price implements Parcelable
{

    @SerializedName("dituria")
    @Expose
    private String dituria;
    @SerializedName("dukagjini")
    @Expose
    private String dukagjini;
    @SerializedName("koha")
    @Expose
    private String koha;
    @SerializedName("bota")
    @Expose
    private String bota;
    @SerializedName("rilindja")
    @Expose
    private String rilindja;


    public final static Parcelable.Creator<Price> CREATOR = new Creator<Price>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Price createFromParcel(Parcel in) {
            return new Price(in);
        }

        public Price[] newArray(int size) {
            return (new Price[size]);
        }

    }
            ;

    protected Price(Parcel in) {
        this.dituria = ((String) in.readValue((String.class.getClassLoader())));
        this.dukagjini = ((String) in.readValue((String.class.getClassLoader())));
        this.koha = ((String) in.readValue((String.class.getClassLoader())));
        this.bota = ((String) in.readValue((String.class.getClassLoader())));
        this.rilindja = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Price() {
    }

    public String getDituria() {
        return dituria;
    }

    public void setDituria(String dituria) {
        this.dituria = dituria;
    }

    public String getDukagjini() {
        return dukagjini;
    }

    public void setDukagjini(String dukagjini) {
        this.dukagjini = dukagjini;
    }

    public String getKoha() {
        return koha;
    }

    public void setKoha(String koha) {
        this.koha = koha;
    }

    public String getBota() {
        return bota;
    }

    public void setBota(String bota) {
        this.bota = bota;
    }

    public String getRilindja() {
        return rilindja;
    }

    public void setRilindja(String rilindja) {
        this.rilindja = rilindja;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(dituria);
        dest.writeValue(dukagjini);
        dest.writeValue(koha);
        dest.writeValue(bota);
        dest.writeValue(rilindja);
    }

    public int describeContents() {
        return 0;
    }

}