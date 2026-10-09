package af;

import android.os.Bundle;
import android.os.OutcomeReceiver;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements OutcomeReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f684a;

    public final void onError(Throwable th2) {
        ye.a aVar;
        ye.a aVar2;
        switch (this.f684a) {
            case 0:
                Exception error = (Exception) th2;
                m.f(error, "error");
                qf.a.b(b.class);
                error.toString();
                if (!qf.a.b(b.class)) {
                    try {
                        aVar = b.f689e;
                    } catch (Throwable th3) {
                        qf.a.a(b.class, th3);
                        aVar = null;
                    }
                    break;
                } else {
                    aVar = null;
                }
                if (aVar == null) {
                    m.n("gpsDebugLogger");
                    throw null;
                }
                Bundle bundle = new Bundle();
                bundle.putString("gps_pa_failed_reason", error.toString());
                aVar.a("gps_pa_failed", bundle);
                return;
            default:
                Exception error2 = (Exception) th2;
                m.f(error2, "error");
                qf.a.b(ze.a.class);
                if (!qf.a.b(ze.a.class)) {
                    try {
                        aVar2 = ze.a.f59211c;
                    } catch (Throwable th4) {
                        qf.a.a(ze.a.class, th4);
                        aVar2 = null;
                    }
                    break;
                } else {
                    aVar2 = null;
                }
                if (aVar2 == null) {
                    m.n("gpsDebugLogger");
                    throw null;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("gps_ara_failed_reason", error2.toString());
                aVar2.a("gps_ara_failed", bundle2);
                return;
        }
    }

    public final void onResult(Object result) {
        ye.a aVar;
        ye.a aVar2;
        switch (this.f684a) {
            case 0:
                m.f(result, "result");
                qf.a.b(b.class);
                if (qf.a.b(b.class)) {
                    aVar = null;
                } else {
                    try {
                        aVar = b.f689e;
                    } catch (Throwable th2) {
                        qf.a.a(b.class, th2);
                        aVar = null;
                    }
                }
                if (aVar != null) {
                    aVar.a("gps_pa_succeed", null);
                    return;
                } else {
                    m.n("gpsDebugLogger");
                    throw null;
                }
            default:
                m.f(result, "result");
                qf.a.b(ze.a.class);
                if (qf.a.b(ze.a.class)) {
                    aVar2 = null;
                } else {
                    try {
                        aVar2 = ze.a.f59211c;
                    } catch (Throwable th3) {
                        qf.a.a(ze.a.class, th3);
                        aVar2 = null;
                    }
                }
                if (aVar2 != null) {
                    aVar2.a("gps_ara_succeed", null);
                    return;
                } else {
                    m.n("gpsDebugLogger");
                    throw null;
                }
        }
    }
}
