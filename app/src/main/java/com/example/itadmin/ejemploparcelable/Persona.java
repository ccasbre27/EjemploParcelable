package com.example.itadmin.ejemploparcelable;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by itadmin on 3/29/16.
 */
public class Persona implements Parcelable {

    public int id;
    public String nombre;
    public String apellidos;
    public int edad;

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.id);
        dest.writeString(this.nombre);
        dest.writeString(this.apellidos);
        dest.writeInt(this.edad);
    }

    public Persona() {
    }

    public Persona(int pId,String pNombre,String pApellidos, int pEdad) {
        id = pId;
        nombre = pNombre;
        apellidos = pApellidos;
        edad = pEdad;
    }

    protected Persona(Parcel in) {
        this.id = in.readInt();
        this.nombre = in.readString();
        this.apellidos = in.readString();
        this.edad = in.readInt();
    }

    public static final Parcelable.Creator<Persona> CREATOR = new Parcelable.Creator<Persona>() {
        @Override
        public Persona createFromParcel(Parcel source) {
            return new Persona(source);
        }

        @Override
        public Persona[] newArray(int size) {
            return new Persona[size];
        }
    };
}
