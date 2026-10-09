package p1;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f46251c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f46252d;

    public d(int i11, int i12, Object[] objArr) {
        super(i11, i12);
        this.f46252d = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f46251c) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Object[] objArr = (Object[]) this.f46252d;
                int i11 = this.f46247a;
                this.f46247a = i11 + 1;
                return objArr[i11];
            default:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                this.f46247a++;
                return this.f46252d;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f46251c) {
            case 0:
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                Object[] objArr = (Object[]) this.f46252d;
                int i11 = this.f46247a - 1;
                this.f46247a = i11;
                return objArr[i11];
            default:
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                this.f46247a--;
                return this.f46252d;
        }
    }

    public d(Object obj, int i11) {
        super(i11, 1);
        this.f46252d = obj;
    }
}
