package i8;

import java.util.Arrays;
import java.util.Objects;
import y6.b0;
import y6.d0;
import y6.o;
import y6.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements b0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final p f34258g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p f34259h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f34261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f34262c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f34263d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f34264e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f34265f;

    static {
        o oVar = new o();
        oVar.m = d0.o("application/id3");
        f34258g = new p(oVar);
        o oVar2 = new o();
        oVar2.m = d0.o("application/x-scte35");
        f34259h = new p(oVar2);
    }

    public a(String str, String str2, long j11, long j12, byte[] bArr) {
        this.f34260a = str;
        this.f34261b = str2;
        this.f34262c = j11;
        this.f34263d = j12;
        this.f34264e = bArr;
    }

    @Override // y6.b0
    public final p a() {
        String str = this.f34260a;
        str.getClass();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return f34259h;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return f34258g;
            default:
                return null;
        }
    }

    @Override // y6.b0
    public final byte[] c() {
        if (a() != null) {
            return this.f34264e;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f34262c == aVar.f34262c && this.f34263d == aVar.f34263d && Objects.equals(this.f34260a, aVar.f34260a) && Objects.equals(this.f34261b, aVar.f34261b) && Arrays.equals(this.f34264e, aVar.f34264e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f34265f == 0) {
            String str = this.f34260a;
            int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f34261b;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            long j11 = this.f34262c;
            int i11 = (iHashCode2 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
            long j12 = this.f34263d;
            this.f34265f = Arrays.hashCode(this.f34264e) + ((i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31);
        }
        return this.f34265f;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.f34260a + ", id=" + this.f34263d + ", durationMs=" + this.f34262c + ", value=" + this.f34261b;
    }
}
