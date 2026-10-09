package oz;

import com.adjust.sdk.Constants;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f46133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f46134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Charset f46135c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Charset f46136d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Charset f46137e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static volatile Charset f46138f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile Charset f46139g;

    static {
        Charset charsetForName = Charset.forName(Constants.ENCODING);
        kotlin.jvm.internal.m.e(charsetForName, "forName(...)");
        f46133a = charsetForName;
        kotlin.jvm.internal.m.e(Charset.forName("UTF-16"), "forName(...)");
        Charset charsetForName2 = Charset.forName("UTF-16BE");
        kotlin.jvm.internal.m.e(charsetForName2, "forName(...)");
        f46134b = charsetForName2;
        Charset charsetForName3 = Charset.forName("UTF-16LE");
        kotlin.jvm.internal.m.e(charsetForName3, "forName(...)");
        f46135c = charsetForName3;
        Charset charsetForName4 = Charset.forName("US-ASCII");
        kotlin.jvm.internal.m.e(charsetForName4, "forName(...)");
        f46136d = charsetForName4;
        Charset charsetForName5 = Charset.forName("ISO-8859-1");
        kotlin.jvm.internal.m.e(charsetForName5, "forName(...)");
        f46137e = charsetForName5;
    }
}
