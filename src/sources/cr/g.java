package cr;

import android.os.Parcelable;
import com.lingo.me.MeAchievementLanguageDetailActivity;
import com.lingodeer.data.model.AchievementLanguage;
import com.lingodeer.data.model.INTENTS;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MeAchievementLanguageDetailActivity f22438b;

    public /* synthetic */ g(MeAchievementLanguageDetailActivity meAchievementLanguageDetailActivity, int i11) {
        this.f22437a = i11;
        this.f22438b = meAchievementLanguageDetailActivity;
    }

    @Override // fz.a
    public final Object invoke() {
        int i11 = this.f22437a;
        MeAchievementLanguageDetailActivity meAchievementLanguageDetailActivity = this.f22438b;
        switch (i11) {
            case 0:
                int i12 = MeAchievementLanguageDetailActivity.H;
                Parcelable parcelableExtra = meAchievementLanguageDetailActivity.getIntent().getParcelableExtra(INTENTS.EXTRA_OBJECT);
                kotlin.jvm.internal.m.c(parcelableExtra);
                return (AchievementLanguage) parcelableExtra;
            default:
                int i13 = MeAchievementLanguageDetailActivity.H;
                meAchievementLanguageDetailActivity.finish();
                return b0.f48488a;
        }
    }
}
