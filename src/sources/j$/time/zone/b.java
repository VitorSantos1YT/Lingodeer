package j$.time.zone;

import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements Comparable, Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f35205e = 0;
    private static final long serialVersionUID = -6946044323557704546L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f35206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDateTime f35207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ZoneOffset f35208c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ZoneOffset f35209d;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f35206a, ((b) obj).f35206a);
    }

    public b(LocalDateTime localDateTime, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        this.f35206a = localDateTime.toEpochSecond(zoneOffset);
        this.f35207b = localDateTime;
        this.f35208c = zoneOffset;
        this.f35209d = zoneOffset2;
    }

    public b(long j11, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        this.f35206a = j11;
        this.f35207b = LocalDateTime.Q(j11, 0, zoneOffset);
        this.f35208c = zoneOffset;
        this.f35209d = zoneOffset2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a((byte) 2, this);
    }

    public final boolean w() {
        return this.f35209d.f34941b > this.f35208c.f34941b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f35206a == bVar.f35206a && this.f35208c.equals(bVar.f35208c) && this.f35209d.equals(bVar.f35209d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f35207b.hashCode() ^ this.f35208c.f34941b) ^ Integer.rotateLeft(this.f35209d.f34941b, 16);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Transition[");
        sb2.append(w() ? "Gap" : "Overlap");
        sb2.append(" at ");
        sb2.append(this.f35207b);
        sb2.append(this.f35208c);
        sb2.append(" to ");
        sb2.append(this.f35209d);
        sb2.append(']');
        return sb2.toString();
    }
}
