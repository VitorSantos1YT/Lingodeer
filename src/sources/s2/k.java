package s2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n1.e f51320a = new n1.e(new j[16]);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y.e0 f51321b = new y.e0(10);

    public boolean a(y.r rVar, w2.x xVar, ie.o oVar, boolean z11) {
        n1.e eVar = this.f51320a;
        Object[] objArr = eVar.f43112a;
        int i11 = eVar.f43114c;
        boolean z12 = false;
        for (int i12 = 0; i12 < i11; i12++) {
            z12 = ((j) objArr[i12]).a(rVar, xVar, oVar, z11) || z12;
        }
        return z12;
    }

    public void b(ie.o oVar) {
        n1.e eVar = this.f51320a;
        int i11 = eVar.f43114c;
        while (true) {
            i11--;
            if (-1 >= i11) {
                return;
            }
            if (((j) eVar.f43112a[i11]).f51310d.f4013b == 0) {
                eVar.l(i11);
            }
        }
    }
}
