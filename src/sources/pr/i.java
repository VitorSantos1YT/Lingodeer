package pr;

import android.net.Uri;
import com.lingodeer.data.model.AchievementLevel;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.y f47049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.f f47050c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rz.b0 f47051d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AchievementLevel f47052e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ur.a f47053f;

    public /* synthetic */ i(kotlin.jvm.internal.y yVar, fz.f fVar, rz.b0 b0Var, AchievementLevel achievementLevel, ur.a aVar, int i11) {
        this.f47048a = i11;
        this.f47049b = yVar;
        this.f47050c = fVar;
        this.f47051d = b0Var;
        this.f47052e = achievementLevel;
        this.f47053f = aVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f47048a) {
            case 0:
                String packageName = (String) obj;
                String title = (String) obj2;
                kotlin.jvm.internal.m.f(packageName, "packageName");
                kotlin.jvm.internal.m.f(title, "title");
                Uri uri = (Uri) this.f47049b.f38361a;
                if (uri != null) {
                    this.f47050c.invoke(uri, packageName, title);
                    rz.e0.B(this.f47051d, null, null, new m(this.f47052e, packageName, this.f47053f, null, 0), 3);
                }
                break;
            default:
                String packageName2 = (String) obj;
                String title2 = (String) obj2;
                kotlin.jvm.internal.m.f(packageName2, "packageName");
                kotlin.jvm.internal.m.f(title2, "title");
                Uri uri2 = (Uri) this.f47049b.f38361a;
                if (uri2 != null) {
                    this.f47050c.invoke(uri2, packageName2, title2);
                    rz.e0.B(this.f47051d, null, null, new m(this.f47052e, packageName2, this.f47053f, null, 1), 3);
                }
                break;
        }
        return qy.b0.f48488a;
    }
}
