package i2;

import com.google.android.gms.internal.stats.RC.ualZoVVCQs;
import com.google.android.gms.measurement.zfxB.ypOOxsaJG;
import g2.l;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f34127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f34128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f34129c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f34130d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l f34131e;

    public h(float f5, float f11, int i11, int i12, l lVar, int i13) {
        f11 = (i13 & 2) != 0 ? 4.0f : f11;
        i11 = (i13 & 4) != 0 ? 0 : i11;
        i12 = (i13 & 8) != 0 ? 0 : i12;
        lVar = (i13 & 16) != 0 ? null : lVar;
        this.f34127a = f5;
        this.f34128b = f11;
        this.f34129c = i11;
        this.f34130d = i12;
        this.f34131e = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f34127a == hVar.f34127a && this.f34128b == hVar.f34128b && this.f34129c == hVar.f34129c && this.f34130d == hVar.f34130d && m.a(this.f34131e, hVar.f34131e);
    }

    public final int hashCode() {
        int iB = defpackage.e.b(this.f34130d, defpackage.e.b(this.f34129c, defpackage.e.a(Float.hashCode(this.f34127a) * 31, this.f34128b, 31), 31), 31);
        l lVar = this.f34131e;
        return iB + (lVar != null ? lVar.hashCode() : 0);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Stroke(width=");
        sb2.append(this.f34127a);
        sb2.append(", miter=");
        sb2.append(this.f34128b);
        sb2.append(", cap=");
        String str2 = ualZoVVCQs.fLqNjzdcWtHoT;
        int i11 = this.f34129c;
        if (i11 == 0) {
            str = ypOOxsaJG.fPEuaAJNTfKelzt;
        } else if (i11 == 1) {
            str = "Round";
        } else {
            str = i11 == 2 ? "Square" : str2;
        }
        sb2.append((Object) str);
        sb2.append(", join=");
        int i12 = this.f34130d;
        if (i12 == 0) {
            str2 = "Miter";
        } else if (i12 == 1) {
            str2 = "Round";
        } else if (i12 == 2) {
            str2 = "Bevel";
        }
        sb2.append((Object) str2);
        sb2.append(", pathEffect=");
        sb2.append(this.f34131e);
        sb2.append(')');
        return sb2.toString();
    }
}
