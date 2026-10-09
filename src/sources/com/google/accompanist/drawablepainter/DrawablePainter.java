package com.google.accompanist.drawablepainter;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.d;
import com.bumptech.glide.g;
import f2.e;
import g2.p;
import g2.v;
import k2.b;
import kotlin.NoWhenBranchMatchedException;
import l1.f2;
import l1.k1;
import l1.t;
import qy.q;
import v3.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class DrawablePainter extends b implements f2 {
    public final k1 H;
    public final q K;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Drawable f7778f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final k1 f7779t;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7780a;

        static {
            int[] iArr = new int[m.values().length];
            try {
                iArr[m.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[m.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f7780a = iArr;
        }
    }

    public DrawablePainter(Drawable drawable) {
        kotlin.jvm.internal.m.f(drawable, "drawable");
        this.f7778f = drawable;
        this.f7779t = t.B(0);
        Object obj = DrawablePainterKt.f7783a;
        this.H = t.B(new e((drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) ? 9205357640488583168L : g.b(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight())));
        this.K = d.v(new DrawablePainter$callback$2(this));
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            return;
        }
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    @Override // l1.f2
    public final void a() {
        d();
    }

    @Override // k2.b
    public final boolean b(float f5) {
        this.f7778f.setAlpha(hz.b.l(hz.b.Q(f5 * 255), 0, 255));
        return true;
    }

    @Override // k2.b
    public final boolean c(p pVar) {
        this.f7778f.setColorFilter(pVar != null ? pVar.f28589a : null);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l1.f2
    public final void d() {
        Drawable drawable = this.f7778f;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        drawable.setVisible(false, false);
        drawable.setCallback(null);
    }

    @Override // k2.b
    public final void e(m layoutDirection) {
        kotlin.jvm.internal.m.f(layoutDirection, "layoutDirection");
        int i11 = WhenMappings.f7780a[layoutDirection.ordinal()];
        int i12 = 1;
        if (i11 == 1) {
            i12 = 0;
        } else if (i11 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        this.f7778f.setLayoutDirection(i12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l1.f2
    public final void f() {
        Drawable.Callback callback = (Drawable.Callback) this.K.getValue();
        Drawable drawable = this.f7778f;
        drawable.setCallback(callback);
        drawable.setVisible(true, true);
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }

    @Override // k2.b
    public final long h() {
        return ((e) this.H.getValue()).f26584a;
    }

    @Override // k2.b
    public final void i(i2.d dVar) {
        kotlin.jvm.internal.m.f(dVar, "<this>");
        v vVarX = dVar.j0().x();
        ((Number) this.f7779t.getValue()).intValue();
        int iQ = hz.b.Q(e.d(dVar.d()));
        int iQ2 = hz.b.Q(e.b(dVar.d()));
        Drawable drawable = this.f7778f;
        drawable.setBounds(0, 0, iQ, iQ2);
        try {
            vVarX.e();
            drawable.draw(g2.d.a(vVarX));
        } finally {
            vVarX.p();
        }
    }
}
