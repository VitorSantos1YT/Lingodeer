package w4;

import android.util.Base64;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f54629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f54630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f54631c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f54632d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f54633e;

    public d(String str, String str2, String str3, List list) {
        str.getClass();
        this.f54629a = str;
        str2.getClass();
        this.f54630b = str2;
        this.f54631c = str3;
        list.getClass();
        this.f54632d = list;
        this.f54633e = c.h(str, "-", str2, "-", str3);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: " + this.f54629a + ", mProviderPackage: " + this.f54630b + ", mQuery: " + this.f54631c + ", mCertificates:");
        int i11 = 0;
        while (true) {
            List list = this.f54632d;
            if (i11 >= list.size()) {
                sb2.append("}mCertificatesArray: 0");
                return sb2.toString();
            }
            sb2.append(" [");
            List list2 = (List) list.get(i11);
            for (int i12 = 0; i12 < list2.size(); i12++) {
                sb2.append(" \"");
                sb2.append(Base64.encodeToString((byte[]) list2.get(i12), 0));
                sb2.append("\"");
            }
            sb2.append(" ]");
            i11++;
        }
    }
}
