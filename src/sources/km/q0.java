package km;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.lingodeer.R;
import com.lingodeer.data.model.LearnType;
import hj.n5;
import rt.m9;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class q0 extends bp.m {
    public q0() {
        super(p0.f38262a, "AlphabetIntro");
        LearnType learnType = LearnType.LEARN;
    }

    @Override // ji.e
    public final void v(Bundle bundle) {
        t().c("jxz_alphabet_click_intro", new m9(26));
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
        String strY = ff.h.y(contextRequireContext, R.string.introduction);
        l.m mVar = this.f36398d;
        kotlin.jvm.internal.m.c(mVar);
        View view = this.f36399e;
        kotlin.jvm.internal.m.c(view);
        ve.i.H(strY, mVar, view);
        bp.m[] mVarArr = {new m1(), new p1(), new s1()};
        ta.a aVar = this.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        ((n5) aVar).f32996b.setAdapter(new ci.i(mVarArr, getChildFragmentManager(), 1));
        ta.a aVar2 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar2);
        ViewPager viewPager = ((n5) aVar2).f32996b;
        ta.a aVar3 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar3);
        viewPager.w(new vm.a(((n5) aVar3).f32996b, ff.h.l(6.0f)));
    }
}
