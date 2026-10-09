package tu;

import com.lingodeer.data.model.uistate.LeaderBoardUiState;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class q implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LeaderBoardUiState f52619a;

    public q(LeaderBoardUiState leaderBoardUiState) {
        this.f52619a = leaderBoardUiState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && kotlin.jvm.internal.m.a(this.f52619a, ((q) obj).f52619a);
    }

    public final int hashCode() {
        return this.f52619a.hashCode();
    }

    public final String toString() {
        return "UpdateUiState(leaderBoardUiState=" + this.f52619a + ")";
    }
}
