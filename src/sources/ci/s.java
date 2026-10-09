package ci;

import android.view.View;
import com.google.android.material.button.MaterialButton;
import hj.q5;
import jp.h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class s implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f7152b;

    public /* synthetic */ s(v vVar, int i11) {
        this.f7151a = i11;
        this.f7152b = vVar;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        View it = (View) obj;
        switch (this.f7151a) {
            case 0:
                kotlin.jvm.internal.m.f(it, "it");
                v vVar = this.f7152b;
                ta.a aVar = vVar.f36400f;
                kotlin.jvm.internal.m.c(aVar);
                MaterialButton materialButton = ((q5) aVar).f33167b;
                kotlin.jvm.internal.m.c(materialButton);
                materialButton.setEnabled(false);
                ii.a aVar2 = vVar.N;
                kotlin.jvm.internal.m.c(aVar2);
                ((mm.a) aVar2).o();
                break;
            default:
                h1 h1Var = new h1();
                v vVar2 = this.f7152b;
                h1Var.u(vVar2.getChildFragmentManager(), "LessonQuitBottomSheetDialogFragment");
                h1Var.U = new ob.c(3, vVar2, h1Var);
                break;
        }
        return qy.b0.f48488a;
    }
}
