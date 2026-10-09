package ob;

import aj.uZCn.evRpcb;
import android.database.Cursor;
import androidx.drawerlayout.widget.ktFt.FpIL;
import androidx.work.impl.WorkDatabase_Impl;
import cf.x;
import com.yalantis.ucrop.view.CropImageView;
import d0.l1;
import dl.ExOZ.xItStCyvVEZ;
import e6.g0;
import fb.c0;
import fb.w;
import fr.j3;
import i0.pKy.shrCcjmOhAmRC;
import i1.i0;
import i1.o0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import l1.g1;
import l1.k1;
import qy.b0;
import rz.e0;
import sz.xej.iFLeRCXvYCGdPW;
import zp.sBa.anrPHlQ;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f44875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f44876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f44877c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f44878d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f44879e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f44880f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f44881g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f44882h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f44883i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f44884j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f44885k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f44886l;
    public final Object m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f44887n;

    public s(WorkDatabase_Impl workDatabase_Impl) {
        this.f44875a = workDatabase_Impl;
        this.f44876b = new b(workDatabase_Impl, 5);
        new h(workDatabase_Impl, 12);
        this.f44877c = new h(workDatabase_Impl, 13);
        this.f44878d = new h(workDatabase_Impl, 14);
        this.f44879e = new h(workDatabase_Impl, 15);
        this.f44880f = new h(workDatabase_Impl, 16);
        this.f44881g = new h(workDatabase_Impl, 17);
        this.f44882h = new h(workDatabase_Impl, 18);
        this.f44883i = new h(workDatabase_Impl, 19);
        this.f44884j = new h(workDatabase_Impl, 4);
        new h(workDatabase_Impl, 5);
        this.f44885k = new h(workDatabase_Impl, 6);
        this.f44886l = new h(workDatabase_Impl, 7);
        this.m = new h(workDatabase_Impl, 8);
        new h(workDatabase_Impl, 9);
        new h(workDatabase_Impl, 10);
        this.f44887n = new h(workDatabase_Impl, 11);
    }

    public void b(HashMap map) {
        Set setKeySet = map.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (map.size() > 999) {
            com.bumptech.glide.e.A(map, new q(this, 0));
            return;
        }
        StringBuilder sbN = ep.a.n("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        int size = setKeySet.size();
        ew.a.i(size, sbN);
        sbN.append(")");
        w9.u uVarB = w9.u.b(size, sbN.toString());
        Iterator it = setKeySet.iterator();
        int i11 = 1;
        while (it.hasNext()) {
            uVarB.l(i11, (String) it.next());
            i11++;
        }
        Cursor cursorF = x.F((WorkDatabase_Impl) this.f44875a, uVarB, false);
        try {
            int iK = c.a.k(cursorF, "work_spec_id");
            if (iK == -1) {
                cursorF.close();
                return;
            }
            while (cursorF.moveToNext()) {
                ArrayList arrayList = (ArrayList) map.get(cursorF.getString(iK));
                if (arrayList != null) {
                    arrayList.add(cursorF.getString(0));
                }
            }
            cursorF.close();
        } catch (Throwable th2) {
            cursorF.close();
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object c(l1 l1Var, g0 g0Var, xy.c cVar) throws Throwable {
        i1.q qVar;
        Throwable th2;
        s sVar;
        Object objA;
        Object objA2;
        if (cVar instanceof i1.q) {
            qVar = (i1.q) cVar;
            int i11 = qVar.f34060d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                qVar.f34060d = i11 - Integer.MIN_VALUE;
            } else {
                qVar = new i1.q(this, cVar);
            }
        } else {
            qVar = new i1.q(this, cVar);
        }
        Object obj = qVar.f34058b;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = qVar.f34060d;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sVar = qVar.f34057a;
            try {
                com.bumptech.glide.e.F(obj);
                o0 o0VarH = sVar.h();
                g1 g1Var = (g1) sVar.f44884j;
                objA2 = o0VarH.a(g1Var.l());
                if (objA2 != null && Math.abs(g1Var.l() - sVar.h().d(objA2)) <= 0.5f && ((Boolean) ((fz.c) sVar.f44878d).invoke(objA2)).booleanValue()) {
                    sVar.t(objA2);
                }
                return b0.f48488a;
            } catch (Throwable th3) {
                th2 = th3;
                o0 o0VarH2 = sVar.h();
                g1 g1Var2 = (g1) sVar.f44884j;
                objA = o0VarH2.a(g1Var2.l());
                if (objA != null) {
                    sVar.t(objA);
                }
                throw th2;
            }
        }
        com.bumptech.glide.e.F(obj);
        try {
            i0 i0Var = (i0) this.f44879e;
            try {
                dv.b bVar = new dv.b(1, this, g0Var, null);
                qVar.f34057a = this;
                qVar.f34060d = 1;
                try {
                    i0Var.getClass();
                    if (e0.l(new av.e(l1Var, i0Var, bVar, (vy.d) null), qVar) == aVar) {
                        return aVar;
                    }
                    sVar = this;
                    o0 o0VarH3 = sVar.h();
                    g1 g1Var3 = (g1) sVar.f44884j;
                    objA2 = o0VarH3.a(g1Var3.l());
                    if (objA2 != null) {
                        sVar.t(objA2);
                    }
                    return b0.f48488a;
                } catch (Throwable th4) {
                    th = th4;
                    th2 = th;
                    sVar = this;
                    o0 o0VarH4 = sVar.h();
                    g1 g1Var4 = (g1) sVar.f44884j;
                    objA = o0VarH4.a(g1Var4.l());
                    if (objA != null && Math.abs(g1Var4.l() - sVar.h().d(objA)) <= 0.5f && ((Boolean) ((fz.c) sVar.f44878d).invoke(objA)).booleanValue()) {
                        sVar.t(objA);
                    }
                    throw th2;
                }
            } catch (Throwable th5) {
                th2 = th5;
                sVar = this;
                o0 o0VarH5 = sVar.h();
                g1 g1Var5 = (g1) sVar.f44884j;
                objA = o0VarH5.a(g1Var5.l());
                if (objA != null) {
                    sVar.t(objA);
                }
                throw th2;
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object d(Object obj, l1 l1Var, i1.m mVar, xy.c cVar) {
        i1.s sVar;
        Throwable th2;
        s sVar2;
        Object objA;
        Object objA2;
        if (cVar instanceof i1.s) {
            sVar = (i1.s) cVar;
            int i11 = sVar.f34067d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                sVar.f34067d = i11 - Integer.MIN_VALUE;
            } else {
                sVar = new i1.s(this, cVar);
            }
        } else {
            sVar = new i1.s(this, cVar);
        }
        Object obj2 = sVar.f34065b;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = sVar.f34067d;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj2);
            if (h().f34055a.containsKey(obj)) {
                try {
                    i0 i0Var = (i0) this.f44879e;
                    try {
                        i1.t tVar = new i1.t(this, obj, mVar, null);
                        sVar.f34064a = this;
                        sVar.f34067d = 1;
                        try {
                            i0Var.getClass();
                            if (e0.l(new av.e(l1Var, i0Var, tVar, (vy.d) null), sVar) == aVar) {
                                return aVar;
                            }
                            sVar2 = this;
                            sVar2.u(null);
                            g1 g1Var = (g1) sVar2.f44884j;
                            objA2 = sVar2.h().a(g1Var.l());
                            if (objA2 != null) {
                                sVar2.t(objA2);
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            th2 = th;
                            sVar2 = this;
                            sVar2.u(null);
                            g1 g1Var2 = (g1) sVar2.f44884j;
                            objA = sVar2.h().a(g1Var2.l());
                            if (objA != null && Math.abs(g1Var2.l() - sVar2.h().d(objA)) <= 0.5f && ((Boolean) ((fz.c) sVar2.f44878d).invoke(objA)).booleanValue()) {
                                sVar2.t(objA);
                            }
                            throw th2;
                        }
                    } catch (Throwable th4) {
                        th2 = th4;
                        sVar2 = this;
                        sVar2.u(null);
                        g1 g1Var3 = (g1) sVar2.f44884j;
                        objA = sVar2.h().a(g1Var3.l());
                        if (objA != null) {
                            sVar2.t(objA);
                        }
                        throw th2;
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } else {
                t(obj);
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sVar2 = sVar.f34064a;
            try {
                com.bumptech.glide.e.F(obj2);
                sVar2.u(null);
                g1 g1Var4 = (g1) sVar2.f44884j;
                objA2 = sVar2.h().a(g1Var4.l());
                if (objA2 != null && Math.abs(g1Var4.l() - sVar2.h().d(objA2)) <= 0.5f && ((Boolean) ((fz.c) sVar2.f44878d).invoke(objA2)).booleanValue()) {
                    sVar2.t(objA2);
                }
            } catch (Throwable th6) {
                th2 = th6;
                sVar2.u(null);
                g1 g1Var5 = (g1) sVar2.f44884j;
                objA = sVar2.h().a(g1Var5.l());
                if (objA != null) {
                    sVar2.t(objA);
                }
                throw th2;
            }
        }
        return b0.f48488a;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [fz.a, kotlin.jvm.internal.n] */
    public Object e(float f5, float f11, Object obj) {
        fz.c cVar = (fz.c) this.f44875a;
        o0 o0VarH = h();
        float fD = o0VarH.d(obj);
        float fFloatValue = ((Number) ((kotlin.jvm.internal.n) this.f44876b).invoke()).floatValue();
        if (fD != f5 && !Float.isNaN(fD)) {
            if (fD < f5) {
                if (f11 >= fFloatValue) {
                    Object objB = o0VarH.b(f5, true);
                    kotlin.jvm.internal.m.c(objB);
                    return objB;
                }
                Object objB2 = o0VarH.b(f5, true);
                kotlin.jvm.internal.m.c(objB2);
                if (f5 >= Math.abs(Math.abs(((Number) cVar.invoke(Float.valueOf(Math.abs(o0VarH.d(objB2) - fD)))).floatValue()) + fD)) {
                    return objB2;
                }
            } else {
                if (f11 <= (-fFloatValue)) {
                    Object objB3 = o0VarH.b(f5, false);
                    kotlin.jvm.internal.m.c(objB3);
                    return objB3;
                }
                Object objB4 = o0VarH.b(f5, false);
                kotlin.jvm.internal.m.c(objB4);
                float fAbs = Math.abs(fD - Math.abs(((Number) cVar.invoke(Float.valueOf(Math.abs(fD - o0VarH.d(objB4))))).floatValue()));
                if (f5 >= CropImageView.DEFAULT_ASPECT_RATIO ? f5 <= fAbs : Math.abs(f5) >= fAbs) {
                    return objB4;
                }
            }
        }
        return obj;
    }

    public void f(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f44875a;
        workDatabase_Impl.b();
        h hVar = (h) this.f44877c;
        la.j jVarA = hVar.a();
        jVarA.l(1, str);
        try {
            workDatabase_Impl.c();
            try {
                jVarA.a();
                workDatabase_Impl.x();
                workDatabase_Impl.s();
                hVar.i(jVarA);
            } catch (Throwable th2) {
                workDatabase_Impl.s();
                throw th2;
            }
        } catch (Throwable th3) {
            hVar.i(jVarA);
            throw th3;
        }
    }

    public ArrayList g() throws Throwable {
        w9.u uVar;
        w9.u uVarB = w9.u.b(1, iFLeRCXvYCGdPW.GJkpoKuzZhSRxAH);
        uVarB.g(1, 200);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f44875a;
        workDatabase_Impl.b();
        Cursor cursorF = x.F(workDatabase_Impl, uVarB, false);
        try {
            int iL = c.a.l(cursorF, "id");
            int iL2 = c.a.l(cursorF, "state");
            int iL3 = c.a.l(cursorF, "worker_class_name");
            int iL4 = c.a.l(cursorF, "input_merger_class_name");
            int iL5 = c.a.l(cursorF, "input");
            int iL6 = c.a.l(cursorF, "output");
            int iL7 = c.a.l(cursorF, "initial_delay");
            int iL8 = c.a.l(cursorF, "interval_duration");
            int iL9 = c.a.l(cursorF, "flex_duration");
            int iL10 = c.a.l(cursorF, "run_attempt_count");
            int iL11 = c.a.l(cursorF, "backoff_policy");
            int iL12 = c.a.l(cursorF, "backoff_delay_duration");
            int iL13 = c.a.l(cursorF, "last_enqueue_time");
            uVar = uVarB;
            try {
                int iL14 = c.a.l(cursorF, "minimum_retention_duration");
                int iL15 = c.a.l(cursorF, "schedule_requested_at");
                int iL16 = c.a.l(cursorF, "run_in_foreground");
                int iL17 = c.a.l(cursorF, "out_of_quota_policy");
                int iL18 = c.a.l(cursorF, "period_count");
                int iL19 = c.a.l(cursorF, "generation");
                int iL20 = c.a.l(cursorF, "next_schedule_time_override");
                int iL21 = c.a.l(cursorF, "next_schedule_time_override_generation");
                int iL22 = c.a.l(cursorF, "stop_reason");
                int iL23 = c.a.l(cursorF, "trace_tag");
                int iL24 = c.a.l(cursorF, "required_network_type");
                int iL25 = c.a.l(cursorF, "required_network_request");
                int iL26 = c.a.l(cursorF, "requires_charging");
                int iL27 = c.a.l(cursorF, "requires_device_idle");
                int iL28 = c.a.l(cursorF, "requires_battery_not_low");
                int iL29 = c.a.l(cursorF, "requires_storage_not_low");
                int iL30 = c.a.l(cursorF, "trigger_content_update_delay");
                int iL31 = c.a.l(cursorF, "trigger_max_content_delay");
                int iL32 = c.a.l(cursorF, "content_uri_triggers");
                int i11 = iL14;
                ArrayList arrayList = new ArrayList(cursorF.getCount());
                while (cursorF.moveToNext()) {
                    String string = cursorF.getString(iL);
                    fb.e0 e0VarD = gb.r.D(cursorF.getInt(iL2));
                    String string2 = cursorF.getString(iL3);
                    String string3 = cursorF.getString(iL4);
                    fb.j jVarA = fb.j.a(cursorF.getBlob(iL5));
                    fb.j jVarA2 = fb.j.a(cursorF.getBlob(iL6));
                    long j11 = cursorF.getLong(iL7);
                    long j12 = cursorF.getLong(iL8);
                    long j13 = cursorF.getLong(iL9);
                    int i12 = cursorF.getInt(iL10);
                    fb.a aVarA = gb.r.A(cursorF.getInt(iL11));
                    long j14 = cursorF.getLong(iL12);
                    long j15 = cursorF.getLong(iL13);
                    int i13 = i11;
                    long j16 = cursorF.getLong(i13);
                    int i14 = iL12;
                    int i15 = iL15;
                    long j17 = cursorF.getLong(i15);
                    iL15 = i15;
                    int i16 = iL16;
                    boolean z11 = cursorF.getInt(i16) != 0;
                    iL16 = i16;
                    int i17 = iL17;
                    c0 c0VarC = gb.r.C(cursorF.getInt(i17));
                    iL17 = i17;
                    int i18 = iL18;
                    int i19 = cursorF.getInt(i18);
                    iL18 = i18;
                    int i21 = iL19;
                    int i22 = cursorF.getInt(i21);
                    iL19 = i21;
                    int i23 = iL20;
                    long j18 = cursorF.getLong(i23);
                    iL20 = i23;
                    int i24 = iL21;
                    int i25 = cursorF.getInt(i24);
                    iL21 = i24;
                    int i26 = iL22;
                    int i27 = cursorF.getInt(i26);
                    iL22 = i26;
                    int i28 = iL23;
                    String string4 = cursorF.isNull(i28) ? null : cursorF.getString(i28);
                    iL23 = i28;
                    int i29 = iL24;
                    w wVarB = gb.r.B(cursorF.getInt(i29));
                    iL24 = i29;
                    int i30 = iL25;
                    pb.f fVarV = gb.r.V(cursorF.getBlob(i30));
                    iL25 = i30;
                    int i31 = iL26;
                    boolean z12 = cursorF.getInt(i31) != 0;
                    iL26 = i31;
                    int i32 = iL27;
                    boolean z13 = cursorF.getInt(i32) != 0;
                    iL27 = i32;
                    int i33 = iL28;
                    boolean z14 = cursorF.getInt(i33) != 0;
                    iL28 = i33;
                    int i34 = iL29;
                    boolean z15 = cursorF.getInt(i34) != 0;
                    iL29 = i34;
                    int i35 = iL30;
                    long j19 = cursorF.getLong(i35);
                    iL30 = i35;
                    int i36 = iL31;
                    long j21 = cursorF.getLong(i36);
                    iL31 = i36;
                    int i37 = iL32;
                    iL32 = i37;
                    arrayList.add(new p(string, e0VarD, string2, string3, jVarA, jVarA2, j11, j12, j13, new fb.f(fVarV, wVarB, z12, z13, z14, z15, j19, j21, gb.r.g(cursorF.getBlob(i37))), i12, aVarA, j14, j15, j16, j17, z11, c0VarC, i19, i22, j18, i25, i27, string4));
                    iL12 = i14;
                    i11 = i13;
                }
                cursorF.close();
                uVar.release();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                cursorF.close();
                uVar.release();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            uVar = uVarB;
        }
    }

    public o0 h() {
        return (o0) ((k1) this.m).getValue();
    }

    public ArrayList i(int i11) throws Throwable {
        w9.u uVar;
        w9.u uVarB = w9.u.b(1, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))");
        uVarB.g(1, i11);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f44875a;
        workDatabase_Impl.b();
        Cursor cursorF = x.F(workDatabase_Impl, uVarB, false);
        try {
            int iL = c.a.l(cursorF, "id");
            int iL2 = c.a.l(cursorF, "state");
            int iL3 = c.a.l(cursorF, "worker_class_name");
            int iL4 = c.a.l(cursorF, "input_merger_class_name");
            int iL5 = c.a.l(cursorF, shrCcjmOhAmRC.Skp);
            int iL6 = c.a.l(cursorF, "output");
            int iL7 = c.a.l(cursorF, "initial_delay");
            int iL8 = c.a.l(cursorF, "interval_duration");
            int iL9 = c.a.l(cursorF, "flex_duration");
            int iL10 = c.a.l(cursorF, "run_attempt_count");
            int iL11 = c.a.l(cursorF, "backoff_policy");
            int iL12 = c.a.l(cursorF, "backoff_delay_duration");
            int iL13 = c.a.l(cursorF, "last_enqueue_time");
            uVar = uVarB;
            try {
                int iL14 = c.a.l(cursorF, "minimum_retention_duration");
                int iL15 = c.a.l(cursorF, "schedule_requested_at");
                int iL16 = c.a.l(cursorF, "run_in_foreground");
                int iL17 = c.a.l(cursorF, "out_of_quota_policy");
                int iL18 = c.a.l(cursorF, "period_count");
                int iL19 = c.a.l(cursorF, "generation");
                int iL20 = c.a.l(cursorF, "next_schedule_time_override");
                int iL21 = c.a.l(cursorF, "next_schedule_time_override_generation");
                int iL22 = c.a.l(cursorF, "stop_reason");
                int iL23 = c.a.l(cursorF, "trace_tag");
                int iL24 = c.a.l(cursorF, "required_network_type");
                int iL25 = c.a.l(cursorF, "required_network_request");
                int iL26 = c.a.l(cursorF, "requires_charging");
                int iL27 = c.a.l(cursorF, "requires_device_idle");
                int iL28 = c.a.l(cursorF, "requires_battery_not_low");
                int iL29 = c.a.l(cursorF, "requires_storage_not_low");
                int iL30 = c.a.l(cursorF, "trigger_content_update_delay");
                int iL31 = c.a.l(cursorF, "trigger_max_content_delay");
                int iL32 = c.a.l(cursorF, "content_uri_triggers");
                int i12 = iL14;
                ArrayList arrayList = new ArrayList(cursorF.getCount());
                while (cursorF.moveToNext()) {
                    String string = cursorF.getString(iL);
                    fb.e0 e0VarD = gb.r.D(cursorF.getInt(iL2));
                    String string2 = cursorF.getString(iL3);
                    String string3 = cursorF.getString(iL4);
                    fb.j jVarA = fb.j.a(cursorF.getBlob(iL5));
                    fb.j jVarA2 = fb.j.a(cursorF.getBlob(iL6));
                    long j11 = cursorF.getLong(iL7);
                    long j12 = cursorF.getLong(iL8);
                    long j13 = cursorF.getLong(iL9);
                    int i13 = cursorF.getInt(iL10);
                    fb.a aVarA = gb.r.A(cursorF.getInt(iL11));
                    long j14 = cursorF.getLong(iL12);
                    long j15 = cursorF.getLong(iL13);
                    int i14 = i12;
                    long j16 = cursorF.getLong(i14);
                    int i15 = iL12;
                    int i16 = iL15;
                    long j17 = cursorF.getLong(i16);
                    iL15 = i16;
                    int i17 = iL16;
                    boolean z11 = cursorF.getInt(i17) != 0;
                    iL16 = i17;
                    int i18 = iL17;
                    c0 c0VarC = gb.r.C(cursorF.getInt(i18));
                    iL17 = i18;
                    int i19 = iL18;
                    int i21 = cursorF.getInt(i19);
                    iL18 = i19;
                    int i22 = iL19;
                    int i23 = cursorF.getInt(i22);
                    iL19 = i22;
                    int i24 = iL20;
                    long j18 = cursorF.getLong(i24);
                    iL20 = i24;
                    int i25 = iL21;
                    int i26 = cursorF.getInt(i25);
                    iL21 = i25;
                    int i27 = iL22;
                    int i28 = cursorF.getInt(i27);
                    iL22 = i27;
                    int i29 = iL23;
                    String string4 = cursorF.isNull(i29) ? null : cursorF.getString(i29);
                    iL23 = i29;
                    int i30 = iL24;
                    w wVarB = gb.r.B(cursorF.getInt(i30));
                    iL24 = i30;
                    int i31 = iL25;
                    pb.f fVarV = gb.r.V(cursorF.getBlob(i31));
                    iL25 = i31;
                    int i32 = iL26;
                    boolean z12 = cursorF.getInt(i32) != 0;
                    iL26 = i32;
                    int i33 = iL27;
                    boolean z13 = cursorF.getInt(i33) != 0;
                    iL27 = i33;
                    int i34 = iL28;
                    boolean z14 = cursorF.getInt(i34) != 0;
                    iL28 = i34;
                    int i35 = iL29;
                    boolean z15 = cursorF.getInt(i35) != 0;
                    iL29 = i35;
                    int i36 = iL30;
                    long j19 = cursorF.getLong(i36);
                    iL30 = i36;
                    int i37 = iL31;
                    long j21 = cursorF.getLong(i37);
                    iL31 = i37;
                    int i38 = iL32;
                    iL32 = i38;
                    arrayList.add(new p(string, e0VarD, string2, string3, jVarA, jVarA2, j11, j12, j13, new fb.f(fVarV, wVarB, z12, z13, z14, z15, j19, j21, gb.r.g(cursorF.getBlob(i38))), i13, aVarA, j14, j15, j16, j17, z11, c0VarC, i21, i23, j18, i26, i28, string4));
                    iL12 = i15;
                    i12 = i14;
                }
                cursorF.close();
                uVar.release();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                cursorF.close();
                uVar.release();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            uVar = uVarB;
        }
    }

    public ArrayList j() throws Throwable {
        w9.u uVar;
        w9.u uVarB = w9.u.b(0, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time");
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f44875a;
        workDatabase_Impl.b();
        Cursor cursorF = x.F(workDatabase_Impl, uVarB, false);
        try {
            int iL = c.a.l(cursorF, "id");
            int iL2 = c.a.l(cursorF, "state");
            int iL3 = c.a.l(cursorF, "worker_class_name");
            int iL4 = c.a.l(cursorF, "input_merger_class_name");
            int iL5 = c.a.l(cursorF, "input");
            int iL6 = c.a.l(cursorF, "output");
            int iL7 = c.a.l(cursorF, "initial_delay");
            int iL8 = c.a.l(cursorF, "interval_duration");
            int iL9 = c.a.l(cursorF, "flex_duration");
            int iL10 = c.a.l(cursorF, "run_attempt_count");
            int iL11 = c.a.l(cursorF, "backoff_policy");
            int iL12 = c.a.l(cursorF, "backoff_delay_duration");
            int iL13 = c.a.l(cursorF, xItStCyvVEZ.JSEHhsEBaUMZY);
            uVar = uVarB;
            try {
                int iL14 = c.a.l(cursorF, "minimum_retention_duration");
                int iL15 = c.a.l(cursorF, "schedule_requested_at");
                int iL16 = c.a.l(cursorF, "run_in_foreground");
                int iL17 = c.a.l(cursorF, "out_of_quota_policy");
                int iL18 = c.a.l(cursorF, "period_count");
                int iL19 = c.a.l(cursorF, "generation");
                int iL20 = c.a.l(cursorF, "next_schedule_time_override");
                int iL21 = c.a.l(cursorF, "next_schedule_time_override_generation");
                int iL22 = c.a.l(cursorF, "stop_reason");
                int iL23 = c.a.l(cursorF, "trace_tag");
                int iL24 = c.a.l(cursorF, "required_network_type");
                int iL25 = c.a.l(cursorF, "required_network_request");
                int iL26 = c.a.l(cursorF, "requires_charging");
                int iL27 = c.a.l(cursorF, "requires_device_idle");
                int iL28 = c.a.l(cursorF, "requires_battery_not_low");
                int iL29 = c.a.l(cursorF, "requires_storage_not_low");
                int iL30 = c.a.l(cursorF, "trigger_content_update_delay");
                int iL31 = c.a.l(cursorF, "trigger_max_content_delay");
                int iL32 = c.a.l(cursorF, "content_uri_triggers");
                int i11 = iL14;
                ArrayList arrayList = new ArrayList(cursorF.getCount());
                while (cursorF.moveToNext()) {
                    String string = cursorF.getString(iL);
                    fb.e0 e0VarD = gb.r.D(cursorF.getInt(iL2));
                    String string2 = cursorF.getString(iL3);
                    String string3 = cursorF.getString(iL4);
                    fb.j jVarA = fb.j.a(cursorF.getBlob(iL5));
                    fb.j jVarA2 = fb.j.a(cursorF.getBlob(iL6));
                    long j11 = cursorF.getLong(iL7);
                    long j12 = cursorF.getLong(iL8);
                    long j13 = cursorF.getLong(iL9);
                    int i12 = cursorF.getInt(iL10);
                    fb.a aVarA = gb.r.A(cursorF.getInt(iL11));
                    long j14 = cursorF.getLong(iL12);
                    long j15 = cursorF.getLong(iL13);
                    int i13 = i11;
                    long j16 = cursorF.getLong(i13);
                    int i14 = iL13;
                    int i15 = iL15;
                    long j17 = cursorF.getLong(i15);
                    iL15 = i15;
                    int i16 = iL16;
                    boolean z11 = cursorF.getInt(i16) != 0;
                    iL16 = i16;
                    int i17 = iL17;
                    c0 c0VarC = gb.r.C(cursorF.getInt(i17));
                    iL17 = i17;
                    int i18 = iL18;
                    int i19 = cursorF.getInt(i18);
                    iL18 = i18;
                    int i21 = iL19;
                    int i22 = cursorF.getInt(i21);
                    iL19 = i21;
                    int i23 = iL20;
                    long j18 = cursorF.getLong(i23);
                    iL20 = i23;
                    int i24 = iL21;
                    int i25 = cursorF.getInt(i24);
                    iL21 = i24;
                    int i26 = iL22;
                    int i27 = cursorF.getInt(i26);
                    iL22 = i26;
                    int i28 = iL23;
                    String string4 = cursorF.isNull(i28) ? null : cursorF.getString(i28);
                    iL23 = i28;
                    int i29 = iL24;
                    w wVarB = gb.r.B(cursorF.getInt(i29));
                    iL24 = i29;
                    int i30 = iL25;
                    pb.f fVarV = gb.r.V(cursorF.getBlob(i30));
                    iL25 = i30;
                    int i31 = iL26;
                    boolean z12 = cursorF.getInt(i31) != 0;
                    iL26 = i31;
                    int i32 = iL27;
                    boolean z13 = cursorF.getInt(i32) != 0;
                    iL27 = i32;
                    int i33 = iL28;
                    boolean z14 = cursorF.getInt(i33) != 0;
                    iL28 = i33;
                    int i34 = iL29;
                    boolean z15 = cursorF.getInt(i34) != 0;
                    iL29 = i34;
                    int i35 = iL30;
                    long j19 = cursorF.getLong(i35);
                    iL30 = i35;
                    int i36 = iL31;
                    long j21 = cursorF.getLong(i36);
                    iL31 = i36;
                    int i37 = iL32;
                    iL32 = i37;
                    arrayList.add(new p(string, e0VarD, string2, string3, jVarA, jVarA2, j11, j12, j13, new fb.f(fVarV, wVarB, z12, z13, z14, z15, j19, j21, gb.r.g(cursorF.getBlob(i37))), i12, aVarA, j14, j15, j16, j17, z11, c0VarC, i19, i22, j18, i25, i27, string4));
                    iL13 = i14;
                    i11 = i13;
                }
                cursorF.close();
                uVar.release();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                cursorF.close();
                uVar.release();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            uVar = uVarB;
        }
    }

    public ArrayList k() throws Throwable {
        w9.u uVar;
        w9.u uVarB = w9.u.b(0, "SELECT * FROM workspec WHERE state=1");
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f44875a;
        workDatabase_Impl.b();
        Cursor cursorF = x.F(workDatabase_Impl, uVarB, false);
        try {
            int iL = c.a.l(cursorF, "id");
            int iL2 = c.a.l(cursorF, "state");
            int iL3 = c.a.l(cursorF, "worker_class_name");
            int iL4 = c.a.l(cursorF, "input_merger_class_name");
            int iL5 = c.a.l(cursorF, "input");
            int iL6 = c.a.l(cursorF, "output");
            int iL7 = c.a.l(cursorF, "initial_delay");
            int iL8 = c.a.l(cursorF, "interval_duration");
            int iL9 = c.a.l(cursorF, "flex_duration");
            int iL10 = c.a.l(cursorF, "run_attempt_count");
            int iL11 = c.a.l(cursorF, "backoff_policy");
            int iL12 = c.a.l(cursorF, "backoff_delay_duration");
            int iL13 = c.a.l(cursorF, "last_enqueue_time");
            uVar = uVarB;
            try {
                int iL14 = c.a.l(cursorF, "minimum_retention_duration");
                int iL15 = c.a.l(cursorF, "schedule_requested_at");
                int iL16 = c.a.l(cursorF, "run_in_foreground");
                int iL17 = c.a.l(cursorF, "out_of_quota_policy");
                int iL18 = c.a.l(cursorF, "period_count");
                int iL19 = c.a.l(cursorF, "generation");
                int iL20 = c.a.l(cursorF, "next_schedule_time_override");
                int iL21 = c.a.l(cursorF, "next_schedule_time_override_generation");
                int iL22 = c.a.l(cursorF, "stop_reason");
                int iL23 = c.a.l(cursorF, "trace_tag");
                int iL24 = c.a.l(cursorF, "required_network_type");
                int iL25 = c.a.l(cursorF, "required_network_request");
                int iL26 = c.a.l(cursorF, "requires_charging");
                int iL27 = c.a.l(cursorF, "requires_device_idle");
                int iL28 = c.a.l(cursorF, "requires_battery_not_low");
                int iL29 = c.a.l(cursorF, "requires_storage_not_low");
                int iL30 = c.a.l(cursorF, "trigger_content_update_delay");
                int iL31 = c.a.l(cursorF, "trigger_max_content_delay");
                int iL32 = c.a.l(cursorF, "content_uri_triggers");
                int i11 = iL14;
                ArrayList arrayList = new ArrayList(cursorF.getCount());
                while (cursorF.moveToNext()) {
                    String string = cursorF.getString(iL);
                    fb.e0 e0VarD = gb.r.D(cursorF.getInt(iL2));
                    String string2 = cursorF.getString(iL3);
                    String string3 = cursorF.getString(iL4);
                    fb.j jVarA = fb.j.a(cursorF.getBlob(iL5));
                    fb.j jVarA2 = fb.j.a(cursorF.getBlob(iL6));
                    long j11 = cursorF.getLong(iL7);
                    long j12 = cursorF.getLong(iL8);
                    long j13 = cursorF.getLong(iL9);
                    int i12 = cursorF.getInt(iL10);
                    fb.a aVarA = gb.r.A(cursorF.getInt(iL11));
                    long j14 = cursorF.getLong(iL12);
                    long j15 = cursorF.getLong(iL13);
                    int i13 = i11;
                    long j16 = cursorF.getLong(i13);
                    int i14 = iL13;
                    int i15 = iL15;
                    long j17 = cursorF.getLong(i15);
                    iL15 = i15;
                    int i16 = iL16;
                    boolean z11 = cursorF.getInt(i16) != 0;
                    iL16 = i16;
                    int i17 = iL17;
                    c0 c0VarC = gb.r.C(cursorF.getInt(i17));
                    iL17 = i17;
                    int i18 = iL18;
                    int i19 = cursorF.getInt(i18);
                    iL18 = i18;
                    int i21 = iL19;
                    int i22 = cursorF.getInt(i21);
                    iL19 = i21;
                    int i23 = iL20;
                    long j18 = cursorF.getLong(i23);
                    iL20 = i23;
                    int i24 = iL21;
                    int i25 = cursorF.getInt(i24);
                    iL21 = i24;
                    int i26 = iL22;
                    int i27 = cursorF.getInt(i26);
                    iL22 = i26;
                    int i28 = iL23;
                    String string4 = cursorF.isNull(i28) ? null : cursorF.getString(i28);
                    iL23 = i28;
                    int i29 = iL24;
                    w wVarB = gb.r.B(cursorF.getInt(i29));
                    iL24 = i29;
                    int i30 = iL25;
                    pb.f fVarV = gb.r.V(cursorF.getBlob(i30));
                    iL25 = i30;
                    int i31 = iL26;
                    boolean z12 = cursorF.getInt(i31) != 0;
                    iL26 = i31;
                    int i32 = iL27;
                    boolean z13 = cursorF.getInt(i32) != 0;
                    iL27 = i32;
                    int i33 = iL28;
                    boolean z14 = cursorF.getInt(i33) != 0;
                    iL28 = i33;
                    int i34 = iL29;
                    boolean z15 = cursorF.getInt(i34) != 0;
                    iL29 = i34;
                    int i35 = iL30;
                    long j19 = cursorF.getLong(i35);
                    iL30 = i35;
                    int i36 = iL31;
                    long j21 = cursorF.getLong(i36);
                    iL31 = i36;
                    int i37 = iL32;
                    iL32 = i37;
                    arrayList.add(new p(string, e0VarD, string2, string3, jVarA, jVarA2, j11, j12, j13, new fb.f(fVarV, wVarB, z12, z13, z14, z15, j19, j21, gb.r.g(cursorF.getBlob(i37))), i12, aVarA, j14, j15, j16, j17, z11, c0VarC, i19, i22, j18, i25, i27, string4));
                    iL13 = i14;
                    i11 = i13;
                }
                cursorF.close();
                uVar.release();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                cursorF.close();
                uVar.release();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            uVar = uVarB;
        }
    }

    public ArrayList l() throws Throwable {
        w9.u uVar;
        w9.u uVarB = w9.u.b(0, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f44875a;
        workDatabase_Impl.b();
        Cursor cursorF = x.F(workDatabase_Impl, uVarB, false);
        try {
            int iL = c.a.l(cursorF, "id");
            int iL2 = c.a.l(cursorF, "state");
            int iL3 = c.a.l(cursorF, "worker_class_name");
            int iL4 = c.a.l(cursorF, "input_merger_class_name");
            int iL5 = c.a.l(cursorF, "input");
            int iL6 = c.a.l(cursorF, "output");
            int iL7 = c.a.l(cursorF, "initial_delay");
            int iL8 = c.a.l(cursorF, "interval_duration");
            int iL9 = c.a.l(cursorF, "flex_duration");
            int iL10 = c.a.l(cursorF, "run_attempt_count");
            int iL11 = c.a.l(cursorF, "backoff_policy");
            int iL12 = c.a.l(cursorF, "backoff_delay_duration");
            int iL13 = c.a.l(cursorF, "last_enqueue_time");
            uVar = uVarB;
            try {
                int iL14 = c.a.l(cursorF, "minimum_retention_duration");
                int iL15 = c.a.l(cursorF, "schedule_requested_at");
                int iL16 = c.a.l(cursorF, "run_in_foreground");
                int iL17 = c.a.l(cursorF, "out_of_quota_policy");
                int iL18 = c.a.l(cursorF, "period_count");
                int iL19 = c.a.l(cursorF, "generation");
                int iL20 = c.a.l(cursorF, "next_schedule_time_override");
                int iL21 = c.a.l(cursorF, "next_schedule_time_override_generation");
                int iL22 = c.a.l(cursorF, "stop_reason");
                int iL23 = c.a.l(cursorF, "trace_tag");
                int iL24 = c.a.l(cursorF, "required_network_type");
                int iL25 = c.a.l(cursorF, "required_network_request");
                int iL26 = c.a.l(cursorF, "requires_charging");
                int iL27 = c.a.l(cursorF, "requires_device_idle");
                int iL28 = c.a.l(cursorF, "requires_battery_not_low");
                int iL29 = c.a.l(cursorF, "requires_storage_not_low");
                int iL30 = c.a.l(cursorF, "trigger_content_update_delay");
                int iL31 = c.a.l(cursorF, "trigger_max_content_delay");
                int iL32 = c.a.l(cursorF, "content_uri_triggers");
                int i11 = iL14;
                ArrayList arrayList = new ArrayList(cursorF.getCount());
                while (cursorF.moveToNext()) {
                    String string = cursorF.getString(iL);
                    fb.e0 e0VarD = gb.r.D(cursorF.getInt(iL2));
                    String string2 = cursorF.getString(iL3);
                    String string3 = cursorF.getString(iL4);
                    fb.j jVarA = fb.j.a(cursorF.getBlob(iL5));
                    fb.j jVarA2 = fb.j.a(cursorF.getBlob(iL6));
                    long j11 = cursorF.getLong(iL7);
                    long j12 = cursorF.getLong(iL8);
                    long j13 = cursorF.getLong(iL9);
                    int i12 = cursorF.getInt(iL10);
                    fb.a aVarA = gb.r.A(cursorF.getInt(iL11));
                    long j14 = cursorF.getLong(iL12);
                    long j15 = cursorF.getLong(iL13);
                    int i13 = i11;
                    long j16 = cursorF.getLong(i13);
                    int i14 = iL13;
                    int i15 = iL15;
                    long j17 = cursorF.getLong(i15);
                    iL15 = i15;
                    int i16 = iL16;
                    boolean z11 = cursorF.getInt(i16) != 0;
                    iL16 = i16;
                    int i17 = iL17;
                    c0 c0VarC = gb.r.C(cursorF.getInt(i17));
                    iL17 = i17;
                    int i18 = iL18;
                    int i19 = cursorF.getInt(i18);
                    iL18 = i18;
                    int i21 = iL19;
                    int i22 = cursorF.getInt(i21);
                    iL19 = i21;
                    int i23 = iL20;
                    long j18 = cursorF.getLong(i23);
                    iL20 = i23;
                    int i24 = iL21;
                    int i25 = cursorF.getInt(i24);
                    iL21 = i24;
                    int i26 = iL22;
                    int i27 = cursorF.getInt(i26);
                    iL22 = i26;
                    int i28 = iL23;
                    String string4 = cursorF.isNull(i28) ? null : cursorF.getString(i28);
                    iL23 = i28;
                    int i29 = iL24;
                    w wVarB = gb.r.B(cursorF.getInt(i29));
                    iL24 = i29;
                    int i30 = iL25;
                    pb.f fVarV = gb.r.V(cursorF.getBlob(i30));
                    iL25 = i30;
                    int i31 = iL26;
                    boolean z12 = cursorF.getInt(i31) != 0;
                    iL26 = i31;
                    int i32 = iL27;
                    boolean z13 = cursorF.getInt(i32) != 0;
                    iL27 = i32;
                    int i33 = iL28;
                    boolean z14 = cursorF.getInt(i33) != 0;
                    iL28 = i33;
                    int i34 = iL29;
                    boolean z15 = cursorF.getInt(i34) != 0;
                    iL29 = i34;
                    int i35 = iL30;
                    long j19 = cursorF.getLong(i35);
                    iL30 = i35;
                    int i36 = iL31;
                    long j21 = cursorF.getLong(i36);
                    iL31 = i36;
                    int i37 = iL32;
                    iL32 = i37;
                    arrayList.add(new p(string, e0VarD, string2, string3, jVarA, jVarA2, j11, j12, j13, new fb.f(fVarV, wVarB, z12, z13, z14, z15, j19, j21, gb.r.g(cursorF.getBlob(i37))), i12, aVarA, j14, j15, j16, j17, z11, c0VarC, i19, i22, j18, i25, i27, string4));
                    iL13 = i14;
                    i11 = i13;
                }
                cursorF.close();
                uVar.release();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                cursorF.close();
                uVar.release();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            uVar = uVarB;
        }
    }

    public fb.e0 m(String str) {
        w9.u uVarB = w9.u.b(1, anrPHlQ.BBUoEGjvpnL);
        uVarB.l(1, str);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f44875a;
        workDatabase_Impl.b();
        Cursor cursorF = x.F(workDatabase_Impl, uVarB, false);
        try {
            fb.e0 e0VarD = null;
            if (cursorF.moveToFirst()) {
                Integer numValueOf = cursorF.isNull(0) ? null : Integer.valueOf(cursorF.getInt(0));
                if (numValueOf != null) {
                    e0VarD = gb.r.D(numValueOf.intValue());
                }
            }
            return e0VarD;
        } finally {
            cursorF.close();
            uVarB.release();
        }
    }

    public p n(String str) throws Throwable {
        w9.u uVar;
        w9.u uVarB = w9.u.b(1, "SELECT * FROM workspec WHERE id=?");
        uVarB.l(1, str);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f44875a;
        workDatabase_Impl.b();
        Cursor cursorF = x.F(workDatabase_Impl, uVarB, false);
        try {
            int iL = c.a.l(cursorF, "id");
            int iL2 = c.a.l(cursorF, "state");
            int iL3 = c.a.l(cursorF, "worker_class_name");
            int iL4 = c.a.l(cursorF, "input_merger_class_name");
            int iL5 = c.a.l(cursorF, "input");
            int iL6 = c.a.l(cursorF, "output");
            int iL7 = c.a.l(cursorF, "initial_delay");
            int iL8 = c.a.l(cursorF, "interval_duration");
            int iL9 = c.a.l(cursorF, "flex_duration");
            int iL10 = c.a.l(cursorF, "run_attempt_count");
            int iL11 = c.a.l(cursorF, "backoff_policy");
            int iL12 = c.a.l(cursorF, "backoff_delay_duration");
            int iL13 = c.a.l(cursorF, "last_enqueue_time");
            uVar = uVarB;
            try {
                int iL14 = c.a.l(cursorF, "minimum_retention_duration");
                int iL15 = c.a.l(cursorF, "schedule_requested_at");
                int iL16 = c.a.l(cursorF, "run_in_foreground");
                int iL17 = c.a.l(cursorF, "out_of_quota_policy");
                int iL18 = c.a.l(cursorF, "period_count");
                int iL19 = c.a.l(cursorF, "generation");
                int iL20 = c.a.l(cursorF, "next_schedule_time_override");
                int iL21 = c.a.l(cursorF, "next_schedule_time_override_generation");
                int iL22 = c.a.l(cursorF, "stop_reason");
                int iL23 = c.a.l(cursorF, "trace_tag");
                int iL24 = c.a.l(cursorF, "required_network_type");
                int iL25 = c.a.l(cursorF, "required_network_request");
                int iL26 = c.a.l(cursorF, "requires_charging");
                int iL27 = c.a.l(cursorF, "requires_device_idle");
                int iL28 = c.a.l(cursorF, FpIL.AyjIVmsGF);
                int iL29 = c.a.l(cursorF, "requires_storage_not_low");
                int iL30 = c.a.l(cursorF, "trigger_content_update_delay");
                int iL31 = c.a.l(cursorF, "trigger_max_content_delay");
                int iL32 = c.a.l(cursorF, "content_uri_triggers");
                p pVar = null;
                if (cursorF.moveToFirst()) {
                    pVar = new p(cursorF.getString(iL), gb.r.D(cursorF.getInt(iL2)), cursorF.getString(iL3), cursorF.getString(iL4), fb.j.a(cursorF.getBlob(iL5)), fb.j.a(cursorF.getBlob(iL6)), cursorF.getLong(iL7), cursorF.getLong(iL8), cursorF.getLong(iL9), new fb.f(gb.r.V(cursorF.getBlob(iL25)), gb.r.B(cursorF.getInt(iL24)), cursorF.getInt(iL26) != 0, cursorF.getInt(iL27) != 0, cursorF.getInt(iL28) != 0, cursorF.getInt(iL29) != 0, cursorF.getLong(iL30), cursorF.getLong(iL31), gb.r.g(cursorF.getBlob(iL32))), cursorF.getInt(iL10), gb.r.A(cursorF.getInt(iL11)), cursorF.getLong(iL12), cursorF.getLong(iL13), cursorF.getLong(iL14), cursorF.getLong(iL15), cursorF.getInt(iL16) != 0, gb.r.C(cursorF.getInt(iL17)), cursorF.getInt(iL18), cursorF.getInt(iL19), cursorF.getLong(iL20), cursorF.getInt(iL21), cursorF.getInt(iL22), cursorF.isNull(iL23) ? null : cursorF.getString(iL23));
                }
                cursorF.close();
                uVar.release();
                return pVar;
            } catch (Throwable th2) {
                th = th2;
                cursorF.close();
                uVar.release();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            uVar = uVarB;
        }
    }

    public ArrayList o(String str) {
        w9.u uVarB = w9.u.b(1, "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        uVarB.l(1, str);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f44875a;
        workDatabase_Impl.b();
        Cursor cursorF = x.F(workDatabase_Impl, uVarB, false);
        try {
            ArrayList arrayList = new ArrayList(cursorF.getCount());
            while (cursorF.moveToNext()) {
                String id2 = cursorF.getString(0);
                fb.e0 state = gb.r.D(cursorF.getInt(1));
                kotlin.jvm.internal.m.f(id2, "id");
                kotlin.jvm.internal.m.f(state, "state");
                n nVar = new n();
                nVar.f44829a = id2;
                nVar.f44830b = state;
                arrayList.add(nVar);
            }
            cursorF.close();
            uVarB.release();
            return arrayList;
        } catch (Throwable th2) {
            cursorF.close();
            uVarB.release();
            throw th2;
        }
    }

    public void p(long j11, String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f44875a;
        workDatabase_Impl.b();
        h hVar = (h) this.f44886l;
        la.j jVarA = hVar.a();
        jVarA.g(1, j11);
        jVarA.l(2, str);
        try {
            workDatabase_Impl.c();
            try {
                jVarA.a();
                workDatabase_Impl.x();
                workDatabase_Impl.s();
                hVar.i(jVarA);
            } catch (Throwable th2) {
                workDatabase_Impl.s();
                throw th2;
            }
        } catch (Throwable th3) {
            hVar.i(jVarA);
            throw th3;
        }
    }

    public float q(float f5) {
        Float fValueOf;
        g1 g1Var = (g1) this.f44884j;
        float fL = (Float.isNaN(g1Var.l()) ? CropImageView.DEFAULT_ASPECT_RATIO : g1Var.l()) + f5;
        float fC = h().c();
        Collection collectionValues = h().f34055a.values();
        kotlin.jvm.internal.m.f(collectionValues, "<this>");
        Iterator it = collectionValues.iterator();
        if (it.hasNext()) {
            float fFloatValue = ((Number) it.next()).floatValue();
            while (it.hasNext()) {
                fFloatValue = Math.max(fFloatValue, ((Number) it.next()).floatValue());
            }
            fValueOf = Float.valueOf(fFloatValue);
        } else {
            fValueOf = null;
        }
        return hz.b.k(fL, fC, fValueOf != null ? fValueOf.floatValue() : Float.NaN);
    }

    public float r() {
        g1 g1Var = (g1) this.f44884j;
        if (Float.isNaN(g1Var.l())) {
            throw new IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        }
        return g1Var.l();
    }

    public void s(int i11, String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f44875a;
        workDatabase_Impl.b();
        h hVar = (h) this.f44885k;
        la.j jVarA = hVar.a();
        jVarA.l(1, str);
        jVarA.g(2, i11);
        try {
            workDatabase_Impl.c();
            try {
                jVarA.a();
                workDatabase_Impl.x();
                workDatabase_Impl.s();
                hVar.i(jVarA);
            } catch (Throwable th2) {
                workDatabase_Impl.s();
                throw th2;
            }
        } catch (Throwable th3) {
            hVar.i(jVarA);
            throw th3;
        }
    }

    public void t(Object obj) {
        ((k1) this.f44881g).setValue(obj);
    }

    public void u(Object obj) {
        ((k1) this.f44886l).setValue(obj);
    }

    public void v(long j11, String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f44875a;
        workDatabase_Impl.b();
        h hVar = (h) this.f44882h;
        la.j jVarA = hVar.a();
        jVarA.g(1, j11);
        jVarA.l(2, str);
        try {
            workDatabase_Impl.c();
            try {
                jVarA.a();
                workDatabase_Impl.x();
                workDatabase_Impl.s();
                hVar.i(jVarA);
            } catch (Throwable th2) {
                workDatabase_Impl.s();
                throw th2;
            }
        } catch (Throwable th3) {
            hVar.i(jVarA);
            throw th3;
        }
    }

    public void w(String str, fb.j jVar) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f44875a;
        workDatabase_Impl.b();
        h hVar = (h) this.f44881g;
        la.j jVarA = hVar.a();
        fb.j jVar2 = fb.j.f27095b;
        jVarA.t0(j3.V(jVar), 1);
        jVarA.l(2, str);
        try {
            workDatabase_Impl.c();
            try {
                jVarA.a();
                workDatabase_Impl.x();
                workDatabase_Impl.s();
                hVar.i(jVarA);
            } catch (Throwable th2) {
                workDatabase_Impl.s();
                throw th2;
            }
        } catch (Throwable th3) {
            hVar.i(jVarA);
            throw th3;
        }
    }

    public void x(fb.e0 e0Var, String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f44875a;
        workDatabase_Impl.b();
        h hVar = (h) this.f44878d;
        la.j jVarA = hVar.a();
        jVarA.g(1, gb.r.R(e0Var));
        jVarA.l(2, str);
        try {
            workDatabase_Impl.c();
            try {
                jVarA.a();
                workDatabase_Impl.x();
                workDatabase_Impl.s();
                hVar.i(jVarA);
            } catch (Throwable th2) {
                workDatabase_Impl.s();
                throw th2;
            }
        } catch (Throwable th3) {
            hVar.i(jVarA);
            throw th3;
        }
    }

    public void y(int i11, String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f44875a;
        workDatabase_Impl.b();
        h hVar = (h) this.f44887n;
        la.j jVarA = hVar.a();
        jVarA.g(1, i11);
        jVarA.l(2, str);
        try {
            workDatabase_Impl.c();
            try {
                jVarA.a();
                workDatabase_Impl.x();
                workDatabase_Impl.s();
                hVar.i(jVarA);
            } catch (Throwable th2) {
                workDatabase_Impl.s();
                throw th2;
            }
        } catch (Throwable th3) {
            hVar.i(jVarA);
            throw th3;
        }
    }

    public Object z(float f5, xy.i iVar) {
        Object value = ((k1) this.f44881g).getValue();
        Object objE = e(r(), f5, value);
        if (((Boolean) ((fz.c) this.f44878d).invoke(objE)).booleanValue()) {
            Object objC = i1.p.c(this, objE, f5, iVar);
            if (objC == wy.a.COROUTINE_SUSPENDED) {
                return objC;
            }
        } else {
            Object objC2 = i1.p.c(this, value, f5, iVar);
            if (objC2 == wy.a.COROUTINE_SUSPENDED) {
                return objC2;
            }
        }
        return b0.f48488a;
    }

    public void a(HashMap map) {
        Set setKeySet = map.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (map.size() > 999) {
            com.bumptech.glide.e.A(map, new q(this, 1));
            return;
        }
        StringBuilder sbN = ep.a.n("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        int size = setKeySet.size();
        ew.a.i(size, sbN);
        sbN.append(")");
        w9.u uVarB = w9.u.b(size, sbN.toString());
        Iterator it = setKeySet.iterator();
        int i11 = 1;
        while (it.hasNext()) {
            uVarB.l(i11, (String) it.next());
            i11++;
        }
        Cursor cursorF = x.F((WorkDatabase_Impl) this.f44875a, uVarB, false);
        try {
            int iK = c.a.k(cursorF, evRpcb.jZHwHwCnx);
            if (iK == -1) {
                cursorF.close();
                return;
            }
            while (cursorF.moveToNext()) {
                ArrayList arrayList = (ArrayList) map.get(cursorF.getString(iK));
                if (arrayList != null) {
                    arrayList.add(fb.j.a(cursorF.getBlob(0)));
                }
            }
            cursorF.close();
        } catch (Throwable th2) {
            cursorF.close();
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public s(Enum r9, fz.c cVar, fz.a aVar, b0.m mVar, fz.c cVar2) {
        this.f44875a = cVar;
        this.f44876b = (kotlin.jvm.internal.n) aVar;
        this.f44877c = mVar;
        this.f44878d = cVar2;
        this.f44879e = new i0();
        this.f44880f = new i1.v(this);
        this.f44881g = l1.t.B(r9);
        this.f44882h = l1.t.s(new i1.r(this, 4));
        this.f44883i = l1.t.s(new i1.r(this, 2));
        this.f44884j = new g1(Float.NaN);
        l1.t.t(new i1.r(this, 3), l1.g.f39303t);
        this.f44885k = new g1(CropImageView.DEFAULT_ASPECT_RATIO);
        this.f44886l = l1.t.B(null);
        this.m = l1.t.B(new o0(ry.s.f50855a));
        this.f44887n = new i1.u(this);
    }
}
