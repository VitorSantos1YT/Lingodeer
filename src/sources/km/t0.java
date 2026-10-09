package km;

import android.os.Bundle;
import androidx.lifecycle.LifecycleOwnerKt;
import bt.a3;
import bt.y2;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.BaseYintuIntel;
import com.lingo.lingoskill.object.Word;
import com.lingo.lingoskill.object.YinTu;
import com.lingo.lingoskill.object.YinTuDao;
import com.lingo.lingoskill.object.YouYin;
import com.lingo.lingoskill.object.YouYinDao;
import com.lingo.lingoskill.object.ZhuoYin;
import com.lingo.lingoskill.object.ZhuoYinDao;
import com.lingo.lingoskill.ui.base.ENO.MzwEyWCkjXL;
import com.lingodeer.R;
import com.lingodeer.data.env.Env;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class t0 extends xg.i {
    public f0 H;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f38278e = com.bumptech.glide.d.u(qy.j.SYNCHRONIZED, new bj.a(this, 23));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a9.i f38279f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f38280t;

    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    /* JADX WARN: Code duplicated, block: B:36:0x0068  */
    /* JADX WARN: Code duplicated, block: B:38:0x006c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0071  */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    public static p A(BaseYintuIntel baseYintuIntel) {
        String str;
        String luoMa;
        String str2;
        r rVar;
        r rVar2;
        String pian = baseYintuIntel.getPian();
        boolean z11 = pian == null || oz.q.K0(pian);
        String ping = baseYintuIntel.getPing();
        String string = BuildConfig.VERSION_NAME;
        String str3 = ping == null ? BuildConfig.VERSION_NAME : ping;
        if (z11) {
            String luoMa2 = baseYintuIntel.getLuoMa();
            if (luoMa2 != null) {
                str = luoMa2;
            }
            if (!z11 || (luoMa = baseYintuIntel.getLuoMa()) == null || oz.q.K0(luoMa)) {
                str2 = null;
            } else {
                str2 = luoMa;
            }
            if (z11) {
                rVar = r.Primary;
            } else {
                rVar = r.OnSurface;
            }
            r rVar3 = rVar;
            if (z11) {
                rVar2 = r.Primary;
            } else {
                rVar2 = r.OnSurfaceVariant;
            }
            return new p(str3, str, str2, rVar3, rVar2);
        }
        String pian2 = baseYintuIntel.getPian();
        if (pian2 == null) {
            pian2 = BuildConfig.VERSION_NAME;
        }
        String luoMa3 = baseYintuIntel.getLuoMa();
        if (luoMa3 != null) {
            string = luoMa3;
        }
        string = oz.q.i1(pian2 + " " + string).toString();
        str = string;
        if (!z11) {
            str2 = null;
        } else {
            str2 = luoMa;
        }
        if (z11) {
            rVar = r.Primary;
        } else {
            rVar = r.OnSurface;
        }
        r rVar4 = rVar;
        if (z11) {
            rVar2 = r.Primary;
        } else {
            rVar2 = r.OnSurfaceVariant;
        }
        return new p(str3, str, str2, rVar4, rVar2);
    }

    public static a2 t(long j11, fz.c cVar, fz.c cVar2) {
        Word wordH = ij.c.h(j11);
        if (wordH == null) {
            return null;
        }
        String strR = nv.p.r(wordH.getWord(), "( ", wordH.getZhuyin(), " )");
        String luoma = wordH.getLuoma();
        if (luoma == null) {
            luoma = BuildConfig.VERSION_NAME;
        }
        i iVar = new i(strR, (Set) cVar.invoke(strR));
        i iVar2 = new i(luoma, (Set) cVar2.invoke(luoma));
        String translations = wordH.getTranslations();
        return new a2(iVar, iVar2, translations == null ? BuildConfig.VERSION_NAME : translations, j11);
    }

    public static p v(String str, String str2) {
        r rVar = r.Primary;
        return new p(str, str2, null, rVar, rVar, 4);
    }

    public static YinTu w(int i11) {
        if (dm.a.f23483c == null) {
            synchronized (dm.a.class) {
                if (dm.a.f23483c == null) {
                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                    kotlin.jvm.internal.m.c(lingoSkillApplication);
                    dm.a.f23483c = new dm.a(lingoSkillApplication);
                }
            }
        }
        dm.a aVar = dm.a.f23483c;
        kotlin.jvm.internal.m.c(aVar);
        return (YinTu) aVar.o().load(Long.valueOf(i11));
    }

    public static List x(int i11, int i12) {
        if (dm.a.f23483c == null) {
            synchronized (dm.a.class) {
                if (dm.a.f23483c == null) {
                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                    kotlin.jvm.internal.m.c(lingoSkillApplication);
                    dm.a.f23483c = new dm.a(lingoSkillApplication);
                }
            }
        }
        dm.a aVar = dm.a.f23483c;
        kotlin.jvm.internal.m.c(aVar);
        k10.g gVarQueryBuilder = aVar.o().queryBuilder();
        gVarQueryBuilder.f(YinTuDao.Properties.Id.a(Integer.valueOf(i11), Integer.valueOf(i12)), new k10.h[0]);
        return gVarQueryBuilder.d();
    }

    public static List y(int... iArr) {
        if (dm.a.f23483c == null) {
            synchronized (dm.a.class) {
                if (dm.a.f23483c == null) {
                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                    kotlin.jvm.internal.m.c(lingoSkillApplication);
                    dm.a.f23483c = new dm.a(lingoSkillApplication);
                }
            }
        }
        dm.a aVar = dm.a.f23483c;
        kotlin.jvm.internal.m.c(aVar);
        k10.g gVarQueryBuilder = aVar.o().queryBuilder();
        org.greenrobot.greendao.d dVar = YinTuDao.Properties.Id;
        Integer[] numArrN0 = ry.l.n0(iArr);
        gVarQueryBuilder.f(dVar.d(Arrays.copyOf(numArrN0, numArrN0.length)), new k10.h[0]);
        return gVarQueryBuilder.d();
    }

    public static List z(int i11, int i12) {
        if (dm.a.f23483c == null) {
            synchronized (dm.a.class) {
                if (dm.a.f23483c == null) {
                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                    kotlin.jvm.internal.m.c(lingoSkillApplication);
                    dm.a.f23483c = new dm.a(lingoSkillApplication);
                }
            }
        }
        dm.a aVar = dm.a.f23483c;
        kotlin.jvm.internal.m.c(aVar);
        k10.g gVarQueryBuilder = aVar.t().queryBuilder();
        gVarQueryBuilder.f(ZhuoYinDao.Properties.Id.a(Integer.valueOf(i11), Integer.valueOf(i12)), new k10.h[0]);
        return gVarQueryBuilder.d();
    }

    @Override // androidx.fragment.app.k0
    public final void onDestroy() {
        a9.i iVar = this.f38279f;
        if (iVar != null) {
            iVar.y();
        }
        a9.i iVar2 = this.f38279f;
        if (iVar2 != null) {
            iVar2.l();
        }
        this.f38279f = null;
        super.onDestroy();
    }

    @Override // androidx.fragment.app.k0
    public final void onPause() {
        super.onPause();
        if (this.f38280t <= 0) {
            return;
        }
        vy.d dVar = null;
        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(this), null, null, new gp.a(this, null, 21), 3);
        if (u().hasFindPerfectTime.booleanValue()) {
            return;
        }
        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(this), null, null, new s0(this, dVar, 0), 3);
    }

    @Override // androidx.fragment.app.k0
    public final void onResume() {
        super.onResume();
        this.f38280t = System.currentTimeMillis();
    }

    @Override // androidx.fragment.app.k0
    public final void onStop() {
        super.onStop();
        a9.i iVar = this.f38279f;
        if (iVar != null) {
            iVar.y();
        }
    }

    @Override // xg.i
    public final void q(Bundle bundle, l1.n nVar, int i11) {
        l1.s sVar;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-146926949);
        int i12 = (sVar2.h(this) ? 32 : 16) | i11;
        if (sVar2.T(i12 & 1, (i12 & 17) != 16)) {
            f0 f0Var = this.H;
            if (f0Var == null) {
                kotlin.jvm.internal.m.n("content");
                throw null;
            }
            boolean zH = sVar2.h(this);
            Object objQ = sVar2.Q();
            l1.g gVar = l1.m.f39353a;
            if (zH || objQ == gVar) {
                objQ = new hh.o(this, 24);
                sVar2.o0(objQ);
            }
            fz.a aVar = (fz.a) objQ;
            boolean zH2 = sVar2.h(this);
            Object objQ2 = sVar2.Q();
            if (zH2 || objQ2 == gVar) {
                a3 a3Var = new a3(1, this, t0.class, "playAlphabetAudio", "playAlphabetAudio(Ljava/lang/String;)V", 0, 16);
                sVar2.o0(a3Var);
                objQ2 = a3Var;
            }
            fz.c cVar = (fz.c) ((mz.e) objQ2);
            boolean zH3 = sVar2.h(this);
            Object objQ3 = sVar2.Q();
            if (zH3 || objQ3 == gVar) {
                a3 a3Var2 = new a3(1, this, t0.class, "playWordAudio", "playWordAudio(J)V", 0, 17);
                sVar2.o0(a3Var2);
                objQ3 = a3Var2;
            }
            fz.c cVar2 = (fz.c) ((mz.e) objQ3);
            boolean zH4 = sVar2.h(this);
            Object objQ4 = sVar2.Q();
            if (zH4 || objQ4 == gVar) {
                y2 y2Var = new y2(0, this, t0.class, "openAlphabetChart", "openAlphabetChart()V", 0, 13);
                sVar2.o0(y2Var);
                objQ4 = y2Var;
            }
            sVar = sVar2;
            b1.r(f0Var, aVar, cVar, cVar2, (fz.a) ((mz.e) objQ4), null, sVar, 0);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new k9.p(this, i11, 3, bundle);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, qy.h] */
    public final Env u() {
        return (Env) this.f38278e.getValue();
    }

    @Override // androidx.fragment.app.k0
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requireContext();
        this.f38279f = new a9.i(1);
        List listI0 = ry.l.i0(new int[]{1, 6, 11, 16, 21, 26, 31, 36, 41, 46});
        ArrayList arrayList = new ArrayList();
        Iterator it = listI0.iterator();
        while (it.hasNext()) {
            YinTu yinTuW = w(((Number) it.next()).intValue());
            if (yinTuW != null) {
                arrayList.add(yinTuW);
            }
        }
        ArrayList arrayList2 = new ArrayList(ry.n.W(arrayList, 10));
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            String ping = ((YinTu) obj).getPing();
            kotlin.jvm.internal.m.e(ping, "getPing(...)");
            String string = getString(R.string.row);
            kotlin.jvm.internal.m.e(string, "getString(...)");
            arrayList2.add(v(ping, string));
        }
        int i12 = 3;
        int i13 = 4;
        List listI1 = ry.l.i0(new int[]{1, 2, 3, 4, 5});
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = listI1.iterator();
        while (it2.hasNext()) {
            YinTu yinTuW2 = w(((Number) it2.next()).intValue());
            if (yinTuW2 != null) {
                arrayList3.add(yinTuW2);
            }
        }
        ArrayList arrayList4 = new ArrayList(ry.n.W(arrayList3, 10));
        int size2 = arrayList3.size();
        int i14 = 0;
        while (i14 < size2) {
            Object obj2 = arrayList3.get(i14);
            i14++;
            int i15 = i12;
            String ping2 = ((YinTu) obj2).getPing();
            int i16 = i13;
            kotlin.jvm.internal.m.e(ping2, "getPing(...)");
            String string2 = getString(R.string.column);
            kotlin.jvm.internal.m.e(string2, "getString(...)");
            arrayList4.add(v(ping2, string2));
            i12 = i15;
            i13 = i16;
        }
        int i17 = i12;
        int i18 = i13;
        if (dm.a.f23483c == null) {
            synchronized (dm.a.class) {
                if (dm.a.f23483c == null) {
                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                    kotlin.jvm.internal.m.c(lingoSkillApplication);
                    dm.a.f23483c = new dm.a(lingoSkillApplication);
                }
            }
        }
        dm.a aVar = dm.a.f23483c;
        kotlin.jvm.internal.m.c(aVar);
        List<Object> listLoadAll = aVar.o().loadAll();
        kotlin.jvm.internal.m.e(listLoadAll, "loadAll(...)");
        ArrayList arrayList5 = new ArrayList(ry.n.W(listLoadAll, 10));
        Iterator<T> it3 = listLoadAll.iterator();
        while (it3.hasNext()) {
            YinTu yinTu = (YinTu) it3.next();
            kotlin.jvm.internal.m.c(yinTu);
            arrayList5.add(A(yinTu));
        }
        o oVar = new o(arrayList2, arrayList4, arrayList5);
        String strE = ep.a.e("た-", getString(R.string.row));
        String string3 = getString(R.string.kurei_shiki);
        kotlin.jvm.internal.m.e(string3, "getString(...)");
        String string4 = getString(R.string.hepburn);
        kotlin.jvm.internal.m.e(string4, "getString(...)");
        List listL = ns.o.L(new y1(strE, string3, string4, null, null), new y1("た", "ta", "ta", "ta", "ta"), new y1("ち", "ti", "chi", "ti", "chi"), new y1("つ", "tu", "tsu", "tu", "tsu"), new y1("て", "te", "te", "te", "te"), new y1("と", "to", "to", "to", "to"));
        sy.c cVarO = ns.o.o();
        String string5 = getString(R.string.row);
        kotlin.jvm.internal.m.e(string5, "getString(...)");
        cVarO.add(v("ら", string5));
        List<YinTu> listX = x(41, 45);
        kotlin.jvm.internal.m.e(listX, "queryYinTuBetween(...)");
        ArrayList arrayList6 = new ArrayList(ry.n.W(listX, 10));
        for (YinTu yinTu2 : listX) {
            kotlin.jvm.internal.m.c(yinTu2);
            arrayList6.add(A(yinTu2));
        }
        cVarO.addAll(arrayList6);
        sy.c cVarE = ns.o.e(cVarO);
        sy.c cVarO2 = ns.o.o();
        String string6 = getString(R.string.row);
        kotlin.jvm.internal.m.e(string6, "getString(...)");
        cVarO2.add(v("や", string6));
        List<YinTu> listX2 = x(36, 40);
        kotlin.jvm.internal.m.e(listX2, "queryYinTuBetween(...)");
        ArrayList arrayList7 = new ArrayList(ry.n.W(listX2, 10));
        for (YinTu yinTu3 : listX2) {
            kotlin.jvm.internal.m.c(yinTu3);
            arrayList7.add(A(yinTu3));
        }
        cVarO2.addAll(arrayList7);
        String string7 = getString(R.string.row);
        kotlin.jvm.internal.m.e(string7, "getString(...)");
        cVarO2.add(v("わ", string7));
        List<YinTu> listX3 = x(46, 50);
        kotlin.jvm.internal.m.e(listX3, "queryYinTuBetween(...)");
        ArrayList arrayList8 = new ArrayList(ry.n.W(listX3, 10));
        for (YinTu yinTu4 : listX3) {
            kotlin.jvm.internal.m.c(yinTu4);
            arrayList8.add(A(yinTu4));
        }
        cVarO2.addAll(arrayList8);
        sy.c cVarE2 = ns.o.e(cVarO2);
        YinTu yinTuW3 = w(51);
        List listK = yinTuW3 != null ? ns.o.K(A(yinTuW3)) : null;
        if (listK == null) {
            listK = ry.r.f50854a;
        }
        String str = MzwEyWCkjXL.HyxAc;
        r rVar = r.SrsNew;
        List<YinTu> listX4 = x(6, 10);
        kotlin.jvm.internal.m.e(listX4, "queryYinTuBetween(...)");
        ArrayList arrayList9 = new ArrayList(ry.n.W(listX4, 10));
        for (YinTu yinTu5 : listX4) {
            kotlin.jvm.internal.m.c(yinTu5);
            arrayList9.add(A(yinTu5));
        }
        z1 z1Var = new z1("( k )", rVar, true, arrayList9);
        r rVar2 = r.Primary;
        List<ZhuoYin> listZ = z(1, 5);
        kotlin.jvm.internal.m.e(listZ, str);
        ArrayList arrayList10 = new ArrayList(ry.n.W(listZ, 10));
        for (ZhuoYin zhuoYin : listZ) {
            kotlin.jvm.internal.m.c(zhuoYin);
            arrayList10.add(A(zhuoYin));
        }
        z1 z1Var2 = new z1("( g )", rVar2, false, arrayList10);
        r rVar3 = r.SrsNew;
        List<YinTu> listX5 = x(11, 15);
        kotlin.jvm.internal.m.e(listX5, "queryYinTuBetween(...)");
        ArrayList arrayList11 = new ArrayList(ry.n.W(listX5, 10));
        for (YinTu yinTu6 : listX5) {
            kotlin.jvm.internal.m.c(yinTu6);
            arrayList11.add(A(yinTu6));
        }
        z1 z1Var3 = new z1("( s )", rVar3, true, arrayList11);
        r rVar4 = r.Primary;
        List<ZhuoYin> listZ2 = z(6, 10);
        kotlin.jvm.internal.m.e(listZ2, str);
        ArrayList arrayList12 = new ArrayList(ry.n.W(listZ2, 10));
        for (ZhuoYin zhuoYin2 : listZ2) {
            kotlin.jvm.internal.m.c(zhuoYin2);
            arrayList12.add(A(zhuoYin2));
        }
        z1 z1Var4 = new z1("( z )", rVar4, false, arrayList12);
        r rVar5 = r.SrsNew;
        List<YinTu> listX6 = x(16, 20);
        kotlin.jvm.internal.m.e(listX6, "queryYinTuBetween(...)");
        ArrayList arrayList13 = new ArrayList(ry.n.W(listX6, 10));
        for (YinTu yinTu7 : listX6) {
            kotlin.jvm.internal.m.c(yinTu7);
            arrayList13.add(A(yinTu7));
        }
        z1 z1Var5 = new z1("( t )", rVar5, true, arrayList13);
        r rVar6 = r.Primary;
        List<ZhuoYin> listZ3 = z(11, 15);
        kotlin.jvm.internal.m.e(listZ3, str);
        ArrayList arrayList14 = new ArrayList(ry.n.W(listZ3, 10));
        for (ZhuoYin zhuoYin3 : listZ3) {
            kotlin.jvm.internal.m.c(zhuoYin3);
            arrayList14.add(A(zhuoYin3));
        }
        z1 z1Var6 = new z1("( d )", rVar6, false, arrayList14);
        r rVar7 = r.SrsNew;
        List<YinTu> listX7 = x(26, 30);
        kotlin.jvm.internal.m.e(listX7, "queryYinTuBetween(...)");
        ArrayList arrayList15 = new ArrayList(ry.n.W(listX7, 10));
        for (YinTu yinTu8 : listX7) {
            kotlin.jvm.internal.m.c(yinTu8);
            arrayList15.add(A(yinTu8));
        }
        z1 z1Var7 = new z1("( h )", rVar7, true, arrayList15);
        r rVar8 = r.Primary;
        List<ZhuoYin> listZ4 = z(16, 20);
        kotlin.jvm.internal.m.e(listZ4, str);
        ArrayList arrayList16 = new ArrayList(ry.n.W(listZ4, 10));
        for (ZhuoYin zhuoYin4 : listZ4) {
            kotlin.jvm.internal.m.c(zhuoYin4);
            arrayList16.add(A(zhuoYin4));
        }
        z1 z1Var8 = new z1("( b )", rVar8, false, arrayList16);
        r rVar9 = r.Primary;
        List<ZhuoYin> listZ5 = z(21, 25);
        kotlin.jvm.internal.m.e(listZ5, str);
        ArrayList arrayList17 = new ArrayList(ry.n.W(listZ5, 10));
        for (ZhuoYin zhuoYin5 : listZ5) {
            kotlin.jvm.internal.m.c(zhuoYin5);
            arrayList17.add(A(zhuoYin5));
        }
        List listL2 = ns.o.L(z1Var, z1Var2, z1Var3, z1Var4, z1Var5, z1Var6, z1Var7, z1Var8, new z1("( p )", rVar9, false, arrayList17));
        sy.c cVarO3 = ns.o.o();
        List listY = y(7, 12, 17, 22, 27, 32, 42);
        kotlin.jvm.internal.m.e(listY, "queryYinTuByIds(...)");
        cVarO3.addAll(listY);
        int[] iArr = {7, 17, 22};
        if (dm.a.f23483c == null) {
            synchronized (dm.a.class) {
                if (dm.a.f23483c == null) {
                    LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                    kotlin.jvm.internal.m.c(lingoSkillApplication2);
                    dm.a.f23483c = new dm.a(lingoSkillApplication2);
                }
            }
        }
        dm.a aVar2 = dm.a.f23483c;
        kotlin.jvm.internal.m.c(aVar2);
        k10.g gVarQueryBuilder = aVar2.t().queryBuilder();
        org.greenrobot.greendao.d dVar = ZhuoYinDao.Properties.Id;
        Integer[] numArrN0 = ry.l.n0(iArr);
        gVarQueryBuilder.f(dVar.d(Arrays.copyOf(numArrN0, numArrN0.length)), new k10.h[0]);
        List listD = gVarQueryBuilder.d();
        kotlin.jvm.internal.m.e(listD, "queryZhuoYinByIds(...)");
        cVarO3.addAll(listD);
        sy.c cVarE3 = ns.o.e(cVarO3);
        ArrayList arrayList18 = new ArrayList(ry.n.W(cVarE3, 10));
        ListIterator listIterator = cVarE3.listIterator(0);
        int i19 = 0;
        while (true) {
            sy.a aVar3 = (sy.a) listIterator;
            if (!aVar3.hasNext()) {
                List<YinTu> listY2 = y(36, 38, 40);
                kotlin.jvm.internal.m.e(listY2, "queryYinTuByIds(...)");
                ArrayList arrayList19 = new ArrayList(ry.n.W(listY2, 10));
                for (YinTu yinTu9 : listY2) {
                    String ping3 = yinTu9.getPing();
                    kotlin.jvm.internal.m.e(ping3, "getPing(...)");
                    String luoMa = yinTu9.getLuoMa();
                    if (luoMa == null || oz.q.K0(luoMa)) {
                        luoMa = null;
                    }
                    arrayList19.add(new q(ping3, luoMa));
                }
                sy.c cVarO4 = ns.o.o();
                int[] iArr2 = {10, 2, 15};
                if (dm.a.f23483c == null) {
                    synchronized (dm.a.class) {
                        if (dm.a.f23483c == null) {
                            LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                            kotlin.jvm.internal.m.c(lingoSkillApplication3);
                            dm.a.f23483c = new dm.a(lingoSkillApplication3);
                        }
                    }
                }
                dm.a aVar4 = dm.a.f23483c;
                kotlin.jvm.internal.m.c(aVar4);
                k10.g gVarQueryBuilder2 = aVar4.s().queryBuilder();
                org.greenrobot.greendao.d dVar2 = YouYinDao.Properties.Id;
                Integer[] numArrN1 = ry.l.n0(iArr2);
                gVarQueryBuilder2.f(dVar2.d(Arrays.copyOf(numArrN1, numArrN1.length)), new k10.h[0]);
                List<YouYin> listD2 = gVarQueryBuilder2.d();
                kotlin.jvm.internal.m.e(listD2, "queryYouYinByIds(...)");
                ArrayList arrayList20 = new ArrayList(ry.n.W(listD2, 10));
                for (YouYin youYin : listD2) {
                    String ping4 = youYin.getPing();
                    kotlin.jvm.internal.m.e(ping4, "getPing(...)");
                    String luoMa2 = youYin.getLuoMa();
                    List list = listL2;
                    kotlin.jvm.internal.m.e(luoMa2, "getLuoMa(...)");
                    String luoMa3 = youYin.getLuoMa();
                    String str2 = (luoMa3 == null || oz.q.K0(luoMa3)) ? null : luoMa3;
                    r rVar10 = r.Primary;
                    arrayList20.add(new p(ping4, luoMa2, str2, rVar10, rVar10));
                    listL2 = list;
                }
                List list2 = listL2;
                cVarO4.addAll(arrayList20);
                r rVar11 = r.Primary;
                cVarO4.add(new p("...", BuildConfig.VERSION_NAME, null, rVar11, rVar11, 4));
                k2 k2Var = new k2(arrayList18, arrayList19, ns.o.e(cVarO4));
                List listL3 = ns.o.L(17L, 2108L, 2501L);
                ArrayList arrayList21 = new ArrayList();
                Iterator it4 = listL3.iterator();
                while (it4.hasNext()) {
                    a2 a2VarT = t(((Number) it4.next()).longValue(), new jt.t0(14), new jt.t0(15));
                    if (a2VarT != null) {
                        arrayList21.add(a2VarT);
                    }
                }
                List listL4 = ns.o.L(new m(ep.a.e("あ/a-", getString(R.string.column)), "あ・か・さ・た…"), new m(ep.a.e("い/i-", getString(R.string.column)), "い・き・し・ち…"), new m(ep.a.e("う/u-", getString(R.string.column)), "う・く・す・つ…"), new m(ep.a.e("え/e-", getString(R.string.column)), "え・け・せ・て…"), new m(ep.a.e("お/o-", getString(R.string.column)), "お・こ・そ・と…"));
                List listI2 = ry.l.i0(new int[]{1, 2, 3, 4, 5, 2, 3});
                ArrayList arrayList22 = new ArrayList();
                Iterator it5 = listI2.iterator();
                while (it5.hasNext()) {
                    YinTu yinTuW4 = w(((Number) it5.next()).intValue());
                    if (yinTuW4 != null) {
                        arrayList22.add(yinTuW4);
                    }
                }
                ArrayList arrayList23 = new ArrayList(ry.n.W(arrayList22, 10));
                int size3 = arrayList22.size();
                int i21 = 0;
                while (i21 < size3) {
                    Object obj3 = arrayList22.get(i21);
                    i21++;
                    YinTu yinTu10 = (YinTu) obj3;
                    String ping5 = yinTu10.getPing();
                    k2 k2Var2 = k2Var;
                    kotlin.jvm.internal.m.e(ping5, "getPing(...)");
                    String luoMa4 = yinTu10.getLuoMa();
                    if (luoMa4 == null || oz.q.K0(luoMa4)) {
                        luoMa4 = null;
                    }
                    arrayList23.add(new q(ping5, luoMa4));
                    k2Var = k2Var2;
                }
                k2 k2Var3 = k2Var;
                n nVar = new n(listL4, ns.o.L(ry.m.U0(arrayList23, 5), ry.m.k0(arrayList23, 5)));
                List list3 = listK;
                final Map mapY = ry.x.Y(new qy.l(2662L, qx.b.H(8)), new qy.l(158L, qx.b.H(6)), new qy.l(30L, qx.b.H(7)), new qy.l(718L, ry.l.m0(new Integer[]{5, 7})), new qy.l(159L, qx.b.H(6)));
                final Map mapY2 = ry.x.Y(new qy.l(2662L, qx.b.H(5)), new qy.l(158L, qx.b.H(Integer.valueOf(i18))), new qy.l(30L, qx.b.H(9)), new qy.l(718L, ry.l.m0(new Integer[]{Integer.valueOf(i17), 8})), new qy.l(159L, ry.l.m0(new Integer[]{2, 7})));
                List listL5 = ns.o.L(2662L, 158L, 30L, 718L, 159L);
                ArrayList arrayList24 = new ArrayList();
                Iterator it6 = listL5.iterator();
                while (it6.hasNext()) {
                    final long jLongValue = ((Number) it6.next()).longValue();
                    final int i22 = 0;
                    final int i23 = 1;
                    a2 a2VarT2 = t(jLongValue, new fz.c() { // from class: km.r0
                        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
                        /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Map] */
                        @Override // fz.c
                        public final Object invoke(Object obj4) {
                            String text = (String) obj4;
                            switch (i22) {
                                case 0:
                                    kotlin.jvm.internal.m.f(text, "text");
                                    Iterable iterable = (Set) mapY.get(Long.valueOf(jLongValue));
                                    if (iterable == null) {
                                        iterable = ry.t.f50856a;
                                    }
                                    ArrayList arrayList25 = new ArrayList();
                                    for (Object obj5 : iterable) {
                                        int iIntValue = ((Number) obj5).intValue();
                                        if (iIntValue >= 0 && iIntValue < text.length()) {
                                            arrayList25.add(obj5);
                                        }
                                    }
                                    return ry.m.f1(arrayList25);
                                default:
                                    kotlin.jvm.internal.m.f(text, "text");
                                    Iterable iterable2 = (Set) mapY.get(Long.valueOf(jLongValue));
                                    if (iterable2 == null) {
                                        iterable2 = ry.t.f50856a;
                                    }
                                    ArrayList arrayList26 = new ArrayList();
                                    for (Object obj6 : iterable2) {
                                        int iIntValue2 = ((Number) obj6).intValue();
                                        if (iIntValue2 >= 0 && iIntValue2 < text.length()) {
                                            arrayList26.add(obj6);
                                        }
                                    }
                                    return ry.m.f1(arrayList26);
                            }
                        }
                    }, new fz.c() { // from class: km.r0
                        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
                        /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Map] */
                        @Override // fz.c
                        public final Object invoke(Object obj4) {
                            String text = (String) obj4;
                            switch (i23) {
                                case 0:
                                    kotlin.jvm.internal.m.f(text, "text");
                                    Iterable iterable = (Set) mapY2.get(Long.valueOf(jLongValue));
                                    if (iterable == null) {
                                        iterable = ry.t.f50856a;
                                    }
                                    ArrayList arrayList25 = new ArrayList();
                                    for (Object obj5 : iterable) {
                                        int iIntValue = ((Number) obj5).intValue();
                                        if (iIntValue >= 0 && iIntValue < text.length()) {
                                            arrayList25.add(obj5);
                                        }
                                    }
                                    return ry.m.f1(arrayList25);
                                default:
                                    kotlin.jvm.internal.m.f(text, "text");
                                    Iterable iterable2 = (Set) mapY2.get(Long.valueOf(jLongValue));
                                    if (iterable2 == null) {
                                        iterable2 = ry.t.f50856a;
                                    }
                                    ArrayList arrayList26 = new ArrayList();
                                    for (Object obj6 : iterable2) {
                                        int iIntValue2 = ((Number) obj6).intValue();
                                        if (iIntValue2 >= 0 && iIntValue2 < text.length()) {
                                            arrayList26.add(obj6);
                                        }
                                    }
                                    return ry.m.f1(arrayList26);
                            }
                        }
                    });
                    if (a2VarT2 != null) {
                        arrayList24.add(a2VarT2);
                    }
                }
                List listL6 = ns.o.L(231L, 431L, 1443L);
                ArrayList arrayList25 = new ArrayList();
                Iterator it7 = listL6.iterator();
                while (it7.hasNext()) {
                    long jLongValue2 = ((Number) it7.next()).longValue();
                    a2 a2VarT3 = t(jLongValue2, new jt.t0(13), new au.o(jLongValue2, 14));
                    if (a2VarT3 != null) {
                        arrayList25.add(a2VarT3);
                    }
                }
                this.H = new f0(oVar, listL, cVarE, cVarE2, list3, list2, k2Var3, arrayList21, nVar, arrayList24, arrayList25);
                return;
            }
            Object next = aVar3.next();
            int i24 = i19 + 1;
            if (i19 < 0) {
                ns.o.V();
                throw null;
            }
            BaseYintuIntel baseYintuIntel = (BaseYintuIntel) next;
            String ping6 = baseYintuIntel.getPing();
            kotlin.jvm.internal.m.e(ping6, "getPing(...)");
            String luoMa5 = baseYintuIntel.getLuoMa();
            kotlin.jvm.internal.m.e(luoMa5, "getLuoMa(...)");
            String luoMa6 = baseYintuIntel.getLuoMa();
            if (luoMa6 == null || oz.q.K0(luoMa6)) {
                luoMa6 = null;
            }
            arrayList18.add(new l(ping6, luoMa5, luoMa6, i19 % 2 == 0 ? r.PrimaryContainer : r.Surface));
            i19 = i24;
        }
    }
}
