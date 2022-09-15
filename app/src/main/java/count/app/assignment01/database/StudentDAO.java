package count.app.assignment01.database;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface StudentDAO {

    //Insert Querry
    @Insert
    void InsertStudent(StudentEntity Student);

    @Query("SELECT * FROM StudentEntity")
    List<StudentEntity> getall();
}
