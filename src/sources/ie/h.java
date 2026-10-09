package ie;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements g, LifecycleObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f34394a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lifecycle f34395b;

    public h(Lifecycle lifecycle) {
        this.f34395b = lifecycle;
        lifecycle.addObserver(this);
    }

    @Override // ie.g
    public final void c(i iVar) {
        this.f34394a.remove(iVar);
    }

    @Override // ie.g
    public final void j(i iVar) {
        this.f34394a.add(iVar);
        Lifecycle lifecycle = this.f34395b;
        if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
            iVar.onDestroy();
        } else if (lifecycle.getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            iVar.onStart();
        } else {
            iVar.a();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy(LifecycleOwner lifecycleOwner) {
        ArrayList arrayListE = pe.m.e(this.f34394a);
        int size = arrayListE.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayListE.get(i11);
            i11++;
            ((i) obj).onDestroy();
        }
        lifecycleOwner.getLifecycle().removeObserver(this);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStart(LifecycleOwner lifecycleOwner) {
        ArrayList arrayListE = pe.m.e(this.f34394a);
        int size = arrayListE.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayListE.get(i11);
            i11++;
            ((i) obj).onStart();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop(LifecycleOwner lifecycleOwner) {
        ArrayList arrayListE = pe.m.e(this.f34394a);
        int size = arrayListE.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayListE.get(i11);
            i11++;
            ((i) obj).a();
        }
    }
}
