package zu;

import com.lingodeer.data.model.uistate.LeaderBoardUser;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c1 implements d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LeaderBoardUser f59386a;

    public c1(LeaderBoardUser user) {
        kotlin.jvm.internal.m.f(user, "user");
        this.f59386a = user;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c1) && kotlin.jvm.internal.m.a(this.f59386a, ((c1) obj).f59386a);
    }

    public final int hashCode() {
        return this.f59386a.hashCode();
    }

    public final String toString() {
        return "UnFollowUser(user=" + this.f59386a + ")";
    }
}
