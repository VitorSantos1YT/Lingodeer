package d0;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import android.widget.EdgeEffect;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i2 extends y2.n implements y2.q {
    public final i S;
    public final k0 T;
    public RenderNode U;

    public i2(s2.m0 m0Var, i iVar, k0 k0Var) {
        this.S = iVar;
        this.T = k0Var;
        T0(m0Var);
    }

    public static boolean W0(float f5, EdgeEffect edgeEffect, Canvas canvas) {
        if (f5 == CropImageView.DEFAULT_ASPECT_RATIO) {
            return edgeEffect.draw(canvas);
        }
        int iSave = canvas.save();
        canvas.rotate(f5);
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    public final RenderNode X0() {
        RenderNode renderNode = this.U;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode renderNodeB = h2.b();
        this.U = renderNodeB;
        return renderNodeB;
    }

    /* JADX WARN: Code duplicated, block: B:112:0x01eb A[PHI: r16
      0x01eb: PHI (r16v2 boolean) = (r16v1 boolean), (r16v12 boolean) binds: [B:93:0x01a1, B:101:0x01bc] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // y2.q
    public final void i(y2.k0 k0Var) {
        boolean z11;
        boolean zW0;
        char c11;
        boolean z12;
        i2.b bVar = k0Var.f56937a;
        long jD = bVar.d();
        i iVar = this.S;
        iVar.i(jD);
        Canvas canvasA = g2.d.a(bVar.f34121b.x());
        iVar.f22723d.getValue();
        if (f2.e.e(bVar.d())) {
            k0Var.a();
            return;
        }
        boolean zIsHardwareAccelerated = canvasA.isHardwareAccelerated();
        k0 k0Var2 = this.T;
        if (!zIsHardwareAccelerated) {
            EdgeEffect edgeEffect = k0Var2.f22744d;
            if (edgeEffect != null) {
                edgeEffect.finish();
            }
            EdgeEffect edgeEffect2 = k0Var2.f22745e;
            if (edgeEffect2 != null) {
                edgeEffect2.finish();
            }
            EdgeEffect edgeEffect3 = k0Var2.f22746f;
            if (edgeEffect3 != null) {
                edgeEffect3.finish();
            }
            EdgeEffect edgeEffect4 = k0Var2.f22747g;
            if (edgeEffect4 != null) {
                edgeEffect4.finish();
            }
            EdgeEffect edgeEffect5 = k0Var2.f22748h;
            if (edgeEffect5 != null) {
                edgeEffect5.finish();
            }
            EdgeEffect edgeEffect6 = k0Var2.f22749i;
            if (edgeEffect6 != null) {
                edgeEffect6.finish();
            }
            EdgeEffect edgeEffect7 = k0Var2.f22750j;
            if (edgeEffect7 != null) {
                edgeEffect7.finish();
            }
            EdgeEffect edgeEffect8 = k0Var2.f22751k;
            if (edgeEffect8 != null) {
                edgeEffect8.finish();
            }
            k0Var.a();
            return;
        }
        float fE0 = k0Var.e0(b0.f22640a);
        boolean z13 = k0.f(k0Var2.f22744d) || k0.g(k0Var2.f22748h) || k0.f(k0Var2.f22745e) || k0.g(k0Var2.f22749i);
        boolean z14 = k0.f(k0Var2.f22746f) || k0.g(k0Var2.f22750j) || k0.f(k0Var2.f22747g) || k0.g(k0Var2.f22751k);
        if (z13 && z14) {
            X0().setPosition(0, 0, canvasA.getWidth(), canvasA.getHeight());
        } else if (z13) {
            X0().setPosition(0, 0, (hz.b.Q(fE0) * 2) + canvasA.getWidth(), canvasA.getHeight());
        } else {
            if (!z14) {
                k0Var.a();
                return;
            }
            X0().setPosition(0, 0, canvasA.getWidth(), (hz.b.Q(fE0) * 2) + canvasA.getHeight());
        }
        RecordingCanvas recordingCanvasBeginRecording = X0().beginRecording();
        if (k0.g(k0Var2.f22750j)) {
            EdgeEffect edgeEffectA = k0Var2.f22750j;
            if (edgeEffectA == null) {
                edgeEffectA = k0Var2.a(f0.h1.Horizontal);
                k0Var2.f22750j = edgeEffectA;
            }
            W0(90.0f, edgeEffectA, recordingCanvasBeginRecording);
            edgeEffectA.finish();
        }
        if (k0.f(k0Var2.f22746f)) {
            EdgeEffect edgeEffectC = k0Var2.c();
            zW0 = W0(270.0f, edgeEffectC, recordingCanvasBeginRecording);
            if (k0.g(k0Var2.f22746f)) {
                z11 = z14;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (iVar.c() & 4294967295L));
                EdgeEffect edgeEffectA2 = k0Var2.f22750j;
                if (edgeEffectA2 == null) {
                    edgeEffectA2 = k0Var2.a(f0.h1.Horizontal);
                    k0Var2.f22750j = edgeEffectA2;
                }
                int i11 = Build.VERSION.SDK_INT;
                float fB = i11 >= 31 ? l.b(edgeEffectC) : CropImageView.DEFAULT_ASPECT_RATIO;
                float f5 = 1 - fIntBitsToFloat;
                if (i11 >= 31) {
                    l.c(edgeEffectA2, fB, f5);
                } else {
                    edgeEffectA2.onPull(fB, f5);
                }
            } else {
                z11 = z14;
            }
        } else {
            z11 = z14;
            zW0 = false;
        }
        if (k0.g(k0Var2.f22748h)) {
            EdgeEffect edgeEffectA3 = k0Var2.f22748h;
            if (edgeEffectA3 == null) {
                edgeEffectA3 = k0Var2.a(f0.h1.Vertical);
                k0Var2.f22748h = edgeEffectA3;
            }
            W0(180.0f, edgeEffectA3, recordingCanvasBeginRecording);
            edgeEffectA3.finish();
        }
        if (k0.f(k0Var2.f22744d)) {
            EdgeEffect edgeEffectE = k0Var2.e();
            zW0 = W0(CropImageView.DEFAULT_ASPECT_RATIO, edgeEffectE, recordingCanvasBeginRecording) || zW0;
            if (k0.g(k0Var2.f22744d)) {
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (iVar.c() >> 32));
                EdgeEffect edgeEffectA4 = k0Var2.f22748h;
                if (edgeEffectA4 == null) {
                    edgeEffectA4 = k0Var2.a(f0.h1.Vertical);
                    k0Var2.f22748h = edgeEffectA4;
                }
                c11 = ' ';
                int i12 = Build.VERSION.SDK_INT;
                float fB2 = i12 >= 31 ? l.b(edgeEffectE) : CropImageView.DEFAULT_ASPECT_RATIO;
                if (i12 >= 31) {
                    l.c(edgeEffectA4, fB2, fIntBitsToFloat2);
                } else {
                    edgeEffectA4.onPull(fB2, fIntBitsToFloat2);
                }
            } else {
                c11 = ' ';
            }
        } else {
            c11 = ' ';
        }
        if (k0.g(k0Var2.f22751k)) {
            EdgeEffect edgeEffectA5 = k0Var2.f22751k;
            if (edgeEffectA5 == null) {
                edgeEffectA5 = k0Var2.a(f0.h1.Horizontal);
                k0Var2.f22751k = edgeEffectA5;
            }
            W0(270.0f, edgeEffectA5, recordingCanvasBeginRecording);
            edgeEffectA5.finish();
        }
        if (k0.f(k0Var2.f22747g)) {
            EdgeEffect edgeEffectD = k0Var2.d();
            zW0 = W0(90.0f, edgeEffectD, recordingCanvasBeginRecording) || zW0;
            if (k0.g(k0Var2.f22747g)) {
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (iVar.c() & 4294967295L));
                EdgeEffect edgeEffectA6 = k0Var2.f22751k;
                if (edgeEffectA6 == null) {
                    edgeEffectA6 = k0Var2.a(f0.h1.Horizontal);
                    k0Var2.f22751k = edgeEffectA6;
                }
                int i13 = Build.VERSION.SDK_INT;
                float fB3 = i13 >= 31 ? l.b(edgeEffectD) : CropImageView.DEFAULT_ASPECT_RATIO;
                if (i13 >= 31) {
                    l.c(edgeEffectA6, fB3, fIntBitsToFloat3);
                } else {
                    edgeEffectA6.onPull(fB3, fIntBitsToFloat3);
                }
            }
        }
        if (k0.g(k0Var2.f22749i)) {
            EdgeEffect edgeEffectA7 = k0Var2.f22749i;
            if (edgeEffectA7 == null) {
                edgeEffectA7 = k0Var2.a(f0.h1.Vertical);
                k0Var2.f22749i = edgeEffectA7;
            }
            W0(CropImageView.DEFAULT_ASPECT_RATIO, edgeEffectA7, recordingCanvasBeginRecording);
            edgeEffectA7.finish();
        }
        if (k0.f(k0Var2.f22745e)) {
            EdgeEffect edgeEffectB = k0Var2.b();
            boolean z15 = W0(180.0f, edgeEffectB, recordingCanvasBeginRecording) || zW0;
            if (k0.g(k0Var2.f22745e)) {
                z12 = z15;
                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (iVar.c() >> c11));
                EdgeEffect edgeEffectA8 = k0Var2.f22749i;
                if (edgeEffectA8 == null) {
                    edgeEffectA8 = k0Var2.a(f0.h1.Vertical);
                    k0Var2.f22749i = edgeEffectA8;
                }
                int i14 = Build.VERSION.SDK_INT;
                float fB4 = i14 >= 31 ? l.b(edgeEffectB) : CropImageView.DEFAULT_ASPECT_RATIO;
                float f11 = 1 - fIntBitsToFloat4;
                if (i14 >= 31) {
                    l.c(edgeEffectA8, fB4, f11);
                } else {
                    edgeEffectA8.onPull(fB4, f11);
                }
            } else {
                z12 = z15;
            }
            zW0 = z12;
        }
        if (zW0) {
            iVar.d();
        }
        float f12 = z11 ? CropImageView.DEFAULT_ASPECT_RATIO : fE0;
        if (z13) {
            fE0 = CropImageView.DEFAULT_ASPECT_RATIO;
        }
        v3.m layoutDirection = k0Var.getLayoutDirection();
        g2.c cVar = new g2.c();
        cVar.f28539a = recordingCanvasBeginRecording;
        long jD2 = bVar.d();
        v3.c cVarA = bVar.f34121b.A();
        v3.m mVarE = bVar.f34121b.E();
        g2.v vVarX = bVar.f34121b.x();
        long jH = bVar.f34121b.H();
        xq.c cVar2 = bVar.f34121b;
        j2.c cVar3 = (j2.c) cVar2.f56175c;
        cVar2.R(k0Var);
        cVar2.S(layoutDirection);
        cVar2.Q(cVar);
        cVar2.T(jD2);
        cVar2.f56175c = null;
        cVar.e();
        try {
            ((a0.b2) bVar.f34121b.f56174b).r(f12, fE0);
            try {
                k0Var.a();
                float f13 = -f12;
                float f14 = -fE0;
                ((a0.b2) bVar.f34121b.f56174b).r(f13, f14);
                cVar.p();
                xq.c cVar4 = bVar.f34121b;
                cVar4.R(cVarA);
                cVar4.S(mVarE);
                cVar4.Q(vVarX);
                cVar4.T(jH);
                cVar4.f56175c = cVar3;
                X0().endRecording();
                int iSave = canvasA.save();
                canvasA.translate(f13, f14);
                canvasA.drawRenderNode(X0());
                canvasA.restoreToCount(iSave);
            } catch (Throwable th2) {
                ((a0.b2) bVar.f34121b.f56174b).r(-f12, -fE0);
                throw th2;
            }
        } catch (Throwable th3) {
            cVar.p();
            xq.c cVar5 = bVar.f34121b;
            cVar5.R(cVarA);
            cVar5.S(mVarE);
            cVar5.Q(vVarX);
            cVar5.T(jH);
            cVar5.f56175c = cVar3;
            throw th3;
        }
    }
}
