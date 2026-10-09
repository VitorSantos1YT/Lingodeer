package oo;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.p0;
import androidx.lifecycle.LifecycleOwnerKt;
import com.lingo.lingoskill.speak.object.PodSentence;
import com.lingo.lingoskill.speak.ui.SpeakLeadBoardActivity;
import com.lingodeer.R;
import com.lingodeer.data.model.INTENTS;
import com.tbruyelle.rxpermissions3.BuildConfig;
import hj.a5;
import java.util.List;
import op.a;
import op.b;
import vf.eq.EHjhWcesDUIsIw;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class t<T extends op.b, F extends op.a, G extends PodSentence<T, F>> extends bp.m {
    public g O;
    public List P;
    public int Q;
    public long R;
    public lc.d S;
    public int T;
    public Bundle U;
    public final Object V;

    public t() {
        super(q.f45699a, "StorySpeakingPreview");
        qy.j jVar = qy.j.SYNCHRONIZED;
        com.bumptech.glide.d.u(jVar, new s(this, 0));
        this.V = com.bumptech.glide.d.u(jVar, new s(this, 1));
    }

    public static final void x(t tVar) {
        ta.a aVar = tVar.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        ((a5) aVar).f32354f.setText(tVar.getString(R.string._plus_s_xp, String.valueOf(tVar.T)));
        int i11 = SpeakLeadBoardActivity.H;
        Context contextRequireContext = tVar.requireContext();
        kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
        tVar.startActivity(md.a.p(contextRequireContext, tVar.Q));
        l.m mVar = tVar.f36398d;
        if (mVar != null) {
            mVar.finish();
        }
    }

    public abstract String A();

    public abstract String B();

    @Override // androidx.fragment.app.k0
    public final void onSaveInstanceState(Bundle outState) {
        kotlin.jvm.internal.m.f(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putInt(INTENTS.EXTRA_INT, this.T);
    }

    @Override // androidx.fragment.app.k0
    public final void onStop() {
        super.onStop();
        g gVar = this.O;
        if (gVar != null) {
            gVar.c();
        } else {
            kotlin.jvm.internal.m.n("mVideoHelper");
            throw null;
        }
    }

    @Override // ji.e
    public final void q() {
        g gVar = this.O;
        if (gVar != null) {
            gVar.a();
        } else {
            kotlin.jvm.internal.m.n("mVideoHelper");
            throw null;
        }
    }

    public abstract List y(int i11);

    public abstract String z(PodSentence podSentence, int i11);

    @Override // ji.e
    public final void v(Bundle bundle) {
        p0 p0VarRequireActivity = requireActivity();
        kotlin.jvm.internal.m.d(p0VarRequireActivity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        View viewRequireView = requireView();
        kotlin.jvm.internal.m.e(viewRequireView, "requireView(...)");
        ve.i.H(BuildConfig.VERSION_NAME, (l.m) p0VarRequireActivity, viewRequireView);
        this.U = bundle;
        this.Q = requireArguments().getInt(EHjhWcesDUIsIw.qIbWVKd);
        this.R = requireArguments().getLong(INTENTS.EXTRA_LONG);
        this.P = y(this.Q);
        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(this), null, null, new r(this, null, 0), 3);
    }
}
