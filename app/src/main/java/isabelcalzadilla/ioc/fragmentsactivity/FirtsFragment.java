package isabelcalzadilla.ioc.fragmentsactivity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class FirtsFragment extends Fragment {

    // MIAS
    private final int YES = 0;
    private final int NO = 1;


    // CONSTRUCTOR VACÍO PARA INSTANCIAR FRAGMENS (IMPERATIVO)
    public FirtsFragment() {
        // Required empty public constructor
    }

    // EL 'ONCREATEVIEW' PROVEE EL 'LAYOUTINFLATER'
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View rootie = inflater.inflate(R.layout.fragment_simple, container, false);

        final RadioGroup radios = rootie.findViewById(R.id.radios);
        //return inflater.inflate(R.layout.fragment_simple, container, false);

        radios.setOnCheckedChangeListener(
                new RadioGroup.OnCheckedChangeListener() {
                    // método por defecto
                    @Override
                    public void onCheckedChanged(RadioGroup radioGroup, int i) {
                        View radius = radioGroup.findViewById(i);
                        int indice = radios.indexOfChild(radius);// ver

                        TextView texti = rootie.findViewById(R.id.fragment_header);

                        switch (indice) {
                            case YES:
                                texti.setText(R.string.yes_message);
                                break;
                            case NO:
                                texti.setText(R.string.hello_blank_fragment);
                                break;
                            default:
                                break;
                        }
                    }
                }
        );
        return rootie;
    }
}