package com.google.android.gms.measurement.internal;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DefaultClock;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzov implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzpg f13567a;

    public zzov(zzpg zzpgVar, zzph zzphVar) {
        this.f13567a = zzpgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzpg zzpgVar = this.f13567a;
        zzpgVar.e().g();
        zzpgVar.f13605k = new zzhk(zzpgVar);
        zzaw zzawVar = new zzaw(zzpgVar);
        zzawVar.i();
        zzpgVar.f13597c = zzawVar;
        zzht zzhtVar = zzpgVar.f13595a;
        zzal zzalVarF0 = zzpgVar.f0();
        Preconditions.g(zzhtVar);
        zzalVarF0.f12630d = zzhtVar;
        zznn zznnVar = new zznn(zzpgVar);
        zznnVar.i();
        zzpgVar.f13603i = zznnVar;
        zzad zzadVar = new zzad(zzpgVar);
        zzadVar.i();
        zzpgVar.f13600f = zzadVar;
        zzlp zzlpVar = new zzlp(zzpgVar);
        zzlpVar.i();
        zzpgVar.f13602h = zzlpVar;
        zzok zzokVar = new zzok(zzpgVar);
        zzokVar.i();
        zzpgVar.f13599e = zzokVar;
        zzpgVar.f13598d = new zzhb(zzpgVar);
        if (zzpgVar.f13611r != zzpgVar.f13612s) {
            zzpgVar.b().f12942f.c(Integer.valueOf(zzpgVar.f13611r), Integer.valueOf(zzpgVar.f13612s), "Not all upload components initialized");
        }
        zzpgVar.m.set(true);
        zzpgVar.b().f12949n.a("UploadController is now fully initialized");
        zzpgVar.e().g();
        zzaw zzawVar2 = zzpgVar.f13597c;
        zzpg.U(zzawVar2);
        zzawVar2.q();
        zzaw zzawVar3 = zzpgVar.f13597c;
        zzpg.U(zzawVar3);
        zzawVar3.g();
        zzawVar3.h();
        if (zzawVar3.R()) {
            zzfx zzfxVar = zzfy.f12884u0;
            if (((Long) zzfxVar.a(null)).longValue() != 0) {
                SQLiteDatabase sQLiteDatabaseX = zzawVar3.X();
                zzic zzicVar = zzawVar3.f13202a;
                zzicVar.f13104k.getClass();
                int iDelete = sQLiteDatabaseX.delete("trigger_uris", "abs(timestamp_millis - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(zzfxVar.a(null))});
                if (iDelete > 0) {
                    zzgu zzguVar = zzicVar.f13099f;
                    zzic.m(zzguVar);
                    zzguVar.f12949n.b(Integer.valueOf(iDelete), "Deleted stale trigger uris. rowsDeleted");
                }
            }
        }
        if (zzpgVar.f13603i.f13503h.a() == 0) {
            zzhe zzheVar = zzpgVar.f13603i.f13503h;
            ((DefaultClock) zzpgVar.c()).getClass();
            zzheVar.b(System.currentTimeMillis());
        }
        zzpgVar.N();
    }
}
