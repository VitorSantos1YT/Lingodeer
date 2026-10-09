package qu;

import com.lingodeer.data.model.uistate.LeaderBoardUser;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.c f48367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LeaderBoardUser f48368c;

    public /* synthetic */ f(fz.c cVar, LeaderBoardUser leaderBoardUser, int i11) {
        this.f48366a = i11;
        this.f48367b = cVar;
        this.f48368c = leaderBoardUser;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f48366a) {
            case 0:
                this.f48367b.invoke(this.f48368c);
                break;
            case 1:
                this.f48367b.invoke(this.f48368c);
                break;
            default:
                this.f48367b.invoke(this.f48368c);
                break;
        }
        return b0.f48488a;
    }
}
