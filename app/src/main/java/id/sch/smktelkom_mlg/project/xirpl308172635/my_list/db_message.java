package id.sch.smktelkom_mlg.project.xirpl308172635.my_list;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by WINDOWS 8.1 on 17/11/2016.
 */

public class db_message {
    public static void message(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }
}
