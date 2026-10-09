package lz;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public class e implements Iterable, gz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f40532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f40533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f40534c;

    public e(int i11, int i12, int i13) {
        if (i13 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i13 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f40532a = i11;
        this.f40533b = com.bumptech.glide.e.v(i11, i12, i13);
        this.f40534c = i13;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        if (isEmpty() && ((e) obj).isEmpty()) {
            return true;
        }
        e eVar = (e) obj;
        return this.f40532a == eVar.f40532a && this.f40533b == eVar.f40533b && this.f40534c == eVar.f40534c;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f40532a * 31) + this.f40533b) * 31) + this.f40534c;
    }

    public boolean isEmpty() {
        int i11 = this.f40534c;
        int i12 = this.f40533b;
        int i13 = this.f40532a;
        if (i11 > 0) {
            return i13 > i12;
        }
        return i13 < i12;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new f(this.f40532a, this.f40533b, this.f40534c);
    }

    public String toString() {
        StringBuilder sb2;
        int i11 = this.f40533b;
        int i12 = this.f40532a;
        int i13 = this.f40534c;
        if (i13 > 0) {
            sb2 = new StringBuilder();
            sb2.append(i12);
            sb2.append("..");
            sb2.append(i11);
            sb2.append(" step ");
            sb2.append(i13);
        } else {
            sb2 = new StringBuilder();
            sb2.append(i12);
            sb2.append(" downTo ");
            sb2.append(i11);
            sb2.append(" step ");
            sb2.append(-i13);
        }
        return sb2.toString();
    }
}
