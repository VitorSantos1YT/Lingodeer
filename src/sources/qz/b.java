package qz;

import ef.e;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements Comparable, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f48517c = new b(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f48518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f48519b;

    public b(long j11, long j12) {
        this.f48518a = j11;
        this.f48519b = j12;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        c cVar = new c();
        cVar.f48520a = this.f48518a;
        cVar.f48521b = this.f48519b;
        return cVar;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        b other = (b) obj;
        m.f(other, "other");
        long j11 = other.f48518a;
        long j12 = this.f48518a;
        if (j12 != j11) {
            return Long.compare(j12 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE);
        }
        return Long.compare(this.f48519b ^ Long.MIN_VALUE, other.f48519b ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f48518a == bVar.f48518a && this.f48519b == bVar.f48519b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f48518a ^ this.f48519b);
    }

    public final String toString() {
        byte[] bArr = new byte[36];
        e.m(this.f48518a, bArr, 0, 0, 4);
        bArr[8] = 45;
        e.m(this.f48518a, bArr, 9, 4, 6);
        bArr[13] = 45;
        e.m(this.f48518a, bArr, 14, 6, 8);
        bArr[18] = 45;
        e.m(this.f48519b, bArr, 19, 0, 2);
        bArr[23] = 45;
        e.m(this.f48519b, bArr, 24, 2, 8);
        return new String(bArr, oz.a.f46133a);
    }
}
