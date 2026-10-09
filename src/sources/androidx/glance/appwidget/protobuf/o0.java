package androidx.glance.appwidget.protobuf;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 implements w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f1984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y0 f1985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f1986c;

    public o0(y0 y0Var, o oVar, a aVar) {
        this.f1985b = y0Var;
        oVar.getClass();
        this.f1986c = oVar;
        this.f1984a = aVar;
    }

    @Override // androidx.glance.appwidget.protobuf.w0
    public final void a(Object obj, Object obj2) {
        x0.k(this.f1985b, obj, obj2);
    }

    @Override // androidx.glance.appwidget.protobuf.w0
    public final void b(Object obj) {
        ((a1) this.f1985b).getClass();
        z0 z0Var = ((x) obj).unknownFields;
        if (z0Var.f2016e) {
            z0Var.f2016e = false;
        }
        this.f1986c.getClass();
        hh.p0.z(obj);
        throw null;
    }

    @Override // androidx.glance.appwidget.protobuf.w0
    public final boolean c(Object obj) {
        this.f1986c.getClass();
        hh.p0.z(obj);
        throw null;
    }

    @Override // androidx.glance.appwidget.protobuf.w0
    public final x d() {
        a aVar = this.f1984a;
        return aVar instanceof x ? ((x) aVar).h() : ((u) ((x) aVar).b(w.NEW_BUILDER)).c();
    }

    @Override // androidx.glance.appwidget.protobuf.w0
    public final int e(x xVar) {
        ((a1) this.f1985b).getClass();
        z0 z0Var = xVar.unknownFields;
        int i11 = z0Var.f2015d;
        if (i11 != -1) {
            return i11;
        }
        int iY = 0;
        for (int i12 = 0; i12 < z0Var.f2012a; i12++) {
            int i13 = z0Var.f2013b[i12] >>> 3;
            iY += l.Y(3, (h) z0Var.f2014c[i12]) + l.b0(i13) + l.a0(2) + (l.a0(1) * 2);
        }
        z0Var.f2015d = iY;
        return iY;
    }

    @Override // androidx.glance.appwidget.protobuf.w0
    public final void f(Object obj, k kVar, n nVar) {
        this.f1985b.a(obj);
        this.f1986c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // androidx.glance.appwidget.protobuf.w0
    public final int g(x xVar) {
        ((a1) this.f1985b).getClass();
        return xVar.unknownFields.hashCode();
    }

    @Override // androidx.glance.appwidget.protobuf.w0
    public final void h(Object obj, h0 h0Var) {
        this.f1986c.getClass();
        hh.p0.z(obj);
        throw null;
    }

    @Override // androidx.glance.appwidget.protobuf.w0
    public final boolean i(x xVar, x xVar2) {
        a1 a1Var = (a1) this.f1985b;
        a1Var.getClass();
        z0 z0Var = xVar.unknownFields;
        a1Var.getClass();
        return z0Var.equals(xVar2.unknownFields);
    }
}
