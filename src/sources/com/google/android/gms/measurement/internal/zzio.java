package com.google.android.gms.measurement.internal;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzahh;
import com.google.android.gms.internal.measurement.zzahi;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzio implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzr f13153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzjd f13154b;

    public zzio(zzjd zzjdVar, zzr zzrVar) {
        this.f13153a = zzrVar;
        this.f13154b = zzjdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjd zzjdVar = this.f13154b;
        zzjdVar.f13199a.W();
        zzpg zzpgVar = zzjdVar.f13199a;
        if (zzpgVar.f13618y != null) {
            ArrayList arrayList = new ArrayList();
            zzpgVar.f13619z = arrayList;
            arrayList.addAll(zzpgVar.f13618y);
        }
        zzaw zzawVar = zzpgVar.f13597c;
        zzpg.U(zzawVar);
        zzic zzicVar = zzawVar.f13202a;
        zzr zzrVar = this.f13153a;
        String str = zzrVar.f13655a;
        Preconditions.g(str);
        Preconditions.d(str);
        zzawVar.g();
        zzawVar.h();
        try {
            SQLiteDatabase sQLiteDatabaseX = zzawVar.X();
            String[] strArr = {str};
            int iDelete = sQLiteDatabaseX.delete("apps", "app_id=?", strArr) + sQLiteDatabaseX.delete("events", "app_id=?", strArr) + sQLiteDatabaseX.delete("events_snapshot", "app_id=?", strArr) + sQLiteDatabaseX.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseX.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseX.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseX.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseX.delete("queue", "app_id=?", strArr) + sQLiteDatabaseX.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseX.delete("main_event_params", "app_id=?", strArr) + sQLiteDatabaseX.delete("default_event_params", "app_id=?", strArr) + sQLiteDatabaseX.delete("trigger_uris", "app_id=?", strArr) + sQLiteDatabaseX.delete("upload_queue", "app_id=?", strArr);
            ((zzahi) zzahh.f11382b.f11383a.get()).getClass();
            if (zzicVar.f13097d.r(null, zzfy.f12844c1)) {
                iDelete += sQLiteDatabaseX.delete("no_data_mode_events", "app_id=?", strArr);
            }
            int iDelete2 = iDelete + sQLiteDatabaseX.delete("diagnostic_signals", "app_id=?", strArr);
            if (iDelete2 > 0) {
                zzgu zzguVar = zzicVar.f13099f;
                zzic.m(zzguVar);
                zzguVar.f12949n.c(str, Integer.valueOf(iDelete2), "Reset analytics data. app, records");
            }
        } catch (SQLiteException e8) {
            zzgu zzguVar2 = zzicVar.f13099f;
            zzic.m(zzguVar2);
            zzguVar2.f12942f.c(zzgu.o(str), e8, "Error resetting analytics data. appId, error");
        }
        if (zzrVar.H) {
            zzpgVar.Z(zzrVar);
        }
    }
}
