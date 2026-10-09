package yc;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements zc.a, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wc.v f57713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zc.d f57714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public fd.p f57715c;

    public s(wc.v vVar, gd.c cVar, fd.o oVar) {
        this.f57713a = vVar;
        zc.d dVarI = oVar.f27193a.I();
        this.f57714b = dVarI;
        cVar.g(dVarI);
        dVarI.a(this);
    }

    public static int f(int i11, int i12) {
        int i13 = i11 / i12;
        if ((i11 ^ i12) < 0 && i13 * i12 != i11) {
            i13--;
        }
        return i11 - (i13 * i12);
    }

    @Override // zc.a
    public final void b() {
        this.f57713a.invalidateSelf();
    }

    @Override // yc.c
    public final void c(List list, List list2) {
    }
}
