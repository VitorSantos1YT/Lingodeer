package androidx.recyclerview.widget;

import ko.Zea.ealNNtLp;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f2400c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2401d;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            int i11 = this.f2398a;
            if (i11 != aVar.f2398a) {
                return false;
            }
            if (i11 != 8 || Math.abs(this.f2401d - this.f2399b) != 1 || this.f2401d != aVar.f2399b || this.f2399b != aVar.f2401d) {
                if (this.f2401d != aVar.f2401d || this.f2399b != aVar.f2399b) {
                    return false;
                }
                Object obj2 = this.f2400c;
                if (obj2 != null) {
                    if (!obj2.equals(aVar.f2400c)) {
                        return false;
                    }
                } else if (aVar.f2400c != null) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((this.f2398a * 31) + this.f2399b) * 31) + this.f2401d;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[");
        int i11 = this.f2398a;
        if (i11 == 1) {
            str = "add";
        } else if (i11 == 2) {
            str = "rm";
        } else if (i11 != 4) {
            str = i11 != 8 ? "??" : "mv";
        } else {
            str = "up";
        }
        sb2.append(str);
        sb2.append(",s:");
        sb2.append(this.f2399b);
        sb2.append("c:");
        sb2.append(this.f2401d);
        sb2.append(ealNNtLp.IcCLrG);
        sb2.append(this.f2400c);
        sb2.append("]");
        return sb2.toString();
    }
}
