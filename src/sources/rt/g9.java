package rt;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class g9 implements h9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f49786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z8 f49787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f49788c;

    public g9(int i11, z8 z8Var, LinkedHashMap linkedHashMap) {
        this.f49786a = i11;
        this.f49787b = z8Var;
        this.f49788c = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g9)) {
            return false;
        }
        g9 g9Var = (g9) obj;
        return this.f49786a == g9Var.f49786a && this.f49787b.equals(g9Var.f49787b) && this.f49788c.equals(g9Var.f49788c);
    }

    public final int hashCode() {
        return this.f49788c.hashCode() + ((this.f49787b.hashCode() + (Integer.hashCode(this.f49786a) * 31)) * 31);
    }

    public final String toString() {
        return "Success(keyLanguage=" + this.f49786a + ", courseSettings=" + this.f49787b + ", questionPreferenceMap=" + this.f49788c + ")";
    }
}
