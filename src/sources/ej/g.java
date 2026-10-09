package ej;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.p0;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import bp.b1;
import com.lingo.lingoskill.chineseskill.ui.sc.adapter.ScDetailAdapter;
import com.lingo.lingoskill.object.TravelCategory;
import com.lingodeer.R;
import com.lingodeer.data.model.INTENTS;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import hj.e3;
import hj.w4;
import java.util.ArrayList;
import kotlin.jvm.internal.m;
import rz.e0;
import z2.p1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class g extends ji.e {
    public final ArrayList N;
    public ScDetailAdapter O;
    public TravelCategory P;
    public th.e Q;
    public bq.f R;
    public final Object S;
    public final Object T;
    public final Object U;

    public g() {
        super(d.f25683a, BuildConfig.VERSION_NAME);
        this.N = new ArrayList();
        qy.j jVar = qy.j.SYNCHRONIZED;
        this.S = com.bumptech.glide.d.u(jVar, new f(this, 1));
        this.T = com.bumptech.glide.d.u(jVar, new f(this, 2));
        this.U = com.bumptech.glide.d.u(qy.j.NONE, new b1(6, this, new f(this, 0)));
    }

    @Override // ji.e, androidx.fragment.app.k0
    public final void onResume() {
        super.onResume();
        TravelCategory travelCategory = this.P;
        if (travelCategory == null) {
            m.n("scCate");
            throw null;
        }
        if (travelCategory.getCategoryId() == -1) {
            t().d("TravelPhraseFavList");
        } else {
            t().d("TravelPhraseItemList");
        }
    }

    @Override // ji.e
    public final void q() {
        bq.f fVar = this.R;
        if (fVar != null) {
            fVar.t();
        }
        bq.f fVar2 = this.R;
        if (fVar2 != null) {
            fVar2.t();
        }
        th.e eVar = this.Q;
        if (eVar != null) {
            eVar.n();
        }
        th.e eVar2 = this.Q;
        if (eVar2 != null) {
            eVar2.b();
        }
    }

    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, qy.h] */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.lang.Object, qy.h] */
    @Override // ji.e
    public final void v(Bundle bundle) {
        TravelCategory travelCategory;
        String translation;
        Bundle arguments = getArguments();
        if (arguments == null || (travelCategory = (TravelCategory) arguments.getParcelable(INTENTS.EXTRA_OBJECT)) == null) {
            return;
        }
        this.P = travelCategory;
        Context contextRequireContext = requireContext();
        m.e(contextRequireContext, "requireContext(...)");
        this.Q = new th.e(contextRequireContext);
        m.c(this.f36398d);
        this.R = new bq.f(0, false);
        TravelCategory travelCategory2 = this.P;
        vy.d dVar = null;
        if (travelCategory2 == null) {
            m.n("scCate");
            throw null;
        }
        if (travelCategory2.getCategoryId() == -1) {
            translation = getString(R.string.favorite);
        } else {
            TravelCategory travelCategory3 = this.P;
            if (travelCategory3 == null) {
                m.n("scCate");
                throw null;
            }
            translation = travelCategory3.getTranslation();
        }
        m.c(translation);
        p0 p0VarRequireActivity = requireActivity();
        m.d(p0VarRequireActivity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        View viewRequireView = requireView();
        m.e(viewRequireView, "requireView(...)");
        ve.i.H(translation, (l.m) p0VarRequireActivity, viewRequireView);
        th.e eVar = this.Q;
        m.c(eVar);
        bq.f fVar = this.R;
        m.c(fVar);
        ta.a aVar = this.f36400f;
        m.c(aVar);
        this.O = new ScDetailAdapter(this.N, eVar, fVar, ((w4) aVar).f33523c, t(), LifecycleOwnerKt.getLifecycleScope(this), (vt.e) this.T.getValue(), new c(this, 0));
        ta.a aVar2 = this.f36400f;
        m.c(aVar2);
        ((w4) aVar2).f33523c.setLayoutManager(new LinearLayoutManager(1));
        ta.a aVar3 = this.f36400f;
        m.c(aVar3);
        ((w4) aVar3).f33523c.setAdapter(this.O);
        ?? r9 = this.U;
        fj.c cVar = (fj.c) r9.getValue();
        TravelCategory travelCategory4 = this.P;
        if (travelCategory4 == null) {
            m.n("scCate");
            throw null;
        }
        long categoryId = travelCategory4.getCategoryId();
        cVar.f27329d = categoryId;
        if (categoryId != -1) {
            e0.B(ViewModelKt.getViewModelScope(cVar), null, null, new fj.b(cVar, categoryId, dVar, 0), 3);
        } else {
            e0.B(ViewModelKt.getViewModelScope(cVar), null, null, new fj.b(cVar, categoryId, dVar, 1), 3);
        }
        x(true);
        ((fj.c) r9.getValue()).H.observe(getViewLifecycleOwner(), new e(new c(this, 1), 0));
    }

    public final void x(boolean z11) {
        ta.a aVar = this.f36400f;
        m.c(aVar);
        e3 e3Var = ((w4) aVar).f33522b;
        LinearLayout linearLayout = (LinearLayout) e3Var.f32525d;
        if (!z11) {
            linearLayout.setVisibility(8);
            return;
        }
        ComposeView composeView = (ComposeView) e3Var.f32524c;
        ep.a.x(355243232, true, ep.a.b(composeView, p1.f58646d, CropImageView.DEFAULT_ASPECT_RATIO), composeView);
        linearLayout.setVisibility(0);
    }
}
