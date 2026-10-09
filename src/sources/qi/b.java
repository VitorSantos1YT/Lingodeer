package qi;

import android.text.TextUtils;
import b7.e0;
import cf.x;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.Word;
import com.tbruyelle.rxpermissions3.BuildConfig;
import fr.j3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.m;
import l0.Eeqr.HOBXIlHxIkMBEA;
import ns.o;
import nv.p;
import oz.q;
import ry.l;
import ry.r;
import w4.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f47803a = {"きゃ", "きゅ", "きょ", "しゃ", "しゅ", "しょ", "ちゃ", "ちゅ", "ちょ", "にゃ", "にゅ", "にょ", "ひゃ", "ひゅ", "ひょ", "みゃ", "みゅ", "みょ", "りゃ", "りゅ", "りょ", "ぎゃ", "ぎゅ", "ぎょ", "じゃ", "じゅ", "じょ", "びゃ", "びゅ", "びょ", "ぴゃ", "ぴゅ", "ぴょ", "でぃ", "ディ", "ふぇ", "フェ", "ふぃ", "フィ", "ふぁ", "ファ", "うぇ", "ウェ", "てぃ", "てぃ"};

    public static String a(String str) {
        return p.s("[\\p{P}+~$`^=|<>～｀＄＾＋＝｜＜＞￥×]", "compile(...)", str, BuildConfig.VERSION_NAME, "replaceAll(...)");
    }

    public static ArrayList b(Word word) {
        List listK;
        List listT;
        List listK2;
        ArrayList arrayList = new ArrayList();
        String zhuyin = word.getZhuyin();
        m.e(zhuyin, "getZhuyin(...)");
        Pattern patternCompile = Pattern.compile(" ");
        m.e(patternCompile, "compile(...)");
        q.U0(0);
        Matcher matcher = patternCompile.matcher(zhuyin);
        if (matcher.find()) {
            ArrayList arrayList2 = new ArrayList(10);
            int iC = 0;
            do {
                iC = p.c(matcher, zhuyin, iC, arrayList2);
            } while (matcher.find());
            p.B(iC, zhuyin, arrayList2);
            listK = arrayList2;
        } else {
            listK = o.K(zhuyin.toString());
        }
        boolean zIsEmpty = listK.isEmpty();
        List listT2 = r.f50854a;
        if (zIsEmpty) {
            listT = listT2;
            break;
        }
        ListIterator listIterator = listK.listIterator(listK.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                listT = listT2;
                break;
            }
            if (((String) listIterator.previous()).length() != 0) {
                listT = e0.t(listIterator, 1, listK);
                break;
            }
        }
        String[] strArr = (String[]) listT.toArray(new String[0]);
        if (strArr.length == word.getWord().length() - 1) {
            StringBuilder sb2 = new StringBuilder(word.getZhuyin());
            sb2.replace(sb2.length() - 1, sb2.length(), " er");
            String string = sb2.toString();
            m.e(string, "toString(...)");
            Matcher matcherW = p.w(0, " ", "compile(...)", string);
            if (matcherW.find()) {
                ArrayList arrayList3 = new ArrayList(10);
                int iC2 = 0;
                do {
                    iC2 = p.c(matcherW, string, iC2, arrayList3);
                } while (matcherW.find());
                p.B(iC2, string, arrayList3);
                listK2 = arrayList3;
            } else {
                listK2 = o.K(string.toString());
            }
            if (!listK2.isEmpty()) {
                ListIterator listIterator2 = listK2.listIterator(listK2.size());
                while (listIterator2.hasPrevious()) {
                    if (((String) listIterator2.previous()).length() != 0) {
                        listT2 = e0.t(listIterator2, 1, listK2);
                        break;
                    }
                }
            }
            strArr = (String[]) listT2.toArray(new String[0]);
        }
        int length = strArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            Word word2 = new Word();
            word2.setZhuyin(strArr[i11]);
            word2.setWord(String.valueOf(word.getWord().charAt(i11)));
            arrayList.add(word2);
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0051  */
    public static ArrayList c(Word word) {
        ArrayList arrayList = new ArrayList();
        int length = word.getWord().length();
        for (int i11 = 0; i11 < length; i11++) {
            String.valueOf(word.getWord().charAt(i11));
            String strValueOf = String.valueOf(word.getWord().charAt(i11));
            if (m.a(String.valueOf(word.getWord().charAt(i11)), "́")) {
                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                if (x.n().keyLanguage != 10 && x.n().keyLanguage != 22) {
                    Word word2 = new Word();
                    word2.setWord(strValueOf);
                    arrayList.add(word2);
                }
            } else {
                Word word3 = new Word();
                word3.setWord(strValueOf);
                arrayList.add(word3);
            }
        }
        return arrayList;
    }

    public static ArrayList d(Word word) {
        List listK;
        Collection collectionT;
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        for (int i11 = 0; i11 < 45; i11++) {
            String str = f47803a[i11];
            String zhuyin = word.getZhuyin();
            m.e(zhuyin, "getZhuyin(...)");
            int iI0 = q.I0(zhuyin, str, 0, false, 6);
            if (iI0 != -1) {
                str.getClass();
                map.put(Integer.valueOf(iI0), Integer.valueOf(str.length()));
            }
        }
        String luoma = word.getLuoma();
        m.e(luoma, "getLuoma(...)");
        Pattern patternCompile = Pattern.compile(" ");
        m.e(patternCompile, "compile(...)");
        q.U0(0);
        Matcher matcher = patternCompile.matcher(luoma);
        if (matcher.find()) {
            ArrayList arrayList2 = new ArrayList(10);
            int iC = 0;
            do {
                iC = p.c(matcher, luoma, iC, arrayList2);
            } while (matcher.find());
            p.B(iC, luoma, arrayList2);
            listK = arrayList2;
        } else {
            listK = o.K(luoma.toString());
        }
        if (listK.isEmpty()) {
            collectionT = r.f50854a;
            break;
        }
        ListIterator listIterator = listK.listIterator(listK.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                collectionT = r.f50854a;
                break;
            }
            if (((String) listIterator.previous()).length() != 0) {
                collectionT = e0.t(listIterator, 1, listK);
                break;
            }
        }
        String[] strArr = (String[]) collectionT.toArray(new String[0]);
        int length = word.getZhuyin().length();
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13++) {
            Iterator it = map.keySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    Object next = it.next();
                    m.e(next, "next(...)");
                    int iIntValue = ((Number) next).intValue();
                    if (i13 >= iIntValue) {
                        Object obj = map.get(Integer.valueOf(iIntValue));
                        m.c(obj);
                        if (i13 < ((Number) obj).intValue() + iIntValue) {
                            if (i13 != iIntValue) {
                                break;
                            }
                            String zhuyin2 = word.getZhuyin();
                            m.e(zhuyin2, "getZhuyin(...)");
                            Object obj2 = map.get(Integer.valueOf(iIntValue));
                            m.c(obj2);
                            String strSubstring = zhuyin2.substring(iIntValue, ((Number) obj2).intValue() + iIntValue);
                            m.e(strSubstring, "substring(...)");
                            Word word2 = new Word();
                            word2.setWord(strSubstring);
                            word2.setLuoma(strArr[i12]);
                            arrayList.add(word2);
                        }
                    }
                } else {
                    String strValueOf = String.valueOf(word.getZhuyin().charAt(i13));
                    Word word3 = new Word();
                    word3.setWord(strValueOf);
                    word3.setLuoma(strArr[i12]);
                    arrayList.add(word3);
                }
                i12++;
                break;
            }
        }
        return arrayList;
    }

    public static ArrayList f(Word word) {
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        int i11 = x.n().keyLanguage;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    switch (i11) {
                        case 11:
                            break;
                        case 12:
                            break;
                        case 13:
                            break;
                        default:
                            return c(word);
                    }
                }
                return e(word);
            }
            return d(word);
        }
        return b(word);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:37:0x0104  */
    /* JADX WARN: Code duplicated, block: B:44:0x014e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0186  */
    /* JADX WARN: Code duplicated, block: B:54:0x0189  */
    public static ArrayList g(List list, boolean z11) {
        int i11;
        Word word;
        String word2;
        String lowerCase;
        String word3;
        List list2 = list;
        ArrayList arrayList = new ArrayList();
        int size = list2.size();
        int i12 = 0;
        boolean z12 = false;
        while (true) {
            boolean z13 = true;
            if (i12 >= size) {
                break;
            }
            Word word4 = (Word) list2.get(i12);
            int i13 = i12 + 1;
            Word word5 = i13 < list2.size() ? (Word) list2.get(i13) : null;
            if (word4.getWordType() == 1 || TextUtils.isEmpty(word4.getWord())) {
                i11 = i13;
            } else {
                int[] iArrO = j3.O(word4.getWord().length());
                if (word4.getWord().length() > 1 && !z12) {
                    while (true) {
                        String word6 = word4.getWord();
                        m.e(word6, "getWord(...)");
                        int length = q.i1(word6).toString().length();
                        boolean z14 = z13;
                        for (int i14 = 0; i14 < length; i14++) {
                            if (i14 != iArrO[i14]) {
                                z14 = false;
                            }
                        }
                        if (!z14) {
                            break;
                        }
                        iArrO = j3.O(word4.getWord().length());
                        z13 = true;
                    }
                    z12 = true;
                }
                int length2 = iArrO.length;
                int[] iArr = iArrO;
                int i15 = 0;
                while (i15 < length2) {
                    int i16 = length2;
                    int i17 = iArr[i15];
                    int i18 = i13;
                    Word word7 = new Word();
                    boolean z15 = z12;
                    int i19 = i15;
                    if (m.a(String.valueOf(word4.getWord().charAt(i17)), "́")) {
                        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                        if (x.n().keyLanguage != 10 && x.n().keyLanguage != 22) {
                            LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                            if (x.n().keyLanguage == 65) {
                                lowerCase = String.valueOf(word4.getWord().charAt(i17));
                            } else {
                                String strValueOf = String.valueOf(word4.getWord().charAt(i17));
                                int[] iArr2 = bq.r.f4959a;
                                lowerCase = strValueOf.toLowerCase(bq.m.p());
                                m.e(lowerCase, "toLowerCase(...)");
                            }
                            word7.setWord(lowerCase);
                            word3 = word4.getWord();
                            m.e(word3, "getWord(...)");
                            if (oz.x.k0(word3, "-", false) || !m.a(word7.getWord(), "-") || !l.D(new Integer[]{18, 69}, Integer.valueOf(x.n().keyLanguage))) {
                                arrayList.add(word7);
                            }
                        }
                    } else {
                        LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                        if (x.n().keyLanguage == 65) {
                            lowerCase = String.valueOf(word4.getWord().charAt(i17));
                        } else {
                            String strValueOf2 = String.valueOf(word4.getWord().charAt(i17));
                            int[] iArr3 = bq.r.f4959a;
                            lowerCase = strValueOf2.toLowerCase(bq.m.p());
                            m.e(lowerCase, "toLowerCase(...)");
                        }
                        word7.setWord(lowerCase);
                        word3 = word4.getWord();
                        m.e(word3, "getWord(...)");
                        if (oz.x.k0(word3, "-", false)) {
                            arrayList.add(word7);
                        } else {
                            arrayList.add(word7);
                        }
                    }
                    i15 = i19 + 1;
                    length2 = i16;
                    i13 = i18;
                    z12 = z15;
                }
                i11 = i13;
                boolean z16 = z12;
                if (z11) {
                    String word8 = word4.getWord();
                    m.e(word8, "getWord(...)");
                    if (oz.x.k0(word8, "-", false)) {
                        LingoSkillApplication lingoSkillApplication4 = LingoSkillApplication.f21665b;
                        if (!l.D(new Integer[]{18, 69}, Integer.valueOf(x.n().keyLanguage))) {
                            word = new Word();
                            word.setWord(" ");
                            LingoSkillApplication lingoSkillApplication5 = LingoSkillApplication.f21665b;
                            if (l.D(new Integer[]{5, 15, 53, 54}, Integer.valueOf(x.n().keyLanguage)) || (!m.a(word4.getWord(), "-t-") && !m.a(word4.getWord(), "-"))) {
                                word2 = word4.getWord();
                                m.e(word2, "getWord(...)");
                                if ((oz.x.k0(word2, "'", false) || m.a(word4.getWord(), "po'")) && (!l.D(new Integer[]{5, 15, 53, 54}, Integer.valueOf(x.n().keyLanguage)) || word5 == null || (!m.a(word5.getWord(), "-t-") && !m.a(word5.getWord(), "-")))) {
                                    arrayList.add(word);
                                }
                            }
                        }
                    } else {
                        word = new Word();
                        word.setWord(" ");
                        LingoSkillApplication lingoSkillApplication6 = LingoSkillApplication.f21665b;
                        if (l.D(new Integer[]{5, 15, 53, 54}, Integer.valueOf(x.n().keyLanguage))) {
                        }
                        word2 = word4.getWord();
                        m.e(word2, "getWord(...)");
                        if (oz.x.k0(word2, "'", false)) {
                            arrayList.add(word);
                        } else {
                            arrayList.add(word);
                        }
                    }
                }
                z12 = z16;
            }
            list2 = list;
            size = size;
            i12 = i11;
        }
        if (z11 && m.a(((Word) p.f(1, arrayList)).getWord(), " ")) {
            arrayList.remove(arrayList.size() - 1);
        }
        return arrayList;
    }

    public static ArrayList h(Word word) {
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        int i11 = x.n().keyLanguage;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    switch (i11) {
                        case 11:
                            break;
                        case 12:
                            break;
                        case 13:
                            break;
                        default:
                            return c(word);
                    }
                }
                return e(word);
            }
            ArrayList arrayList = new ArrayList();
            int length = word.getWord().length();
            for (int i12 = 0; i12 < length; i12++) {
                String strValueOf = String.valueOf(word.getWord().charAt(i12));
                Word word2 = new Word();
                word2.setWord(strValueOf);
                arrayList.add(word2);
            }
            return arrayList;
        }
        return b(word);
    }

    public static ArrayList e(Word word) {
        List listK;
        Collection collectionU0;
        int i11;
        boolean z11;
        String word2 = word.getWord();
        int iB = c.b(1, word2, "getWord(...)");
        int i12 = 0;
        boolean z12 = false;
        while (i12 <= iB) {
            if (!z12) {
                i11 = i12;
            } else {
                i11 = iB;
            }
            if (m.h(word2.charAt(i11), 32) <= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z12) {
                if (!z11) {
                    z12 = true;
                } else {
                    i12++;
                }
            } else {
                if (!z11) {
                    break;
                }
                iB--;
            }
        }
        String strG = c.g(word2, iB, 1, i12);
        String str = HOBXIlHxIkMBEA.bPyzkvpaPKlG;
        String strQ0 = oz.x.q0(strG, " ", str);
        ArrayList arrayList = new ArrayList();
        int length = strQ0.length();
        for (int i13 = 0; i13 < length; i13++) {
            String strValueOf = String.valueOf(strQ0.charAt(i13));
            Word word3 = new Word();
            word3.setWord(strValueOf);
            try {
                String zhuyin = word.getZhuyin();
                m.e(zhuyin, "getZhuyin(...)");
                Pattern patternCompile = Pattern.compile(" ");
                m.e(patternCompile, "compile(...)");
                q.U0(0);
                Matcher matcher = patternCompile.matcher(zhuyin);
                if (!matcher.find()) {
                    listK = o.K(zhuyin.toString());
                } else {
                    ArrayList arrayList2 = new ArrayList(10);
                    int iEnd = 0;
                    do {
                        arrayList2.add(zhuyin.subSequence(iEnd, matcher.start()).toString());
                        iEnd = matcher.end();
                    } while (matcher.find());
                    arrayList2.add(zhuyin.subSequence(iEnd, zhuyin.length()).toString());
                    listK = arrayList2;
                }
                if (!listK.isEmpty()) {
                    ListIterator listIterator = listK.listIterator(listK.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            if (((String) listIterator.previous()).length() != 0) {
                                collectionU0 = ry.m.U0(listK, listIterator.nextIndex() + 1);
                                break;
                            }
                        } else {
                            collectionU0 = r.f50854a;
                            break;
                        }
                    }
                } else {
                    collectionU0 = r.f50854a;
                    break;
                }
                word3.setZhuyin(((String[]) collectionU0.toArray(new String[0]))[i13]);
            } catch (Exception unused) {
                word3.setZhuyin(str);
            }
            arrayList.add(word3);
        }
        return arrayList;
    }
}
