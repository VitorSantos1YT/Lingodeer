package com.google.android.material.bottomsheet;

import android.view.View;
import androidx.datastore.preferences.protobuf.l;
import com.google.android.material.animation.AnimationUtils;
import com.yalantis.ucrop.view.CropImageView;
import java.util.Iterator;
import java.util.List;
import qp.o2;
import z4.g1;
import z4.v1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
class InsetsAnimationCallback extends l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f14043c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f14044d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f14045e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f14046f;

    public InsetsAnimationCallback(View view) {
        super(0);
        this.f14046f = new int[2];
        this.f14043c = view;
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final void d(g1 g1Var) {
        this.f14043c.setTranslationY(CropImageView.DEFAULT_ASPECT_RATIO);
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final void f(g1 g1Var) {
        View view = this.f14043c;
        int[] iArr = this.f14046f;
        view.getLocationOnScreen(iArr);
        this.f14044d = iArr[1];
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final v1 g(v1 v1Var, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            g1 g1Var = (g1) it.next();
            if ((g1Var.f58839a.d() & 8) != 0) {
                this.f14043c.setTranslationY(AnimationUtils.c(this.f14045e, g1Var.f58839a.c(), 0));
                break;
            }
        }
        return v1Var;
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final o2 h(g1 g1Var, o2 o2Var) {
        View view = this.f14043c;
        int[] iArr = this.f14046f;
        view.getLocationOnScreen(iArr);
        int i11 = this.f14044d - iArr[1];
        this.f14045e = i11;
        view.setTranslationY(i11);
        return o2Var;
    }
}
