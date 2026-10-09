package androidx.datastore.preferences.protobuf;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends h {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f1468e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f1469f;

    public f(byte[] bArr, int i11, int i12) {
        super(bArr);
        i.d(i11, i11 + i12, bArr.length);
        this.f1468e = i11;
        this.f1469f = i12;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
    }

    @Override // androidx.datastore.preferences.protobuf.h, androidx.datastore.preferences.protobuf.i
    public final byte b(int i11) {
        int i12 = this.f1469f;
        if (((i12 - (i11 + 1)) | i11) >= 0) {
            return this.f1479d[this.f1468e + i11];
        }
        if (i11 < 0) {
            throw new ArrayIndexOutOfBoundsException(nv.p.j(i11, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(nv.p.p("Index > length: ", i11, i12, ", "));
    }

    @Override // androidx.datastore.preferences.protobuf.h, androidx.datastore.preferences.protobuf.i
    public final void f(byte[] bArr, int i11) {
        System.arraycopy(this.f1479d, this.f1468e, bArr, 0, i11);
    }

    @Override // androidx.datastore.preferences.protobuf.h, androidx.datastore.preferences.protobuf.i
    public final byte g(int i11) {
        return this.f1479d[this.f1468e + i11];
    }

    @Override // androidx.datastore.preferences.protobuf.h
    public final int h() {
        return this.f1468e;
    }

    @Override // androidx.datastore.preferences.protobuf.h, androidx.datastore.preferences.protobuf.i
    public final int size() {
        return this.f1469f;
    }

    public Object writeReplace() {
        byte[] bArr;
        int size = size();
        if (size == 0) {
            bArr = e0.f1464b;
        } else {
            byte[] bArr2 = new byte[size];
            f(bArr2, size);
            bArr = bArr2;
        }
        return new h(bArr);
    }
}
