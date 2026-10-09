package tp;

import com.lingodeer.R;
import hj.t3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d0 implements xs.j, xs.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f52452b;

    public /* synthetic */ d0(i0 i0Var, int i11) {
        this.f52451a = i11;
        this.f52452b = i0Var;
    }

    @Override // xs.j, xs.a
    public final void a() {
        switch (this.f52451a) {
            case 0:
                i0 i0Var = this.f52452b;
                ta.a aVar = i0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar);
                ((t3) aVar).f33333g.setBackgroundResource(R.drawable.strokes_order_write_noclick);
                if (!i0Var.U) {
                    ta.a aVar2 = i0Var.f36400f;
                    kotlin.jvm.internal.m.c(aVar2);
                    ((t3) aVar2).f33334h.setBackgroundResource(R.drawable.strokes_order_write_style2_noclick);
                } else {
                    i0Var.C();
                    i0Var.U = false;
                }
                break;
            default:
                this.f52452b.B();
                break;
        }
    }
}
