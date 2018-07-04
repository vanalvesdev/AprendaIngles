package aula.vaan.aprendaingles.Activity;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ogaclejapan.smarttablayout.SmartTabLayout;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;

import aula.vaan.aprendaingles.Fragment.AnimaisFragment;
import aula.vaan.aprendaingles.Fragment.NumerosFragment;
import aula.vaan.aprendaingles.R;

public class MainActivity extends AppCompatActivity {

    private SmartTabLayout tabs;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Aprenda Inglês");
        getSupportActionBar().setElevation(0);

        FragmentPagerItemAdapter adapter = new FragmentPagerItemAdapter(
                getSupportFragmentManager(),
                FragmentPagerItems.with(this)
                .add("Animais", AnimaisFragment.class)
                .add("Números", NumerosFragment.class)
                .create()
        );

        viewPager = findViewById(R.id.viewpager);
        viewPager.setAdapter(adapter);
        tabs = findViewById(R.id.viewpagertab);
        tabs.setViewPager(viewPager);
    }
}
