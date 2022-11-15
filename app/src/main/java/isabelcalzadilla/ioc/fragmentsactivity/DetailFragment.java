package isabelcalzadilla.ioc.fragmentsactivity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import isabelcalzadilla.ioc.fragmentsactivity.content.Data;


public class DetailFragment extends Fragment {

    // LLAMADA A LA CLASE DE LA CARPETA CONTENT
    public Data.Author instance;

    public DetailFragment() {
        // Required empty public constructor
    }


    public static DetailFragment newInstance(int selected) {
        DetailFragment fragment = new DetailFragment();
        Bundle args = new Bundle();

        args.putInt(Data.KEY_VALUE, selected);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments().containsKey(Data.KEY_VALUE)) {
            instance = Data.PHILOSOPHERS.get(getArguments().getInt(Data.KEY_VALUE));
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View adjunt = inflater.inflate(R.layout.fragment_detail, container, false);

        if(instance != null){
            //((TextView) adjunt.findViewById(R.id.detail)).setText(instance.author_name);
            ((TextView) adjunt.findViewById(R.id.detail)).setText(instance.author_work);
        }
        return adjunt;
    }
}