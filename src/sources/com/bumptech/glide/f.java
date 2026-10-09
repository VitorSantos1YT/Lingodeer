package com.bumptech.glide;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Bundle;
import android.util.SizeF;
import androidx.lifecycle.livedata.HeRS.DytezVyM;
import cf.x;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingodeer.syllable_ko.model.KOSyllableLessonType;
import com.lingodeer.syllable_ko.model.KOSyllableModelType;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import e6.n1;
import e6.o1;
import e6.q1;
import e6.r1;
import e6.s1;
import e6.t1;
import e6.u;
import hh.p0;
import ht.r;
import j3.t;
import j3.x0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.regex.Matcher;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import l1.b1;
import l1.s;
import l1.w1;
import l1.x1;
import ot.a2;
import ot.c1;
import ot.e1;
import ot.g1;
import ot.j1;
import ot.z0;
import qy.b0;
import re.g0;
import rt.cb;
import rt.db;
import rz.e0;
import rz.o0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public static final int A(int i11, int i12) {
        return (i11 >> i12) & 31;
    }

    public static final boolean B(j1 j1Var) {
        if ((j1Var instanceof c1) || (j1Var instanceof z0)) {
            return true;
        }
        if ((j1Var instanceof g1) && ((g1) j1Var).f45826b.f46065c == a2.AudioWord) {
            return true;
        }
        if (!(j1Var instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) j1Var;
        return e1Var.f45798a.f33770s == r.M5 && e1Var.f45799b.f46042a.getSoundChangePronunciation().length() == 0;
    }

    public static final boolean C(f2.d dVar) {
        long j11 = dVar.f26580e;
        return (j11 >>> 32) == (4294967295L & j11) && j11 == dVar.f26581f && j11 == dVar.f26582g && j11 == dVar.f26583h;
    }

    public static void F(String str) {
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        String str2 = x.n().globalUID;
        if (!se.d.f51586c) {
            se.d.a();
        }
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = se.m.f51605c;
        if (se.m.b() == null) {
            g0.p();
        }
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutorB = se.m.b();
        if (scheduledThreadPoolExecutorB == null) {
            throw new IllegalStateException("Required value was null.");
        }
        scheduledThreadPoolExecutorB.execute(new se.c(str2, 0));
        LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
        kotlin.jvm.internal.m.c(lingoSkillApplication2);
        se.m mVar = new se.m(lingoSkillApplication2, (String) null);
        if (qf.a.b(mVar)) {
            return;
        }
        try {
            mVar.d(str, null);
        } catch (Throwable th2) {
            qf.a.a(mVar, th2);
        }
    }

    public static final boolean G(KOSyllableLessonType lessonType, KOSyllableModelType modelType) {
        kotlin.jvm.internal.m.f(lessonType, "lessonType");
        kotlin.jvm.internal.m.f(modelType, "modelType");
        if (lessonType != KOSyllableLessonType.SYLLABLE) {
            return false;
        }
        int i11 = sv.p.f51838a[modelType.ordinal()];
        return i11 == 1 || i11 == 2 || i11 == 3;
    }

    public static final void H(int i11, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Error code: " + i11);
        if (str != null) {
            sb2.append(", message: ".concat(str));
        }
        throw new SQLException(sb2.toString());
    }

    public static final qy.l I(Object obj, Object obj2) {
        return new qy.l(obj, obj2);
    }

    public static final Boolean J(String str) {
        if (kotlin.jvm.internal.m.a(str, "true")) {
            return Boolean.TRUE;
        }
        if (kotlin.jvm.internal.m.a(str, "false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static final long K(long j11, long j12) {
        int iD;
        int iF = x0.f(j11);
        int iE = x0.e(j11);
        if ((x0.f(j12) < x0.e(j11)) && (x0.f(j11) < x0.e(j12))) {
            if ((x0.f(j12) <= x0.f(j11)) && (x0.e(j11) <= x0.e(j12))) {
                iF = x0.f(j12);
                iE = iF;
            } else {
                if ((x0.f(j11) <= x0.f(j12)) && (x0.e(j12) <= x0.e(j11))) {
                    iD = x0.d(j12);
                } else {
                    int iF2 = x0.f(j12);
                    if (iF >= x0.e(j12) || iF2 > iF) {
                        iE = x0.f(j12);
                    } else {
                        iF = x0.f(j12);
                        iD = x0.d(j12);
                    }
                }
                iE -= iD;
            }
        } else if (iE > x0.f(j12)) {
            iF -= x0.d(j12);
            iD = x0.d(j12);
            iE -= iD;
        }
        return t.b(iF, iE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v29, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v33, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v36, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r1v46 */
    /* JADX WARN: Type inference failed for: r1v47 */
    /* JADX WARN: Type inference failed for: r1v48 */
    /* JADX WARN: Type inference failed for: r1v49 */
    public static final void a(int i11, long j11, t1 t1Var, fz.e eVar, l1.n nVar) {
        ?? r9;
        ?? K;
        ?? K2;
        t1 t1Var2 = t1Var;
        s sVar = (s) nVar;
        sVar.f0(1526030150);
        fz.e eVar2 = eVar;
        int i12 = i11 | (sVar.f(t1Var2) ? 4 : 2) | (sVar.e(j11) ? 32 : 16) | (sVar.f(eVar2) ? 256 : 128);
        if ((i12 & 147) == 146 && sVar.F()) {
            sVar.W();
        } else {
            if (t1Var2 instanceof s1) {
                sVar.e0(-1173540356);
                sVar.p(false);
                K2 = ns.o.K(new v3.h(j11));
            } else {
                if (!(t1Var2 instanceof r1)) {
                    sVar.e0(-1173645715);
                    sVar.p(false);
                    throw new NoWhenBranchMatchedException();
                }
                sVar.e0(-1173538668);
                if (Build.VERSION.SDK_INT >= 31) {
                    sVar.e0(-2019914396);
                    Bundle bundle = (Bundle) sVar.j(u.f25051a);
                    sVar.e0(-1173535336);
                    boolean zE = sVar.e(j11);
                    Object objQ = sVar.Q();
                    if (zE || objQ == l1.m.f39353a) {
                        objQ = new o1(j11);
                        sVar.o0(objQ);
                    }
                    fz.a aVar = (fz.a) objQ;
                    sVar.p(false);
                    ArrayList parcelableArrayList = bundle.getParcelableArrayList("appWidgetSizes");
                    if (parcelableArrayList == null || parcelableArrayList.isEmpty()) {
                        int i13 = bundle.getInt("appWidgetMinHeight", 0);
                        int i14 = bundle.getInt("appWidgetMaxHeight", 0);
                        int i15 = bundle.getInt("appWidgetMinWidth", 0);
                        int i16 = bundle.getInt("appWidgetMaxWidth", 0);
                        K = (i13 == 0 || i14 == 0 || i15 == 0 || i16 == 0) ? ns.o.K(aVar.invoke()) : ns.o.L(new v3.h(ef.e.a(i15, i14)), new v3.h(ef.e.a(i16, i13)));
                    } else {
                        K = new ArrayList(ry.n.W(parcelableArrayList, 10));
                        int size = parcelableArrayList.size();
                        int i17 = 0;
                        while (i17 < size) {
                            Object obj = parcelableArrayList.get(i17);
                            i17++;
                            SizeF sizeF = (SizeF) obj;
                            K.add(new v3.h(ef.e.a(sizeF.getWidth(), sizeF.getHeight())));
                        }
                    }
                    sVar.p(false);
                    r9 = K;
                } else {
                    sVar.e0(-2019826759);
                    Bundle bundle2 = (Bundle) sVar.j(u.f25051a);
                    int i18 = bundle2.getInt("appWidgetMinHeight", 0);
                    int i19 = bundle2.getInt("appWidgetMaxWidth", 0);
                    v3.h hVar = null;
                    v3.h hVar2 = (i18 == 0 || i19 == 0) ? null : new v3.h(ef.e.a(i19, i18));
                    int i21 = bundle2.getInt("appWidgetMaxHeight", 0);
                    int i22 = bundle2.getInt("appWidgetMinWidth", 0);
                    if (i21 != 0 && i22 != 0) {
                        hVar = new v3.h(ef.e.a(i22, i21));
                    }
                    ArrayList arrayListT = ry.l.T(new v3.h[]{hVar2, hVar});
                    boolean zIsEmpty = arrayListT.isEmpty();
                    List listK = arrayListT;
                    if (zIsEmpty) {
                        listK = ns.o.K(new v3.h(j11));
                    }
                    sVar.p(false);
                    r9 = listK;
                }
                sVar.p(false);
                K2 = r9;
            }
            List listJ0 = ry.m.j0(K2);
            ArrayList arrayList = new ArrayList(ry.n.W(listJ0, 10));
            Iterator it = listJ0.iterator();
            while (it.hasNext()) {
                d(((i12 << 3) & 112) | (i12 & 896), ((v3.h) it.next()).f53491a, t1Var2, eVar2, sVar);
                arrayList.add(b0.f48488a);
                t1Var2 = t1Var;
                eVar2 = eVar;
            }
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new n1(i11, j11, t1Var, eVar);
        }
    }

    public static final f2.d b(f2.c cVar, long j11, long j12, long j13, long j14) {
        return new f2.d(cVar.f26572a, cVar.f26573b, cVar.f26574c, cVar.f26575d, j11, j12, j13, j14);
    }

    public static final f2.d c(float f5, float f11, float f12, float f13, long j11) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat2)));
        return new f2.d(f5, f11, f12, f13, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits);
    }

    public static final void d(int i11, long j11, t1 t1Var, fz.e eVar, l1.n nVar) {
        s sVar = (s) nVar;
        sVar.f0(-53921383);
        int i12 = (sVar.e(j11) ? 4 : 2) | i11;
        if ((i11 & 48) == 0) {
            int i13 = i11 & 64;
            i12 |= sVar.f(t1Var) ? 32 : 16;
        }
        if (((i12 | (sVar.f(eVar) ? 256 : 128)) & 147) == 146 && sVar.F()) {
            sVar.W();
        } else {
            l1.t.b(new w1[]{c6.f.f6622a.a(new v3.h(j11))}, t1.e.b(sVar, -1209815847, new n1(eVar, j11, t1Var)), sVar, 48);
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new q1(i11, j11, t1Var, eVar);
        }
    }

    public static final Object[] e(Object[] objArr, int i11, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        ry.l.K(0, i11, 6, objArr, objArr2);
        ry.l.G(i11 + 2, i11, objArr.length, objArr, objArr2);
        objArr2[i11] = obj;
        objArr2[i11 + 1] = obj2;
        return objArr2;
    }

    public static final Object[] f(int i11, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        ry.l.K(0, i11, 6, objArr, objArr2);
        ry.l.G(i11, i11 + 2, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public static final Object[] g(int i11, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 1];
        ry.l.K(0, i11, 6, objArr, objArr2);
        ry.l.G(i11, i11 + 1, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public static final String h(int i11, String lan, String contentType) {
        kotlin.jvm.internal.m.f(lan, "lan");
        kotlin.jvm.internal.m.f(contentType, "contentType");
        return lan + "_folder_" + contentType + "_" + i11;
    }

    public static final void l(kotlin.jvm.internal.e eVar, Object obj) {
        if (eVar.h(obj)) {
            kotlin.jvm.internal.m.d(obj, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.cast");
        } else {
            throw new ClassCastException("Value cannot be cast to " + eVar.f());
        }
    }

    public static final b1 m(h0.i iVar, l1.n nVar, int i11) {
        s sVar = (s) nVar;
        Object objQ = sVar.Q();
        l1.g gVar = l1.m.f39353a;
        if (objQ == gVar) {
            objQ = l1.t.B(Boolean.FALSE);
            sVar.o0(objQ);
        }
        b1 b1Var = (b1) objQ;
        boolean z11 = (((i11 & 14) ^ 6) > 4 && sVar.f(iVar)) || (i11 & 6) == 4;
        Object objQ2 = sVar.Q();
        if (z11 || objQ2 == gVar) {
            objQ2 = new gu.b(3, iVar, b1Var, (vy.d) null);
            sVar.o0(objQ2);
        }
        l1.t.f((fz.e) objQ2, iVar, sVar);
        return b1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object n(fv.c cVar, fz.c cVar2, xy.c cVar3) {
        sv.q qVar;
        fv.a aVar;
        Object objM;
        if (cVar3 instanceof sv.q) {
            qVar = (sv.q) cVar3;
            int i11 = qVar.f51843e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                qVar.f51843e = i11 - Integer.MIN_VALUE;
            } else {
                qVar = new sv.q(cVar3);
            }
        } else {
            qVar = new sv.q(cVar3);
        }
        Object obj = qVar.f51842d;
        wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
        int i12 = qVar.f51843e;
        int i13 = 1;
        if (i12 == 0) {
            e.F(obj);
            qy.q qVar2 = fv.b.f28186a;
            aVar = new fv.a(0L, ep.a.g("https://res.lingodeer.com/mfsource/", oz.x.q0(fv.g.h(), "up", BuildConfig.VERSION_NAME), "/z/others/kr-f-zy-table-new.zip"), "kr-f-zy-table-new.zip");
            yz.f fVar = o0.f50940a;
            yz.e eVar = yz.e.f58387a;
            mv.p pVar = new mv.p(aVar, null, i13);
            qVar.f51839a = cVar;
            qVar.f51840b = cVar2;
            qVar.f51841c = aVar;
            qVar.f51843e = 1;
            objM = e0.M(eVar, pVar, qVar);
            if (objM == aVar2) {
                return aVar2;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fv.a aVar3 = qVar.f51841c;
            cVar2 = qVar.f51840b;
            fv.c cVar4 = qVar.f51839a;
            e.F(obj);
            aVar = aVar3;
            cVar = cVar4;
            objM = obj;
        }
        if (((Boolean) objM).booleanValue()) {
            cVar2.invoke(cb.f49585a);
        } else {
            cVar2.invoke(new db(CropImageView.DEFAULT_ASPECT_RATIO));
            cVar.d(aVar, new aj.e(cVar2, 20));
        }
        return b0.f48488a;
    }

    public static final void o(ja.a aVar, String sql) {
        kotlin.jvm.internal.m.f(aVar, "<this>");
        kotlin.jvm.internal.m.f(sql, "sql");
        ja.c cVarB1 = aVar.B1(sql);
        try {
            cVarB1.r1();
            hz.b.h(cVarB1, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                hz.b.h(cVarB1, th2);
                throw th3;
            }
        }
    }

    public static long p(int i11, int i12, int i13, int i14) {
        int i15 = 262142;
        int iMin = Math.min(i13, 262142);
        int iMin2 = i14 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i14, 262142);
        int i16 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
        if (i16 >= 8191) {
            if (i16 < 32767) {
                i15 = 65534;
            } else if (i16 < 65535) {
                i15 = 32766;
            } else {
                if (i16 >= 262143) {
                    v3.b.l(i16);
                    throw new KotlinNothingValueException();
                }
                i15 = 8190;
            }
        }
        return v3.b.a(Math.min(i15, i11), i12 != Integer.MAX_VALUE ? Math.min(i15, i12) : Integer.MAX_VALUE, iMin, iMin2);
    }

    public static long q(int i11, int i12, int i13, int i14) {
        int i15 = 262142;
        int iMin = Math.min(i11, 262142);
        int iMin2 = i12 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i12, 262142);
        int i16 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
        if (i16 >= 8191) {
            if (i16 < 32767) {
                i15 = 65534;
            } else if (i16 < 65535) {
                i15 = 32766;
            } else {
                if (i16 >= 262143) {
                    v3.b.l(i16);
                    throw new KotlinNothingValueException();
                }
                i15 = 8190;
            }
        }
        return v3.b.a(iMin, iMin2, Math.min(i15, i13), i14 != Integer.MAX_VALUE ? Math.min(i15, i14) : Integer.MAX_VALUE);
    }

    public static String s(xi.b pinyinElem) {
        kotlin.jvm.internal.m.f(pinyinElem, "pinyinElem");
        qy.q qVar = fv.f.f28191a;
        String str = pinyinElem.f56087a;
        kotlin.jvm.internal.m.c(str);
        String str2 = pinyinElem.f56088b;
        kotlin.jvm.internal.m.c(str2);
        return defpackage.e.m(xt.b.a().b(), fv.f.a(pinyinElem.f56089c, str, str2));
    }

    public static final int t(String key, Bundle bundle) {
        kotlin.jvm.internal.m.f(key, "key");
        int i11 = bundle.getInt(key, Integer.MIN_VALUE);
        if (i11 != Integer.MIN_VALUE || bundle.getInt(key, Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i11;
        }
        g.r(key);
        throw null;
    }

    public static final ArrayList u(Bundle bundle, String key, kotlin.jvm.internal.e eVar) {
        kotlin.jvm.internal.m.f(key, "key");
        ArrayList arrayListF = Build.VERSION.SDK_INT >= 34 ? a5.e.f(bundle, key, qx.b.p(eVar)) : bundle.getParcelableArrayList(key);
        if (arrayListF != null) {
            return arrayListF;
        }
        g.r(key);
        throw null;
    }

    public static final Bundle v(String key, Bundle bundle) {
        kotlin.jvm.internal.m.f(key, "key");
        Bundle bundle2 = bundle.getBundle(key);
        if (bundle2 != null) {
            return bundle2;
        }
        g.r(key);
        throw null;
    }

    public static final String w(String key, Bundle bundle) {
        kotlin.jvm.internal.m.f(key, "key");
        String string = bundle.getString(key);
        if (string != null) {
            return string;
        }
        g.r(key);
        throw null;
    }

    public static final ArrayList x(String key, Bundle bundle) {
        kotlin.jvm.internal.m.f(key, "key");
        ArrayList<String> stringArrayList = bundle.getStringArrayList(key);
        if (stringArrayList != null) {
            return stringArrayList;
        }
        g.r(key);
        throw null;
    }

    public static final int y(ja.a connection) {
        kotlin.jvm.internal.m.f(connection, "connection");
        ja.c cVarB1 = connection.B1("SELECT changes()");
        try {
            cVarB1.r1();
            int i11 = (int) cVarB1.getLong(0);
            hz.b.h(cVarB1, null);
            return i11;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                hz.b.h(cVarB1, th2);
                throw th3;
            }
        }
    }

    public static la.b z(dm.a refHolder, SQLiteDatabase sQLiteDatabase) {
        kotlin.jvm.internal.m.f(refHolder, "refHolder");
        la.b bVar = (la.b) refHolder.f23485b;
        if (bVar != null && bVar.f39846a.equals(sQLiteDatabase)) {
            return bVar;
        }
        la.b bVar2 = new la.b(sQLiteDatabase);
        refHolder.f23485b = bVar2;
        return bVar2;
    }

    public abstract void D(a4.g gVar, a4.g gVar2);

    public abstract void E(a4.g gVar, Thread thread);

    public abstract boolean i(a4.h hVar, a4.d dVar, a4.d dVar2);

    public abstract boolean j(a4.h hVar, Object obj, Object obj2);

    public abstract boolean k(a4.h hVar, a4.g gVar, a4.g gVar2);

    public static String r(int i11, String pinyin) {
        List listK;
        Collection collectionT;
        String string;
        kotlin.jvm.internal.m.f(pinyin, "pinyin");
        String strD = fv.g.D(pinyin);
        kotlin.jvm.internal.m.e(strD, "replaceYunmuWithNoTone(...)");
        Matcher matcherW = nv.p.w(0, ";", "compile(...)", strD);
        if (matcherW.find()) {
            ArrayList arrayList = new ArrayList(10);
            int iC = 0;
            do {
                iC = nv.p.c(matcherW, strD, iC, arrayList);
            } while (matcherW.find());
            nv.p.B(iC, strD, arrayList);
            listK = arrayList;
        } else {
            listK = ns.o.K(strD.toString());
        }
        if (!listK.isEmpty()) {
            ListIterator listIterator = listK.listIterator(listK.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    collectionT = ry.r.f50854a;
                    break;
                }
                if (((String) listIterator.previous()).length() != 0) {
                    collectionT = b7.e0.t(listIterator, 1, listK);
                    break;
                }
            }
        } else {
            collectionT = ry.r.f50854a;
            break;
        }
        String str = ((String[]) collectionT.toArray(new String[0]))[0];
        String[] strArr = fv.f.f28195e;
        boolean zContains = Arrays.asList(Arrays.copyOf(strArr, strArr.length)).contains(str);
        String str2 = DytezVyM.WEeihAScFi;
        if (zContains) {
            StringBuilder sbQ = b7.e0.q(xt.b.a().b(), str2, xt.b.e().c(null, null) ? "m" : "f", "-zy-", str);
            sbQ.append(".mp3");
            string = sbQ.toString();
        } else {
            if (kotlin.jvm.internal.m.a(str, "ue")) {
                str = "ve";
            }
            String strQ0 = oz.x.q0(str, "ü", "v");
            String[] strArr2 = fv.f.f28196f;
            if (!Arrays.asList(Arrays.copyOf(strArr2, strArr2.length)).contains(strQ0)) {
                string = BuildConfig.VERSION_NAME;
            } else if (i11 == 0 || strQ0.equals("ueng")) {
                StringBuilder sbQ2 = b7.e0.q(xt.b.a().b(), str2, xt.b.e().c(null, null) ? "m" : "f", "-zy-", strQ0);
                sbQ2.append(".mp3");
                string = sbQ2.toString();
            } else {
                string = p0.i(i11, ".mp3", b7.e0.q(xt.b.a().b(), str2, xt.b.e().c(null, null) ? "m" : "f", "-zy-", strQ0));
            }
        }
        return com.google.android.material.datepicker.d.D(string) ? string : oz.x.q0(string, "1", BuildConfig.VERSION_NAME);
    }
}
