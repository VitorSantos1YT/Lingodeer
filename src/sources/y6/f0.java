package y6;

import android.util.SparseBooleanArray;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f57193a;

    static {
        new SparseBooleanArray();
        b7.a.j(!false);
        b7.f0.G(0);
    }

    public f0(n nVar) {
        this.f57193a = nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f0) {
            return this.f57193a.equals(((f0) obj).f57193a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f57193a.f57235a.hashCode();
    }
}
