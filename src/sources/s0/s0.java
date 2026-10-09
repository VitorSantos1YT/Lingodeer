package s0;

import l1.x1;
import rt.v7;
import z2.i2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 {
    public final l1.k1 A;
    public final l1.k1 B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z0 f51166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x1 f51167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i2 f51168c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ob.c f51169d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public o3.c0 f51170e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l1.k1 f51171f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l1.k1 f51172g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public w2.x f51173h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l1.k1 f51174i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public j3.h f51175j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final l1.k1 f51176k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final l1.k1 f51177l;
    public final l1.k1 m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final l1.k1 f51178n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final l1.k1 f51179o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f51180p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final l1.k1 f51181q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final p0 f51182r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final l1.k1 f51183s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final l1.k1 f51184t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public fz.c f51185u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final w f51186v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final w f51187w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final w f51188x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final a.a f51189y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f51190z;

    public s0(z0 z0Var, x1 x1Var, i2 i2Var) {
        this.f51166a = z0Var;
        this.f51167b = x1Var;
        this.f51168c = i2Var;
        ob.c cVar = new ob.c(24);
        j3.h hVar = j3.i.f35705a;
        long j11 = j3.x0.f35821b;
        o3.w wVar = new o3.w(hVar, j11, (j3.x0) null);
        cVar.f44799b = wVar;
        cVar.f44800c = new b7.p(hVar, wVar.f44705b);
        this.f51169d = cVar;
        Boolean bool = Boolean.FALSE;
        this.f51171f = l1.t.B(bool);
        this.f51172g = l1.t.B(new v3.f(0));
        this.f51174i = l1.t.B(null);
        this.f51176k = l1.t.B(h0.None);
        this.f51177l = l1.t.B(bool);
        this.m = l1.t.B(bool);
        this.f51178n = l1.t.B(bool);
        this.f51179o = l1.t.B(bool);
        this.f51180p = true;
        this.f51181q = l1.t.B(Boolean.TRUE);
        this.f51182r = new p0(i2Var);
        this.f51183s = l1.t.B(bool);
        this.f51184t = l1.t.B(bool);
        this.f51185u = new v7(16);
        this.f51186v = new w(this, 1);
        this.f51187w = new w(this, 2);
        this.f51188x = new w(this, 3);
        this.f51189y = g2.f0.h();
        this.f51190z = g2.x.f28622i;
        this.A = l1.t.B(new j3.x0(j11));
        this.B = l1.t.B(new j3.x0(j11));
    }

    public final h0 a() {
        return (h0) this.f51176k.getValue();
    }

    public final boolean b() {
        return ((Boolean) this.f51171f.getValue()).booleanValue();
    }

    public final w2.x c() {
        w2.x xVar = this.f51173h;
        if (xVar == null || !xVar.k()) {
            return null;
        }
        return xVar;
    }

    public final o1 d() {
        return (o1) this.f51174i.getValue();
    }

    public final void e(long j11) {
        this.B.setValue(new j3.x0(j11));
    }

    public final void f(long j11) {
        this.A.setValue(new j3.x0(j11));
    }
}
