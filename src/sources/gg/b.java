package gg;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.animation.LinearInterpolator;
import com.google.logging.type.LogSeverity;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends fg.f {

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final /* synthetic */ int f29188f0;

    public /* synthetic */ b(int i11) {
        this.f29188f0 = i11;
    }

    @Override // fg.f, fg.e
    public ValueAnimator d() {
        switch (this.f29188f0) {
            case 0:
                float[] fArr = {CropImageView.DEFAULT_ASPECT_RATIO, 1.0f};
                dg.e eVar = new dg.e(this);
                eVar.d(fArr, fg.e.W, new Integer[]{0, 360});
                eVar.f23419a = 2000L;
                eVar.f23422d = new LinearInterpolator();
                return eVar.a();
            default:
                return super.d();
        }
    }

    @Override // fg.f
    public void h(Canvas canvas) {
        switch (this.f29188f0) {
            case 3:
                Rect rectA = fg.e.a(getBounds());
                for (int i11 = 0; i11 < j(); i11++) {
                    int iSave = canvas.save();
                    canvas.rotate((i11 * 90) + 45, rectA.centerX(), rectA.centerY());
                    i(i11).draw(canvas);
                    canvas.restoreToCount(iSave);
                }
                break;
            default:
                super.h(canvas);
                break;
        }
    }

    @Override // fg.f
    public void k(fg.e... eVarArr) {
        switch (this.f29188f0) {
            case 0:
                eVarArr[1].f27265f = 1000;
                break;
            case 2:
                eVarArr[1].f27265f = 1000;
                break;
            case 4:
                int i11 = 0;
                while (i11 < eVarArr.length) {
                    fg.e eVar = eVarArr[i11];
                    i11++;
                    eVar.f27265f = i11 * 200;
                }
                break;
            case 5:
                int i12 = 0;
                while (i12 < eVarArr.length) {
                    fg.e eVar2 = eVarArr[i12];
                    i12++;
                    eVar2.f27265f = i12 * 200;
                }
                break;
            case 6:
                eVarArr[1].f27265f = 160;
                eVarArr[2].f27265f = 320;
                break;
        }
    }

    @Override // fg.f
    public final fg.e[] l() {
        switch (this.f29188f0) {
            case 0:
                return new fg.e[]{new a(0), new a(0)};
            case 1:
                int[] iArr = {200, LogSeverity.NOTICE_VALUE, 400, 100, 200, LogSeverity.NOTICE_VALUE, 0, 100, 200};
                d[] dVarArr = new d[9];
                for (int i11 = 0; i11 < 9; i11++) {
                    d dVar = new d(0);
                    dVarArr[i11] = dVar;
                    dVar.f27265f = iArr[i11];
                }
                return dVarArr;
            case 2:
                return new fg.e[]{new a(2), new a(2)};
            case 3:
                d[] dVarArr2 = new d[4];
                for (int i12 = 0; i12 < 4; i12++) {
                    d dVar2 = new d(1);
                    dVar2.setAlpha(0);
                    dVar2.f27266t = -180;
                    dVarArr2[i12] = dVar2;
                    dVar2.f27265f = i12 * LogSeverity.NOTICE_VALUE;
                }
                return dVarArr2;
            case 4:
                return new fg.e[]{new a(4), new a(4), new a(4)};
            case 5:
                return new fg.e[]{new e(), new e(), new e()};
            case 6:
                return new fg.e[]{new a(6), new a(6), new a(6)};
            case 7:
                return new fg.e[]{new f(0), new f(3)};
            default:
                d[] dVarArr3 = new d[5];
                for (int i13 = 0; i13 < 5; i13++) {
                    d dVar3 = new d(3);
                    dVar3.f27262c = 0.4f;
                    dVarArr3[i13] = dVar3;
                    dVar3.f27265f = (i13 * 100) + 600;
                }
                return dVarArr3;
        }
    }

    @Override // fg.f, fg.e, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        switch (this.f29188f0) {
            case 0:
                super.onBoundsChange(rect);
                Rect rectA = fg.e.a(rect);
                int iWidth = (int) (rectA.width() * 0.6f);
                fg.e eVarI = i(0);
                int i11 = rectA.right;
                int i12 = rectA.top;
                eVarI.f(i11 - iWidth, i12, i11, i12 + iWidth);
                fg.e eVarI2 = i(1);
                int i13 = rectA.right;
                int i14 = rectA.bottom;
                eVarI2.f(i13 - iWidth, i14 - iWidth, i13, i14);
                break;
            case 1:
                super.onBoundsChange(rect);
                Rect rectA2 = fg.e.a(rect);
                int iWidth2 = (int) (rectA2.width() * 0.33f);
                int iHeight = (int) (rectA2.height() * 0.33f);
                for (int i15 = 0; i15 < j(); i15++) {
                    int i16 = ((i15 % 3) * iWidth2) + rectA2.left;
                    int i17 = ((i15 / 3) * iHeight) + rectA2.top;
                    i(i15).f(i16, i17, i16 + iWidth2, i17 + iHeight);
                }
                break;
            case 2:
            case 4:
            case 5:
            default:
                super.onBoundsChange(rect);
                break;
            case 3:
                super.onBoundsChange(rect);
                Rect rectA3 = fg.e.a(rect);
                int iMin = Math.min(rectA3.width(), rectA3.height()) / 2;
                int i18 = rectA3.left + iMin + 1;
                int i19 = rectA3.top + iMin + 1;
                for (int i21 = 0; i21 < j(); i21++) {
                    fg.e eVarI3 = i(i21);
                    eVarI3.f(rectA3.left, rectA3.top, i18, i19);
                    Rect rect2 = eVarI3.R;
                    eVarI3.f27263d = rect2.right;
                    eVarI3.f27264e = rect2.bottom;
                }
                break;
            case 6:
                super.onBoundsChange(rect);
                Rect rectA4 = fg.e.a(rect);
                int iWidth3 = rectA4.width() / 8;
                int iCenterY = rectA4.centerY() - iWidth3;
                int iCenterY2 = rectA4.centerY() + iWidth3;
                for (int i22 = 0; i22 < j(); i22++) {
                    int iWidth4 = ((rectA4.width() * i22) / 3) + rectA4.left;
                    i(i22).f(iWidth4, iCenterY, (iWidth3 * 2) + iWidth4, iCenterY2);
                }
                break;
            case 7:
                Rect rectA5 = fg.e.a(rect);
                super.onBoundsChange(rectA5);
                for (int i23 = 0; i23 < j(); i23++) {
                    fg.e eVarI4 = i(i23);
                    int i24 = rectA5.left;
                    eVarI4.f(i24, rectA5.top, (rectA5.width() / 4) + i24, (rectA5.height() / 4) + rectA5.top);
                }
                break;
            case 8:
                super.onBoundsChange(rect);
                Rect rectA6 = fg.e.a(rect);
                int iWidth5 = rectA6.width() / j();
                int iWidth6 = ((rectA6.width() / 5) * 3) / 5;
                for (int i25 = 0; i25 < j(); i25++) {
                    fg.e eVarI5 = i(i25);
                    int i26 = (iWidth5 / 5) + (i25 * iWidth5) + rectA6.left;
                    eVarI5.f(i26, rectA6.top, i26 + iWidth6, rectA6.bottom);
                }
                break;
        }
    }

    private final void m(fg.e... eVarArr) {
    }
}
