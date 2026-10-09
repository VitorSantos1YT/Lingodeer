package zu;

import com.lingodeer.data.model.uistate.LeaderBoardUser;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c0 implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LeaderBoardUser f59385a;

    public c0(LeaderBoardUser user) {
        kotlin.jvm.internal.m.f(user, "user");
        this.f59385a = user;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c0) && kotlin.jvm.internal.m.a(this.f59385a, ((c0) obj).f59385a);
    }

    public final int hashCode() {
        return this.f59385a.hashCode();
    }

    public final String toString() {
        return "FollowUser(user=" + this.f59385a + ")";
    }
}
