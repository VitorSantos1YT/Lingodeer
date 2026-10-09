package o3;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.ui.platform.AndroidComposeView;
import com.yalantis.ucrop.view.CropImageView;
import g2.k0;
import j3.u0;
import j3.x0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AndroidComposeView f44651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ob.m f44652b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f44654d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f44655e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f44656f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f44657g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f44658h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f44659i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public w f44660j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public u0 f44661k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p f44662l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public f2.c f44663n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public f2.c f44664o;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f44653c = new Object();
    public fz.c m = b.f44643c;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final CursorAnchorInfo.Builder f44665p = new CursorAnchorInfo.Builder();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final float[] f44666q = k0.a();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Matrix f44667r = new Matrix();

    public c(AndroidComposeView androidComposeView, ob.m mVar) {
        this.f44651a = androidComposeView;
        this.f44652b = mVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, qy.h] */
    public final void a() {
        ob.m mVar = this.f44652b;
        ?? r9 = mVar.f44827c;
        InputMethodManager inputMethodManager = (InputMethodManager) r9.getValue();
        View view = (View) mVar.f44826b;
        if (inputMethodManager.isActive(view)) {
            fz.c cVar = this.m;
            float[] fArr = this.f44666q;
            cVar.invoke(new k0(fArr));
            this.f44651a.q(fArr);
            Matrix matrix = this.f44667r;
            g2.f0.y(matrix, fArr);
            w wVar = this.f44660j;
            kotlin.jvm.internal.m.c(wVar);
            long j11 = wVar.f44705b;
            p pVar = this.f44662l;
            kotlin.jvm.internal.m.c(pVar);
            u0 u0Var = this.f44661k;
            kotlin.jvm.internal.m.c(u0Var);
            f2.c cVar2 = this.f44663n;
            kotlin.jvm.internal.m.c(cVar2);
            f2.c cVar3 = this.f44664o;
            kotlin.jvm.internal.m.c(cVar3);
            boolean z11 = this.f44656f;
            boolean z12 = this.f44657g;
            boolean z13 = this.f44658h;
            boolean z14 = this.f44659i;
            CursorAnchorInfo.Builder builder = this.f44665p;
            builder.reset();
            builder.setMatrix(matrix);
            x0 x0Var = wVar.f44706c;
            int iF = x0.f(j11);
            builder.setSelectionRange(iF, x0.e(j11));
            if (z11 && iF >= 0) {
                int iS = pVar.s(iF);
                f2.c cVarC = u0Var.c(iS);
                float fK = hz.b.k(cVarC.f26572a, CropImageView.DEFAULT_ASPECT_RATIO, (int) (u0Var.f35799c >> 32));
                boolean zK = com.bumptech.glide.e.k(cVar2, fK, cVarC.f26573b);
                boolean zK2 = com.bumptech.glide.e.k(cVar2, fK, cVarC.f26575d);
                boolean z15 = u0Var.a(iS) == u3.j.Rtl;
                int i11 = (zK || zK2) ? 1 : 0;
                if (!zK || !zK2) {
                    i11 |= 2;
                }
                if (z15) {
                    i11 |= 4;
                }
                int i12 = i11;
                float f5 = cVarC.f26573b;
                float f11 = cVarC.f26575d;
                builder.setInsertionMarkerLocation(fK, f5, f11, f11, i12);
            }
            if (z12) {
                int iF2 = x0Var != null ? x0.f(x0Var.f35823a) : -1;
                int iE = x0Var != null ? x0.e(x0Var.f35823a) : -1;
                if (iF2 >= 0 && iF2 < iE) {
                    builder.setComposingText(iF2, wVar.f44704a.f35700b.subSequence(iF2, iE));
                    int iS2 = pVar.s(iF2);
                    int iS3 = pVar.s(iE);
                    float[] fArr2 = new float[(iS3 - iS2) * 4];
                    u0Var.f35798b.a(j3.t.b(iS2, iS3), fArr2);
                    int i13 = iF2;
                    while (i13 < iE) {
                        int iS4 = pVar.s(i13);
                        int i14 = (iS4 - iS2) * 4;
                        float f12 = fArr2[i14];
                        int i15 = iE;
                        float f13 = fArr2[i14 + 1];
                        int i16 = iS2;
                        float f14 = fArr2[i14 + 2];
                        float f15 = fArr2[i14 + 3];
                        int i17 = i13;
                        int i18 = (cVar2.f26572a < f14 ? 1 : 0) & (f12 < cVar2.f26574c ? 1 : 0) & (cVar2.f26573b < f15 ? 1 : 0) & (f13 < cVar2.f26575d ? 1 : 0);
                        if (!com.bumptech.glide.e.k(cVar2, f12, f13) || !com.bumptech.glide.e.k(cVar2, f14, f15)) {
                            i18 |= 2;
                        }
                        if (u0Var.a(iS4) == u3.j.Rtl) {
                            i18 |= 4;
                        }
                        builder.addCharacterBounds(i17, f12, f13, f14, f15, i18);
                        i13 = i17 + 1;
                        iE = i15;
                        iS2 = i16;
                    }
                }
            }
            int i19 = Build.VERSION.SDK_INT;
            if (i19 >= 33 && z13) {
                a5.e.n(builder, cVar3);
            }
            if (i19 >= 34 && z14) {
                a5.b.a(builder, u0Var, cVar2);
            }
            ((InputMethodManager) r9.getValue()).updateCursorAnchorInfo(view, builder.build());
            this.f44655e = false;
        }
    }
}
