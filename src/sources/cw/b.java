package cw;

import android.app.Notification;
import android.app.Service;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.SparseArray;
import aw.p;
import aw.q;
import aw.r;
import aw.s;
import fr.p3;
import java.lang.ref.WeakReference;
import ob.u;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends zv.d implements q, f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RemoteCallbackList f22597b = new RemoteCallbackList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f22598c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WeakReference f22599d;

    public b(WeakReference weakReference, u uVar) {
        this.f22599d = weakReference;
        this.f22598c = uVar;
        r rVar = s.f3241a;
        rVar.f3240b = this;
        rVar.f3239a = new ob.e(this);
    }

    @Override // zv.e
    public final void H0(String str, String str2, boolean z11, int i11, int i12, int i13, boolean z12, bw.b bVar, boolean z13) throws Throwable {
        this.f22598c.G(str, str2, z11, i11, i12, i13, z12, bVar, z13);
    }

    @Override // zv.e
    public final void K(zv.b bVar) {
        this.f22597b.register(bVar);
    }

    @Override // zv.e
    public final long K0(int i11) {
        return this.f22598c.r(i11);
    }

    @Override // zv.e
    public final void U() {
        ((wv.a) this.f22598c.f44891b).clear();
    }

    @Override // zv.e
    public final void a0(zv.b bVar) {
        this.f22597b.unregister(bVar);
    }

    @Override // zv.e
    public final byte b(int i11) {
        bw.c cVarR = ((wv.a) this.f22598c.f44891b).r(i11);
        if (cVarR == null) {
            return (byte) 0;
        }
        return cVarR.a();
    }

    @Override // zv.e
    public final boolean c0(String str, String str2) {
        u uVar = this.f22598c;
        uVar.getClass();
        int i11 = ew.f.f25949a;
        xv.c.f56595a.d().getClass();
        return uVar.x(((wv.a) uVar.f44891b).r(p3.p(str, str2, false)));
    }

    @Override // zv.e
    public final void c1(int i11, Notification notification) {
        WeakReference weakReference = this.f22599d;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        n4.e.f((Service) weakReference.get(), i11, notification);
    }

    @Override // zv.e
    public final boolean e(int i11) {
        return this.f22598c.z(i11);
    }

    @Override // zv.e
    public final boolean f0(int i11) {
        boolean zD;
        u uVar = this.f22598c;
        synchronized (uVar) {
            zD = ((ij.d) uVar.f44892c).D(i11);
        }
        return zD;
    }

    @Override // zv.e
    public final boolean i() {
        int size;
        ij.d dVar = (ij.d) this.f22598c.f44892c;
        synchronized (dVar) {
            dVar.f();
            size = ((SparseArray) dVar.f34422c).size();
        }
        return size <= 0;
    }

    @Override // aw.q
    public final void j(p pVar) {
        synchronized (this) {
            try {
                int iBeginBroadcast = this.f22597b.beginBroadcast();
                for (int i11 = 0; i11 < iBeginBroadcast; i11++) {
                    try {
                        try {
                            ((zv.b) this.f22597b.getBroadcastItem(i11)).P(pVar);
                        } catch (RemoteException e8) {
                            o00.a.B(6, this, e8, "callback error", new Object[0]);
                            this.f22597b.finishBroadcast();
                        }
                    } catch (Throwable th2) {
                        this.f22597b.finishBroadcast();
                        throw th2;
                    }
                }
                this.f22597b.finishBroadcast();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // zv.e
    public final void l() {
        this.f22598c.A();
    }

    @Override // zv.e
    public final boolean r0(int i11) {
        return this.f22598c.l(i11);
    }

    @Override // zv.e
    public final long v0(int i11) {
        bw.c cVarR = ((wv.a) this.f22598c.f44891b).r(i11);
        if (cVarR == null) {
            return 0L;
        }
        return cVarR.H;
    }

    @Override // zv.e
    public final void x0(boolean z11) {
        WeakReference weakReference = this.f22599d;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        ((e) weakReference.get()).stopForeground(z11);
    }

    @Override // cw.f
    public final void g() {
    }

    @Override // cw.f
    public final IBinder h() {
        return this;
    }
}
