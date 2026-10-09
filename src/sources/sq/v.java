package sq;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.KeyEvent;
import b7.e0;
import com.lingo.lingoskill.object.LanCustomInfo;
import com.lingodeer.data.model.INTENTS;
import jp.h1;
import jp.p0;
import qh.z;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class v extends p0 {

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public pq.b f51752m0;

    @Override // jp.p0
    public final void D() {
        Parcelable parcelable = requireArguments().getParcelable(INTENTS.EXTRA_OBJECT);
        kotlin.jvm.internal.m.c(parcelable);
        pq.b bVar = (pq.b) parcelable;
        this.f51752m0 = bVar;
        this.N = new qq.b(this, bVar);
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
        h1Var.U = new z(4, this, h1Var);
    }

    @Override // jp.p0, mp.b
    public final void g(boolean z11) {
        pq.b bVar = this.f51752m0;
        if (bVar == null) {
            kotlin.jvm.internal.m.n("mLesson");
            throw null;
        }
        int i11 = bVar.f46986a;
        if (ij.l.f34436b == null) {
            synchronized (ij.l.class) {
                if (ij.l.f34436b == null) {
                    ij.l.f34436b = new ij.l();
                }
            }
        }
        if (e0.d(ij.l.f34436b, 7) == i11) {
            LanCustomInfo lanCustomInfoB = ub.a.Z().b(7);
            lanCustomInfoB.setPronun(i11 + 1);
            ub.a.Z().f34437a.f34446f.insertOrReplace(lanCustomInfoB);
        }
        l.m mVar = this.f36398d;
        if (mVar != null) {
            Bundle bundle = new Bundle();
            bundle.putInt(INTENTS.EXTRA_INT, i11);
            km.u uVar = new km.u();
            uVar.setArguments(bundle);
            ff.h.A(mVar, uVar);
        }
    }

    @Override // jp.p0, bp.n, ji.e, androidx.fragment.app.k0
    public final void onResume() {
        super.onResume();
        t().d("AlphabetLessonPractice");
    }
}
