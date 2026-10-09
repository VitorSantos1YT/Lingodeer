package j8;

import b7.w;
import defpackage.e;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import y6.b0;
import y6.d0;
import y6.z;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f36173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f36174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f36175c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f36176d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f36177e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f36178f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f36179g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[] f36180h;

    public a(int i11, String str, String str2, int i12, int i13, int i14, int i15, byte[] bArr) {
        this.f36173a = i11;
        this.f36174b = str;
        this.f36175c = str2;
        this.f36176d = i12;
        this.f36177e = i13;
        this.f36178f = i14;
        this.f36179g = i15;
        this.f36180h = bArr;
    }

    public static a d(w wVar) {
        int iJ = wVar.j();
        String strO = d0.o(wVar.u(wVar.j(), StandardCharsets.US_ASCII));
        String strU = wVar.u(wVar.j(), StandardCharsets.UTF_8);
        int iJ2 = wVar.j();
        int iJ3 = wVar.j();
        int iJ4 = wVar.j();
        int iJ5 = wVar.j();
        int iJ6 = wVar.j();
        byte[] bArr = new byte[iJ6];
        wVar.h(bArr, 0, iJ6);
        return new a(iJ, strO, strU, iJ2, iJ3, iJ4, iJ5, bArr);
    }

    @Override // y6.b0
    public final void b(z zVar) {
        zVar.a(this.f36180h, this.f36173a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f36173a == aVar.f36173a && this.f36174b.equals(aVar.f36174b) && this.f36175c.equals(aVar.f36175c) && this.f36176d == aVar.f36176d && this.f36177e == aVar.f36177e && this.f36178f == aVar.f36178f && this.f36179g == aVar.f36179g && Arrays.equals(this.f36180h, aVar.f36180h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f36180h) + ((((((((e.d(e.d((527 + this.f36173a) * 31, 31, this.f36174b), 31, this.f36175c) + this.f36176d) * 31) + this.f36177e) * 31) + this.f36178f) * 31) + this.f36179g) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.f36174b + ", description=" + this.f36175c;
    }
}
