package count.app.assignment01.assignment4;

import static android.content.ContentValues.TAG;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import count.app.assignment01.R;
import count.app.assignment01.assignment2.Constants;
import count.app.assignment01.lab04.RecyclerViewAdapter;
import count.app.assignment01.lab04.Student;

public class AdapterRecyclerView extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    ArrayList<StudentData> DataList = new ArrayList<>();

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        switch (viewType) {
            case 0:
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_students, parent, false);
                return new AdapterRecyclerView.StudentVH(view);
            case 1:
                View view2 = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_subject, parent, false);
                return new AdapterRecyclerView.SubjectVH(view2);
            default:
                return null;
        }

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        switch (holder.getItemViewType()) {
            case 0:
                StudentData item = DataList.get(position);
                AdapterRecyclerView.StudentVH VH = (AdapterRecyclerView.StudentVH) holder;
                VH.StuName.setText(item.getStudentName());
                VH.Subject.setText(item.getStudentSubject());
                break;
            case 1:

                StudentData data = DataList.get(position);
                AdapterRecyclerView.SubjectVH SVH = (AdapterRecyclerView.SubjectVH) holder;
                SVH.CourseName.setText(data.getCourseName());
                SVH.Department.setText(data.getStudentDepartment());
                break;
            default:
                Log.d(TAG, "onBindViewHolder: empty");
        }
    }

    @Override
    public int getItemCount() {
        return DataList.size();
    }

    public void setData(ArrayList<StudentData> studentDataList) {
        this.DataList = studentDataList;
        notifyDataSetChanged();
    }

    @Override
    public int getItemViewType(int position) {
        if (DataList.get(position).getStudentDepartment().equals("") && DataList.get(position).getCourseName().equals(""))
            return 0;
        else {
            return 1;
        }
    }

    public static class StudentVH extends RecyclerView.ViewHolder {
        TextView StuName;
        TextView Subject;

        public StudentVH(@NonNull View itemView) {
            super(itemView);
            StuName = itemView.findViewById(R.id.stuName);
            Subject = itemView.findViewById(R.id.StuSub);
        }
    }

    public static class SubjectVH extends RecyclerView.ViewHolder {
        TextView CourseName;
        TextView Department;

        public SubjectVH(@NonNull View itemView) {
            super(itemView);
            CourseName = itemView.findViewById(R.id.CourseName);
            Department = itemView.findViewById(R.id.StuDept);
        }
    }
}
