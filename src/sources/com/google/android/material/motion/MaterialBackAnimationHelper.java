package com.google.android.material.motion;

import android.content.Context;
import android.view.View;
import android.view.animation.PathInterpolator;
import com.google.logging.type.LogSeverity;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class MaterialBackAnimationHelper<V extends View> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PathInterpolator f14790a = new PathInterpolator(0.1f, 0.1f, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f14791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14792c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f14793d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f14794e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public f.a f14795f;

    public MaterialBackAnimationHelper(View view) {
        this.f14791b = view;
        Context context = view.getContext();
        this.f14792c = MotionUtils.c(context, R.attr.motionDurationMedium2, LogSeverity.NOTICE_VALUE);
        this.f14793d = MotionUtils.c(context, R.attr.motionDurationShort3, 150);
        this.f14794e = MotionUtils.c(context, R.attr.motionDurationShort2, 100);
    }
}
