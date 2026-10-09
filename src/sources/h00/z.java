package h00;

import fr.n2;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import sz.xej.iFLeRCXvYCGdPW;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
@c00.e(with = b0.class)
public final class z extends m implements Map<String, m>, gz.a {
    public static final y Companion = new y();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f29949a;

    public z(Map content) {
        kotlin.jvm.internal.m.f(content, "content");
        this.f29949a = content;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ m compute(String str, BiFunction<? super String, ? super m, ? extends m> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ m computeIfAbsent(String str, Function<? super String, ? extends m> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ m computeIfPresent(String str, BiFunction<? super String, ? super m, ? extends m> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return this.f29949a.containsKey((String) obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        return this.f29949a.containsValue((m) obj);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<String, m>> entrySet() {
        return this.f29949a.entrySet();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return kotlin.jvm.internal.m.a(this.f29949a, obj);
    }

    @Override // java.util.Map
    public final m get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return (m) this.f29949a.get((String) obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f29949a.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f29949a.isEmpty();
    }

    @Override // java.util.Map
    public final Set<String> keySet() {
        return this.f29949a.keySet();
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ m put(String str, m mVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends String, ? extends m> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ m putIfAbsent(String str, m mVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final m remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ m replace(String str, m mVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction<? super String, ? super m, ? extends m> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f29949a.size();
    }

    public final String toString() {
        return ry.m.y0(this.f29949a.entrySet(), ",", "{", "}", new n2(28), 24);
    }

    @Override // java.util.Map
    public final Collection<m> values() {
        return this.f29949a.values();
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ m merge(String str, m mVar, BiFunction<? super m, ? super m, ? extends m> biFunction) {
        throw new UnsupportedOperationException(iFLeRCXvYCGdPW.OnSqXEVBPwcUh);
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ boolean replace(String str, m mVar, m mVar2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
