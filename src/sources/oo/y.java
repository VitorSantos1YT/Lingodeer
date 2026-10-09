package oo;

import android.os.Bundle;
import androidx.lifecycle.LifecycleOwnerKt;
import bp.b1;
import com.lingodeer.R;
import com.lingodeer.data.model.INTENTS;
import hj.c5;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class y extends ji.e {
    public int N;
    public long O;
    public int P;
    public final Object Q;

    public y() {
        super(w.f45707a, "StoryReadingFinish");
        this.Q = com.bumptech.glide.d.u(qy.j.SYNCHRONIZED, new x(this, 0));
        com.bumptech.glide.d.u(qy.j.NONE, new b1(22, this, new x(this, 1)));
    }

    @Override // androidx.fragment.app.k0
    public final void onSaveInstanceState(Bundle outState) {
        kotlin.jvm.internal.m.f(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putInt(INTENTS.EXTRA_INT, this.P);
    }

    @Override // ji.e
    public final void v(Bundle bundle) {
        this.N = requireArguments().getInt(INTENTS.EXTRA_INT);
        this.O = requireArguments().getLong(INTENTS.EXTRA_LONG);
        t().c("jxz_main_story_read_finish", new lt.e(this, 11));
        ta.a aVar = this.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        bq.z.b(((c5) aVar).f32468b, new kp.j(this, 28));
        vy.d dVar = null;
        if (bundle == null) {
            rz.e0.B(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ns.j(this, null, 7), 3);
        } else {
            this.P = bundle.getInt(INTENTS.EXTRA_INT);
            x();
        }
        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(this), null, null, new mv.f0(this, dVar, 3), 3);
    }

    public final void x() {
        String string = getString(R.string._plus_s_xp, String.valueOf(this.P));
        kotlin.jvm.internal.m.e(string, "getString(...)");
        ta.a aVar = this.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        ((c5) aVar).f32469c.f33390b.setText(string);
    }
}
