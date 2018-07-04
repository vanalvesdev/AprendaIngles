package aula.vaan.aprendaingles.Fragment;


import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import aula.vaan.aprendaingles.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AnimaisFragment extends BaseFragment implements View.OnClickListener{

    private MediaPlayer mediaPlayer;

    public AnimaisFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_animais, container, false);

        view.findViewById(R.id.buttonDog).setOnClickListener(this);
        view.findViewById(R.id.buttonCat).setOnClickListener(this);
        view.findViewById(R.id.buttonLion).setOnClickListener(this);
        view.findViewById(R.id.buttonMonkey).setOnClickListener(this);
        view.findViewById(R.id.buttonSheep).setOnClickListener(this);
        view.findViewById(R.id.buttonCow).setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonDog:
                tocarSom(R.raw.dog);
                break;
            case R.id.buttonCat:
                tocarSom(R.raw.cat);
                break;
            case R.id.buttonLion:
                tocarSom(R.raw.lion);
                break;
            case R.id.buttonMonkey:
                tocarSom(R.raw.monkey);
                break;
            case R.id.buttonSheep:
                tocarSom(R.raw.sheep);
                break;
            case R.id.buttonCow:
                tocarSom(R.raw.cow);
                break;
        }
    }

}
