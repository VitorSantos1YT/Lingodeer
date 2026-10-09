package qh;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.fragment.app.p0;
import com.lingodeer.R;
import hj.w5;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class w implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f47791b;

    public /* synthetic */ w(c0 c0Var, int i11) {
        this.f47790a = i11;
        this.f47791b = c0Var;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        int i11 = this.f47790a;
        qy.b0 b0Var = qy.b0.f48488a;
        c0 c0Var = this.f47791b;
        View it = (View) obj;
        switch (i11) {
            case 0:
                kotlin.jvm.internal.m.f(it, "it");
                l.m mVar = c0Var.f36398d;
                if (mVar != null) {
                    mVar.finish();
                }
                break;
            default:
                kotlin.jvm.internal.m.f(it, "it");
                bq.f fVar = new bq.f(c0Var.requireContext());
                py.a aVar = (py.a) fVar.f4946d;
                aVar.f47209c = 28;
                aVar.f47210d = 2;
                ta.a aVar2 = c0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar2);
                fVar.l(((w5) aVar2).f33540r);
                c0Var.A();
                ta.a aVar3 = c0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar3);
                RelativeLayout rlRoot = ((w5) aVar3).f33540r;
                kotlin.jvm.internal.m.e(rlRoot, "rlRoot");
                p0 p0VarRequireActivity = c0Var.requireActivity();
                kotlin.jvm.internal.m.e(p0VarRequireActivity, "requireActivity(...)");
                aj.b bVar = new aj.b(c0Var, 18);
                View viewInflate = LayoutInflater.from(p0VarRequireActivity).inflate(R.layout.layout_pinyin_tone_game_menu, (ViewGroup) rlRoot, false);
                viewInflate.findViewById(R.id.btn_resume).setOnClickListener(bVar);
                viewInflate.findViewById(R.id.btn_restart).setOnClickListener(bVar);
                viewInflate.findViewById(R.id.btn_quit).setOnClickListener(bVar);
                bq.z.b(viewInflate, new st.a(12));
                rlRoot.addView(viewInflate);
                break;
        }
        return b0Var;
    }
}
