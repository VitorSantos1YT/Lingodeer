package y2;

import rt.mc;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z1.q f56856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f56857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public n1.e f56858c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public n1.e f56859d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f56860e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mc f56861f;

    public f1(mc mcVar, z1.q qVar, int i11, n1.e eVar, n1.e eVar2, boolean z11) {
        this.f56861f = mcVar;
        this.f56856a = qVar;
        this.f56857b = i11;
        this.f56858c = eVar;
        this.f56859d = eVar2;
        this.f56860e = z11;
    }

    public final boolean a(int i11, int i12) {
        n1.e eVar = this.f56858c;
        int i13 = this.f56857b;
        z1.p pVar = (z1.p) eVar.f43112a[i11 + i13];
        z1.p pVar2 = (z1.p) this.f56859d.f43112a[i13 + i12];
        return kotlin.jvm.internal.m.a(pVar, pVar2) || pVar.getClass() == pVar2.getClass();
    }
}
