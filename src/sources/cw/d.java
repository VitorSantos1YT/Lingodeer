package cw;

import android.app.Notification;
import android.app.Service;
import android.os.IBinder;
import android.util.SparseArray;
import fr.p3;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ob.u;
import uv.k;
import uv.l;
import uv.s;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class d extends zv.d implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f22600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakReference f22601c;

    public d(WeakReference weakReference, u uVar) {
        this.f22601c = weakReference;
        this.f22600b = uVar;
    }

    @Override // zv.e
    public final void H0(String str, String str2, boolean z11, int i11, int i12, int i13, boolean z12, bw.b bVar, boolean z13) throws Throwable {
        this.f22600b.G(str, str2, z11, i11, i12, i13, z12, bVar, z13);
    }

    @Override // zv.e
    public final long K0(int i11) {
        return this.f22600b.r(i11);
    }

    @Override // zv.e
    public final void U() {
        ((wv.a) this.f22600b.f44891b).clear();
    }

    @Override // zv.e
    public final byte b(int i11) {
        bw.c cVarR = ((wv.a) this.f22600b.f44891b).r(i11);
        if (cVarR == null) {
            return (byte) 0;
        }
        return cVarR.a();
    }

    @Override // zv.e
    public final boolean c0(String str, String str2) {
        u uVar = this.f22600b;
        uVar.getClass();
        int i11 = ew.f.f25949a;
        xv.c.f56595a.d().getClass();
        return uVar.x(((wv.a) uVar.f44891b).r(p3.p(str, str2, false)));
    }

    @Override // zv.e
    public final void c1(int i11, Notification notification) {
        WeakReference weakReference = this.f22601c;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        n4.e.f((Service) weakReference.get(), i11, notification);
    }

    @Override // zv.e
    public final boolean e(int i11) {
        return this.f22600b.z(i11);
    }

    @Override // zv.e
    public final boolean f0(int i11) {
        boolean zD;
        u uVar = this.f22600b;
        synchronized (uVar) {
            zD = ((ij.d) uVar.f44892c).D(i11);
        }
        return zD;
    }

    @Override // cw.f
    public final void g() {
        s sVar = (s) k.f53220a.f52461b;
        l lVar = (l) (sVar instanceof l ? (c) sVar : null);
        lVar.f53223c = this;
        ArrayList arrayList = lVar.f53222b;
        List list = (List) arrayList.clone();
        arrayList.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        uv.e.f53205a.b(new w00.d(yv.a.connected));
    }

    @Override // cw.f
    public final IBinder h() {
        return null;
    }

    @Override // zv.e
    public final boolean i() {
        int size;
        ij.d dVar = (ij.d) this.f22600b.f44892c;
        synchronized (dVar) {
            dVar.f();
            size = ((SparseArray) dVar.f34422c).size();
        }
        return size <= 0;
    }

    @Override // zv.e
    public final void l() {
        this.f22600b.A();
    }

    @Override // zv.e
    public final boolean r0(int i11) {
        return this.f22600b.l(i11);
    }

    @Override // zv.e
    public final long v0(int i11) {
        bw.c cVarR = ((wv.a) this.f22600b.f44891b).r(i11);
        if (cVarR == null) {
            return 0L;
        }
        return cVarR.H;
    }

    @Override // zv.e
    public final void x0(boolean z11) {
        WeakReference weakReference = this.f22601c;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        ((e) weakReference.get()).stopForeground(z11);
    }

    @Override // zv.e
    public final void K(zv.b bVar) {
    }

    @Override // zv.e
    public final void a0(zv.b bVar) {
    }
}
