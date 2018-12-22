package appjam.themanual;

import android.content.Context;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
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

public class ManualAdapter extends RecyclerView.Adapter<ManualAdapter.ManualHolder>{

    private ArrayList<ManualDataModel> dataList;
    private Context mContext;

    public ManualAdapter(Context context, ArrayList<ManualDataModel> manualList){
        this.mContext = context;
        this.dataList = manualList;
    }

    @NonNull
    @Override
    public ManualHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycler_manualitem, null);
        ManualHolder mh = new ManualHolder(v);
        return mh;
    }

    @Override
    public void onBindViewHolder(@NonNull ManualHolder ManualHolder, int i) {
        final String itemTitle = dataList.get(i).getTitle();
        final int itemPerson = dataList.get(i).getPerson();
        final int itemBackground = dataList.get(i).getBgImage();

        ManualHolder.itemTitle.setText(itemTitle);
        ManualHolder.itemPerson.setText(itemPerson + "명");
        ManualHolder.itemBackground.setImageResource(itemBackground);
    }

    @Override
    public int getItemCount() {
        return (null != dataList ? dataList.size() : 0);
    }

    public class ManualHolder extends RecyclerView.ViewHolder {

        protected TextView itemTitle;
        protected TextView itemPerson;
        protected ImageView itemBackground;

        public ManualHolder(View itemView) {
            super(itemView);
            this.itemTitle = (TextView) itemView.findViewById(R.id.textview_manual_title);
            this.itemPerson = (TextView) itemView.findViewById(R.id.textview_manual_person);
            this.itemBackground = (ImageView) itemView.findViewById(R.id.imageview_manual_bg);
        }
    }
}
