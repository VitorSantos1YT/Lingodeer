package u3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i f52746d = new i(17, f.f52741c, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f52747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f52748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f52749c;

    public i(int i11, float f5, int i12) {
        this.f52747a = f5;
        this.f52748b = i11;
        this.f52749c = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        float f5 = iVar.f52747a;
        float f11 = f.f52740b;
        return Float.compare(this.f52747a, f5) == 0 && this.f52748b == iVar.f52748b && this.f52749c == iVar.f52749c;
    }

    public final int hashCode() {
        float f5 = f.f52740b;
        return Integer.hashCode(this.f52749c) + defpackage.e.b(this.f52748b, Float.hashCode(this.f52747a) * 31, 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("LineHeightStyle(alignment=");
        sb2.append((Object) f.b(this.f52747a));
        sb2.append(", trim=");
        String str2 = "Invalid";
        int i11 = this.f52748b;
        if (i11 == 1) {
            str = "LineHeightStyle.Trim.FirstLineTop";
        } else if (i11 == 16) {
            str = "LineHeightStyle.Trim.LastLineBottom";
        } else if (i11 == 17) {
            str = "LineHeightStyle.Trim.Both";
        } else {
            str = i11 == 0 ? "LineHeightStyle.Trim.None" : "Invalid";
        }
        sb2.append((Object) str);
        sb2.append(",mode=");
        int i12 = this.f52749c;
        if (i12 == 0) {
            str2 = "LineHeightStyle.Mode.Fixed";
        } else if (i12 == 1) {
            str2 = "LineHeightStyle.Mode.Minimum";
        } else if (i12 == 2) {
            str2 = "LineHeightStyle.Mode.Tight";
        }
        sb2.append((Object) str2);
        sb2.append(')');
        return sb2.toString();
    }
}
