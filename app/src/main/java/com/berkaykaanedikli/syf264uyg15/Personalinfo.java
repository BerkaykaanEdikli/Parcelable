package com.berkaykaanedikli.syf264uyg15;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class Personalinfo implements Parcelable {
    private String Name;
    private String Phone;
    private String Email;

    protected Personalinfo(Parcel in) {
        Name = in.readString();
        Phone = in.readString();
        Email = in.readString();
    }

    public static final Creator<Personalinfo> CREATOR = new Creator<Personalinfo>() {
        @Override
        public Personalinfo createFromParcel(Parcel in) {
            return new Personalinfo(in);
        }

        @Override
        public Personalinfo[] newArray(int size) {
            return new Personalinfo[size];
        }
    };

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Personalinfo(String name, String phone, String email) {
        Name = name;
        Phone = phone;
        Email = email;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        dest.writeString(Name);
        dest.writeString(Phone);
        dest.writeString(Email);
    }
}
