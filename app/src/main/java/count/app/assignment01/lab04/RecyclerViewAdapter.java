package count.app.assignment01.lab04;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import count.app.assignment01.R;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    //initializing because methods are created first time and they need a list and its size as well
    ArrayList<Student> studentArrayList = new ArrayList<>();
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.student_item,parent,false);
        return new StudentViewHolder(view);
    }
    //this method runs iteratively, runs as many times as teh size of list
    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        //get datat from list one by one
        Student item = studentArrayList.get(position);
        StudentViewHolder ViewHolder= (StudentViewHolder) holder;
        ViewHolder.stutextview.setText(item.getName());
        ViewHolder.phone.setText(item.getPhone());
        ViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(view.getContext(), "Name is: " + item.getName(), Toast.LENGTH_LONG);
                toast.show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return studentArrayList.size();
    }

    public void setData(ArrayList<Student> studentArrayList){
        this.studentArrayList=studentArrayList;
        notifyDataSetChanged();
    }

    public static class StudentViewHolder extends RecyclerView.ViewHolder{
        TextView stutextview;
        TextView phone;

        public StudentViewHolder(@NonNull View itemView) {
            super(itemView);
            stutextview=itemView.findViewById(R.id.StudentItemText);
            phone=itemView.findViewById(R.id.StudentItemTextphone);
        }
    }
}
