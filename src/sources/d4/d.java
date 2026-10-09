package d4;

import e4.q;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f23108c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f23109d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f23110e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d f23111f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public b4.h f23114i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashSet f23106a = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f23112g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f23113h = Integer.MIN_VALUE;

    public d(g gVar, c cVar) {
        this.f23109d = gVar;
        this.f23110e = cVar;
    }

    public final void a(d dVar, int i11) {
        b(dVar, i11, Integer.MIN_VALUE, false);
    }

    public final boolean b(d dVar, int i11, int i12, boolean z11) {
        if (dVar == null) {
            j();
            return true;
        }
        if (!z11 && !i(dVar)) {
            return false;
        }
        this.f23111f = dVar;
        if (dVar.f23106a == null) {
            dVar.f23106a = new HashSet();
        }
        HashSet hashSet = this.f23111f.f23106a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f23112g = i11;
        this.f23113h = i12;
        return true;
    }

    public final void c(int i11, q qVar, ArrayList arrayList) {
        HashSet hashSet = this.f23106a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                e4.i.b(((d) it.next()).f23109d, i11, arrayList, qVar);
            }
        }
    }

    public final int d() {
        if (this.f23108c) {
            return this.f23107b;
        }
        return 0;
    }

    public final int e() {
        d dVar;
        if (this.f23109d.f23133i0 == 8) {
            return 0;
        }
        int i11 = this.f23113h;
        return (i11 == Integer.MIN_VALUE || (dVar = this.f23111f) == null || dVar.f23109d.f23133i0 != 8) ? this.f23112g : i11;
    }

    public final d f() {
        c cVar = this.f23110e;
        int iOrdinal = cVar.ordinal();
        g gVar = this.f23109d;
        switch (iOrdinal) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return gVar.L;
            case 2:
                return gVar.M;
            case 3:
                return gVar.J;
            case 4:
                return gVar.K;
            default:
                throw new AssertionError(cVar.name());
        }
    }

    public final boolean g() {
        HashSet hashSet = this.f23106a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((d) it.next()).f().h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        return this.f23111f != null;
    }

    public final boolean i(d dVar) {
        if (dVar == null) {
            return false;
        }
        g gVar = dVar.f23109d;
        c cVar = dVar.f23110e;
        c cVar2 = this.f23110e;
        if (cVar == cVar2) {
            return cVar2 != c.BASELINE || (gVar.E && this.f23109d.E);
        }
        switch (cVar2.ordinal()) {
            case 0:
            case 7:
            case 8:
                return false;
            case 1:
            case 3:
                boolean z11 = cVar == c.LEFT || cVar == c.RIGHT;
                if (gVar instanceof l) {
                    return z11 || cVar == c.CENTER_X;
                }
                return z11;
            case 2:
            case 4:
                boolean z12 = cVar == c.TOP || cVar == c.BOTTOM;
                if (gVar instanceof l) {
                    return z12 || cVar == c.CENTER_Y;
                }
                return z12;
            case 5:
                return (cVar == c.LEFT || cVar == c.RIGHT) ? false : true;
            case 6:
                return (cVar == c.BASELINE || cVar == c.CENTER_X || cVar == c.CENTER_Y) ? false : true;
            default:
                throw new AssertionError(cVar2.name());
        }
    }

    public final void j() {
        HashSet hashSet;
        d dVar = this.f23111f;
        if (dVar != null && (hashSet = dVar.f23106a) != null) {
            hashSet.remove(this);
            if (this.f23111f.f23106a.size() == 0) {
                this.f23111f.f23106a = null;
            }
        }
        this.f23106a = null;
        this.f23111f = null;
        this.f23112g = 0;
        this.f23113h = Integer.MIN_VALUE;
        this.f23108c = false;
        this.f23107b = 0;
    }

    public final void k() {
        b4.h hVar = this.f23114i;
        if (hVar == null) {
            this.f23114i = new b4.h(b4.g.UNRESTRICTED);
        } else {
            hVar.c();
        }
    }

    public final void l(int i11) {
        this.f23107b = i11;
        this.f23108c = true;
    }

    public final String toString() {
        return this.f23109d.f23137k0 + ":" + this.f23110e.toString();
    }
}
