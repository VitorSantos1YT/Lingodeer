package z2;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e3.d f58592a;

    public j0(e3.d dVar) {
        this.f58592a = dVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        e3.d dVar = this.f58592a;
        synchronized (dVar) {
            dVar.f24777a.c();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        e3.d dVar = this.f58592a;
        synchronized (dVar) {
            dVar.f24777a.c();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i11) {
        e3.d dVar = this.f58592a;
        synchronized (dVar) {
            dVar.f24777a.c();
        }
    }
}
