package th;

import b7.e0;
import bq.r;
import cf.x;
import com.lingo.fluent.object.PdLessonDbHelper;
import com.lingo.fluent.object.SyncProgress;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.PdLessonFav;
import com.lingo.lingoskill.object.PdTipsFav;
import com.lingo.lingoskill.object.PdWord;
import com.lingo.lingoskill.object.PdWordFav;
import com.tbruyelle.rxpermissions3.BuildConfig;
import fr.o0;
import hh.p0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.m;
import n9.q;
import ns.o;
import nv.p;
import nz.n;
import qy.b0;
import ry.l;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f52426a = {"きゃ", "きゅ", "きょ", "しゃ", "しゅ", "しょ", "ちゃ", "ちゅ", "ちょ", "にゃ", "にゅ", "にょ", "ひゃ", "ひゅ", "ひょ", "みゃ", "みゅ", "みょ", "りゃ", "りゅ", "りょ", "ぎゃ", "ぎゅ", "ぎょ", "じゃ", "じゅ", "じょ", "びゃ", "びゅ", "びょ", "ぴゃ", "ぴゅ", "ぴょ", "でぃ", "ディ", "ふぇ", "フェ", "ふぃ", "フィ", "ふぁ", "ファ", "うぇ", "ウェ", "てぃ", "てぃ"};

    public static final void a(rx.b bVar, q androidDisposable) {
        m.f(androidDisposable, "androidDisposable");
        if (((rx.a) androidDisposable.f43673b) == null) {
            androidDisposable.f43673b = new rx.a(0);
        }
        rx.a aVar = (rx.a) androidDisposable.f43673b;
        if (aVar != null) {
            aVar.a(bVar);
        }
    }

    public static ArrayList b(boolean z11) {
        boolean zD;
        List listC = c();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listC) {
            long jLongValue = ((Number) obj).longValue();
            if (z11) {
                zD = true;
            } else {
                List list = uh.a.f52967a;
                zD = l.D(c.a.n(), Long.valueOf(jLongValue));
            }
            if (zD) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static List c() {
        return n.Z(new nz.c(n.W(new cz.i(2, n.R(ry.m.g0(oz.q.W0(((o0) xt.b.c()).i(), new String[]{";"}, 0, 6)), new st.a(13)), new i()), new st.a(14)), new st.a(15), 0));
    }

    public static int d() {
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        return x.n().keyLanguage;
    }

    public static String e(long j11) {
        int[] iArr = r.f4959a;
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        return defpackage.e.n("https://res.lingodeer.com/deercast/", bq.m.g(x.n().keyLanguage), "/icons/", bq.m.g(x.n().keyLanguage) + "_" + j11 + "_small.jpg");
    }

    public static String f(long j11) {
        int[] iArr = r.f4959a;
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        StringBuilder sbM = com.google.android.material.datepicker.d.m(j11, "pod-", bq.m.g(x.n().keyLanguage), "-");
        sbM.append(".zip");
        return sbM.toString();
    }

    public static SyncProgress g() {
        List<Object> listLoadAll = PdLessonDbHelper.INSTANCE.pdLessonFavDao().loadAll();
        m.e(listLoadAll, "loadAll(...)");
        Iterator<T> it = listLoadAll.iterator();
        String strI = BuildConfig.VERSION_NAME;
        String strI2 = BuildConfig.VERSION_NAME;
        while (it.hasNext()) {
            PdLessonFav pdLessonFav = (PdLessonFav) it.next();
            String id2 = pdLessonFav.getId();
            Long time = pdLessonFav.getTime();
            int fav = pdLessonFav.getFav();
            StringBuilder sb2 = new StringBuilder();
            sb2.append((Object) strI2);
            sb2.append(id2);
            sb2.append(":");
            sb2.append(time);
            sb2.append(":");
            strI2 = p0.i(fav, ";", sb2);
        }
        List<Object> listLoadAll2 = PdLessonDbHelper.INSTANCE.pdWordFavDao().loadAll();
        m.e(listLoadAll2, "loadAll(...)");
        Iterator<T> it2 = listLoadAll2.iterator();
        String strI3 = BuildConfig.VERSION_NAME;
        while (it2.hasNext()) {
            PdWordFav pdWordFav = (PdWordFav) it2.next();
            String id3 = pdWordFav.getId();
            Long time2 = pdWordFav.getTime();
            int fav2 = pdWordFav.getFav();
            StringBuilder sb3 = new StringBuilder();
            sb3.append((Object) strI3);
            sb3.append(id3);
            sb3.append(":");
            sb3.append(time2);
            sb3.append(":");
            strI3 = p0.i(fav2, ";", sb3);
        }
        List<Object> listLoadAll3 = PdLessonDbHelper.INSTANCE.pdTipsFavDao().loadAll();
        m.e(listLoadAll3, "loadAll(...)");
        Iterator<T> it3 = listLoadAll3.iterator();
        while (it3.hasNext()) {
            PdTipsFav pdTipsFav = (PdTipsFav) it3.next();
            String id4 = pdTipsFav.getId();
            Long time3 = pdTipsFav.getTime();
            int fav3 = pdTipsFav.getFav();
            StringBuilder sb4 = new StringBuilder();
            sb4.append((Object) strI);
            sb4.append(id4);
            sb4.append(":");
            sb4.append(time3);
            sb4.append(":");
            strI = p0.i(fav3, ";", sb4);
        }
        return new SyncProgress(strI2, strI3, strI, ((o0) xt.b.c()).i());
    }

    public static ArrayList h(PdWord word) {
        List listK;
        List listT;
        List listK2;
        m.f(word, "word");
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        int i11 = 0;
        if (x.n().keyLanguage != 0) {
            String detailWord = word.getDetailWord();
            m.e(detailWord, "getDetailWord(...)");
            String string = oz.q.i1(oz.x.q0(detailWord, " ", BuildConfig.VERSION_NAME)).toString();
            ArrayList arrayList = new ArrayList();
            int length = string.length();
            while (i11 < length) {
                String strValueOf = String.valueOf(string.charAt(i11));
                PdWord pdWord = new PdWord();
                pdWord.setWord(strValueOf);
                arrayList.add(pdWord);
                i11++;
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        String luoma = word.getLuoma();
        m.e(luoma, "getLuoma(...)");
        Pattern patternCompile = Pattern.compile(" ");
        m.e(patternCompile, "compile(...)");
        oz.q.U0(0);
        Matcher matcher = patternCompile.matcher(luoma);
        if (matcher.find()) {
            ArrayList arrayList3 = new ArrayList(10);
            int iC = 0;
            do {
                iC = p.c(matcher, luoma, iC, arrayList3);
            } while (matcher.find());
            p.B(iC, luoma, arrayList3);
            listK = arrayList3;
        } else {
            listK = o.K(luoma.toString());
        }
        boolean zIsEmpty = listK.isEmpty();
        List listT2 = ry.r.f50854a;
        if (!zIsEmpty) {
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
        } else {
            listT = listT2;
            break;
        }
        String[] strArr = (String[]) listT.toArray(new String[0]);
        if (strArr.length == word.getWord().length() - 1) {
            StringBuilder sb2 = new StringBuilder(word.getLuoma());
            try {
                sb2.replace(sb2.length() - 1, sb2.length(), " er");
            } catch (Exception e8) {
                e8.printStackTrace();
            }
            String string2 = sb2.toString();
            m.e(string2, "toString(...)");
            Pattern patternCompile2 = Pattern.compile(" ");
            m.e(patternCompile2, "compile(...)");
            oz.q.U0(0);
            Matcher matcher2 = patternCompile2.matcher(string2);
            if (matcher2.find()) {
                ArrayList arrayList4 = new ArrayList(10);
                int iC2 = 0;
                do {
                    iC2 = p.c(matcher2, string2, iC2, arrayList4);
                } while (matcher2.find());
                p.B(iC2, string2, arrayList4);
                listK2 = arrayList4;
            } else {
                listK2 = o.K(string2.toString());
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
        int length2 = word.getWord().length();
        while (i11 < length2) {
            PdWord pdWord2 = new PdWord();
            try {
                pdWord2.setLuoma(strArr[i11] + " ");
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            if (((o0) xt.b.c()).t() == 2) {
                pdWord2.setWord(pdWord2.getLuoma());
            } else {
                pdWord2.setWord(String.valueOf(word.getWord().charAt(i11)));
            }
            arrayList2.add(pdWord2);
            i11++;
        }
        return arrayList2;
    }

    public static String i(long j11) {
        int[] iArr = r.f4959a;
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        StringBuilder sbM = com.google.android.material.datepicker.d.m(j11, "pod-", bq.m.g(x.n().keyLanguage), "-w-");
        sbM.append(".mp3");
        return sbM.toString();
    }

    public static String j(long j11) {
        int[] iArr = r.f4959a;
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        return defpackage.e.n("https://res.lingodeer.com/deercast/", bq.m.g(x.n().keyLanguage), "/main/", i(j11));
    }

    public static String k(long j11) {
        int[] iArr = r.f4959a;
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        StringBuilder sbM = com.google.android.material.datepicker.d.m(j11, "pod-", bq.m.g(x.n().keyLanguage), "-w-yx-");
        sbM.append(".mp3");
        return sbM.toString();
    }

    public static String l(long j11) {
        int[] iArr = r.f4959a;
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        return defpackage.e.n("https://res.lingodeer.com/deercast/", bq.m.g(x.n().keyLanguage), "/main/", k(j11));
    }

    public static int m(int i11) {
        if (i11 > 0) {
            return Math.abs(new Random().nextInt()) % i11;
        }
        throw new RuntimeException();
    }

    public static int n(int i11, int i12) {
        if (i11 < 0 || i11 > i12) {
            throw new IllegalArgumentException();
        }
        return m(i12 - i11) + i11;
    }

    public static Object o(SyncProgress syncProgress, jh.g gVar) {
        int i11;
        List listW0 = oz.q.W0(syncProgress.getLessonFav(), new String[]{";"}, 0, 6);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listW0) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(ry.n.W(arrayList, 10));
        int size = arrayList.size();
        int i12 = 0;
        while (true) {
            i11 = 1;
            if (i12 >= size) {
                break;
            }
            Object obj2 = arrayList.get(i12);
            i12++;
            String str = (String) obj2;
            arrayList2.add(new PdLessonFav((String) oz.q.W0(str, new String[]{":"}, 0, 6).get(0), new Long(Long.parseLong((String) oz.q.W0(str, new String[]{":"}, 0, 6).get(1))), Integer.parseInt((String) oz.q.W0(str, new String[]{":"}, 0, 6).get(2))));
        }
        if (!arrayList2.isEmpty()) {
            PdLessonDbHelper.INSTANCE.pdLessonFavDao().insertOrReplaceInTx(arrayList2);
        }
        List listW1 = oz.q.W0(syncProgress.getVocabulary(), new String[]{";"}, 0, 6);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : listW1) {
            if (((String) obj3).length() > 0) {
                arrayList3.add(obj3);
            }
        }
        ArrayList arrayList4 = new ArrayList(ry.n.W(arrayList3, 10));
        int size2 = arrayList3.size();
        int i13 = 0;
        while (i13 < size2) {
            Object obj4 = arrayList3.get(i13);
            i13++;
            String str2 = (String) obj4;
            arrayList4.add(new PdWordFav((String) oz.q.W0(str2, new String[]{":"}, 0, 6).get(0), new Long(Long.parseLong((String) oz.q.W0(str2, new String[]{":"}, 0, 6).get(i11))), Integer.parseInt((String) oz.q.W0(str2, new String[]{":"}, 0, 6).get(2))));
            i11 = 1;
        }
        if (!arrayList4.isEmpty()) {
            PdLessonDbHelper.INSTANCE.pdWordFavDao().insertOrReplaceInTx(arrayList4);
        }
        List listW2 = oz.q.W0(syncProgress.getTipsCard(), new String[]{";"}, 0, 6);
        ArrayList arrayList5 = new ArrayList();
        for (Object obj5 : listW2) {
            if (((String) obj5).length() > 0) {
                arrayList5.add(obj5);
            }
        }
        ArrayList arrayList6 = new ArrayList(ry.n.W(arrayList5, 10));
        int size3 = arrayList5.size();
        int i14 = 0;
        while (i14 < size3) {
            Object obj6 = arrayList5.get(i14);
            i14++;
            String str3 = (String) obj6;
            arrayList6.add(new PdTipsFav((String) oz.q.W0(str3, new String[]{":"}, 0, 6).get(0), new Long(Long.parseLong((String) oz.q.W0(str3, new String[]{":"}, 0, 6).get(1))), Integer.parseInt((String) oz.q.W0(str3, new String[]{":"}, 0, 6).get(2))));
        }
        if (!arrayList6.isEmpty()) {
            PdLessonDbHelper.INSTANCE.pdTipsFavDao().insertOrReplaceInTx(arrayList6);
        }
        Object objG = ((o0) xt.b.c()).G(syncProgress.getLessonRead(), gVar);
        return objG == wy.a.COROUTINE_SUSPENDED ? objG : b0.f48488a;
    }
}
