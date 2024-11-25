package com.example.android___qu_n_l_chi_ti_u.DAO;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

public class UserDAO {
    private SQLiteDatabase db;

    public UserDAO(SQLiteDatabase db) {
        this.db = db;
    }

    // Create
    public long addUser(User user) {
        ContentValues values = new ContentValues();
        values.put("username", user.getUsername());
        values.put("password", user.getPassword());
        values.put("email", user.getEmail());
        values.put("created_date", user.getCreatedDate());
        values.put("last_updated", user.getLastUpdated());
        return db.insert("User", null, values);
    }

    // Read
    public User getUserById(int userID) {
        Cursor cursor = db.query("User", null, "userID = ?", new String[]{String.valueOf(userID)}, null, null, null);
        if (cursor != null && cursor.moveToFirst()) {
            User user = new User(
                    cursor.getInt(cursor.getColumnIndexOrThrow("userID")),
                    cursor.getString(cursor.getColumnIndexOrThrow("username")),
                    cursor.getString(cursor.getColumnIndexOrThrow("password")),
                    cursor.getString(cursor.getColumnIndexOrThrow("email")),
                    cursor.getString(cursor.getColumnIndexOrThrow("created_date")),
                    cursor.getString(cursor.getColumnIndexOrThrow("last_updated"))
            );
            cursor.close();
            return user;
        }
        return null;
    }

    // Update
    public int updateUser(User user) {
        ContentValues values = new ContentValues();
        values.put("username", user.getUsername());
        values.put("password", user.getPassword());
        values.put("email", user.getEmail());
        values.put("last_updated", user.getLastUpdated());
        return db.update("User", values, "userID = ?", new String[]{String.valueOf(user.getUserID())});
    }

    // Delete
    public int deleteUser(int userID) {
        return db.delete("User", "userID = ?", new String[]{String.valueOf(userID)});
    }
}
