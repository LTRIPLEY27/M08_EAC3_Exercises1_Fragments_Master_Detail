package isabelcalzadilla.ioc.fragmentsactivity;

import android.content.Intent;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import isabelcalzadilla.ioc.fragmentsactivity.content.Data;

public class ActivityDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        int selected = getIntent().getIntExtra(Data.KEY_VALUE, 0);

        DetailFragment detail = DetailFragment.newInstance(selected);

        getSupportFragmentManager().beginTransaction()
                .add(R.id.detail_container, detail)
                .commit();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {

            NavUtils.navigateUpTo(this, new Intent(this, MainActivity.class));
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}