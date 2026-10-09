package s7;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import b7.f0;
import java.util.Map;
import java.util.Objects;
import p7.g1;
import y6.s0;
import y6.t0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends t0 {
    public static final j D = new j(new i());
    public final boolean A;
    public final SparseArray B;
    public final SparseBooleanArray C;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f51429u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f51430v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f51431w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f51432x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f51433y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final boolean f51434z;

    static {
        w4.c.s(1000, 1001, 1002, 1003, 1004);
        w4.c.s(1005, 1006, 1007, 1008, 1009);
        w4.c.s(1010, 1011, 1012, 1013, 1014);
        f0.G(1015);
        f0.G(1016);
        f0.G(1017);
        f0.G(1018);
    }

    public j(i iVar) {
        super(iVar);
        this.f51429u = iVar.f51423u;
        this.f51430v = iVar.f51424v;
        this.f51431w = iVar.f51425w;
        this.f51432x = iVar.f51426x;
        this.f51433y = iVar.f51427y;
        this.f51434z = iVar.f51428z;
        this.A = iVar.A;
        this.B = iVar.B;
        this.C = iVar.C;
    }

    @Override // y6.t0
    public final s0 a() {
        return new i(this);
    }

    @Override // y6.t0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass()) {
            j jVar = (j) obj;
            if (super.equals(jVar) && this.f51429u == jVar.f51429u && this.f51430v == jVar.f51430v && this.f51431w == jVar.f51431w && this.f51432x == jVar.f51432x && this.f51433y == jVar.f51433y && this.f51434z == jVar.f51434z && this.A == jVar.A) {
                SparseBooleanArray sparseBooleanArray = jVar.C;
                SparseBooleanArray sparseBooleanArray2 = this.C;
                int size = sparseBooleanArray2.size();
                if (sparseBooleanArray.size() == size) {
                    for (int i11 = 0; i11 < size; i11++) {
                        if (sparseBooleanArray.indexOfKey(sparseBooleanArray2.keyAt(i11)) >= 0) {
                        }
                    }
                    SparseArray sparseArray = jVar.B;
                    SparseArray sparseArray2 = this.B;
                    int size2 = sparseArray2.size();
                    if (sparseArray.size() == size2) {
                        for (int i12 = 0; i12 < size2; i12++) {
                            int iIndexOfKey = sparseArray.indexOfKey(sparseArray2.keyAt(i12));
                            if (iIndexOfKey >= 0) {
                                Map map = (Map) sparseArray2.valueAt(i12);
                                Map map2 = (Map) sparseArray.valueAt(iIndexOfKey);
                                if (map2.size() == map.size()) {
                                    for (Map.Entry entry : map.entrySet()) {
                                        g1 g1Var = (g1) entry.getKey();
                                        if (!map2.containsKey(g1Var) || !Objects.equals(entry.getValue(), map2.get(g1Var))) {
                                        }
                                    }
                                }
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // y6.t0
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.f51429u ? 1 : 0)) * 961) + (this.f51430v ? 1 : 0)) * 961) + (this.f51431w ? 1 : 0)) * 28629151) + (this.f51432x ? 1 : 0)) * 31) + (this.f51433y ? 1 : 0)) * 31) + (this.f51434z ? 1 : 0)) * 961) + (this.A ? 1 : 0)) * 31;
    }
}
