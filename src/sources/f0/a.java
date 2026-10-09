package f0;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n1.e f26179a;

    public a(int i11) {
        switch (i11) {
            case 1:
                this.f26179a = new n1.e(new n0.j[16]);
                break;
            default:
                this.f26179a = new n1.e(new g[16]);
                break;
        }
    }

    public void a(CancellationException cancellationException) {
        n1.e eVar = this.f26179a;
        int i11 = eVar.f43114c;
        rz.l[] lVarArr = new rz.l[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            lVarArr[i12] = ((g) eVar.f43112a[i12]).f26276b;
        }
        for (int i13 = 0; i13 < i11; i13++) {
            lVarArr[i13].k(cancellationException);
        }
        if (eVar.f43114c == 0) {
            return;
        }
        i0.a.c("uncancelled requests present");
    }

    public void b() {
        n1.e eVar = this.f26179a;
        lz.g gVarU = hz.b.U(0, eVar.f43114c);
        int i11 = gVarU.f40532a;
        int i12 = gVarU.f40533b;
        if (i11 <= i12) {
            while (true) {
                ((g) eVar.f43112a[i11]).f26276b.resumeWith(qy.b0.f48488a);
                if (i11 == i12) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        eVar.h();
    }
}
