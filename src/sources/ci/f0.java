package ci;

import android.content.Context;
import android.os.Bundle;
import android.widget.ImageView;
import com.google.android.material.card.MaterialCardView;
import com.lingodeer.data.model.INTENTS;
import com.tbruyelle.rxpermissions3.BuildConfig;
import hj.m3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class f0 extends bp.m {
    public bi.a O;
    public th.e P;
    public ImageView Q;

    public f0() {
        super(e0.f7129a, BuildConfig.VERSION_NAME);
    }

    @Override // ji.e
    public final void q() {
        th.e eVar = this.P;
        if (eVar != null) {
            eVar.b();
        } else {
            kotlin.jvm.internal.m.n("player");
            throw null;
        }
    }

    @Override // ji.e
    public final void v(Bundle bundle) {
        this.O = (bi.a) requireArguments().getParcelable(INTENTS.EXTRA_OBJECT);
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
        this.P = new th.e(contextRequireContext);
        if (this.O != null) {
            ta.a aVar = this.f36400f;
            kotlin.jvm.internal.m.c(aVar);
            MaterialCardView materialCardView = ((m3) aVar).f32927f;
            ta.a aVar2 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar2);
            MaterialCardView materialCardView2 = ((m3) aVar2).f32925d;
            ta.a aVar3 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar3);
            MaterialCardView materialCardView3 = ((m3) aVar3).f32924c;
            ta.a aVar4 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar4);
            MaterialCardView materialCardView4 = ((m3) aVar4).f32926e;
            ta.a aVar5 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar5);
            MaterialCardView[] materialCardViewArr = {materialCardView, materialCardView2, materialCardView3, materialCardView4, ((m3) aVar5).f32923b};
            for (int i11 = 0; i11 < 5; i11++) {
                MaterialCardView materialCardView5 = materialCardViewArr[i11];
                kotlin.jvm.internal.m.c(materialCardView5);
                bq.z.b(materialCardView5, new a00.c(this, 25));
            }
        }
    }
}
