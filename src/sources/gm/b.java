package gm;

import com.lingodeer.R;
import hj.t1;
import jp.p0;
import kotlin.jvm.internal.m;
import xs.j;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements j, xs.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f29283b;

    public /* synthetic */ b(g gVar, int i11) {
        this.f29282a = i11;
        this.f29283b = gVar;
    }

    @Override // xs.j, xs.a
    public final void a() {
        switch (this.f29282a) {
            case 0:
                g gVar = this.f29283b;
                ta.a aVar = gVar.f47886f;
                m.c(aVar);
                ((t1) aVar).f33323g.setBackgroundResource(R.drawable.strokes_order_write_noclick);
                if (gVar.m) {
                    gVar.u();
                    gVar.m = false;
                } else {
                    ta.a aVar2 = gVar.f47886f;
                    m.c(aVar2);
                    ((t1) aVar2).f33324h.setBackgroundResource(R.drawable.strokes_order_write_style2_noclick);
                }
                ((p0) gVar.f47881a).O(5);
                break;
            default:
                this.f29283b.t();
                break;
        }
    }
}
