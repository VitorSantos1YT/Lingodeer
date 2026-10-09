package y2;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 implements w2.r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f56990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f56991c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fz.c f56992d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fz.c f56993e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q0 f56994f;

    public p0(int i11, int i12, Map map, fz.c cVar, fz.c cVar2, q0 q0Var) {
        this.f56989a = i11;
        this.f56990b = i12;
        this.f56991c = map;
        this.f56992d = cVar;
        this.f56993e = cVar2;
        this.f56994f = q0Var;
    }

    @Override // w2.r0
    public final Map a() {
        return this.f56991c;
    }

    @Override // w2.r0
    public final void b() {
        this.f56993e.invoke(this.f56994f.N);
    }

    @Override // w2.r0
    public final fz.c c() {
        return this.f56992d;
    }

    @Override // w2.r0
    public final int f() {
        return this.f56990b;
    }

    @Override // w2.r0
    public final int h() {
        return this.f56989a;
    }
}
