package tp;

import android.os.Bundle;
import com.lingodeer.data.model.INTENTS;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f52475b;

    public /* synthetic */ l(o oVar, int i11) {
        this.f52474a = i11;
        this.f52475b = oVar;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f52474a) {
            case 0:
                return Boolean.valueOf(this.f52475b.requireArguments().getBoolean(INTENTS.EXTRA_BOOLEAN));
            case 1:
                Bundle arguments = this.f52475b.getArguments();
                return Integer.valueOf(arguments != null ? arguments.getInt(INTENTS.EXTRA_INT, -1) : -1);
            case 2:
                o oVar = this.f52475b;
                return (vp.d) com.bumptech.glide.d.u(qy.j.NONE, new jr.j0(oVar, new bj.a(oVar, 29), new l(oVar, 3), 2)).getValue();
            default:
                o oVar2 = this.f52475b;
                Boolean bool = (Boolean) oVar2.f52482a0.getValue();
                bool.booleanValue();
                return new a20.a(2, ry.l.l0(new Object[]{bool, Integer.valueOf(((Number) oVar2.f52483b0.getValue()).intValue())}));
        }
    }
}
