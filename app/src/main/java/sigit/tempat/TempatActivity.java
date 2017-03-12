package sigit.tempat;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class TempatActivity extends AppCompatActivity {
    Toolbar toolbarTempat;
    private RecyclerView rvView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<String> dataSet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/segoeui.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );
        setContentView(R.layout.activity_tempat);
        toolbarTempat = (Toolbar)findViewById(R.id.toolbarTempat);
        toolbarTempat.setTitle("Tempat");
        setSupportActionBar(toolbarTempat);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        dataSet = new ArrayList<>();
        initDataset();
        rvView = (RecyclerView) findViewById(R.id.rv_tempat);
        rvView.setHasFixedSize(true);
        layoutManager = new GridLayoutManager(this,2);
        rvView.setLayoutManager(layoutManager);
        adapter = new TempatAdapter(dataSet);
        rvView.setAdapter(adapter);
    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }

    private void initDataset(){
        dataSet.add("Karin");
        dataSet.add("Ingrid");
        dataSet.add("Helga");
        dataSet.add("Renate");
        dataSet.add("Elke");
        dataSet.add("Ursula");
        dataSet.add("Erika");
        dataSet.add("Christa");
        dataSet.add("Gisela");
        dataSet.add("Monika");
    }
}
