package au;

import com.lingodeer.data.model.UserInfo;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class p0 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3060c;

    public /* synthetic */ p0(int i11, int i12, int i13) {
        this.f3058a = i13;
        this.f3059b = i11;
        this.f3060c = i12;
    }

    @Override // fz.c
    public final Object invoke(Object obj) throws Exception {
        switch (this.f3058a) {
            case 0:
                int i11 = this.f3059b;
                int i12 = this.f3060c;
                ja.a _connection = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection, "_connection");
                ja.c cVarB1 = _connection.B1("DELETE FROM language_history WHERE keyLanguage = ? AND locate = ?");
                try {
                    cVarB1.g(1, i11);
                    cVarB1.g(2, i12);
                    cVarB1.r1();
                    return qy.b0.f48488a;
                } finally {
                    cVarB1.close();
                }
            default:
                UserInfo currentUserInfo = (UserInfo) obj;
                kotlin.jvm.internal.m.f(currentUserInfo, "currentUserInfo");
                String achievementTopStudent = currentUserInfo.getAchievementTopStudent();
                int i13 = this.f3059b;
                String str = (String) o00.a.u(i13, achievementTopStudent).f48495a;
                String achievementStreakHero = currentUserInfo.getAchievementStreakHero();
                int i14 = this.f3060c;
                return UserInfo.copy$default(currentUserInfo, null, 0, 0, 0, 0, 0, 0L, 0, 0L, null, str, null, (String) o00.a.t(i14, achievementStreakHero).f48495a, null, null, null, null, 0, 0, 0, i13, i14, 0, null, null, 30403583, null);
        }
    }
}
