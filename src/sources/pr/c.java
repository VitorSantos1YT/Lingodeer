package pr;

import com.lingodeer.data.model.AchievementLanguage;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AchievementLanguage f47010b;

    public /* synthetic */ c(AchievementLanguage achievementLanguage, int i11) {
        this.f47009a = i11;
        this.f47010b = achievementLanguage;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f47009a) {
            case 0:
                break;
        }
        return Float.valueOf(this.f47010b.getProgress());
    }
}
