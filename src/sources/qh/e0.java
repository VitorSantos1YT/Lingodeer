package qh;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.p0;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import hj.x5;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e0 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k0 f47755b;

    public /* synthetic */ e0(k0 k0Var, int i11) {
        this.f47754a = i11;
        this.f47755b = k0Var;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        int i11 = this.f47754a;
        qy.b0 b0Var = qy.b0.f48488a;
        k0 k0Var = this.f47755b;
        View it = (View) obj;
        switch (i11) {
            case 0:
                kotlin.jvm.internal.m.f(it, "it");
                bq.f fVar = new bq.f(k0Var.requireContext());
                py.a aVar = (py.a) fVar.f4946d;
                aVar.f47209c = 28;
                aVar.f47210d = 2;
                ta.a aVar2 = k0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar2);
                fVar.l(((x5) aVar2).f33600k);
                k0Var.D();
                ta.a aVar3 = k0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar3);
                ConstraintLayout rlRoot = ((x5) aVar3).f33600k;
                kotlin.jvm.internal.m.e(rlRoot, "rlRoot");
                p0 p0VarRequireActivity = k0Var.requireActivity();
                kotlin.jvm.internal.m.e(p0VarRequireActivity, "requireActivity(...)");
                aj.b bVar = new aj.b(k0Var, 19);
                View viewInflate = LayoutInflater.from(p0VarRequireActivity).inflate(R.layout.layout_pinyin_tone_game_menu, (ViewGroup) rlRoot, false);
                viewInflate.findViewById(R.id.btn_resume).setOnClickListener(bVar);
                viewInflate.findViewById(R.id.btn_restart).setOnClickListener(bVar);
                viewInflate.findViewById(R.id.btn_quit).setOnClickListener(bVar);
                bq.z.b(viewInflate, new st.a(12));
                rlRoot.addView(viewInflate);
                return b0Var;
            case 1:
                kotlin.jvm.internal.m.f(it, "it");
                l.m mVar = k0Var.f36398d;
                if (mVar != null) {
                    mVar.finish();
                }
                return b0Var;
            default:
                kotlin.jvm.internal.m.f(it, "it");
                th.e eVar = k0Var.N;
                if (eVar == null) {
                    kotlin.jvm.internal.m.n("player");
                    throw null;
                }
                eVar.k(R.raw.game_spell_more);
                for (int childCount = k0Var.x().f32539d.getChildCount() - 1; -1 < childCount; childCount--) {
                    View childAt = k0Var.x().f32539d.getChildAt(childCount);
                    if (childAt.findViewById(R.id.iv_bottom_line).getVisibility() == 0) {
                        CharSequence text = ((TextView) childAt.findViewById(R.id.tv_char)).getText();
                        kotlin.jvm.internal.m.e(text, "getText(...)");
                        if (text.length() > 0) {
                            Object tag = childAt.getTag();
                            kotlin.jvm.internal.m.d(tag, "null cannot be cast to non-null type android.view.View");
                            View view = (View) tag;
                            view.setEnabled(true);
                            view.setAlpha(1.0f);
                            ((TextView) childAt.findViewById(R.id.tv_char)).setText(BuildConfig.VERSION_NAME);
                            childAt.setTag(null);
                            return b0Var;
                        }
                    }
                }
                return b0Var;
        }
    }
}
