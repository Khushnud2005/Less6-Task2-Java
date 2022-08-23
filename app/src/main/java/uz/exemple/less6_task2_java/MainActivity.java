package uz.exemple.less6_task2_java;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;

import uz.exemple.less6_task2_java.adapter.UserAdapter;
import uz.exemple.less6_task2_java.model.UserModel;

public class MainActivity extends AppCompatActivity {
    Context context;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }
    void initViews() {
        context = this;
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(context, 3));

        ArrayList<UserModel> users = new ArrayList<>();

        for (int i =1;i<30;i++){
            users.add(new UserModel("Xushnud "+ i,"Boymurodov "+i));
        }
        refreshAdapter(users);
    }
    void refreshAdapter(ArrayList<UserModel> users){
        UserAdapter adapter = new UserAdapter(context,users);
        recyclerView.setAdapter(adapter);
    }
}