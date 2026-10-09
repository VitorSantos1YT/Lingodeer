package okhttp3;

import com.bumptech.glide.e;
import hh.p0;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.jvm.internal.m;
import nv.p;
import oz.i;
import oz.j;
import oz.k;
import oz.l;
import oz.o;
import oz.q;
import oz.x;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class MediaType {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Companion f45062e = new Companion(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final o f45063f = new o("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final o f45064g = new o(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f45066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f45067c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String[] f45068d;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        public /* synthetic */ Companion(int i11) {
            this();
        }

        public static MediaType a(String str) {
            m.f(str, "<this>");
            l lVarD = MediaType.f45063f.d(0, str);
            if (lVarD == null) {
                throw new IllegalArgumentException(p.q("No subtype found for: \"", str, '\"'));
            }
            String str2 = (String) ((j) lVarD.a()).get(1);
            Locale locale = Locale.ROOT;
            String lowerCase = str2.toLowerCase(locale);
            m.e(lowerCase, "toLowerCase(...)");
            String lowerCase2 = ((String) ((j) lVarD.a()).get(2)).toLowerCase(locale);
            m.e(lowerCase2, "toLowerCase(...)");
            ArrayList arrayList = new ArrayList();
            int i11 = lVarD.b().f40533b;
            while (true) {
                int i12 = i11 + 1;
                if (i12 >= str.length()) {
                    return new MediaType(str, lowerCase, lowerCase2, (String[]) arrayList.toArray(new String[0]));
                }
                l lVarD2 = MediaType.f45064g.d(i12, str);
                if (lVarD2 == null) {
                    StringBuilder sb2 = new StringBuilder("Parameter is not formatted correctly: \"");
                    String strSubstring = str.substring(i12);
                    m.e(strSubstring, "substring(...)");
                    sb2.append(strSubstring);
                    sb2.append("\" for: \"");
                    throw new IllegalArgumentException(p0.o(sb2, str, '\"').toString());
                }
                k kVar = lVarD2.f46171c;
                i iVarD = kVar.d(1);
                String str3 = iVarD != null ? iVarD.f46163a : null;
                if (str3 == null) {
                    i11 = lVarD2.b().f40533b;
                } else {
                    i iVarD2 = kVar.d(2);
                    String strSubstring2 = iVarD2 != null ? iVarD2.f46163a : null;
                    if (strSubstring2 == null) {
                        i iVarD3 = kVar.d(3);
                        m.c(iVarD3);
                        strSubstring2 = iVarD3.f46163a;
                    } else if (q.Y0(strSubstring2, '\'') && q.A0(strSubstring2, '\'') && strSubstring2.length() > 2) {
                        strSubstring2 = strSubstring2.substring(1, strSubstring2.length() - 1);
                        m.e(strSubstring2, "substring(...)");
                    }
                    arrayList.add(str3);
                    arrayList.add(strSubstring2);
                    i11 = lVarD2.b().f40533b;
                }
            }
        }

        public static MediaType b(String str) {
            m.f(str, "<this>");
            try {
                return a(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        private Companion() {
        }
    }

    public MediaType(String mediaType, String str, String str2, String[] parameterNamesAndValues) {
        m.f(mediaType, "mediaType");
        m.f(parameterNamesAndValues, "parameterNamesAndValues");
        this.f45065a = mediaType;
        this.f45066b = str;
        this.f45067c = str2;
        this.f45068d = parameterNamesAndValues;
    }

    public static Charset a(MediaType mediaType) {
        String str;
        String[] strArr = mediaType.f45068d;
        int i11 = 0;
        int iV = e.v(0, strArr.length - 1, 2);
        if (iV < 0) {
            str = null;
            break;
        }
        while (true) {
            if (!x.l0(strArr[i11], "charset", true)) {
                if (i11 == iV) {
                    str = null;
                    break;
                }
                i11 += 2;
            } else {
                str = strArr[i11 + 1];
                break;
            }
        }
        if (str == null) {
            return null;
        }
        try {
            return Charset.forName(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof MediaType) && m.a(((MediaType) obj).f45065a, this.f45065a);
    }

    public final int hashCode() {
        return this.f45065a.hashCode();
    }

    public final String toString() {
        return this.f45065a;
    }
}
