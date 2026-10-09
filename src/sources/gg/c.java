package gg;

import android.graphics.Canvas;
import android.graphics.Rect;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends fg.f {

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final /* synthetic */ int f29189f0;

    @Override // fg.f
    public final void h(Canvas canvas) {
        for (int i11 = 0; i11 < j(); i11++) {
            fg.e eVarI = i(i11);
            int iSave = canvas.save();
            canvas.rotate((i11 * 360) / j(), getBounds().centerX(), getBounds().centerY());
            eVarI.draw(canvas);
            canvas.restoreToCount(iSave);
        }
    }

    @Override // fg.f
    public final fg.e[] l() {
        switch (this.f29189f0) {
            case 0:
                a[] aVarArr = new a[12];
                for (int i11 = 0; i11 < 12; i11++) {
                    a aVar = new a(1, false);
                    aVar.g(CropImageView.DEFAULT_ASPECT_RATIO);
                    aVarArr[i11] = aVar;
                    aVar.f27265f = i11 * 100;
                }
                return aVarArr;
            default:
                a[] aVarArr2 = new a[12];
                for (int i12 = 0; i12 < 12; i12++) {
                    a aVar2 = new a(3, false);
                    aVar2.setAlpha(0);
                    aVarArr2[i12] = aVar2;
                    aVar2.f27265f = i12 * 100;
                }
                return aVarArr2;
        }
    }

    @Override // fg.f, fg.e, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Rect rectA = fg.e.a(rect);
        int iWidth = (int) (((((double) rectA.width()) * 3.141592653589793d) / 3.5999999046325684d) / ((double) j()));
        int iCenterX = rectA.centerX() - iWidth;
        int iCenterX2 = rectA.centerX() + iWidth;
        for (int i11 = 0; i11 < j(); i11++) {
            fg.e eVarI = i(i11);
            int i12 = rectA.top;
            eVarI.f(iCenterX, i12, iCenterX2, (iWidth * 2) + i12);
        }
    }
}
