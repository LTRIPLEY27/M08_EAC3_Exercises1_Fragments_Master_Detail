package isabelcalzadilla.ioc.fragmentsactivity;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button show;
    private boolean isShower = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        show = findViewById(R.id.button_show);
        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isShower){
                    displayFragment();
                }
            }
        });
    }

    public void displayFragment(){
        FirtsFragment createdInstance = FirtsFragment.neoFragment();

        // FRAGMENT MANAGER
        FragmentManager manager = getSupportFragmentManager(); //método defecto
        FragmentTransaction transaction = manager.beginTransaction();

        transaction.add(R.id.fragment_container, createdInstance).addToBackStack(null).commit();

        isShower = true;

    }

}