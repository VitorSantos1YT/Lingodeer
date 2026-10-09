package ci;

import android.content.Context;
import android.os.Bundle;
import android.widget.ImageView;
import com.google.android.material.card.MaterialCardView;
import com.lingodeer.data.model.INTENTS;
import com.tbruyelle.rxpermissions3.BuildConfig;
import hj.p3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class n0 extends bp.m {
    public bi.a O;
    public th.e P;
    public ImageView Q;

    public n0() {
        super(l0.f7142a, BuildConfig.VERSION_NAME);
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
            MaterialCardView materialCardView = ((p3) aVar).f33089c;
            ta.a aVar2 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar2);
            MaterialCardView materialCardView2 = ((p3) aVar2).f33093g;
            ta.a aVar3 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar3);
            MaterialCardView materialCardView3 = ((p3) aVar3).f33092f;
            ta.a aVar4 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar4);
            MaterialCardView materialCardView4 = ((p3) aVar4).f33090d;
            ta.a aVar5 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar5);
            MaterialCardView materialCardView5 = ((p3) aVar5).f33088b;
            ta.a aVar6 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar6);
            MaterialCardView[] materialCardViewArr = {materialCardView, materialCardView2, materialCardView3, materialCardView4, materialCardView5, ((p3) aVar6).f33091e};
            for (int i11 = 0; i11 < 6; i11++) {
                MaterialCardView materialCardView6 = materialCardViewArr[i11];
                kotlin.jvm.internal.m.c(materialCardView6);
                bq.z.b(materialCardView6, new a00.c(this, 28));
            }
        }
    }
}
