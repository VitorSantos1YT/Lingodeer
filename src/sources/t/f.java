package t;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class f implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f51974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f51975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakHashMap f51976c = new WeakHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f51977d = 0;

    public c b(Object obj) {
        c cVar = this.f51974a;
        while (cVar != null && !cVar.f51967a.equals(obj)) {
            cVar = cVar.f51969c;
        }
        return cVar;
    }

    public Object d(Object obj, Object obj2) {
        c cVarB = b(obj);
        if (cVarB != null) {
            return cVarB.f51968b;
        }
        c cVar = new c(obj, obj2);
        this.f51977d++;
        c cVar2 = this.f51975b;
        if (cVar2 == null) {
            this.f51974a = cVar;
            this.f51975b = cVar;
            return null;
        }
        cVar2.f51969c = cVar;
        cVar.f51970d = cVar2;
        this.f51975b = cVar;
        return null;
    }

    public Object e(Object obj) {
        c cVarB = b(obj);
        if (cVarB == null) {
            return null;
        }
        this.f51977d--;
        WeakHashMap weakHashMap = this.f51976c;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((e) it.next()).a(cVarB);
            }
        }
        c cVar = cVarB.f51970d;
        if (cVar != null) {
            cVar.f51969c = cVarB.f51969c;
        } else {
            this.f51974a = cVarB.f51969c;
        }
        c cVar2 = cVarB.f51969c;
        if (cVar2 != null) {
            cVar2.f51970d = cVar;
        } else {
            this.f51975b = cVar;
        }
        cVarB.f51969c = null;
        cVarB.f51970d = null;
        return cVarB.f51968b;
    }

    public final boolean equals(Object obj) {
        b bVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f51977d != fVar.f51977d) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = fVar.iterator();
        while (true) {
            bVar = (b) it;
            if (!bVar.hasNext()) {
                break;
            }
            b bVar2 = (b) it2;
            if (!bVar2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) bVar.next();
            Object next = bVar2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (bVar.hasNext() || ((b) it2).hasNext()) ? false : true;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) bVar.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        b bVar = new b(this.f51974a, this.f51975b, 0);
        this.f51976c.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                sb2.append("]");
                return sb2.toString();
            }
            sb2.append(((Map.Entry) bVar.next()).toString());
            if (bVar.hasNext()) {
                sb2.append(", ");
            }
        }
    }
}
