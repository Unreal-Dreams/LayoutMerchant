package rmrf.cardviewandrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    List<SettersAndGetters> lstPress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstPress=new ArrayList<>();
        lstPress.add(new SettersAndGetters("Heading3","Subheading3","Description",R.drawable.ic_launcher_background));
        lstPress.add(new SettersAndGetters("Heading3","Subheading3","Description",R.drawable.ic_launcher_background));
        lstPress.add(new SettersAndGetters("Heading3","Subheading3","Description",R.drawable.ic_launcher_background));
        lstPress.add(new SettersAndGetters("Heading3","Subheading3","Description",R.drawable.ic_launcher_background));
        lstPress.add(new SettersAndGetters("Heading3","Subheading3","Description",R.drawable.ic_launcher_background));
        lstPress.add(new SettersAndGetters("Heading3","Subheading3","Description",R.drawable.ic_launcher_background));
        lstPress.add(new SettersAndGetters("Heading3","Subheading3","Description",R.drawable.ic_launcher_background));
        lstPress.add(new SettersAndGetters("Heading3","Subheading3","Description",R.drawable.ic_launcher_background));
        lstPress.add(new SettersAndGetters("Heading3","Subheading3","Description",R.drawable.ic_launcher_background));
        lstPress.add(new SettersAndGetters("Heading3","Subheading3","Description",R.drawable.ic_launcher_background));
        lstPress.add(new SettersAndGetters("Heading3","Subheading3","Description",R.drawable.ic_launcher_background));
        lstPress.add(new SettersAndGetters("Heading3","Subheading3","Description",R.drawable.ic_launcher_background));


        RecyclerView myr=(RecyclerView)findViewById(R.id.recycler_view);
        RecyclerViewAdapter myAdapter=new RecyclerViewAdapter(this,lstPress);
        myr.setLayoutManager(new GridLayoutManager(this,2));
        myr.setAdapter(myAdapter);
    }
}
