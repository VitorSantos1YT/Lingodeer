package w2;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 implements r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f54495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f54496c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fz.c f54497d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h0 f54498e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m0 f54499f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ fz.c f54500g;

    public g0(int i11, int i12, Map map, fz.c cVar, h0 h0Var, m0 m0Var, fz.c cVar2) {
        this.f54494a = i11;
        this.f54495b = i12;
        this.f54496c = map;
        this.f54497d = cVar;
        this.f54498e = h0Var;
        this.f54499f = m0Var;
        this.f54500g = cVar2;
    }

    @Override // w2.r0
    public final Map a() {
        return this.f54496c;
    }

    @Override // w2.r0
    public final void b() {
        y2.u uVar;
        y2.i0 i0Var = this.f54499f.f54542a;
        boolean zC0 = this.f54498e.c0();
        fz.c cVar = this.f54500g;
        if (!zC0 || (uVar = ((y2.v) i0Var.f56892i0.f50086d).f57012u0) == null) {
            cVar.invoke(((y2.v) i0Var.f56892i0.f50086d).N);
        } else {
            cVar.invoke(uVar.N);
        }
    }

    @Override // w2.r0
    public final fz.c c() {
        return this.f54497d;
    }

    @Override // w2.r0
    public final int f() {
        return this.f54495b;
    }

    @Override // w2.r0
    public final int h() {
        return this.f54494a;
    }
}
