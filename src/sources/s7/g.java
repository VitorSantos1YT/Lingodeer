package s7;

import y6.p0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends o implements Comparable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f51419e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f51420f;

    public g(int i11, p0 p0Var, int i12, j jVar, int i13) {
        int i14;
        super(i11, p0Var, i12);
        this.f51419e = f7.e.n(i13, jVar.f51434z) ? 1 : 0;
        y6.p pVar = this.f51446d;
        int i15 = pVar.f57298u;
        int i16 = -1;
        if (i15 != -1 && (i14 = pVar.f57299v) != -1) {
            i16 = i15 * i14;
        }
        this.f51420f = i16;
    }

    @Override // s7.o
    public final int a() {
        return this.f51419e;
    }

    @Override // s7.o
    public final /* bridge */ /* synthetic */ boolean b(o oVar) {
        return false;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f51420f, ((g) obj).f51420f);
    }
}
