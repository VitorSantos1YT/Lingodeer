package fv;

import androidx.lifecycle.livedata.HeRS.DytezVyM;
import b7.e0;
import com.google.firebase.iid.QyE.SemtNwfPgIhi;
import com.lingodeer.data.env.Env;
import com.tbruyelle.rxpermissions3.BuildConfig;
import hh.p0;
import ko.Zea.ealNNtLp;
import kotlin.jvm.internal.m;
import nv.p;
import oz.x;
import pt.ImS.aYZzTH;
import qy.q;
import ry.l;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f28186a = com.bumptech.glide.d.v(new fk.a(10));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q f28187b = com.bumptech.glide.d.v(new fk.a(11));

    public static String B(long j11) {
        return g.n(j11, w().c(null, null) ? "m" : "f");
    }

    public static String C(long j11) {
        return g.o(j11, w().c(null, null) ? "m" : "f");
    }

    public static String D(long j11) {
        return g.p(j11, w().c(null, null) ? "m" : "f");
    }

    public static String E(long j11) {
        return g.q(j11, w().c(null, null) ? "m" : "f");
    }

    public static String F(long j11) {
        return g.r(j11, w().d(null, null) ? "m" : ealNNtLp.eqGbCKU);
    }

    public static String G(long j11, Long l9, Integer num) {
        String strM = defpackage.e.m(w().d(l9, num) ? xt.b.a().j() : xt.b.a().i(), g.r(j11, w().d(l9, num) ? "m" : "f"));
        return com.google.android.material.datepicker.d.D(strM) ? strM : defpackage.e.m(xt.b.a().h(), g.r(j11, w().d(null, null) ? "m" : "f"));
    }

    public static String H(long j11) {
        return g.b(j11, w().d(null, null) ? "m" : "f");
    }

    public static String I(long j11) {
        return p.r(g.l(), g.h(), "/main/lesson_natural_video/", g.s(j11));
    }

    public static String J(long j11) {
        return p.r(g.l(), g.h(), "/main/lesson_video_2/", g.t(j11));
    }

    public static String K(int i11) {
        return p0.h(i11, "story_png_", ".zip");
    }

    public static String L(int i11, int i12) {
        return M(i11) + "recorder_" + i12 + ".wav";
    }

    public static String M(int i11) {
        return xt.b.a().p() + "unit_" + i11 + "/";
    }

    public static String N(int i11, String str) {
        return xt.d.e(k().keyLanguage) + "_" + i11 + "_" + str + ".zip";
    }

    public static String O(int i11) {
        return "story_" + (w().f() ? "m" : "f") + "_" + i11 + ".zip";
    }

    public static String P(int i11) {
        return g.w(i11, w().f() ? "m" : "f");
    }

    public static String Q(long j11, long j12) {
        return g.x(j11, j12, w().e() ? "m" : "f");
    }

    public static String R(long j11, long j12) {
        String str = w().e() ? "m" : "f";
        String strL = g.l();
        String strH = g.h();
        String strX = g.x(j11, j12, str);
        StringBuilder sbQ = e0.q(strL, strH, "/main/travelphrase_", str, "/");
        sbQ.append(strX);
        return sbQ.toString();
    }

    public static String S(long j11) {
        StringBuilder sbM = com.google.android.material.datepicker.d.m(j11, "travelphrase-", w().e() ? "m" : "f", "-");
        sbM.append(".zip");
        return sbM.toString();
    }

    public static String T(long j11) {
        String str = w().e() ? "m" : "f";
        String strL = g.l();
        String strH = g.h();
        StringBuilder sbM = com.google.android.material.datepicker.d.m(j11, "travelphrase-", str, "-");
        sbM.append(".zip");
        String string = sbM.toString();
        StringBuilder sbQ = e0.q(strL, strH, "/z/travelphrase_", str, "/");
        sbQ.append(string);
        return sbQ.toString();
    }

    public static String U(long j11) {
        if (!xt.b.f56279a && !l.D(new Integer[0], Integer.valueOf(xt.b.b().keyLanguage))) {
            return p.r(g.l(), g.h(), "/main/lesson_animation/", g.y(j11));
        }
        return x.q0(xt.d.m(xt.b.b().keyLanguage), "AdminZG", "ShareMaterials") + "Lingo/Animation_JSON/" + g.y(j11) + "?t=" + System.currentTimeMillis();
    }

    public static String V(long j11) {
        return g.z(j11, w().d(null, null) ? "m" : "f");
    }

    public static String W(long j11) {
        return g.z(j11, "f");
    }

    public static String X(long j11) {
        return g.z(j11, "m");
    }

    public static String Y(long j11, Long l9, Integer num) {
        String strM = defpackage.e.m(w().d(l9, num) ? xt.b.a().j() : xt.b.a().i(), g.z(j11, w().d(l9, num) ? "m" : "f"));
        return com.google.android.material.datepicker.d.D(strM) ? strM : defpackage.e.m(xt.b.a().h(), g.z(j11, w().d(null, null) ? "m" : "f"));
    }

    public static String Z(long j11) {
        return g.c(j11, w().d(null, null) ? "m" : "f");
    }

    public static String a(String zhuyin, Long l9, Integer num) {
        String str;
        String strSubstring;
        m.f(zhuyin, "zhuyin");
        if (k().keyLanguage != 0 && k().keyLanguage != 11) {
            return g.f(w().c(l9, num) ? "m" : "f", zhuyin);
        }
        String str2 = w().c(l9, num) ? "m" : "f";
        String[] strArr = f.f28192b;
        int length = strArr.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                str = null;
                strSubstring = null;
                break;
            }
            if (oz.q.v0(zhuyin, strArr[i11], false)) {
                str = f.f28193c[i11];
                strSubstring = zhuyin.substring(0, oz.q.I0(zhuyin, strArr[i11], 0, false, 6));
                m.e(strSubstring, "substring(...)");
                break;
            }
            i11++;
        }
        if (strSubstring == null || str == null) {
            return ep.a.h("cn-", str2, "-zy-", zhuyin, x.q0(".mp3", " ", BuildConfig.VERSION_NAME));
        }
        String strQ0 = x.q0(".mp3", " ", BuildConfig.VERSION_NAME);
        StringBuilder sbS = defpackage.e.s("cn-", str2, "-zy-", strSubstring, str);
        sbS.append(strQ0);
        return sbS.toString();
    }

    public static String a0(long j11) {
        return g.c(j11, "f");
    }

    public static String b(String zhuyin) {
        m.f(zhuyin, "zhuyin");
        return c(zhuyin, null, null);
    }

    public static String b0(long j11) {
        return g.c(j11, "m");
    }

    public static String c(String zhuyin, Long l9, Integer num) {
        m.f(zhuyin, "zhuyin");
        boolean zC = w().c(l9, num);
        String strA = a(zhuyin, l9, num);
        xt.a aVarA = xt.b.a();
        return defpackage.e.m(zC ? aVarA.d() : aVarA.c(), strA);
    }

    public static String c0(long j11) {
        return g.A(j11);
    }

    public static String d(String audioName) {
        m.f(audioName, "audioName");
        return defpackage.e.m(xt.b.a().b(), audioName);
    }

    public static String d0(long j11) {
        return p.r(g.l(), g.h(), "/main/lesson_natural_video/", g.A(j11));
    }

    public static String e(String zhuyin) {
        m.f(zhuyin, "zhuyin");
        String str = w().c(null, null) ? "m" : "f";
        if (!xt.b.f56279a && !l.D(new Integer[0], Integer.valueOf(xt.b.b().keyLanguage))) {
            String strL = g.l();
            String strQ0 = x.q0(g.h(), "up", BuildConfig.VERSION_NAME);
            String strF = g.f(str, zhuyin);
            StringBuilder sbQ = e0.q(strL, strQ0, "/main/alpha_", str, "/");
            sbQ.append(strF);
            return sbQ.toString();
        }
        return x.q0(xt.d.m(xt.b.b().keyLanguage), "AdminZG", "ShareMaterials") + "Lingo/zy_f/" + g.f(str, zhuyin) + "?t=" + System.currentTimeMillis();
    }

    public static String e0(long j11, String mainPic) {
        m.f(mainPic, "mainPic");
        return g.h() + "-p-" + j11 + "-" + mainPic;
    }

    public static String f(long j11) {
        return "alpha_" + (w().d(null, null) ? "m" : "f") + "_" + j11 + ".zip";
    }

    public static String f0(long j11, String str) {
        return defpackage.e.m(xt.b.a().k(), e0(j11, str));
    }

    public static String g(long j11) {
        return p.m(j11, "alpha_f_", ".zip");
    }

    public static String g0(long j11, String mainPic) {
        m.f(mainPic, "mainPic");
        if (!xt.b.f56279a && !l.D(new Integer[0], Integer.valueOf(xt.b.b().keyLanguage))) {
            StringBuilder sbQ = e0.q(g.l(), g.h(), "/main/lesson_png/", g.h(), "-p-");
            sbQ.append(j11);
            sbQ.append("-");
            sbQ.append(mainPic);
            return sbQ.toString();
        }
        String strQ0 = x.q0(xt.d.m(xt.b.b().keyLanguage), "AdminZG", "ShareMaterials");
        String strH = g.h();
        long jCurrentTimeMillis = System.currentTimeMillis();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(strQ0);
        sb2.append("Lingo/Word/");
        sb2.append(strH);
        sb2.append("-p-");
        e0.w(j11, "-", mainPic, sb2);
        sb2.append("?t=");
        sb2.append(jCurrentTimeMillis);
        return sb2.toString();
    }

    public static String h(long j11) {
        return p.m(j11, "alpha_m_", ".zip");
    }

    public static String h0(long j11) {
        return g.B(j11);
    }

    public static String i(long j11) {
        return g.e(j11, w().d(null, null) ? "m" : "f");
    }

    public static String i0(long j11) {
        return p.r(g.l(), g.h(), "/main/lesson_video_2/", g.B(j11));
    }

    public static String j(long j11) {
        if (!xt.b.f56279a) {
            return p.r(g.l(), g.h(), "/main/lesson_animation/", g.g(j11));
        }
        return x.q0(xt.d.m(xt.b.b().keyLanguage), "AdminZG", "ShareMaterials") + "Lingo/Animation_JSON/" + g.g(j11) + "?t=" + System.currentTimeMillis();
    }

    public static Env k() {
        return (Env) f28186a.getValue();
    }

    public static String k0(String zhuyin) {
        m.f(zhuyin, "zhuyin");
        String str = w().d(null, null) ? "m" : "f";
        String strL = g.l();
        String strH = g.h();
        String strC = g.C(str, zhuyin);
        StringBuilder sbQ = e0.q(strL, strH, "/main/alpha_", str, "/");
        sbQ.append(strC);
        return sbQ.toString();
    }

    public static String l(String zhuyin) {
        m.f(zhuyin, "zhuyin");
        return w4.c.h(xt.b.a().b(), x.q0(g.h(), "up", BuildConfig.VERSION_NAME), "-f-newalphabet-", zhuyin, ".mp3");
    }

    public static String l0(String zhuyin) {
        m.f(zhuyin, "zhuyin");
        return defpackage.e.m(xt.b.a().g(), j0(zhuyin));
    }

    public static String m() {
        return defpackage.e.m(xt.b.a().e(), "/database/");
    }

    public static String n(long j11) {
        StringBuilder sbM = com.google.android.material.datepicker.d.m(j11, "lesson_", w().d(null, null) ? "m" : "f", "_");
        sbM.append(".zip");
        return sbM.toString();
    }

    public static String o(long j11) {
        return p.m(j11, "lesson_f_", ".zip");
    }

    public static String p(long j11) {
        return p.m(j11, "lesson_m_", ".zip");
    }

    public static String q(long j11) {
        return g.j(j11, w().d(null, null) ? "m" : "f");
    }

    public static String s(long j11) {
        return p.m(j11, "lesson_png_", ".zip");
    }

    public static String t(long j11) {
        return p.r(g.l(), g.h(), "/z/lesson_video_2/", p.m(j11, "lesson_video_", ".zip"));
    }

    public static String u(long j11) {
        return p.m(j11, "lesson_video_", ".zip");
    }

    public static String v() {
        return p.r(xt.d.e(xt.b.b().keyLanguage), "_", w().d(null, null) ? "m" : "f", "_lip_sync_data.z");
    }

    public static xt.q w() {
        return (xt.q) f28187b.getValue();
    }

    public static String x(long j11, Long l9, Integer num) {
        boolean zD = w().d(l9, num);
        String strM = g.m(j11, w().d(l9, num) ? "m" : "f");
        xt.a aVarA = xt.b.a();
        return defpackage.e.m(zD ? aVarA.j() : aVarA.i(), strM);
    }

    public static String y(long j11) {
        return g.a(j11, w().d(null, null) ? "m" : "f");
    }

    public static String z(long j11) {
        return g.a(j11, "f");
    }

    public static String A(long j11) {
        return g.a(j11, DytezVyM.WZTzegSOyjccFRq);
    }

    public static String j0(String zhuyin) {
        m.f(zhuyin, "zhuyin");
        if (k().keyLanguage == 0 || k().keyLanguage == 11) {
            return f.b(zhuyin);
        }
        return g.C(w().d(null, null) ? "m" : SemtNwfPgIhi.gPsjdwjruy, zhuyin);
    }

    public static String r(long j11) {
        return p.r(g.l(), g.h(), "/z/lesson_natural_video/", p.m(j11, "lesson_video_", aYZzTH.zKvrH));
    }
}
