package appjam.themanual;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 김예원 on 2018-12-22.
 */

public class InvitedPersonAdapter extends RecyclerView.Adapter<InvitedPersonAdapter.InvitedPersonHolder>{

    private ArrayList<InvitedPersonDataModel> dataList;
    private Context mContext;

    public InvitedPersonAdapter(Context context, ArrayList<InvitedPersonDataModel> invitedPersonList){
        this.mContext = context;
        this.dataList = invitedPersonList;
    }

    @NonNull
    @Override
    public InvitedPersonAdapter.InvitedPersonHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycler_invitedpersonitem, null);
        return new InvitedPersonHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull InvitedPersonHolder InvitedPersonHolder, int i) {
        final String itemName = dataList.get(i).getProfileName();
        final String itemEmail = dataList.get(i).getProfileEmail();
        final int itemProfile = dataList.get(i).getProfileImage();

        InvitedPersonHolder.itemName.setText(itemName);
        InvitedPersonHolder.itemEmail.setText(itemEmail);
        //InvitedPersonHolder.itemProfileImage.setImageResource(itemProfile);


    }

    @Override
    public int getItemCount() {
        return (null != dataList ? dataList.size() : 0);
    }

    public class InvitedPersonHolder extends RecyclerView.ViewHolder {

        protected TextView itemName;
        protected TextView itemEmail;
        protected ImageView itemProfileImage;

        public InvitedPersonHolder(View itemView) {
            super(itemView);
            this.itemName = (TextView) itemView.findViewById(R.id.textview_invitedperson_name);
            this.itemEmail = (TextView) itemView.findViewById(R.id.textview_invitedperson_email);
            this.itemProfileImage = (ImageView) itemView.findViewById(R.id.imageview_invitedperson_profile);
        }
    }
}
