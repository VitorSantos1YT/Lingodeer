package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class h extends g {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f1479d;

    public h(byte[] bArr) {
        this.f1486a = 0;
        bArr.getClass();
        this.f1479d = bArr;
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public byte b(int i11) {
        return this.f1479d[i11];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i) || size() != ((i) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof h)) {
            return obj.equals(this);
        }
        h hVar = (h) obj;
        int i11 = this.f1486a;
        int i12 = hVar.f1486a;
        if (i11 != 0 && i12 != 0 && i11 != i12) {
            return false;
        }
        int size = size();
        if (size > hVar.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > hVar.size()) {
            StringBuilder sbI = w4.c.i(size, "Ran off end of other: 0, ", ", ");
            sbI.append(hVar.size());
            throw new IllegalArgumentException(sbI.toString());
        }
        byte[] bArr = hVar.f1479d;
        int iH = h() + size;
        int iH2 = h();
        int iH3 = hVar.h();
        while (iH2 < iH) {
            if (this.f1479d[iH2] != bArr[iH3]) {
                return false;
            }
            iH2++;
            iH3++;
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public void f(byte[] bArr, int i11) {
        System.arraycopy(this.f1479d, 0, bArr, 0, i11);
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public byte g(int i11) {
        return this.f1479d[i11];
    }

    public int h() {
        return 0;
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public int size() {
        return this.f1479d.length;
    }
}
