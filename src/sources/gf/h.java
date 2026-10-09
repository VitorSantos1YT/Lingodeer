package gf;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import lf.s;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f29185a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Boolean f29186b;

    public final Intent a(Context context) {
        if (!qf.a.b(this)) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null) {
                    Intent intent = new Intent("ReceiverService");
                    intent.setPackage("com.facebook.katana");
                    if (packageManager.resolveService(intent, 0) != null && s.a(context, "com.facebook.katana")) {
                        return intent;
                    }
                    Intent intent2 = new Intent("ReceiverService");
                    intent2.setPackage("com.facebook.wakizashi");
                    if (packageManager.resolveService(intent2, 0) != null && s.a(context, "com.facebook.wakizashi")) {
                        return intent2;
                    }
                }
            } catch (Throwable th2) {
                qf.a.a(this, th2);
                return null;
            }
        }
        return null;
    }

    public final g b(e eVar, String str, List list) {
        g gVar;
        if (qf.a.b(this)) {
            return null;
        }
        try {
            g gVar2 = g.SERVICE_NOT_AVAILABLE;
            Context contextA = re.s.a();
            Intent intentA = a(contextA);
            if (intentA == null) {
                return gVar2;
            }
            f fVar = new f();
            try {
                if (!contextA.bindService(intentA, fVar, 1)) {
                    return g.SERVICE_ERROR;
                }
                try {
                    try {
                        fVar.f29183a.await(5L, TimeUnit.SECONDS);
                        IBinder iBinder = fVar.f29184b;
                        if (iBinder != null) {
                            vf.c cVarG = vf.b.g(iBinder);
                            Bundle bundleA = d.a(eVar, str, list);
                            if (bundleA != null) {
                                ((vf.a) cVarG).g(bundleA);
                                bundleA.toString();
                            }
                            gVar2 = g.OPERATION_SUCCESS;
                        }
                        contextA.unbindService(fVar);
                        return gVar2;
                    } catch (InterruptedException unused) {
                        gVar = g.SERVICE_ERROR;
                        re.s sVar = re.s.f49201a;
                        contextA.unbindService(fVar);
                        return gVar;
                    }
                } catch (RemoteException unused2) {
                    gVar = g.SERVICE_ERROR;
                    re.s sVar2 = re.s.f49201a;
                    contextA.unbindService(fVar);
                    return gVar;
                }
            } catch (Throwable th2) {
                contextA.unbindService(fVar);
                re.s sVar3 = re.s.f49201a;
                throw th2;
            }
        } catch (Throwable th3) {
            qf.a.a(this, th3);
            return null;
        }
    }
}
