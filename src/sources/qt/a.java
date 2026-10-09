package qt;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f48320a;

    public a(ArrayList arrayList) {
        this.f48320a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f48320a.equals(((a) obj).f48320a);
    }

    public final int hashCode() {
        return this.f48320a.hashCode();
    }

    public final String toString() {
        return "CompleteTestConfig(sections=" + this.f48320a + ")";
    }
}
