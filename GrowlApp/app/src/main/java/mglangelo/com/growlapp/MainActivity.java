package mglangelo.com.growlapp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    public void aiesecorg (View view){

        Intent intent = new Intent(this, MyActivity2.class);
        startActivity(intent);
    }

    public void becarios (View view) {

        Intent intent = new Intent(this, MyActivity3.class);
        startActivity(intent);

    }

    public void cht (View view) {

        Intent intent = new Intent(this, MyActivity4.class);
        startActivity(intent);

    }

    public void comach (View view) {

        Intent intent = new Intent(this, MyActivity5.class);
        startActivity(intent);

    }

    public void cya (View view) {

        Intent intent = new Intent(this, MyActivity6.class);
        startActivity(intent);

    }

    public void earthust (View view) {

        Intent intent = new Intent(this, MyActivity7.class);
        startActivity(intent);

    }


    public void euust (View view) {

        Intent intent = new Intent(this, MyActivity8.class);
        startActivity(intent);

    }

    public void fma (View view) {

        Intent intent = new Intent(this, MyActivity9.class);
        startActivity(intent);

    }

    public void fotomasino (View view) {

        Intent intent = new Intent(this, MyActivity10.class);
        startActivity(intent);

    }

    public void lingkoder (View view) {

        Intent intent = new Intent(this, MyActivity11.class);
        startActivity(intent);

    }


    public void mediatrix (View view) {

        Intent intent = new Intent(this, MyActivity12.class);
        startActivity(intent);

    }

    public void musikat (View view) {

        Intent intent = new Intent(this, MyActivity13.class);
        startActivity(intent);

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }
    }
}
