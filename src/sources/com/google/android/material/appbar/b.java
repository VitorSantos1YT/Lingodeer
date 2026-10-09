package com.google.android.material.appbar;

import a5.j;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;
import com.google.android.material.progressindicator.DeterminateDrawable;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.util.ArrayList;
import java.util.Iterator;
import l.m0;
import v10.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f13872c;

    public /* synthetic */ b(int i11, Object obj, Object obj2) {
        this.f13870a = i11;
        this.f13871b = obj;
        this.f13872c = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i11 = this.f13870a;
        Object obj = this.f13872c;
        Object obj2 = this.f13871b;
        switch (i11) {
            case 0:
                AppBarLayout appBarLayout = (AppBarLayout) obj2;
                int i12 = AppBarLayout.f13787g0;
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((MaterialShapeDrawable) obj).q(fFloatValue);
                Drawable drawable = appBarLayout.f13793c0;
                if (drawable instanceof MaterialShapeDrawable) {
                    ((MaterialShapeDrawable) drawable).q(fFloatValue);
                }
                ArrayList arrayList = appBarLayout.T;
                int size = arrayList.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj3 = arrayList.get(i13);
                    i13++;
                    ((AppBarLayout.LiftOnScrollListener) obj3).a();
                }
                Iterator it = appBarLayout.U.iterator();
                while (it.hasNext()) {
                    ((AppBarLayout.LiftOnScrollProgressListener) it.next()).a(fFloatValue / appBarLayout.f13797e0);
                }
                break;
            case 1:
                DeterminateDrawable determinateDrawable = (DeterminateDrawable) obj2;
                BaseProgressIndicatorSpec baseProgressIndicatorSpec = (BaseProgressIndicatorSpec) obj;
                c cVar = DeterminateDrawable.f15012a0;
                determinateDrawable.getClass();
                if (baseProgressIndicatorSpec.b(true) && baseProgressIndicatorSpec.m != 0 && determinateDrawable.isVisible()) {
                    determinateDrawable.invalidateSelf();
                    break;
                }
                break;
            default:
                ((View) ((m0) ((j) obj2).f385b).f39038d.getParent()).invalidate();
                break;
        }
    }
}
