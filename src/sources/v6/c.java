package v6;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.google.android.gms.auth.api.signin.internal.zbc;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends MutableLiveData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zbc f53572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f53573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d f53574c;

    public c(zbc zbcVar) {
        this.f53572a = zbcVar;
        if (zbcVar.f8533a != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        zbcVar.f8533a = this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.lifecycle.LifecycleOwner, java.lang.Object] */
    public final void a() {
        ?? r9 = this.f53573b;
        d dVar = this.f53574c;
        if (r9 == 0 || dVar == null) {
            return;
        }
        super.removeObserver(dVar);
        observe(r9, dVar);
    }

    @Override // androidx.lifecycle.LiveData
    public final void onActive() {
        zbc zbcVar = this.f53572a;
        zbcVar.f8534b = true;
        zbcVar.f8536d = false;
        zbcVar.f8535c = false;
        zbcVar.f8541i.drainPermits();
        zbcVar.c();
    }

    @Override // androidx.lifecycle.LiveData
    public final void onInactive() {
        this.f53572a.f8534b = false;
    }

    @Override // androidx.lifecycle.LiveData
    public final void removeObserver(Observer observer) {
        super.removeObserver(observer);
        this.f53573b = null;
        this.f53574c = null;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append("LoaderInfo{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" #0 : ");
        Class<?> cls = this.f53572a.getClass();
        sb2.append(cls.getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(cls)));
        sb2.append("}}");
        return sb2.toString();
    }
}
