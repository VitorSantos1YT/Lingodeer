package v5;

import android.util.SparseArray;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseArray f53555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v f53556b;

    public s(int i11) {
        this.f53555a = new SparseArray(i11);
    }

    public final void a(v vVar, int i11, int i12) {
        int iA = vVar.a(i11);
        SparseArray sparseArray = this.f53555a;
        s sVar = sparseArray == null ? null : (s) sparseArray.get(iA);
        if (sVar == null) {
            sVar = new s(1);
            sparseArray.put(vVar.a(i11), sVar);
        }
        if (i12 > i11) {
            sVar.a(vVar, i11 + 1, i12);
        } else {
            sVar.f53556b = vVar;
        }
    }
}
