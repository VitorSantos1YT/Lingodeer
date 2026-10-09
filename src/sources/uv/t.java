package uv;

import android.os.Handler;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class t extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f53232b = new ArrayList();

    @Override // uv.d
    public final void a() {
        t7.d dVarE = q.f53227a.e();
        synchronized (this.f53232b) {
            try {
                List<b> list = (List) this.f53232b.clone();
                this.f53232b.clear();
                ArrayList arrayList = new ArrayList(((SparseArray) dVarE.f52059b).size());
                for (b bVar : list) {
                    int i11 = bVar.f53192n;
                    if (((SparseArray) dVarE.f52059b).get(i11) != null) {
                        bVar.f53193o = true;
                        bVar.a();
                        f.f53206a.c(bVar);
                        if (!arrayList.contains(Integer.valueOf(i11))) {
                            arrayList.add(Integer.valueOf(i11));
                        }
                    } else {
                        bVar.f();
                    }
                }
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList.get(i12);
                    i12++;
                    ((Handler) ((SparseArray) dVarE.f52059b).get(((Integer) obj).intValue())).sendEmptyMessage(3);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // uv.d
    public final void b() {
        if (this.f53204a != yv.a.lost) {
            a10.f fVar = f.f53206a;
            if (fVar.f291a.size() > 0) {
                o00.a.P(this, "file download service has be unbound but the size of active tasks are not empty %d ", Integer.valueOf(fVar.f291a.size()));
                return;
            }
            return;
        }
        t7.d dVarE = q.f53227a.e();
        a10.f fVar2 = f.f53206a;
        if (fVar2.f291a.size() > 0) {
            synchronized (this.f53232b) {
                try {
                    ArrayList arrayList = this.f53232b;
                    synchronized (fVar2.f291a) {
                        try {
                            ArrayList arrayList2 = fVar2.f291a;
                            int size = arrayList2.size();
                            int i11 = 0;
                            while (i11 < size) {
                                Object obj = arrayList2.get(i11);
                                i11++;
                                b bVar = (b) obj;
                                if (!arrayList.contains(bVar)) {
                                    arrayList.add(bVar);
                                }
                            }
                            fVar2.f291a.clear();
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    ArrayList arrayList3 = this.f53232b;
                    int size2 = arrayList3.size();
                    int i12 = 0;
                    while (i12 < size2) {
                        Object obj2 = arrayList3.get(i12);
                        i12++;
                        b bVar2 = (b) obj2;
                        bVar2.f53180a.f53199d = (byte) 0;
                        if (f.f53206a.h(bVar2)) {
                            bVar2.f53195q = false;
                        }
                    }
                    SparseArray sparseArray = (SparseArray) dVarE.f52059b;
                    for (int i13 = 0; i13 < sparseArray.size(); i13++) {
                        ((Handler) sparseArray.get(sparseArray.keyAt(i13))).sendEmptyMessage(2);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            try {
                tp.g gVar = k.f53220a;
                if (((s) gVar.f52461b).c()) {
                    return;
                }
                gVar.q(ns.o.f44007a);
            } catch (IllegalStateException unused) {
                o00.a.P(this, "restart service failed, you may need to restart downloading manually when the app comes back to foreground", new Object[0]);
            }
        }
    }

    public final boolean c(b bVar) {
        tp.g gVar = k.f53220a;
        if (!((s) gVar.f52461b).c()) {
            synchronized (this.f53232b) {
                try {
                    if (!((s) gVar.f52461b).c()) {
                        gVar.q(ns.o.f44007a);
                        if (!this.f53232b.contains(bVar)) {
                            bVar.f53180a.f53199d = (byte) 0;
                            if (f.f53206a.h(bVar)) {
                                bVar.f53195q = false;
                            }
                            this.f53232b.add(bVar);
                        }
                        return true;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        d(bVar);
        return false;
    }

    public final void d(b bVar) {
        if (this.f53232b.isEmpty()) {
            return;
        }
        synchronized (this.f53232b) {
            this.f53232b.remove(bVar);
        }
    }
}
