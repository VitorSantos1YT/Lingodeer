package z9;

import java.io.IOException;
import java.util.Locale;
import kotlin.jvm.internal.m;
import oz.q;
import vf.eq.EHjhWcesDUIsIw;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements ja.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ka.a f59033a;

    public a(ka.a db2) {
        m.f(db2, "db");
        this.f59033a = db2;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f59033a.close();
    }

    @Override // ja.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final h B1(String sql) {
        String strSubstring;
        int i11;
        m.f(sql, "sql");
        ka.a db2 = this.f59033a;
        m.f(db2, "db");
        String upperCase = q.i1(sql).toString().toUpperCase(Locale.ROOT);
        int iB = w4.c.b(2, upperCase, "toUpperCase(...)");
        int i12 = -1;
        if (iB >= 0) {
            int iH0 = 0;
            loop0: while (iH0 < iB) {
                char cCharAt = upperCase.charAt(iH0);
                if (m.h(cCharAt, 32) > 0) {
                    if (cCharAt != '-') {
                        if (cCharAt == '/') {
                            int iH1 = iH0 + 1;
                            if (upperCase.charAt(iH1) == '*') {
                                do {
                                    iH1 = q.H0(upperCase, '*', iH1 + 1, 4);
                                    if (iH1 >= 0) {
                                        i11 = iH1 + 1;
                                        if (i11 >= iB) {
                                            break;
                                        }
                                    } else {
                                        break loop0;
                                    }
                                } while (upperCase.charAt(i11) != '/');
                                iH0 = iH1 + 2;
                            }
                        }
                        i12 = iH0;
                        break;
                    }
                    if (upperCase.charAt(iH0 + 1) == '-') {
                        iH0 = q.H0(upperCase, '\n', iH0 + 2, 4);
                        if (iH0 < 0) {
                            break;
                        }
                    } else {
                        i12 = iH0;
                        break;
                    }
                }
                iH0++;
            }
        }
        if (i12 < 0 || i12 > upperCase.length()) {
            strSubstring = null;
        } else {
            strSubstring = upperCase.substring(i12, Math.min(i12 + 3, upperCase.length()));
            m.e(strSubstring, EHjhWcesDUIsIw.cNfIIq);
        }
        if (strSubstring == null) {
            return new g(db2, sql);
        }
        int iHashCode = strSubstring.hashCode();
        if (iHashCode == 79487 ? !strSubstring.equals("PRA") : iHashCode == 81978 ? !strSubstring.equals("SEL") : !(iHashCode == 85954 && strSubstring.equals("WIT"))) {
            return new g(db2, sql);
        }
        f fVar = new f(db2, sql);
        fVar.f59042d = new int[0];
        fVar.f59043e = new long[0];
        fVar.f59044f = new double[0];
        fVar.f59045t = new String[0];
        fVar.H = new byte[0][];
        return fVar;
    }
}
