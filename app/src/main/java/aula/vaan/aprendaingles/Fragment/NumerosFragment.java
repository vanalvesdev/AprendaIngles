package aula.vaan.aprendaingles.Fragment;


import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import aula.vaan.aprendaingles.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class NumerosFragment extends BaseFragment implements View.OnClickListener{

    private MediaPlayer mediaPlayer;

    public NumerosFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_numeros, container, false);

        view.findViewById(R.id.buttonOne).setOnClickListener(this);
        view.findViewById(R.id.buttonTwo).setOnClickListener(this);
        view.findViewById(R.id.buttonThree).setOnClickListener(this);
        view.findViewById(R.id.buttonFour).setOnClickListener(this);
        view.findViewById(R.id.buttonFive).setOnClickListener(this);
        view.findViewById(R.id.buttonSix).setOnClickListener(this);

        return  view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonOne:
                tocarSom(R.raw.one);
                break;
            case R.id.buttonTwo:
                tocarSom(R.raw.two);
                break;
            case R.id.buttonThree:
                tocarSom(R.raw.three);
                break;
            case R.id.buttonFour:
                tocarSom(R.raw.four);
                break;
            case R.id.buttonFive:
                tocarSom(R.raw.five);
                break;
            case R.id.buttonSix:
                tocarSom(R.raw.six);
                break;
        }
    }
}
