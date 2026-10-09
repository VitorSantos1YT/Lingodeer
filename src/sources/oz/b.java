package oz;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements Iterator, gz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f46140a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f46141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f46142c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public lz.g f46143d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f46144e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c f46145f;

    public b(c cVar) {
        this.f46145f = cVar;
        int iL = hz.b.l(0, 0, cVar.f46146a.length());
        this.f46141b = iL;
        this.f46142c = iL;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a  */
    /* JADX WARN: Code duplicated, block: B:12:0x0022 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:18:0x0075  */
    public final void a() {
        qy.l lVar;
        int i11 = this.f46142c;
        if (i11 < 0) {
            this.f46140a = 0;
            this.f46143d = null;
            return;
        }
        c cVar = this.f46145f;
        int i12 = cVar.f46147b;
        if (i12 > 0) {
            int i13 = this.f46144e + 1;
            this.f46144e = i13;
            if (i13 >= i12) {
                this.f46143d = new lz.g(this.f46141b, q.E0(cVar.f46146a), 1);
                this.f46142c = -1;
            } else if (i11 > cVar.f46146a.length() && (lVar = (qy.l) cVar.f46148c.invoke(cVar.f46146a, Integer.valueOf(this.f46142c))) != null) {
                int iIntValue = ((Number) lVar.f48495a).intValue();
                int iIntValue2 = ((Number) lVar.f48496b).intValue();
                this.f46143d = hz.b.U(this.f46141b, iIntValue);
                int i14 = iIntValue + iIntValue2;
                this.f46141b = i14;
                this.f46142c = i14 + (iIntValue2 == 0 ? 1 : 0);
            } else {
                this.f46143d = new lz.g(this.f46141b, q.E0(cVar.f46146a), 1);
                this.f46142c = -1;
            }
        } else if (i11 > cVar.f46146a.length()) {
            this.f46143d = new lz.g(this.f46141b, q.E0(cVar.f46146a), 1);
            this.f46142c = -1;
        } else {
            int iIntValue3 = ((Number) lVar.f48495a).intValue();
            int iIntValue4 = ((Number) lVar.f48496b).intValue();
            this.f46143d = hz.b.U(this.f46141b, iIntValue3);
            int i15 = iIntValue3 + iIntValue4;
            this.f46141b = i15;
            this.f46142c = i15 + (iIntValue4 == 0 ? 1 : 0);
        }
        this.f46140a = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f46140a == -1) {
            a();
        }
        return this.f46140a == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f46140a == -1) {
            a();
        }
        if (this.f46140a == 0) {
            throw new NoSuchElementException();
        }
        lz.g gVar = this.f46143d;
        kotlin.jvm.internal.m.d(gVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.f46143d = null;
        this.f46140a = -1;
        return gVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
