package qu;

import com.lingodeer.data.model.uistate.LeaderBoardUser;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class x implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LeaderBoardUser f48421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.c f48422c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fz.c f48423d;

    public /* synthetic */ x(LeaderBoardUser leaderBoardUser, fz.c cVar, fz.c cVar2, int i11) {
        this.f48420a = i11;
        this.f48421b = leaderBoardUser;
        this.f48422c = cVar;
        this.f48423d = cVar2;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f48420a) {
            case 0:
                LeaderBoardUser leaderBoardUser = this.f48421b;
                if (leaderBoardUser.isFriend()) {
                    this.f48422c.invoke(leaderBoardUser);
                } else {
                    this.f48423d.invoke(leaderBoardUser);
                }
                break;
            default:
                LeaderBoardUser leaderBoardUser2 = this.f48421b;
                if (leaderBoardUser2.isFriend()) {
                    this.f48422c.invoke(leaderBoardUser2);
                } else {
                    this.f48423d.invoke(leaderBoardUser2);
                }
                break;
        }
        return b0.f48488a;
    }
}
