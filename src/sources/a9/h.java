package a9;

import android.text.Layout;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f500d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f501e;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f507k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f508l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Layout.Alignment f510o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Layout.Alignment f511p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public b f513r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f515t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f516u;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f502f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f503g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f504h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f505i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f506j = -1;
    public int m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f509n = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f512q = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f514s = Float.MAX_VALUE;

    public final void a(h hVar) {
        int i11;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (hVar != null) {
            if (!this.f499c && hVar.f499c) {
                this.f498b = hVar.f498b;
                this.f499c = true;
            }
            if (this.f504h == -1) {
                this.f504h = hVar.f504h;
            }
            if (this.f505i == -1) {
                this.f505i = hVar.f505i;
            }
            if (this.f497a == null && (str = hVar.f497a) != null) {
                this.f497a = str;
            }
            if (this.f502f == -1) {
                this.f502f = hVar.f502f;
            }
            if (this.f503g == -1) {
                this.f503g = hVar.f503g;
            }
            if (this.f509n == -1) {
                this.f509n = hVar.f509n;
            }
            if (this.f510o == null && (alignment2 = hVar.f510o) != null) {
                this.f510o = alignment2;
            }
            if (this.f511p == null && (alignment = hVar.f511p) != null) {
                this.f511p = alignment;
            }
            if (this.f512q == -1) {
                this.f512q = hVar.f512q;
            }
            if (this.f506j == -1) {
                this.f506j = hVar.f506j;
                this.f507k = hVar.f507k;
            }
            if (this.f513r == null) {
                this.f513r = hVar.f513r;
            }
            if (this.f514s == Float.MAX_VALUE) {
                this.f514s = hVar.f514s;
            }
            if (this.f515t == null) {
                this.f515t = hVar.f515t;
            }
            if (this.f516u == null) {
                this.f516u = hVar.f516u;
            }
            if (!this.f501e && hVar.f501e) {
                this.f500d = hVar.f500d;
                this.f501e = true;
            }
            if (this.m != -1 || (i11 = hVar.m) == -1) {
                return;
            }
            this.m = i11;
        }
    }
}
