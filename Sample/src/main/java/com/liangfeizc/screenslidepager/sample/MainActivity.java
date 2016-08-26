package com.liangfeizc.screenslidepager.sample;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.liangfeizc.slidepager.SlidePagerActivity;


public class MainActivity extends ActionBarActivity {

    private static final String[] IMAGES = new String[] {

            "http://iiif.nli.org.il/IIIF/FL13407243/full/full/0/default.jpg",
            "http://iiif.nli.org.il/IIIF/FL13407246/full/full/0/default.jpg",
            "http://iiif.nli.org.il/IIIF/FL13407245/full/full/0/default.jpg",
            "http://iiif.nli.org.il/IIIF/FL13407153/full/full/0/default.jpg",
            "http://iiif.nli.org.il/IIIF/FL13407216/full/full/0/default.jpg",
            "http://iiif.nli.org.il/IIIF/FL13407202/full/full/0/default.jpg",
            "http://iiif.nli.org.il/IIIF/FL13407227/full/full/0/default.jpg",
            "http://iiif.nli.org.il/IIIF/FL13407202/full/full/0/default.jpg",
            "http://iiif.nli.org.il/IIIF/FL13407108/full/full/0/default.jpg",
            "http://iiif.nli.org.il/IIIF/FL13407109/full/full/0/default.jpg",
            "http://iiif.nli.org.il/IIIF/FL13407121/full/full/0/default.jpg",
            "http://iiif.nli.org.il/IIIF/FL13407218/full/full/0/default.jpg"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_about) {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("http://www.liangfeizc.com/about"));
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }

    public void viewPictures(View view) {
        Intent intent = new Intent(this, SlidePagerActivity.class);
        intent.putExtra(SlidePagerActivity.EXTRA_TITLE, "堀北真希の写真");
        intent.putExtra(SlidePagerActivity.EXTRA_PICTURES, IMAGES);
        startActivity(intent);
    }
}
