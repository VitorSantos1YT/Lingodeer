package a0;

import android.os.Trace;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.ViewModelStoreOwner;
import com.afollestad.materialdialogs.internal.message.DialogContentLayout;
import com.google.api.Service;
import com.lingodeer.R;
import com.lingodeer.data.model.AchievementLevelType;
import com.yalantis.ucrop.view.CropImageView;
import h1.cc;
import h1.e9;
import h1.m9;
import h1.n9;
import h1.p8;
import h1.u8;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends kotlin.jvm.internal.n implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f36b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c0(fz.a aVar) {
        super(0);
        this.f35a = 1;
        this.f36b = (kotlin.jvm.internal.j) aVar;
    }

    /* JADX WARN: Code duplicated, block: B:99:0x020b  */
    /* JADX WARN: Type inference failed for: r0v10, types: [fz.a, kotlin.jvm.internal.j] */
    /* JADX WARN: Type inference failed for: r0v85, types: [java.lang.Object, qy.h] */
    @Override // fz.a
    public final Object invoke() {
        n5.f fVar;
        float fK;
        cc ccVar;
        fz.a aVar;
        l1.z zVar;
        switch (this.f35a) {
            case 0:
                b0.c2 c2Var = (b0.c2) this.f36b;
                Object objY = c2Var.f3458a.Y();
                v0 v0Var = v0.PostExit;
                return Boolean.valueOf(objY == v0Var && c2Var.f3461d.getValue() == v0Var);
            case 1:
                return ((kotlin.jvm.internal.j) this.f36b).invoke();
            case 2:
                ((e2.e0) this.f36b).V0();
                return qy.b0.f48488a;
            case 3:
                ((e6.l) this.f36b).f24965i.getValue();
                return qy.b0.f48488a;
            case 4:
                e6.o0 o0Var = (e6.o0) this.f36b;
                synchronized (e6.o0.f25001d) {
                    fVar = e6.o0.f25003f;
                    if (fVar == null) {
                        fVar = (n5.f) e6.o0.f25002e.a(o0Var.f25005a, e6.j0.f24946a[0]);
                        e6.o0.f25003f = fVar;
                    }
                    break;
                }
                return fVar;
            case 5:
                a9.i iVar = (a9.i) this.f36b;
                float f5 = CropImageView.DEFAULT_ASPECT_RATIO;
                if (iVar == null || (ccVar = (cc) iVar.f517a) == null) {
                    fK = 0.0f;
                } else {
                    l1.g1 g1Var = ccVar.f30110a;
                    if (g1Var.l() == CropImageView.DEFAULT_ASPECT_RATIO) {
                        fK = 0.0f;
                    } else {
                        fK = 1 - (hz.b.k(g1Var.l() - ccVar.f30111b.l(), g1Var.l(), CropImageView.DEFAULT_ASPECT_RATIO) / g1Var.l());
                    }
                }
                if (fK > 0.01f) {
                    f5 = 1.0f;
                }
                return Float.valueOf(f5);
            case 6:
                h1.r1 r1Var = (h1.r1) this.f36b;
                rz.e0.B(r1Var.H0(), null, null, new gp.a(r1Var, null, 3), 3);
                return qy.b0.f48488a;
            case 7:
                return Integer.valueOf(((l0.w) this.f36b).f39206e.f39181b.l());
            case 8:
                return Float.valueOf(((v3.c) this.f36b).e0(AchievementLevelType.DAY_STREAK_LV_7));
            case 9:
                p8 p8Var = (p8) this.f36b;
                if (!((Boolean) p8Var.f30862k.getValue()).booleanValue() && (aVar = p8Var.f30853b) != null) {
                    aVar.invoke();
                }
                return qy.b0.f48488a;
            case 10:
                rz.m mVar = ((u8) this.f36b).f31159b;
                if (mVar.w()) {
                    mVar.resumeWith(e9.Dismissed);
                }
                return Boolean.TRUE;
            case 11:
                return Float.valueOf(((n9) this.f36b).f30743a.e0(m9.f30695a));
            case 12:
                h3.b bVar = (h3.b) this.f36b;
                bVar.f31542g = null;
                Trace.beginSection("OnPositionedDispatch");
                try {
                    bVar.a();
                    return qy.b0.f48488a;
                } finally {
                    Trace.endSection();
                }
            case 13:
                return Float.valueOf(((Number) ((j1.s) ((j1.q) this.f36b)).f35513a.d()).floatValue());
            case 14:
                return new kb.c[((uz.i[]) this.f36b).length];
            case 15:
                return (km.c0) this.f36b;
            case 16:
                return (ViewModelStoreOwner) ((c0) this.f36b).invoke();
            case 17:
                return ((ViewModelStoreOwner) this.f36b.getValue()).getViewModelStore();
            case 18:
                l2.j0 j0Var = (l2.j0) this.f36b;
                qy.b0 b0Var = qy.b0.f48488a;
                j0Var.K.setValue(b0Var);
                return b0Var;
            case 19:
                m6.f fVar2 = (m6.f) this.f36b;
                long jNanoTime = System.nanoTime();
                kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
                kotlin.jvm.internal.x xVar2 = new kotlin.jvm.internal.x();
                synchronized (fVar2.f40880c) {
                    xVar.f38360a = jNanoTime - fVar2.f40882e;
                    xVar2.f38360a = 1000000000 / ((long) fVar2.f40881d);
                }
                rz.e0.B(fVar2.f40878a, null, null, new bh.l(xVar, xVar2, fVar2, jNanoTime, null, 9), 3);
                return qy.b0.f48488a;
            case 20:
                Object obj = n5.z.f43430e;
                File file = (File) this.f36b;
                synchronized (obj) {
                    n5.z.f43429d.remove(file.getAbsolutePath());
                }
                return qy.b0.f48488a;
            case 21:
                ((rz.q0) this.f36b).dispose();
                return qy.b0.f48488a;
            case 22:
                n9.f0 f0Var = (n9.f0) ry.m.s0(((n0.y0) ((ij.d) ((n9.z) this.f36b).f43742b.f517a).f34422c).b());
                if (f0Var != null && (f0Var instanceof n9.d0)) {
                    n9.d0 d0Var = (n9.d0) f0Var;
                    if (d0Var.f43530a == n9.y.REFRESH) {
                        return d0Var;
                    }
                }
                return null;
            case 23:
                uz.w0 w0Var = ((o9.a) this.f36b).f44746l;
                qy.b0 b0Var2 = qy.b0.f48488a;
                w0Var.d(b0Var2);
                return b0Var2;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                Object systemService = ((View) ((ob.m) this.f36b).f44826b).getContext().getSystemService("input_method");
                kotlin.jvm.internal.m.d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                return (InputMethodManager) systemService;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                return new BaseInputConnection(((o3.a0) this.f36b).f44629a, false);
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                return ((r2.d) this.f36b).f48752d;
            case 27:
                return ((r2.i) this.f36b).T0();
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                return Integer.valueOf(((DialogContentLayout) this.f36b).getResources().getDimensionPixelSize(R.dimen.md_dialog_frame_margin_horizontal));
            default:
                w2.f0 f0Var2 = (w2.f0) this.f36b;
                if (!((Boolean) f0Var2.f54490g.getValue()).booleanValue() && (zVar = f0Var2.f54486c) != null) {
                    zVar.l();
                }
                return qy.b0.f48488a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(Object obj, int i11) {
        super(0);
        this.f35a = i11;
        this.f36b = obj;
    }
}
