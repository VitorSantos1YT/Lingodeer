package hh;

import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.lingo.fluent.ui.base.PdVocabularyActivity;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g1 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PdVocabularyActivity f32235b;

    public /* synthetic */ g1(PdVocabularyActivity pdVocabularyActivity, int i11) {
        this.f32234a = i11;
        this.f32235b = pdVocabularyActivity;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        int i11 = this.f32234a;
        int i12 = 6;
        vy.d dVar = null;
        boolean z11 = false;
        qy.b0 b0Var = qy.b0.f48488a;
        PdVocabularyActivity pdVocabularyActivity = this.f32235b;
        switch (i11) {
            case 0:
                View it = (View) obj;
                int i13 = PdVocabularyActivity.Z;
                kotlin.jvm.internal.m.f(it, "it");
                if (System.currentTimeMillis() - pdVocabularyActivity.Y < 400) {
                    if (pdVocabularyActivity.U == 0) {
                        androidx.recyclerview.widget.m1 layoutManager = ((hj.m0) pdVocabularyActivity.j()).f32907f.getLayoutManager();
                        kotlin.jvm.internal.m.d(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                        ((LinearLayoutManager) layoutManager).scrollToPositionWithOffset(0, 0);
                    } else {
                        androidx.recyclerview.widget.m1 layoutManager2 = ((hj.m0) pdVocabularyActivity.j()).f32908g.getLayoutManager();
                        kotlin.jvm.internal.m.d(layoutManager2, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                        ((LinearLayoutManager) layoutManager2).scrollToPositionWithOffset(0, 0);
                    }
                }
                pdVocabularyActivity.Y = System.currentTimeMillis();
                break;
            case 1:
                lc.d it2 = (lc.d) obj;
                int i14 = PdVocabularyActivity.Z;
                kotlin.jvm.internal.m.f(it2, "it");
                int i15 = pdVocabularyActivity.U;
                if (i15 == 0) {
                    rz.e0.B(LifecycleOwnerKt.getLifecycleScope(pdVocabularyActivity), null, null, new bp.j(i12, pdVocabularyActivity, dVar, z11), 3);
                } else if (i15 == 1) {
                    pdVocabularyActivity.u();
                }
                break;
            case 2:
                View it3 = (View) obj;
                int i16 = PdVocabularyActivity.Z;
                kotlin.jvm.internal.m.f(it3, "it");
                rz.e0.B(LifecycleOwnerKt.getLifecycleScope(pdVocabularyActivity), null, null, new bp.j(i12, pdVocabularyActivity, dVar, z11), 3);
                break;
            default:
                View it4 = (View) obj;
                int i17 = PdVocabularyActivity.Z;
                kotlin.jvm.internal.m.f(it4, "it");
                pdVocabularyActivity.u();
                break;
        }
        return b0Var;
    }
}
