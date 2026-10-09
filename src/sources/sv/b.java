package sv;

import rt.fb;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fb f51794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f51795b;

    public b(fb downloadUiState, String currentPlayingSyllable) {
        kotlin.jvm.internal.m.f(downloadUiState, "downloadUiState");
        kotlin.jvm.internal.m.f(currentPlayingSyllable, "currentPlayingSyllable");
        this.f51794a = downloadUiState;
        this.f51795b = currentPlayingSyllable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return kotlin.jvm.internal.m.a(this.f51794a, bVar.f51794a) && kotlin.jvm.internal.m.a(this.f51795b, bVar.f51795b);
    }

    public final int hashCode() {
        return this.f51795b.hashCode() + (this.f51794a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(downloadUiState=" + this.f51794a + ", currentPlayingSyllable=" + this.f51795b + ")";
    }
}
