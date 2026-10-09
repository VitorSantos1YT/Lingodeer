package ot;

import com.lingodeer.data.model.CourseCharacter;
import com.lingodeer.data.model.CourseSentence;
import com.lingodeer.data.model.CourseWord;
import com.lingodeer.data.model.DisplayType;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Long[] f45884a = {2044L, 1767L, 440L, 2397L, 2398L, 2562L, 2563L, 2564L, 2565L, 441L, 2566L, 2567L, 2568L, 2569L, 2570L, 2396L};

    public static final x1 a(CourseWord courseWord, List list, vt.n0 n0Var, ht.r rVar) {
        fr.o0 o0Var = (fr.o0) n0Var;
        ArrayList arrayListJ = j(courseWord, o0Var.f27733a.keyLanguage, rVar);
        ArrayList arrayListK = k(courseWord, o0Var.f27733a.keyLanguage, rVar);
        qy.l lVarE = e(courseWord, arrayListJ, list, n0Var, rVar, false);
        List list2 = (List) lVarE.f48495a;
        List list3 = (List) lVarE.f48496b;
        qy.l lVarE2 = e(courseWord, arrayListK, list, n0Var, rVar, true);
        return new x1(CourseWord.copy$default(courseWord, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, arrayListJ, arrayListK, null, null, null, 0, -1, 60, null), list2, list3, (List) lVarE2.f48495a, (List) lVarE2.f48496b);
    }

    public static final ArrayList b(CourseCharacter courseCharacter, int i11) {
        ArrayList arrayList = new ArrayList();
        if (courseCharacter.getZhuYin().length() > 0) {
            if (ry.l.D(new Integer[]{11, 0}, Integer.valueOf(i11))) {
                qy.q qVar = fv.f.f28191a;
                arrayList.add(new fv.a(1L, fv.f.i(courseCharacter.getZhuYin()), fv.f.b(courseCharacter.getZhuYin())));
                if (courseCharacter.getAnimation() == 1) {
                    qy.q qVar2 = fv.b.f28186a;
                    arrayList.add(new fv.a(3L, fv.b.j(courseCharacter.getCharacterId()), fv.g.g(courseCharacter.getCharacterId())));
                    return arrayList;
                }
            } else if (ry.l.D(new Integer[]{12, 1}, Integer.valueOf(i11))) {
                qy.q qVar3 = fv.b.f28186a;
                String strE = fv.b.e(courseCharacter.getZhuYin());
                String zhuyin = courseCharacter.getZhuYin();
                kotlin.jvm.internal.m.f(zhuyin, "zhuyin");
                arrayList.add(new fv.a(0L, strE, fv.b.a(zhuyin, null, null)));
            }
        }
        return arrayList;
    }

    public static final ArrayList c(u1 u1Var, int i11, boolean z11, int i12) {
        xt.a aVarA = xt.b.a();
        boolean z12 = ((fr.o0) xt.b.c()).f27733a.enableNativeSpeakerVideos;
        ArrayList arrayList = new ArrayList();
        if (z11 && z12) {
            if (xt.d.g(i11)) {
                qy.q qVar = fv.b.f28186a;
                arrayList.add(new fv.a(12L, fv.b.d0(u1Var.f46012a.getWordId()), fv.g.A(u1Var.f46012a.getWordId())));
            }
            if (xt.d.w(i11)) {
                qy.q qVar2 = fv.b.f28186a;
                arrayList.add(new fv.a(11L, fv.b.i0(u1Var.f46012a.getWordId()), fv.g.B(u1Var.f46012a.getWordId())));
            }
        }
        for (CourseWord courseWord : u1Var.f46013b) {
            String string = courseWord.getAudioUri().toString();
            kotlin.jvm.internal.m.e(string, "toString(...)");
            if (oz.q.v0(string, "-zy-", false)) {
                if (courseWord.getTranslation().length() > 0) {
                    qy.q qVar3 = fv.b.f28186a;
                    String strE = fv.b.e(courseWord.getTranslation());
                    String zhuyin = courseWord.getTranslation();
                    kotlin.jvm.internal.m.f(zhuyin, "zhuyin");
                    arrayList.add(new fv.a(2L, strE, fv.b.a(zhuyin, null, null)));
                }
            } else if (i12 != -1) {
                qy.q qVar4 = fv.b.f28186a;
                arrayList.add(new fv.a(fv.g.c(courseWord.getWordId(), "m"), defpackage.e.m(aVarA.j(), fv.g.z(courseWord.getWordId(), "m")), fv.g.z(courseWord.getWordId(), "m")));
                arrayList.add(new fv.a(fv.g.c(courseWord.getWordId(), "f"), defpackage.e.m(aVarA.i(), fv.g.z(courseWord.getWordId(), "f")), fv.g.z(courseWord.getWordId(), "f")));
            } else {
                qy.q qVar5 = fv.b.f28186a;
                arrayList.add(new fv.a(2L, fv.b.Z(courseWord.getWordId()), fv.b.V(courseWord.getWordId())));
            }
            if (courseWord.getMainPic().length() > 0) {
                qy.q qVar6 = fv.b.f28186a;
                arrayList.add(new fv.a(3L, fv.b.g0(courseWord.getWordId(), courseWord.getMainPic()), fv.b.e0(courseWord.getWordId(), courseWord.getMainPic())));
            }
        }
        return arrayList;
    }

    public static final List d(List items, fz.c cVar) {
        kotlin.jvm.internal.m.f(items, "items");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : items) {
            if (hashSet.add(cVar.invoke(obj))) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() < 2) {
            return ry.r.f50854a;
        }
        if (arrayList.size() <= 4) {
            return ns.o.K(arrayList);
        }
        if (arrayList.size() % 4 != 1) {
            return ry.m.g1(arrayList, 4, 4);
        }
        List listV0 = ry.m.V0(5, arrayList);
        sy.c cVarO = ns.o.o();
        cVarO.addAll(ry.m.g1(ry.m.l0(5, arrayList), 4, 4));
        cVarO.add(ry.m.U0(listV0, 3));
        cVarO.add(ry.m.k0(listV0, 3));
        return ns.o.e(cVarO);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003c  */
    /* JADX WARN: Code duplicated, block: B:13:0x0042  */
    /* JADX WARN: Code duplicated, block: B:15:0x004e  */
    /* JADX WARN: Code duplicated, block: B:21:0x0079  */
    /* JADX WARN: Code duplicated, block: B:23:0x0081  */
    /* JADX WARN: Code duplicated, block: B:24:0x008a  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ba A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:38:0x00db  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:43:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:47:0x0104  */
    /* JADX WARN: Code duplicated, block: B:48:0x0111  */
    /* JADX WARN: Code duplicated, block: B:53:0x0123  */
    /* JADX WARN: Code duplicated, block: B:65:0x005c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x004c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x00cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x0126 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x002b  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x0120 A[SYNTHETIC] */
    public static final qy.l e(CourseWord courseWord, ArrayList arrayList, List list, vt.n0 n0Var, ht.r rVar, boolean z11) {
        ArrayList arrayList2;
        int size;
        int i11;
        ArrayList arrayList3;
        Iterator it;
        ArrayList arrayListX;
        HashSet hashSet;
        ArrayList arrayList4;
        int size2;
        int i12;
        ArrayList arrayList5;
        int size3;
        int i13;
        Object obj;
        CourseWord courseWord2;
        String strE;
        int size4;
        int i14;
        Object obj2;
        boolean z12;
        CourseWord courseWord3;
        boolean zA;
        Object obj3;
        CourseWord courseWord4;
        String strE2;
        CourseWord courseWord5;
        ArrayList arrayListJ;
        String strE3;
        ArrayList arrayList6 = new ArrayList();
        fr.o0 o0Var = (fr.o0) n0Var;
        int i15 = 0;
        if (xt.d.w(o0Var.f27733a.keyLanguage)) {
            if (ry.l.D(f45884a, Long.valueOf(courseWord.getWordId()))) {
                if (!list.isEmpty()) {
                    arrayList2 = new ArrayList();
                    size = arrayList.size();
                    i11 = 0;
                    while (i11 < size) {
                        Object obj4 = arrayList.get(i11);
                        i11++;
                        strE3 = p1.e((CourseWord) obj4);
                        if (strE3 != null) {
                            arrayList2.add(strE3);
                        }
                    }
                    Set setF1 = ry.m.f1(arrayList2);
                    arrayList3 = new ArrayList(ry.n.W(list, 10));
                    it = list.iterator();
                    while (it.hasNext()) {
                        courseWord5 = (CourseWord) it.next();
                        if (z11) {
                            arrayListJ = k(courseWord5, o0Var.f27733a.keyLanguage, rVar);
                        } else {
                            arrayListJ = j(courseWord5, o0Var.f27733a.keyLanguage, rVar);
                        }
                        arrayList3.add(arrayListJ);
                    }
                    arrayListX = ry.n.X(arrayList3);
                    hashSet = new HashSet();
                    arrayList4 = new ArrayList();
                    size2 = arrayListX.size();
                    i12 = 0;
                    while (i12 < size2) {
                        obj3 = arrayListX.get(i12);
                        i12++;
                        courseWord4 = (CourseWord) obj3;
                        strE2 = p1.e(courseWord4);
                        if (strE2 == null) {
                            if (z11) {
                                strE2 = courseWord4.getZhuYin();
                            } else {
                                strE2 = courseWord4.getWord();
                            }
                        }
                        if (hashSet.add(strE2)) {
                            arrayList4.add(obj3);
                        }
                    }
                    arrayList5 = new ArrayList();
                    size3 = arrayList4.size();
                    i13 = 0;
                    while (i13 < size3) {
                        obj = arrayList4.get(i13);
                        i13++;
                        courseWord2 = (CourseWord) obj;
                        strE = p1.e(courseWord2);
                        if (strE == null && setF1.contains(strE)) {
                            z12 = false;
                        } else {
                            size4 = arrayList.size();
                            i14 = 0;
                            do {
                                if (i14 >= size4) {
                                    obj2 = null;
                                    break;
                                }
                                obj2 = arrayList.get(i14);
                                i14++;
                                courseWord3 = (CourseWord) obj2;
                                if (z11) {
                                    zA = kotlin.jvm.internal.m.a(courseWord3.getZhuYin(), courseWord2.getZhuYin());
                                } else {
                                    zA = kotlin.jvm.internal.m.a(courseWord3.getWord(), courseWord2.getWord());
                                }
                            } while (!zA);
                            if (obj2 == null) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                        }
                        if (z12) {
                            arrayList5.add(obj);
                        }
                    }
                    arrayList6.addAll(ry.m.U0(ns.o.S(arrayList5), 2));
                }
            } else if (xt.d.u(o0Var.f27733a.keyLanguage) && arrayList.size() <= 3) {
                if (!list.isEmpty()) {
                    arrayList2 = new ArrayList();
                    size = arrayList.size();
                    i11 = 0;
                    while (i11 < size) {
                        Object obj5 = arrayList.get(i11);
                        i11++;
                        strE3 = p1.e((CourseWord) obj5);
                        if (strE3 != null) {
                            arrayList2.add(strE3);
                        }
                    }
                    Set setF2 = ry.m.f1(arrayList2);
                    arrayList3 = new ArrayList(ry.n.W(list, 10));
                    it = list.iterator();
                    while (it.hasNext()) {
                        courseWord5 = (CourseWord) it.next();
                        if (z11) {
                            arrayListJ = k(courseWord5, o0Var.f27733a.keyLanguage, rVar);
                        } else {
                            arrayListJ = j(courseWord5, o0Var.f27733a.keyLanguage, rVar);
                        }
                        arrayList3.add(arrayListJ);
                    }
                    arrayListX = ry.n.X(arrayList3);
                    hashSet = new HashSet();
                    arrayList4 = new ArrayList();
                    size2 = arrayListX.size();
                    i12 = 0;
                    while (i12 < size2) {
                        obj3 = arrayListX.get(i12);
                        i12++;
                        courseWord4 = (CourseWord) obj3;
                        strE2 = p1.e(courseWord4);
                        if (strE2 == null) {
                            if (z11) {
                                strE2 = courseWord4.getZhuYin();
                            } else {
                                strE2 = courseWord4.getWord();
                            }
                        }
                        if (hashSet.add(strE2)) {
                            arrayList4.add(obj3);
                        }
                    }
                    arrayList5 = new ArrayList();
                    size3 = arrayList4.size();
                    i13 = 0;
                    while (i13 < size3) {
                        obj = arrayList4.get(i13);
                        i13++;
                        courseWord2 = (CourseWord) obj;
                        strE = p1.e(courseWord2);
                        if (strE == null) {
                            size4 = arrayList.size();
                            i14 = 0;
                            do {
                                if (i14 >= size4) {
                                    obj2 = null;
                                    break;
                                }
                                obj2 = arrayList.get(i14);
                                i14++;
                                courseWord3 = (CourseWord) obj2;
                                if (z11) {
                                    zA = kotlin.jvm.internal.m.a(courseWord3.getZhuYin(), courseWord2.getZhuYin());
                                } else {
                                    zA = kotlin.jvm.internal.m.a(courseWord3.getWord(), courseWord2.getWord());
                                }
                            } while (!zA);
                            if (obj2 == null) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                        } else {
                            size4 = arrayList.size();
                            i14 = 0;
                            do {
                                if (i14 >= size4) {
                                    obj2 = null;
                                    break;
                                }
                                obj2 = arrayList.get(i14);
                                i14++;
                                courseWord3 = (CourseWord) obj2;
                                if (z11) {
                                    zA = kotlin.jvm.internal.m.a(courseWord3.getZhuYin(), courseWord2.getZhuYin());
                                } else {
                                    zA = kotlin.jvm.internal.m.a(courseWord3.getWord(), courseWord2.getWord());
                                }
                            } while (!zA);
                            if (obj2 == null) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                        }
                        if (z12) {
                            arrayList5.add(obj);
                        }
                    }
                    arrayList6.addAll(ry.m.U0(ns.o.S(arrayList5), 2));
                }
            }
        } else if (xt.d.u(o0Var.f27733a.keyLanguage)) {
            if (!list.isEmpty()) {
                arrayList2 = new ArrayList();
                size = arrayList.size();
                i11 = 0;
                while (i11 < size) {
                    Object obj6 = arrayList.get(i11);
                    i11++;
                    strE3 = p1.e((CourseWord) obj6);
                    if (strE3 != null) {
                        arrayList2.add(strE3);
                    }
                }
                Set setF3 = ry.m.f1(arrayList2);
                arrayList3 = new ArrayList(ry.n.W(list, 10));
                it = list.iterator();
                while (it.hasNext()) {
                    courseWord5 = (CourseWord) it.next();
                    if (z11) {
                        arrayListJ = k(courseWord5, o0Var.f27733a.keyLanguage, rVar);
                    } else {
                        arrayListJ = j(courseWord5, o0Var.f27733a.keyLanguage, rVar);
                    }
                    arrayList3.add(arrayListJ);
                }
                arrayListX = ry.n.X(arrayList3);
                hashSet = new HashSet();
                arrayList4 = new ArrayList();
                size2 = arrayListX.size();
                i12 = 0;
                while (i12 < size2) {
                    obj3 = arrayListX.get(i12);
                    i12++;
                    courseWord4 = (CourseWord) obj3;
                    strE2 = p1.e(courseWord4);
                    if (strE2 == null) {
                        if (z11) {
                            strE2 = courseWord4.getZhuYin();
                        } else {
                            strE2 = courseWord4.getWord();
                        }
                    }
                    if (hashSet.add(strE2)) {
                        arrayList4.add(obj3);
                    }
                }
                arrayList5 = new ArrayList();
                size3 = arrayList4.size();
                i13 = 0;
                while (i13 < size3) {
                    obj = arrayList4.get(i13);
                    i13++;
                    courseWord2 = (CourseWord) obj;
                    strE = p1.e(courseWord2);
                    if (strE == null) {
                        size4 = arrayList.size();
                        i14 = 0;
                        do {
                            if (i14 >= size4) {
                                obj2 = null;
                                break;
                            }
                            obj2 = arrayList.get(i14);
                            i14++;
                            courseWord3 = (CourseWord) obj2;
                            if (z11) {
                                zA = kotlin.jvm.internal.m.a(courseWord3.getZhuYin(), courseWord2.getZhuYin());
                            } else {
                                zA = kotlin.jvm.internal.m.a(courseWord3.getWord(), courseWord2.getWord());
                            }
                        } while (!zA);
                        if (obj2 == null) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                    } else {
                        size4 = arrayList.size();
                        i14 = 0;
                        do {
                            if (i14 >= size4) {
                                obj2 = null;
                                break;
                            }
                            obj2 = arrayList.get(i14);
                            i14++;
                            courseWord3 = (CourseWord) obj2;
                            if (z11) {
                                zA = kotlin.jvm.internal.m.a(courseWord3.getZhuYin(), courseWord2.getZhuYin());
                            } else {
                                zA = kotlin.jvm.internal.m.a(courseWord3.getWord(), courseWord2.getWord());
                            }
                        } while (!zA);
                        if (obj2 == null) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                    }
                    if (z12) {
                        arrayList5.add(obj);
                    }
                }
                arrayList6.addAll(ry.m.U0(ns.o.S(arrayList5), 2));
            }
        }
        arrayList6.addAll(arrayList);
        ArrayList arrayList7 = new ArrayList(ry.n.W(arrayList6, 10));
        int size5 = arrayList6.size();
        long j11 = 10000;
        int i16 = 0;
        while (i16 < size5) {
            Object obj7 = arrayList6.get(i16);
            i16++;
            long j12 = 1 + j11;
            arrayList7.add(CourseWord.copy$default((CourseWord) obj7, j12, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, null, null, null, 0, -2, 63, null));
            j11 = j12;
        }
        ArrayList arrayListC1 = ry.m.c1(arrayList7);
        Collections.shuffle(arrayListC1);
        ArrayList arrayList8 = new ArrayList(ry.n.W(arrayList, 10));
        int size6 = arrayList.size();
        while (i15 < size6) {
            Object obj8 = arrayList.get(i15);
            i15++;
            CourseWord courseWord6 = (CourseWord) obj8;
            arrayList8.add(CourseWord.copy$default(courseWord6, 0L, "_", "_", "_", null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, true, false, courseWord6.getWord(), courseWord6.getZhuYin(), courseWord6.getLuoMa(), null, false, false, false, false, false, null, null, null, null, null, null, 0, -30408719, 63, null));
        }
        return new qy.l(ns.o.K(CourseWord.copy$default(courseWord, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, arrayList8, null, null, null, null, 0, -1, 62, null)), arrayListC1);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:27:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:30:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:33:0x0105  */
    /* JADX WARN: Code duplicated, block: B:37:0x0133  */
    /* JADX WARN: Code duplicated, block: B:40:0x013d  */
    /* JADX WARN: Code duplicated, block: B:44:0x016b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0175  */
    /* JADX WARN: Code duplicated, block: B:51:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:54:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:58:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:61:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x021d, code lost:
    
        if (r1 == r3) goto L64;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable f(wt.m r19, long r20, xy.c r22) {
        /*
            Method dump skipped, instruction units count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ot.l1.f(wt.m, long, xy.c):java.io.Serializable");
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00bf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:43:0x010c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0111  */
    /* JADX WARN: Code duplicated, block: B:47:0x011b  */
    /* JADX WARN: Code duplicated, block: B:52:0x014f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    public static final Object g(wt.m mVar, long j11, int i11, boolean z11, xy.c cVar) {
        g0 g0Var;
        boolean z12;
        int i12;
        boolean z13;
        long j12;
        ArrayList arrayList;
        if (cVar instanceof g0) {
            g0Var = (g0) cVar;
            int i13 = g0Var.f45824t;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                g0Var.f45824t = i13 - Integer.MIN_VALUE;
            } else {
                g0Var = new g0(cVar);
            }
        } else {
            g0Var = new g0(cVar);
        }
        Object objV = g0Var.f45823f;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i14 = g0Var.f45824t;
        if (i14 == 0) {
            com.bumptech.glide.e.F(objV);
            gp.r rVarG = mVar.g(j11);
            g0Var.f45818a = mVar;
            g0Var.f45819b = j11;
            g0Var.f45820c = i11;
            g0Var.f45821d = z11;
            g0Var.f45824t = 1;
            objV = uz.x0.v(rVarG, g0Var);
            if (objV != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            z11 = g0Var.f45821d;
            i11 = g0Var.f45820c;
            j11 = g0Var.f45819b;
            mVar = g0Var.f45818a;
            com.bumptech.glide.e.F(objV);
        } else {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z12 = g0Var.f45822e;
            z13 = g0Var.f45821d;
            i12 = g0Var.f45820c;
            j12 = g0Var.f45819b;
            com.bumptech.glide.e.F(objV);
        }
        if (((Boolean) objV).booleanValue()) {
            if (!z12) {
                return ns.o.K(2);
            }
            return ry.r.f50854a;
        }
        arrayList = new ArrayList();
        if (z13 && i12 == 0 && !ns.o.L(195L, 321L, 335L, 619L).contains(Long.valueOf(j12))) {
            arrayList.add(3);
        }
        if (!z12) {
            arrayList.add(2);
        }
        if (z13) {
            arrayList.add(5);
        }
        if (!z12) {
            arrayList.add(8);
        }
        if (ry.l.D(new Integer[]{11, 0}, Integer.valueOf(i12)) || ry.l.D(new Integer[]{12, 1}, Integer.valueOf(i12))) {
            arrayList.add(9);
        }
        arrayList.addAll(ns.o.L(10, 11));
        arrayList.toString();
        return arrayList;
        CourseWord courseWord = (CourseWord) objV;
        if (courseWord != null) {
            boolean zEquals = dt.a0.x(courseWord.getWord()).equals(dt.a0.x(courseWord.getTranslation()));
            if (!kotlin.jvm.internal.m.a(courseWord.getFeatured(), "SPECIFIC")) {
                vt.i0 i0Var = mVar.f55309a;
                gp.r rVar = new gp.r(new bh.b(j11, null, 6));
                yz.f fVar = rz.o0.f50940a;
                uz.i iVarW = uz.x0.w(rVar, yz.e.f58387a);
                g0Var.f45818a = null;
                g0Var.f45819b = j11;
                g0Var.f45820c = i11;
                g0Var.f45821d = z11;
                g0Var.f45822e = zEquals;
                g0Var.f45824t = 2;
                objV = uz.x0.u(iVarW, g0Var);
                if (objV != aVar) {
                    z12 = zEquals;
                    long j13 = j11;
                    i12 = i11;
                    z13 = z11;
                    j12 = j13;
                    if (((Boolean) objV).booleanValue()) {
                        arrayList = new ArrayList();
                        if (z13) {
                            arrayList.add(3);
                        }
                        if (!z12) {
                            arrayList.add(2);
                        }
                        if (z13) {
                            arrayList.add(5);
                        }
                        if (!z12) {
                            arrayList.add(8);
                        }
                        if (ry.l.D(new Integer[]{11, 0}, Integer.valueOf(i12))) {
                            arrayList.add(9);
                        } else {
                            arrayList.add(9);
                        }
                        arrayList.addAll(ns.o.L(10, 11));
                        arrayList.toString();
                        return arrayList;
                    }
                    if (!z12) {
                        return ns.o.K(2);
                    }
                }
                return aVar;
            }
        }
        return ry.r.f50854a;
    }

    public static final ArrayList h(int i11, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            fv.a aVar = (fv.a) obj;
            if (!oz.q.v0(aVar.f28182a, "-.mp3", false) && (!ry.l.D(new Integer[]{12, 1}, Integer.valueOf(i11)) || !oz.x.k0(aVar.f28183b, "-f-zy-p.mp3", false))) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public static final ArrayList i(CourseSentence courseSentence, int i11, boolean z11, int i12) {
        kotlin.jvm.internal.m.f(courseSentence, "courseSentence");
        xt.a aVarA = xt.b.a();
        boolean z12 = ((fr.o0) xt.b.c()).f27733a.enableNativeSpeakerVideos;
        ArrayList arrayList = new ArrayList();
        if (i12 != -1) {
            qy.q qVar = fv.b.f28186a;
            arrayList.add(new fv.a(fv.g.b(courseSentence.getSentenceId(), "m"), defpackage.e.m(aVarA.j(), fv.g.r(courseSentence.getSentenceId(), "m")), fv.g.r(courseSentence.getSentenceId(), "m")));
            arrayList.add(new fv.a(fv.g.b(courseSentence.getSentenceId(), "f"), defpackage.e.m(aVarA.i(), fv.g.r(courseSentence.getSentenceId(), "f")), fv.g.r(courseSentence.getSentenceId(), "f")));
        } else {
            qy.q qVar2 = fv.b.f28186a;
            arrayList.add(new fv.a(2L, fv.b.H(courseSentence.getSentenceId()), fv.b.F(courseSentence.getSentenceId())));
        }
        if (z11 && z12) {
            if (xt.d.g(i11)) {
                qy.q qVar3 = fv.b.f28186a;
                arrayList.add(new fv.a(12L, fv.b.I(courseSentence.getSentenceId()), fv.g.s(courseSentence.getSentenceId())));
            }
            if (xt.d.w(i11)) {
                qy.q qVar4 = fv.b.f28186a;
                arrayList.add(new fv.a(11L, fv.b.J(courseSentence.getSentenceId()), fv.g.t(courseSentence.getSentenceId())));
            }
        }
        for (CourseWord courseWord : courseSentence.getCourseWords()) {
            if (courseWord.getWordType() != 1 && !ry.l.D(new String[]{"F:", "M:", "P:", "H:", "H : ", "F : ", "F1:", "F&M:"}, courseWord.getWord()) && ((i11 != 5 && i11 != 15) || (courseWord.getWordId() != 1858 && courseWord.getWordId() != 544))) {
                if (i12 != -1) {
                    qy.q qVar5 = fv.b.f28186a;
                    arrayList.add(new fv.a(fv.g.c(courseWord.getWordId(), "m"), defpackage.e.m(aVarA.j(), fv.g.z(courseWord.getWordId(), "m")), fv.g.z(courseWord.getWordId(), "m")));
                    arrayList.add(new fv.a(fv.g.c(courseWord.getWordId(), "f"), defpackage.e.m(aVarA.i(), fv.g.z(courseWord.getWordId(), "f")), fv.g.z(courseWord.getWordId(), "f")));
                } else {
                    qy.q qVar6 = fv.b.f28186a;
                    arrayList.add(new fv.a(2L, fv.b.Z(courseWord.getWordId()), fv.b.V(courseWord.getWordId())));
                }
            }
        }
        return arrayList;
    }

    public static final ArrayList j(CourseWord courseWord, int i11, ht.r wordSpellType) {
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
                            return pt.g.c(courseWord);
                    }
                }
                return pt.g.f(courseWord);
            }
            kotlin.jvm.internal.m.f(wordSpellType, "wordSpellType");
            int i12 = k1.f45870a[wordSpellType.ordinal()];
            if (i12 != 1 && i12 != 2 && i12 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            boolean zD = ry.l.D(new Integer[]{12, 1}, Integer.valueOf(i11));
            kotlin.jvm.internal.m.f(courseWord, "<this>");
            int i13 = 0;
            if (!zD) {
                ArrayList arrayListD = pt.g.d(courseWord);
                ArrayList arrayList = new ArrayList(ry.n.W(arrayListD, 10));
                int size = arrayListD.size();
                while (i13 < size) {
                    Object obj = arrayListD.get(i13);
                    i13++;
                    CourseWord courseWord2 = (CourseWord) obj;
                    arrayList.add(CourseWord.copy$default(courseWord2, 0L, courseWord2.getZhuYin(), null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, courseWord2.getZhuYin(), false, false, false, false, false, null, null, null, null, null, null, 0, -33554435, 63, null));
                }
                return arrayList;
            }
            List list = pt.g.f47148a;
            String word = courseWord.getWord();
            ArrayList arrayList2 = new ArrayList(word.length());
            int i14 = 0;
            while (i13 < word.length()) {
                char cCharAt = word.charAt(i13);
                arrayList2.add(CourseWord.copy$default(new CourseWord(i14, String.valueOf(cCharAt), BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, 3, BuildConfig.VERSION_NAME), 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, String.valueOf(cCharAt), false, false, false, false, false, null, null, null, null, null, null, 0, -33554433, 63, null));
                i13++;
                i14++;
            }
            return arrayList2;
        }
        return pt.g.b(courseWord);
    }

    public static final ArrayList k(CourseWord courseWord, int i11, ht.r wordSpellType) {
        int i12 = 0;
        if (i11 == 1 || i11 == 12) {
            kotlin.jvm.internal.m.f(wordSpellType, "wordSpellType");
            if (wordSpellType == ht.r.M9 && ry.l.D(new Integer[]{12, 1}, Integer.valueOf(i11))) {
                i12 = 1;
            }
            kotlin.jvm.internal.m.f(courseWord, "<this>");
            return i12 != 0 ? pt.g.e(courseWord) : pt.g.d(courseWord);
        }
        ArrayList arrayListB = pt.g.b(courseWord);
        ArrayList arrayList = new ArrayList(ry.n.W(arrayListB, 10));
        int size = arrayListB.size();
        while (i12 < size) {
            Object obj = arrayListB.get(i12);
            i12++;
            arrayList.add(CourseWord.copy$default((CourseWord) obj, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, DisplayType.ZHUYIN, null, null, null, null, null, 0, Integer.MAX_VALUE, 63, null));
        }
        return arrayList;
    }
}
