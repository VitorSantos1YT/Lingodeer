package v6;

import androidx.lifecycle.Observer;
import com.google.android.gms.auth.api.signin.internal.zbc;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements Observer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f53575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f53576b = false;

    public d(zbc zbcVar, a aVar) {
        this.f53575a = aVar;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        this.f53576b = true;
        this.f53575a.a(obj);
    }

    public final String toString() {
        return this.f53575a.toString();
    }
}
