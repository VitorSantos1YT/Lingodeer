package ie;

import android.content.Context;
import android.net.ConnectivityManager;
import java.util.HashSet;
import mw.g0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f34388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.bumptech.glide.o f34389b;

    public c(Context context, com.bumptech.glide.o oVar) {
        this.f34388a = context.getApplicationContext();
        this.f34389b = oVar;
    }

    @Override // ie.i
    public final void a() {
        o oVarD = o.d(this.f34388a);
        com.bumptech.glide.o oVar = this.f34389b;
        synchronized (oVarD) {
            ((HashSet) oVarD.f34407d).remove(oVar);
            if (oVarD.f34405b && ((HashSet) oVarD.f34407d).isEmpty()) {
                bq.f fVar = (bq.f) oVarD.f34406c;
                ((ConnectivityManager) ((g0) fVar.f4945c).get()).unregisterNetworkCallback((fc.g) fVar.f4946d);
                oVarD.f34405b = false;
            }
        }
    }

    @Override // ie.i
    public final void onStart() {
        o oVarD = o.d(this.f34388a);
        com.bumptech.glide.o oVar = this.f34389b;
        synchronized (oVarD) {
            ((HashSet) oVarD.f34407d).add(oVar);
            if (!oVarD.f34405b && !((HashSet) oVarD.f34407d).isEmpty()) {
                bq.f fVar = (bq.f) oVarD.f34406c;
                g0 g0Var = (g0) fVar.f4945c;
                boolean z11 = false;
                fVar.f4943a = ((ConnectivityManager) g0Var.get()).getActiveNetwork() != null;
                try {
                    ((ConnectivityManager) g0Var.get()).registerDefaultNetworkCallback((fc.g) fVar.f4946d);
                    z11 = true;
                } catch (RuntimeException unused) {
                }
                oVarD.f34405b = z11;
            }
        }
    }

    @Override // ie.i
    public final void onDestroy() {
    }
}
