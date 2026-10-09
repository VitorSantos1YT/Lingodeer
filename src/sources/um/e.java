package um;

import bc.i;
import com.lingodeer.R;
import kotlin.jvm.internal.m;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f53030b;

    public /* synthetic */ e(f fVar, int i11) {
        this.f53029a = i11;
        this.f53030b = fVar;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        lc.d it = (lc.d) obj;
        switch (this.f53029a) {
            case 0:
                m.f(it, "it");
                f fVar = this.f53030b;
                b7.c cVar = fVar.f53034d;
                if (cVar != null) {
                    cVar.g();
                }
                i iVar = fVar.f53033c;
                if (iVar != null) {
                    iVar.g();
                }
                break;
            default:
                m.f(it, "it");
                f fVar2 = this.f53030b;
                fVar2.f53036f.findViewById(R.id.pb_progress).setVisibility(0);
                fv.c cVar2 = fVar2.f53035e;
                m.c(cVar2);
                fv.a aVar = fVar2.f53038h;
                m.c(aVar);
                cVar2.d(aVar, fVar2.f53037g);
                it.dismiss();
                break;
        }
        return b0.f48488a;
    }
}
