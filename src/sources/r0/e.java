package r0;

import com.yalantis.ucrop.view.CropImageView;
import g2.f0;
import g2.m0;
import g2.n0;
import g2.w0;
import v3.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f48729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f48730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f48731c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f48732d;

    public e(a aVar, a aVar2, a aVar3, a aVar4) {
        this.f48729a = aVar;
        this.f48730b = aVar2;
        this.f48731c = aVar3;
        this.f48732d = aVar4;
    }

    public static e b(e eVar, b bVar, b bVar2, b bVar3, b bVar4, int i11) {
        a aVar = bVar;
        if ((i11 & 1) != 0) {
            aVar = eVar.f48729a;
        }
        a aVar2 = bVar2;
        if ((i11 & 2) != 0) {
            aVar2 = eVar.f48730b;
        }
        a aVar3 = bVar3;
        if ((i11 & 4) != 0) {
            aVar3 = eVar.f48731c;
        }
        a aVar4 = bVar4;
        if ((i11 & 8) != 0) {
            aVar4 = eVar.f48732d;
        }
        eVar.getClass();
        return new e(aVar, aVar2, aVar3, aVar4);
    }

    @Override // g2.w0
    public final f0 a(long j11, m mVar, v3.c cVar) {
        float fA = this.f48729a.a(j11, cVar);
        float fA2 = this.f48730b.a(j11, cVar);
        float fA3 = this.f48731c.a(j11, cVar);
        float fA4 = this.f48732d.a(j11, cVar);
        float fC = f2.e.c(j11);
        float f5 = fA + fA4;
        if (f5 > fC) {
            float f11 = fC / f5;
            fA *= f11;
            fA4 *= f11;
        }
        float f12 = fA2 + fA3;
        if (f12 > fC) {
            float f13 = fC / f12;
            fA2 *= f13;
            fA3 *= f13;
        }
        if (fA < CropImageView.DEFAULT_ASPECT_RATIO || fA2 < CropImageView.DEFAULT_ASPECT_RATIO || fA3 < CropImageView.DEFAULT_ASPECT_RATIO || fA4 < CropImageView.DEFAULT_ASPECT_RATIO) {
            i0.a.a("Corner size in Px can't be negative(topStart = " + fA + ", topEnd = " + fA2 + ", bottomEnd = " + fA3 + ", bottomStart = " + fA4 + ")!");
        }
        if (fA + fA2 + fA3 + fA4 == CropImageView.DEFAULT_ASPECT_RATIO) {
            return new m0(com.bumptech.glide.e.e(0L, j11));
        }
        f2.c cVarE = com.bumptech.glide.e.e(0L, j11);
        m mVar2 = m.Ltr;
        float f14 = mVar == mVar2 ? fA : fA2;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f14)) & 4294967295L) | (((long) Float.floatToRawIntBits(f14)) << 32);
        if (mVar == mVar2) {
            fA = fA2;
        }
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fA)) & 4294967295L) | (((long) Float.floatToRawIntBits(fA)) << 32);
        float f15 = mVar == mVar2 ? fA3 : fA4;
        long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(f15)) << 32) | (((long) Float.floatToRawIntBits(f15)) & 4294967295L);
        if (mVar != mVar2) {
            fA4 = fA3;
        }
        return new n0(com.bumptech.glide.f.b(cVarE, jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits3, (((long) Float.floatToRawIntBits(fA4)) << 32) | (((long) Float.floatToRawIntBits(fA4)) & 4294967295L)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return kotlin.jvm.internal.m.a(this.f48729a, eVar.f48729a) && kotlin.jvm.internal.m.a(this.f48730b, eVar.f48730b) && kotlin.jvm.internal.m.a(this.f48731c, eVar.f48731c) && kotlin.jvm.internal.m.a(this.f48732d, eVar.f48732d);
    }

    public final int hashCode() {
        return this.f48732d.hashCode() + ((this.f48731c.hashCode() + ((this.f48730b.hashCode() + (this.f48729a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.f48729a + ", topEnd = " + this.f48730b + ", bottomEnd = " + this.f48731c + ", bottomStart = " + this.f48732d + ')';
    }
}
