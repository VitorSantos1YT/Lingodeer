package ei;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f25601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f25602b;

    public h(List list, List rows) {
        kotlin.jvm.internal.m.f(rows, "rows");
        this.f25601a = list;
        this.f25602b = rows;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return kotlin.jvm.internal.m.a(this.f25601a, hVar.f25601a) && kotlin.jvm.internal.m.a(this.f25602b, hVar.f25602b);
    }

    public final int hashCode() {
        return this.f25602b.hashCode() + (this.f25601a.hashCode() * 31);
    }

    public final String toString() {
        return "ARAlphabetFormsTableUiState(headerCells=" + this.f25601a + ", rows=" + this.f25602b + ")";
    }
}
