package pingan.com.demo_4201;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;

/**
 * author : wizardev
 * e-mail : wizarddev@163.com
 * time   : 2017/09/15
 * desc   :
 * version: 1.0
 */
public class DisplayHelper {



    /**
     * DisplayMetrics
     * @return
     */
    public static DisplayMetrics getDisplayMetrics(Context context){
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getApplicationContext().getSystemService(Context.WINDOW_SERVICE))
                .getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }



    /**
     * 屏幕宽度
     * @return
     */
    public static int getScreenWidth(Context context){
        return getDisplayMetrics(context).widthPixels;
    }

    /**
     * 屏幕高度
     * @return
     */
    public static int getScreenHeight(Context context){
        return getDisplayMetrics(context).heightPixels;
    }


}
