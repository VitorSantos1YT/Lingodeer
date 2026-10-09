package androidx.compose.material.ripple;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.animation.AnimationUtils;
import b2.a;
import f2.b;
import f2.e;
import g1.l;
import g2.f0;
import g2.x;
import h0.k;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class RippleHostView extends View {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f1121f = {R.attr.state_pressed, R.attr.state_enabled};

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int[] f1122t = new int[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l f1123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Boolean f1124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Long f1125c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f1126d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public fz.a f1127e;

    public RippleHostView(Context context) {
        super(context);
    }

    private final void setRippleState(boolean z11) {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.f1126d;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l9 = this.f1125c;
        long jLongValue = jCurrentAnimationTimeMillis - (l9 != null ? l9.longValue() : 0L);
        if (z11 || jLongValue >= 5) {
            int[] iArr = z11 ? f1121f : f1122t;
            l lVar = this.f1123a;
            if (lVar != null) {
                lVar.setState(iArr);
            }
        } else {
            a aVar = new a(this, 17);
            this.f1126d = aVar;
            postDelayed(aVar, 50L);
        }
        this.f1125c = Long.valueOf(jCurrentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$2(RippleHostView rippleHostView) {
        l lVar = rippleHostView.f1123a;
        if (lVar != null) {
            lVar.setState(f1122t);
        }
        rippleHostView.f1126d = null;
    }

    public final void b(k kVar, boolean z11, long j11, int i11, long j12, float f5, fz.a aVar) {
        if (this.f1123a == null || !Boolean.valueOf(z11).equals(this.f1124b)) {
            l lVar = new l(z11);
            setBackground(lVar);
            this.f1123a = lVar;
            this.f1124b = Boolean.valueOf(z11);
        }
        l lVar2 = this.f1123a;
        m.c(lVar2);
        this.f1127e = aVar;
        e(f5, j11, j12, i11);
        if (z11) {
            lVar2.setHotspot(b.e(kVar.f29908a), b.f(kVar.f29908a));
        } else {
            lVar2.setHotspot(lVar2.getBounds().centerX(), lVar2.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void c() {
        this.f1127e = null;
        a aVar = this.f1126d;
        if (aVar != null) {
            removeCallbacks(aVar);
            a aVar2 = this.f1126d;
            m.c(aVar2);
            aVar2.run();
        } else {
            l lVar = this.f1123a;
            if (lVar != null) {
                lVar.setState(f1122t);
            }
        }
        l lVar2 = this.f1123a;
        if (lVar2 == null) {
            return;
        }
        lVar2.setVisible(false, false);
        unscheduleDrawable(lVar2);
    }

    public final void d() {
        setRippleState(false);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (isAttachedToWindow()) {
            super.draw(canvas);
        } else {
            c();
        }
    }

    public final void e(float f5, long j11, long j12, int i11) {
        l lVar = this.f1123a;
        if (lVar == null) {
            return;
        }
        Integer num = lVar.f28535c;
        if (num == null || num.intValue() != i11) {
            lVar.f28535c = Integer.valueOf(i11);
            lVar.setRadius(i11);
        }
        if (Build.VERSION.SDK_INT < 28) {
            f5 *= 2;
        }
        if (f5 > 1.0f) {
            f5 = 1.0f;
        }
        long jC = x.c(j12, f5);
        x xVar = lVar.f28534b;
        if (!(xVar == null ? false : x.d(xVar.f28624a, jC))) {
            lVar.f28534b = new x(jC);
            lVar.setColor(ColorStateList.valueOf(f0.E(jC)));
        }
        Rect rect = new Rect(0, 0, hz.b.Q(e.d(j11)), hz.b.Q(e.b(j11)));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        lVar.setBounds(rect);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        fz.a aVar = this.f1127e;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i11, int i12) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
    }
}
