package count.app.assignment01.drawer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

import count.app.assignment01.R;

public class DrawerActivity extends AppCompatActivity {
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawer);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        drawerLayout = findViewById(R.id.DrawerLayout);
        navigationView = findViewById(R.id.Navigation_menu);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int menuItemid = item.getItemId();
                if (menuItemid == R.id.Home) {
                    drawerLayout.closeDrawer(GravityCompat.START);
                    Toast.makeText(DrawerActivity.this, "id:" + "Home", Toast.LENGTH_SHORT).show();
                }
                else if (menuItemid == R.id.About) {
                    drawerLayout.closeDrawer(GravityCompat.START);
                    Toast.makeText(DrawerActivity.this, "id:" + "About", Toast.LENGTH_SHORT).show();
                }
                else if (menuItemid == R.id.Contact) {
                    drawerLayout.closeDrawer(GravityCompat.START);
                    Toast.makeText(DrawerActivity.this, "id:" + "Contact", Toast.LENGTH_SHORT).show();
                }
                else if (menuItemid == R.id.A) {
                    drawerLayout.closeDrawer(GravityCompat.START);
                    Toast.makeText(DrawerActivity.this, "id:" + "A", Toast.LENGTH_SHORT).show();
                }
                else if (menuItemid == R.id.C) {
                    drawerLayout.closeDrawer(GravityCompat.START);
                    Toast.makeText(DrawerActivity.this, "id:" + "C", Toast.LENGTH_SHORT).show();
                }
                else if (menuItemid == R.id.H) {
                    drawerLayout.closeDrawer(GravityCompat.START);
                    Toast.makeText(DrawerActivity.this, "id:" + "H", Toast.LENGTH_SHORT).show();
                }
                return false;
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//        int menuItemid=item.getItemId();
//        if (menuItemid == R.id.add){
//            Toast.makeText(this, "id:" + "Add", Toast.LENGTH_SHORT).show();
//        }
//        else if (menuItemid == R.id.delete){
//            Toast.makeText(this, "id:" + "Delete", Toast.LENGTH_SHORT).show();
//        }
        //the other way to write below code is using click listener in oncreate method
//        else if(menuItemid== android.R.id.home){//used android because this id is created at the back in resourse fiels
//            onBackPressed();
//        }
        return super.onOptionsItemSelected(item);
    }
}