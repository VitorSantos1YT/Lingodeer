package y6;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f57339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f57340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f57341c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f57342d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f57343e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f57344f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f57345g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f57346h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ImmutableList f57347i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ImmutableList f57348j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ImmutableList f57349k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f57350l;
    public final int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ImmutableList f57351n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final r0 f57352o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ImmutableList f57353p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f57354q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f57355r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ImmutableMap f57356s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ImmutableSet f57357t;

    static {
        new t0(new s0());
        b7.f0.G(1);
        b7.f0.G(2);
        b7.f0.G(3);
        b7.f0.G(4);
        w4.c.s(5, 6, 7, 8, 9);
        w4.c.s(10, 11, 12, 13, 14);
        w4.c.s(15, 16, 17, 18, 19);
        w4.c.s(20, 21, 22, 23, 24);
        w4.c.s(25, 26, 27, 28, 29);
        w4.c.s(30, 31, 32, 33, 34);
    }

    public t0(s0 s0Var) {
        this.f57339a = s0Var.f57315a;
        this.f57340b = s0Var.f57316b;
        this.f57341c = s0Var.f57317c;
        this.f57342d = s0Var.f57318d;
        this.f57343e = s0Var.f57319e;
        this.f57344f = s0Var.f57320f;
        this.f57345g = s0Var.f57321g;
        this.f57346h = s0Var.f57322h;
        this.f57347i = s0Var.f57323i;
        this.f57348j = s0Var.f57324j;
        this.f57349k = s0Var.f57325k;
        this.f57350l = s0Var.f57326l;
        this.m = s0Var.m;
        this.f57351n = s0Var.f57327n;
        this.f57352o = s0Var.f57328o;
        this.f57353p = s0Var.f57329p;
        this.f57354q = s0Var.f57330q;
        this.f57355r = s0Var.f57331r;
        this.f57356s = ImmutableMap.b(s0Var.f57332s);
        this.f57357t = ImmutableSet.m(s0Var.f57333t);
    }

    public s0 a() {
        s0 s0Var = new s0();
        s0Var.c(this);
        return s0Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return this.f57339a == t0Var.f57339a && this.f57340b == t0Var.f57340b && this.f57341c == t0Var.f57341c && this.f57342d == t0Var.f57342d && this.f57346h == t0Var.f57346h && this.f57343e == t0Var.f57343e && this.f57344f == t0Var.f57344f && this.f57345g == t0Var.f57345g && this.f57347i.equals(t0Var.f57347i) && this.f57348j.equals(t0Var.f57348j) && this.f57349k.equals(t0Var.f57349k) && this.f57350l == t0Var.f57350l && this.m == t0Var.m && this.f57351n.equals(t0Var.f57351n) && this.f57352o.equals(t0Var.f57352o) && this.f57353p.equals(t0Var.f57353p) && this.f57354q == t0Var.f57354q && this.f57355r == t0Var.f57355r && this.f57356s.equals(t0Var.f57356s) && this.f57357t.equals(t0Var.f57357t);
    }

    public int hashCode() {
        int iHashCode = (this.f57351n.hashCode() + ((((((this.f57349k.hashCode() + ((this.f57348j.hashCode() + ((this.f57347i.hashCode() + ((((((((((((((((this.f57339a + 31) * 31) + this.f57340b) * 31) + this.f57341c) * 31) + this.f57342d) * 28629151) + (this.f57346h ? 1 : 0)) * 31) + this.f57343e) * 31) + this.f57344f) * 31) + (this.f57345g ? 1 : 0)) * 31)) * 31)) * 961)) * 961) + this.f57350l) * 31) + this.m) * 31)) * 31;
        this.f57352o.getClass();
        return this.f57357t.hashCode() + ((this.f57356s.hashCode() + ((((((this.f57353p.hashCode() + ((iHashCode + 29791) * 31)) * 961) + (this.f57354q ? 1 : 0)) * 31) + this.f57355r) * 28629151)) * 31);
    }
}
