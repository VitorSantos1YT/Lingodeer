package cr;

import com.lingo.me.MeAchievementAllLanguageActivity;
import com.lingodeer.data.model.INTENTS;
import java.util.ArrayList;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MeAchievementAllLanguageActivity f22436b;

    public /* synthetic */ f(MeAchievementAllLanguageActivity meAchievementAllLanguageActivity, int i11) {
        this.f22435a = i11;
        this.f22436b = meAchievementAllLanguageActivity;
    }

    @Override // fz.a
    public final Object invoke() {
        int i11 = this.f22435a;
        MeAchievementAllLanguageActivity meAchievementAllLanguageActivity = this.f22436b;
        switch (i11) {
            case 0:
                int i12 = MeAchievementAllLanguageActivity.H;
                ArrayList parcelableArrayListExtra = meAchievementAllLanguageActivity.getIntent().getParcelableArrayListExtra(INTENTS.EXTRA_ARRAY_LIST);
                kotlin.jvm.internal.m.c(parcelableArrayListExtra);
                return parcelableArrayListExtra;
            default:
                int i13 = MeAchievementAllLanguageActivity.H;
                meAchievementAllLanguageActivity.finish();
                return b0.f48488a;
        }
    }
}
