package ui;

import android.os.Bundle;
import android.view.KeyEvent;
import com.google.type.bACG.scNRoQgKSYX;
import com.lingo.lingoskill.object.LanCustomInfo;
import com.lingodeer.data.model.INTENTS;
import jp.h1;
import jp.p0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class h extends p0 {

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public xi.c f52989m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public int f52990n0;

    @Override // jp.p0
    public final void D() {
        this.f52989m0 = (xi.c) requireArguments().getParcelable(INTENTS.EXTRA_OBJECT);
        this.f52990n0 = requireArguments().getInt(INTENTS.EXTRA_INT);
        xi.c cVar = this.f52989m0;
        kotlin.jvm.internal.m.c(cVar);
        new yi.c(this, cVar, this.f52990n0);
        Q();
        R();
    }

    @Override // jp.p0
    public final void G(int i11, KeyEvent keyEvent) {
        if (i11 != 4 || getActivity() == null) {
            return;
        }
        h1 h1Var = new h1();
        h1Var.u(getChildFragmentManager(), "LessonQuitBottomSheetDialogFragment");
        h1Var.U = new qh.z(6, this, h1Var);
    }

    @Override // jp.p0
    public final void Z() {
        t().d("AlphabetLessonPractice");
    }

    @Override // jp.p0, mp.b
    public final void g(boolean z11) {
        yi.c cVar = (yi.c) this.N;
        if (this.f52990n0 != 0) {
            l.m mVar = this.f36398d;
            if (mVar != null) {
                kotlin.jvm.internal.m.c(cVar);
                int i11 = cVar.L;
                String correctAcent = String.valueOf(cVar.M);
                kotlin.jvm.internal.m.f(correctAcent, "correctAcent");
                Bundle bundle = new Bundle();
                bundle.putInt(scNRoQgKSYX.hlVAeJSs, i11);
                bundle.putString(INTENTS.EXTRA_STRING, correctAcent);
                h0 h0Var = new h0();
                h0Var.setArguments(bundle);
                ff.h.A(mVar, h0Var);
                return;
            }
            return;
        }
        xi.c cVar2 = this.f52989m0;
        kotlin.jvm.internal.m.c(cVar2);
        int i12 = (int) (cVar2.f56095a - 1);
        if (ij.l.f34436b == null) {
            synchronized (ij.l.class) {
                if (ij.l.f34436b == null) {
                    ij.l.f34436b = new ij.l();
                }
            }
        }
        if (b7.e0.d(ij.l.f34436b, 0) == i12) {
            LanCustomInfo lanCustomInfoB = ub.a.Z().b(0);
            lanCustomInfoB.setPronun(i12 + 1);
            ub.a.Z().f34437a.f34446f.insertOrReplace(lanCustomInfoB);
        }
        l.m mVar2 = this.f36398d;
        kotlin.jvm.internal.m.c(mVar2);
        Bundle bundle2 = new Bundle();
        bundle2.putInt(INTENTS.EXTRA_INT, i12);
        km.u uVar = new km.u();
        uVar.setArguments(bundle2);
        ff.h.A(mVar2, uVar);
    }
}
