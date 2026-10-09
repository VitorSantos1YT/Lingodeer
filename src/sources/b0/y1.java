package b0;

import com.yalantis.ucrop.view.CropImageView;
import l1.b3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class y1 implements b3 {
    public final l1.g1 H;
    public boolean K;
    public final l1.k1 L;
    public s M;
    public final l1.i1 N;
    public boolean O;
    public final i1 P;
    public final /* synthetic */ c2 Q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j2 f3746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l1.k1 f3747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l1.k1 f3748c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l1.k1 f3749d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public w0 f3750e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public r1 f3751f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final l1.k1 f3752t;

    /* JADX WARN: Type inference failed for: r10v9, types: [java.lang.Object, java.util.Map] */
    public y1(c2 c2Var, Object obj, s sVar, j2 j2Var) {
        this.Q = c2Var;
        this.f3746a = j2Var;
        l1.k1 k1VarB = l1.t.B(obj);
        this.f3747b = k1VarB;
        Object objInvoke = null;
        l1.k1 k1VarB2 = l1.t.B(e.q(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, 7));
        this.f3748c = k1VarB2;
        this.f3749d = l1.t.B(new r1((c0) k1VarB2.getValue(), j2Var, obj, k1VarB.getValue(), sVar));
        this.f3752t = l1.t.B(Boolean.TRUE);
        this.H = new l1.g1(-1.0f);
        this.L = l1.t.B(obj);
        this.M = sVar;
        this.N = new l1.i1(b().d());
        Float f5 = (Float) t2.f3682a.get(j2Var);
        if (f5 != null) {
            float fFloatValue = f5.floatValue();
            s sVar2 = (s) j2Var.f3575a.invoke(obj);
            int iB = sVar2.b();
            for (int i11 = 0; i11 < iB; i11++) {
                sVar2.e(i11, fFloatValue);
            }
            objInvoke = this.f3746a.f3576b.invoke(sVar2);
        }
        this.P = e.q(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, objInvoke, 3);
    }

    public final r1 b() {
        return (r1) this.f3749d.getValue();
    }

    public final void d(long j11) {
        if (this.H.l() == -1.0f) {
            this.O = true;
            if (kotlin.jvm.internal.m.a(b().f3659c, b().f3660d)) {
                f(b().f3659c);
            } else {
                f(b().h(j11));
                this.M = b().f(j11);
            }
        }
    }

    public final void f(Object obj) {
        this.L.setValue(obj);
    }

    public final void g(Object obj, boolean z11) {
        r1 r1Var = this.f3751f;
        Object obj2 = r1Var != null ? r1Var.f3659c : null;
        l1.k1 k1Var = this.f3747b;
        boolean zA = kotlin.jvm.internal.m.a(obj2, k1Var.getValue());
        l1.i1 i1Var = this.N;
        l1.k1 k1Var2 = this.f3749d;
        if (zA) {
            k1Var2.setValue(new r1(this.P, this.f3746a, obj, obj, this.M.c()));
            this.K = true;
            i1Var.n(b().d());
            return;
        }
        l1.k1 k1Var3 = this.f3748c;
        c0 c0Var = (!z11 || this.O || (((c0) k1Var3.getValue()) instanceof i1)) ? (c0) k1Var3.getValue() : this.P;
        c2 c2Var = this.Q;
        long jE = c2Var.e();
        l1.k1 k1Var4 = c2Var.f3465h;
        k1Var2.setValue(new r1(jE <= 0 ? c0Var : new j1(c0Var, c2Var.e()), this.f3746a, obj, k1Var.getValue(), this.M));
        i1Var.n(b().d());
        this.K = false;
        k1Var4.setValue(Boolean.TRUE);
        if (c2Var.g()) {
            x1.p pVar = c2Var.f3466i;
            int size = pVar.size();
            long jMax = 0;
            for (int i11 = 0; i11 < size; i11++) {
                y1 y1Var = (y1) pVar.get(i11);
                jMax = Math.max(jMax, y1Var.N.l());
                y1Var.d(0L);
            }
            k1Var4.setValue(Boolean.FALSE);
        }
    }

    @Override // l1.b3
    public final Object getValue() {
        return this.L.getValue();
    }

    public final void h(Object obj, Object obj2, c0 c0Var) {
        this.f3747b.setValue(obj2);
        this.f3748c.setValue(c0Var);
        if (kotlin.jvm.internal.m.a(b().f3660d, obj) && kotlin.jvm.internal.m.a(b().f3659c, obj2)) {
            return;
        }
        g(obj, false);
    }

    public final void j(Object obj, c0 c0Var) {
        if (this.K) {
            r1 r1Var = this.f3751f;
            if (kotlin.jvm.internal.m.a(obj, r1Var != null ? r1Var.f3659c : null)) {
                return;
            }
        }
        l1.k1 k1Var = this.f3747b;
        boolean zA = kotlin.jvm.internal.m.a(k1Var.getValue(), obj);
        l1.g1 g1Var = this.H;
        if (zA && g1Var.l() == -1.0f) {
            return;
        }
        k1Var.setValue(obj);
        this.f3748c.setValue(c0Var);
        Object value = g1Var.l() == -3.0f ? obj : this.L.getValue();
        l1.k1 k1Var2 = this.f3752t;
        g(value, !((Boolean) k1Var2.getValue()).booleanValue());
        k1Var2.setValue(Boolean.valueOf(g1Var.l() == -3.0f));
        if (g1Var.l() >= CropImageView.DEFAULT_ASPECT_RATIO) {
            f(b().h((long) (g1Var.l() * b().d())));
        } else if (g1Var.l() == -3.0f) {
            f(obj);
        }
        this.K = false;
        g1Var.m(-1.0f);
    }

    public final String toString() {
        return "current value: " + this.L.getValue() + ", target: " + this.f3747b.getValue() + ", spec: " + ((c0) this.f3748c.getValue());
    }
}
