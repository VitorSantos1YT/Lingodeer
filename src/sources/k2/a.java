package k2;

import defpackage.e;
import g2.h;
import g2.p;
import i2.d;
import kotlin.jvm.internal.m;
import v3.j;
import v3.l;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends b {
    public int H = 1;
    public final long K;
    public float L;
    public p M;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h f37862f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long f37863t;

    public a(h hVar, long j11) {
        int i11;
        int i12;
        this.f37862f = hVar;
        this.f37863t = j11;
        if (((int) 0) < 0 || ((int) 0) < 0 || (i11 = (int) (j11 >> 32)) < 0 || (i12 = (int) (4294967295L & j11)) < 0 || i11 > hVar.f28568a.getWidth() || i12 > hVar.f28568a.getHeight()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.K = j11;
        this.L = 1.0f;
    }

    @Override // k2.b
    public final boolean b(float f5) {
        this.L = f5;
        return true;
    }

    @Override // k2.b
    public final boolean c(p pVar) {
        this.M = pVar;
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return m.a(this.f37862f, aVar.f37862f) && j.c(0L, 0L) && l.a(this.f37863t, aVar.f37863t) && this.H == aVar.H;
    }

    @Override // k2.b
    public final long h() {
        return ff.h.P(this.K);
    }

    public final int hashCode() {
        return Integer.hashCode(this.H) + e.f(this.f37863t, e.f(0L, this.f37862f.hashCode() * 31, 31), 31);
    }

    @Override // k2.b
    public final void i(d dVar) {
        int iRound = Math.round(Float.intBitsToFloat((int) (dVar.d() >> 32)));
        int iRound2 = Math.round(Float.intBitsToFloat((int) (dVar.d() & 4294967295L)));
        float f5 = this.L;
        p pVar = this.M;
        int i11 = this.H;
        d.t0(dVar, this.f37862f, this.f37863t, (((long) iRound) << 32) | (((long) iRound2) & 4294967295L), f5, pVar, i11, 328);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("BitmapPainter(image=");
        sb2.append(this.f37862f);
        sb2.append(", srcOffset=");
        sb2.append((Object) j.f(0L));
        sb2.append(", srcSize=");
        sb2.append((Object) l.b(this.f37863t));
        sb2.append(", filterQuality=");
        int i11 = this.H;
        if (i11 == 0) {
            str = "None";
        } else if (i11 == 1) {
            str = "Low";
        } else if (i11 == 2) {
            str = "Medium";
        } else {
            str = i11 == 3 ? "High" : "Unknown";
        }
        sb2.append((Object) str);
        sb2.append(')');
        return sb2.toString();
    }
}
