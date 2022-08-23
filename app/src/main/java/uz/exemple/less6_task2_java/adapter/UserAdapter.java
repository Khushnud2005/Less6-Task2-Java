package uz.exemple.less6_task2_java.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import uz.exemple.less6_task2_java.R;
import uz.exemple.less6_task2_java.model.UserModel;

public class UserAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    Context context;
    ArrayList<UserModel> users;

    public UserAdapter(Context context,ArrayList<UserModel> users){
        this.context = context;
        this.users = users;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_grid_items,parent,false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        UserModel user = users.get(position);

        if(holder instanceof UserViewHolder){
            TextView iv_firstName = ((UserViewHolder) holder).iv_firstName;
            TextView tv_lastName = ((UserViewHolder) holder).tv_lastName;

            iv_firstName.setText(user.getfirstName());
            tv_lastName.setText(user.getlastName());
        }
    }

    @Override
    public int getItemCount() {
        return users.size();
    }
    public class UserViewHolder extends RecyclerView.ViewHolder {
        View view;
        TextView iv_firstName;
        TextView tv_lastName;

        public UserViewHolder(View view){
            super(view);
            this.view = view;
            iv_firstName = view.findViewById(R.id.tv_firstName);
            tv_lastName = view.findViewById(R.id.tv_lastName);
        }
    }

}
