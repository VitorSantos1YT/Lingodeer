package v;

import android.content.ComponentName;
import android.content.Context;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f53448b;

    public a(Context context) {
        this.f53448b = context;
    }

    @Override // v.c
    public final void a(ComponentName componentName, qp.b bVar) {
        try {
            ((d.a) ((d.c) bVar.f47832b)).j();
        } catch (RemoteException unused) {
        }
        this.f53448b.unbindService(this);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
