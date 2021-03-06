package com.example.android.pets;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import data.PetContract;

/**
 * Created by l4z on 11.02.2017.
 */

public class PetDbHelper extends SQLiteOpenHelper {



    private static final String DATABASE_NAME = "shelter.db";
    private static final int DATABASE_VERSION = 1;

    public PetDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String SQL_CREATE_PETS_TABLE =  "CREATE TABLE " + PetContract.TABLE_NAME + " ("
                + PetContract._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + PetContract.COLUMN_PET_NAME + " TEXT NOT NULL, "
                + PetContract.COLUMN_PET_BREED + " TEXT, "
                + PetContract.COLUMN_PET_GENDER + " INTEGER NOT NULL, "
                + PetContract.COLUMN_PET_WEIGHT + " INTEGER NOT NULL DEFAULT 0);";

        db.execSQL(SQL_CREATE_PETS_TABLE);
    }



    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
