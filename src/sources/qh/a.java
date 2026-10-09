package qh;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.p0;
import com.lingodeer.R;
import hj.u5;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f47739b;

    public /* synthetic */ a(e eVar, int i11) {
        this.f47738a = i11;
        this.f47739b = eVar;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        int i11 = this.f47738a;
        qy.b0 b0Var = qy.b0.f48488a;
        e eVar = this.f47739b;
        View it = (View) obj;
        switch (i11) {
            case 0:
                kotlin.jvm.internal.m.f(it, "it");
                bq.f fVar = new bq.f(eVar.requireContext());
                py.a aVar = (py.a) fVar.f4946d;
                aVar.f47209c = 28;
                aVar.f47210d = 2;
                ta.a aVar2 = eVar.f36400f;
                kotlin.jvm.internal.m.c(aVar2);
                fVar.l(((u5) aVar2).f33419t);
                eVar.E();
                ta.a aVar3 = eVar.f36400f;
                kotlin.jvm.internal.m.c(aVar3);
                ConstraintLayout rlRoot = ((u5) aVar3).f33419t;
                kotlin.jvm.internal.m.e(rlRoot, "rlRoot");
                p0 p0VarRequireActivity = eVar.requireActivity();
                kotlin.jvm.internal.m.e(p0VarRequireActivity, "requireActivity(...)");
                aj.b bVar = new aj.b(eVar, 17);
                View viewInflate = LayoutInflater.from(p0VarRequireActivity).inflate(R.layout.layout_pinyin_tone_game_menu, (ViewGroup) rlRoot, false);
                viewInflate.findViewById(R.id.btn_resume).setOnClickListener(bVar);
                viewInflate.findViewById(R.id.btn_restart).setOnClickListener(bVar);
                viewInflate.findViewById(R.id.btn_quit).setOnClickListener(bVar);
                bq.z.b(viewInflate, new st.a(12));
                rlRoot.addView(viewInflate);
                break;
            default:
                kotlin.jvm.internal.m.f(it, "it");
                l.m mVar = eVar.f36398d;
                if (mVar != null) {
                    mVar.finish();
                }
                break;
        }
        return b0Var;
    }
}
