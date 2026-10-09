package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h1 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1480a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Iterator f1482c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f1 f1483d;

    public h1(f1 f1Var) {
        this.f1483d = f1Var;
    }

    public final Iterator a() {
        if (this.f1482c == null) {
            this.f1482c = this.f1483d.f1472b.entrySet().iterator();
        }
        return this.f1482c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i11 = this.f1480a + 1;
        f1 f1Var = this.f1483d;
        return i11 < f1Var.f1471a.size() || (!f1Var.f1472b.isEmpty() && a().hasNext());
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.f1481b = true;
        int i11 = this.f1480a + 1;
        this.f1480a = i11;
        f1 f1Var = this.f1483d;
        return i11 < f1Var.f1471a.size() ? (Map.Entry) f1Var.f1471a.get(this.f1480a) : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f1481b) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f1481b = false;
        int i11 = f1.f1470f;
        f1 f1Var = this.f1483d;
        f1Var.b();
        if (this.f1480a >= f1Var.f1471a.size()) {
            a().remove();
            return;
        }
        int i12 = this.f1480a;
        this.f1480a = i12 - 1;
        f1Var.h(i12);
    }
}
