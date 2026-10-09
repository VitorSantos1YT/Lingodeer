package ep;

import android.util.Log;
import bp.i4;
import bq.r;
import cf.x;
import com.lingo.fluent.object.PdLessonDbHelper;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.PdTips;
import com.lingo.lingoskill.object.PdTipsDao;
import com.lingo.lingoskill.object.TravelCategory;
import com.lingo.lingoskill.object.Unit;
import com.lingodeer.data.model.Main;
import fr.o0;
import fv.g;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import jh.j;
import k10.h;
import kotlin.jvm.internal.m;
import qy.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f25727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f25728c;

    public /* synthetic */ d(boolean z11, Object obj, int i11) {
        this.f25726a = i11;
        this.f25727b = z11;
        this.f25728c = obj;
    }

    private final Object a() {
        String strD;
        long j11;
        long j12;
        int size;
        List list;
        int size2;
        int iC;
        boolean z11 = this.f25727b;
        f fVar = (f) this.f25728c;
        if (z11) {
            fVar.f25733e.clear();
        }
        int size3 = 1;
        long j13 = 2;
        if (fVar.f25733e.isEmpty()) {
            if (m.a(((i4) fVar.f25729a).P, "m")) {
                Main mainB = xt.b.e().b();
                strD = (mainB == null || mainB.getAlphatable_m() != 1) ? xt.b.a().c() : xt.b.a().d();
            } else {
                Main mainB2 = xt.b.e().b();
                strD = (mainB2 == null || mainB2.getAlphatable_f() != 1) ? xt.b.a().d() : xt.b.a().c();
            }
            ArrayList arrayList = new ArrayList();
            j11 = -1;
            try {
                dp.a aVar = fVar.f25729a;
                long j14 = ((i4) aVar).O;
                try {
                    if (j14 == -1) {
                        Iterator it = fVar.f25735t.iterator();
                        m.e(it, "iterator(...)");
                        while (it.hasNext()) {
                            Object next = it.next();
                            m.e(next, "next(...)");
                            long jLongValue = ((Number) next).longValue();
                            if (fVar.f()) {
                                q qVar = fv.b.f28186a;
                                String strI = fv.b.i(jLongValue);
                                String strF = fv.b.f(jLongValue);
                                if (!new File(xt.b.a().g() + strF).exists()) {
                                    arrayList.add(new fv.a(1L, strI, strF));
                                }
                            }
                            q qVar2 = fv.b.f28186a;
                            String strQ = fv.b.q(jLongValue);
                            String strN = fv.b.n(jLongValue);
                            if (!new File(xt.b.a().h() + strN).exists()) {
                                arrayList.add(new fv.a(2L, strQ, strN));
                            }
                            String strK = g.k(jLongValue);
                            String strS = fv.b.s(jLongValue);
                            if (!new File(xt.b.a().k() + strS).exists()) {
                                arrayList.add(new fv.a(3L, strK, strS));
                            }
                            if (((o0) xt.b.c()).f27733a.enableNativeSpeakerVideos && xt.d.j(((o0) xt.b.c()).f27733a.keyLanguage)) {
                                if (xt.d.w(((o0) xt.b.c()).f27733a.keyLanguage)) {
                                    fv.a aVar2 = new fv.a(8L, fv.b.t(jLongValue), fv.b.u(jLongValue));
                                    if (!new File(aVar2.f28184c).exists()) {
                                        arrayList.add(aVar2);
                                    }
                                }
                                if (xt.d.g(((o0) xt.b.c()).f27733a.keyLanguage)) {
                                    fv.a aVar3 = new fv.a(12L, fv.b.r(jLongValue), fv.b.u(jLongValue));
                                    if (!new File(aVar3.f28184c).exists()) {
                                        arrayList.add(aVar3);
                                    }
                                }
                            }
                        }
                        if (fVar.g()) {
                            ArrayList arrayList2 = fVar.H;
                            int size4 = arrayList2.size();
                            int i11 = 0;
                            while (i11 < size4) {
                                Object obj = arrayList2.get(i11);
                                i11++;
                                m.e(obj, "next(...)");
                                Unit unit = (Unit) obj;
                                if (unit.getSortIndex() >= 1) {
                                    q qVar3 = fv.b.f28186a;
                                    String strP = fv.b.P(unit.getSortIndex());
                                    String strO = fv.b.O(unit.getSortIndex());
                                    if (!new File(xt.b.a().o() + strO).exists()) {
                                        arrayList.add(new fv.a(4L, strP, strO));
                                    }
                                    String strU = g.u(unit.getSortIndex());
                                    String strK2 = fv.b.K(unit.getSortIndex());
                                    if (!new File(xt.b.a().q() + strK2).exists()) {
                                        arrayList.add(new fv.a(5L, strU, strK2));
                                    }
                                    j13 = j13;
                                }
                            }
                        }
                        j12 = j13;
                        if (fVar.h()) {
                            if (dj.b.f23431e == null) {
                                synchronized (dj.b.class) {
                                    if (dj.b.f23431e == null) {
                                        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                                        m.c(lingoSkillApplication);
                                        dj.b.f23431e = new dj.b(lingoSkillApplication);
                                    }
                                }
                            }
                            dj.b bVar = dj.b.f23431e;
                            m.c(bVar);
                            for (TravelCategory travelCategory : bVar.a()) {
                                q qVar4 = fv.b.f28186a;
                                String strT = fv.b.T(travelCategory.getCategoryId());
                                String strS2 = fv.b.S(travelCategory.getCategoryId());
                                if (!new File(xt.b.a().n() + strS2).exists()) {
                                    arrayList.add(new fv.a(7L, strT, strS2));
                                }
                            }
                        }
                        arrayList.addAll(fVar.d(xt.b.a().b(), true));
                    } else {
                        j12 = 2;
                        if (j14 == 0) {
                            arrayList.addAll(fVar.d(m.a(((i4) aVar).P, "m") ? xt.b.a().d() : xt.b.a().c(), false));
                        } else {
                            size = (j14 > 2L ? 1 : (j14 == 2L ? 0 : -1));
                            try {
                                if (size == 0) {
                                    String strJ = m.a(((i4) aVar).x(), "m") ? xt.b.a().j() : xt.b.a().i();
                                    String strD2 = m.a(((i4) fVar.f25729a).x(), "m") ? xt.b.a().d() : xt.b.a().c();
                                    Iterator it2 = fVar.f25735t.iterator();
                                    m.e(it2, "iterator(...)");
                                    while (it2.hasNext()) {
                                        Object next2 = it2.next();
                                        m.e(next2, "next(...)");
                                        long jLongValue2 = ((Number) next2).longValue();
                                        if (fVar.f()) {
                                            String strE = g.e(jLongValue2, ((i4) fVar.f25729a).x());
                                            String strD3 = g.d(jLongValue2, ((i4) fVar.f25729a).x());
                                            String str = strD2 + strD3;
                                            if (!new File(str).exists()) {
                                                arrayList.add(new fv.a(strE, str, strD3));
                                            }
                                        }
                                        String strJ2 = g.j(jLongValue2, ((i4) fVar.f25729a).x());
                                        String strI2 = g.i(jLongValue2, ((i4) fVar.f25729a).x());
                                        String str2 = strJ + strI2;
                                        if (!new File(str2).exists()) {
                                            arrayList.add(new fv.a(strJ2, str2, strI2));
                                        }
                                    }
                                    size = 0;
                                    arrayList.addAll(fVar.d(strD, false));
                                } else {
                                    size = 0;
                                    if (j14 == 3) {
                                        Iterator it3 = fVar.f25735t.iterator();
                                        m.e(it3, "iterator(...)");
                                        while (it3.hasNext()) {
                                            Object next3 = it3.next();
                                            m.e(next3, "next(...)");
                                            long jLongValue3 = ((Number) next3).longValue();
                                            String strK3 = g.k(jLongValue3);
                                            String str3 = "lesson_png_" + jLongValue3 + ".zip";
                                            String str4 = xt.b.a().k() + str3;
                                            if (!new File(str4).exists()) {
                                                arrayList.add(new fv.a(strK3, str4, str3));
                                            }
                                        }
                                    } else if (j14 == 4) {
                                        String str5 = m.a(((i4) aVar).x(), "m") ? xt.b.a().e() + "story/m_audio/" : xt.b.a().e() + "story/f_audio/";
                                        ArrayList arrayList3 = fVar.H;
                                        int size5 = arrayList3.size();
                                        int i12 = 0;
                                        while (i12 < size5) {
                                            Object obj2 = arrayList3.get(i12);
                                            i12++;
                                            m.e(obj2, "next(...)");
                                            Unit unit2 = (Unit) obj2;
                                            if (unit2.getSortIndex() >= 1) {
                                                String strW = g.w(unit2.getSortIndex(), ((i4) fVar.f25729a).x());
                                                String strV = g.v(unit2.getSortIndex(), ((i4) fVar.f25729a).x());
                                                String str6 = str5 + strV;
                                                if (!new File(str6).exists()) {
                                                    arrayList.add(new fv.a(strW, str6, strV));
                                                }
                                            }
                                        }
                                    } else if (j14 == 5) {
                                        ArrayList arrayList4 = fVar.H;
                                        int size6 = arrayList4.size();
                                        int i13 = 0;
                                        while (i13 < size6) {
                                            Object obj3 = arrayList4.get(i13);
                                            i13++;
                                            m.e(obj3, "next(...)");
                                            Unit unit3 = (Unit) obj3;
                                            if (unit3.getSortIndex() >= 1) {
                                                String strU2 = g.u(unit3.getSortIndex());
                                                String str7 = "story_png_" + unit3.getSortIndex() + ".zip";
                                                String str8 = xt.b.a().q() + str7;
                                                if (!new File(str8).exists()) {
                                                    arrayList.add(new fv.a(strU2, str8, str7));
                                                }
                                            }
                                        }
                                    }
                                }
                            } catch (Exception e8) {
                                e = e8;
                                e.printStackTrace();
                            }
                            list = arrayList;
                        }
                    }
                    list = arrayList;
                    size = 0;
                } catch (Exception e10) {
                    e = e10;
                    size = 0;
                    e.printStackTrace();
                    list = arrayList;
                }
            } catch (Exception e11) {
                e = e11;
                j12 = j13;
            }
        } else {
            list = fVar.f25733e;
            j12 = 2;
            size = 0;
            j11 = -1;
        }
        fVar.f25733e = list;
        ArrayList arrayList5 = fVar.H;
        ArrayList arrayList6 = fVar.f25735t;
        try {
            long j15 = ((i4) fVar.f25729a).O;
            if (j15 == j11) {
                int size7 = fVar.f() ? arrayList6.size() * 3 : arrayList6.size() * 2;
                if (fVar.g()) {
                    size = arrayList5.size() * 2;
                }
                size3 = size7 + size + fVar.c();
            } else if (j15 == 0) {
                size3 = fVar.c();
            } else if (j15 == 3) {
                size3 = arrayList6.size();
            } else if (j15 == j12) {
                if (fVar.f()) {
                    size2 = arrayList6.size() * 2;
                    iC = fVar.c();
                } else {
                    size2 = arrayList6.size();
                    iC = fVar.c();
                }
                size3 = size2 + iC;
            } else if (j15 == 5 || j15 == 4) {
                size3 = arrayList5.size();
            }
        } catch (Exception unused) {
        }
        fVar.f25731c = size3;
        return Integer.valueOf(Log.d("OfflinePresenter", fVar.f25733e.size() + " : " + fVar.f25731c));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f25726a) {
            case 0:
                return a();
            default:
                j jVar = (j) this.f25728c;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayListB = th.j.b(this.f25727b);
                int size = arrayListB.size();
                int i11 = 0;
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayListB.get(i12);
                    i12++;
                    long jLongValue = ((Number) obj).longValue();
                    arrayListB.size();
                    k10.g gVarQueryBuilder = PdLessonDbHelper.INSTANCE.pdTipsDao().queryBuilder();
                    h hVarE = PdTipsDao.Properties.LessonIds.e("%;" + jLongValue + ";%");
                    org.greenrobot.greendao.d dVar = PdTipsDao.Properties.Lan;
                    int[] iArr = r.f4959a;
                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                    gVarQueryBuilder.f(hVarE, dVar.b(bq.m.k(x.n().keyLanguage)));
                    arrayList.addAll(gVarQueryBuilder.d());
                }
                Collections.reverse(arrayList);
                HashSet hashSet = new HashSet();
                ArrayList arrayList2 = new ArrayList();
                int size2 = arrayList.size();
                int i13 = 0;
                while (i13 < size2) {
                    Object obj2 = arrayList.get(i13);
                    i13++;
                    if (hashSet.add(((PdTips) obj2).getCardId())) {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList arrayListC1 = ry.m.c1(arrayList2);
                arrayList.clear();
                arrayList.addAll(ry.m.O0(arrayListC1));
                Iterator it = arrayList.iterator();
                m.e(it, "iterator(...)");
                while (true) {
                    int i14 = 6;
                    if (!it.hasNext()) {
                        ArrayList arrayList3 = (ArrayList) jVar.f36361c.getValue();
                        if (arrayList3 == null || !(!arrayList3.isEmpty())) {
                            return arrayList;
                        }
                        ArrayList arrayList4 = new ArrayList();
                        int size3 = arrayList.size();
                        int i15 = 0;
                        while (i15 < size3) {
                            Object obj3 = arrayList.get(i15);
                            i15++;
                            String cardTypeName = ((PdTips) obj3).getCardTypeName();
                            m.e(cardTypeName, "getCardTypeName(...)");
                            List listW0 = oz.q.W0(cardTypeName, new String[]{"/"}, i11, i14);
                            ArrayList arrayList5 = new ArrayList();
                            for (Object obj4 : listW0) {
                                if (((String) obj4).length() > 0) {
                                    arrayList5.add(obj4);
                                }
                            }
                            int size4 = arrayList5.size();
                            int i16 = i11;
                            int i17 = i16;
                            while (i17 < size4) {
                                Object obj5 = arrayList5.get(i17);
                                i17++;
                                String str = (String) obj5;
                                ArrayList arrayList6 = (ArrayList) jVar.f36361c.getValue();
                                if (arrayList6 != null && arrayList6.contains(str)) {
                                    i16 = 1;
                                }
                            }
                            if (i16 != 0) {
                                arrayList4.add(obj3);
                            }
                            i11 = 0;
                            i14 = 6;
                        }
                        return arrayList4;
                    }
                    Object next = it.next();
                    m.e(next, "next(...)");
                    String cardTypeName2 = ((PdTips) next).getCardTypeName();
                    m.e(cardTypeName2, "getCardTypeName(...)");
                    List listW1 = oz.q.W0(cardTypeName2, new String[]{"/"}, 0, 6);
                    ArrayList arrayList7 = new ArrayList();
                    for (Object obj6 : listW1) {
                        if (((String) obj6).length() > 0) {
                            arrayList7.add(obj6);
                        }
                    }
                    int size5 = arrayList7.size();
                    int i18 = 0;
                    while (i18 < size5) {
                        Object obj7 = arrayList7.get(i18);
                        i18++;
                        String str2 = (String) obj7;
                        if (!jVar.f36360b.contains(oz.q.i1(str2).toString())) {
                            jVar.f36360b.add(str2);
                        }
                    }
                }
                break;
        }
    }
}
