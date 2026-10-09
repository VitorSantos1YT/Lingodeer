package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m1 f2626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2627b = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f2628c = new Rect();

    public u0(m1 m1Var) {
        this.f2626a = m1Var;
    }

    public static u0 a(m1 m1Var, int i11) {
        if (i11 == 0) {
            return new t0(m1Var, 0);
        }
        if (i11 == 1) {
            return new t0(m1Var, 1);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public abstract int b(View view);

    public abstract int c(View view);

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public final int m() {
        if (Integer.MIN_VALUE == this.f2627b) {
            return 0;
        }
        return l() - this.f2627b;
    }

    public abstract int n(View view);

    public abstract int o(View view);

    public abstract void p(int i11);
}
