package pt;

import android.net.Uri;
import com.lingodeer.data.model.CourseWord;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import ns.o;
import oz.q;
import ry.l;
import ry.m;
import ry.n;
import ry.r;
import ry.x;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f47148a;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet(x.W(92));
        l.h0(new String[]{"きゃ", "きゅ", "きょ", "しゃ", "しゅ", "しょ", "ちゃ", "ちゅ", "ちょ", "にゃ", "にゅ", "にょ", "ひゃ", "ひゅ", "ひょ", "みゃ", "みゅ", "みょ", "りゃ", "りゅ", "りょ", "ぎゃ", "ぎゅ", "ぎょ", "じゃ", "じゅ", "じょ", "びゃ", "びゅ", "びょ", "ぴゃ", "ぴゅ", "ぴょ", "でぃ", "ディ", "ふぇ", "フェ", "ふぃ", "フィ", "ふぁ", "ファ", "ウィ", "ウェ", "ウォ", "ヴァ", "ヴィ", "ヴ", "ヴェ", "ヴォ", "キャ", "キュ", "キョ", "ギャ", "ギュ", "ギョ", "シャ", "シュ", "ショ", "ジャ", "ジュ", "ジョ", "チャ", "チュ", "チョ", "ニャ", "ニュ", "ニョ", "ヒャ", "ヒュ", "ヒョ", "ビャ", "ビュ", "ビョ", "ピャ", "ピュ", "ピョ", "ミャ", "ミュ", "ミョ", "リャ", "リュ", "リョ", "ディ", "ファ", "フィ", "フェ", "フォ", "ティ", "うぇ", "ウェ", "てぃ", "てぃ"}, linkedHashSet);
        f47148a = m.S0(m.a1(linkedHashSet), new gu.g(16));
    }

    public static final String a(CourseWord courseWord) {
        Iterable<h> iterable;
        int length;
        Object next;
        int iI0;
        kotlin.jvm.internal.m.f(courseWord, "<this>");
        String word = courseWord.getWord();
        String zhuYin = courseWord.getZhuYin();
        for (int i11 = 0; i11 < word.length(); i11++) {
            char cCharAt = word.charAt(i11);
            if (12448 <= cCharAt && cCharAt < 12544) {
                if (zhuYin.length() == 0) {
                    return zhuYin;
                }
                if (word.length() == 0) {
                    iterable = r.f50854a;
                } else {
                    ArrayList arrayList = new ArrayList();
                    StringBuilder sb2 = new StringBuilder();
                    char cCharAt2 = word.charAt(0);
                    i iVar = (12448 > cCharAt2 || cCharAt2 >= 12544) ? (12352 > cCharAt2 || cCharAt2 >= 12448) ? i.Other : i.Hiragana : i.Katakana;
                    for (int i12 = 0; i12 < word.length(); i12++) {
                        char cCharAt3 = word.charAt(i12);
                        i iVar2 = (12448 > cCharAt3 || cCharAt3 >= 12544) ? (12352 > cCharAt3 || cCharAt3 >= 12448) ? i.Other : i.Hiragana : i.Katakana;
                        if (iVar2 != iVar && sb2.length() > 0) {
                            String string = sb2.toString();
                            kotlin.jvm.internal.m.e(string, "toString(...)");
                            arrayList.add(new h(string, iVar));
                            sb2.setLength(0);
                            iVar = iVar2;
                        }
                        sb2.append(cCharAt3);
                    }
                    if (sb2.length() > 0) {
                        String string2 = sb2.toString();
                        kotlin.jvm.internal.m.e(string2, "toString(...)");
                        arrayList.add(new h(string2, iVar));
                    }
                    iterable = arrayList;
                }
                StringBuilder sb3 = new StringBuilder();
                int i13 = 0;
                int i14 = 0;
                for (h hVar : iterable) {
                    i14++;
                    i iVar3 = hVar.f47150b;
                    String str = hVar.f47149a;
                    int i15 = f.f47147a[iVar3.ordinal()];
                    if (i15 == 1) {
                        String strG = g(str);
                        if (!oz.x.r0(i13, zhuYin, strG, false)) {
                            return zhuYin;
                        }
                        sb3.append(str);
                        length = strG.length();
                    } else if (i15 != 2) {
                        if (i15 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        Iterator it = m.k0(iterable, i14).iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (((h) next).f47150b == i.Other);
                        h hVar2 = (h) next;
                        if (hVar2 == null) {
                            iI0 = zhuYin.length();
                        } else {
                            String strG2 = hVar2.f47149a;
                            int i16 = f.f47147a[hVar2.f47150b.ordinal()];
                            if (i16 == 1) {
                                strG2 = g(strG2);
                            } else if (i16 != 2) {
                                if (i16 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                strG2 = BuildConfig.VERSION_NAME;
                            }
                            iI0 = q.I0(zhuYin, strG2, i13, false, 4);
                        }
                        if (iI0 < i13) {
                            break;
                        }
                        String strSubstring = zhuYin.substring(i13, iI0);
                        kotlin.jvm.internal.m.e(strSubstring, "substring(...)");
                        sb3.append(strSubstring);
                        i13 = iI0;
                    } else {
                        if (!oz.x.r0(i13, zhuYin, str, false)) {
                            return zhuYin;
                        }
                        sb3.append(str);
                        length = str.length();
                    }
                    i13 += length;
                }
                if (i13 != zhuYin.length()) {
                    return zhuYin;
                }
                String string3 = sb3.toString();
                kotlin.jvm.internal.m.c(string3);
                return string3;
            }
        }
        return zhuYin;
    }

    public static final ArrayList b(CourseWord courseWord) {
        CourseWord courseWord2;
        kotlin.jvm.internal.m.f(courseWord, "<this>");
        int i11 = 0;
        List listW0 = q.W0(courseWord.getZhuYin(), new String[]{" "}, 0, 6);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listW0) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        int length = courseWord.getWord().length();
        if (arrayList.size() == length - 1) {
            arrayList = m.G0("er", q.W0(q.z0(courseWord.getZhuYin()), new String[]{" "}, 0, 6));
        }
        List listU0 = m.U0(arrayList, Math.min(arrayList.size(), length));
        ArrayList arrayList2 = new ArrayList(n.W(listU0, 10));
        for (Object obj2 : listU0) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                o.V();
                throw null;
            }
            String str = (String) obj2;
            if (i11 < length) {
                String strValueOf = String.valueOf(courseWord.getWord().charAt(i11));
                CourseWord courseWord3 = new CourseWord(i11, strValueOf, str, BuildConfig.VERSION_NAME, 3, BuildConfig.VERSION_NAME);
                qy.q qVar = fv.b.f28186a;
                Uri uri = Uri.parse(fv.b.l0(str));
                kotlin.jvm.internal.m.e(uri, "parse(...)");
                courseWord2 = CourseWord.copy$default(courseWord3, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, uri, null, null, 0, null, false, false, null, null, null, strValueOf, false, false, false, false, false, null, null, null, null, null, null, 0, -33587201, 63, null);
            } else {
                courseWord2 = new CourseWord(i11, BuildConfig.VERSION_NAME, str, BuildConfig.VERSION_NAME, 3, BuildConfig.VERSION_NAME);
            }
            arrayList2.add(courseWord2);
            i11 = i12;
        }
        return arrayList2;
    }

    public static final ArrayList c(CourseWord courseWord) {
        kotlin.jvm.internal.m.f(courseWord, "<this>");
        String word = courseWord.getWord();
        ArrayList arrayList = new ArrayList(word.length());
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < word.length()) {
            arrayList.add(CourseWord.copy$default(new CourseWord(i13, String.valueOf(word.charAt(i12)), 3), 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, String.valueOf(courseWord.getOriginalWord().charAt(i13)), false, false, false, false, false, null, null, null, null, null, null, 0, -33554433, 63, null));
            i12++;
            i13++;
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            if (!kotlin.jvm.internal.m.a(((CourseWord) obj).getWord(), "́")) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public static final ArrayList d(CourseWord courseWord) {
        kotlin.jvm.internal.m.f(courseWord, "<this>");
        return e(CourseWord.copy$default(courseWord, 0L, null, a(courseWord), null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, null, null, null, 0, -5, 63, null));
    }

    public static final ArrayList e(CourseWord courseWord) {
        Object next;
        kotlin.jvm.internal.m.f(courseWord, "<this>");
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        List listW0 = q.W0(courseWord.getLuoMa(), new String[]{" "}, 0, 6);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listW0) {
            if (((String) obj).length() > 0) {
                arrayList2.add(obj);
            }
        }
        String zhuYin = courseWord.getZhuYin();
        ArrayList arrayListM = w4.c.m(zhuYin, "<this>");
        int length = 0;
        while (length < zhuYin.length()) {
            Iterator it = f47148a.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!oz.x.r0(length, zhuYin, (String) next, false));
            String strValueOf = (String) next;
            if (strValueOf == null) {
                strValueOf = String.valueOf(zhuYin.charAt(length));
            }
            arrayListM.add(strValueOf);
            length += strValueOf.length();
        }
        int size = arrayListM.size();
        int length2 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj2 = arrayListM.get(i12);
            i12++;
            String str = (String) obj2;
            String str2 = i11 < arrayList2.size() ? (String) arrayList2.get(i11) : BuildConfig.VERSION_NAME;
            CourseWord courseWord2 = new CourseWord(length2, BuildConfig.VERSION_NAME, str, str2, 3, BuildConfig.VERSION_NAME);
            qy.q qVar = fv.b.f28186a;
            Uri uri = Uri.parse(fv.b.l0(str2));
            kotlin.jvm.internal.m.e(uri, "parse(...)");
            arrayList.add(CourseWord.copy$default(courseWord2, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, uri, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, null, null, null, 0, -32769, 63, null));
            length2 += str.length();
            i11++;
        }
        return arrayList;
    }

    public static final ArrayList f(CourseWord courseWord) {
        kotlin.jvm.internal.m.f(courseWord, "<this>");
        int i11 = 0;
        List listW0 = q.W0(courseWord.getZhuYin(), new String[]{" "}, 0, 6);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listW0) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(n.W(arrayList, 10));
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj2 = arrayList.get(i12);
            i12++;
            int i13 = i11 + 1;
            if (i11 < 0) {
                o.V();
                throw null;
            }
            String str = (String) obj2;
            String strValueOf = String.valueOf(oz.x.q0(q.i1(courseWord.getWord()).toString(), " ", BuildConfig.VERSION_NAME).charAt(i11));
            CourseWord courseWord2 = new CourseWord(i11, strValueOf, str, BuildConfig.VERSION_NAME, 3, BuildConfig.VERSION_NAME);
            qy.q qVar = fv.b.f28186a;
            Uri uri = Uri.parse(fv.b.l0(str));
            kotlin.jvm.internal.m.e(uri, "parse(...)");
            arrayList2.add(CourseWord.copy$default(courseWord2, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, uri, null, null, 0, null, false, false, null, null, null, strValueOf, false, false, false, false, false, null, null, null, null, null, null, 0, -33587201, 63, null));
            i11 = i13;
        }
        return arrayList2;
    }

    public static final String g(String str) {
        ArrayList arrayList = new ArrayList(str.length());
        for (int i11 = 0; i11 < str.length(); i11++) {
            char cCharAt = str.charAt(i11);
            if (12449 <= cCharAt && cCharAt < 12535) {
                cCharAt = (char) (cCharAt - '`');
            }
            arrayList.add(Character.valueOf(cCharAt));
        }
        return m.y0(arrayList, BuildConfig.VERSION_NAME, null, null, null, 62);
    }
}
