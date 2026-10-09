package aj;

import com.lingodeer.R;
import kotlin.jvm.internal.m;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f735b;

    public /* synthetic */ d(f fVar, int i11) {
        this.f734a = i11;
        this.f735b = fVar;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        lc.d it = (lc.d) obj;
        switch (this.f734a) {
            case 0:
                m.f(it, "it");
                f fVar = this.f735b;
                b7.c cVar = fVar.f740c;
                if (cVar != null) {
                    cVar.g();
                }
                bc.i iVar = fVar.f739b;
                if (iVar != null) {
                    iVar.g();
                }
                break;
            default:
                m.f(it, "it");
                f fVar2 = this.f735b;
                fVar2.f742e.findViewById(R.id.pb_progress).setVisibility(0);
                fv.c cVar2 = fVar2.f741d;
                m.c(cVar2);
                fv.a aVar = fVar2.f744g;
                m.c(aVar);
                cVar2.d(aVar, fVar2.f743f);
                it.dismiss();
                break;
        }
        return b0.f48488a;
    }
}
