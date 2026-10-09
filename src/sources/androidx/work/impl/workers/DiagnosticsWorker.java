package androidx.work.impl.workers;

import android.content.Context;
import android.database.Cursor;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import c.a;
import cf.x;
import fb.c0;
import fb.e0;
import fb.j;
import fb.u;
import fb.w;
import gb.p;
import gb.r;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.m;
import ob.i;
import ob.l;
import ob.s;
import pb.f;
import rb.g;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(Context context, WorkerParameters parameters) {
        super(context, parameters);
        m.f(context, "context");
        m.f(parameters, "parameters");
    }

    @Override // androidx.work.Worker
    public final u c() throws Throwable {
        w9.u uVar;
        i iVar;
        l lVar;
        ob.u uVar2;
        p pVarE = p.E(this.f27110a);
        m.e(pVarE, "getInstance(applicationContext)");
        WorkDatabase workDatabase = pVarE.f28955c;
        m.e(workDatabase, "workManager.workDatabase");
        s sVarE = workDatabase.E();
        l lVarC = workDatabase.C();
        ob.u uVarF = workDatabase.F();
        i iVarB = workDatabase.B();
        pVarE.f28954b.f27049d.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L);
        sVarE.getClass();
        w9.u uVarB = w9.u.b(1, "SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC");
        uVarB.g(1, jCurrentTimeMillis);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) sVarE.f44875a;
        workDatabase_Impl.b();
        Cursor cursorF = x.F(workDatabase_Impl, uVarB, false);
        try {
            int iL = a.l(cursorF, "id");
            int iL2 = a.l(cursorF, "state");
            int iL3 = a.l(cursorF, "worker_class_name");
            int iL4 = a.l(cursorF, "input_merger_class_name");
            int iL5 = a.l(cursorF, "input");
            int iL6 = a.l(cursorF, "output");
            int iL7 = a.l(cursorF, "initial_delay");
            int iL8 = a.l(cursorF, "interval_duration");
            int iL9 = a.l(cursorF, "flex_duration");
            int iL10 = a.l(cursorF, "run_attempt_count");
            int iL11 = a.l(cursorF, "backoff_policy");
            uVar = uVarB;
            try {
                int iL12 = a.l(cursorF, "backoff_delay_duration");
                int iL13 = a.l(cursorF, "last_enqueue_time");
                int iL14 = a.l(cursorF, "minimum_retention_duration");
                int iL15 = a.l(cursorF, "schedule_requested_at");
                int iL16 = a.l(cursorF, "run_in_foreground");
                int iL17 = a.l(cursorF, "out_of_quota_policy");
                int iL18 = a.l(cursorF, "period_count");
                int iL19 = a.l(cursorF, "generation");
                int iL20 = a.l(cursorF, "next_schedule_time_override");
                int iL21 = a.l(cursorF, "next_schedule_time_override_generation");
                int iL22 = a.l(cursorF, "stop_reason");
                int iL23 = a.l(cursorF, "trace_tag");
                int iL24 = a.l(cursorF, "required_network_type");
                int iL25 = a.l(cursorF, "required_network_request");
                int iL26 = a.l(cursorF, "requires_charging");
                int iL27 = a.l(cursorF, "requires_device_idle");
                int iL28 = a.l(cursorF, "requires_battery_not_low");
                int iL29 = a.l(cursorF, "requires_storage_not_low");
                int iL30 = a.l(cursorF, "trigger_content_update_delay");
                int iL31 = a.l(cursorF, "trigger_max_content_delay");
                int iL32 = a.l(cursorF, "content_uri_triggers");
                int i11 = iL14;
                ArrayList arrayList = new ArrayList(cursorF.getCount());
                while (cursorF.moveToNext()) {
                    String string = cursorF.getString(iL);
                    e0 e0VarD = r.D(cursorF.getInt(iL2));
                    String string2 = cursorF.getString(iL3);
                    String string3 = cursorF.getString(iL4);
                    j jVarA = j.a(cursorF.getBlob(iL5));
                    j jVarA2 = j.a(cursorF.getBlob(iL6));
                    long j11 = cursorF.getLong(iL7);
                    long j12 = cursorF.getLong(iL8);
                    long j13 = cursorF.getLong(iL9);
                    int i12 = cursorF.getInt(iL10);
                    fb.a aVarA = r.A(cursorF.getInt(iL11));
                    long j14 = cursorF.getLong(iL12);
                    long j15 = cursorF.getLong(iL13);
                    int i13 = i11;
                    long j16 = cursorF.getLong(i13);
                    int i14 = iL8;
                    int i15 = iL15;
                    long j17 = cursorF.getLong(i15);
                    iL15 = i15;
                    int i16 = iL16;
                    boolean z11 = cursorF.getInt(i16) != 0;
                    iL16 = i16;
                    int i17 = iL17;
                    c0 c0VarC = r.C(cursorF.getInt(i17));
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
                    w wVarB = r.B(cursorF.getInt(i29));
                    iL24 = i29;
                    int i30 = iL25;
                    f fVarV = r.V(cursorF.getBlob(i30));
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
                    arrayList.add(new ob.p(string, e0VarD, string2, string3, jVarA, jVarA2, j11, j12, j13, new fb.f(fVarV, wVarB, z12, z13, z14, z15, j19, j21, r.g(cursorF.getBlob(i37))), i12, aVarA, j14, j15, j16, j17, z11, c0VarC, i19, i22, j18, i25, i27, string4));
                    iL8 = i14;
                    i11 = i13;
                }
                cursorF.close();
                uVar.release();
                ArrayList arrayListK = sVarE.k();
                ArrayList arrayListG = sVarE.g();
                if (arrayList.isEmpty()) {
                    iVar = iVarB;
                    lVar = lVarC;
                    uVar2 = uVarF;
                } else {
                    fb.l lVarB = fb.l.b();
                    int i38 = g.f49074a;
                    lVarB.getClass();
                    fb.l lVarB2 = fb.l.b();
                    iVar = iVarB;
                    lVar = lVarC;
                    uVar2 = uVarF;
                    g.a(lVar, uVar2, iVar, arrayList);
                    lVarB2.getClass();
                }
                if (!arrayListK.isEmpty()) {
                    fb.l lVarB3 = fb.l.b();
                    int i39 = g.f49074a;
                    lVarB3.getClass();
                    fb.l lVarB4 = fb.l.b();
                    g.a(lVar, uVar2, iVar, arrayListK);
                    lVarB4.getClass();
                }
                if (!arrayListG.isEmpty()) {
                    fb.l lVarB5 = fb.l.b();
                    int i40 = g.f49074a;
                    lVarB5.getClass();
                    fb.l lVarB6 = fb.l.b();
                    g.a(lVar, uVar2, iVar, arrayListG);
                    lVarB6.getClass();
                }
                return u.a();
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
}
