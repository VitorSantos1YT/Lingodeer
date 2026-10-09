package g1;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import d0.a1;
import d0.z0;
import g2.x;
import l1.b1;
import l1.m;
import l1.s;
import l1.t;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f28516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f28517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b1 f28518c;

    public d(boolean z11, float f5, b1 b1Var) {
        this.f28516a = z11;
        this.f28517b = f5;
        this.f28518c = b1Var;
    }

    @Override // d0.z0
    public final a1 a(h0.i iVar, s sVar) {
        long jB;
        sVar.d0(988743187);
        i iVar2 = (i) sVar.j(j.f28525a);
        b1 b1Var = this.f28518c;
        if (((x) b1Var.getValue()).f28624a != 16) {
            sVar.d0(762952444);
            sVar.p(false);
            jB = ((x) b1Var.getValue()).f28624a;
        } else {
            sVar.d0(763010228);
            jB = iVar2.b(sVar);
            sVar.p(false);
        }
        b1 b1VarH = t.H(new x(jB), sVar);
        b1 b1VarH2 = t.H(iVar2.a(sVar), sVar);
        sVar.d0(331259447);
        ViewGroup viewGroupG = ue.f.g((View) sVar.j(AndroidCompositionLocals_androidKt.f1204f));
        boolean zF = sVar.f(iVar) | sVar.f(this) | sVar.f(viewGroupG);
        Object objQ = sVar.Q();
        Object obj = m.f39353a;
        if (zF || objQ == obj) {
            Object aVar = new a(this.f28516a, this.f28517b, b1VarH, b1VarH2, viewGroupG);
            sVar.o0(aVar);
            objQ = aVar;
        }
        a aVar2 = (a) objQ;
        sVar.p(false);
        boolean zF2 = sVar.f(iVar) | sVar.h(aVar2);
        Object objQ2 = sVar.Q();
        if (zF2 || objQ2 == obj) {
            objQ2 = new fr.c(7, iVar, aVar2, (vy.d) null);
            sVar.o0(objQ2);
        }
        t.g(aVar2, iVar, (fz.e) objQ2, sVar);
        sVar.p(false);
        return aVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f28516a == dVar.f28516a && v3.f.b(this.f28517b, dVar.f28517b) && this.f28518c.equals(dVar.f28518c);
    }

    public final int hashCode() {
        return this.f28518c.hashCode() + defpackage.e.a(Boolean.hashCode(this.f28516a) * 31, this.f28517b, 31);
    }
}
