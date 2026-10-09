package b1;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;
import com.yalantis.ucrop.view.CropImageView;
import g2.f0;
import g2.k0;
import j3.u0;
import j3.x0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f3805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f3806b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f3808d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f3809e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f3810f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f3811g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f3812h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f3813i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public o3.w f3814j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public u0 f3815k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public o3.p f3816l;
    public f2.c m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public f2.c f3817n;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f3807c = new Object();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final CursorAnchorInfo.Builder f3818o = new CursorAnchorInfo.Builder();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final float[] f3819p = k0.a();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Matrix f3820q = new Matrix();

    public t(d dVar, p pVar) {
        this.f3805a = dVar;
        this.f3806b = pVar;
    }

    public final void a() {
        p pVar = this.f3806b;
        InputMethodManager inputMethodManagerZ = pVar.z();
        View view = (View) pVar.f3800b;
        if (!inputMethodManagerZ.isActive(view) || this.f3814j == null || this.f3816l == null || this.f3815k == null || this.m == null || this.f3817n == null) {
            return;
        }
        float[] fArr = this.f3819p;
        k0.d(fArr);
        w2.x xVar = (w2.x) this.f3805a.f3772a.T.getValue();
        if (xVar != null) {
            if (!xVar.k()) {
                xVar = null;
            }
            if (xVar != null) {
                xVar.l(fArr);
            }
        }
        f2.c cVar = this.f3817n;
        kotlin.jvm.internal.m.c(cVar);
        float f5 = -cVar.f26572a;
        f2.c cVar2 = this.f3817n;
        kotlin.jvm.internal.m.c(cVar2);
        k0.f(fArr, f5, -cVar2.f26573b);
        Matrix matrix = this.f3820q;
        f0.y(matrix, fArr);
        o3.w wVar = this.f3814j;
        kotlin.jvm.internal.m.c(wVar);
        long j11 = wVar.f44705b;
        o3.p pVar2 = this.f3816l;
        kotlin.jvm.internal.m.c(pVar2);
        u0 u0Var = this.f3815k;
        kotlin.jvm.internal.m.c(u0Var);
        f2.c cVar3 = this.m;
        kotlin.jvm.internal.m.c(cVar3);
        f2.c cVar4 = this.f3817n;
        kotlin.jvm.internal.m.c(cVar4);
        boolean z11 = this.f3810f;
        boolean z12 = this.f3811g;
        boolean z13 = this.f3812h;
        boolean z14 = this.f3813i;
        CursorAnchorInfo.Builder builder = this.f3818o;
        builder.reset();
        builder.setMatrix(matrix);
        x0 x0Var = wVar.f44706c;
        int iF = x0.f(j11);
        builder.setSelectionRange(iF, x0.e(j11));
        if (z11 && iF >= 0) {
            int iS = pVar2.s(iF);
            f2.c cVarC = u0Var.c(iS);
            float fK = hz.b.k(cVarC.f26572a, CropImageView.DEFAULT_ASPECT_RATIO, (int) (u0Var.f35799c >> 32));
            boolean zF = s.f(cVar3, fK, cVarC.f26573b);
            boolean zF2 = s.f(cVar3, fK, cVarC.f26575d);
            boolean z15 = u0Var.a(iS) == u3.j.Rtl;
            int i11 = (zF || zF2) ? 1 : 0;
            if (!zF || !zF2) {
                i11 |= 2;
            }
            if (z15) {
                i11 |= 4;
            }
            int i12 = i11;
            float f11 = cVarC.f26573b;
            float f12 = cVarC.f26575d;
            builder.setInsertionMarkerLocation(fK, f11, f12, f12, i12);
        }
        if (z12) {
            int iF2 = x0Var != null ? x0.f(x0Var.f35823a) : -1;
            int iE = x0Var != null ? x0.e(x0Var.f35823a) : -1;
            if (iF2 >= 0 && iF2 < iE) {
                builder.setComposingText(iF2, wVar.f44704a.f35700b.subSequence(iF2, iE));
                int iS2 = pVar2.s(iF2);
                int iS3 = pVar2.s(iE);
                float[] fArr2 = new float[(iS3 - iS2) * 4];
                u0Var.f35798b.a(j3.t.b(iS2, iS3), fArr2);
                int i13 = iF2;
                while (i13 < iE) {
                    int iS4 = pVar2.s(i13);
                    int i14 = (iS4 - iS2) * 4;
                    float f13 = fArr2[i14];
                    int i15 = iE;
                    float f14 = fArr2[i14 + 1];
                    int i16 = iS2;
                    float f15 = fArr2[i14 + 2];
                    float f16 = fArr2[i14 + 3];
                    int i17 = i13;
                    int i18 = (cVar3.f26572a < f15 ? 1 : 0) & (f13 < cVar3.f26574c ? 1 : 0) & (cVar3.f26573b < f16 ? 1 : 0) & (f14 < cVar3.f26575d ? 1 : 0);
                    if (!s.f(cVar3, f13, f14) || !s.f(cVar3, f15, f16)) {
                        i18 |= 2;
                    }
                    if (u0Var.a(iS4) == u3.j.Rtl) {
                        i18 |= 4;
                    }
                    builder.addCharacterBounds(i17, f13, f14, f15, f16, i18);
                    i13 = i17 + 1;
                    iE = i15;
                    iS2 = i16;
                }
            }
        }
        int i19 = Build.VERSION.SDK_INT;
        if (i19 >= 33 && z13) {
            g.a(builder, cVar4);
        }
        if (i19 >= 34 && z14) {
            l.a(builder, u0Var, cVar3);
        }
        pVar.z().updateCursorAnchorInfo(view, builder.build());
        this.f3809e = false;
    }
}
