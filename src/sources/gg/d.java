package gg;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.animation.LinearInterpolator;
import com.lingodeer.data.model.AchievementLevelType;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends fg.a {

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final /* synthetic */ int f29190h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i11) {
        super(1);
        this.f29190h0 = i11;
    }

    @Override // fg.e
    public final ValueAnimator d() {
        int i11 = this.f29190h0;
        fg.d dVar = fg.e.X;
        fg.d dVar2 = fg.e.V;
        switch (i11) {
            case 0:
                Float fValueOf = Float.valueOf(1.0f);
                float[] fArr = {CropImageView.DEFAULT_ASPECT_RATIO, 0.35f, 0.7f, 1.0f};
                dg.e eVar = new dg.e(this);
                eVar.c(fArr, fg.e.f27258b0, new Float[]{fValueOf, Float.valueOf(CropImageView.DEFAULT_ASPECT_RATIO), fValueOf, fValueOf});
                eVar.f23419a = 1300L;
                eVar.b(fArr);
                return eVar.a();
            case 1:
                float[] fArr2 = {CropImageView.DEFAULT_ASPECT_RATIO, 0.1f, 0.25f, 0.75f, 0.9f, 1.0f};
                dg.e eVar2 = new dg.e(this);
                eVar2.d(fArr2, fg.e.f27259c0, new Integer[]{0, 0, 255, 255, 0, 0});
                eVar2.d(fArr2, dVar2, new Integer[]{-180, -180, 0, 0, 0, 0});
                Integer numValueOf = Integer.valueOf(AchievementLevelType.DAY_STREAK_LV_8);
                eVar2.d(fArr2, dVar, new Integer[]{0, 0, 0, 0, numValueOf, numValueOf});
                eVar2.f23419a = 2400L;
                eVar2.f23422d = new LinearInterpolator();
                return eVar2.a();
            case 2:
                float[] fArr3 = {CropImageView.DEFAULT_ASPECT_RATIO, 0.5f, 1.0f};
                dg.e eVar3 = new dg.e(this);
                eVar3.d(fArr3, dVar2, new Integer[]{0, -180, -180});
                eVar3.d(fArr3, dVar, new Integer[]{0, 0, -180});
                eVar3.f23419a = 1200L;
                eVar3.b(fArr3);
                return eVar3.a();
            default:
                Float fValueOf2 = Float.valueOf(0.4f);
                float[] fArr4 = {CropImageView.DEFAULT_ASPECT_RATIO, 0.2f, 0.4f, 1.0f};
                dg.e eVar4 = new dg.e(this);
                eVar4.c(fArr4, fg.e.f27257a0, new Float[]{fValueOf2, Float.valueOf(1.0f), fValueOf2, fValueOf2});
                eVar4.f23419a = 1200L;
                eVar4.b(fArr4);
                return eVar4.a();
        }
    }

    @Override // fg.e, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        switch (this.f29190h0) {
            case 2:
                Rect rectA = fg.e.a(rect);
                f(rectA.left, rectA.top, rectA.right, rectA.bottom);
                break;
            default:
                super.onBoundsChange(rect);
                break;
        }
    }
}
