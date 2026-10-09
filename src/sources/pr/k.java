package pr;

import android.content.Context;
import android.graphics.Bitmap;
import com.lingodeer.data.model.AchievementLevel;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.y f47061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ rz.b0 f47062c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f47063d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AchievementLevel f47064e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ur.a f47065f;

    public /* synthetic */ k(kotlin.jvm.internal.y yVar, rz.b0 b0Var, Context context, AchievementLevel achievementLevel, ur.a aVar, int i11) {
        this.f47060a = i11;
        this.f47061b = yVar;
        this.f47062c = b0Var;
        this.f47063d = context;
        this.f47064e = achievementLevel;
        this.f47065f = aVar;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f47060a) {
            case 0:
                Bitmap bitmap = (Bitmap) this.f47061b.f38361a;
                if (bitmap != null) {
                    o oVar = new o(this.f47063d, bitmap, null, 0);
                    rz.b0 b0Var = this.f47062c;
                    rz.e0.B(b0Var, null, null, oVar, 3);
                    rz.e0.B(b0Var, null, null, new n(this.f47064e, this.f47065f, (vy.d) null, 1), 3);
                }
                break;
            default:
                Bitmap bitmap2 = (Bitmap) this.f47061b.f38361a;
                if (bitmap2 != null) {
                    o oVar2 = new o(this.f47063d, bitmap2, null, 4);
                    rz.b0 b0Var2 = this.f47062c;
                    rz.e0.B(b0Var2, null, null, oVar2, 3);
                    rz.e0.B(b0Var2, null, null, new n(this.f47064e, this.f47065f, (vy.d) null, 5), 3);
                }
                break;
        }
        return qy.b0.f48488a;
    }
}
