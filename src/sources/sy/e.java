package sy;

import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class e implements Map.Entry, gz.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f51937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f51938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f51939c;

    public e(g map, int i11) {
        m.f(map, "map");
        this.f51937a = map;
        this.f51938b = i11;
        this.f51939c = map.H;
    }

    public final void a() {
        if (this.f51937a.H != this.f51939c) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return m.a(entry.getKey(), getKey()) && m.a(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        a();
        return this.f51937a.f51944a[this.f51938b];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        a();
        Object[] objArr = this.f51937a.f51945b;
        m.c(objArr);
        return objArr[this.f51938b];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        a();
        g gVar = this.f51937a;
        gVar.c();
        Object[] objArr = gVar.f51945b;
        if (objArr == null) {
            int length = gVar.f51944a.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            gVar.f51945b = objArr;
        }
        int i11 = this.f51938b;
        Object obj2 = objArr[i11];
        objArr[i11] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getKey());
        sb2.append('=');
        sb2.append(getValue());
        return sb2.toString();
    }
}
