package okhttp3.internal.idn;

import com.google.logging.type.LogSeverity;
import fr.p3;
import m00.l;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class Punycode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Punycode f45513a = new Punycode();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f45514b = "xn--";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l f45515c;

    static {
        l lVar = l.f40723d;
        f45515c = p3.l("xn--");
    }

    private Punycode() {
    }

    public static int a(int i11, int i12, boolean z11) {
        int i13 = z11 ? i11 / LogSeverity.ALERT_VALUE : i11 / 2;
        int i14 = (i13 / i12) + i13;
        int i15 = 0;
        while (i14 > 455) {
            i14 /= 35;
            i15 += 36;
        }
        return ((i14 * 36) / (i14 + 38)) + i15;
    }

    public static int b(int i11) {
        if (i11 < 26) {
            return i11 + 97;
        }
        if (i11 < 36) {
            return i11 + 22;
        }
        throw new IllegalStateException(("unexpected digit: " + i11).toString());
    }
}
