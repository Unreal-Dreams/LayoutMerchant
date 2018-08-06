package rmrf.cardviewandrecyclerview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Press_Activity extends AppCompatActivity {

    private TextView tvtitle,tvcategory, tvdescription;
    private ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_press_);

        tvtitle=(TextView)findViewById(R.id.txtTitle);
        tvcategory=(TextView)findViewById(R.id.txtCat);
        tvdescription=(TextView)findViewById(R.id.txtDesc);
        img=(ImageView)findViewById(R.id.pressthumbnail);

//        receive data
        Intent intent=getIntent();
        String Title=intent.getExtras().getString("Title");
        String Category=intent.getExtras().getString("Category");
        String Description=intent.getExtras().getString("Description");
        int image=intent.getExtras().getInt("Thumbnail");

//        setting values
        tvtitle.setText(Title);
        tvcategory.setText(Category);
        tvdescription.setText(Description);

        img.setImageResource(image);
    }
}
