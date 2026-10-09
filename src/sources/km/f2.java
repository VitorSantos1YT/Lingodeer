package km;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.lingodeer.R;
import hj.f3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class f2 extends bp.m {
    public lm.b O;
    public final qy.q P;

    public f2() {
        super(e2.f38179a, "AlphabetChart");
        this.P = com.bumptech.glide.d.v(new hh.o(this, 25));
    }

    @Override // ji.e
    public final void v(Bundle bundle) {
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
        String strY = ff.h.y(contextRequireContext, R.string.gojuon);
        l.m mVar = this.f36398d;
        kotlin.jvm.internal.m.c(mVar);
        View view = getView();
        kotlin.jvm.internal.m.c(view);
        ve.i.H(strY, mVar, view);
        this.O = new lm.b(this);
        ta.a aVar = this.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        ((f3) aVar).f32566d.setUserInputEnabled(false);
        ta.a aVar2 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar2);
        ((f3) aVar2).f32566d.setAdapter(this.O);
        ta.a aVar3 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar3);
        bq.z.b(((f3) aVar3).f32564b, new gr.s(this, 25));
        ta.a aVar4 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar4);
        TabLayout tabLayout = ((f3) aVar4).f32565c;
        ta.a aVar5 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar5);
        new TabLayoutMediator(tabLayout, ((f3) aVar5).f32566d, new hh.c(this, 8)).a();
    }
}
