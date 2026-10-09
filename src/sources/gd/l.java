package gd;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.yalantis.ucrop.view.CropImageView;
import ob.u;
import wc.v;
import wc.z;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends c {
    public final RectF D;
    public final m E;
    public final float[] F;
    public final Path G;
    public final i H;
    public zc.p I;
    public zc.p J;

    public l(v vVar, i iVar) {
        super(vVar, iVar);
        this.D = new RectF();
        m mVar = new m();
        this.E = mVar;
        this.F = new float[8];
        this.G = new Path();
        this.H = iVar;
        mVar.setAlpha(0);
        mVar.setStyle(Paint.Style.FILL);
        mVar.setColor(iVar.f29110l);
    }

    @Override // gd.c, yc.e
    public final void e(RectF rectF, Matrix matrix, boolean z11) {
        super.e(rectF, matrix, z11);
        i iVar = this.H;
        float f5 = iVar.f29108j;
        float f11 = iVar.f29109k;
        RectF rectF2 = this.D;
        rectF2.set(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, f5, f11);
        this.f29085n.mapRect(rectF2);
        rectF.set(rectF2);
    }

    @Override // gd.c, dd.g
    public final void f(Object obj, u uVar) {
        super.f(obj, uVar);
        if (obj == z.F) {
            if (uVar == null) {
                this.I = null;
                return;
            } else {
                this.I = new zc.p(null, uVar);
                return;
            }
        }
        if (obj == 1) {
            if (uVar != null) {
                this.J = new zc.p(null, uVar);
                return;
            }
            this.J = null;
            this.E.setColor(this.H.f29110l);
        }
    }

    @Override // gd.c
    public final void k(Canvas canvas, Matrix matrix, int i11, kd.b bVar) {
        i iVar = this.H;
        int iAlpha = Color.alpha(iVar.f29110l);
        if (iAlpha == 0) {
            return;
        }
        zc.p pVar = this.J;
        Integer num = pVar == null ? null : (Integer) pVar.f();
        m mVar = this.E;
        if (num != null) {
            mVar.setColor(num.intValue());
        } else {
            mVar.setColor(iVar.f29110l);
        }
        zc.d dVar = this.f29094w.f59139j;
        int iIntValue = (int) ((((iAlpha / 255.0f) * (dVar == null ? 100 : ((Integer) dVar.f()).intValue())) / 100.0f) * (i11 / 255.0f) * 255.0f);
        mVar.setAlpha(iIntValue);
        if (bVar == null || Color.alpha(bVar.f38085d) <= 0) {
            mVar.clearShadowLayer();
        } else {
            mVar.setShadowLayer(Math.max(bVar.f38082a, Float.MIN_VALUE), bVar.f38083b, bVar.f38084c, bVar.f38085d);
        }
        zc.p pVar2 = this.I;
        if (pVar2 != null) {
            mVar.setColorFilter((ColorFilter) pVar2.f());
        }
        if (iIntValue > 0) {
            float[] fArr = this.F;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            float f5 = iVar.f29108j;
            fArr[2] = f5;
            fArr[3] = 0.0f;
            fArr[4] = f5;
            float f11 = iVar.f29109k;
            fArr[5] = f11;
            fArr[6] = 0.0f;
            fArr[7] = f11;
            matrix.mapPoints(fArr);
            Path path = this.G;
            path.reset();
            path.moveTo(fArr[0], fArr[1]);
            path.lineTo(fArr[2], fArr[3]);
            path.lineTo(fArr[4], fArr[5]);
            path.lineTo(fArr[6], fArr[7]);
            path.lineTo(fArr[0], fArr[1]);
            path.close();
            canvas.drawPath(path, mVar);
        }
    }
}
