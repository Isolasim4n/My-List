package id.sch.smktelkom_mlg.project.xirpl308172635.my_list;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by WINDOWS 8.1 on 17/11/2016.
 */

public class PagerInput extends FragmentStatePagerAdapter {

    int tabCount;

    public PagerInput(FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                InputJadwal inputjadwal = new InputJadwal();
                return inputjadwal;
            case 1:
                InputTugas inputtugas = new InputTugas();
                return inputtugas;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
