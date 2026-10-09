package ki;

import android.content.Context;
import com.tbruyelle.rxpermissions3.RxPermissions;
import fz.c;
import kotlin.jvm.internal.m;
import lc.d;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f38149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RxPermissions f38150c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f38151d;

    public /* synthetic */ b(a aVar, RxPermissions rxPermissions, Context context, int i11) {
        this.f38148a = i11;
        this.f38149b = aVar;
        this.f38150c = rxPermissions;
        this.f38151d = context;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        d it = (d) obj;
        switch (this.f38148a) {
            case 0:
                m.f(it, "it");
                Context context = this.f38151d;
                m.f(context, "context");
                RxPermissions rxPermissions = this.f38150c;
                boolean zIsGranted = rxPermissions.isGranted("android.permission.WRITE_EXTERNAL_STORAGE");
                a aVar = this.f38149b;
                if (zIsGranted) {
                    aVar.m();
                } else {
                    rxPermissions.request("android.permission.WRITE_EXTERNAL_STORAGE").h(new ob.m(aVar, context, rxPermissions, 17), vx.b.f54316e);
                }
                it.dismiss();
                break;
            default:
                m.f(it, "it");
                Context context2 = this.f38151d;
                m.f(context2, "context");
                RxPermissions rxPermissions2 = this.f38150c;
                rxPermissions2.setLogging(true);
                boolean zIsGranted2 = rxPermissions2.isGranted("android.permission.RECORD_AUDIO");
                a aVar2 = this.f38149b;
                if (zIsGranted2 && rxPermissions2.isGranted("android.permission.RECORD_AUDIO")) {
                    aVar2.m();
                } else {
                    rxPermissions2.request("android.permission.RECORD_AUDIO").h(new xq.c(aVar2, context2, rxPermissions2, 17), vx.b.f54316e);
                }
                it.dismiss();
                break;
        }
        return b0.f48488a;
    }
}
