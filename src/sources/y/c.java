package y;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Iterator, Map.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f56666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f56667b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f56668c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f56669d;

    public c(e eVar) {
        this.f56669d = eVar;
        this.f56666a = eVar.f56767c - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f56668c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i11 = this.f56667b;
        e eVar = this.f56669d;
        return kotlin.jvm.internal.m.a(key, eVar.f(i11)) && kotlin.jvm.internal.m.a(entry.getValue(), eVar.j(this.f56667b));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f56668c) {
            return this.f56669d.f(this.f56667b);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f56668c) {
            return this.f56669d.j(this.f56667b);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f56667b < this.f56666a;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f56668c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i11 = this.f56667b;
        e eVar = this.f56669d;
        Object objF = eVar.f(i11);
        Object objJ = eVar.j(this.f56667b);
        return (objF == null ? 0 : objF.hashCode()) ^ (objJ != null ? objJ.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f56667b++;
        this.f56668c = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f56668c) {
            throw new IllegalStateException();
        }
        this.f56669d.h(this.f56667b);
        this.f56667b--;
        this.f56666a--;
        this.f56668c = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f56668c) {
            return this.f56669d.i(this.f56667b, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
