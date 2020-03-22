package com.shije.shije.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DetajetELibrit implements Parcelable {

    @SerializedName("id_libri")
    @Expose
    private String idLibri;
    @SerializedName("price")
    @Expose
    private Price price;
    @SerializedName("shtepia_botuese")
    @Expose
    private List<ShtepiaBotuese> shtepiaBotuese = null;
    @SerializedName("autori")
    @Expose
    private List<Autorus> autori = null;


    public DetajetELibrit() {
    }

    protected DetajetELibrit(Parcel in) {
        idLibri = in.readString();
        price = in.readParcelable(Price.class.getClassLoader());
        shtepiaBotuese = in.createTypedArrayList(ShtepiaBotuese.CREATOR);
        autori = in.createTypedArrayList(Autorus.CREATOR);
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(idLibri);
        dest.writeParcelable(price, flags);
        dest.writeTypedList(shtepiaBotuese);
        dest.writeTypedList(autori);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<DetajetELibrit> CREATOR = new Creator<DetajetELibrit>() {
        @Override
        public DetajetELibrit createFromParcel(Parcel in) {
            return new DetajetELibrit(in);
        }

        @Override
        public DetajetELibrit[] newArray(int size) {
            return new DetajetELibrit[size];
        }
    };

    public String getIdLibri() {
        return idLibri;
    }

    public void setIdLibri(String idLibri) {
        this.idLibri = idLibri;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public List<ShtepiaBotuese> getShtepiaBotuese() {
        return shtepiaBotuese;
    }

    public void setShtepiaBotuese(List<ShtepiaBotuese> shtepiaBotuese) {
        this.shtepiaBotuese = shtepiaBotuese;
    }

    public List<Autorus> getAutori() {
        return autori;
    }

    public void setAutori(List<Autorus> autori) {
        this.autori = autori;
    }



}