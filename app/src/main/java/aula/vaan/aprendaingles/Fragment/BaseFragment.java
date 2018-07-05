package aula.vaan.aprendaingles.Fragment;

import android.media.MediaPlayer;
import android.support.v4.app.Fragment;

public class BaseFragment extends Fragment {

    protected MediaPlayer mediaPlayer;

    protected void tocarSom(int som) {

        mediaPlayer = MediaPlayer.create(getActivity(), som);
        mediaPlayer.start();

        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mediaPlayer.release();
            }
        });
    }


    @Override
    public void onDestroy() {
        super.onDestroy();

        if (mediaPlayer != null) {
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }
}
