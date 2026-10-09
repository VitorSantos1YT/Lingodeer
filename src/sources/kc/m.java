package kc;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import com.android.billingclient.api.c0;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f38072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f38073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public fc.f f38074c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f38075d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f38076e = true;

    public m(vb.i iVar) {
        this.f38072a = new WeakReference(iVar);
    }

    public final synchronized void a() {
        fc.f cVar;
        try {
            vb.i iVar = (vb.i) this.f38072a.get();
            if (iVar == null) {
                b();
            } else if (this.f38074c == null) {
                if (iVar.f53831d.f38066b) {
                    Context context = iVar.f53828a;
                    ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(ConnectivityManager.class);
                    if (connectivityManager == null || o4.c.a(context, "android.permission.ACCESS_NETWORK_STATE") != 0) {
                        cVar = new p20.c(10);
                    } else {
                        try {
                            cVar = new xq.c(connectivityManager, this);
                        } catch (Exception unused) {
                            cVar = new p20.c(10);
                        }
                    }
                } else {
                    cVar = new p20.c(10);
                }
                this.f38074c = cVar;
                this.f38076e = cVar.d();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b() {
        try {
            if (this.f38075d) {
                return;
            }
            this.f38075d = true;
            Context context = this.f38073b;
            if (context != null) {
                context.unregisterComponentCallbacks(this);
            }
            fc.f fVar = this.f38074c;
            if (fVar != null) {
                fVar.shutdown();
            }
            this.f38072a.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.content.ComponentCallbacks
    public final synchronized void onConfigurationChanged(Configuration configuration) {
        if (((vb.i) this.f38072a.get()) == null) {
            b();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final synchronized void onLowMemory() {
        onTrimMemory(80);
    }

    @Override // android.content.ComponentCallbacks2
    public final synchronized void onTrimMemory(int i11) {
        vb.i iVar = (vb.i) this.f38072a.get();
        if (iVar != null) {
            ec.c cVar = (ec.c) iVar.f53830c.getValue();
            if (cVar != null) {
                cVar.f25459a.c(i11);
                c0 c0Var = cVar.f25460b;
                synchronized (c0Var) {
                    if (i11 >= 10 && i11 != 20) {
                        c0Var.b();
                    }
                }
            }
        } else {
            b();
        }
    }
}
