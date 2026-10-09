package qp;

import android.os.Bundle;
import android.widget.ImageView;
import com.lingodeer.R;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j1 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1 f47995b;

    public /* synthetic */ j1(l1 l1Var, int i11) {
        this.f47994a = i11;
        this.f47995b = l1Var;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f47994a) {
            case 0:
                ta.a aVar = this.f47995b.f47886f;
                kotlin.jvm.internal.m.c(aVar);
                ((ImageView) ((hj.z1) aVar).f33650g.f32408d).performClick();
                return qy.b0.f48488a;
            case 1:
                Bundle bundle = new Bundle();
                mp.b bVar = this.f47995b.f47881a;
                b7.e0.v(bVar.d(), bundle, "U", "unit");
                jp.p0 p0Var = (jp.p0) bVar;
                b7.e0.v(p0Var.f36525a0, bundle, "L", "lesson");
                bundle.putString("mode", p0Var.f36534j0);
                return bundle;
            default:
                l1 l1Var = this.f47995b;
                ta.a aVar2 = l1Var.f47886f;
                kotlin.jvm.internal.m.c(aVar2);
                ((hj.z1) aVar2).f33656n.b();
                ta.a aVar3 = l1Var.f47886f;
                kotlin.jvm.internal.m.c(aVar3);
                ((hj.z1) aVar3).f33646c.setBackgroundResource(R.drawable.bg_speak_btn_enable);
                ta.a aVar4 = l1Var.f47886f;
                kotlin.jvm.internal.m.c(aVar4);
                if (l1.u(((hj.z1) aVar4).f33645b, l1Var.f48037s)) {
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    dy.j jVar = ky.e.f38937b;
                    th.j.a(qx.h.m(300L, timeUnit, jVar).k(jVar).g(px.b.a()).h(new n9.q(l1Var, 14), c.L), l1Var.f47887g);
                }
                return qy.b0.f48488a;
        }
    }
}
