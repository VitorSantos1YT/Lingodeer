package z4;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.Interpolator;
import com.yalantis.ucrop.view.CropImageView;
import java.util.Objects;
import java.util.WeakHashMap;
import qp.o2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class z0 implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.datastore.preferences.protobuf.l f58922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v1 f58923b;

    public z0(View view, androidx.datastore.preferences.protobuf.l lVar) {
        v1 v1VarB;
        this.f58922a = lVar;
        WeakHashMap weakHashMap = s0.f58893a;
        v1 v1VarA = k0.a(view);
        if (v1VarA != null) {
            int i11 = Build.VERSION.SDK_INT;
            v1VarB = (i11 >= 34 ? new k1(v1VarA) : i11 >= 30 ? new j1(v1VarA) : i11 >= 29 ? new i1(v1VarA) : new h1(v1VarA)).b();
        } else {
            v1VarB = null;
        }
        this.f58923b = v1VarB;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        Interpolator interpolator;
        if (!view.isLaidOut()) {
            this.f58923b = v1.h(view, windowInsets);
            return a1.j(view, windowInsets);
        }
        v1 v1VarH = v1.h(view, windowInsets);
        s1 s1Var = v1VarH.f58905a;
        if (this.f58923b == null) {
            WeakHashMap weakHashMap = s0.f58893a;
            this.f58923b = k0.a(view);
        }
        if (this.f58923b == null) {
            this.f58923b = v1VarH;
            return a1.j(view, windowInsets);
        }
        androidx.datastore.preferences.protobuf.l lVarK = a1.k(view);
        if (lVarK != null && Objects.equals((v1) lVarK.f1510b, v1VarH)) {
            return a1.j(view, windowInsets);
        }
        int[] iArr = new int[1];
        int[] iArr2 = new int[1];
        v1 v1Var = this.f58923b;
        int i11 = 1;
        while (i11 <= 512) {
            r4.d dVarG = s1Var.g(i11);
            r4.d dVarG2 = v1Var.f58905a.g(i11);
            int i12 = dVarG.f48793a;
            int i13 = dVarG.f48796d;
            int i14 = dVarG.f48795c;
            int i15 = dVarG.f48794b;
            int i16 = dVarG2.f48793a;
            int i17 = dVarG2.f48796d;
            int i18 = dVarG2.f48795c;
            int i19 = dVarG2.f48794b;
            boolean z11 = i12 > i16 || i15 > i19 || i14 > i18 || i13 > i17;
            if (z11 != (i12 < i16 || i15 < i19 || i14 < i18 || i13 < i17)) {
                if (z11) {
                    iArr[0] = iArr[0] | i11;
                } else {
                    iArr2[0] = iArr2[0] | i11;
                }
            }
            i11 <<= 1;
            iArr = iArr;
        }
        int i21 = iArr[0];
        int i22 = iArr2[0];
        int i23 = i21 | i22;
        if (i23 == 0) {
            this.f58923b = v1VarH;
            return a1.j(view, windowInsets);
        }
        v1 v1Var2 = this.f58923b;
        if ((i21 & 8) != 0) {
            interpolator = a1.f58805e;
        } else if ((i22 & 8) != 0) {
            interpolator = a1.f58806f;
        } else if ((i21 & 519) != 0) {
            interpolator = a1.f58807g;
        } else {
            interpolator = (i22 & 519) != 0 ? a1.f58808h : null;
        }
        g1 g1Var = new g1(i23, interpolator, (i23 & 8) != 0 ? 160L : 250L);
        g1Var.f58839a.e(CropImageView.DEFAULT_ASPECT_RATIO);
        ValueAnimator duration = ValueAnimator.ofFloat(CropImageView.DEFAULT_ASPECT_RATIO, 1.0f).setDuration(g1Var.f58839a.b());
        r4.d dVarG3 = s1Var.g(i23);
        r4.d dVarG4 = v1Var2.f58905a.g(i23);
        int iMin = Math.min(dVarG3.f48793a, dVarG4.f48793a);
        int i24 = dVarG3.f48794b;
        int i25 = dVarG4.f48794b;
        int iMin2 = Math.min(i24, i25);
        int i26 = dVarG3.f48795c;
        int i27 = dVarG4.f48795c;
        int iMin3 = Math.min(i26, i27);
        int i28 = dVarG3.f48796d;
        int i29 = dVarG4.f48796d;
        o2 o2Var = new o2(11, r4.d.c(iMin, iMin2, iMin3, Math.min(i28, i29)), r4.d.c(Math.max(dVarG3.f48793a, dVarG4.f48793a), Math.max(i24, i25), Math.max(i26, i27), Math.max(i28, i29)));
        a1.g(view, g1Var, v1VarH, false);
        duration.addUpdateListener(new y0(g1Var, v1VarH, v1Var2, i23, view));
        duration.addListener(new qa.p(6, g1Var, view));
        w.a(view, new mw.a(view, g1Var, o2Var, duration, 6, false));
        this.f58923b = v1VarH;
        return a1.j(view, windowInsets);
    }
}
