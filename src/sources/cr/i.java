package cr;

import android.os.Parcelable;
import com.lingo.me.MeAchievementLevelDetailActivity;
import com.lingodeer.data.model.AchievementLevel;
import com.lingodeer.data.model.INTENTS;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MeAchievementLevelDetailActivity f22442b;

    public /* synthetic */ i(MeAchievementLevelDetailActivity meAchievementLevelDetailActivity, int i11) {
        this.f22441a = i11;
        this.f22442b = meAchievementLevelDetailActivity;
    }

    @Override // fz.a
    public final Object invoke() {
        int i11 = this.f22441a;
        MeAchievementLevelDetailActivity meAchievementLevelDetailActivity = this.f22442b;
        switch (i11) {
            case 0:
                int i12 = MeAchievementLevelDetailActivity.H;
                Parcelable parcelableExtra = meAchievementLevelDetailActivity.getIntent().getParcelableExtra(INTENTS.EXTRA_OBJECT);
                kotlin.jvm.internal.m.c(parcelableExtra);
                return (AchievementLevel) parcelableExtra;
            default:
                int i13 = MeAchievementLevelDetailActivity.H;
                meAchievementLevelDetailActivity.finish();
                return b0.f48488a;
        }
    }
}
