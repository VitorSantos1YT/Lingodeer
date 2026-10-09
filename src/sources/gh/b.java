package gh;

import b7.e0;
import bq.r;
import cf.x;
import com.lingo.fluent.object.PdLessonDbHelper;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.GameWordStatus;
import com.lingo.lingoskill.object.GameWordStatusDao;
import com.lingo.lingoskill.object.PdTips;
import com.lingo.lingoskill.object.PdTipsDao;
import com.lingo.lingoskill.object.PdTipsFav;
import com.lingo.lingoskill.object.PdTipsFavDao;
import com.lingo.lingoskill.object.PdWord;
import com.lingo.lingoskill.object.PdWordDao;
import com.lingo.lingoskill.object.PdWordFav;
import fr.o0;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import oz.q;
import ry.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f29195b;

    public /* synthetic */ b(boolean z11, int i11) {
        this.f29194a = i11;
        this.f29195b = z11;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        ArrayList arrayListC1;
        int i11;
        int i12 = 2;
        int i13 = 0;
        switch (this.f29194a) {
            case 0:
                boolean z11 = this.f29195b;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int iK = ((o0) xt.b.c()).k();
                ArrayList arrayListB = th.j.b(z11);
                int size = arrayListB.size();
                int i14 = 0;
                while (i14 < size) {
                    Object obj = arrayListB.get(i14);
                    i14++;
                    long jLongValue = ((Number) obj).longValue();
                    k10.g gVarQueryBuilder = PdLessonDbHelper.INSTANCE.pdWordDao().queryBuilder();
                    k10.h hVarB = PdWordDao.Properties.LessonId.b(Long.valueOf(jLongValue));
                    org.greenrobot.greendao.d dVar = PdWordDao.Properties.Id;
                    int[] iArr = r.f4959a;
                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                    gVarQueryBuilder.f(hVarB, dVar.e(bq.m.k(x.n().keyLanguage).concat("%")));
                    List listD = gVarQueryBuilder.d();
                    ArrayList arrayListR = e0.r("list(...)", listD);
                    for (Object obj2 : listD) {
                        PdWord pdWord = (PdWord) obj2;
                        if (pdWord.getWordStruct() != 2 && pdWord.getWordStruct() != 3 && pdWord.getFlag() != -1) {
                            arrayListR.add(obj2);
                        }
                    }
                    arrayList.addAll(arrayListR);
                }
                if (c.f29196a == null) {
                    synchronized (c.class) {
                        if (c.f29196a == null) {
                            c.f29196a = new c();
                        }
                        break;
                    }
                }
                kotlin.jvm.internal.m.c(c.f29196a);
                ArrayList arrayListC = c.c();
                ArrayList arrayList3 = new ArrayList(ry.n.W(arrayListC, 10));
                int size2 = arrayListC.size();
                int i15 = 0;
                while (i15 < size2) {
                    Object obj3 = arrayListC.get(i15);
                    i15++;
                    arrayList3.add(((PdWordFav) obj3).getId());
                }
                int iL = ((o0) xt.b.c()).l();
                arrayList.size();
                if (iL == 2) {
                    ArrayList arrayList4 = new ArrayList();
                    int size3 = arrayList.size();
                    int i16 = 0;
                    while (i16 < size3) {
                        Object obj4 = arrayList.get(i16);
                        i16++;
                        int[] iArr2 = r.f4959a;
                        LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                        if (arrayList3.contains(bq.m.k(x.n().keyLanguage) + "_" + ((PdWord) obj4).getFavId())) {
                            arrayList4.add(obj4);
                        }
                    }
                    HashSet hashSet = new HashSet();
                    ArrayList arrayList5 = new ArrayList();
                    int size4 = arrayList4.size();
                    int i17 = 0;
                    while (i17 < size4) {
                        Object obj5 = arrayList4.get(i17);
                        i17++;
                        if (hashSet.add(((PdWord) obj5).getDetailWord())) {
                            arrayList5.add(obj5);
                        }
                    }
                    arrayListC1 = ry.m.c1(arrayList5);
                } else {
                    HashSet hashSet2 = new HashSet();
                    ArrayList arrayList6 = new ArrayList();
                    int size5 = arrayList.size();
                    int i18 = 0;
                    while (i18 < size5) {
                        Object obj6 = arrayList.get(i18);
                        i18++;
                        if (hashSet2.add(((PdWord) obj6).getDetailWord())) {
                            arrayList6.add(obj6);
                        }
                    }
                    arrayListC1 = ry.m.c1(arrayList6);
                }
                arrayListC1.size();
                k10.g gVarQueryBuilder2 = PdLessonDbHelper.INSTANCE.gameWordStatusDao().queryBuilder();
                org.greenrobot.greendao.d dVar2 = GameWordStatusDao.Properties.Id;
                int[] iArr3 = r.f4959a;
                LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                gVarQueryBuilder2.f(dVar2.e(bq.m.r(x.n().keyLanguage).concat("%")), new k10.h[0]);
                List listD2 = gVarQueryBuilder2.d();
                ArrayList arrayListR2 = e0.r("list(...)", listD2);
                for (Object obj7 : listD2) {
                    String lastThreeResult = ((GameWordStatus) obj7).getLastThreeResult();
                    kotlin.jvm.internal.m.e(lastThreeResult, "getLastThreeResult(...)");
                    if (q.i1(lastThreeResult).toString().length() > 0) {
                        arrayListR2.add(obj7);
                    }
                }
                List<GameWordStatus> listS0 = ry.m.S0(ry.m.S0(arrayListR2, new b4.e(25)), new b4.e(26));
                ArrayList arrayList7 = new ArrayList();
                for (GameWordStatus gameWordStatus : listS0) {
                    PdWordDao pdWordDao = PdLessonDbHelper.INSTANCE.pdWordDao();
                    int[] iArr4 = r.f4959a;
                    LingoSkillApplication lingoSkillApplication4 = LingoSkillApplication.f21665b;
                    int i19 = x.n().keyLanguage;
                    String id2 = gameWordStatus.getId();
                    kotlin.jvm.internal.m.e(id2, "getId(...)");
                    PdWord pdWord2 = (PdWord) pdWordDao.load(bq.m.l(i19, Long.parseLong((String) q.W0(id2, new String[]{"-"}, 0, 6).get(1))));
                    String lastThreeResult2 = gameWordStatus.getLastThreeResult();
                    kotlin.jvm.internal.m.e(lastThreeResult2, "getLastThreeResult(...)");
                    List listW0 = q.W0(lastThreeResult2, new String[]{";"}, 0, 6);
                    ArrayList arrayList8 = new ArrayList();
                    for (Object obj8 : listW0) {
                        if (((String) obj8).length() > 0) {
                            arrayList8.add(obj8);
                        }
                    }
                    if (arrayList8.isEmpty()) {
                        i11 = i12;
                    } else {
                        int size6 = arrayList8.size();
                        long j11 = 0;
                        int i21 = 0;
                        while (i21 < size6) {
                            Object obj9 = arrayList8.get(i21);
                            i21++;
                            if (oz.x.k0((String) obj9, "1", false)) {
                                j11++;
                            }
                        }
                        pdWord2.setCorrectRate(Float.valueOf(j11 / arrayList8.size()));
                        i11 = 2;
                    }
                    if (iL == i11) {
                        int[] iArr5 = r.f4959a;
                        LingoSkillApplication lingoSkillApplication5 = LingoSkillApplication.f21665b;
                        if (arrayList3.contains(bq.m.k(x.n().keyLanguage) + "_" + pdWord2.getFavId())) {
                            arrayList7.add(pdWord2);
                        }
                    } else {
                        arrayList7.add(pdWord2);
                    }
                    arrayListC1.remove(pdWord2);
                    i12 = i11;
                }
                if (arrayList7.size() > 1) {
                    p.Z(arrayList7, new b4.e(24));
                }
                arrayList2.addAll(arrayListC1);
                arrayList2.addAll(arrayList7);
                return arrayList2.subList(0, Math.min(iK, arrayList2.size()));
            case 1:
                boolean z12 = this.f29195b;
                if (c.f29196a == null) {
                    synchronized (c.class) {
                        if (c.f29196a == null) {
                            c.f29196a = new c();
                        }
                        break;
                    }
                }
                kotlin.jvm.internal.m.c(c.f29196a);
                k10.g gVarQueryBuilder3 = PdLessonDbHelper.INSTANCE.pdTipsFavDao().queryBuilder();
                org.greenrobot.greendao.d dVar3 = PdTipsFavDao.Properties.Id;
                int[] iArr6 = r.f4959a;
                LingoSkillApplication lingoSkillApplication6 = LingoSkillApplication.f21665b;
                gVarQueryBuilder3.f(dVar3.e(bq.m.k(x.n().keyLanguage).concat("%")), PdTipsFavDao.Properties.Fav.b(1));
                List listD3 = gVarQueryBuilder3.d();
                ArrayList arrayListR3 = e0.r("list(...)", listD3);
                for (Object obj10 : listD3) {
                    String id3 = ((PdTipsFav) obj10).getId();
                    kotlin.jvm.internal.m.e(id3, "getId(...)");
                    if (!q.v0(id3, "oc", false)) {
                        arrayListR3.add(obj10);
                    }
                }
                ArrayList arrayList9 = new ArrayList();
                ArrayList arrayList10 = new ArrayList(ry.n.W(arrayListR3, 10));
                int size7 = arrayListR3.size();
                int i22 = 0;
                while (i22 < size7) {
                    Object obj11 = arrayListR3.get(i22);
                    i22++;
                    arrayList10.add(((PdTipsFav) obj11).getId());
                }
                ArrayList arrayListB2 = th.j.b(z12);
                int size8 = arrayListB2.size();
                int i23 = 0;
                while (i23 < size8) {
                    Object obj12 = arrayListB2.get(i23);
                    i23++;
                    long jLongValue2 = ((Number) obj12).longValue();
                    k10.g gVarQueryBuilder4 = PdLessonDbHelper.INSTANCE.pdTipsDao().queryBuilder();
                    k10.h hVarE = PdTipsDao.Properties.LessonIds.e("%;" + jLongValue2 + ";%");
                    org.greenrobot.greendao.d dVar4 = PdTipsDao.Properties.Lan;
                    int[] iArr7 = r.f4959a;
                    LingoSkillApplication lingoSkillApplication7 = LingoSkillApplication.f21665b;
                    gVarQueryBuilder4.f(hVarE, dVar4.b(bq.m.k(x.n().keyLanguage)));
                    List listD4 = gVarQueryBuilder4.d();
                    ArrayList arrayListR4 = e0.r("list(...)", listD4);
                    for (Object obj13 : listD4) {
                        int[] iArr8 = r.f4959a;
                        LingoSkillApplication lingoSkillApplication8 = LingoSkillApplication.f21665b;
                        if (arrayList10.contains(bq.m.k(x.n().keyLanguage) + "_" + ((PdTips) obj13).getCardId())) {
                            arrayListR4.add(obj13);
                        }
                    }
                    arrayList9.addAll(arrayListR4);
                }
                Collections.reverse(arrayList9);
                HashSet hashSet3 = new HashSet();
                ArrayList arrayList11 = new ArrayList();
                int size9 = arrayList9.size();
                while (i13 < size9) {
                    Object obj14 = arrayList9.get(i13);
                    i13++;
                    if (hashSet3.add(((PdTips) obj14).getCardId())) {
                        arrayList11.add(obj14);
                    }
                }
                return ry.m.O0(ry.m.c1(arrayList11));
            default:
                boolean z13 = this.f29195b;
                ArrayList arrayList12 = new ArrayList();
                int iM = ((o0) xt.b.c()).m();
                ArrayList arrayListB3 = th.j.b(z13);
                int size10 = arrayListB3.size();
                int i24 = 0;
                while (i24 < size10) {
                    Object obj15 = arrayListB3.get(i24);
                    i24++;
                    long jLongValue3 = ((Number) obj15).longValue();
                    k10.g gVarQueryBuilder5 = PdLessonDbHelper.INSTANCE.pdWordDao().queryBuilder();
                    k10.h hVarB2 = PdWordDao.Properties.LessonId.b(Long.valueOf(jLongValue3));
                    org.greenrobot.greendao.d dVar5 = PdWordDao.Properties.Lan;
                    int[] iArr9 = r.f4959a;
                    LingoSkillApplication lingoSkillApplication9 = LingoSkillApplication.f21665b;
                    gVarQueryBuilder5.f(hVarB2, dVar5.b(bq.m.k(x.n().keyLanguage)));
                    List listD5 = gVarQueryBuilder5.d();
                    ArrayList arrayListR5 = e0.r("list(...)", listD5);
                    for (Object obj16 : listD5) {
                        PdWord pdWord3 = (PdWord) obj16;
                        if (pdWord3.getWordStruct() != 2 && pdWord3.getWordStruct() != 3 && pdWord3.getFlag() != -1) {
                            arrayListR5.add(obj16);
                        }
                    }
                    arrayList12.addAll(arrayListR5);
                }
                Collator collator = Collator.getInstance(Locale.CHINA);
                kotlin.jvm.internal.m.e(collator, "getInstance(...)");
                if (iM == 1) {
                    LingoSkillApplication lingoSkillApplication10 = LingoSkillApplication.f21665b;
                    if (x.n().keyLanguage == 0) {
                        p.Z(arrayList12, new com.google.android.material.button.a(collator, 5));
                    } else if (arrayList12.size() > 1) {
                        p.Z(arrayList12, new jh.p(0));
                    }
                }
                Collections.reverse(arrayList12);
                HashSet hashSet4 = new HashSet();
                ArrayList arrayList13 = new ArrayList();
                int size11 = arrayList12.size();
                while (i13 < size11) {
                    Object obj17 = arrayList12.get(i13);
                    i13++;
                    if (hashSet4.add(((PdWord) obj17).getFavId())) {
                        arrayList13.add(obj17);
                    }
                }
                return ry.m.O0(ry.m.c1(arrayList13));
        }
    }
}
