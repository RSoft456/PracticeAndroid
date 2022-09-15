package count.app.assignment01.database;


import androidx.room.Database;
import androidx.room.RoomDatabase;

import count.app.assignment01.lab04.Student;

@Database(entities={StudentEntity.class},version=1)
public abstract class MyStudentDBClass extends RoomDatabase {
    public abstract StudentDAO studentDAO();
    private static MyStudentDBClass database;
}
