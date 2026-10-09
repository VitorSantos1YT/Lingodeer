package tu;

import com.lingodeer.data.model.uistate.LeaderBoardUser;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class u implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LeaderBoardUser f52627a;

    public u(LeaderBoardUser user) {
        kotlin.jvm.internal.m.f(user, "user");
        this.f52627a = user;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && kotlin.jvm.internal.m.a(this.f52627a, ((u) obj).f52627a);
    }

    public final int hashCode() {
        return this.f52627a.hashCode();
    }

    public final String toString() {
        return "FollowUser(user=" + this.f52627a + ")";
    }
}
