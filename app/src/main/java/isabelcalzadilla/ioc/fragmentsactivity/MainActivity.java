package isabelcalzadilla.ioc.fragmentsactivity;

import android.content.Context;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

// implementamos la INTERFACE DECLARADA COMO LISTENER PARA RECIBIR LOS DATOS QUE SE GENEREN ALLÍ
public class MainActivity extends AppCompatActivity implements FirtsFragment.OnFragmentInteractionListener{

    private Button show;
    private boolean isShower = false;

    // declaracion de una variable para el radio y el manejo de la interface
    private int radio = 2; // --> 2 == NO BY DEFAULT

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
        // PASO DEL VALOR DEL BUTTON A LA INSTANCIA DEL FRAGMENR
        FirtsFragment createdInstance = FirtsFragment.neoFragment(radio);

        // FRAGMENT MANAGER
        FragmentManager manager = getSupportFragmentManager(); //método defecto
        FragmentTransaction transaction = manager.beginTransaction();

        transaction.add(R.id.fragment_container, createdInstance).addToBackStack(null).commit();

        isShower = true;

    }

    // MÉTODO DEL FRAGMENT
    @Override
    public void radiusChoice(int choice) {
        radio = choice;
        Toast.makeText(this, "ELECCION " + Integer.toString(choice), Toast.LENGTH_SHORT).show();
    }
}