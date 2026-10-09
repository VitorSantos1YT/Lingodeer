package fv;

import b7.e0;
import com.tbruyelle.rxpermissions3.BuildConfig;
import hh.p0;
import kotlin.jvm.internal.m;
import lt.AJC.PQgum;
import mf.sOm.txBUGYhC;
import nv.p;
import oz.x;
import ry.l;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f28201a = {"ia", "ian", "iang", "iao", "ie", "iong"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f28202b = {"ü", "üe", "üan", "ün"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f28203c = {"u", "ua", "uai", "uan", "uang", "uei", "uen", "ueng", "uo"};

    public static String A(long j11) {
        return h() + "-natural-w-" + j11 + ".mp4";
    }

    public static String B(long j11) {
        return h() + "_w_" + j11 + ".mp4";
    }

    public static String C(String str, String luoma) {
        m.f(luoma, "luoma");
        if (l.D(new Integer[]{0, 11}, Integer.valueOf(xt.b.b().keyLanguage))) {
            return f.b(luoma);
        }
        StringBuilder sbQ = e0.q(h(), "-", str, "-zy-", luoma);
        sbQ.append(".mp3");
        return sbQ.toString();
    }

    public static String D(String str) {
        int i11;
        boolean z11;
        int i12 = 0;
        while (true) {
            if (i12 >= str.length()) {
                i11 = 0;
                z11 = false;
                break;
            }
            char cCharAt = str.charAt(i12);
            if ("āáǎàōóǒòēéěèīíǐìūúǔùǖǘǚǜ".indexOf(cCharAt) != -1) {
                z11 = true;
                if ("āōēīūǖ".indexOf(cCharAt) == -1) {
                    if ("áóéíúǘ".indexOf(cCharAt) == -1) {
                        if ("ǎǒěǐǔǚ".indexOf(cCharAt) == -1) {
                            if ("àòèìùǜ".indexOf(cCharAt) == -1) {
                                i11 = 0;
                                break;
                            }
                            i11 = 4;
                            break;
                        }
                        i11 = 3;
                        break;
                    }
                    i11 = 2;
                    break;
                }
                i11 = 1;
                break;
            }
            i12++;
        }
        if (!z11) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i13 = 0; i13 < str.length(); i13++) {
            char cCharAt2 = str.charAt(i13);
            int iIndexOf = "āáǎàōóǒòēéěèīíǐìūúǔùǖǘǚǜ".indexOf(cCharAt2);
            if (iIndexOf != -1) {
                sb2.append("aaaaooooeeeeiiiiuuuuüüüüü".charAt(iIndexOf));
            } else {
                sb2.append(cCharAt2);
            }
        }
        return sb2.toString() + ";" + i11;
    }

    public static String a(long j11, String str) {
        if (!xt.b.f56279a && !l.D(new Integer[0], Integer.valueOf(xt.b.b().keyLanguage))) {
            String strL = l();
            String strH = h();
            String strM = m(j11, str);
            StringBuilder sbQ = e0.q(strL, strH, "/main/lesson_", str, "/");
            sbQ.append(strM);
            return sbQ.toString();
        }
        return x.q0(xt.d.m(xt.b.b().keyLanguage), "AdminZG", "ShareMaterials") + "Lingo/all_f/" + m(j11, str) + "?t=" + System.currentTimeMillis();
    }

    public static String b(long j11, String str) {
        if (!xt.b.f56279a && !l.D(new Integer[0], Integer.valueOf(xt.b.b().keyLanguage))) {
            String strL = l();
            String strH = h();
            String strR = r(j11, str);
            StringBuilder sbQ = e0.q(strL, strH, "/main/lesson_", str, "/");
            sbQ.append(strR);
            return sbQ.toString();
        }
        return x.q0(xt.d.m(xt.b.b().keyLanguage), "AdminZG", "ShareMaterials") + "Lingo/all_f/" + r(j11, str) + "?t=" + System.currentTimeMillis();
    }

    public static String c(long j11, String mf2) {
        m.f(mf2, "mf");
        if (!xt.b.f56279a && !l.D(new Integer[0], Integer.valueOf(xt.b.b().keyLanguage))) {
            String strL = l();
            String strH = h();
            String strZ = z(j11, mf2);
            StringBuilder sbQ = e0.q(strL, strH, "/main/lesson_", mf2, "/");
            sbQ.append(strZ);
            return sbQ.toString();
        }
        return x.q0(xt.d.m(xt.b.b().keyLanguage), "AdminZG", "ShareMaterials") + "Lingo/all_f/" + z(j11, mf2) + "?t=" + System.currentTimeMillis();
    }

    public static String d(long j11, String mf2) {
        m.f(mf2, "mf");
        StringBuilder sb2 = new StringBuilder("alpha_");
        sb2.append(mf2);
        sb2.append("_");
        return defpackage.e.i(j11, ".zip", sb2);
    }

    public static String e(long j11, String mf2) {
        m.f(mf2, "mf");
        String strL = l();
        String strH = h();
        String strD = d(j11, mf2);
        StringBuilder sbQ = e0.q(strL, strH, "/z/alpha_", mf2, "/");
        sbQ.append(strD);
        return sbQ.toString();
    }

    public static String f(String mf2, String luoma) {
        m.f(mf2, "mf");
        m.f(luoma, "luoma");
        if (l.D(new Integer[]{53, 54}, Integer.valueOf(xt.b.b().keyLanguage))) {
            return ep.a.h("froc-", mf2, "-zy-", luoma, ".mp3");
        }
        StringBuilder sbQ = e0.q(x.q0(h(), "up", BuildConfig.VERSION_NAME), "-", mf2, "-zy-", luoma);
        sbQ.append(".mp3");
        return sbQ.toString();
    }

    public static String h() {
        return l.D(new Integer[]{14, 15, 16, 17, 22, 40, 48}, Integer.valueOf(xt.b.b().keyLanguage)) ? x.q0(xt.d.e(xt.b.b().keyLanguage), "up", BuildConfig.VERSION_NAME) : xt.d.e(xt.b.b().keyLanguage);
    }

    public static String i(long j11, String mf2) {
        m.f(mf2, "mf");
        StringBuilder sb2 = new StringBuilder("lesson_");
        sb2.append(mf2);
        sb2.append("_");
        return defpackage.e.i(j11, ".zip", sb2);
    }

    public static String j(long j11, String mf2) {
        m.f(mf2, "mf");
        String strL = l();
        String strH = h();
        String strI = i(j11, mf2);
        StringBuilder sbQ = e0.q(strL, strH, "/z/lesson_", mf2, "/");
        sbQ.append(strI);
        return sbQ.toString();
    }

    public static String k(long j11) {
        return p.r(l(), h(), "/z/lesson_png/", p.m(j11, "lesson_png_", ".zip"));
    }

    public static String l() {
        return (l.D(new Integer[]{13, 2}, Integer.valueOf(xt.b.b().keyLanguage)) && xt.b.f56280b) ? "https://res.lingodeer.com/mfsource/test-kr/" : "https://res.lingodeer.com/mfsource/";
    }

    public static String m(long j11, String mf2) {
        m.f(mf2, "mf");
        String strH = h();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(strH);
        sb2.append("-");
        sb2.append(mf2);
        sb2.append("-p-");
        return defpackage.e.i(j11, ".mp3", sb2);
    }

    public static String n(long j11, String str) {
        if (j11 == -1) {
            return p.r(x.q0(h(), "up", BuildConfig.VERSION_NAME), "-", str, "-zy-table.zip");
        }
        String strQ0 = x.q0(h(), "up", BuildConfig.VERSION_NAME);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(strQ0);
        sb2.append("-");
        sb2.append(str);
        sb2.append("-zy-lesson-");
        return defpackage.e.i(j11, ".zip", sb2);
    }

    public static String o(long j11, String str) {
        return p.r(l(), x.q0(h(), "up", BuildConfig.VERSION_NAME), "/z/others/", n(j11, str));
    }

    public static String p(long j11, String str) {
        if (l.D(new Integer[]{53, 54}, Integer.valueOf(xt.b.b().keyLanguage))) {
            if (j11 == -1) {
                return ep.a.g("froc-", str, "-zy-table.zip");
            }
            StringBuilder sbM = com.google.android.material.datepicker.d.m(j11, "froc-", str, "-zy-table-");
            sbM.append(".zip");
            return sbM.toString();
        }
        if (j11 == -1) {
            return p.r(x.q0(h(), "up", BuildConfig.VERSION_NAME), "-", str, "-zy-table.zip");
        }
        String strQ0 = x.q0(h(), "up", BuildConfig.VERSION_NAME);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(strQ0);
        sb2.append("-");
        sb2.append(str);
        sb2.append("-zy-table-");
        return defpackage.e.i(j11, ".zip", sb2);
    }

    public static String q(long j11, String str) {
        return l.D(new Integer[]{53, 54}, Integer.valueOf(xt.b.b().keyLanguage)) ? ep.a.D(l(), "froc/z/others/", p(j11, str)) : p.r(l(), x.q0(h(), "up", BuildConfig.VERSION_NAME), "/z/others/", p(j11, str));
    }

    public static String r(long j11, String str) {
        String strH = h();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(strH);
        sb2.append("-");
        sb2.append(str);
        sb2.append("-s-");
        return defpackage.e.i(j11, ".mp3", sb2);
    }

    public static String s(long j11) {
        return h() + "-natural-s-" + j11 + ".mp4";
    }

    public static String t(long j11) {
        return h() + "_s_" + j11 + ".mp4";
    }

    public static String u(int i11) {
        return p.r(l(), h(), "/z/story_png/", p0.h(i11, "story_png_", ".zip"));
    }

    public static String v(int i11, String mf2) {
        m.f(mf2, "mf");
        StringBuilder sb2 = new StringBuilder("story_");
        sb2.append(mf2);
        sb2.append("_");
        return p0.i(i11, ".zip", sb2);
    }

    public static String w(int i11, String mf2) {
        m.f(mf2, "mf");
        String strL = l();
        String strH = h();
        String strV = v(i11, mf2);
        StringBuilder sbQ = e0.q(strL, strH, "/z/story_", mf2, "/");
        sbQ.append(strV);
        return sbQ.toString();
    }

    public static String x(long j11, long j12, String str) {
        return h() + "-travelphrase-" + str + "-" + j11 + "-" + j12 + ".mp3";
    }

    public static String y(long j11) {
        return h() + "-w-json-" + j11 + ".json";
    }

    public static String z(long j11, String mf2) {
        m.f(mf2, "mf");
        String strH = h();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(strH);
        sb2.append("-");
        sb2.append(mf2);
        sb2.append("-w-");
        return defpackage.e.i(j11, ".mp3", sb2);
    }

    public static String E(int i11, String str) {
        if (i11 == 0) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str);
        int iIndexOf = str.indexOf("a");
        if (iIndexOf != -1) {
            sb2.setCharAt(iIndexOf, "āáǎàōóǒòēéěèīíǐìūúǔùǖǘǚǜ".charAt(i11 - 1));
        } else {
            int iIndexOf2 = str.indexOf("o");
            if (iIndexOf2 != -1) {
                sb2.setCharAt(iIndexOf2, "āáǎàōóǒòēéěèīíǐìūúǔùǖǘǚǜ".charAt(i11 + 3));
            } else {
                int iIndexOf3 = str.indexOf("e");
                if (iIndexOf3 != -1) {
                    sb2.setCharAt(iIndexOf3, "āáǎàōóǒòēéěèīíǐìūúǔùǖǘǚǜ".charAt(i11 + 7));
                } else {
                    int iIndexOf4 = str.indexOf("iu");
                    if (iIndexOf4 != -1) {
                        sb2.setCharAt(iIndexOf4 + 1, "āáǎàōóǒòēéěèīíǐìūúǔùǖǘǚǜ".charAt(i11 + 15));
                    } else {
                        int iIndexOf5 = str.indexOf(txBUGYhC.kqLJLqwhGahCHy);
                        if (iIndexOf5 != -1) {
                            sb2.setCharAt(iIndexOf5, "āáǎàōóǒòēéěèīíǐìūúǔùǖǘǚǜ".charAt(i11 + 11));
                        } else {
                            int iIndexOf6 = str.indexOf("u");
                            if (iIndexOf6 != -1) {
                                sb2.setCharAt(iIndexOf6, "āáǎàōóǒòēéěèīíǐìūúǔùǖǘǚǜ".charAt(i11 + 15));
                            } else {
                                int iIndexOf7 = str.indexOf("ü");
                                if (iIndexOf7 != -1) {
                                    sb2.setCharAt(iIndexOf7, "āáǎàōóǒòēéěèīíǐìūúǔùǖǘǚǜ".charAt(i11 + 19));
                                } else {
                                    int iIndexOf8 = str.indexOf("v");
                                    if (iIndexOf8 != -1) {
                                        sb2.setCharAt(iIndexOf8, "āáǎàōóǒòēéěèīíǐìūúǔùǖǘǚǜ".charAt(i11 + 19));
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return sb2.toString();
    }

    public static String g(long j11) {
        return h() + "-c-json-" + j11 + PQgum.OfmpNgDt;
    }
}
