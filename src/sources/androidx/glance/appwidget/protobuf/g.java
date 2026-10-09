package androidx.glance.appwidget.protobuf;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class g extends f {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f1931d;

    public g(byte[] bArr) {
        this.f1936a = 0;
        bArr.getClass();
        this.f1931d = bArr;
    }

    @Override // androidx.glance.appwidget.protobuf.h
    public byte b(int i11) {
        return this.f1931d[i11];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h) || size() != ((h) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof g)) {
            return obj.equals(this);
        }
        g gVar = (g) obj;
        int i11 = this.f1936a;
        int i12 = gVar.f1936a;
        if (i11 != 0 && i12 != 0 && i11 != i12) {
            return false;
        }
        int size = size();
        if (size > gVar.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > gVar.size()) {
            StringBuilder sbI = w4.c.i(size, "Ran off end of other: 0, ", ", ");
            sbI.append(gVar.size());
            throw new IllegalArgumentException(sbI.toString());
        }
        byte[] bArr = gVar.f1931d;
        int iG = g() + size;
        int iG2 = g();
        int iG3 = gVar.g();
        while (iG2 < iG) {
            if (this.f1931d[iG2] != bArr[iG3]) {
                return false;
            }
            iG2++;
            iG3++;
        }
        return true;
    }

    @Override // androidx.glance.appwidget.protobuf.h
    public byte f(int i11) {
        return this.f1931d[i11];
    }

    public int g() {
        return 0;
    }

    @Override // androidx.glance.appwidget.protobuf.h
    public int size() {
        return this.f1931d.length;
    }
}
