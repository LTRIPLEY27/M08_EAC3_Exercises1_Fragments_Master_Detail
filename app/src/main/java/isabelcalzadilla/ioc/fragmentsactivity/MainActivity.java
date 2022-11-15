package isabelcalzadilla.ioc.fragmentsactivity;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import java.util.List;

import isabelcalzadilla.ioc.fragmentsactivity.content.Data;

// implementamos la INTERFACE DECLARADA COMO LISTENER PARA RECIBIR LOS DATOS QUE SE GENEREN ALLÍ
public class MainActivity extends AppCompatActivity {

    //private final List<String> prueba = Arrays.asList("Aristotles", "Plato", "Nietzsche", "Schopenhauer");
    private RecyclerView rec;

    private boolean isOk = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // RECYCLER VIEW
        rec = findViewById(R.id.recycler_fragment);
        rec.setAdapter(new RecyclerItems(Data.PHILOSOPHERS));

        // éste condicional verifica la pantalla, si el fragment no es null activa la vista para múltiples fragments en TABLET, en caso contrario solo permanece activa la del teléfono, en caso
        if(findViewById(R.id.detail) != null){
            isOk = true;
        }
    }

    //********************************************

        // LLAMADO AL RECYCLER
    //********************************************

    class RecyclerItems extends RecyclerView.Adapter <RecyclerItems.ViewHolder>{

        //private final List <String> items = new ArrayList<>();
        private final List <Data.Author> items;

        public RecyclerItems(List<Data.Author> prueba) {
            items = prueba;
        }

        public class ViewHolder extends RecyclerView.ViewHolder {

            final View view;
            //final TextView texti_aut;
            final TextView id_aut;
            final TextView texti_bio;
            Data.Author author;

            public ViewHolder(@NonNull View itemView) {
                super(itemView);
                this.view = itemView;
                this.id_aut = view.findViewById(R.id.content);
                this.texti_bio = view.findViewById(R.id.content);
            }

        }

        @NonNull
        @Override
        public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

            View view = LayoutInflater.from(viewGroup.getContext())
                    .inflate(R.layout.content_fragment, viewGroup, false);
            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(final ViewHolder viewHolder, int i) {
            viewHolder.author = items.get(i);
            viewHolder.id_aut.setText(String.valueOf(i + 1));
            viewHolder.texti_bio.setText(items.get(i).author_name);
            viewHolder.view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(isOk){
                        int index = viewHolder.getAdapterPosition();

                        DetailFragment fragment = DetailFragment.newInstance(index);
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.detail, fragment) // --VERIFICAR LAS ACTIVITYS
                                .addToBackStack(null)
                                .commit();
                    } else {
                        Context context = view.getContext();
                        Intent intento = new Intent(context, ActivityDetail.class);

                        intento.putExtra(Data.KEY_VALUE, viewHolder.getAdapterPosition());

                        context.startActivity(intento);
                    }
                }
            });
        }

        @Override
        public int getItemCount() {
            return items.size();
        }

    }
}