package y6;

import android.util.SparseBooleanArray;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseBooleanArray f57235a;

    public n(SparseBooleanArray sparseBooleanArray) {
        this.f57235a = sparseBooleanArray;
    }

    public final int a(int i11) {
        SparseBooleanArray sparseBooleanArray = this.f57235a;
        b7.a.g(i11, sparseBooleanArray.size());
        return sparseBooleanArray.keyAt(i11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            return this.f57235a.equals(((n) obj).f57235a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f57235a.hashCode();
    }
}
