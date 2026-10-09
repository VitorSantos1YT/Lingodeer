package lp;

import android.os.Build;
import cf.x;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.Model_Sentence_010;
import com.lingo.lingoskill.object.Model_Sentence_020;
import com.lingo.lingoskill.object.Model_Sentence_030;
import com.lingo.lingoskill.object.Model_Sentence_050;
import com.lingo.lingoskill.object.Model_Sentence_060;
import com.lingo.lingoskill.object.Model_Sentence_080;
import com.lingo.lingoskill.object.Model_Sentence_100;
import com.lingo.lingoskill.object.Model_Word_010;
import com.lingo.lingoskill.object.Word;
import com.tbruyelle.rxpermissions3.BuildConfig;
import fr.j3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import jp.p0;
import oz.q;
import ry.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f40177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f40178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public mp.b f40179c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f40180d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f40181e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f40182f;

    public a(mp.b view) {
        kotlin.jvm.internal.m.f(view, "view");
        this.f40177a = new ArrayList();
        this.f40178b = new ArrayList();
        this.f40180d = new ArrayList();
        this.f40181e = new ArrayList();
        this.f40182f = BuildConfig.VERSION_NAME;
        j(view);
    }

    public static List a(long j11) {
        if (ij.c.e(j11) == null) {
            return r.f50854a;
        }
        ArrayList arrayList = new ArrayList();
        if (Model_Sentence_020.checkSimpleObject(j11)) {
            arrayList.add(2);
        }
        if (Model_Sentence_030.checkSimpleObject(j11)) {
            arrayList.add(3);
        }
        if (Model_Sentence_050.checkSimpleObject(j11)) {
            arrayList.add(5);
        }
        if (Model_Sentence_060.checkSimpleObject(j11)) {
            arrayList.add(6);
        }
        if (Model_Sentence_080.checkSimpleObject(j11)) {
            arrayList.add(8);
        }
        if (Model_Sentence_100.checkSimpleObject(j11)) {
            arrayList.add(10);
        }
        if (ij.c.e(j11) != null) {
            LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
            if (!ry.l.D(new Integer[]{57, 61, 63, 65}, Integer.valueOf(x.n().keyLanguage))) {
                arrayList.add(13);
            }
        }
        if (arrayList.isEmpty() && Model_Sentence_010.checkSimpleObject(j11)) {
            arrayList.add(1);
        }
        return arrayList;
    }

    public static List b(long j11) {
        if (ij.c.h(j11) == null) {
            return r.f50854a;
        }
        ArrayList arrayList = new ArrayList();
        if (Model_Word_010.checkSimpleObject(j11)) {
            LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
            if (x.n().isAudioModel && x.n().keyLanguage == 0 && !ry.l.D(new Long[]{195L, 321L, 335L, 619L}, Long.valueOf(j11))) {
                arrayList.add(3);
            }
            arrayList.add(2);
            arrayList.add(8);
            if (!ry.l.D(new Integer[]{51, 55, 57, 61, 63, 65}, Integer.valueOf(x.n().keyLanguage))) {
                if (x.n().isAudioModel) {
                    arrayList.add(5);
                }
                arrayList.add(9);
                arrayList.add(10);
            }
            if (x.n().isAudioModel) {
                arrayList.add(11);
            }
            if (x.n().jsDisPlay == 1 || x.n().jsDisPlay == 2 || x.n().jsDisPlay == 5) {
                arrayList.remove((Object) 5);
                arrayList.remove((Object) 9);
            }
        }
        arrayList.toString();
        return arrayList;
    }

    public final void c() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = this.f40177a.size();
        for (int i11 = 0; i11 < size; i11++) {
            hi.a aVarG = g((qi.a) this.f40177a.get(i11));
            if (aVarG != null) {
                try {
                    aVarG.j();
                } catch (Exception e8) {
                    e8.printStackTrace();
                    aVarG = null;
                }
            }
            if (aVarG != null) {
                arrayList.add(aVarG);
            } else {
                arrayList2.add(this.f40177a.get(i11));
            }
        }
        Iterator it = arrayList2.iterator();
        kotlin.jvm.internal.m.e(it, "iterator(...)");
        while (it.hasNext()) {
            this.f40177a.remove((qi.a) it.next());
        }
        this.f40178b = arrayList;
    }

    public abstract a5.f d();

    public mp.b e() {
        mp.b bVar = this.f40179c;
        if (bVar != null) {
            return bVar;
        }
        kotlin.jvm.internal.m.n("mView");
        throw null;
    }

    public abstract oi.c f();

    public abstract hi.a g(qi.a aVar);

    public final void h(List list) {
        kotlin.jvm.internal.m.f(list, "<set-?>");
        this.f40177a = list;
    }

    public final void i(List list) {
        kotlin.jvm.internal.m.f(list, "<set-?>");
        this.f40178b = list;
    }

    public void j(mp.b bVar) {
        kotlin.jvm.internal.m.f(bVar, "<set-?>");
        this.f40179c = bVar;
    }

    public final void k(qi.a aVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(aVar.f47802e);
        ArrayList arrayList2 = this.f40180d;
        int size = arrayList2.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            qi.a aVar2 = (qi.a) obj;
            if (aVar2.f47799b == aVar.f47799b) {
                arrayList.remove(Integer.valueOf(aVar2.f47800c));
            }
        }
        if (arrayList.size() > 0) {
            Object obj2 = arrayList.get(j3.M(arrayList.size()));
            kotlin.jvm.internal.m.e(obj2, "get(...)");
            aVar.f47800c = ((Number) obj2).intValue();
        } else {
            List list = aVar.f47802e;
            Object obj3 = list.get(j3.M(list.size()));
            kotlin.jvm.internal.m.e(obj3, "get(...)");
            aVar.f47800c = ((Number) obj3).intValue();
        }
    }

    public hi.a l(qi.a aVar) {
        hi.a aVarG = g(aVar);
        if (aVarG == null) {
            return aVarG;
        }
        try {
            aVarG.j();
            return aVarG;
        } catch (Exception e8) {
            e8.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x016a  */
    /* JADX WARN: Code duplicated, block: B:65:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:68:0x01f3  */
    public a(String repeatRegex, mp.b view, boolean z11, String dialogRegex, boolean z12) throws Throwable {
        boolean z13;
        List<qi.a> listK;
        ArrayList arrayList;
        qi.a aVar;
        Word wordH;
        kotlin.jvm.internal.m.f(repeatRegex, "repeatRegex");
        kotlin.jvm.internal.m.f(view, "view");
        kotlin.jvm.internal.m.f(dialogRegex, "dialogRegex");
        this.f40177a = new ArrayList();
        this.f40178b = new ArrayList();
        this.f40180d = new ArrayList();
        this.f40181e = new ArrayList();
        this.f40182f = BuildConfig.VERSION_NAME;
        j(view);
        this.f40182f = dialogRegex;
        if (z11) {
            oi.c cVarF = f();
            cVarF.getClass();
            listK = cVarF.s(repeatRegex);
            boolean z14 = false;
            for (qi.a aVar2 : listK) {
                if (aVar2.f47800c == 6 && aVar2.f47798a == 0 && aVar2.f47799b == 0) {
                    z14 = true;
                }
            }
            if (!z14) {
                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                if (ry.l.D(new Integer[]{47, 48, 49, 50, 53, 54}, Integer.valueOf(x.n().keyLanguage))) {
                    ArrayList arrayList2 = new ArrayList();
                    for (qi.a aVar3 : listK) {
                        if (aVar3.f47798a == 0 && (wordH = ij.c.h(aVar3.f47799b)) != null && wordH.getWordType() == 0 && !arrayList2.contains(Long.valueOf(wordH.getWordId()))) {
                            arrayList2.add(Long.valueOf(wordH.getWordId()));
                        }
                    }
                    if (arrayList2.size() > 2) {
                        int[] iArrP = j3.P(3, arrayList2.size());
                        ArrayList arrayList3 = new ArrayList();
                        for (int i11 : iArrP) {
                            arrayList3.add(arrayList2.get(i11));
                        }
                        qi.a aVar4 = new qi.a();
                        aVar4.f47798a = 0;
                        aVar4.f47799b = 0L;
                        aVar4.f47800c = 6;
                        aVar4.f47801d = arrayList3;
                        listK.add(aVar4);
                    }
                }
            }
        } else {
            if (FirebaseRemoteConfig.d().b("jp_test_new_unit1")) {
                LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                if (ry.l.D(new Integer[]{3, 9}, Integer.valueOf(x.n().locateLanguage)) && x.n().keyLanguage == 1 && ((p0) e()).S == 150) {
                    z13 = false;
                } else {
                    z13 = true;
                }
            } else {
                z13 = true;
            }
            listK = d().k(repeatRegex, z13);
        }
        if (this.f40182f.length() > 0 && repeatRegex.length() == 0) {
            qi.a aVar5 = new qi.a();
            aVar5.f47798a = 4;
            aVar5.f47799b = -1L;
            aVar5.f47800c = 0;
            listK.add(aVar5);
        }
        if (z12) {
            for (qi.a aVar6 : listK) {
                if (aVar6.f47798a == 1 && aVar6.f47800c == 13) {
                    aVar6.f47800c = 5;
                }
            }
        }
        String MODEL = Build.MODEL;
        kotlin.jvm.internal.m.e(MODEL, "MODEL");
        Locale locale = Locale.getDefault();
        kotlin.jvm.internal.m.e(locale, "getDefault(...)");
        String lowerCase = MODEL.toLowerCase(locale);
        kotlin.jvm.internal.m.e(lowerCase, "toLowerCase(...)");
        if (!q.v0(lowerCase, "chromebook", false)) {
            String lowerCase2 = MODEL.toLowerCase(Locale.ROOT);
            kotlin.jvm.internal.m.e(lowerCase2, "toLowerCase(...)");
            if (q.v0(lowerCase2, "sm-f936", false)) {
                arrayList = new ArrayList();
                for (Object obj : listK) {
                    aVar = (qi.a) obj;
                    if (aVar.f47798a == 1 || aVar.f47800c != 6) {
                        arrayList.add(obj);
                    }
                }
                listK = ry.m.c1(arrayList);
            }
        } else {
            arrayList = new ArrayList();
            while (r2.hasNext()) {
                aVar = (qi.a) obj;
                if (aVar.f47798a == 1) {
                }
                arrayList.add(obj);
            }
            listK = ry.m.c1(arrayList);
        }
        this.f40177a = listK;
        c();
    }
}
