package rmrf.cardviewandrecyclerview;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>{


    private Context mContext;
    private List<SettersAndGetters> mData;

    public RecyclerViewAdapter(Context mContext, List<SettersAndGetters> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;
        LayoutInflater mInflator=LayoutInflater.from(mContext);
        view=mInflator.inflate(R.layout.cardviewitems,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {

        holder.tv_press_title.setText(mData.get(position).getTitle());
        holder.img_press_thumbnail.setImageResource(mData.get(position).getThumbnail());
//setting onclick listener
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(mContext,Press_Activity.class);
//                passing data to book activity
                intent.putExtra("Title",mData.get(position).getTitle());
                intent.putExtra("Category",mData.get(position).getCategory());
                intent.putExtra("Description",mData.get(position).getDescription());

                intent.putExtra("Thumbnail",mData.get(position).getThumbnail());

//                start the activity
                mContext.startActivity(intent);



            }
        });


    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static  class MyViewHolder extends RecyclerView.ViewHolder{

        TextView tv_press_title;
        ImageView img_press_thumbnail;
        //        cardview to enable onclick
        CardView cardView;



        public MyViewHolder(View itemView) {
            super(itemView);
            tv_press_title=(TextView)itemView.findViewById(R.id.press_title_id);
            img_press_thumbnail=(ImageView)itemView.findViewById(R.id.press_image_id);

            cardView=(CardView)itemView.findViewById(R.id.cardview1_id);
        }
    }


}