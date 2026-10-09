package pr;

import com.lingodeer.data.model.AchievementLanguage;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.c f47000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AchievementLanguage f47001c;

    public /* synthetic */ b(fz.c cVar, AchievementLanguage achievementLanguage, int i11) {
        this.f46999a = i11;
        this.f47000b = cVar;
        this.f47001c = achievementLanguage;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f46999a) {
            case 0:
                this.f47000b.invoke(this.f47001c);
                break;
            default:
                this.f47000b.invoke(this.f47001c);
                break;
        }
        return qy.b0.f48488a;
    }
}
