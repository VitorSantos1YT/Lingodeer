package gg;

import android.animation.ValueAnimator;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends fg.a {

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final /* synthetic */ int f29187h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i11, boolean z11) {
        super(0);
        this.f29187h0 = i11;
    }

    @Override // fg.e
    public final ValueAnimator d() {
        int i11 = this.f29187h0;
        fg.d dVar = fg.e.f27259c0;
        fg.c cVar = fg.e.f27258b0;
        switch (i11) {
            case 0:
                Float fValueOf = Float.valueOf(CropImageView.DEFAULT_ASPECT_RATIO);
                float[] fArr = {CropImageView.DEFAULT_ASPECT_RATIO, 0.5f, 1.0f};
                dg.e eVar = new dg.e(this);
                eVar.c(fArr, cVar, new Float[]{fValueOf, Float.valueOf(1.0f), fValueOf});
                eVar.f23419a = 2000L;
                eVar.b(fArr);
                return eVar.a();
            case 1:
                Float fValueOf2 = Float.valueOf(CropImageView.DEFAULT_ASPECT_RATIO);
                float[] fArr2 = {CropImageView.DEFAULT_ASPECT_RATIO, 0.5f, 1.0f};
                dg.e eVar2 = new dg.e(this);
                eVar2.c(fArr2, cVar, new Float[]{fValueOf2, Float.valueOf(1.0f), fValueOf2});
                eVar2.f23419a = 1200L;
                eVar2.b(fArr2);
                return eVar2.a();
            case 2:
                Float fValueOf3 = Float.valueOf(CropImageView.DEFAULT_ASPECT_RATIO);
                float[] fArr3 = {CropImageView.DEFAULT_ASPECT_RATIO, 0.5f, 1.0f};
                dg.e eVar3 = new dg.e(this);
                eVar3.c(fArr3, cVar, new Float[]{fValueOf3, Float.valueOf(1.0f), fValueOf3});
                eVar3.f23419a = 2000L;
                eVar3.b(fArr3);
                return eVar3.a();
            case 3:
                float[] fArr4 = {CropImageView.DEFAULT_ASPECT_RATIO, 0.39f, 0.4f, 1.0f};
                dg.e eVar4 = new dg.e(this);
                eVar4.d(fArr4, dVar, new Integer[]{0, 0, 255, 0});
                eVar4.f23419a = 1200L;
                eVar4.b(fArr4);
                return eVar4.a();
            case 4:
                float[] fArr5 = {CropImageView.DEFAULT_ASPECT_RATIO, 1.0f};
                dg.e eVar5 = new dg.e(this);
                eVar5.c(fArr5, cVar, new Float[]{Float.valueOf(CropImageView.DEFAULT_ASPECT_RATIO), Float.valueOf(1.0f)});
                eVar5.d(fArr5, dVar, new Integer[]{255, 0});
                eVar5.f23419a = 1000L;
                eVar5.b(fArr5);
                return eVar5.a();
            case 5:
                float[] fArr6 = {CropImageView.DEFAULT_ASPECT_RATIO, 0.5f, 1.0f};
                dg.e eVar6 = new dg.e(this);
                eVar6.d(fArr6, fg.e.V, new Integer[]{0, -180, -180});
                eVar6.d(fArr6, fg.e.X, new Integer[]{0, 0, -180});
                eVar6.f23419a = 1200L;
                eVar6.b(fArr6);
                return eVar6.a();
            default:
                Float fValueOf4 = Float.valueOf(CropImageView.DEFAULT_ASPECT_RATIO);
                float[] fArr7 = {CropImageView.DEFAULT_ASPECT_RATIO, 0.4f, 0.8f, 1.0f};
                dg.e eVar7 = new dg.e(this);
                eVar7.c(fArr7, cVar, new Float[]{fValueOf4, Float.valueOf(1.0f), fValueOf4, fValueOf4});
                eVar7.f23419a = 1400L;
                eVar7.b(fArr7);
                return eVar7.a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int i11) {
        super(0);
        this.f29187h0 = i11;
        switch (i11) {
            case 2:
                super(0);
                setAlpha(153);
                g(CropImageView.DEFAULT_ASPECT_RATIO);
                break;
            case 3:
            case 5:
            default:
                g(CropImageView.DEFAULT_ASPECT_RATIO);
                break;
            case 4:
                super(0);
                g(CropImageView.DEFAULT_ASPECT_RATIO);
                break;
            case 6:
                super(0);
                g(CropImageView.DEFAULT_ASPECT_RATIO);
                break;
        }
    }
}
