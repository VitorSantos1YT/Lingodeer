package y;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import w2.r1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class t implements Map, gz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f56761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g f56762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g f56763c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public r1 f56764d;

    public t(i0 parent) {
        kotlin.jvm.internal.m.f(parent, "parent");
        this.f56761a = parent;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f56761a.c(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f56761a.d(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        g gVar = this.f56762b;
        if (gVar != null) {
            return gVar;
        }
        g gVar2 = new g(this.f56761a, 0);
        this.f56762b = gVar2;
        return gVar2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t.class != obj.getClass()) {
            return false;
        }
        return kotlin.jvm.internal.m.a(this.f56761a, ((t) obj).f56761a);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.f56761a.g(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f56761a.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f56761a.i();
    }

    @Override // java.util.Map
    public final Set keySet() {
        g gVar = this.f56763c;
        if (gVar != null) {
            return gVar;
        }
        g gVar2 = new g(this.f56761a, 1);
        this.f56763c = gVar2;
        return gVar2;
    }

    @Override // java.util.Map
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f56761a.f56717e;
    }

    public final String toString() {
        return this.f56761a.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        r1 r1Var = this.f56764d;
        if (r1Var != null) {
            return r1Var;
        }
        r1 r1Var2 = new r1(this.f56761a);
        this.f56764d = r1Var2;
        return r1Var2;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
