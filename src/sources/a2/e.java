package a2;

import android.graphics.Rect;
import android.util.SparseArray;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import androidx.compose.ui.platform.AndroidComposeView;
import e2.e0;
import g3.v;
import y.y;
import y2.i0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends n implements g3.p, e2.j {
    public final y H;
    public boolean K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AndroidComposeView f303c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h3.b f304d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f305e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Rect f306f = new Rect();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AutofillId f307t;

    public e(s sVar, v vVar, AndroidComposeView androidComposeView, h3.b bVar, String str) {
        this.f301a = sVar;
        this.f302b = vVar;
        this.f303c = androidComposeView;
        this.f304d = bVar;
        this.f305e = str;
        androidComposeView.setImportantForAutofill(1);
        s sVarR = ue.f.r(androidComposeView);
        AutofillId autofillId = sVarR != null ? (AutofillId) sVarR.f318a : null;
        if (autofillId == null) {
            throw defpackage.e.t("Required value was null.");
        }
        this.f307t = autofillId;
        this.H = new y();
    }

    @Override // e2.j
    public final void a(e0 e0Var, e0 e0Var2) {
        i0 i0VarX;
        g3.o oVarY;
        i0 i0VarX2;
        g3.o oVarY2;
        if (e0Var != null && (i0VarX2 = y2.f.x(e0Var)) != null && (oVarY2 = i0VarX2.y()) != null) {
            y.i0 i0Var = oVarY2.f28691a;
            if (i0Var.b(g3.n.f28672g) || i0Var.b(g3.n.f28673h)) {
                this.f301a.d(this.f303c, i0VarX2.f56880b);
            }
        }
        if (e0Var2 == null || (i0VarX = y2.f.x(e0Var2)) == null || (oVarY = i0VarX.y()) == null) {
            return;
        }
        y.i0 i0Var2 = oVarY.f28691a;
        if (i0Var2.b(g3.n.f28672g) || i0Var2.b(g3.n.f28673h)) {
            int i11 = i0VarX.f56880b;
            this.f304d.f31536a.G(i11, new c(this, i11));
        }
    }

    public final void b(SparseArray sparseArray) {
        g3.o oVarY;
        fz.c cVar;
        fz.c cVar2;
        int size = sparseArray.size();
        for (int i11 = 0; i11 < size; i11++) {
            int iKeyAt = sparseArray.keyAt(i11);
            AutofillValue autofillValueD = a10.b.d(sparseArray.get(iKeyAt));
            i0 i0Var = (i0) this.f302b.f28707c.b(iKeyAt);
            if (i0Var != null && (oVarY = i0Var.y()) != null) {
                y.i0 i0Var2 = oVarY.f28691a;
                Object objG = i0Var2.g(g3.n.f28672g);
                if (objG == null) {
                    objG = null;
                }
                g3.a aVar = (g3.a) objG;
                if (aVar != null && (cVar2 = (fz.c) aVar.f28635b) != null) {
                }
                Object objG2 = i0Var2.g(g3.n.f28673h);
                g3.a aVar2 = (g3.a) (objG2 != null ? objG2 : null);
                if (aVar2 != null && (cVar = (fz.c) aVar2.f28635b) != null) {
                }
            }
        }
    }
}
