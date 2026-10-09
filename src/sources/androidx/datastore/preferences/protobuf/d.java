package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1458a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1459b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1461d;

    public d(g gVar) {
        this.f1461d = gVar;
        this.f1460c = gVar.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f1458a) {
            case 0:
                return this.f1459b < this.f1460c;
            default:
                return this.f1459b < this.f1460c;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f1458a) {
            case 0:
                int i11 = this.f1459b;
                if (i11 >= this.f1460c) {
                    throw new NoSuchElementException();
                }
                this.f1459b = i11 + 1;
                return Byte.valueOf(((g) this.f1461d).g(i11));
            default:
                int i12 = this.f1459b;
                if (i12 >= this.f1460c) {
                    throw new NoSuchElementException();
                }
                this.f1459b = i12 + 1;
                return Byte.valueOf(((androidx.glance.appwidget.protobuf.f) this.f1461d).f(i12));
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f1458a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public d(androidx.glance.appwidget.protobuf.f fVar) {
        this.f1461d = fVar;
        this.f1460c = fVar.size();
    }
}
