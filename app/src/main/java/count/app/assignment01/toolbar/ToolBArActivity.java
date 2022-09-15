package count.app.assignment01.toolbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import count.app.assignment01.R;

public class ToolBArActivity extends AppCompatActivity {
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tool_bar);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //.setDisplayHomeAsUpEnabled is used to always show back arrow
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        toolbar.setNavigationIcon(R.drawable.ic_action_menu);
        //handling back button through click
//        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                onBackPressed();
//            }
//        });
    }
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return true;
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