package s7;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import y6.q0;
import y6.s0;
import y6.t0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends s0 {
    public final boolean A;
    public final SparseArray B;
    public final SparseBooleanArray C;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f51423u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f51424v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f51425w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f51426x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f51427y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final boolean f51428z;

    public i(j jVar) {
        c(jVar);
        this.f51423u = jVar.f51429u;
        this.f51424v = jVar.f51430v;
        this.f51425w = jVar.f51431w;
        this.f51426x = jVar.f51432x;
        this.f51427y = jVar.f51433y;
        this.f51428z = jVar.f51434z;
        this.A = jVar.A;
        SparseArray sparseArray = jVar.B;
        SparseArray sparseArray2 = new SparseArray();
        for (int i11 = 0; i11 < sparseArray.size(); i11++) {
            sparseArray2.put(sparseArray.keyAt(i11), new HashMap((Map) sparseArray.valueAt(i11)));
        }
        this.B = sparseArray2;
        this.C = jVar.C.clone();
    }

    @Override // y6.s0
    public final t0 a() {
        return new j(this);
    }

    @Override // y6.s0
    public final s0 b(int i11) {
        super.b(i11);
        return this;
    }

    @Override // y6.s0
    public final s0 d() {
        this.f57331r = -3;
        return this;
    }

    @Override // y6.s0
    public final s0 e(q0 q0Var) {
        super.e(q0Var);
        return this;
    }

    @Override // y6.s0
    public final s0 f() {
        super.f();
        return this;
    }

    @Override // y6.s0
    public final s0 g(String[] strArr) {
        super.g(strArr);
        return this;
    }

    @Override // y6.s0
    public final s0 h() {
        this.f57330q = false;
        return this;
    }

    @Override // y6.s0
    public final s0 i(int i11, boolean z11) {
        super.i(i11, z11);
        return this;
    }

    public final void j(Set set) {
        this.f57333t.clear();
        this.f57333t.addAll(set);
    }

    public i() {
        this.B = new SparseArray();
        this.C = new SparseBooleanArray();
        this.f51423u = true;
        this.f51424v = true;
        this.f51425w = true;
        this.f51426x = true;
        this.f51427y = true;
        this.f51428z = true;
        this.A = true;
    }
}
