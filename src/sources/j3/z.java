package j3;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f35830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f35831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f35832c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f35833d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f35834e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f35835f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f35836g;

    public z(b bVar, int i11, int i12, int i13, int i14, float f5, float f11) {
        this.f35830a = bVar;
        this.f35831b = i11;
        this.f35832c = i12;
        this.f35833d = i13;
        this.f35834e = i14;
        this.f35835f = f5;
        this.f35836g = f11;
    }

    public final f2.c a(f2.c cVar) {
        return cVar.i((((long) Float.floatToRawIntBits(CropImageView.DEFAULT_ASPECT_RATIO)) << 32) | (((long) Float.floatToRawIntBits(this.f35835f)) & 4294967295L));
    }

    public final long b(long j11, boolean z11) {
        if (z11) {
            long j12 = x0.f35821b;
            if (x0.b(j11, j12)) {
                return j12;
            }
        }
        int i11 = x0.f35822c;
        int i12 = (int) (j11 >> 32);
        int i13 = this.f35831b;
        return t.b(i12 + i13, ((int) (j11 & 4294967295L)) + i13);
    }

    public final f2.c c(f2.c cVar) {
        float f5 = -this.f35835f;
        return cVar.i((((long) Float.floatToRawIntBits(CropImageView.DEFAULT_ASPECT_RATIO)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L));
    }

    public final int d(int i11) {
        int i12 = this.f35832c;
        int i13 = this.f35831b;
        return hz.b.l(i11, i13, i12) - i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.f35830a.equals(zVar.f35830a) && this.f35831b == zVar.f35831b && this.f35832c == zVar.f35832c && this.f35833d == zVar.f35833d && this.f35834e == zVar.f35834e && Float.compare(this.f35835f, zVar.f35835f) == 0 && Float.compare(this.f35836g, zVar.f35836g) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f35836g) + defpackage.e.a(defpackage.e.b(this.f35834e, defpackage.e.b(this.f35833d, defpackage.e.b(this.f35832c, defpackage.e.b(this.f35831b, this.f35830a.hashCode() * 31, 31), 31), 31), 31), this.f35835f, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ParagraphInfo(paragraph=");
        sb2.append(this.f35830a);
        sb2.append(", startIndex=");
        sb2.append(this.f35831b);
        sb2.append(", endIndex=");
        sb2.append(this.f35832c);
        sb2.append(", startLineIndex=");
        sb2.append(this.f35833d);
        sb2.append(", endLineIndex=");
        sb2.append(this.f35834e);
        sb2.append(", top=");
        sb2.append(this.f35835f);
        sb2.append(", bottom=");
        return defpackage.e.o(sb2, this.f35836g, ')');
    }
}
