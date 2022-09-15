package count.app.assignment01.database;


import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class StudentEntity {
    StudentEntity(){
    }
//    @NonNull//this is used if we add a primary key that is not int
    @PrimaryKey(autoGenerate = true)
    public int ID;
    //Column info tag is not necessary,if not mentioned then the name of variable is setted as the column name
    @ColumnInfo(name="First_name")
    public String FirstName;
    @ColumnInfo(name="Last_name")
    public String LastName;
    @ColumnInfo(name="Email_Address")
    public String EmailAddress;
    @ColumnInfo(name="Phone_Number")
    public String PhoneNumber;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getEmailAddress() {
        return EmailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        EmailAddress = emailAddress;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }
}
