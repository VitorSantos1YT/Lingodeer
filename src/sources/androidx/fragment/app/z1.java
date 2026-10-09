package androidx.fragment.app;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f1891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1893c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1894d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1895e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1896f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f1897g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f1898h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f1899i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f1900j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CharSequence f1901k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1902l;
    public CharSequence m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ArrayList f1903n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList f1904o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f1905p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ArrayList f1906q;

    public final void b(FragmentContainerView fragmentContainerView, k0 k0Var, String str) {
        k0Var.mContainer = fragmentContainerView;
        k0Var.mInDynamicContainer = true;
        d(fragmentContainerView.getId(), k0Var, str, 1);
    }

    public final void c(y1 y1Var) {
        this.f1891a.add(y1Var);
        y1Var.f1881d = this.f1892b;
        y1Var.f1882e = this.f1893c;
        y1Var.f1883f = this.f1894d;
        y1Var.f1884g = this.f1895e;
    }

    public abstract void d(int i11, k0 k0Var, String str, int i12);

    public final void e(int i11, k0 k0Var, String str) {
        if (i11 == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        d(i11, k0Var, str, 2);
    }
}
