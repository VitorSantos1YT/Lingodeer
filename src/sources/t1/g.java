package t1;

import java.util.Set;
import l1.f2;
import l1.g2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f51989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n1.e f51990b = new n1.e(new g2[16]);

    public g(Set set) {
        this.f51989a = set;
    }

    @Override // l1.f2
    public final void f() {
        n1.e eVar = this.f51990b;
        Object[] objArr = eVar.f43112a;
        int i11 = eVar.f43114c;
        for (int i12 = 0; i12 < i11; i12++) {
            f2 f2Var = ((g2) objArr[i12]).f39309a;
            this.f51989a.remove(f2Var);
            f2Var.f();
        }
    }

    @Override // l1.f2
    public final void a() {
    }

    @Override // l1.f2
    public final void d() {
    }
}
