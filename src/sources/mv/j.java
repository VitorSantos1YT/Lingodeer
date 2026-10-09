package mv;

import rt.fb;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class j implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fb f42223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f42224b;

    public j(fb downloadUiState, String currentPlayingAudioKey) {
        kotlin.jvm.internal.m.f(downloadUiState, "downloadUiState");
        kotlin.jvm.internal.m.f(currentPlayingAudioKey, "currentPlayingAudioKey");
        this.f42223a = downloadUiState;
        this.f42224b = currentPlayingAudioKey;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return kotlin.jvm.internal.m.a(this.f42223a, jVar.f42223a) && kotlin.jvm.internal.m.a(this.f42224b, jVar.f42224b);
    }

    public final int hashCode() {
        return this.f42224b.hashCode() + (this.f42223a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(downloadUiState=" + this.f42223a + ", currentPlayingAudioKey=" + this.f42224b + ")";
    }
}
