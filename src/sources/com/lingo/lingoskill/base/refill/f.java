package com.lingo.lingoskill.base.refill;

import android.widget.Toast;
import androidx.lifecycle.lifecycle.viewmodel.anchor.hIIS.scqhIrGXy;
import androidx.lifecycle.livedata.HeRS.DytezVyM;
import b7.e0;
import com.google.api.Service;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.AckDao;
import com.lingo.lingoskill.object.DaoSession;
import com.lingo.lingoskill.object.HwCharGroupDao;
import com.lingo.lingoskill.object.HwCharPartDao;
import com.lingo.lingoskill.object.HwCharacterDao;
import com.lingo.lingoskill.object.HwTCharPartDao;
import com.lingo.lingoskill.object.JPChar;
import com.lingo.lingoskill.object.JPCharDao;
import com.lingo.lingoskill.object.JPCharPart;
import com.lingo.lingoskill.object.JPCharPartDao;
import com.lingo.lingoskill.object.KOChar;
import com.lingo.lingoskill.object.KOCharDao;
import com.lingo.lingoskill.object.KOCharPart;
import com.lingo.lingoskill.object.KOCharPartDao;
import com.lingo.lingoskill.object.Lesson;
import com.lingo.lingoskill.object.LessonDao;
import com.lingo.lingoskill.object.Level;
import com.lingo.lingoskill.object.LevelDao;
import com.lingo.lingoskill.object.Model_Sentence_000Dao;
import com.lingo.lingoskill.object.Model_Sentence_010Dao;
import com.lingo.lingoskill.object.Model_Sentence_020Dao;
import com.lingo.lingoskill.object.Model_Sentence_030Dao;
import com.lingo.lingoskill.object.Model_Sentence_040Dao;
import com.lingo.lingoskill.object.Model_Sentence_050Dao;
import com.lingo.lingoskill.object.Model_Sentence_060Dao;
import com.lingo.lingoskill.object.Model_Sentence_070Dao;
import com.lingo.lingoskill.object.Model_Sentence_080Dao;
import com.lingo.lingoskill.object.Model_Sentence_090Dao;
import com.lingo.lingoskill.object.Model_Sentence_100Dao;
import com.lingo.lingoskill.object.Model_Word_010Dao;
import com.lingo.lingoskill.object.SentenceDao;
import com.lingo.lingoskill.object.Unit;
import com.lingo.lingoskill.object.UnitDao;
import com.lingo.lingoskill.object.WordDao;
import com.tbruyelle.rxpermissions3.BuildConfig;
import dt.Xk.wuoM;
import hh.p0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;
import nv.p;
import oz.x;
import ry.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class f implements tx.c, tx.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f21700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ org.greenrobot.greendao.a f21701c;

    public /* synthetic */ f(org.greenrobot.greendao.a aVar, Object obj, int i11) {
        this.f21699a = i11;
        this.f21701c = aVar;
        this.f21700b = obj;
    }

    @Override // tx.c
    public void accept(Object obj) {
        List listK;
        List listT;
        List listK2;
        int i11 = this.f21699a;
        String str = wuoM.BuslL;
        Object obj2 = this.f21700b;
        org.greenrobot.greendao.a aVar = this.f21701c;
        int i12 = 1;
        switch (i11) {
            case 0:
                List koLevels = (List) obj;
                kotlin.jvm.internal.m.f(koLevels, "koLevels");
                LevelDao levelDao = (LevelDao) aVar;
                levelDao.deleteAll();
                levelDao.insertOrReplaceInTx(koLevels);
                h hVar = (h) obj2;
                hVar.f21722g++;
                h.a(hVar);
                ((i) com.google.android.material.datepicker.d.i(i.class, hVar.f21717b, "create(...)")).getUnits().f(j.M).k(ky.e.f38937b).g(px.b.a()).h(new f(hVar.f21720e.getUnitDao(), hVar, 1), g.N);
                break;
            case 1:
                List koUnits = (List) obj;
                kotlin.jvm.internal.m.f(koUnits, "koUnits");
                UnitDao unitDao = (UnitDao) aVar;
                unitDao.deleteAll();
                unitDao.insertOrReplaceInTx(koUnits);
                h hVar2 = (h) obj2;
                DaoSession daoSession = hVar2.f21720e;
                String str2 = hVar2.f21718c;
                String str3 = hVar2.f21719d;
                kotlin.jvm.internal.m.f(daoSession, "daoSession");
                UnitDao unitDao2 = daoSession.getUnitDao();
                Iterator<Object> it = daoSession.getLevelDao().loadAll().iterator();
                int i13 = 0;
                while (it.hasNext()) {
                    Level level = (Level) it.next();
                    ArrayList arrayList = new ArrayList();
                    e00.i iVarA = kotlin.jvm.internal.l.a(ew.a.v(level.getUnitList()));
                    while (iVarA.hasNext()) {
                        Long l9 = (Long) iVarA.next();
                        if (unitDao2.load(l9) != null) {
                            arrayList.add(unitDao2.load(l9));
                        }
                    }
                    Iterator it2 = arrayList.iterator();
                    kotlin.jvm.internal.m.e(it2, "iterator(...)");
                    int i14 = 0;
                    while (true) {
                        int i15 = i12;
                        String str4 = "getUnitName(...)";
                        if (it2.hasNext()) {
                            DaoSession daoSession2 = daoSession;
                            Object next = it2.next();
                            kotlin.jvm.internal.m.e(next, "next(...)");
                            Unit unit = (Unit) next;
                            Long[] lArrV = ew.a.v(level.getUnitList());
                            Iterator<Object> it3 = it;
                            List listAsList = Arrays.asList(Arrays.copyOf(lArrV, lArrV.length));
                            int i16 = i13;
                            unit.setLevelId((int) level.getLevelId());
                            String unitName = unit.getUnitName();
                            kotlin.jvm.internal.m.e(unitName, "getUnitName(...)");
                            if (x.s0(unitName, "TESTOUT", false)) {
                                i14++;
                            } else {
                                unit.setSortIndex((listAsList.indexOf(Long.valueOf(unit.getUnitId())) + 1) - i14);
                            }
                            it = it3;
                            daoSession = daoSession2;
                            i12 = i15;
                            i13 = i16;
                        } else {
                            DaoSession daoSession3 = daoSession;
                            Iterator<Object> it4 = it;
                            int i17 = i13;
                            Matcher matcherW = p.w(0, "\n", "compile(...)", str2);
                            if (matcherW.find()) {
                                ArrayList arrayList2 = new ArrayList(10);
                                int iC = 0;
                                while (true) {
                                    iC = p.c(matcherW, str2, iC, arrayList2);
                                    if (matcherW.find()) {
                                        i15 = 1;
                                    } else {
                                        p.B(iC, str2, arrayList2);
                                        listK = arrayList2;
                                    }
                                }
                            } else {
                                listK = ns.o.K(str2.toString());
                            }
                            boolean zIsEmpty = listK.isEmpty();
                            List listT2 = r.f50854a;
                            if (zIsEmpty) {
                                listT = listT2;
                            } else {
                                ListIterator listIterator = listK.listIterator(listK.size());
                                while (true) {
                                    if (!listIterator.hasPrevious()) {
                                        listT = listT2;
                                    } else if (((String) listIterator.previous()).length() != 0) {
                                        listT = e0.t(listIterator, i15, listK);
                                    }
                                }
                            }
                            String[] strArr = (String[]) listT.toArray(new String[0]);
                            Matcher matcherW2 = p.w(0, "\n", "compile(...)", str3);
                            if (matcherW2.find()) {
                                ArrayList arrayList3 = new ArrayList(10);
                                int iC2 = 0;
                                do {
                                    iC2 = p.c(matcherW2, str3, iC2, arrayList3);
                                } while (matcherW2.find());
                                p.B(iC2, str3, arrayList3);
                                listK2 = arrayList3;
                            } else {
                                listK2 = ns.o.K(str3.toString());
                            }
                            if (!listK2.isEmpty()) {
                                ListIterator listIterator2 = listK2.listIterator(listK2.size());
                                while (listIterator2.hasPrevious()) {
                                    if (((String) listIterator2.previous()).length() != 0) {
                                        listT2 = e0.t(listIterator2, 1, listK2);
                                    }
                                }
                            }
                            String[] strArr2 = (String[]) listT2.toArray(new String[0]);
                            int size = arrayList.size();
                            int i18 = i17;
                            int i19 = 0;
                            while (i19 < size) {
                                Object obj3 = arrayList.get(i19);
                                kotlin.jvm.internal.m.e(obj3, "get(...)");
                                Unit unit2 = (Unit) obj3;
                                String unitName2 = unit2.getUnitName();
                                kotlin.jvm.internal.m.e(unitName2, str4);
                                String[] strArr3 = strArr2;
                                if (x.s0(unitName2, "TESTOUT", false) || i18 >= strArr.length) {
                                    i19 = i19;
                                } else {
                                    String strQ0 = x.q0(strArr[i18], ".png", BuildConfig.VERSION_NAME);
                                    int length = strQ0.length() - 1;
                                    int i21 = 0;
                                    boolean z11 = false;
                                    while (true) {
                                        i19 = i19;
                                        if (i21 <= length) {
                                            boolean z12 = kotlin.jvm.internal.m.h(strQ0.charAt(!z11 ? i21 : length), 32) <= 0;
                                            if (z11) {
                                                if (z12) {
                                                    length--;
                                                }
                                            } else if (z12) {
                                                i21++;
                                            } else {
                                                z11 = true;
                                            }
                                        }
                                    }
                                    String strG = w4.c.g(strQ0, length, 1, i21);
                                    String strQ1 = x.q0(strArr3[i18], ".png", BuildConfig.VERSION_NAME);
                                    int length2 = strQ1.length() - 1;
                                    int i22 = 0;
                                    boolean z13 = false;
                                    while (i22 <= length2) {
                                        boolean z14 = kotlin.jvm.internal.m.h(strQ1.charAt(!z13 ? i22 : length2), 32) <= 0;
                                        if (z13) {
                                            if (z14) {
                                                length2--;
                                            } else {
                                                unit2.setIconResSuffix(strG + ";" + w4.c.g(strQ1, length2, 1, i22));
                                                i18++;
                                            }
                                        } else if (z14) {
                                            i22++;
                                        } else {
                                            z13 = true;
                                        }
                                    }
                                    unit2.setIconResSuffix(strG + ";" + w4.c.g(strQ1, length2, 1, i22));
                                    i18++;
                                }
                                i19++;
                                strArr2 = strArr3;
                                size = size;
                                str2 = str2;
                                str3 = str3;
                                str4 = str4;
                            }
                            unitDao2.updateInTx(arrayList);
                            it = it4;
                            i13 = i18;
                            daoSession = daoSession3;
                            i12 = 1;
                        }
                    }
                }
                hVar2.f21722g++;
                h.a(hVar2);
                ((i) com.google.android.material.datepicker.d.i(i.class, hVar2.f21717b, "create(...)")).r().f(g.Y).k(ky.e.f38937b).g(px.b.a()).h(new f(daoSession.getLessonDao(), hVar2, 11), b.f21680c0);
                break;
            case 2:
            case 6:
            case 8:
            default:
                List koWords = (List) obj;
                kotlin.jvm.internal.m.f(koWords, "koWords");
                WordDao wordDao = (WordDao) aVar;
                wordDao.deleteAll();
                wordDao.insertOrReplaceInTx(koWords);
                h hVar3 = (h) obj2;
                hVar3.f21722g++;
                h.a(hVar3);
                break;
            case 3:
                List hwTCharParts = (List) obj;
                kotlin.jvm.internal.m.f(hwTCharParts, "hwTCharParts");
                ((HwCharGroupDao) aVar).insertOrReplaceInTx(hwTCharParts);
                c cVar = (c) obj2;
                cVar.f21694e++;
                c.a(cVar);
                break;
            case 4:
                List t6 = (List) obj;
                kotlin.jvm.internal.m.f(t6, "t");
                ((HwCharPartDao) aVar).insertOrReplaceInTx(t6);
                c cVar2 = (c) obj2;
                cVar2.f21694e++;
                c.a(cVar2);
                break;
            case 5:
                List hwTCharParts2 = (List) obj;
                kotlin.jvm.internal.m.f(hwTCharParts2, "hwTCharParts");
                ((HwTCharPartDao) aVar).insertOrReplaceInTx(hwTCharParts2);
                c cVar3 = (c) obj2;
                cVar3.f21694e++;
                c.a(cVar3);
                break;
            case 7:
                List t8 = (List) obj;
                kotlin.jvm.internal.m.f(t8, "t");
                JPCharPartDao jPCharPartDao = (JPCharPartDao) aVar;
                jPCharPartDao.deleteAll();
                jPCharPartDao.insertOrReplaceInTx(t8);
                c cVar4 = (c) obj2;
                int i23 = cVar4.f21694e + 1;
                cVar4.f21694e = i23;
                if (i23 >= 2) {
                    Toast.makeText(cVar4.f21691b, "更新完成", 0).show();
                    p0.w(0, f10.e.b());
                    cVar4.f21693d.dismiss();
                }
                break;
            case 9:
                List<JPCharPart> t11 = (List) obj;
                kotlin.jvm.internal.m.f(t11, "t");
                KOCharPartDao kOCharPartDao = (KOCharPartDao) aVar;
                kOCharPartDao.deleteAll();
                ArrayList arrayList4 = new ArrayList(ry.n.W(t11, 10));
                for (JPCharPart jPCharPart : t11) {
                    KOCharPart kOCharPart = new KOCharPart();
                    kOCharPart.setPartId(jPCharPart.getPartId());
                    kOCharPart.setCharId(jPCharPart.getCharId());
                    kOCharPart.setPartIndex(jPCharPart.getPartIndex());
                    kOCharPart.setPartPath(jPCharPart.getPartPath());
                    kOCharPart.setPartDirection(jPCharPart.getPartDirection());
                    arrayList4.add(kOCharPart);
                }
                kOCharPartDao.insertOrReplaceInTx(arrayList4);
                c cVar5 = (c) obj2;
                int i24 = cVar5.f21694e + 1;
                cVar5.f21694e = i24;
                if (i24 >= 2) {
                    Toast.makeText(cVar5.f21691b, "更新完成", 0).show();
                    p0.w(0, f10.e.b());
                    cVar5.f21693d.dismiss();
                }
                break;
            case 10:
                List koWordModel010s = (List) obj;
                kotlin.jvm.internal.m.f(koWordModel010s, "koWordModel010s");
                AckDao ackDao = (AckDao) aVar;
                ackDao.deleteAll();
                ackDao.insertOrReplaceInTx(koWordModel010s);
                h hVar4 = (h) obj2;
                hVar4.f21722g++;
                h.a(hVar4);
                break;
            case 11:
                List koLessons = (List) obj;
                kotlin.jvm.internal.m.f(koLessons, "koLessons");
                LessonDao lessonDao = (LessonDao) aVar;
                lessonDao.deleteAll();
                lessonDao.insertOrReplaceInTx(koLessons);
                h hVar5 = (h) obj2;
                DaoSession daoSession4 = hVar5.f21720e;
                kotlin.jvm.internal.m.f(daoSession4, "daoSession");
                LessonDao lessonDao2 = daoSession4.getLessonDao();
                List<Object> listLoadAll = lessonDao2.loadAll();
                Iterator<Object> it5 = listLoadAll.iterator();
                while (it5.hasNext()) {
                    Lesson lesson = (Lesson) it5.next();
                    try {
                        Long[] lArrV2 = ew.a.v(((Unit) daoSession4.getUnitDao().load(Long.valueOf(lesson.getUnitId()))).getLessonList());
                        lesson.setSortIndex(Arrays.asList(Arrays.copyOf(lArrV2, lArrV2.length)).indexOf(Long.valueOf(lesson.getLessonId())) + 1);
                    } catch (Exception e8) {
                        lesson.getUnitId();
                        lesson.getLessonId();
                        lesson.getDescription();
                        e8.printStackTrace();
                    }
                }
                lessonDao2.insertOrReplaceInTx(listLoadAll);
                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                if (cf.x.n().keyLanguage == 1 || cf.x.n().keyLanguage == 12) {
                    Lesson lesson2 = new Lesson();
                    lesson2.setLessonId(10000L);
                    lesson2.setLessonName(com.bumptech.glide.d.m("44HD44P744HF44P744HH44P744HJ44P744HL"));
                    lesson2.setDescription(com.bumptech.glide.d.m("44HD44P744HF44P744HH44P744HJ44P744HL"));
                    lesson2.setWordList(com.bumptech.glide.d.m("44Lj44P744Ll44P744Ln44P744Lp44P744Lr"));
                    lesson2.setLevelId(1L);
                    lesson2.setUnitId(-1L);
                    lesson2.setSortIndex(1);
                    lessonDao.insertOrReplace(lesson2);
                    Lesson lesson3 = new Lesson();
                    lesson3.setLessonId(10001L);
                    lesson3.setLessonName(com.bumptech.glide.d.m("44HM44P744HO44P744HQ44P744HS44P744HU"));
                    lesson3.setDescription(com.bumptech.glide.d.m("44HM44P744HO44P744HQ44P744HS44P744HU"));
                    lesson3.setWordList(com.bumptech.glide.d.m("44Ls44P744Lu44P744Lw44P744Ly44P744La"));
                    lesson3.setLevelId(1L);
                    lesson3.setUnitId(-1L);
                    lesson3.setSortIndex(2);
                    lessonDao.insertOrReplace(lesson3);
                    Lesson lesson4 = new Lesson();
                    lesson4.setLessonId(10002L);
                    lesson4.setLessonName(com.bumptech.glide.d.m("44HW44P744HY44P744HA44P744Hc44P744He"));
                    lesson4.setDescription(com.bumptech.glide.d.m("44HW44P744HY44P744HA44P744Hc44P744He"));
                    lesson4.setWordList(com.bumptech.glide.d.m("44L144P744L344P744L544P744L744P744L9"));
                    lesson4.setLevelId(1L);
                    lesson4.setUnitId(-1L);
                    lesson4.setSortIndex(3);
                    lessonDao.insertOrReplace(lesson4);
                    Lesson lesson5 = new Lesson();
                    lesson5.setLessonId(10003L);
                    lesson5.setLessonName(com.bumptech.glide.d.m("44Hg44P744Hi44P744Hl44P744Hn44P744Hp"));
                    lesson5.setDescription(com.bumptech.glide.d.m("44Hg44P744Hi44P744Hl44P744Hn44P744Hp"));
                    lesson5.setWordList("タ・チ・ツ・テ・ト");
                    lesson5.setLevelId(1L);
                    lesson5.setUnitId(-1L);
                    lesson5.setSortIndex(4);
                    lessonDao.insertOrReplace(lesson5);
                    Lesson lesson6 = new Lesson();
                    lesson6.setLessonId(10004L);
                    lesson6.setLessonName(com.bumptech.glide.d.m("44Hr44P744Hs44P744Ht44P744Hu44P744Hv"));
                    lesson6.setDescription(com.bumptech.glide.d.m("44Hr44P744Hs44P744Ht44P744Hu44P744Hv"));
                    lesson6.setWordList(com.bumptech.glide.d.m("44PL44P744PM44P744PN44P744PO44P744PP"));
                    lesson6.setLevelId(1L);
                    lesson6.setUnitId(-1L);
                    lesson6.setSortIndex(5);
                    lessonDao.insertOrReplace(lesson6);
                    Lesson lesson7 = new Lesson();
                    lesson7.setLessonId(10005L);
                    lesson7.setLessonName(com.bumptech.glide.d.m("44Hw44P744Hz44P744H144P744H444P744H7"));
                    lesson7.setDescription(com.bumptech.glide.d.m("44Hw44P744Hz44P744H144P744H444P744H7"));
                    lesson7.setWordList(com.bumptech.glide.d.m("44PQ44P744PT44P744PW44P744H444P744Pc"));
                    lesson7.setLevelId(1L);
                    lesson7.setUnitId(-1L);
                    lesson7.setSortIndex(6);
                    lessonDao.insertOrReplace(lesson7);
                    Lesson lesson8 = new Lesson();
                    lesson8.setLessonId(10006L);
                    lesson8.setLessonName(com.bumptech.glide.d.m("44H+44P744H/44P744LB44P744LC44P744LD44P744LF44P744LH44P744LJ"));
                    lesson8.setDescription(com.bumptech.glide.d.m("44H+44P744H/44P744LB44P744LC44P744LD44P744LF44P744LH44P744LJ"));
                    lesson8.setWordList(com.bumptech.glide.d.m(scqhIrGXy.Zxa));
                    lesson8.setLevelId(1L);
                    lesson8.setUnitId(-1L);
                    lesson8.setSortIndex(7);
                    lessonDao.insertOrReplace(lesson8);
                    Lesson lesson9 = new Lesson();
                    lesson9.setLessonId(10007L);
                    lesson9.setLessonName(com.bumptech.glide.d.m("44LK44P744LL44P744LM44P744LN44P744LO44P744LQ44P744LT44P744LU"));
                    lesson9.setDescription(com.bumptech.glide.d.m("44LK44P744LL44P744LM44P744LN44P744LO44P744LQ44P744LT44P744LU"));
                    lesson9.setWordList(com.bumptech.glide.d.m("44Pq44P744Pr44P744Ps44P744Pt44P744Pu44P744Pw44P744Pz44P744Pa"));
                    lesson9.setLevelId(1L);
                    lesson9.setUnitId(-1L);
                    lesson9.setSortIndex(8);
                    lessonDao.insertOrReplace(lesson9);
                }
                hVar5.f21722g++;
                h.a(hVar5);
                break;
            case 12:
                List list = (List) obj;
                kotlin.jvm.internal.m.f(list, str);
                Model_Sentence_000Dao model_Sentence_000Dao = (Model_Sentence_000Dao) aVar;
                model_Sentence_000Dao.deleteAll();
                model_Sentence_000Dao.insertOrReplaceInTx(list);
                h hVar6 = (h) obj2;
                hVar6.f21722g++;
                h.a(hVar6);
                break;
            case 13:
                List list2 = (List) obj;
                kotlin.jvm.internal.m.f(list2, str);
                Model_Sentence_010Dao model_Sentence_010Dao = (Model_Sentence_010Dao) aVar;
                model_Sentence_010Dao.deleteAll();
                model_Sentence_010Dao.insertOrReplaceInTx(list2);
                h hVar7 = (h) obj2;
                hVar7.f21722g++;
                h.a(hVar7);
                break;
            case 14:
                List koSentenceModel020s = (List) obj;
                kotlin.jvm.internal.m.f(koSentenceModel020s, "koSentenceModel020s");
                Model_Sentence_020Dao model_Sentence_020Dao = (Model_Sentence_020Dao) aVar;
                model_Sentence_020Dao.deleteAll();
                model_Sentence_020Dao.insertOrReplaceInTx(koSentenceModel020s);
                h hVar8 = (h) obj2;
                hVar8.f21722g++;
                h.a(hVar8);
                break;
            case 15:
                List koSentenceModel030s = (List) obj;
                kotlin.jvm.internal.m.f(koSentenceModel030s, "koSentenceModel030s");
                Model_Sentence_030Dao model_Sentence_030Dao = (Model_Sentence_030Dao) aVar;
                model_Sentence_030Dao.deleteAll();
                model_Sentence_030Dao.insertOrReplaceInTx(koSentenceModel030s);
                h hVar9 = (h) obj2;
                hVar9.f21722g++;
                h.a(hVar9);
                break;
            case 16:
                List koSentenceModel040s = (List) obj;
                kotlin.jvm.internal.m.f(koSentenceModel040s, "koSentenceModel040s");
                Model_Sentence_040Dao model_Sentence_040Dao = (Model_Sentence_040Dao) aVar;
                model_Sentence_040Dao.deleteAll();
                model_Sentence_040Dao.insertOrReplaceInTx(koSentenceModel040s);
                h hVar10 = (h) obj2;
                hVar10.f21722g++;
                h.a(hVar10);
                break;
            case 17:
                List koSentenceModel050s = (List) obj;
                kotlin.jvm.internal.m.f(koSentenceModel050s, "koSentenceModel050s");
                Model_Sentence_050Dao model_Sentence_050Dao = (Model_Sentence_050Dao) aVar;
                model_Sentence_050Dao.deleteAll();
                model_Sentence_050Dao.insertOrReplaceInTx(koSentenceModel050s);
                h hVar11 = (h) obj2;
                hVar11.f21722g++;
                h.a(hVar11);
                break;
            case 18:
                List koSentenceModel060s = (List) obj;
                kotlin.jvm.internal.m.f(koSentenceModel060s, "koSentenceModel060s");
                Model_Sentence_060Dao model_Sentence_060Dao = (Model_Sentence_060Dao) aVar;
                model_Sentence_060Dao.deleteAll();
                model_Sentence_060Dao.insertOrReplaceInTx(koSentenceModel060s);
                h hVar12 = (h) obj2;
                hVar12.f21722g++;
                h.a(hVar12);
                break;
            case 19:
                List koSentenceModel070s = (List) obj;
                kotlin.jvm.internal.m.f(koSentenceModel070s, "koSentenceModel070s");
                Model_Sentence_070Dao model_Sentence_070Dao = (Model_Sentence_070Dao) aVar;
                model_Sentence_070Dao.deleteAll();
                model_Sentence_070Dao.insertOrReplaceInTx(koSentenceModel070s);
                h hVar13 = (h) obj2;
                hVar13.f21722g++;
                h.a(hVar13);
                break;
            case 20:
                List koSentenceModel080s = (List) obj;
                kotlin.jvm.internal.m.f(koSentenceModel080s, "koSentenceModel080s");
                Model_Sentence_080Dao model_Sentence_080Dao = (Model_Sentence_080Dao) aVar;
                model_Sentence_080Dao.deleteAll();
                model_Sentence_080Dao.insertOrReplaceInTx(koSentenceModel080s);
                h hVar14 = (h) obj2;
                hVar14.f21722g++;
                h.a(hVar14);
                break;
            case 21:
                List koSentenceModel100s = (List) obj;
                kotlin.jvm.internal.m.f(koSentenceModel100s, "koSentenceModel100s");
                ((Model_Sentence_090Dao) aVar).insertOrReplaceInTx(koSentenceModel100s);
                h hVar15 = (h) obj2;
                hVar15.f21722g++;
                h.a(hVar15);
                break;
            case 22:
                List koSentenceModel100s2 = (List) obj;
                kotlin.jvm.internal.m.f(koSentenceModel100s2, "koSentenceModel100s");
                Model_Sentence_100Dao model_Sentence_100Dao = (Model_Sentence_100Dao) aVar;
                model_Sentence_100Dao.deleteAll();
                model_Sentence_100Dao.insertOrReplaceInTx(koSentenceModel100s2);
                h hVar16 = (h) obj2;
                hVar16.f21722g++;
                h.a(hVar16);
                break;
            case 23:
                List koSentences = (List) obj;
                kotlin.jvm.internal.m.f(koSentences, "koSentences");
                SentenceDao sentenceDao = (SentenceDao) aVar;
                sentenceDao.deleteAll();
                sentenceDao.insertOrReplaceInTx(koSentences);
                h hVar17 = (h) obj2;
                hVar17.f21722g++;
                h.a(hVar17);
                break;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                List koWordModel010s2 = (List) obj;
                kotlin.jvm.internal.m.f(koWordModel010s2, "koWordModel010s");
                Model_Word_010Dao model_Word_010Dao = (Model_Word_010Dao) aVar;
                model_Word_010Dao.deleteAll();
                model_Word_010Dao.insertOrReplaceInTx(koWordModel010s2);
                h hVar18 = (h) obj2;
                hVar18.f21722g++;
                h.a(hVar18);
                break;
        }
    }

    @Override // tx.d
    public Object apply(Object obj) {
        switch (this.f21699a) {
            case 2:
                List it = (List) obj;
                kotlin.jvm.internal.m.f(it, "it");
                ((HwCharacterDao) this.f21701c).insertOrReplaceInTx(it);
                ((c) this.f21700b).f21694e++;
                break;
            case 6:
                List it2 = (List) obj;
                kotlin.jvm.internal.m.f(it2, "it");
                JPCharDao jPCharDao = (JPCharDao) this.f21701c;
                jPCharDao.deleteAll();
                jPCharDao.insertOrReplaceInTx(it2);
                ((c) this.f21700b).f21694e++;
                break;
            default:
                List<JPChar> list = (List) obj;
                kotlin.jvm.internal.m.f(list, DytezVyM.SokVRSUYi);
                KOCharDao kOCharDao = (KOCharDao) this.f21701c;
                kOCharDao.deleteAll();
                ArrayList arrayList = new ArrayList(ry.n.W(list, 10));
                for (JPChar jPChar : list) {
                    KOChar kOChar = new KOChar();
                    kOChar.setCharId(jPChar.getCharId());
                    kOChar.setCharacter(jPChar.getCharacter());
                    kOChar.setCharPath(jPChar.getCharPath());
                    arrayList.add(kOChar);
                }
                kOCharDao.insertOrReplaceInTx(arrayList);
                ((c) this.f21700b).f21694e++;
                break;
        }
        return Boolean.TRUE;
    }
}
