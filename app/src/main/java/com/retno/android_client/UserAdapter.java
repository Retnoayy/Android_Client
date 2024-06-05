package com.retno.android_client;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder> {
    private List<User> userList;
    private Context context;

    // Konstruktor UserAdapter yang menerima List<User> dan Context
    public UserAdapter(List<User> userList, Context context) {
        this.userList = userList;
        this.context = context;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_user, parent, false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        User user = userList.get(position);
        holder.textViewName.setText(user.getName());
        holder.textViewEmail.setText(user.getEmail());
        holder.textViewTtl.setText(user.getTtl());
        holder.textViewAlamat.setText(user.getAlamat());
        holder.textViewZodiac.setText(user.getZodiac());
        holder.textViewjk.setText(user.getJk());

        // Mengatur OnClickListener pada itemView untuk menangani tap pada item
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (context instanceof MainActivity) {
                    ((MainActivity) context).showUpdateDialog(user);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    // Metode untuk memperbarui data user dalam adapter
    public void updateUser(User updatedUser) {
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getId() == updatedUser.getId()) {
                userList.set(i, updatedUser);
                notifyItemChanged(i);
                break;
            }
        }
    }

    public static class UserViewHolder extends RecyclerView.ViewHolder {
        TextView textViewName;
        TextView textViewEmail;
        TextView textViewTtl;
        TextView textViewAlamat;
        TextView textViewZodiac;
        TextView textViewjk;

        public UserViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewName = itemView.findViewById(R.id.textViewName);
            textViewEmail = itemView.findViewById(R.id.textViewEmail);
            textViewTtl = itemView.findViewById(R.id.textViewTtl);
            textViewAlamat = itemView.findViewById(R.id.textViewAlamat);
            textViewZodiac = itemView.findViewById(R.id.textViewZodiak);
            textViewjk = itemView.findViewById(R.id.textViewjk);
        }
    }
}
