package gg;

import android.animation.ValueAnimator;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends fg.a {

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final int f29191h0;

    public f(int i11) {
        super(1);
        this.f29191h0 = i11;
    }

    @Override // fg.e
    public final ValueAnimator d() {
        float[] fArr = {CropImageView.DEFAULT_ASPECT_RATIO, 0.25f, 0.5f, 0.51f, 0.75f, 1.0f};
        dg.e eVar = new dg.e(this);
        eVar.d(fArr, fg.e.W, new Integer[]{0, -90, -179, -180, -270, -360});
        Float fValueOf = Float.valueOf(CropImageView.DEFAULT_ASPECT_RATIO);
        Float fValueOf2 = Float.valueOf(0.75f);
        eVar.c(fArr, fg.e.Y, new Float[]{fValueOf, fValueOf2, fValueOf2, fValueOf2, fValueOf, fValueOf});
        eVar.c(fArr, fg.e.Z, new Float[]{fValueOf, fValueOf, fValueOf2, fValueOf2, fValueOf2, fValueOf});
        Float fValueOf3 = Float.valueOf(1.0f);
        Float fValueOf4 = Float.valueOf(0.5f);
        eVar.c(fArr, fg.e.f27258b0, new Float[]{fValueOf3, fValueOf4, fValueOf3, fValueOf3, fValueOf4, fValueOf3});
        eVar.f23419a = 1800L;
        eVar.b(fArr);
        int i11 = this.f29191h0;
        eVar.f23420b = i11 >= 0 ? i11 : 0;
        return eVar.a();
    }
}
