package y;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Iterator, gz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f56649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f56650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f56651c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f56652d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f56653e;

    public a(int i11) {
        this.f56649a = i11;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f56650b < this.f56649a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object objF;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i11 = this.f56650b;
        switch (this.f56652d) {
            case 0:
                objF = ((e) this.f56653e).f(i11);
                break;
            case 1:
                objF = ((e) this.f56653e).j(i11);
                break;
            default:
                objF = ((f) this.f56653e).f56690b[i11];
                break;
        }
        this.f56650b++;
        this.f56651c = true;
        return objF;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f56651c) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i11 = this.f56650b - 1;
        this.f56650b = i11;
        switch (this.f56652d) {
            case 0:
                ((e) this.f56653e).h(i11);
                break;
            case 1:
                ((e) this.f56653e).h(i11);
                break;
            default:
                ((f) this.f56653e).b(i11);
                break;
        }
        this.f56649a--;
        this.f56651c = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(f fVar) {
        this(fVar.f56691c);
        this.f56652d = 2;
        this.f56653e = fVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(e eVar, int i11) {
        this(eVar.f56767c);
        this.f56652d = i11;
        switch (i11) {
            case 1:
                this.f56653e = eVar;
                this(eVar.f56767c);
                break;
            default:
                this.f56653e = eVar;
                break;
        }
    }
}
