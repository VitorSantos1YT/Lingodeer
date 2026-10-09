package y;

import androidx.datastore.preferences.protobuf.i1;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class e extends t0 implements Map {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public i1 f56683d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f56684e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d f56685f;

    public e() {
        super(0);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        i1 i1Var = this.f56683d;
        if (i1Var != null) {
            return i1Var;
        }
        i1 i1Var2 = new i1(this, 1);
        this.f56683d = i1Var2;
        return i1Var2;
    }

    public final boolean k(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Map
    public final Set keySet() {
        b bVar = this.f56684e;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(this);
        this.f56684e = bVar2;
        return bVar2;
    }

    public final boolean l(Collection collection) {
        int i11 = this.f56767c;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i11 != this.f56767c;
    }

    public final boolean m(Collection collection) {
        int i11 = this.f56767c;
        for (int i12 = i11 - 1; i12 >= 0; i12--) {
            if (!collection.contains(f(i12))) {
                h(i12);
            }
        }
        return i11 != this.f56767c;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.f56767c);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        d dVar = this.f56685f;
        if (dVar != null) {
            return dVar;
        }
        d dVar2 = new d(this);
        this.f56685f = dVar2;
        return dVar2;
    }

    public e(e eVar) {
        super(0);
        g(eVar);
    }
}
