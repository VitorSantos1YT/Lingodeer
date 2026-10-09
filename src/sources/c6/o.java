package c6;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import com.yalantis.ucrop.view.CropImageView;
import fb.e0;
import g3.a0;
import g3.x;
import g3.z;
import gb.r;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import ob.s;
import qy.b0;
import w9.u;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends kotlin.jvm.internal.n implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f6640b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(String str, int i11) {
        super(1);
        this.f6639a = i11;
        this.f6640b = str;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        int i11 = this.f6639a;
        b0 b0Var = b0.f48488a;
        String str = this.f6640b;
        switch (i11) {
            case 0:
                ((l6.a) obj).f39770a.put(l6.c.f39772a, ns.o.K(str));
                return b0Var;
            case 1:
                z.b((g3.b0) obj, str);
                return b0Var;
            case 2:
                mz.j[] jVarArr = z.f28737a;
                a0 a0Var = x.f28713d;
                mz.j jVar = z.f28737a[2];
                ((g3.b0) obj).b(a0Var, str);
                return b0Var;
            case 3:
                z.b((g3.b0) obj, str);
                return b0Var;
            case 4:
                g3.b0 b0Var2 = (g3.b0) obj;
                j3.h hVar = new j3.h(6, str, null);
                mz.j[] jVarArr2 = z.f28737a;
                b0Var2.b(x.B, ns.o.K(hVar));
                z.d(b0Var2, 0);
                return b0Var;
            case 5:
                g3.b0 b0Var3 = (g3.b0) obj;
                z.b(b0Var3, str);
                z.d(b0Var3, 5);
                return b0Var;
            case 6:
                g3.b0 b0Var4 = (g3.b0) obj;
                mz.j[] jVarArr3 = z.f28737a;
                a0 a0Var2 = x.f28713d;
                mz.j jVar2 = z.f28737a[2];
                b0Var4.b(a0Var2, str);
                z.g(b0Var4, CropImageView.DEFAULT_ASPECT_RATIO);
                return b0Var;
            case 7:
                z.b((g3.b0) obj, str);
                return b0Var;
            case 8:
                g3.b0 b0Var5 = (g3.b0) obj;
                z.f(b0Var5);
                z.b(b0Var5, str);
                return b0Var;
            case 9:
                g3.b0 b0Var6 = (g3.b0) obj;
                z.d(b0Var6, 3);
                z.b(b0Var6, str);
                return b0Var;
            case 10:
                z.b((g3.b0) obj, str);
                return b0Var;
            case 11:
                mz.j[] jVarArr4 = z.f28737a;
                ((g3.b0) obj).b(x.L, str);
                return b0Var;
            default:
                WorkDatabase db2 = (WorkDatabase) obj;
                kotlin.jvm.internal.m.f(db2, "db");
                nf.f fVar = ob.p.f44847y;
                s sVarE = db2.E();
                sVarE.getClass();
                u uVarB = u.b(1, "SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
                uVarB.l(1, str);
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) sVarE.f44875a;
                workDatabase_Impl.b();
                workDatabase_Impl.c();
                try {
                    Cursor cursorF = cf.x.F(workDatabase_Impl, uVarB, true);
                    try {
                        HashMap map = new HashMap();
                        HashMap map2 = new HashMap();
                        while (cursorF.moveToNext()) {
                            String string = cursorF.getString(0);
                            if (!map.containsKey(string)) {
                                map.put(string, new ArrayList());
                            }
                            String string2 = cursorF.getString(0);
                            if (!map2.containsKey(string2)) {
                                map2.put(string2, new ArrayList());
                            }
                        }
                        cursorF.moveToPosition(-1);
                        sVarE.b(map);
                        sVarE.a(map2);
                        ArrayList arrayList = new ArrayList(cursorF.getCount());
                        while (cursorF.moveToNext()) {
                            String string3 = cursorF.getString(0);
                            e0 e0VarD = r.D(cursorF.getInt(1));
                            fb.j jVarA = fb.j.a(cursorF.getBlob(2));
                            int i12 = cursorF.getInt(3);
                            int i13 = cursorF.getInt(4);
                            arrayList.add(new ob.o(string3, e0VarD, jVarA, cursorF.getLong(14), cursorF.getLong(15), cursorF.getLong(16), new fb.f(r.V(cursorF.getBlob(6)), r.B(cursorF.getInt(5)), cursorF.getInt(7) != 0, cursorF.getInt(8) != 0, cursorF.getInt(9) != 0, cursorF.getInt(10) != 0, cursorF.getLong(11), cursorF.getLong(12), r.g(cursorF.getBlob(13))), i12, r.A(cursorF.getInt(17)), cursorF.getLong(18), cursorF.getLong(19), cursorF.getInt(20), i13, cursorF.getLong(21), cursorF.getInt(22), (ArrayList) map.get(cursorF.getString(0)), (ArrayList) map2.get(cursorF.getString(0))));
                        }
                        workDatabase_Impl.x();
                        cursorF.close();
                        uVarB.release();
                        workDatabase_Impl.s();
                        Object objApply = fVar.apply(arrayList);
                        kotlin.jvm.internal.m.e(objApply, "WORK_INFO_MAPPER.apply(d…kStatusPojoForName(name))");
                        return (List) objApply;
                    } catch (Throwable th2) {
                        cursorF.close();
                        uVarB.release();
                        throw th2;
                    }
                } catch (Throwable th3) {
                    workDatabase_Impl.s();
                    throw th3;
                }
        }
    }
}
