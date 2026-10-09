package q1;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class e extends AbstractMap implements o1.c, Map, gz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f47366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public s1.b f47367b = new s1.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l f47368c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f47369d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f47370e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f47371f;

    public e(c cVar) {
        this.f47366a = cVar;
        this.f47368c = cVar.f47361a;
        this.f47371f = cVar.f47362b;
    }

    @Override // o1.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public c build() {
        l lVar = this.f47368c;
        c cVar = this.f47366a;
        if (lVar != cVar.f47361a) {
            this.f47367b = new s1.b();
            cVar = new c(this.f47368c, this.f47371f);
        }
        this.f47366a = cVar;
        return cVar;
    }

    public final void b(int i11) {
        this.f47371f = i11;
        this.f47370e++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f47368c = l.f47382e;
        b(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.f47368c.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new g(0, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        return this.f47368c.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return new g(1, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.f47369d = null;
        this.f47368c = this.f47368c.l(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.f47369d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        c cVarBuild = null;
        c cVar = map instanceof c ? (c) map : null;
        if (cVar == null) {
            e eVar = map instanceof e ? (e) map : null;
            if (eVar != null) {
                cVarBuild = eVar.build();
            }
        } else {
            cVarBuild = cVar;
        }
        if (cVarBuild == null) {
            super.putAll(map);
            return;
        }
        s1.a aVar = new s1.a();
        aVar.f51279a = 0;
        int i11 = this.f47371f;
        l lVar = this.f47368c;
        l lVar2 = cVarBuild.f47361a;
        kotlin.jvm.internal.m.d(lVar2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.f47368c = lVar.m(lVar2, 0, aVar, this);
        int i12 = (cVarBuild.f47362b + i11) - aVar.f51279a;
        if (i11 != i12) {
            b(i12);
        }
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int i11 = this.f47371f;
        l lVarO = this.f47368c.o(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (lVarO == null) {
            lVarO = l.f47382e;
        }
        this.f47368c = lVarO;
        return i11 != this.f47371f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f47371f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        return new i(this, 0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        this.f47369d = null;
        l lVarN = this.f47368c.n(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (lVarN == null) {
            lVarN = l.f47382e;
        }
        this.f47368c = lVarN;
        return this.f47369d;
    }
}
