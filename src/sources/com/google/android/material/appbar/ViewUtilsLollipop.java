package com.google.android.material.appbar;

import android.R;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
class ViewUtilsLollipop {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f13865a = {R.attr.stateListAnimator};

    public static void a(AppBarLayout appBarLayout, float f5) {
        int integer = appBarLayout.getResources().getInteger(com.lingodeer.R.integer.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j11 = integer;
        stateListAnimator.addState(new int[]{R.attr.state_enabled, com.lingodeer.R.attr.state_liftable, -2130970016}, ObjectAnimator.ofFloat(appBarLayout, "elevation", CropImageView.DEFAULT_ASPECT_RATIO).setDuration(j11));
        stateListAnimator.addState(new int[]{R.attr.state_enabled}, ObjectAnimator.ofFloat(appBarLayout, "elevation", f5).setDuration(j11));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(appBarLayout, "elevation", CropImageView.DEFAULT_ASPECT_RATIO).setDuration(0L));
        appBarLayout.setStateListAnimator(stateListAnimator);
    }
}
