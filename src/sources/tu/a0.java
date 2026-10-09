package tu;

import com.lingodeer.data.model.uistate.LeaderBoardUser;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a0 implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LeaderBoardUser f52539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f52540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f52541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f52542d;

    public a0(LeaderBoardUser leaderBoardUser, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        kotlin.jvm.internal.m.f(leaderBoardUser, "leaderBoardUser");
        this.f52539a = leaderBoardUser;
        this.f52540b = arrayList;
        this.f52541c = arrayList2;
        this.f52542d = arrayList3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return kotlin.jvm.internal.m.a(this.f52539a, a0Var.f52539a) && this.f52540b.equals(a0Var.f52540b) && this.f52541c.equals(a0Var.f52541c) && this.f52542d.equals(a0Var.f52542d);
    }

    public final int hashCode() {
        return this.f52542d.hashCode() + nv.p.b(this.f52541c, nv.p.b(this.f52540b, this.f52539a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "Success(leaderBoardUser=" + this.f52539a + ", achievements=" + this.f52540b + ", achievementLanguages=" + this.f52541c + ", achievementLeaderBoards=" + this.f52542d + ")";
    }
}
