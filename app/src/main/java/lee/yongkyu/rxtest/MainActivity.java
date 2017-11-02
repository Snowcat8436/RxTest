package lee.yongkyu.rxtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private StaggeredGridLayoutManager gaggeredGridLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        gaggeredGridLayoutManager = new StaggeredGridLayoutManager(3, 1);
        recyclerView.setLayoutManager(gaggeredGridLayoutManager);

        List<ItemObjects> gaggeredList = getListItemData();

        RecyclerViewAdapter rcAdapter = new RecyclerViewAdapter(MainActivity.this, gaggeredList);

        ItemTouchHelper.Callback callback =  new ItemTouchHelperCallback(rcAdapter);
        ItemTouchHelper touchHelper = new ItemTouchHelper(callback);
        touchHelper.attachToRecyclerView(recyclerView);

        recyclerView.setAdapter(rcAdapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private List<ItemObjects> getListItemData(){
        List<ItemObjects> listViewItems = new ArrayList<ItemObjects>();

        listViewItems.add(new ItemObjects("Alkane", R.drawable.works));
        listViewItems.add(new ItemObjects("Ethane", R.drawable.works));
        listViewItems.add(new ItemObjects("Alkyne", R.drawable.works));
        listViewItems.add(new ItemObjects("Benzene", R.drawable.works));
        /*listViewItems.add(new ItemObjects("Amide", R.drawable.one));
        listViewItems.add(new ItemObjects("Amino Acid", R.drawable.two));
        listViewItems.add(new ItemObjects("Phenol", R.drawable.three));
        listViewItems.add(new ItemObjects("Carbonxylic", R.drawable.four));
        listViewItems.add(new ItemObjects("Nitril", R.drawable.one));
        listViewItems.add(new ItemObjects("Ether", R.drawable.two));
        listViewItems.add(new ItemObjects("Ester", R.drawable.three));
        listViewItems.add(new ItemObjects("Alcohol", R.drawable.four));
        */

        return listViewItems;
    }
}
