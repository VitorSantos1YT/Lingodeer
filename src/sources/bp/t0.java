package bp;

import com.google.logging.type.LogSeverity;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class t0 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f4814a;

    public t0(float f5) {
        this.f4814a = f5;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        b0.n0 keyframes = (b0.n0) obj;
        kotlin.jvm.internal.m.f(keyframes, "$this$keyframes");
        keyframes.f3619a = 420;
        Float fValueOf = Float.valueOf(CropImageView.DEFAULT_ASPECT_RATIO);
        keyframes.a(fValueOf, 0);
        float f5 = this.f4814a;
        float f11 = -f5;
        keyframes.a(Float.valueOf(f11), 60);
        keyframes.a(Float.valueOf(f5), 120);
        keyframes.a(Float.valueOf(f11 * 0.5f), 210);
        keyframes.a(Float.valueOf(f5 * 0.5f), LogSeverity.NOTICE_VALUE);
        keyframes.a(fValueOf, keyframes.f3619a);
        return qy.b0.f48488a;
    }
}
