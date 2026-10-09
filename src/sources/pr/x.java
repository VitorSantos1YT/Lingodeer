package pr;

import com.lingodeer.data.model.AchievementLevel;
import com.yalantis.ucrop.view.CropImageView;
import fr.p3;
import zp.sBa.anrPHlQ;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class x implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AchievementLevel f47112b;

    public /* synthetic */ x(AchievementLevel achievementLevel, int i11) {
        this.f47111a = i11;
        this.f47112b = achievementLevel;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f47111a) {
            case 0:
                i2.d Canvas = (i2.d) obj;
                kotlin.jvm.internal.m.f(Canvas, "$this$Canvas");
                i2.d.p0(Canvas, p3.A(ve.i.t(this.f47112b)), 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, null, 126);
                break;
            default:
                i2.d dVar = (i2.d) obj;
                kotlin.jvm.internal.m.f(dVar, anrPHlQ.CLNEzztItP);
                i2.d.p0(dVar, p3.A(ve.i.t(this.f47112b)), 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, null, 126);
                break;
        }
        return qy.b0.f48488a;
    }
}
