package mw;

import com.google.common.base.Preconditions;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import ko.Zea.ealNNtLp;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class g0 implements pe.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f42423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f42424b;

    public /* synthetic */ g0(Object obj) {
        this.f42424b = obj;
    }

    public z b(b4 b4Var) {
        lw.o0 o0Var = ((y2) this.f42424b).f42839y;
        if (((y2) this.f42424b).G.get()) {
            return ((y2) this.f42424b).E;
        }
        if (o0Var == null) {
            ((y2) this.f42424b).m.execute(new aj.i(this, 12));
            return ((y2) this.f42424b).E;
        }
        z zVarF = k1.f(o0Var.a(b4Var), Boolean.TRUE.equals(b4Var.f42360a.f40353e));
        return zVarF != null ? zVarF : ((y2) this.f42424b).E;
    }

    public void c(lw.n nVar) {
        Preconditions.k(nVar, "newState");
        if (((lw.n) this.f42423a) == nVar || ((lw.n) this.f42423a) == lw.n.SHUTDOWN) {
            return;
        }
        this.f42423a = nVar;
        if (((ArrayList) this.f42424b).isEmpty()) {
            return;
        }
        ArrayList arrayList = (ArrayList) this.f42424b;
        this.f42424b = new ArrayList();
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    @Override // pe.g
    public Object get() {
        if (this.f42423a == null) {
            synchronized (this) {
                try {
                    if (this.f42423a == null) {
                        Object obj = ((pe.g) this.f42424b).get();
                        pe.f.c(obj, "Argument must not be null");
                        this.f42423a = obj;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f42423a;
    }

    public xd.a a() {
        if (((xd.a) this.f42423a) == null) {
            synchronized (this) {
                try {
                    if (((xd.a) this.f42423a) == null) {
                        oi.a aVar = (oi.a) ((o20.i) this.f42424b).f44522b;
                        String str = ealNNtLp.gzbDmBKuCajQJ;
                        File cacheDir = aVar.f44921a.getCacheDir();
                        hb.d dVar = null;
                        File file = cacheDir == null ? null : new File(cacheDir, str);
                        if (file != null && (file.isDirectory() || file.mkdirs())) {
                            dVar = new hb.d(file);
                        }
                        this.f42423a = dVar;
                    }
                    if (((xd.a) this.f42423a) == null) {
                        this.f42423a = new re.q(14);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return (xd.a) this.f42423a;
    }
}
