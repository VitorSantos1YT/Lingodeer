package androidx.fragment.app;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i1 implements h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k1 f1697b;

    public i1(k1 k1Var, int i11) {
        this.f1697b = k1Var;
        this.f1696a = i11;
    }

    @Override // androidx.fragment.app.h1
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        k1 k1Var = this.f1697b;
        k0 k0Var = k1Var.A;
        int i11 = this.f1696a;
        if (k0Var == null || i11 >= 0 || !k0Var.getChildFragmentManager().U(-1, 0)) {
            return k1Var.V(arrayList, arrayList2, i11, 1);
        }
        return false;
    }
}
