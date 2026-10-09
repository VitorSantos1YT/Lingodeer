package xi;

import b7.e0;
import com.tbruyelle.rxpermissions3.BuildConfig;
import fv.f;
import fv.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;
import kotlin.jvm.internal.m;
import ns.o;
import nv.p;
import oz.x;
import qy.q;
import ry.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f56087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f56088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f56089c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f56090d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f56091e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f56092f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f56093g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f56094h;

    public b(int i11, String str, String str2, boolean z11) {
        List listK;
        List listK2;
        this.f56087a = str;
        this.f56088b = str2;
        this.f56089c = i11;
        this.f56090d = z11;
        q qVar = f.f28191a;
        m.c(str);
        m.c(str2);
        this.f56091e = f.l(i11, str, str2);
        String[] strArr = f.f28195e;
        int length = strArr.length;
        int i12 = 0;
        while (true) {
            Collection collectionT = r.f50854a;
            if (i12 >= length) {
                this.f56092f = BuildConfig.VERSION_NAME;
                String str3 = this.f56091e;
                m.f(str3, "<set-?>");
                this.f56093g = str3;
                String strD = g.D(b());
                m.e(strD, "replaceYunmuWithNoTone(...)");
                Matcher matcherW = p.w(0, ";", "compile(...)", strD);
                if (matcherW.find()) {
                    ArrayList arrayList = new ArrayList(10);
                    int iC = 0;
                    do {
                        iC = p.c(matcherW, strD, iC, arrayList);
                    } while (matcherW.find());
                    p.B(iC, strD, arrayList);
                    listK = arrayList;
                } else {
                    listK = o.K(strD.toString());
                }
                if (!listK.isEmpty()) {
                    ListIterator listIterator = listK.listIterator(listK.size());
                    while (listIterator.hasPrevious()) {
                        if (((String) listIterator.previous()).length() != 0) {
                            collectionT = e0.t(listIterator, 1, listK);
                            break;
                        }
                    }
                }
                String str4 = ((String[]) collectionT.toArray(new String[0]))[0];
                m.f(str4, "<set-?>");
                this.f56094h = str4;
                return;
            }
            String str5 = strArr[i12];
            if (x.s0(this.f56091e, str5, false)) {
                this.f56092f = str5;
                int length2 = str5.length();
                String str6 = this.f56091e;
                String strSubstring = str6.substring(length2, str6.length());
                m.e(strSubstring, "substring(...)");
                this.f56093g = strSubstring;
                String strD2 = g.D(b());
                m.e(strD2, "replaceYunmuWithNoTone(...)");
                Matcher matcherW2 = p.w(0, ";", "compile(...)", strD2);
                if (matcherW2.find()) {
                    ArrayList arrayList2 = new ArrayList(10);
                    int iC2 = 0;
                    do {
                        iC2 = p.c(matcherW2, strD2, iC2, arrayList2);
                    } while (matcherW2.find());
                    p.B(iC2, strD2, arrayList2);
                    listK2 = arrayList2;
                } else {
                    listK2 = o.K(strD2.toString());
                }
                if (!listK2.isEmpty()) {
                    ListIterator listIterator2 = listK2.listIterator(listK2.size());
                    while (listIterator2.hasPrevious()) {
                        if (((String) listIterator2.previous()).length() != 0) {
                            collectionT = e0.t(listIterator2, 1, listK2);
                            break;
                        }
                    }
                }
                String str7 = ((String[]) collectionT.toArray(new String[0]))[0];
                m.f(str7, "<set-?>");
                this.f56094h = str7;
                return;
            }
            i12++;
        }
    }

    public final String a() {
        String str = this.f56092f;
        if (str != null) {
            return str;
        }
        m.n("showSengMu");
        throw null;
    }

    public final String b() {
        String str = this.f56093g;
        if (str != null) {
            return str;
        }
        m.n("showYunMu");
        throw null;
    }

    public final String c() {
        String str = this.f56094h;
        if (str != null) {
            return str;
        }
        m.n("showYunMuNoTone");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return m.a(this.f56087a, bVar.f56087a) && m.a(this.f56088b, bVar.f56088b) && this.f56089c == bVar.f56089c;
    }
}
