package com.shije.shije.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CustomFields implements Parcelable
{

    @SerializedName("Cmimi")
    @Expose
    private List<String> cmimi = null;
    @SerializedName("Pershkrimi")
    @Expose
    private List<String> pershkrimi = null;
    @SerializedName("Inventar")
    @Expose
    private List<String> inventar = null;
    public final static Parcelable.Creator<CustomFields> CREATOR = new Creator<CustomFields>() {


        @SuppressWarnings({
                "unchecked"
        })
        public CustomFields createFromParcel(Parcel in) {
            return new CustomFields(in);
        }

        public CustomFields[] newArray(int size) {
            return (new CustomFields[size]);
        }

    }
            ;

    protected CustomFields(Parcel in) {
        in.readList(this.cmimi, (java.lang.String.class.getClassLoader()));
        in.readList(this.pershkrimi, (java.lang.String.class.getClassLoader()));
        in.readList(this.inventar, (java.lang.String.class.getClassLoader()));
    }

    public CustomFields() {
    }

    public List<String> getCmimi() {
        return cmimi;
    }

    public void setCmimi(List<String> cmimi) {
        this.cmimi = cmimi;
    }

    public List<String> getPershkrimi() {
        return pershkrimi;
    }

    public void setPershkrimi(List<String> pershkrimi) {
        this.pershkrimi = pershkrimi;
    }

    public List<String> getInventar() {
        return inventar;
    }

    public void setInventar(List<String> inventar) {
        this.inventar = inventar;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(cmimi);
        dest.writeList(pershkrimi);
        dest.writeList(inventar);
    }

    public int describeContents() {
        return 0;
    }

}