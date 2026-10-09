package z2;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Configuration f58587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e3.c f58588b;

    public i0(Configuration configuration, e3.c cVar) {
        this.f58587a = configuration;
        this.f58588b = cVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        Configuration configuration2 = this.f58587a;
        int iUpdateFrom = configuration2.updateFrom(configuration);
        Iterator it = this.f58588b.f24776a.entrySet().iterator();
        while (it.hasNext()) {
            e3.a aVar = (e3.a) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
            if (aVar == null || Configuration.needNewResources(iUpdateFrom, aVar.f24773b)) {
                it.remove();
            }
        }
        configuration2.setTo(configuration);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f58588b.f24776a.clear();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i11) {
        this.f58588b.f24776a.clear();
    }
}
