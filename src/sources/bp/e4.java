package bp;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.view.View;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e4 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i4 f4556b;

    public /* synthetic */ e4(i4 i4Var, int i11) {
        this.f4555a = i11;
        this.f4556b = i4Var;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0062  */
    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f4555a) {
            case 0:
                View it = (View) obj;
                kotlin.jvm.internal.m.f(it, "it");
                ii.a aVar = this.f4556b.N;
                kotlin.jvm.internal.m.c(aVar);
                ep.f fVar = (ep.f) aVar;
                ji.b context = fVar.f25730b;
                kotlin.jvm.internal.m.f(context, "context");
                Object systemService = context.getSystemService("connectivity");
                kotlin.jvm.internal.m.d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
                if (activeNetworkInfo != null) {
                    int type = activeNetworkInfo.getType();
                    if (type == 0) {
                        i4 i4Var = (i4) fVar.f25729a;
                        i4Var.getClass();
                        Context contextRequireContext = i4Var.requireContext();
                        kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
                        lc.d dVar = new lc.d(contextRequireContext);
                        lc.d.g(dVar, Integer.valueOf(R.string.question_download), null, 2);
                        lc.d.c(dVar, Integer.valueOf(R.string.is_mobile_network), null, 6);
                        lc.d.e(dVar, Integer.valueOf(R.string.f22251ok), null, new e4(i4Var, 2), 2);
                        lc.d.d(dVar, null, 6);
                        dVar.show();
                    } else if (type != 1) {
                        ff.h.C(ff.h.y(context, R.string.check_network));
                    } else {
                        fVar.k();
                    }
                } else {
                    ff.h.C(ff.h.y(context, R.string.check_network));
                }
                break;
            case 1:
                View it2 = (View) obj;
                kotlin.jvm.internal.m.f(it2, "it");
                l.m mVar = this.f4556b.f36398d;
                kotlin.jvm.internal.m.c(mVar);
                mVar.finish();
                break;
            default:
                lc.d it3 = (lc.d) obj;
                kotlin.jvm.internal.m.f(it3, "it");
                ep.f fVar2 = (ep.f) this.f4556b.N;
                if (fVar2 != null) {
                    fVar2.k();
                }
                break;
        }
        return qy.b0.f48488a;
    }
}
