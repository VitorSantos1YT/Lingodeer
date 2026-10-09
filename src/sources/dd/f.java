package dd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import l0.Eeqr.HOBXIlHxIkMBEA;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f23378c = new f("COMPOSITION");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f23379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g f23380b;

    public f(String... strArr) {
        this.f23379a = Arrays.asList(strArr);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x007e A[RETURN] */
    public final boolean a(int i11, String str) {
        List list = this.f23379a;
        if (i11 < list.size()) {
            boolean z11 = i11 == list.size() - 1;
            String str2 = (String) list.get(i11);
            if (!str2.equals("**")) {
                boolean z12 = str2.equals(str) || str2.equals("*");
                if ((z11 || (i11 == list.size() - 2 && ((String) p.g(1, list)).equals("**"))) && z12) {
                    return true;
                }
            } else {
                if (z11 || !((String) list.get(i11 + 1)).equals(str)) {
                    if (!z11) {
                        int i12 = i11 + 1;
                        if (i12 >= list.size() - 1) {
                            return ((String) list.get(i12)).equals(str);
                        }
                    }
                    return true;
                }
                if (i11 == list.size() - 2 || (i11 == list.size() - 3 && ((String) p.g(1, list)).equals("**"))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int b(int i11, String str) {
        if ("__container".equals(str)) {
            return 0;
        }
        List list = this.f23379a;
        if (((String) list.get(i11)).equals("**")) {
            return (i11 != list.size() - 1 && ((String) list.get(i11 + 1)).equals(str)) ? 2 : 0;
        }
        return 1;
    }

    public final boolean c(int i11, String str) {
        if ("__container".equals(str)) {
            return true;
        }
        List list = this.f23379a;
        if (i11 >= list.size()) {
            return false;
        }
        return ((String) list.get(i11)).equals(str) || ((String) list.get(i11)).equals("**") || ((String) list.get(i11)).equals("*");
    }

    public final boolean d(int i11, String str) {
        if ("__container".equals(str)) {
            return true;
        }
        List list = this.f23379a;
        return i11 < list.size() - 1 || ((String) list.get(i11)).equals("**");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (!this.f23379a.equals(fVar.f23379a)) {
                return false;
            }
            g gVar = this.f23380b;
            g gVar2 = fVar.f23380b;
            if (gVar != null) {
                return gVar.equals(gVar2);
            }
            if (gVar2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f23379a.hashCode() * 31;
        g gVar = this.f23380b;
        return iHashCode + (gVar != null ? gVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(HOBXIlHxIkMBEA.qBwa);
        sb2.append(this.f23379a);
        sb2.append(",resolved=");
        return ep.a.l(sb2, this.f23380b != null, '}');
    }

    public f(f fVar) {
        this.f23379a = new ArrayList(fVar.f23379a);
        this.f23380b = fVar.f23380b;
    }
}
