package u3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f52738b = 66305;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f52739a;

    public static String a(int i11) {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder("LineBreak(strategy=");
        int i12 = i11 & 255;
        String str3 = "Invalid";
        if (i12 == 1) {
            str = "Strategy.Simple";
        } else if (i12 == 2) {
            str = "Strategy.HighQuality";
        } else if (i12 == 3) {
            str = "Strategy.Balanced";
        } else {
            str = i12 == 0 ? "Strategy.Unspecified" : "Invalid";
        }
        sb2.append((Object) str);
        sb2.append(", strictness=");
        int i13 = (i11 >> 8) & 255;
        if (i13 == 1) {
            str2 = "Strictness.None";
        } else if (i13 == 2) {
            str2 = "Strictness.Loose";
        } else if (i13 == 3) {
            str2 = "Strictness.Normal";
        } else if (i13 == 4) {
            str2 = "Strictness.Strict";
        } else {
            str2 = i13 == 0 ? "Strictness.Unspecified" : "Invalid";
        }
        sb2.append((Object) str2);
        sb2.append(", wordBreak=");
        int i14 = (i11 >> 16) & 255;
        if (i14 == 1) {
            str3 = "WordBreak.None";
        } else if (i14 == 2) {
            str3 = "WordBreak.Phrase";
        } else if (i14 == 0) {
            str3 = "WordBreak.Unspecified";
        }
        sb2.append((Object) str3);
        sb2.append(')');
        return sb2.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f52739a == ((e) obj).f52739a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f52739a);
    }

    public final String toString() {
        return a(this.f52739a);
    }
}
