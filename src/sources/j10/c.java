package j10;

import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f35524a = 0;

    static {
        "0123456789ABCDEF".toCharArray();
    }

    public static void a(StringBuilder sb2, String str, String[] strArr) {
        for (int i11 = 0; i11 < strArr.length; i11++) {
            String str2 = strArr[i11];
            sb2.append(str);
            sb2.append(".\"");
            sb2.append(str2);
            sb2.append('\"');
            sb2.append("=?");
            if (i11 < strArr.length - 1) {
                sb2.append(',');
            }
        }
    }

    public static String b(String str, String str2, String[] strArr) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append('\"');
        sb2.append(str2);
        sb2.append("\" (");
        int length = strArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            sb2.append('\"');
            sb2.append(strArr[i11]);
            sb2.append('\"');
            if (i11 < length - 1) {
                sb2.append(',');
            }
        }
        sb2.append(") VALUES (");
        int length2 = strArr.length;
        for (int i12 = 0; i12 < length2; i12++) {
            if (i12 < length2 - 1) {
                sb2.append("?,");
            } else {
                sb2.append('?');
            }
        }
        sb2.append(')');
        return sb2.toString();
    }

    public static String c(String str, String[] strArr) {
        StringBuilder sb2 = new StringBuilder("SELECT ");
        int length = strArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            String str2 = strArr[i11];
            sb2.append("T.\"");
            sb2.append(str2);
            sb2.append('\"');
            if (i11 < length - 1) {
                sb2.append(',');
            }
        }
        return p.u(sb2, " FROM \"", str, "\" T ");
    }
}
