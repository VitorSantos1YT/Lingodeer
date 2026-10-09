package androidx.glance.appwidget.protobuf;

import dl.ExOZ.xItStCyvVEZ;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends g {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f1918e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f1919f;

    public e(byte[] bArr, int i11, int i12) {
        super(bArr);
        h.d(i11, i11 + i12, bArr.length);
        this.f1918e = i11;
        this.f1919f = i12;
    }

    @Override // androidx.glance.appwidget.protobuf.g, androidx.glance.appwidget.protobuf.h
    public final byte b(int i11) {
        int i12 = this.f1919f;
        if (((i12 - (i11 + 1)) | i11) >= 0) {
            return this.f1931d[this.f1918e + i11];
        }
        if (i11 < 0) {
            throw new ArrayIndexOutOfBoundsException(nv.p.j(i11, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(nv.p.p("Index > length: ", i11, i12, ", "));
    }

    @Override // androidx.glance.appwidget.protobuf.g, androidx.glance.appwidget.protobuf.h
    public final byte f(int i11) {
        return this.f1931d[this.f1918e + i11];
    }

    @Override // androidx.glance.appwidget.protobuf.g
    public final int g() {
        return this.f1918e;
    }

    @Override // androidx.glance.appwidget.protobuf.g, androidx.glance.appwidget.protobuf.h
    public final int size() {
        return this.f1919f;
    }

    public Object writeReplace() {
        byte[] bArr;
        int i11 = this.f1919f;
        if (i11 == 0) {
            bArr = b0.f1913b;
        } else {
            byte[] bArr2 = new byte[i11];
            System.arraycopy(this.f1931d, this.f1918e, bArr2, 0, i11);
            bArr = bArr2;
        }
        return new g(bArr);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException(xItStCyvVEZ.hyaOrPzLoJK);
    }
}
