package gg;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.animation.PathInterpolator;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends fg.b {
    public e() {
        g(CropImageView.DEFAULT_ASPECT_RATIO);
    }

    @Override // fg.e
    public final ValueAnimator d() {
        Float fValueOf = Float.valueOf(1.0f);
        float[] fArr = {CropImageView.DEFAULT_ASPECT_RATIO, 0.7f, 1.0f};
        dg.e eVar = new dg.e(this);
        eVar.c(fArr, fg.e.f27258b0, new Float[]{Float.valueOf(CropImageView.DEFAULT_ASPECT_RATIO), fValueOf, fValueOf});
        eVar.d(fArr, fg.e.f27259c0, new Integer[]{255, 178, 0});
        eVar.f23419a = 1000L;
        eg.a aVar = new eg.a(new PathInterpolator(0.21f, 0.53f, 0.56f, 0.8f), new float[0]);
        aVar.f25531b = fArr;
        eVar.f23422d = aVar;
        return eVar.a();
    }

    @Override // fg.b
    public final void h(Canvas canvas, Paint paint) {
        if (this.R != null) {
            paint.setStyle(Paint.Style.STROKE);
            int iMin = Math.min(this.R.width(), this.R.height()) / 2;
            paint.setStrokeWidth(iMin / 12);
            canvas.drawCircle(this.R.centerX(), this.R.centerY(), iMin, paint);
        }
    }
}
