package cr;

import com.lingo.me.MeFollowingFollowerActivity;
import com.lingodeer.data.model.INTENTS;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MeFollowingFollowerActivity f22446b;

    public /* synthetic */ k(MeFollowingFollowerActivity meFollowingFollowerActivity, int i11) {
        this.f22445a = i11;
        this.f22446b = meFollowingFollowerActivity;
    }

    @Override // fz.a
    public final Object invoke() {
        int i11 = this.f22445a;
        MeFollowingFollowerActivity meFollowingFollowerActivity = this.f22446b;
        switch (i11) {
            case 0:
                int i12 = MeFollowingFollowerActivity.H;
                return Integer.valueOf(meFollowingFollowerActivity.getIntent().getIntExtra(INTENTS.EXTRA_INT, 0));
            default:
                int i13 = MeFollowingFollowerActivity.H;
                meFollowingFollowerActivity.finish();
                return b0.f48488a;
        }
    }
}
