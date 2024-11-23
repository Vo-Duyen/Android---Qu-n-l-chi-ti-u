package com.example.android___qu_n_l_chi_ti_u;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "ExpenseManager.db";
    private static final int DATABASE_VERSION = 1;

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE User (" +
                "userID INTEGER PRIMARY KEY AUTOINCREMENT," +
                "username TEXT NOT NULL," +
                "createdDate TEXT NOT NULL," +
                "lastUpdated TEXT)");

        db.execSQL("CREATE TABLE Income (" +
                "incomeID INTEGER PRIMARY KEY AUTOINCREMENT," +
                "userID INTEGER NOT NULL," +
                "incomeType TEXT NOT NULL," +
                "amount REAL NOT NULL," +
                "dateReceived TEXT NOT NULL," +
                "note TEXT," +
                "createdDate TEXT NOT NULL," +
                "lastUpdated TEXT," +
                "FOREIGN KEY (userID) REFERENCES User(userID))");

        db.execSQL("CREATE TABLE Expense (" +
                "expenseID INTEGER PRIMARY KEY AUTOINCREMENT," +
                "userID INTEGER NOT NULL," +
                "categoryID INTEGER NOT NULL," +
                "amount REAL NOT NULL," +
                "dateSpent TEXT NOT NULL," +
                "receiptImage TEXT," +
                "note TEXT," +
                "createdDate TEXT NOT NULL," +
                "lastUpdated TEXT," +
                "FOREIGN KEY (userID) REFERENCES User(userID)," +
                "FOREIGN KEY (categoryID) REFERENCES Category(categoryID))");

        db.execSQL("CREATE TABLE Category (" +
                "categoryID INTEGER PRIMARY KEY AUTOINCREMENT," +
                "userID INTEGER," +
                "categoryName TEXT NOT NULL," +
                "monthlyLimit REAL," +
                "createdDate TEXT NOT NULL," +
                "lastUpdated TEXT," +
                "FOREIGN KEY (userID) REFERENCES User(userID))");

        db.execSQL("CREATE TABLE SavingGoal (" +
                "goalID INTEGER PRIMARY KEY AUTOINCREMENT," +
                "userID INTEGER NOT NULL," +
                "goalName TEXT NOT NULL," +
                "targetAmount REAL NOT NULL," +
                "savedAmount REAL DEFAULT 0," +
                "deadline TEXT," +
                "createdDate TEXT NOT NULL," +
                "lastUpdated TEXT," +
                "FOREIGN KEY (userID) REFERENCES User(userID))");

        db.execSQL("CREATE TABLE ReportData (" +
                "reportID INTEGER PRIMARY KEY AUTOINCREMENT," +
                "userID INTEGER NOT NULL," +
                "reportType TEXT NOT NULL," +
                "startDate TEXT NOT NULL," +
                "endDate TEXT NOT NULL," +
                "totalIncome REAL NOT NULL," +
                "totalExpense REAL NOT NULL," +
                "createdDate TEXT NOT NULL," +
                "FOREIGN KEY (userID) REFERENCES User(userID))");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS User");
        db.execSQL("DROP TABLE IF EXISTS Income");
        db.execSQL("DROP TABLE IF EXISTS Expense");
        db.execSQL("DROP TABLE IF EXISTS Category");
        db.execSQL("DROP TABLE IF EXISTS SavingGoal");
        db.execSQL("DROP TABLE IF EXISTS ReportData");
        onCreate(db);
    }
}
