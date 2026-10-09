package yy;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.jvm.internal.m;
import nv.p;
import ry.e;
import ry.l;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends e implements a, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Enum[] f58370a;

    public b(Enum[] entries) {
        m.f(entries, "entries");
        this.f58370a = entries;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return new c(this.f58370a);
    }

    @Override // ry.a
    public final int b() {
        return this.f58370a.length;
    }

    @Override // ry.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r9 = (Enum) obj;
        return ((Enum) l.Y(r9.ordinal(), this.f58370a)) == r9;
    }

    @Override // java.util.List
    public final Object get(int i11) {
        Enum[] enumArr = this.f58370a;
        int length = enumArr.length;
        if (i11 < 0 || i11 >= length) {
            throw new IndexOutOfBoundsException(p.p("index: ", i11, length, ", size: "));
        }
        return enumArr[i11];
    }

    @Override // ry.e, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r9 = (Enum) obj;
        int iOrdinal = r9.ordinal();
        if (((Enum) l.Y(iOrdinal, this.f58370a)) == r9) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // ry.e, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r9 = (Enum) obj;
        int iOrdinal = r9.ordinal();
        if (((Enum) l.Y(iOrdinal, this.f58370a)) == r9) {
            return iOrdinal;
        }
        return -1;
    }
}
