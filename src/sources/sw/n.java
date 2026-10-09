package sw;

import com.google.common.base.Preconditions;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import qp.o2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p f51874a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Long f51877d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f51878e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile o2 f51875b = new o2(2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public o2 f51876c = new o2(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashSet f51879f = new HashSet();

    public n(p pVar) {
        this.f51874a = pVar;
    }

    public final void a(t tVar) {
        if (d() && !tVar.f51897c) {
            tVar.s();
        } else if (!d() && tVar.f51897c) {
            tVar.f51897c = false;
            lw.o oVar = tVar.f51898d;
            if (oVar != null) {
                tVar.f51899e.a(oVar);
                tVar.f51900f.i(lw.e.INFO, "Subchannel unejected: {0}", tVar);
            }
        }
        tVar.f51896b = this;
        this.f51879f.add(tVar);
    }

    public final void b(long j11) {
        this.f51877d = Long.valueOf(j11);
        this.f51878e++;
        Iterator it = this.f51879f.iterator();
        while (it.hasNext()) {
            ((t) it.next()).s();
        }
    }

    public final long c() {
        return ((AtomicLong) this.f51876c.f48096c).get() + ((AtomicLong) this.f51876c.f48095b).get();
    }

    public final boolean d() {
        return this.f51877d != null;
    }

    public final void e() {
        Preconditions.p("not currently ejected", this.f51877d != null);
        this.f51877d = null;
        for (t tVar : this.f51879f) {
            tVar.f51897c = false;
            lw.o oVar = tVar.f51898d;
            if (oVar != null) {
                tVar.f51899e.a(oVar);
                tVar.f51900f.i(lw.e.INFO, "Subchannel unejected: {0}", tVar);
            }
        }
    }

    public final String toString() {
        return "AddressTracker{subchannels=" + this.f51879f + '}';
    }
}
