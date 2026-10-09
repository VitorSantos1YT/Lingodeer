package ej;

import android.os.Bundle;
import androidx.fragment.app.e1;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import ay.x;
import b0.a1;
import bp.b1;
import com.lingo.lingoskill.chineseskill.ui.sc.adapter.ScCateAdapter;
import hj.v4;
import java.util.ArrayList;
import kotlin.jvm.internal.m;
import n9.q;
import rz.e0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class l extends ji.e {
    public final ArrayList N;
    public ScCateAdapter O;
    public final Object P;
    public final i.c Q;

    public l() {
        super(i.f25689a, "TravelPhraseTabLearn");
        this.N = new ArrayList();
        this.P = com.bumptech.glide.d.u(qy.j.NONE, new b1(7, this, new bj.a(this, 7)));
        i.c cVarRegisterForActivityResult = registerForActivityResult(new e1(4), new h(this));
        m.e(cVarRegisterForActivityResult, "registerForActivityResult(...)");
        this.Q = cVarRegisterForActivityResult;
    }

    @Override // ji.e
    public final void v(Bundle bundle) {
        ArrayList arrayList = this.N;
        q qVar = this.f36401t;
        this.O = new ScCateAdapter(arrayList, qVar);
        ta.a aVar = this.f36400f;
        m.c(aVar);
        ((v4) aVar).f33460b.setLayoutManager(new LinearLayoutManager(1));
        ta.a aVar2 = this.f36400f;
        m.c(aVar2);
        ((v4) aVar2).f33460b.setAdapter(this.O);
        e0.B(LifecycleOwnerKt.getLifecycleScope(this), null, null, new a1(this, null, 25), 3);
        ScCateAdapter scCateAdapter = this.O;
        m.c(scCateAdapter);
        scCateAdapter.setOnItemClickListener(new h(this));
        th.j.a(new x(new bp.g(5)).k(ky.e.f38937b).g(px.b.a()).h(k.f25692a, vx.b.f54316e), qVar);
    }
}
