package pr;

import com.lingodeer.data.model.AchievementLevel;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c0 implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AchievementLevel f47012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.a f47013c;

    public /* synthetic */ c0(AchievementLevel achievementLevel, fz.a aVar) {
        this.f47011a = 0;
        this.f47012b = achievementLevel;
        this.f47013c = aVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        l1.n nVar = (l1.n) obj;
        Integer num = (Integer) obj2;
        switch (this.f47011a) {
            case 0:
                int iIntValue = num.intValue();
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    f0.t(this.f47012b, this.f47013c, sVar, 0);
                } else {
                    sVar.W();
                }
                return qy.b0.f48488a;
            case 1:
                num.getClass();
                f0.s(this.f47012b, this.f47013c, nVar, l1.t.M(49));
                break;
            default:
                num.getClass();
                f0.t(this.f47012b, this.f47013c, nVar, l1.t.M(1));
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ c0(AchievementLevel achievementLevel, fz.a aVar, int i11, int i12) {
        this.f47011a = i12;
        this.f47012b = achievementLevel;
        this.f47013c = aVar;
    }
}
