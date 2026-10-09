package kv;

import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f38789a = ns.o.L("1. The Gojūon Chart", "2. Special Kana Forms", "3. Japanese Pitch Accent", "4. Romaji", "5. Vowel Devoicing", "6. Font Variations");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f38790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List f38791c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g f38792d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final g f38793e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final g f38794f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final List f38795g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final g f38796h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final g f38797i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final g f38798j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final g f38799k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final List f38800l;
    public static final ArrayList m;

    static {
        List listL = ns.o.L("あ", "い", "う", "え", "お");
        List listL2 = ns.o.L(new e(b("あ/ア/a", "い/イ/i", "う/ウ/u", "え/エ/e", "お/オ/o"), "あ"), new e(b("か/カ/ka", "き/キ/ki", "く/ク/ku", "け/ケ/ke", "こ/コ/ko"), "か"), new e(b("さ/サ/sa", "し/シ/shi", "す/ス/su", "せ/セ/se", "そ/ソ/so"), "さ"), new e(b("た/タ/ta", "ち/チ/chi", "つ/ツ/tsu", "て/テ/te", "と/ト/to"), "た"), new e(b("な/ナ/na", "に/ニ/ni", "ぬ/ヌ/nu", "ね/ネ/ne", "の/ノ/no"), "な"), new e(b("は/ハ/ha", "ひ/ヒ/hi", "ふ/フ/fu", "へ/ヘ/he", "ほ/ホ/ho"), "は"), new e(b("ま/マ/ma", "み/ミ/mi", "む/ム/mu", "め/メ/me", "も/モ/mo"), "ま"), new e(b("や/ヤ/ya", "-", "ゆ/ユ/yu", "-", "よ/ヨ/yo"), "や"), new e(b("ら/ラ/ra", "り/リ/ri", "る/ル/ru", "れ/レ/re", "ろ/ロ/ro"), "ら"), new e(b("わ/ワ/wa", "-", "-", "-", "を/ヲ/(w)o"), "わ"));
        f38790b = new d(listL, listL2, e("ん/ン/n"));
        f38791c = ns.o.L(new b("( k )", false, true, b("か/カ/ka", "き/キ/ki", "く/ク/ku", "け/ケ/ke", "こ/コ/ko")), new b("( g )", true, false, b("が/ガ/ga", "ぎ/ギ/gi", "ぐ/グ/gu", "げ/ゲ/ge", "ご/ゴ/go")), new b("( s )", false, true, b("さ/サ/sa", "し/シ/shi", "す/ス/su", "せ/セ/se", "そ/ソ/so")), new b("( z )", true, false, b("ざ/ザ/za", "じ/ジ/ji", "ず/ズ/zu", "ぜ/ゼ/ze", "ぞ/ゾ/zo")), new b("( t )", false, true, b("た/タ/ta", "ち/チ/chi", "つ/ツ/tsu", "て/テ/te", "と/ト/to")), new b("( d )", true, false, b("だ/ダ/da", "ぢ/ヂ/ji", "づ/ヅ/zu", "で/デ/de", "ど/ド/do")), new b("( h )", false, true, b("は/ハ/ha", "ひ/ヒ/hi", "ふ/フ/fu", "へ/ヘ/he", "ほ/ホ/ho")), new b("( b )", true, false, b("ば/バ/ba", "び/ビ/bi", "ぶ/ブ/bu", "べ/ベ/be", "ぼ/ボ/bo")), new b("( p )", true, false, b("ぱ/パ/pa", "ぴ/ピ/pi", "ぷ/プ/pu", "ぺ/ペ/pe", "ぽ/ポ/po")));
        f38792d = new g(ns.o.L(j("Japanese", "Romaji", "Meaning"), d("にほん", "ni ho n", "Japan"), d("せんせい", "se n se i", "teacher")));
        f38793e = new g(ns.o.L(j("Japanese", "Romaji", "Meaning"), d("おかあさん", "o ka a sa n", "mother"), d("コーヒー", "ko o hi i", "coffee")));
        f38794f = new g(ns.o.L(j("Japanese", "Romaji", "Meaning"), d("ざっし", "za s shi", "magazine"), d("きっぷ", "ki p pu", "ticket")));
        f38795g = ns.o.L(new a1("し", "shi", "や", "ya", "しゃ", "sha"), new a1("ち", "chi", "ゆ", "yu", "ちゅ", "chu"), new a1("び", "bi", "よ", "yo", "びょ", "byo"));
        f38796h = new g(ns.o.L(j("Kana", "Romaji", "Meaning"), f("はし", "ha shi", "chopsticks", "ha_shi1"), f("はし", "ha shi", "bridge", "ha_shi2"), f("あめ", "a me", "rain", "a_me1"), f("あめ", "a me", "candy", "a_me2")));
        f38797i = new g(ns.o.L(j("Kana", "Hepburn", "Kunrei-shiki"), g("し", "shi", "si"), g("ち", "chi", "ti"), g("つ", "tsu", "tu"), g("ふ", "fu", "hu"), g("しゃ", "sha", "sya")));
        f38798j = new g(ns.o.L(j("Japanese", "Kana", "Romaji", "Meaning"), c("学生", "がくせい", "ga ku se i", "student"), c("好き", "すき", "su ki", "like")));
        f38799k = new g(ns.o.L(j("Japanese", "Romaji"), new h(ns.o.L(new f(h("～です"), "～です", "de su"), new f(i("de su"), "de su", "de su"))), new h(ns.o.L(new f(h("～ます"), "～ます", "ma su"), new f(i("ma su"), "ma su", "ma su")))));
        f38800l = ns.o.L(new c(R.drawable.jp_font_variation_ki_1, R.drawable.jp_font_variation_ki_2, "ki"), new c(R.drawable.jp_font_variation_sa_1, R.drawable.jp_font_variation_sa_2, "sa"), new c(R.drawable.jp_font_variation_so_1, R.drawable.jp_font_variation_so_2, "so"), new c(R.drawable.jp_font_variation_ri_1, R.drawable.jp_font_variation_ri_2, "ri"));
        ArrayList arrayList = new ArrayList();
        Iterator it = listL2.iterator();
        while (it.hasNext()) {
            ArrayList arrayList2 = ((e) it.next()).f38728b;
            ArrayList arrayList3 = new ArrayList();
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList2.get(i11);
                i11++;
                String str = ((z0) obj).f38841d;
                if (str != null) {
                    arrayList3.add(str);
                }
            }
            ry.m.d0(arrayList, arrayList3);
        }
        String str2 = f38790b.f38724c.f38841d;
        List listK = str2 != null ? ns.o.K(str2) : ry.r.f50854a;
        List list = f38791c;
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ArrayList arrayList5 = ((b) it2.next()).f38712d;
            ArrayList arrayList6 = new ArrayList();
            int size2 = arrayList5.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj2 = arrayList5.get(i12);
                i12++;
                String str3 = ((z0) obj2).f38841d;
                if (str3 != null) {
                    arrayList6.add(str3);
                }
            }
            ry.m.d0(arrayList4, arrayList6);
        }
        ArrayList arrayListA = a(f38792d);
        ArrayList arrayListA2 = a(f38793e);
        ArrayList arrayListA3 = a(f38794f);
        List<a1> list2 = f38795g;
        ArrayList arrayList7 = new ArrayList();
        for (a1 a1Var : list2) {
            ry.m.d0(arrayList7, ns.o.L(a1Var.f38704b, a1Var.f38706d, a1Var.f38708f));
        }
        ArrayList arrayListX = ry.n.X(ns.o.L(arrayList, listK, arrayList4, arrayListA, arrayListA2, arrayListA3, arrayList7, a(f38796h), a(f38797i), a(f38798j), a(f38799k)));
        ArrayList arrayList8 = new ArrayList();
        int size3 = arrayListX.size();
        int i13 = 0;
        while (i13 < size3) {
            Object obj3 = arrayListX.get(i13);
            i13++;
            if (!oz.q.K0((String) obj3)) {
                arrayList8.add(obj3);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList9 = new ArrayList();
        int size4 = arrayList8.size();
        int i14 = 0;
        while (i14 < size4) {
            Object obj4 = arrayList8.get(i14);
            i14++;
            String str4 = "o";
            String strQ0 = oz.x.q0(oz.x.q0(oz.x.q0(oz.x.q0(oz.x.q0(oz.x.q0(oz.q.i1((String) obj4).toString(), " ", "_"), "ā", "a"), "ī", "i"), "ū", "u"), "ē", "e"), "ō", "o");
            if (!strQ0.equals("wo") && !strQ0.equals("(w)o")) {
                str4 = strQ0;
            }
            if (hashSet.add(str4)) {
                arrayList9.add(obj4);
            }
        }
        m = arrayList9;
    }

    public static ArrayList a(g gVar) {
        List list = gVar.f38742a;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            List list2 = ((h) it.next()).f38745a;
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                String str = ((f) it2.next()).f38735b;
                if (str != null) {
                    arrayList2.add(str);
                }
            }
            ry.m.d0(arrayList, arrayList2);
        }
        return arrayList;
    }

    public static ArrayList b(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(e(str));
        }
        return arrayList;
    }

    public static h c(String str, String str2, String str3, String str4) {
        return new h(ns.o.L(new f(str, str3, 4), new f(h(str2), str2, str3), new f(i(str3), str3, str3), new f(str4, (String) null, 6)));
    }

    public static h d(String str, String str2, String str3) {
        return new h(ns.o.L(new f(h(str), str, str2), new f(i(str2), str2, str2), new f(str3, (String) null, 6)));
    }

    public static z0 e(String str) {
        if (kotlin.jvm.internal.m.a(str, "-")) {
            return new z0(BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, null, true);
        }
        List listW0 = oz.q.W0(str, new String[]{"/"}, 0, 6);
        int size = listW0.size();
        Object obj = BuildConfig.VERSION_NAME;
        String str2 = (String) (2 < size ? listW0.get(2) : BuildConfig.VERSION_NAME);
        String str3 = (String) (listW0.size() > 0 ? listW0.get(0) : BuildConfig.VERSION_NAME);
        if (1 < listW0.size()) {
            obj = listW0.get(1);
        }
        return new z0(str3, (String) obj, str2, !oz.q.K0(str2) ? str2 : null, false);
    }

    public static h f(String str, String str2, String str3, String str4) {
        return new h(ns.o.L(new f(str, str4, 4), new f(str2, str4, 4), new f(str3, (String) null, 6)));
    }

    public static h g(String str, String str2, String str3) {
        return new h(ns.o.L(new f(str, str2, 4), new f(str2, str2, 4), new f(str3, str2, 4)));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static List h(String str) {
        switch (str.hashCode()) {
            case -1087760961:
                if (str.equals("おかあさん")) {
                    return ry.l.k0(new j[]{new j("お", false, null, 4), new j("か", true, null, 4), new j("あ", true, i.Primary), new j("さん", false, null, 4)});
                }
                return null;
            case 396052:
                if (str.equals("すき")) {
                    return ry.l.k0(new j[]{new j("す", true, null, 4), new j("き", false, null, 4)});
                }
                return null;
            case 12279169:
                if (str.equals("きっぷ")) {
                    return ry.l.k0(new j[]{new j("き", false, null, 4), new j("っ", true, i.Primary), new j("ぷ", false, null, 4)});
                }
                return null;
            case 12287786:
                if (str.equals("ざっし")) {
                    return ry.l.k0(new j[]{new j("ざ", false, null, 4), new j("っ", true, i.Primary), new j("し", false, null, 4)});
                }
                return null;
            case 12308771:
                if (str.equals("にほん")) {
                    return ry.l.k0(new j[]{new j("にほ", false, null, 4), new j("ん", true, i.Primary)});
                }
                return null;
            case 63220912:
                if (str.equals("～です")) {
                    return ry.l.k0(new j[]{new j("～で", false, null, 4), new j("す", true, null, 4)});
                }
                return null;
            case 63221625:
                if (str.equals("～ます")) {
                    return ry.l.k0(new j[]{new j("～ま", false, null, 4), new j("す", true, null, 4)});
                }
                return null;
            case 380616716:
                if (str.equals("がくせい")) {
                    return ry.l.k0(new j[]{new j("が", false, null, 4), new j("く", true, null, 4), new j("せい", false, null, 4)});
                }
                return null;
            case 381128929:
                if (str.equals("せんせい")) {
                    return ry.l.k0(new j[]{new j("せ", false, null, 4), new j("ん", true, i.Primary), new j("せい", false, null, 4)});
                }
                return null;
            case 383855315:
                if (str.equals("コーヒー")) {
                    j jVar = new j("コ", true, null, 4);
                    i iVar = i.Primary;
                    return ry.l.k0(new j[]{jVar, new j("ー", true, iVar), new j("ヒ", true, null, 4), new j("ー", true, iVar)});
                }
                return null;
            default:
                return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static List i(String str) {
        switch (str.hashCode()) {
            case -1316344044:
                if (str.equals("o ka a sa n")) {
                    return ry.l.k0(new j[]{new j("o ", false, null, 4), new j("k", true, null, 4), new j("a a", true, i.Primary), new j(" sa n", false, null, 4)});
                }
                return null;
            case -913587890:
                if (str.equals("za s shi")) {
                    return ry.l.k0(new j[]{new j("za ", false, null, 4), new j("s s", true, i.Primary), new j("hi", false, null, 4)});
                }
                return null;
            case -782369481:
                if (str.equals("ki p pu")) {
                    return ry.l.k0(new j[]{new j("ki ", false, null, 4), new j("p p", true, i.Primary), new j("u", false, null, 4)});
                }
                return null;
            case -251018213:
                if (str.equals("se n se i")) {
                    return ry.l.k0(new j[]{new j("se ", false, null, 4), new j("n ", true, i.Primary), new j("se i", false, null, 4)});
                }
                return null;
            case 95395425:
                if (str.equals("de su")) {
                    return ry.l.k0(new j[]{new j("de ", false, null, 4), new j("su", true, null, 4)});
                }
                return null;
            case 103587950:
                if (str.equals("ma su")) {
                    return ry.l.k0(new j[]{new j("ma ", false, null, 4), new j("su", true, null, 4)});
                }
                return null;
            case 109724636:
                if (str.equals("su ki")) {
                    return ry.l.k0(new j[]{new j("su", true, null, 4), new j(" ki", false, null, 4)});
                }
                return null;
            case 1501211083:
                if (str.equals("ga ku se i")) {
                    return ry.l.k0(new j[]{new j("ga ", false, null, 4), new j("ku", true, null, 4), new j(" se i", false, null, 4)});
                }
                return null;
            case 1600255063:
                if (str.equals("ko o hi i")) {
                    j jVar = new j("k", true, null, 4);
                    i iVar = i.Primary;
                    return ry.l.k0(new j[]{jVar, new j("o o", true, iVar), new j(" h", true, null, 4), new j("i i", true, iVar)});
                }
                return null;
            case 1879976666:
                if (str.equals("ni ho n")) {
                    return ry.l.k0(new j[]{new j("ni ho ", false, null, 4), new j("n", true, i.Primary)});
                }
                return null;
            default:
                return null;
        }
    }

    public static h j(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String input : strArr) {
            Pattern patternCompile = Pattern.compile("[a-z]+");
            kotlin.jvm.internal.m.e(patternCompile, "compile(...)");
            kotlin.jvm.internal.m.f(input, "input");
            arrayList.add(new f(input, patternCompile.matcher(input).matches() ? input : null, 4));
        }
        return new h(arrayList);
    }
}
