package pr;

import android.net.Uri;
import com.lingodeer.data.model.AchievementLevel;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.y f47055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.c f47056c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rz.b0 f47057d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AchievementLevel f47058e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ur.a f47059f;

    public /* synthetic */ j(kotlin.jvm.internal.y yVar, fz.c cVar, rz.b0 b0Var, AchievementLevel achievementLevel, ur.a aVar, int i11) {
        this.f47054a = i11;
        this.f47055b = yVar;
        this.f47056c = cVar;
        this.f47057d = b0Var;
        this.f47058e = achievementLevel;
        this.f47059f = aVar;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f47054a) {
            case 0:
                kotlin.jvm.internal.y yVar = this.f47055b;
                String.valueOf(yVar.f38361a);
                Uri uri = (Uri) yVar.f38361a;
                if (uri != null) {
                    this.f47056c.invoke(uri);
                    rz.e0.B(this.f47057d, null, null, new n(this.f47058e, this.f47059f, (vy.d) null, 0), 3);
                }
                break;
            default:
                kotlin.jvm.internal.y yVar2 = this.f47055b;
                String.valueOf(yVar2.f38361a);
                Uri uri2 = (Uri) yVar2.f38361a;
                if (uri2 != null) {
                    this.f47056c.invoke(uri2);
                    rz.e0.B(this.f47057d, null, null, new n(this.f47058e, this.f47059f, (vy.d) null, 4), 3);
                }
                break;
        }
        return qy.b0.f48488a;
    }
}
