package zr;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f59323a;

    public s(List list) {
        this.f59323a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && this.f59323a.equals(((s) obj).f59323a);
    }

    public final int hashCode() {
        return this.f59323a.hashCode();
    }

    public final String toString() {
        return "Success(pages=" + this.f59323a + ")";
    }
}
