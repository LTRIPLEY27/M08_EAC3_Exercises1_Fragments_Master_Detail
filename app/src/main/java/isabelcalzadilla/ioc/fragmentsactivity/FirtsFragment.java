package isabelcalzadilla.ioc.fragmentsactivity;

import android.content.Context;
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

    // VARIABLES FINAL PARA VALIDAR SI HA SIDO CHECKEADO O NO UN BUTTON DEL RADIO CON '0' O '1'
    private final int YES = 0;
    private final int NO = 1;

    // constante para añadir una interfaz con llamada
    private static final int NONE = 2;
    private static final String CHOICE = "choice";

    //RADIO BUTTONS VARIABLES
    private int radioChoice = NONE;

    // definicion de la variable del listener
    OnFragmentInteractionListener listen;

    // CREACION DE INTERFACE
    interface  OnFragmentInteractionListener {
        void radiusChoice(int choice);
    }

    // MÉTODO 'ONATTACH'
    // la implementación del método se da en la ACTIVITY
    @Override
    public void onAttach(Context context){
        super.onAttach(context);
        if(context instanceof OnFragmentInteractionListener){
            listen = (OnFragmentInteractionListener) context;
        } else {
            throw new ClassCastException(context.toString() /*+ getResources().getString((R.string.exception_message)*/);
        }
    }

    // CONSTRUCTOR VACÍO PARA INSTANCIAR FRAGMENS (IMPERATIVO)
    public FirtsFragment() {
        // Required empty public constructor
    }

    // EL 'ONCREATEVIEW' PROVEE EL 'LAYOUTINFLATER'
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // DEFINICIÓN DE LA VISTA CON LOS VALORES EN FALSE
        final View rootie = inflater.inflate(R.layout.fragment_simple, container, false);

        final RadioGroup radios = rootie.findViewById(R.id.radios);

        // ADICIÓN DE LA EVALUACIÓN DEL BUNDLE
        if(getArguments().containsKey(CHOICE)) {
            radioChoice = getArguments().getInt(CHOICE);
        } if(radioChoice != NONE) {
            radios.check(radios.getChildAt(radioChoice).getId());
        }

        // SETTEO DE LOS VALORES DEL RADIOGROUP
        radios.setOnCheckedChangeListener(
                new RadioGroup.OnCheckedChangeListener() {
                    // método por defecto
                    @Override
                    public void onCheckedChanged(RadioGroup radioGroup, int i) {

                        // DECLARACIÓN DE UNA VISTA CON LOS VALORES DEL RADIOFROUP
                        View radius = radioGroup.findViewById(i);
                        int indice = radios.indexOfChild(radius);// ver

                        TextView texti = rootie.findViewById(R.id.fragment_header);

                        // ADICIÓN DEL RADIO BUTTON
                        switch (indice) {
                            case YES:
                                texti.setText(R.string.yes_message);
                                // LLAMA AL EVENTO DEL RADIOBUTTON CON EL VALOR INT DE YES O NO
                                radioChoice = YES;
                                listen.radiusChoice(YES);
                                break;
                            case NO:
                                texti.setText(R.string.no_message);
                                radioChoice = NO;
                                listen.radiusChoice(NO);
                                break;
                            default:
                                radioChoice = NO;
                                listen.radiusChoice(NO);
                                break;
                        }
                    }
                });
        return rootie;
    }

    // CÓDIGO PARA ADHERIR MULTIPLES FRAGMENTS, SE DEBE DE NECESARIAMENTE CREAR NUEVAS INSTANCIAS

    public static FirtsFragment neoFragment(int choice){
        FirtsFragment fragment = new FirtsFragment();
        Bundle argumentos = new Bundle();
        argumentos.putInt(CHOICE, choice);

        fragment.setArguments(argumentos);
        //return new FirtsFragment(); --> old
        return fragment;
    }
}