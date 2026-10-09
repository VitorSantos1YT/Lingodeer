package ci;

import android.content.Context;
import android.os.Bundle;
import android.widget.ImageView;
import com.google.android.material.card.MaterialCardView;
import com.lingodeer.data.model.INTENTS;
import com.tbruyelle.rxpermissions3.BuildConfig;
import hj.q3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class p0 extends bp.m {
    public bi.a O;
    public th.e P;
    public ImageView Q;

    public p0() {
        super(o0.f7148a, BuildConfig.VERSION_NAME);
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
            MaterialCardView materialCardView = ((q3) aVar).f33155o;
            ta.a aVar2 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar2);
            MaterialCardView materialCardView2 = ((q3) aVar2).f33156p;
            ta.a aVar3 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar3);
            MaterialCardView materialCardView3 = ((q3) aVar3).f33157q;
            ta.a aVar4 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar4);
            MaterialCardView materialCardView4 = ((q3) aVar4).f33154n;
            ta.a aVar5 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar5);
            MaterialCardView materialCardView5 = ((q3) aVar5).f33146e;
            ta.a aVar6 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar6);
            MaterialCardView materialCardView6 = ((q3) aVar6).f33152k;
            ta.a aVar7 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar7);
            MaterialCardView materialCardView7 = ((q3) aVar7).f33149h;
            ta.a aVar8 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar8);
            MaterialCardView materialCardView8 = ((q3) aVar8).f33143b;
            ta.a aVar9 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar9);
            MaterialCardView materialCardView9 = ((q3) aVar9).f33147f;
            ta.a aVar10 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar10);
            MaterialCardView materialCardView10 = ((q3) aVar10).f33153l;
            ta.a aVar11 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar11);
            MaterialCardView materialCardView11 = ((q3) aVar11).f33150i;
            ta.a aVar12 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar12);
            MaterialCardView materialCardView12 = ((q3) aVar12).f33144c;
            ta.a aVar13 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar13);
            MaterialCardView materialCardView13 = ((q3) aVar13).f33148g;
            ta.a aVar14 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar14);
            MaterialCardView materialCardView14 = ((q3) aVar14).m;
            ta.a aVar15 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar15);
            MaterialCardView materialCardView15 = ((q3) aVar15).f33151j;
            ta.a aVar16 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar16);
            MaterialCardView[] materialCardViewArr = {materialCardView, materialCardView2, materialCardView3, materialCardView4, materialCardView5, materialCardView6, materialCardView7, materialCardView8, materialCardView9, materialCardView10, materialCardView11, materialCardView12, materialCardView13, materialCardView14, materialCardView15, ((q3) aVar16).f33145d};
            for (int i11 = 0; i11 < 16; i11++) {
                MaterialCardView materialCardView16 = materialCardViewArr[i11];
                kotlin.jvm.internal.m.c(materialCardView16);
                bq.z.b(materialCardView16, new a00.c(this, 29));
            }
        }
    }
}
