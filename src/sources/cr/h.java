package cr;

import android.os.Parcelable;
import com.lingo.me.MeAchievementLeaderBoardDetailActivity;
import com.lingodeer.data.model.AchievementLeaderBoard;
import com.lingodeer.data.model.INTENTS;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MeAchievementLeaderBoardDetailActivity f22440b;

    public /* synthetic */ h(MeAchievementLeaderBoardDetailActivity meAchievementLeaderBoardDetailActivity, int i11) {
        this.f22439a = i11;
        this.f22440b = meAchievementLeaderBoardDetailActivity;
    }

    @Override // fz.a
    public final Object invoke() {
        int i11 = this.f22439a;
        MeAchievementLeaderBoardDetailActivity meAchievementLeaderBoardDetailActivity = this.f22440b;
        switch (i11) {
            case 0:
                int i12 = MeAchievementLeaderBoardDetailActivity.H;
                Parcelable parcelableExtra = meAchievementLeaderBoardDetailActivity.getIntent().getParcelableExtra(INTENTS.EXTRA_OBJECT);
                kotlin.jvm.internal.m.c(parcelableExtra);
                return (AchievementLeaderBoard) parcelableExtra;
            default:
                int i13 = MeAchievementLeaderBoardDetailActivity.H;
                meAchievementLeaderBoardDetailActivity.finish();
                return b0.f48488a;
        }
    }
}
