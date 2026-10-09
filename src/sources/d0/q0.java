package d0;

import android.graphics.Canvas;
import android.widget.EdgeEffect;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 extends y2.n implements y2.q {
    public final i S;
    public final k0 T;
    public final j0.t1 U;

    public q0(s2.m0 m0Var, i iVar, k0 k0Var, j0.t1 t1Var) {
        this.S = iVar;
        this.T = k0Var;
        this.U = t1Var;
        T0(m0Var);
    }

    public static boolean W0(float f5, long j11, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(f5);
        canvas.translate(Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j11 & 4294967295L)));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    @Override // y2.q
    public final void i(y2.k0 k0Var) {
        boolean zW0;
        char c11;
        long j11;
        i2.b bVar = k0Var.f56937a;
        long jD = bVar.d();
        i iVar = this.S;
        iVar.i(jD);
        if (f2.e.e(bVar.d())) {
            k0Var.a();
            return;
        }
        k0Var.a();
        iVar.f22723d.getValue();
        Canvas canvasA = g2.d.a(bVar.f34121b.x());
        k0 k0Var2 = this.T;
        boolean zF = k0.f(k0Var2.f22746f);
        j0.t1 t1Var = this.U;
        if (zF) {
            zW0 = W0(270.0f, (((long) Float.floatToRawIntBits(k0Var.e0(t1Var.b(k0Var.getLayoutDirection())))) & 4294967295L) | (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (bVar.d() & 4294967295L)))) << 32), k0Var2.c(), canvasA);
        } else {
            zW0 = false;
        }
        if (k0.f(k0Var2.f22744d)) {
            c11 = ' ';
            j11 = 4294967295L;
            zW0 = W0(CropImageView.DEFAULT_ASPECT_RATIO, (((long) Float.floatToRawIntBits(CropImageView.DEFAULT_ASPECT_RATIO)) << 32) | (((long) Float.floatToRawIntBits(k0Var.e0(t1Var.c()))) & 4294967295L), k0Var2.e(), canvasA) || zW0;
        } else {
            c11 = ' ';
            j11 = 4294967295L;
        }
        if (k0.f(k0Var2.f22747g)) {
            zW0 = W0(90.0f, (((long) Float.floatToRawIntBits(k0Var.e0(t1Var.d(k0Var.getLayoutDirection())) + (-((float) hz.b.Q(Float.intBitsToFloat((int) (bVar.d() >> c11))))))) & j11) | (((long) Float.floatToRawIntBits(CropImageView.DEFAULT_ASPECT_RATIO)) << c11), k0Var2.d(), canvasA) || zW0;
        }
        if (k0.f(k0Var2.f22745e)) {
            EdgeEffect edgeEffectB = k0Var2.b();
            zW0 = W0(180.0f, (((long) Float.floatToRawIntBits((-Float.intBitsToFloat((int) (bVar.d() & j11))) + k0Var.e0(t1Var.a()))) & j11) | (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (bVar.d() >> c11)))) << c11), edgeEffectB, canvasA) || zW0;
        }
        if (zW0) {
            iVar.d();
        }
    }
}
