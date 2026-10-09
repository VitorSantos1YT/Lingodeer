package mw;

import com.google.common.base.Charsets;
import java.nio.charset.Charset;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class o1 extends b {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final lw.a1 f42593u = lw.h0.a(":status", new n3(14));

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public lw.q1 f42594q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public lw.c1 f42595r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Charset f42596s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f42597t;

    public static Charset h(lw.c1 c1Var) {
        String str = (String) c1Var.c(k1.f42495i);
        if (str != null) {
            String[] strArrSplit = str.split("charset=", 2);
            try {
                return Charset.forName(strArrSplit[strArrSplit.length - 1].trim());
            } catch (Exception unused) {
            }
        }
        return Charsets.f16353b;
    }

    public static lw.q1 i(lw.c1 c1Var) {
        char cCharAt;
        Integer num = (Integer) c1Var.c(f42593u);
        if (num == null) {
            return lw.q1.f40441l.h("Missing HTTP status code");
        }
        String str = (String) c1Var.c(k1.f42495i);
        if (str != null && 16 <= str.length()) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (lowerCase.startsWith("application/grpc") && (lowerCase.length() == 16 || (cCharAt = lowerCase.charAt(16)) == '+' || cCharAt == ';')) {
                return null;
            }
        }
        return k1.g(num.intValue()).b("invalid content-type: " + str);
    }
}
