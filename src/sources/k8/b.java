package k8;

import com.lingo.lingoskill.http.oss.MYmT.bjXGJ;
import defpackage.e;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import y6.b0;
import y6.z;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f37966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f37967c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f37968d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f37969e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f37970f;

    public b(int i11, int i12, String str, String str2, String str3, boolean z11) {
        b7.a.d(i12 == -1 || i12 > 0);
        this.f37965a = i11;
        this.f37966b = str;
        this.f37967c = str2;
        this.f37968d = str3;
        this.f37969e = z11;
        this.f37970f = i12;
    }

    @Override // y6.b0
    public final void b(z zVar) {
        String str = this.f37967c;
        if (str != null) {
            zVar.f57403x = str;
        }
        String str2 = this.f37966b;
        if (str2 != null) {
            zVar.f57402w = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f37965a == bVar.f37965a && Objects.equals(this.f37966b, bVar.f37966b) && Objects.equals(this.f37967c, bVar.f37967c) && Objects.equals(this.f37968d, bVar.f37968d) && this.f37969e == bVar.f37969e && this.f37970f == bVar.f37970f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i11 = (527 + this.f37965a) * 31;
        String str = this.f37966b;
        int iHashCode = (i11 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f37967c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f37968d;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f37969e ? 1 : 0)) * 31) + this.f37970f;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.f37967c + "\", genre=\"" + this.f37966b + "\", bitrate=" + this.f37965a + ", metadataInterval=" + this.f37970f;
    }

    public static b d(Map map) {
        boolean z11;
        int i11;
        String str;
        String str2;
        String str3;
        boolean zEquals;
        int i12;
        List list = (List) map.get("icy-br");
        boolean z12 = true;
        int i13 = -1;
        if (list != null) {
            String str4 = (String) list.get(0);
            try {
                i12 = Integer.parseInt(str4) * 1000;
                if (i12 > 0) {
                    z11 = true;
                } else {
                    try {
                        b7.a.B("Invalid bitrate: " + str4);
                        z11 = false;
                        i12 = -1;
                    } catch (NumberFormatException unused) {
                        e.B("Invalid bitrate header: ", str4);
                        z11 = false;
                    }
                }
            } catch (NumberFormatException unused2) {
                i12 = -1;
            }
            i11 = i12;
        } else {
            z11 = false;
            i11 = -1;
        }
        List list2 = (List) map.get(bjXGJ.KVMCIY);
        if (list2 != null) {
            str = (String) list2.get(0);
            z11 = true;
        } else {
            str = null;
        }
        List list3 = (List) map.get("icy-name");
        if (list3 != null) {
            str2 = (String) list3.get(0);
            z11 = true;
        } else {
            str2 = null;
        }
        List list4 = (List) map.get("icy-url");
        if (list4 != null) {
            str3 = (String) list4.get(0);
            z11 = true;
        } else {
            str3 = null;
        }
        List list5 = (List) map.get("icy-pub");
        if (list5 != null) {
            zEquals = ((String) list5.get(0)).equals("1");
            z11 = true;
        } else {
            zEquals = false;
        }
        List list6 = (List) map.get("icy-metaint");
        if (list6 != null) {
            String str5 = (String) list6.get(0);
            try {
                int i14 = Integer.parseInt(str5);
                if (i14 > 0) {
                    i13 = i14;
                } else {
                    try {
                        b7.a.B("Invalid metadata interval: " + str5);
                        z12 = z11;
                    } catch (NumberFormatException unused3) {
                        i13 = i14;
                        e.B("Invalid metadata interval: ", str5);
                    }
                }
                z11 = z12;
            } catch (NumberFormatException unused4) {
            }
        }
        int i15 = i13;
        if (z11) {
            return new b(i11, i15, str, str2, str3, zEquals);
        }
        return null;
    }
}
