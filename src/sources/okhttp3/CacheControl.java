package okhttp3;

import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.tbruyelle.rxpermissions3.BuildConfig;
import defpackage.e;
import dl.ExOZ.xItStCyvVEZ;
import kotlin.jvm.internal.m;
import okhttp3.internal._UtilCommonKt;
import oz.q;
import pz.c;
import pz.f;
import vf.eq.EHjhWcesDUIsIw;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class CacheControl {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Companion f44946n = new Companion(0);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final CacheControl f44947o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final CacheControl f44948p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f44949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f44950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f44951c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f44952d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f44953e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f44954f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f44955g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f44956h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f44957i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f44958j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f44959k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f44960l;
    public String m;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f44961a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f44962b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f44963c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f44964d;

        public final CacheControl a() {
            return new CacheControl(this.f44961a, this.f44962b, -1, -1, false, false, false, this.f44963c, -1, this.f44964d, false, false, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        public /* synthetic */ Companion(int i11) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Code duplicated, block: B:108:0x0066 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:109:0x006c A[EDGE_INSN: B:109:0x006c->B:22:0x006c BREAK  A[LOOP:2: B:16:0x004e->B:20:0x005f], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:15:0x0049  */
        /* JADX WARN: Code duplicated, block: B:17:0x0050  */
        /* JADX WARN: Code duplicated, block: B:20:0x005f A[LOOP:2: B:16:0x004e->B:20:0x005f, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:51:0x010a  */
        /* JADX WARN: Code duplicated, block: B:54:0x0116  */
        /* JADX WARN: Code duplicated, block: B:56:0x011e  */
        /* JADX WARN: Code duplicated, block: B:58:0x0126  */
        /* JADX WARN: Code duplicated, block: B:59:0x012b  */
        /* JADX WARN: Code duplicated, block: B:61:0x0133  */
        /* JADX WARN: Code duplicated, block: B:63:0x013b  */
        /* JADX WARN: Code duplicated, block: B:65:0x0144  */
        /* JADX WARN: Code duplicated, block: B:66:0x0149  */
        /* JADX WARN: Code duplicated, block: B:68:0x0151  */
        /* JADX WARN: Code duplicated, block: B:69:0x0156  */
        /* JADX WARN: Code duplicated, block: B:71:0x015e  */
        /* JADX WARN: Code duplicated, block: B:72:0x0163  */
        /* JADX WARN: Code duplicated, block: B:74:0x016b  */
        /* JADX WARN: Code duplicated, block: B:75:0x0170  */
        /* JADX WARN: Code duplicated, block: B:77:0x0178  */
        /* JADX WARN: Code duplicated, block: B:78:0x0180  */
        /* JADX WARN: Code duplicated, block: B:80:0x0189  */
        /* JADX WARN: Code duplicated, block: B:81:0x018f  */
        /* JADX WARN: Code duplicated, block: B:83:0x0198  */
        /* JADX WARN: Code duplicated, block: B:84:0x019e  */
        /* JADX WARN: Code duplicated, block: B:86:0x01a7  */
        /* JADX WARN: Code duplicated, block: B:87:0x01ad  */
        /* JADX WARN: Code duplicated, block: B:89:0x01b5  */
        public static CacheControl a(Headers headers) {
            int i11;
            int length;
            int length2;
            int i12;
            String string;
            String string2;
            int length3;
            Headers headers2 = headers;
            m.f(headers2, "headers");
            int size = headers2.size();
            int i13 = 0;
            boolean z11 = true;
            String str = null;
            boolean z12 = false;
            boolean z13 = false;
            int iN = -1;
            int iN2 = -1;
            boolean z14 = false;
            boolean z15 = false;
            boolean z16 = false;
            int iN3 = -1;
            int iN4 = -1;
            boolean z17 = false;
            boolean z18 = false;
            boolean z19 = false;
            while (i13 < size) {
                String strD = headers2.d(i13);
                String strG = headers2.g(i13);
                if (strD.equalsIgnoreCase(HttpHeaders.CACHE_CONTROL)) {
                    if (str == null) {
                        str = strG;
                    }
                    i11 = 0;
                    while (i11 < strG.length()) {
                        length = strG.length();
                        length2 = i11;
                        while (true) {
                            if (length2 < length) {
                                i12 = size;
                                length2 = strG.length();
                                break;
                            }
                            i12 = size;
                            if (q.w0("=,;", strG.charAt(length2))) {
                                break;
                            }
                            length2++;
                            size = i12;
                        }
                        String strSubstring = strG.substring(i11, length2);
                        m.e(strSubstring, "substring(...)");
                        string = q.i1(strSubstring).toString();
                        if (length2 != strG.length() || strG.charAt(length2) == ',' || strG.charAt(length2) == ';') {
                            i11 = length2 + 1;
                            string2 = null;
                        } else {
                            int length4 = length2 + 1;
                            byte[] bArr = _UtilCommonKt.f45202a;
                            int length5 = strG.length();
                            while (true) {
                                if (length4 >= length5) {
                                    length4 = strG.length();
                                    break;
                                }
                                char cCharAt = strG.charAt(length4);
                                int i14 = length5;
                                if (cCharAt != ' ' && cCharAt != '\t') {
                                    break;
                                }
                                length4++;
                                length5 = i14;
                            }
                            if (length4 >= strG.length() || strG.charAt(length4) != '\"') {
                                int length6 = strG.length();
                                int i15 = length4;
                                while (true) {
                                    if (i15 >= length6) {
                                        length3 = strG.length();
                                        break;
                                    }
                                    int i16 = length6;
                                    int i17 = i15;
                                    if (q.w0(",;", strG.charAt(i15))) {
                                        length3 = i17;
                                        break;
                                    }
                                    i15 = i17 + 1;
                                    length6 = i16;
                                }
                                String strSubstring2 = strG.substring(length4, length3);
                                m.e(strSubstring2, "substring(...)");
                                string2 = q.i1(strSubstring2).toString();
                                i11 = length3;
                            } else {
                                int i18 = length4 + 1;
                                int iH0 = q.H0(strG, '\"', i18, 4);
                                string2 = strG.substring(i18, iH0);
                                m.e(string2, "substring(...)");
                                i11 = iH0 + 1;
                            }
                        }
                        if ("no-cache".equalsIgnoreCase(string)) {
                            z12 = true;
                        } else if ("no-store".equalsIgnoreCase(string)) {
                            z13 = true;
                        } else if ("max-age".equalsIgnoreCase(string)) {
                            iN = _UtilCommonKt.n(-1, string2);
                        } else if ("s-maxage".equalsIgnoreCase(string)) {
                            iN2 = _UtilCommonKt.n(-1, string2);
                        } else if ("private".equalsIgnoreCase(string)) {
                            z14 = true;
                        } else if ("public".equalsIgnoreCase(string)) {
                            z15 = true;
                        } else if ("must-revalidate".equalsIgnoreCase(string)) {
                            z16 = true;
                        } else if ("max-stale".equalsIgnoreCase(string)) {
                            iN3 = _UtilCommonKt.n(Integer.MAX_VALUE, string2);
                        } else if (EHjhWcesDUIsIw.mths.equalsIgnoreCase(string)) {
                            iN4 = _UtilCommonKt.n(-1, string2);
                        } else if ("only-if-cached".equalsIgnoreCase(string)) {
                            z17 = true;
                        } else if (xItStCyvVEZ.olIXIYYoK.equalsIgnoreCase(string)) {
                            z18 = true;
                        } else if ("immutable".equalsIgnoreCase(string)) {
                            z19 = true;
                        }
                        size = i12;
                    }
                    i13++;
                    headers2 = headers;
                    size = size;
                } else {
                    if (strD.equalsIgnoreCase("Pragma")) {
                    }
                    i13++;
                    headers2 = headers;
                    size = size;
                }
                z11 = false;
                i11 = 0;
                while (i11 < strG.length()) {
                    length = strG.length();
                    length2 = i11;
                    while (true) {
                        if (length2 < length) {
                            i12 = size;
                            length2 = strG.length();
                            break;
                        }
                        i12 = size;
                        if (q.w0("=,;", strG.charAt(length2))) {
                            break;
                            break;
                        }
                        length2++;
                        size = i12;
                    }
                    String strSubstring3 = strG.substring(i11, length2);
                    m.e(strSubstring3, "substring(...)");
                    string = q.i1(strSubstring3).toString();
                    if (length2 != strG.length()) {
                        i11 = length2 + 1;
                        string2 = null;
                    } else {
                        i11 = length2 + 1;
                        string2 = null;
                    }
                    if ("no-cache".equalsIgnoreCase(string)) {
                        z12 = true;
                    } else if ("no-store".equalsIgnoreCase(string)) {
                        z13 = true;
                    } else if ("max-age".equalsIgnoreCase(string)) {
                        iN = _UtilCommonKt.n(-1, string2);
                    } else if ("s-maxage".equalsIgnoreCase(string)) {
                        iN2 = _UtilCommonKt.n(-1, string2);
                    } else if ("private".equalsIgnoreCase(string)) {
                        z14 = true;
                    } else if ("public".equalsIgnoreCase(string)) {
                        z15 = true;
                    } else if ("must-revalidate".equalsIgnoreCase(string)) {
                        z16 = true;
                    } else if ("max-stale".equalsIgnoreCase(string)) {
                        iN3 = _UtilCommonKt.n(Integer.MAX_VALUE, string2);
                    } else if (EHjhWcesDUIsIw.mths.equalsIgnoreCase(string)) {
                        iN4 = _UtilCommonKt.n(-1, string2);
                    } else if ("only-if-cached".equalsIgnoreCase(string)) {
                        z17 = true;
                    } else if (xItStCyvVEZ.olIXIYYoK.equalsIgnoreCase(string)) {
                        z18 = true;
                    } else if ("immutable".equalsIgnoreCase(string)) {
                        z19 = true;
                    }
                    size = i12;
                }
                i13++;
                headers2 = headers;
                size = size;
            }
            return new CacheControl(z12, z13, iN, iN2, z14, z15, z16, iN3, iN4, z17, z18, z19, !z11 ? null : str);
        }
    }

    static {
        Builder builder = new Builder();
        builder.f44961a = true;
        f44947o = builder.a();
        Builder builder2 = new Builder();
        builder2.f44964d = true;
        int i11 = pz.a.f47220d;
        c cVar = c.SECONDS;
        long j11 = pz.a.j(f.p(Integer.MAX_VALUE, cVar), cVar);
        if (j11 < 0) {
            throw new IllegalArgumentException(e.h(j11, "maxStale < 0: ").toString());
        }
        builder2.f44963c = j11 <= 2147483647L ? (int) j11 : Integer.MAX_VALUE;
        f44948p = builder2.a();
    }

    public CacheControl(boolean z11, boolean z12, int i11, int i12, boolean z13, boolean z14, boolean z15, int i13, int i14, boolean z16, boolean z17, boolean z18, String str) {
        this.f44949a = z11;
        this.f44950b = z12;
        this.f44951c = i11;
        this.f44952d = i12;
        this.f44953e = z13;
        this.f44954f = z14;
        this.f44955g = z15;
        this.f44956h = i13;
        this.f44957i = i14;
        this.f44958j = z16;
        this.f44959k = z17;
        this.f44960l = z18;
        this.m = str;
    }

    public final String toString() {
        String str = this.m;
        if (str != null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f44949a) {
            sb2.append("no-cache, ");
        }
        if (this.f44950b) {
            sb2.append("no-store, ");
        }
        int i11 = this.f44951c;
        if (i11 != -1) {
            sb2.append("max-age=");
            sb2.append(i11);
            sb2.append(", ");
        }
        int i12 = this.f44952d;
        if (i12 != -1) {
            sb2.append("s-maxage=");
            sb2.append(i12);
            sb2.append(", ");
        }
        if (this.f44953e) {
            sb2.append("private, ");
        }
        if (this.f44954f) {
            sb2.append("public, ");
        }
        if (this.f44955g) {
            sb2.append("must-revalidate, ");
        }
        int i13 = this.f44956h;
        if (i13 != -1) {
            sb2.append("max-stale=");
            sb2.append(i13);
            sb2.append(", ");
        }
        int i14 = this.f44957i;
        if (i14 != -1) {
            sb2.append("min-fresh=");
            sb2.append(i14);
            sb2.append(", ");
        }
        if (this.f44958j) {
            sb2.append("only-if-cached, ");
        }
        if (this.f44959k) {
            sb2.append("no-transform, ");
        }
        if (this.f44960l) {
            sb2.append("immutable, ");
        }
        if (sb2.length() == 0) {
            return BuildConfig.VERSION_NAME;
        }
        m.e(sb2.delete(sb2.length() - 2, sb2.length()), "delete(...)");
        String string = sb2.toString();
        this.m = string;
        return string;
    }
}
