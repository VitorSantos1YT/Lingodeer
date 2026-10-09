package n1;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements ListIterator, gz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f43110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f43111c;

    public d(int i11, int i12, List list) {
        this.f43109a = i12;
        switch (i12) {
            case 1:
                this.f43110b = list;
                this.f43111c = i11 - 1;
                break;
            default:
                this.f43110b = list;
                this.f43111c = i11;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f43109a) {
            case 0:
                this.f43110b.add(this.f43111c, obj);
                this.f43111c++;
                break;
            default:
                int i11 = this.f43111c + 1;
                this.f43111c = i11;
                this.f43110b.add(i11, obj);
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f43109a) {
            case 0:
                return this.f43111c < this.f43110b.size();
            default:
                return this.f43111c < this.f43110b.size() - 1;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f43109a) {
            case 0:
                return this.f43111c > 0;
            default:
                return this.f43111c >= 0;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f43109a) {
            case 0:
                int i11 = this.f43111c;
                this.f43111c = i11 + 1;
                return this.f43110b.get(i11);
            default:
                int i12 = this.f43111c + 1;
                this.f43111c = i12;
                return this.f43110b.get(i12);
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f43109a) {
            case 0:
                return this.f43111c;
            default:
                return this.f43111c + 1;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f43109a) {
            case 0:
                int i11 = this.f43111c - 1;
                this.f43111c = i11;
                return this.f43110b.get(i11);
            default:
                int i12 = this.f43111c;
                this.f43111c = i12 - 1;
                return this.f43110b.get(i12);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f43109a) {
            case 0:
                return this.f43111c - 1;
            default:
                return this.f43111c;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f43109a) {
            case 0:
                int i11 = this.f43111c - 1;
                this.f43111c = i11;
                this.f43110b.remove(i11);
                break;
            default:
                this.f43110b.remove(this.f43111c);
                this.f43111c--;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f43109a) {
            case 0:
                this.f43110b.set(this.f43111c, obj);
                break;
            default:
                this.f43110b.set(this.f43111c, obj);
                break;
        }
    }
}
