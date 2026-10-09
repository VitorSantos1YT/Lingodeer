package fv;

import a.ar.MFeWs;
import androidx.lifecycle.viewmodel.compose.NP.IMCc;
import bw.ORXQ.ADSb;
import com.adjust.sdk.Constants;
import com.google.zxing.aztec.detector.zTGP.gkbGsXmgaxRjJ;
import com.lingo.lingoskill.http.oss.MYmT.bjXGJ;
import com.lingo.lingoskill.ruskill.ui.learn.mr.OCBJEWZHh;
import com.stkouyu.util.CommandUtil;
import com.tbruyelle.rxpermissions3.BuildConfig;
import dl.ExOZ.xItStCyvVEZ;
import dt.Xk.wuoM;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import kotlin.jvm.internal.m;
import l0.Eeqr.HOBXIlHxIkMBEA;
import nv.p;
import okhttp3.internal.platform.ZjS.OYAvlbfUyD;
import oz.x;
import pt.ImS.aYZzTH;
import qy.l;
import qy.q;
import sz.xej.iFLeRCXvYCGdPW;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f28191a = com.bumptech.glide.d.v(new fk.a(12));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f28192b = {"āng", "áng", "ǎng", "àng", "ēng", "éng", "ěng", "èng", "īng", "íng", "ǐng", "ìng", "ōng", "óng", "ǒng", "òng", "āi", "ái", "ǎi", "ài", "ēi", "éi", "ěi", "èi", "uī", "uí", "uǐ", "uì", "āo", "áo", "ǎo", "ào", "ōu", "óu", "ǒu", "òu", "iū", "iú", "iǔ", "iù", "iē", "ié", "iě", "iè", "uē", "ué", "uě", "uè", "ēr", "ér", "ěr", "èr", "ān", "án", "ǎn", "àn", "ēn", "én", "ěn", "èn", "īn", "ín", "ǐn", "ìn", "ūn", "ún", "ǔn", "ùn", "ǖn", "ǘn", "ǚn", "ǜn", "ā", "á", "ǎ", "à", "ō", "ó", "ǒ", "ò", "ē", "é", "ě", "è", "ī", "í", "ǐ", "ì", "ū", "ú", "ǔ", "ù", "ǖ", "ǘ", "ǚ", "ǜ"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f28193c = {"ang1", "ang2", "ang3", "ang4", "eng1", "eng2", "eng3", "eng4", "ing1", "ing2", "ing3", "ing4", "ong1", "ong2", "ong3", "ong4", "ai1", "ai2", "ai3", "ai4", "ei1", "ei2", "ei3", "ei4", "ui1", "ui2", "ui3", "ui4", "ao1", "ao2", "ao3", "ao4", "ou1", "ou2", "ou3", "ou4", "iu1", "iu2", "iu3", "iu4", "ie1", "ie2", "ie3", "ie4", "ue1", "ue2", "ue3", "ue4", "er1", "er2", "er3", "er4", "an1", "an2", "an3", "an4", "en1", "en2", "en3", "en4", "in1", "in2", "in3", "in4", "un1", "un2", "un3", "un4", "vn1", "vn2", "vn3 ", "vn4", "a1", "a2", "a3", "a4", "o1", "o2", "o3", "o4", "e1", "e2", "e3", "e4", "i1", "i2", "i3", "i4", "u1", "u2", "u3", "u4", "v1", "v2", "v3", "v4"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f28194d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String[] f28195e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String[] f28196f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String[][] f28197g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String[][] f28198h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final HashSet f28199i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final HashSet f28200j;

    public static String a(int i11, String sm2, String ym2) {
        m.f(sm2, "sm");
        m.f(ym2, "ym");
        String strP0 = x.p0(m(i11, sm2, ym2), (char) 252, 'v');
        if (strP0.equals("er1")) {
            strP0 = "er";
        }
        return ep.a.h("cn-", h().c(null, null) ? "m" : "f", "-zy-", strP0, x.q0(".mp3", " ", BuildConfig.VERSION_NAME));
    }

    public static String b(String pinyin) {
        String strSubstring;
        String str;
        m.f(pinyin, "pinyin");
        String[] strArr = f28192b;
        int length = strArr.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                strSubstring = null;
                str = null;
                break;
            }
            if (oz.q.v0(pinyin, strArr[i11], false)) {
                str = f28193c[i11];
                strSubstring = pinyin.substring(0, oz.q.I0(pinyin, strArr[i11], 0, false, 6));
                m.e(strSubstring, "substring(...)");
                break;
            }
            i11++;
        }
        if (strSubstring == null || str == null) {
            return ep.a.h("cn-", h().c(null, null) ? "m" : "f", "-zy-", pinyin, x.q0(".mp3", " ", BuildConfig.VERSION_NAME));
        }
        String str2 = h().c(null, null) ? "m" : "f";
        String strQ0 = x.q0(".mp3", " ", BuildConfig.VERSION_NAME);
        StringBuilder sbS = defpackage.e.s("cn-", str2, "-zy-", strSubstring, str);
        sbS.append(strQ0);
        return sbS.toString();
    }

    public static String d(String sm2) {
        m.f(sm2, "sm");
        return ep.a.h("cn-", h().c(null, null) ? "m" : "f", "-zy-", sm2, x.q0(".mp3", " ", BuildConfig.VERSION_NAME));
    }

    public static String e(String str) {
        return defpackage.e.n("https://res.lingodeer.com/mfsource/cn/main/alpha_", h().c(null, null) ? "m" : "f", "/", d(str));
    }

    public static String f(int i11, String ym2) {
        m.f(ym2, "ym");
        String strQ0 = x.q0(ym2, "ü", "v");
        if (strQ0.equals("ue")) {
            strQ0 = "ve";
        }
        if (i11 == 0) {
            return ep.a.h("cn-", h().c(null, null) ? "m" : "f", "-zy-", strQ0, x.q0(".mp3", " ", BuildConfig.VERSION_NAME));
        }
        return "cn-" + (h().c(null, null) ? "m" : "f") + "-zy-" + strQ0 + i11 + x.q0(".mp3", " ", BuildConfig.VERSION_NAME);
    }

    public static String g(int i11, String str) {
        return defpackage.e.n("https://res.lingodeer.com/mfsource/cn/main/alpha_", h().c(null, null) ? "m" : "f", "/", f(i11, str));
    }

    public static xt.q h() {
        return (xt.q) f28191a.getValue();
    }

    public static String i(String pinyin) {
        m.f(pinyin, "pinyin");
        return defpackage.e.n("https://res.lingodeer.com/mfsource/cn/main/alpha_", h().c(null, null) ? "m" : "f", "/", b(pinyin));
    }

    public static l j(String str, String str2) {
        if (m.a(str, "-")) {
            str = BuildConfig.VERSION_NAME;
        }
        int iHashCode = str.hashCode();
        if (iHashCode == 106 ? str.equals("j") : !(iHashCode == 113 ? !str.equals("q") : !(iHashCode == 120 ? str.equals("x") : iHashCode == 121 && str.equals("y")))) {
            if (x.s0(str2, "u", false)) {
                str2 = x.q0(str2, "u", "ü");
            }
        }
        if (!f28200j.contains(str + str2)) {
            throw new IllegalArgumentException(ep.a.g("Error combination: ", str, str2));
        }
        if (str.equals("y")) {
            str2 = x.p0(str2, (char) 252, 'u');
        } else if (str.equals("w") && str2.length() > 1) {
            str2 = x.q0(str2, "u", BuildConfig.VERSION_NAME);
        }
        if (str.equals(BuildConfig.VERSION_NAME)) {
            if (str2.equals("iu")) {
                str2 = BuildConfig.VERSION_NAME;
            }
            if (str2.equals("i")) {
                str2 = BuildConfig.VERSION_NAME;
            }
            if (str2.equals("in")) {
                str2 = BuildConfig.VERSION_NAME;
            }
            if (str2.equals("ing")) {
                str2 = BuildConfig.VERSION_NAME;
            }
            for (int i11 = 0; i11 < 6; i11++) {
                if (str2.equals(g.f28201a[i11])) {
                    str2 = BuildConfig.VERSION_NAME;
                }
            }
            if (str2.equals("u")) {
                str2 = BuildConfig.VERSION_NAME;
            }
            for (int i12 = 0; i12 < 9; i12++) {
                if (str2.equals(g.f28203c[i12])) {
                    str2 = BuildConfig.VERSION_NAME;
                }
            }
            if (str2.equals("ü")) {
                str2 = BuildConfig.VERSION_NAME;
            }
            for (int i13 = 0; i13 < 4; i13++) {
                if (str2.equals(g.f28202b[i13])) {
                    str2 = BuildConfig.VERSION_NAME;
                }
            }
        }
        if (str.equals("j") || str.equals("q") || str.equals("x")) {
            str2 = str2.replace("ü", "u");
        }
        if (str2.equals("uen")) {
            str2 = "un";
        }
        if (str2.equals("uei")) {
            str2 = "ui";
        }
        return new l(str, str2);
    }

    public static String k(String sm2, String ym2) {
        m.f(sm2, "sm");
        m.f(ym2, "ym");
        if (sm2.equals("-")) {
            sm2 = BuildConfig.VERSION_NAME;
        }
        return sm2.concat(ym2);
    }

    public static String l(int i11, String sm2, String ym2) {
        m.f(sm2, "sm");
        m.f(ym2, "ym");
        if (sm2.equals("-")) {
            sm2 = BuildConfig.VERSION_NAME;
        }
        if (f28199i.contains(m(i11, sm2, ym2))) {
            return BuildConfig.VERSION_NAME;
        }
        l lVarJ = j(sm2, ym2);
        String str = (String) lVarJ.f48495a;
        String ym3 = (String) lVarJ.f48496b;
        if (i11 == 0) {
            return defpackage.e.m(str, ym3);
        }
        m.f(ym3, "ym");
        String strE = g.E(i11, ym3);
        m.e(strE, "yunmuVariationWithTone(...)");
        return defpackage.e.m(str, strE);
    }

    public static String m(int i11, String sm2, String ym2) {
        m.f(sm2, "sm");
        m.f(ym2, "ym");
        l lVarJ = j(sm2, ym2);
        String str = (String) lVarJ.f48495a;
        String str2 = (String) lVarJ.f48496b;
        return i11 == 0 ? defpackage.e.m(str, str2) : p.k(i11, str, str2);
    }

    static {
        String str = HOBXIlHxIkMBEA.xhmQqYWZZFGhre;
        String[] strArr = {"a", str, "an", "ang", "ao", "i", "ia", "ian", "iang", "iao", "ie", "iong", "iu", "in", "ing", "u", "ua", "uai", "uan", "uang", "uei", "uen", "ueng", "uo", "ü", "üe", "üan", "ün", "ba", "bai", "ban", "bang", "bao", "bi", "bian", "biao", "bie", "bin", "bing", "bu", "bei", "ben", "beng", "bo", "ca", "cai", "can", "cang", "cao", "ce", "cen", "ceng", "cha", "chai", "chan", "chang", "chao", "che", "chen", "cheng", "chi", "chong", "chou", "chu", "chua", "chuai", "chuan", "chuang", "chuei", "chuen", "chuo", "ci", "cong", "cou", "cu", "cuan", "cuei", "cuen", "cuo", "da", "dai", "dan", "dang", "dao", "de", "dei", "den", "deng", "di", "dia", "dian", "diao", "die", "ding", "diu", "dong", "dou", "du", "duan", "duei", "duen", "duo", "e", "en", "eng", "er", "fa", "fan", "fang", "fei", "fen", "feng", "fo", "fou", "fu", "ga", "gai", "gan", "gang", "gao", "ge", "gei", "gen", "geng", "gong", "gou", "gu", "gua", "guai", "guan", "guang", "guei", "guen", "guo", "ha", "hai", "han", "hang", "hao", "he", "hei", "hen", "heng", "hong", "hou", "hu", "hua", "huai", "huan", "huang", "huei", "huen", "huo", "ji", "jia", "jian", "jiang", "jiao", "jie", "jin", "jing", "jiong", "jiu", "jü", "jüan", "jüe", "jün", "ka", OYAvlbfUyD.QwdSlVgETgLvNLJ, "kan", "kang", IMCc.ubv, "ke", "kei", "ken", "keng", "kong", "kou", "ku", "kua", "kuai", "kuan", "kuang", "kuei", "kuen", "kuo", "la", "lai", "lan", "lang", "lao", "le", "lei", "leng", "li", "lia", "lian", "liang", "liao", "lie", "lin", "ling", OCBJEWZHh.luUrAVbmvks, Constants.LONG, "lou", "lu", "luan", "lüe", "luen", "luo", "lü", "ma", "mai", "man", "mang", "mao", "mei", "men", "meng", "mi", "mian", "miao", "mie", "min", "ming", iFLeRCXvYCGdPW.gumutQtqXAbbNd, "mo", "mou", "mu", "na", bjXGJ.BVRz, "nan", "nang", "nao", "ne", "nei", "nen", "neng", "ni", "nian", "niang", "niao", "nie", "nin", "ning", "niu", "nong", "nou", "nu", "nuan", "nue", "nuen", "nuo", "nü", "o", "ou", "pa", "pai", "pan", "pang", "pao", "pei", "pen", "peng", "pi", "pian", "piao", "pie", "pin", "ping", "po", "pou", "pu", "qi", "qia", "qian", "qiang", "qiao", "qie", "qin", "qing", "qiong", "qiu", "qü", "qüan", "qüe", "qün", "ran", "rang", "rao", "re", "ren", "reng", "ri", "rong", "rou", "ru", "ruan", "ruei", "ruen", "ruo", "sa", "sai", "san", "sang", "sao", "se", "sen", "seng", "si", "song", "sou", "su", "suan", "suei", "suen", "suo", "sha", "shai", "shan", "shang", "shao", "she", "shen", "sheng", "shi", "shou", "shu", "shua", "shuai", "shuan", "shuang", "shuei", "shuen", "shuo", "ta", "tai", "tan", "tang", "tao", "te", "tei", "teng", "ti", "tian", "tiao", "tie", "ting", "tong", "tou", "tu", "tuan", "tuei", "tuen", "tuo", "wa", "wai", "wan", "wang", "wei", "wen", "weng", "wo", "wu", "xi", "xia", "xian", "xiang", "xiao", "xie", "xin", "xing", "xiong", "xiu", "xü", "xüan", "xüe", "xün", "ya", "yan", "yang", "yao", "ye", "yi", "yin", "ying", "yong", "you", "yü", "yüan", "yüe", "yün", "za", "zai", "zan", "zang", "zao", "ze", "zen", "zeng", "zha", "zhai", "zhan", "zhang", "zhao", "zhe", "zhei", wuoM.sQOImIUyYZD, "zheng", "zhi", "zhong", "zhou", "zhu", "zhua", "zhuai", "zhuan", "zhuang", "zhuei", "zhuen", "zhuo", "zi", "zong", "zou", "zu", "zuan", "zuei", "zuen", "zuo"};
        f28194d = new String[]{"-", "b", "p", "m", "f", "d", "t", "n", "l", "g", "k", "h", "j", "q", "x", "zh", "ch", CommandUtil.COMMAND_SH, "r", "z", "c", "s", "y", "w"};
        f28195e = new String[]{"zh", "ch", CommandUtil.COMMAND_SH, "b", "p", "m", "f", "d", "t", "n", IMCc.BbtgF, "g", "k", "h", "j", "q", "x", "r", "z", "c", "s", "y", "w"};
        f28196f = new String[]{"a", "ai", "an", "ang", "ao", "i", "ia", "ian", "iang", "iao", "ie", "iong", "iu", "in", "ing", "u", "ua", "uai", "uan", "uang", "ui", "un", "ueng", "uo", "e", "ei", "en", "eng", "er", "o", "ou", "ong", "v", "ve", "van", "vn"};
        f28197g = new String[][]{new String[]{"-"}, new String[]{"b", "p", "m", "f"}, new String[]{"d", "t", "n", "l"}, new String[]{"g", "k", "h"}, new String[]{"j", "q", "x"}, new String[]{"zh", "ch", CommandUtil.COMMAND_SH, "r"}, new String[]{"z", "c", "s", "y", "w"}};
        f28198h = new String[][]{new String[]{"a", str, "an", "ang", "ao"}, new String[]{"i", "ia", "ian", "iang", "iao", IMCc.fuoruxCNSN, "iong", "iu", "in", "ing"}, new String[]{"u", "ua", "uai", "uan", "uang", "uei", "uen", "ueng", "uo"}, new String[]{"e", "ei", "en", "eng", "er"}, new String[]{"o", "ou", "ong"}, new String[]{"ü", "üe", "üan", "ün"}};
        HashSet hashSet = new HashSet();
        f28199i = hashSet;
        HashSet hashSet2 = new HashSet();
        f28200j = hashSet2;
        Collections.addAll(hashSet, Arrays.copyOf(new String[]{"ang3", "ban2", "bang2", "bei2", "ben2", "bian2", "biao2", "bin2", "bin3", "bing2", "ca2", "ca4", "cang3", "cang4", "ce1", "ce2", "ce3", "cei2", "cei3", "cei1", "cei4", "cen3", "cen4", "ceng3", "che2", "chua2", "chua3", "chua4", "chui3", "chui4", "chun4", "chuo2", "chuo3", "cong3", "cong4", "cou1", "cou2", "cou3", "cu3", "cuan3", "cui2", "dai2", "dan2", "dang2", "de3", "de4", "dei2", "dei4", "den1", "deng2", "den2", "den3", "dia1", "dia2", "dia4", "dian2", "diao2", "die3", "die4", "ding2", "diu2", "diu3", "diu4", "dong2", "dou2", "duan2", "dui2", "dui3", "dun2", "en2", "en3", "eng2", "eng3", "eng4", "fo1", "fo3", "fo4", "fou1", "fou2", "fou4", "gai2", "gan2", "gang2", "gao2", "gei1", "gei2", "gei4", "geng2", "gong2", "gou2", "gu2", "gua2", "guai2", "guan2", "guang2", "gui2", "gun1", "gun2", "hang3", "he3", "hei2", "hei3", "hei4", "hen1", "heng3", "hua3", "huai1", "huai3", "hun3", "jian2", "jiang2", "jin2", "jing2", "jiong2", "jiong4", "jiu2", "juan2", "jun2", "jun3", "jue3", "ka2", "ka4", "kai2", "kan2", "kang3", "kao2", "kei2", "kei3", "kei4", "ken1", "ken2", "keng2", "keng3", "keng4", "kong2", "kou2", "ku2", "kua2", gkbGsXmgaxRjJ.QnZJwjzBr, "kuai2", "kuan2", "kuan4", "kun2", "kuo1", "kuo2", "kuo3", "lai1", "lai3", "lan1", "le1", "le2", "le3", "lia1", "lia2", "lia4", "lian1", "liang1", "lie2", "ling1", "long1", "long4", "luan1", "lue1", "lue2", "lue3", "lü1", "lüe1", "lüe2", "lüe3", "mai1", "mang4", "mei1", "men3", "mian1", "mie2", "mie3", "min1", "min4", "ming1", "miu1", "miu2", "miu3", "mou4", "mu1", "nai1", "nai2", "ne1", "ne3", "nei1", "nei2", "nen1", "nen2", "nen3", "neng1", "neng4", "neng3", "niang1", "niang3", "niao1", "niao2", "nie3", "nin1", "nin3", "nin4", "ning1", "nong1", "nong3", "nou1", "nou2", "nou3", "nu1", "nuan1", "nuan2", "nuan4", "nue1", "nue2", "nue3", "nun1", "nun3", "nun4", "nuo1", "nuo3", "nü1", "nü2", "nü4", "pa3", "pan3", "pei3", "pen3", "pie2", "ping3", "ping4", "pou4", "qiong1", "qiong3", "qiong4", "qiu4", "que3", "qun3", "qun4", "ran1", "ran4", "rao1", "re1", "re2", "ren1", "reng3", "reng4", "ri1", aYZzTH.EVpeEK, "ri3", xItStCyvVEZ.hQKE, "rong4", "rou1", "ru1", "rua1", "rua2", "rua3", ADSb.dMbDHtTsn, "ruan1", "ruan4", "rui1", "run1", "run2", "run3", "ruo1", "ruo2", "ruo3", "sa2", "sai2", "sai3", "san2", "sen3", "sen4", "sang2", "sao2", "se1", "se2", "se3", "sen2", "seng2", "seng3", "seng4", "shai2", "shai3", "shan2", "shang2", "shua2", "shuai2", "shuan2", "shuan3", "shuang2", "shuang4", "shui1", "shun1", "shun2", "shuo2", "shuo3", "si2", "sou2", "su3", "suan2", "suan3", "sun2", "sun4", "suo2", "suo4", "ta2", "te1", "te2", "te3", "tei2", "tei3", "tei4", "teng3", "teng4", "tie2", "tiu1", "tiu2", "tiu3", "tiu4", "tui1", "weng3", "wo2", "xia3", "xiong3", "xiu2", "xun3", "yue2", "za4", "zai2", "zang2", "ze1", "ze3", "zei1", "zei3", "zei4", "zen1", "zen2", "zeng2", "zeng3", "zhan2", "zhang2", "zhei1", "zhei2", "zhei3", "zhen2", "zheng2", "zhong2", "zhua2", "zhua4", "zhuai2", "zhuan2", "zhuang2", "zhui3", "zhui4", "zhun2", "zhun4", "zhuo3", "zhuo4", "zi2", "zong2", "zou2", "zu4", "zuan2", "zui2", "zun2"}, 367));
        Collections.addAll(hashSet2, Arrays.copyOf(strArr, 428));
    }

    public static String c(int i11, String sm2, String ym2) {
        m.f(sm2, "sm");
        m.f(ym2, "ym");
        return defpackage.e.n("https://res.lingodeer.com/mfsource/cn/main/alpha_", h().c(null, null) ? MFeWs.kDzTE : "f", "/", a(i11, sm2, ym2));
    }
}
