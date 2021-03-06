package com.example.madmovegame.utility;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class MadMoveUtils {

    /**
     * For SetUp Animation
     * @param context
     * @param desiredAnimation
     */
    public static void setAnimation(Context context, int desiredAnimation, View view) {

        Animation animation = AnimationUtils.loadAnimation(context,desiredAnimation);

        view.startAnimation(animation);
    }

}
