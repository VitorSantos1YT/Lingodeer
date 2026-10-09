package oz;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class h implements Iterator, gz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f46158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f46159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f46160c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f46161d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f46162e;

    public h(CharSequence string) {
        kotlin.jvm.internal.m.f(string, "string");
        this.f46158a = string;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i11;
        int i12;
        int i13 = this.f46159b;
        if (i13 != 0) {
            return i13 == 1;
        }
        if (this.f46162e < 0) {
            this.f46159b = 2;
            return false;
        }
        CharSequence charSequence = this.f46158a;
        int length = charSequence.length();
        int length2 = charSequence.length();
        for (int i14 = this.f46160c; i14 < length2; i14++) {
            char cCharAt = charSequence.charAt(i14);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i11 = (cCharAt == '\r' && (i12 = i14 + 1) < charSequence.length() && charSequence.charAt(i12) == '\n') ? 2 : 1;
                length = i14;
                this.f46159b = 1;
                this.f46162e = i11;
                this.f46161d = length;
                return true;
            }
        }
        i11 = -1;
        this.f46159b = 1;
        this.f46162e = i11;
        this.f46161d = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f46159b = 0;
        int i11 = this.f46161d;
        int i12 = this.f46160c;
        this.f46160c = this.f46162e + i11;
        return this.f46158a.subSequence(i12, i11).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
