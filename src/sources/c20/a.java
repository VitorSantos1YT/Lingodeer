package c20;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public HashMap f6510b;

    public String a(String str) {
        switch (this.f6509a) {
            case 1:
                HashMap map = this.f6510b;
                if (map.containsKey(str)) {
                    return (String) map.get(str);
                }
                StringBuilder sb2 = new StringBuilder();
                for (int i11 = 0; i11 < str.length(); i11++) {
                    String strValueOf = String.valueOf(str.charAt(i11));
                    if (map.containsKey(strValueOf)) {
                        strValueOf = (String) map.get(strValueOf);
                    }
                    sb2.append(strValueOf);
                }
                return sb2.toString().trim();
            default:
                HashMap map2 = this.f6510b;
                if (map2.containsKey(str)) {
                    return (String) map2.get(str);
                }
                StringBuilder sb3 = new StringBuilder();
                for (int i12 = 0; i12 < str.length(); i12++) {
                    String strValueOf2 = String.valueOf(str.charAt(i12));
                    if (map2.containsKey(strValueOf2)) {
                        strValueOf2 = (String) map2.get(strValueOf2);
                    }
                    sb3.append(strValueOf2);
                }
                return sb3.toString().trim();
        }
    }

    public a(int i11) {
        this.f6509a = i11;
        switch (i11) {
            case 3:
                this.f6510b = new HashMap();
                break;
            default:
                this.f6510b = new HashMap();
                break;
        }
    }
}
