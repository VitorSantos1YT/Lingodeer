package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import androidx.lifecycle.lifecycle.viewmodel.anchor.hIIS.scqhIrGXy;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.GmsClientSupervisor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.DefaultClock;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zznl extends zzg {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zznf f13488c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public zzgb f13489d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile Boolean f13490e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final zzmm f13491f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ScheduledExecutorService f13492g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final zzog f13493h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f13494i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final zzmq f13495j;

    public zznl(zzic zzicVar) {
        super(zzicVar);
        this.f13494i = new ArrayList();
        this.f13493h = new zzog(zzicVar.f13104k);
        this.f13488c = new zznf(this);
        this.f13491f = new zzmm(this, zzicVar);
        this.f13495j = new zzmq(this, zzicVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    public final boolean j() {
        return false;
    }

    public final void k(AtomicReference atomicReference) {
        g();
        h();
        u(new zzmi(this, atomicReference, w(false)));
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0052  */
    /* JADX WARN: Code duplicated, block: B:14:0x0055  */
    public final void l(Bundle bundle) {
        boolean z11;
        boolean zN;
        g();
        h();
        zzbf zzbfVar = new zzbf(bundle);
        s();
        zzic zzicVar = this.f13202a;
        if (zzicVar.f13097d.r(null, zzfy.W0)) {
            zzgl zzglVarO = zzicVar.o();
            zzic zzicVar2 = zzglVarO.f13202a;
            zzpp zzppVar = zzicVar2.f13102i;
            zzgu zzguVar = zzicVar2.f13099f;
            zzic.k(zzppVar);
            byte[] bArrQ = zzpp.Q(zzbfVar);
            if (bArrQ == null) {
                zzic.m(zzguVar);
                zzguVar.f12943g.a("Null default event parameters; not writing to database");
            } else {
                if (bArrQ.length > 131072) {
                    zzic.m(zzguVar);
                    zzguVar.f12943g.a("Default event parameters too long for local database. Sending directly to service");
                } else {
                    zN = zzglVarO.n(bArrQ, 4);
                }
                if (zN) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            }
            zN = false;
            if (zN) {
                z11 = true;
            } else {
                z11 = false;
            }
        } else {
            z11 = false;
        }
        u(new zzmo(this, w(false), z11, zzbfVar, bundle));
    }

    public final void m() {
        g();
        h();
        if (x()) {
            return;
        }
        if (n()) {
            zznf zznfVar = this.f13488c;
            zznl zznlVar = zznfVar.f13474c;
            zznlVar.g();
            Context context = zznlVar.f13202a.f13094a;
            synchronized (zznfVar) {
                try {
                    if (zznfVar.f13472a) {
                        zzgu zzguVar = zznfVar.f13474c.f13202a.f13099f;
                        zzic.m(zzguVar);
                        zzguVar.f12949n.a("Connection attempt already in progress");
                        return;
                    } else {
                        if (zznfVar.f13473b != null && (zznfVar.f13473b.g() || zznfVar.f13473b.c())) {
                            zzgu zzguVar2 = zznfVar.f13474c.f13202a.f13099f;
                            zzic.m(zzguVar2);
                            zzguVar2.f12949n.a("Already awaiting connection attempt");
                            return;
                        }
                        zznfVar.f13473b = new zzgo(context, Looper.getMainLooper(), GmsClientSupervisor.a(context), GoogleApiAvailabilityLight.f8646b, 93, zznfVar, zznfVar, null);
                        zzgu zzguVar3 = zznfVar.f13474c.f13202a.f13099f;
                        zzic.m(zzguVar3);
                        zzguVar3.f12949n.a("Connecting to remote service");
                        zznfVar.f13472a = true;
                        Preconditions.g(zznfVar.f13473b);
                        zznfVar.f13473b.q();
                        return;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        zzic zzicVar = this.f13202a;
        if (zzicVar.f13097d.j()) {
            return;
        }
        List<ResolveInfo> listQueryIntentServices = zzicVar.f13094a.getPackageManager().queryIntentServices(new Intent().setClassName(zzicVar.f13094a, "com.google.android.gms.measurement.AppMeasurementService"), 65536);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            zzgu zzguVar4 = zzicVar.f13099f;
            zzic.m(zzguVar4);
            zzguVar4.f12942f.a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.measurement.START");
        intent.setComponent(new ComponentName(zzicVar.f13094a, "com.google.android.gms.measurement.AppMeasurementService"));
        zznf zznfVar2 = this.f13488c;
        zznl zznlVar2 = zznfVar2.f13474c;
        zznlVar2.g();
        Context context2 = zznlVar2.f13202a.f13094a;
        ConnectionTracker connectionTrackerB = ConnectionTracker.b();
        synchronized (zznfVar2) {
            try {
                if (zznfVar2.f13472a) {
                    zzgu zzguVar5 = zznfVar2.f13474c.f13202a.f13099f;
                    zzic.m(zzguVar5);
                    zzguVar5.f12949n.a("Connection attempt already in progress");
                } else {
                    zznl zznlVar3 = zznfVar2.f13474c;
                    zzgu zzguVar6 = zznlVar3.f13202a.f13099f;
                    zzic.m(zzguVar6);
                    zzguVar6.f12949n.a("Using local app measurement service");
                    zznfVar2.f13472a = true;
                    connectionTrackerB.a(context2, intent, zznlVar3.f13488c, 129);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void o() {
        g();
        h();
        zznf zznfVar = this.f13488c;
        if (zznfVar.f13473b != null && (zznfVar.f13473b.c() || zznfVar.f13473b.g())) {
            zznfVar.f13473b.j();
        }
        zznfVar.f13473b = null;
        try {
            ConnectionTracker.b().c(this.f13202a.f13094a, zznfVar);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f13489d = null;
    }

    public final boolean p() {
        g();
        h();
        if (!n()) {
            return true;
        }
        zzpp zzppVar = this.f13202a.f13102i;
        zzic.k(zzppVar);
        return zzppVar.S() >= ((Integer) zzfy.J0.a(null)).intValue();
    }

    public final boolean q() {
        g();
        h();
        if (!n()) {
            return true;
        }
        zzpp zzppVar = this.f13202a.f13102i;
        zzic.k(zzppVar);
        return zzppVar.S() >= 241200;
    }

    public final void r(ComponentName componentName) {
        g();
        if (this.f13489d != null) {
            this.f13489d = null;
            zzgu zzguVar = this.f13202a.f13099f;
            zzic.m(zzguVar);
            zzguVar.f12949n.b(componentName, "Disconnected from device MeasurementService");
            g();
            m();
        }
    }

    public final void s() {
        this.f13202a.getClass();
    }

    public final void t() {
        g();
        zzog zzogVar = this.f13493h;
        zzogVar.f13544b = zzogVar.f13543a.b();
        this.f13202a.getClass();
        this.f13491f.b(((Long) zzfy.Y.a(null)).longValue());
    }

    public final void u(Runnable runnable) {
        g();
        if (x()) {
            runnable.run();
            return;
        }
        ArrayList arrayList = this.f13494i;
        long size = arrayList.size();
        zzic zzicVar = this.f13202a;
        zzicVar.getClass();
        if (size >= 1000) {
            zzgu zzguVar = zzicVar.f13099f;
            zzic.m(zzguVar);
            zzguVar.f12942f.a("Discarding data. Max runnable queue size reached");
        } else {
            arrayList.add(runnable);
            this.f13495j.b(60000L);
            m();
        }
    }

    public final void v() {
        g();
        zzic zzicVar = this.f13202a;
        zzgu zzguVar = zzicVar.f13099f;
        zzic.m(zzguVar);
        zzgs zzgsVar = zzguVar.f12949n;
        ArrayList arrayList = this.f13494i;
        zzgsVar.b(Integer.valueOf(arrayList.size()), "Processing queued up service tasks");
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            try {
                ((Runnable) obj).run();
            } catch (RuntimeException e8) {
                zzgu zzguVar2 = zzicVar.f13099f;
                zzic.m(zzguVar2);
                zzguVar2.f12942f.b(e8, "Task exception while flushing queue");
            }
        }
        arrayList.clear();
        this.f13495j.c();
    }

    public final zzr w(boolean z11) {
        long jAbs;
        Pair pair;
        zzic zzicVar = this.f13202a;
        zzicVar.getClass();
        zzgi zzgiVarR = zzicVar.r();
        String strU = null;
        if (z11) {
            zzgu zzguVar = zzicVar.f13099f;
            zzic.m(zzguVar);
            zzic zzicVar2 = zzguVar.f13202a;
            zzhh zzhhVar = zzicVar2.f13098e;
            zzic.k(zzhhVar);
            if (zzhhVar.f13022e != null) {
                zzhh zzhhVar2 = zzicVar2.f13098e;
                zzic.k(zzhhVar2);
                zzhf zzhfVar = zzhhVar2.f13022e;
                zzhh zzhhVar3 = zzhfVar.f13014e;
                zzhhVar3.g();
                zzhhVar3.g();
                long j11 = zzhfVar.f13014e.k().getLong(zzhfVar.f13010a, 0L);
                if (j11 == 0) {
                    zzhfVar.a();
                    jAbs = 0;
                } else {
                    zzhhVar3.f13202a.f13104k.getClass();
                    jAbs = Math.abs(j11 - System.currentTimeMillis());
                }
                long j12 = zzhfVar.f13013d;
                if (jAbs < j12) {
                    pair = null;
                } else if (jAbs > j12 + j12) {
                    zzhfVar.a();
                    pair = null;
                } else {
                    String string = zzhhVar3.k().getString(zzhfVar.f13012c, null);
                    long j13 = zzhhVar3.k().getLong(zzhfVar.f13011b, 0L);
                    zzhfVar.a();
                    pair = (string == null || j13 <= 0) ? zzhh.f13019z : new Pair(string, Long.valueOf(j13));
                }
                if (pair != null && pair != zzhh.f13019z) {
                    String strValueOf = String.valueOf(pair.second);
                    String str = (String) pair.first;
                    strU = p.u(new StringBuilder(strValueOf.length() + 1 + String.valueOf(str).length()), strValueOf, ":", str);
                }
            }
        }
        return zzgiVarR.k(strU);
    }

    public final boolean x() {
        g();
        h();
        return this.f13489d != null;
    }

    /* JADX WARN: Code duplicated, block: B:259:0x043c A[Catch: all -> 0x0478, TRY_ENTER, TryCatch #49 {all -> 0x0478, blocks: (B:269:0x0468, B:259:0x043c, B:261:0x0442, B:262:0x0445, B:279:0x0489, B:208:0x0373, B:210:0x037d, B:215:0x038e), top: B:397:0x0468 }] */
    /* JADX WARN: Code duplicated, block: B:264:0x0454  */
    /* JADX WARN: Code duplicated, block: B:272:0x046f  */
    /* JADX WARN: Code duplicated, block: B:274:0x0474 A[PHI: r5 r7 r24 r25 r27 r37 r38
      0x0474: PHI (r5v15 android.database.sqlite.SQLiteDatabase) = 
      (r5v12 android.database.sqlite.SQLiteDatabase)
      (r5v13 android.database.sqlite.SQLiteDatabase)
      (r5v16 android.database.sqlite.SQLiteDatabase)
     binds: [B:265:0x0457, B:282:0x049b, B:273:0x0472] A[DONT_GENERATE, DONT_INLINE]
      0x0474: PHI (r7v5 int) = (r7v3 int), (r7v3 int), (r7v6 int) binds: [B:265:0x0457, B:282:0x049b, B:273:0x0472] A[DONT_GENERATE, DONT_INLINE]
      0x0474: PHI (r24v9 int) = (r24v6 int), (r24v7 int), (r24v10 int) binds: [B:265:0x0457, B:282:0x049b, B:273:0x0472] A[DONT_GENERATE, DONT_INLINE]
      0x0474: PHI (r25v9 java.lang.String) = (r25v6 java.lang.String), (r25v7 java.lang.String), (r25v10 java.lang.String) binds: [B:265:0x0457, B:282:0x049b, B:273:0x0472] A[DONT_GENERATE, DONT_INLINE]
      0x0474: PHI (r27v9 java.lang.String) = (r27v6 java.lang.String), (r27v7 java.lang.String), (r27v10 java.lang.String) binds: [B:265:0x0457, B:282:0x049b, B:273:0x0472] A[DONT_GENERATE, DONT_INLINE]
      0x0474: PHI (r37v9 int) = (r37v6 int), (r37v7 int), (r37v10 int) binds: [B:265:0x0457, B:282:0x049b, B:273:0x0472] A[DONT_GENERATE, DONT_INLINE]
      0x0474: PHI (r38v9 java.lang.String) = (r38v6 java.lang.String), (r38v7 java.lang.String), (r38v10 java.lang.String) binds: [B:265:0x0457, B:282:0x049b, B:273:0x0472] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:281:0x0498  */
    /* JADX WARN: Code duplicated, block: B:286:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:288:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:293:0x04cb  */
    /* JADX WARN: Code duplicated, block: B:294:0x04d4  */
    /* JADX WARN: Code duplicated, block: B:301:0x04ee  */
    /* JADX WARN: Code duplicated, block: B:303:0x04ff  */
    /* JADX WARN: Code duplicated, block: B:305:0x0507  */
    /* JADX WARN: Code duplicated, block: B:306:0x058f  */
    /* JADX WARN: Code duplicated, block: B:317:0x05ba A[Catch: RemoteException -> 0x05e8, TRY_LEAVE, TryCatch #40 {RemoteException -> 0x05e8, blocks: (B:315:0x05af, B:317:0x05ba), top: B:387:0x05af }] */
    /* JADX WARN: Code duplicated, block: B:320:0x05c6  */
    /* JADX WARN: Code duplicated, block: B:338:0x0624  */
    /* JADX WARN: Code duplicated, block: B:340:0x0628  */
    /* JADX WARN: Code duplicated, block: B:342:0x0649  */
    /* JADX WARN: Code duplicated, block: B:348:0x0668  */
    /* JADX WARN: Code duplicated, block: B:354:0x0680  */
    /* JADX WARN: Code duplicated, block: B:362:0x06a1  */
    /* JADX WARN: Code duplicated, block: B:381:0x0655 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:393:0x066c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:412:0x0595 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:456:0x049e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:457:0x049e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:459:0x049e A[SYNTHETIC] */
    public final void y(zzgb zzgbVar, AbstractSafeParcelable abstractSafeParcelable, zzr zzrVar) throws Throwable {
        ArrayList arrayList;
        zzic zzicVar;
        Context context;
        zzgu zzguVar;
        int i11;
        SQLiteDatabase sQLiteDatabaseM;
        int i12;
        int i13;
        Cursor cursor;
        Cursor cursorQuery;
        Cursor cursorQuery2;
        long j11;
        String str;
        String[] strArr;
        int i14;
        long j12;
        String string;
        zzfx zzfxVar;
        zzbf zzbfVarCreateFromParcel;
        int i15;
        zzah zzahVarCreateFromParcel;
        zzpl zzplVarCreateFromParcel;
        int size;
        int size2;
        int i16;
        zzgk zzgkVar;
        AbstractSafeParcelable abstractSafeParcelable2;
        zzfx zzfxVar2;
        zzic zzicVar2;
        Context context2;
        zzgu zzguVar2;
        long jElapsedRealtime;
        long j13;
        long jCurrentTimeMillis;
        String str2;
        g();
        h();
        s();
        zzic zzicVar3 = this.f13202a;
        zzicVar3.getClass();
        Context context3 = zzicVar3.f13094a;
        zzal zzalVar = zzicVar3.f13097d;
        zzgu zzguVar3 = zzicVar3.f13099f;
        DefaultClock defaultClock = zzicVar3.f13104k;
        int i17 = 100;
        zzr zzrVar2 = zzrVar;
        int i18 = 0;
        for (int i19 = 100; i18 < 1001 && i19 == i17; i19 = size) {
            ArrayList arrayList2 = new ArrayList();
            zzgl zzglVarO = zzicVar3.o();
            int i21 = i17;
            String str3 = "entry";
            String str4 = "type";
            String str5 = "rowid";
            DefaultClock defaultClock2 = defaultClock;
            zzic zzicVar4 = zzglVarO.f13202a;
            zzglVarO.g();
            int i22 = i18;
            if (zzglVarO.f12917d) {
                zzicVar = zzicVar3;
                context = context3;
                zzguVar = zzguVar3;
            } else {
                arrayList = new ArrayList();
                zzicVar = zzicVar3;
                if (zzglVarO.f13202a.f13094a.getDatabasePath("google_app_measurement_local.db").exists()) {
                    int i23 = 5;
                    context = context3;
                    zzguVar = zzguVar3;
                    int i24 = 0;
                    int i25 = 5;
                    while (true) {
                        if (i24 < i23) {
                            try {
                                sQLiteDatabaseM = zzglVarO.m();
                                if (sQLiteDatabaseM == null) {
                                    try {
                                        try {
                                            zzglVarO.f12917d = true;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            sQLiteDatabaseM = sQLiteDatabaseM;
                                            cursor = null;
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            if (sQLiteDatabaseM != null) {
                                                sQLiteDatabaseM.close();
                                            }
                                            throw th;
                                        }
                                    } catch (SQLiteDatabaseLockedException unused) {
                                        i12 = i24;
                                        i13 = 5;
                                        str4 = str4;
                                        cursorQuery = null;
                                        try {
                                            SystemClock.sleep(i25);
                                            i25 += 20;
                                            if (cursorQuery != null) {
                                                cursorQuery.close();
                                            }
                                            if (sQLiteDatabaseM != null) {
                                                sQLiteDatabaseM.close();
                                            }
                                            i24 = i12 + 1;
                                            i23 = i13;
                                            str4 = str4;
                                            str3 = str3;
                                            str5 = str5;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            cursor = cursorQuery;
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            if (sQLiteDatabaseM != null) {
                                                sQLiteDatabaseM.close();
                                            }
                                            throw th;
                                        }
                                    } catch (SQLiteFullException e8) {
                                        e = e8;
                                        i12 = i24;
                                        i13 = 5;
                                        str4 = str4;
                                        cursorQuery = null;
                                        zzgu zzguVar4 = zzicVar4.f13099f;
                                        zzic.m(zzguVar4);
                                        zzguVar4.f12942f.b(e, "Error reading entries from local database");
                                        zzglVarO.f12917d = true;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (sQLiteDatabaseM != null) {
                                            sQLiteDatabaseM.close();
                                        }
                                        i24 = i12 + 1;
                                        i23 = i13;
                                        str4 = str4;
                                        str3 = str3;
                                        str5 = str5;
                                    } catch (SQLiteException e10) {
                                        e = e10;
                                        i12 = i24;
                                        i13 = 5;
                                        str4 = str4;
                                        cursorQuery = null;
                                        if (sQLiteDatabaseM != null && sQLiteDatabaseM.inTransaction()) {
                                            sQLiteDatabaseM.endTransaction();
                                        }
                                        zzgu zzguVar5 = zzicVar4.f13099f;
                                        zzic.m(zzguVar5);
                                        zzguVar5.f12942f.b(e, "Error reading entries from local database");
                                        zzglVarO.f12917d = true;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (sQLiteDatabaseM != null) {
                                            sQLiteDatabaseM.close();
                                        }
                                        i24 = i12 + 1;
                                        i23 = i13;
                                        str4 = str4;
                                        str3 = str3;
                                        str5 = str5;
                                    }
                                } else {
                                    sQLiteDatabaseM.beginTransaction();
                                    try {
                                        cursorQuery2 = sQLiteDatabaseM.query("messages", new String[]{str5}, "type=?", new String[]{"3"}, null, null, "rowid desc", "1");
                                        try {
                                            long j14 = -1;
                                            if (cursorQuery2.moveToFirst()) {
                                                i12 = i24;
                                                try {
                                                    j11 = cursorQuery2.getLong(0);
                                                    try {
                                                        cursorQuery2.close();
                                                    } catch (SQLiteDatabaseLockedException unused2) {
                                                        i13 = 5;
                                                        str4 = str4;
                                                        cursorQuery = null;
                                                        SystemClock.sleep(i25);
                                                        i25 += 20;
                                                        if (cursorQuery != null) {
                                                            cursorQuery.close();
                                                        }
                                                        if (sQLiteDatabaseM != null) {
                                                            sQLiteDatabaseM.close();
                                                        }
                                                        i24 = i12 + 1;
                                                        i23 = i13;
                                                        str4 = str4;
                                                        str3 = str3;
                                                        str5 = str5;
                                                    } catch (SQLiteFullException e11) {
                                                        e = e11;
                                                        i13 = 5;
                                                        str4 = str4;
                                                        cursorQuery = null;
                                                        zzgu zzguVar6 = zzicVar4.f13099f;
                                                        zzic.m(zzguVar6);
                                                        zzguVar6.f12942f.b(e, "Error reading entries from local database");
                                                        zzglVarO.f12917d = true;
                                                        if (cursorQuery != null) {
                                                            cursorQuery.close();
                                                        }
                                                        if (sQLiteDatabaseM != null) {
                                                            sQLiteDatabaseM.close();
                                                        }
                                                        i24 = i12 + 1;
                                                        i23 = i13;
                                                        str4 = str4;
                                                        str3 = str3;
                                                        str5 = str5;
                                                    } catch (SQLiteException e12) {
                                                        e = e12;
                                                        i13 = 5;
                                                        str4 = str4;
                                                        cursorQuery = null;
                                                        if (sQLiteDatabaseM != null) {
                                                            sQLiteDatabaseM.endTransaction();
                                                        }
                                                        zzgu zzguVar7 = zzicVar4.f13099f;
                                                        zzic.m(zzguVar7);
                                                        zzguVar7.f12942f.b(e, "Error reading entries from local database");
                                                        zzglVarO.f12917d = true;
                                                        if (cursorQuery != null) {
                                                            cursorQuery.close();
                                                        }
                                                        if (sQLiteDatabaseM != null) {
                                                            sQLiteDatabaseM.close();
                                                        }
                                                        i24 = i12 + 1;
                                                        i23 = i13;
                                                        str4 = str4;
                                                        str3 = str3;
                                                        str5 = str5;
                                                    }
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    i13 = 5;
                                                    if (cursorQuery2 != null) {
                                                        try {
                                                            cursorQuery2.close();
                                                        } catch (SQLiteDatabaseLockedException unused3) {
                                                            cursorQuery = null;
                                                            SystemClock.sleep(i25);
                                                            i25 += 20;
                                                            if (cursorQuery != null) {
                                                                cursorQuery.close();
                                                            }
                                                            if (sQLiteDatabaseM != null) {
                                                                sQLiteDatabaseM.close();
                                                            }
                                                            i24 = i12 + 1;
                                                            i23 = i13;
                                                            str4 = str4;
                                                            str3 = str3;
                                                            str5 = str5;
                                                        } catch (SQLiteFullException e13) {
                                                            e = e13;
                                                            cursorQuery = null;
                                                            zzgu zzguVar8 = zzicVar4.f13099f;
                                                            zzic.m(zzguVar8);
                                                            zzguVar8.f12942f.b(e, "Error reading entries from local database");
                                                            zzglVarO.f12917d = true;
                                                            if (cursorQuery != null) {
                                                                cursorQuery.close();
                                                            }
                                                            if (sQLiteDatabaseM != null) {
                                                                sQLiteDatabaseM.close();
                                                            }
                                                            i24 = i12 + 1;
                                                            i23 = i13;
                                                            str4 = str4;
                                                            str3 = str3;
                                                            str5 = str5;
                                                        } catch (SQLiteException e14) {
                                                            e = e14;
                                                            cursorQuery = null;
                                                            if (sQLiteDatabaseM != null) {
                                                                sQLiteDatabaseM.endTransaction();
                                                            }
                                                            zzgu zzguVar9 = zzicVar4.f13099f;
                                                            zzic.m(zzguVar9);
                                                            zzguVar9.f12942f.b(e, "Error reading entries from local database");
                                                            zzglVarO.f12917d = true;
                                                            if (cursorQuery != null) {
                                                                cursorQuery.close();
                                                            }
                                                            if (sQLiteDatabaseM != null) {
                                                                sQLiteDatabaseM.close();
                                                            }
                                                            i24 = i12 + 1;
                                                            i23 = i13;
                                                            str4 = str4;
                                                            str3 = str3;
                                                            str5 = str5;
                                                        } catch (Throwable th5) {
                                                            th = th5;
                                                            cursor = null;
                                                            if (cursor != null) {
                                                                cursor.close();
                                                            }
                                                            if (sQLiteDatabaseM != null) {
                                                                sQLiteDatabaseM.close();
                                                            }
                                                            throw th;
                                                        }
                                                    }
                                                    throw th;
                                                }
                                            } else {
                                                i12 = i24;
                                                cursorQuery2.close();
                                                j11 = -1;
                                            }
                                            if (j11 != -1) {
                                                str = "rowid<?";
                                                strArr = new String[]{String.valueOf(j11)};
                                            } else {
                                                str = null;
                                                strArr = null;
                                            }
                                            try {
                                                String[] strArr2 = {str5, str4, str3};
                                                zzal zzalVar2 = zzicVar4.f13097d;
                                                zzfx zzfxVar3 = zzfy.W0;
                                                str5 = str5;
                                                try {
                                                    try {
                                                        int i26 = 4;
                                                        int i27 = 3;
                                                        if (zzalVar2.r(null, zzfxVar3)) {
                                                            i14 = 5;
                                                            try {
                                                                strArr2 = new String[]{str5, str4, str3, "app_version", "app_version_int"};
                                                            } catch (SQLiteDatabaseLockedException unused4) {
                                                                i13 = 5;
                                                                str4 = str4;
                                                                cursorQuery = null;
                                                                SystemClock.sleep(i25);
                                                                i25 += 20;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                if (sQLiteDatabaseM != null) {
                                                                    sQLiteDatabaseM.close();
                                                                }
                                                                i24 = i12 + 1;
                                                                i23 = i13;
                                                                str4 = str4;
                                                                str3 = str3;
                                                                str5 = str5;
                                                            } catch (SQLiteFullException e15) {
                                                                e = e15;
                                                                i13 = 5;
                                                                str4 = str4;
                                                                cursorQuery = null;
                                                                zzgu zzguVar10 = zzicVar4.f13099f;
                                                                zzic.m(zzguVar10);
                                                                zzguVar10.f12942f.b(e, "Error reading entries from local database");
                                                                zzglVarO.f12917d = true;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                if (sQLiteDatabaseM != null) {
                                                                    sQLiteDatabaseM.close();
                                                                }
                                                                i24 = i12 + 1;
                                                                i23 = i13;
                                                                str4 = str4;
                                                                str3 = str3;
                                                                str5 = str5;
                                                            } catch (SQLiteException e16) {
                                                                e = e16;
                                                                i13 = 5;
                                                                str4 = str4;
                                                                cursorQuery = null;
                                                                if (sQLiteDatabaseM != null) {
                                                                    sQLiteDatabaseM.endTransaction();
                                                                }
                                                                zzgu zzguVar11 = zzicVar4.f13099f;
                                                                zzic.m(zzguVar11);
                                                                zzguVar11.f12942f.b(e, "Error reading entries from local database");
                                                                zzglVarO.f12917d = true;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                if (sQLiteDatabaseM != null) {
                                                                    sQLiteDatabaseM.close();
                                                                }
                                                                i24 = i12 + 1;
                                                                i23 = i13;
                                                                str4 = str4;
                                                                str3 = str3;
                                                                str5 = str5;
                                                            }
                                                        } else {
                                                            i14 = 5;
                                                        }
                                                        try {
                                                            cursorQuery = sQLiteDatabaseM.query("messages", strArr2, str, strArr, null, null, "rowid asc", Integer.toString(i21));
                                                            while (cursorQuery.moveToNext()) {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            j14 = cursorQuery.getLong(0);
                                                                            try {
                                                                                int i28 = cursorQuery.getInt(1);
                                                                                str4 = str4;
                                                                                try {
                                                                                    byte[] blob = cursorQuery.getBlob(2);
                                                                                    str3 = str3;
                                                                                    try {
                                                                                        if (zzicVar4.f13097d.r(null, zzfxVar3)) {
                                                                                            try {
                                                                                                string = cursorQuery.getString(i27);
                                                                                                j12 = cursorQuery.getLong(i26);
                                                                                            } catch (SQLiteDatabaseLockedException unused5) {
                                                                                                cursorQuery = cursorQuery;
                                                                                                sQLiteDatabaseM = sQLiteDatabaseM;
                                                                                                i13 = 5;
                                                                                                SystemClock.sleep(i25);
                                                                                                i25 += 20;
                                                                                                if (cursorQuery != null) {
                                                                                                    cursorQuery.close();
                                                                                                }
                                                                                                if (sQLiteDatabaseM != null) {
                                                                                                    sQLiteDatabaseM.close();
                                                                                                }
                                                                                                i24 = i12 + 1;
                                                                                                i23 = i13;
                                                                                                str4 = str4;
                                                                                                str3 = str3;
                                                                                                str5 = str5;
                                                                                            } catch (SQLiteFullException e17) {
                                                                                                e = e17;
                                                                                                cursorQuery = cursorQuery;
                                                                                                sQLiteDatabaseM = sQLiteDatabaseM;
                                                                                                i13 = 5;
                                                                                                zzgu zzguVar12 = zzicVar4.f13099f;
                                                                                                zzic.m(zzguVar12);
                                                                                                zzguVar12.f12942f.b(e, "Error reading entries from local database");
                                                                                                zzglVarO.f12917d = true;
                                                                                                if (cursorQuery != null) {
                                                                                                    cursorQuery.close();
                                                                                                }
                                                                                                if (sQLiteDatabaseM != null) {
                                                                                                    sQLiteDatabaseM.close();
                                                                                                }
                                                                                                i24 = i12 + 1;
                                                                                                i23 = i13;
                                                                                                str4 = str4;
                                                                                                str3 = str3;
                                                                                                str5 = str5;
                                                                                            } catch (SQLiteException e18) {
                                                                                                e = e18;
                                                                                                cursorQuery = cursorQuery;
                                                                                                sQLiteDatabaseM = sQLiteDatabaseM;
                                                                                                i13 = 5;
                                                                                                if (sQLiteDatabaseM != null) {
                                                                                                    sQLiteDatabaseM.endTransaction();
                                                                                                }
                                                                                                zzgu zzguVar13 = zzicVar4.f13099f;
                                                                                                zzic.m(zzguVar13);
                                                                                                zzguVar13.f12942f.b(e, "Error reading entries from local database");
                                                                                                zzglVarO.f12917d = true;
                                                                                                if (cursorQuery != null) {
                                                                                                    cursorQuery.close();
                                                                                                }
                                                                                                if (sQLiteDatabaseM != null) {
                                                                                                    sQLiteDatabaseM.close();
                                                                                                }
                                                                                                i24 = i12 + 1;
                                                                                                i23 = i13;
                                                                                                str4 = str4;
                                                                                                str3 = str3;
                                                                                                str5 = str5;
                                                                                            }
                                                                                        } else {
                                                                                            j12 = 0;
                                                                                            string = null;
                                                                                        }
                                                                                        if (i28 == 0) {
                                                                                            zzfxVar = zzfxVar3;
                                                                                            try {
                                                                                                try {
                                                                                                    Parcel parcelObtain = Parcel.obtain();
                                                                                                    try {
                                                                                                        try {
                                                                                                            parcelObtain.unmarshall(blob, 0, blob.length);
                                                                                                            parcelObtain.setDataPosition(0);
                                                                                                            zzbh zzbhVarCreateFromParcel = zzbh.CREATOR.createFromParcel(parcelObtain);
                                                                                                            parcelObtain.recycle();
                                                                                                            if (zzbhVarCreateFromParcel != null) {
                                                                                                                arrayList.add(new zzgk(zzbhVarCreateFromParcel, string, j12));
                                                                                                            }
                                                                                                        } catch (SafeParcelReader.ParseException unused6) {
                                                                                                            zzgu zzguVar14 = zzicVar4.f13099f;
                                                                                                            zzic.m(zzguVar14);
                                                                                                            zzguVar14.f12942f.a("Failed to load event from local database");
                                                                                                            parcelObtain.recycle();
                                                                                                        }
                                                                                                    } catch (Throwable th6) {
                                                                                                        parcelObtain.recycle();
                                                                                                        throw th6;
                                                                                                    }
                                                                                                } catch (Throwable th7) {
                                                                                                    th = th7;
                                                                                                    sQLiteDatabaseM = sQLiteDatabaseM;
                                                                                                    cursor = cursorQuery;
                                                                                                    if (cursor != null) {
                                                                                                        cursor.close();
                                                                                                    }
                                                                                                    if (sQLiteDatabaseM != null) {
                                                                                                        sQLiteDatabaseM.close();
                                                                                                    }
                                                                                                    throw th;
                                                                                                }
                                                                                            } catch (SQLiteDatabaseLockedException unused7) {
                                                                                                sQLiteDatabaseM = sQLiteDatabaseM;
                                                                                                i13 = 5;
                                                                                                SystemClock.sleep(i25);
                                                                                                i25 += 20;
                                                                                                if (cursorQuery != null) {
                                                                                                    cursorQuery.close();
                                                                                                }
                                                                                                if (sQLiteDatabaseM != null) {
                                                                                                    sQLiteDatabaseM.close();
                                                                                                }
                                                                                                i24 = i12 + 1;
                                                                                                i23 = i13;
                                                                                                str4 = str4;
                                                                                                str3 = str3;
                                                                                                str5 = str5;
                                                                                            } catch (SQLiteFullException e19) {
                                                                                                e = e19;
                                                                                                sQLiteDatabaseM = sQLiteDatabaseM;
                                                                                                i13 = 5;
                                                                                                zzgu zzguVar15 = zzicVar4.f13099f;
                                                                                                zzic.m(zzguVar15);
                                                                                                zzguVar15.f12942f.b(e, "Error reading entries from local database");
                                                                                                zzglVarO.f12917d = true;
                                                                                                if (cursorQuery != null) {
                                                                                                    cursorQuery.close();
                                                                                                }
                                                                                                if (sQLiteDatabaseM != null) {
                                                                                                    sQLiteDatabaseM.close();
                                                                                                }
                                                                                                i24 = i12 + 1;
                                                                                                i23 = i13;
                                                                                                str4 = str4;
                                                                                                str3 = str3;
                                                                                                str5 = str5;
                                                                                            } catch (SQLiteException e21) {
                                                                                                e = e21;
                                                                                                sQLiteDatabaseM = sQLiteDatabaseM;
                                                                                                i13 = 5;
                                                                                                if (sQLiteDatabaseM != null) {
                                                                                                    sQLiteDatabaseM.endTransaction();
                                                                                                }
                                                                                                zzgu zzguVar16 = zzicVar4.f13099f;
                                                                                                zzic.m(zzguVar16);
                                                                                                zzguVar16.f12942f.b(e, "Error reading entries from local database");
                                                                                                zzglVarO.f12917d = true;
                                                                                                if (cursorQuery != null) {
                                                                                                    cursorQuery.close();
                                                                                                }
                                                                                                if (sQLiteDatabaseM != null) {
                                                                                                    sQLiteDatabaseM.close();
                                                                                                }
                                                                                                i24 = i12 + 1;
                                                                                                i23 = i13;
                                                                                                str4 = str4;
                                                                                                str3 = str3;
                                                                                                str5 = str5;
                                                                                            }
                                                                                        } else {
                                                                                            zzfxVar = zzfxVar3;
                                                                                            if (i28 == 1) {
                                                                                                Parcel parcelObtain2 = Parcel.obtain();
                                                                                                try {
                                                                                                    try {
                                                                                                        parcelObtain2.unmarshall(blob, 0, blob.length);
                                                                                                        parcelObtain2.setDataPosition(0);
                                                                                                        zzplVarCreateFromParcel = zzpl.CREATOR.createFromParcel(parcelObtain2);
                                                                                                        parcelObtain2.recycle();
                                                                                                    } catch (Throwable th8) {
                                                                                                        parcelObtain2.recycle();
                                                                                                        throw th8;
                                                                                                    }
                                                                                                } catch (SafeParcelReader.ParseException unused8) {
                                                                                                    zzgu zzguVar17 = zzicVar4.f13099f;
                                                                                                    zzic.m(zzguVar17);
                                                                                                    zzguVar17.f12942f.a("Failed to load user property from local database");
                                                                                                    parcelObtain2.recycle();
                                                                                                    zzplVarCreateFromParcel = null;
                                                                                                }
                                                                                                if (zzplVarCreateFromParcel != null) {
                                                                                                    arrayList.add(new zzgk(zzplVarCreateFromParcel, string, j12));
                                                                                                }
                                                                                            } else {
                                                                                                if (i28 == 2) {
                                                                                                    Parcel parcelObtain3 = Parcel.obtain();
                                                                                                    try {
                                                                                                        try {
                                                                                                            parcelObtain3.unmarshall(blob, 0, blob.length);
                                                                                                            parcelObtain3.setDataPosition(0);
                                                                                                            zzahVarCreateFromParcel = zzah.CREATOR.createFromParcel(parcelObtain3);
                                                                                                            parcelObtain3.recycle();
                                                                                                        } catch (SafeParcelReader.ParseException unused9) {
                                                                                                            zzgu zzguVar18 = zzicVar4.f13099f;
                                                                                                            zzic.m(zzguVar18);
                                                                                                            zzguVar18.f12942f.a("Failed to load conditional user property from local database");
                                                                                                            parcelObtain3.recycle();
                                                                                                            zzahVarCreateFromParcel = null;
                                                                                                        }
                                                                                                        if (zzahVarCreateFromParcel != null) {
                                                                                                            arrayList.add(new zzgk(zzahVarCreateFromParcel, string, j12));
                                                                                                        }
                                                                                                    } catch (Throwable th9) {
                                                                                                        parcelObtain3.recycle();
                                                                                                        throw th9;
                                                                                                    }
                                                                                                } else if (i28 == 4) {
                                                                                                    try {
                                                                                                        Parcel parcelObtain4 = Parcel.obtain();
                                                                                                        try {
                                                                                                            try {
                                                                                                                try {
                                                                                                                    parcelObtain4.unmarshall(blob, 0, blob.length);
                                                                                                                    parcelObtain4.setDataPosition(0);
                                                                                                                    zzbfVarCreateFromParcel = zzbf.CREATOR.createFromParcel(parcelObtain4);
                                                                                                                    try {
                                                                                                                        parcelObtain4.recycle();
                                                                                                                        if (zzbfVarCreateFromParcel != null) {
                                                                                                                            arrayList.add(new zzgk(zzbfVarCreateFromParcel, string, j12));
                                                                                                                        }
                                                                                                                        i15 = 3;
                                                                                                                    } catch (SQLiteDatabaseLockedException unused10) {
                                                                                                                        sQLiteDatabaseM = sQLiteDatabaseM;
                                                                                                                        i13 = 5;
                                                                                                                        SystemClock.sleep(i25);
                                                                                                                        i25 += 20;
                                                                                                                        if (cursorQuery != null) {
                                                                                                                            cursorQuery.close();
                                                                                                                        }
                                                                                                                        if (sQLiteDatabaseM != null) {
                                                                                                                            sQLiteDatabaseM.close();
                                                                                                                        }
                                                                                                                        i24 = i12 + 1;
                                                                                                                        i23 = i13;
                                                                                                                        str4 = str4;
                                                                                                                        str3 = str3;
                                                                                                                        str5 = str5;
                                                                                                                    } catch (SQLiteFullException e22) {
                                                                                                                        e = e22;
                                                                                                                        sQLiteDatabaseM = sQLiteDatabaseM;
                                                                                                                        i13 = 5;
                                                                                                                        zzgu zzguVar19 = zzicVar4.f13099f;
                                                                                                                        zzic.m(zzguVar19);
                                                                                                                        zzguVar19.f12942f.b(e, "Error reading entries from local database");
                                                                                                                        zzglVarO.f12917d = true;
                                                                                                                        if (cursorQuery != null) {
                                                                                                                            cursorQuery.close();
                                                                                                                        }
                                                                                                                        if (sQLiteDatabaseM != null) {
                                                                                                                            sQLiteDatabaseM.close();
                                                                                                                        }
                                                                                                                        i24 = i12 + 1;
                                                                                                                        i23 = i13;
                                                                                                                        str4 = str4;
                                                                                                                        str3 = str3;
                                                                                                                        str5 = str5;
                                                                                                                    } catch (SQLiteException e23) {
                                                                                                                        e = e23;
                                                                                                                        sQLiteDatabaseM = sQLiteDatabaseM;
                                                                                                                        i13 = 5;
                                                                                                                        if (sQLiteDatabaseM != null) {
                                                                                                                            sQLiteDatabaseM.endTransaction();
                                                                                                                        }
                                                                                                                        zzgu zzguVar110 = zzicVar4.f13099f;
                                                                                                                        zzic.m(zzguVar110);
                                                                                                                        zzguVar110.f12942f.b(e, "Error reading entries from local database");
                                                                                                                        zzglVarO.f12917d = true;
                                                                                                                        if (cursorQuery != null) {
                                                                                                                            cursorQuery.close();
                                                                                                                        }
                                                                                                                        if (sQLiteDatabaseM != null) {
                                                                                                                            sQLiteDatabaseM.close();
                                                                                                                        }
                                                                                                                        i24 = i12 + 1;
                                                                                                                        i23 = i13;
                                                                                                                        str4 = str4;
                                                                                                                        str3 = str3;
                                                                                                                        str5 = str5;
                                                                                                                    }
                                                                                                                } catch (Throwable th10) {
                                                                                                                    th = th10;
                                                                                                                    parcelObtain4.recycle();
                                                                                                                    throw th;
                                                                                                                }
                                                                                                            } catch (SafeParcelReader.ParseException unused11) {
                                                                                                                zzgu zzguVar20 = zzicVar4.f13099f;
                                                                                                                zzic.m(zzguVar20);
                                                                                                                zzguVar20.f12942f.a("Failed to load default event parameters from local database");
                                                                                                                parcelObtain4.recycle();
                                                                                                                zzbfVarCreateFromParcel = null;
                                                                                                            }
                                                                                                        } catch (SafeParcelReader.ParseException unused12) {
                                                                                                        } catch (Throwable th11) {
                                                                                                            th = th11;
                                                                                                        }
                                                                                                    } catch (SQLiteDatabaseLockedException unused13) {
                                                                                                        sQLiteDatabaseM = sQLiteDatabaseM;
                                                                                                        i13 = 5;
                                                                                                        SystemClock.sleep(i25);
                                                                                                        i25 += 20;
                                                                                                        if (cursorQuery != null) {
                                                                                                            cursorQuery.close();
                                                                                                        }
                                                                                                        if (sQLiteDatabaseM != null) {
                                                                                                            sQLiteDatabaseM.close();
                                                                                                        }
                                                                                                        i24 = i12 + 1;
                                                                                                        i23 = i13;
                                                                                                        str4 = str4;
                                                                                                        str3 = str3;
                                                                                                        str5 = str5;
                                                                                                    } catch (SQLiteFullException e24) {
                                                                                                        e = e24;
                                                                                                        sQLiteDatabaseM = sQLiteDatabaseM;
                                                                                                        i13 = 5;
                                                                                                        zzgu zzguVar111 = zzicVar4.f13099f;
                                                                                                        zzic.m(zzguVar111);
                                                                                                        zzguVar111.f12942f.b(e, "Error reading entries from local database");
                                                                                                        zzglVarO.f12917d = true;
                                                                                                        if (cursorQuery != null) {
                                                                                                            cursorQuery.close();
                                                                                                        }
                                                                                                        if (sQLiteDatabaseM != null) {
                                                                                                            sQLiteDatabaseM.close();
                                                                                                        }
                                                                                                        i24 = i12 + 1;
                                                                                                        i23 = i13;
                                                                                                        str4 = str4;
                                                                                                        str3 = str3;
                                                                                                        str5 = str5;
                                                                                                    } catch (SQLiteException e25) {
                                                                                                        e = e25;
                                                                                                        sQLiteDatabaseM = sQLiteDatabaseM;
                                                                                                        i13 = 5;
                                                                                                        if (sQLiteDatabaseM != null) {
                                                                                                            sQLiteDatabaseM.endTransaction();
                                                                                                        }
                                                                                                        zzgu zzguVar112 = zzicVar4.f13099f;
                                                                                                        zzic.m(zzguVar112);
                                                                                                        zzguVar112.f12942f.b(e, "Error reading entries from local database");
                                                                                                        zzglVarO.f12917d = true;
                                                                                                        if (cursorQuery != null) {
                                                                                                            cursorQuery.close();
                                                                                                        }
                                                                                                        if (sQLiteDatabaseM != null) {
                                                                                                            sQLiteDatabaseM.close();
                                                                                                        }
                                                                                                        i24 = i12 + 1;
                                                                                                        i23 = i13;
                                                                                                        str4 = str4;
                                                                                                        str3 = str3;
                                                                                                        str5 = str5;
                                                                                                    }
                                                                                                } else {
                                                                                                    i15 = 3;
                                                                                                    if (i28 == 3) {
                                                                                                        zzgu zzguVar21 = zzicVar4.f13099f;
                                                                                                        zzic.m(zzguVar21);
                                                                                                        zzguVar21.f12949n.a("Skipping app launch break");
                                                                                                    } else {
                                                                                                        zzgu zzguVar22 = zzicVar4.f13099f;
                                                                                                        zzic.m(zzguVar22);
                                                                                                        zzguVar22.f12942f.a("Unknown record type in local database");
                                                                                                    }
                                                                                                }
                                                                                                i27 = i15;
                                                                                                str4 = str4;
                                                                                                str3 = str3;
                                                                                                cursorQuery = cursorQuery;
                                                                                                zzfxVar3 = zzfxVar;
                                                                                                i26 = 4;
                                                                                            }
                                                                                        }
                                                                                        i15 = 3;
                                                                                        i27 = i15;
                                                                                        str4 = str4;
                                                                                        str3 = str3;
                                                                                        cursorQuery = cursorQuery;
                                                                                        zzfxVar3 = zzfxVar;
                                                                                        i26 = 4;
                                                                                    } catch (SQLiteDatabaseLockedException unused14) {
                                                                                        cursorQuery = cursorQuery;
                                                                                    } catch (SQLiteFullException e26) {
                                                                                        e = e26;
                                                                                        cursorQuery = cursorQuery;
                                                                                    } catch (SQLiteException e27) {
                                                                                        e = e27;
                                                                                        cursorQuery = cursorQuery;
                                                                                    }
                                                                                } catch (SQLiteDatabaseLockedException unused15) {
                                                                                    str3 = str3;
                                                                                    sQLiteDatabaseM = sQLiteDatabaseM;
                                                                                    i13 = 5;
                                                                                    SystemClock.sleep(i25);
                                                                                    i25 += 20;
                                                                                    if (cursorQuery != null) {
                                                                                        cursorQuery.close();
                                                                                    }
                                                                                    if (sQLiteDatabaseM != null) {
                                                                                        sQLiteDatabaseM.close();
                                                                                    }
                                                                                    i24 = i12 + 1;
                                                                                    i23 = i13;
                                                                                    str4 = str4;
                                                                                    str3 = str3;
                                                                                    str5 = str5;
                                                                                } catch (SQLiteFullException e28) {
                                                                                    e = e28;
                                                                                    str3 = str3;
                                                                                    sQLiteDatabaseM = sQLiteDatabaseM;
                                                                                    i13 = 5;
                                                                                    zzgu zzguVar113 = zzicVar4.f13099f;
                                                                                    zzic.m(zzguVar113);
                                                                                    zzguVar113.f12942f.b(e, "Error reading entries from local database");
                                                                                    zzglVarO.f12917d = true;
                                                                                    if (cursorQuery != null) {
                                                                                        cursorQuery.close();
                                                                                    }
                                                                                    if (sQLiteDatabaseM != null) {
                                                                                        sQLiteDatabaseM.close();
                                                                                    }
                                                                                    i24 = i12 + 1;
                                                                                    i23 = i13;
                                                                                    str4 = str4;
                                                                                    str3 = str3;
                                                                                    str5 = str5;
                                                                                } catch (SQLiteException e29) {
                                                                                    e = e29;
                                                                                    str3 = str3;
                                                                                    sQLiteDatabaseM = sQLiteDatabaseM;
                                                                                    i13 = 5;
                                                                                    if (sQLiteDatabaseM != null) {
                                                                                        sQLiteDatabaseM.endTransaction();
                                                                                    }
                                                                                    zzgu zzguVar114 = zzicVar4.f13099f;
                                                                                    zzic.m(zzguVar114);
                                                                                    zzguVar114.f12942f.b(e, "Error reading entries from local database");
                                                                                    zzglVarO.f12917d = true;
                                                                                    if (cursorQuery != null) {
                                                                                        cursorQuery.close();
                                                                                    }
                                                                                    if (sQLiteDatabaseM != null) {
                                                                                        sQLiteDatabaseM.close();
                                                                                    }
                                                                                    i24 = i12 + 1;
                                                                                    i23 = i13;
                                                                                    str4 = str4;
                                                                                    str3 = str3;
                                                                                    str5 = str5;
                                                                                }
                                                                            } catch (SQLiteDatabaseLockedException unused16) {
                                                                                str4 = str4;
                                                                            } catch (SQLiteFullException e30) {
                                                                                e = e30;
                                                                                str4 = str4;
                                                                            } catch (SQLiteException e31) {
                                                                                e = e31;
                                                                                str4 = str4;
                                                                            }
                                                                        } catch (SQLiteDatabaseLockedException unused17) {
                                                                            cursorQuery = cursorQuery;
                                                                            str4 = str4;
                                                                            str3 = str3;
                                                                        } catch (SQLiteFullException e32) {
                                                                            e = e32;
                                                                            cursorQuery = cursorQuery;
                                                                            str4 = str4;
                                                                            str3 = str3;
                                                                        } catch (SQLiteException e33) {
                                                                            e = e33;
                                                                            cursorQuery = cursorQuery;
                                                                            str4 = str4;
                                                                            str3 = str3;
                                                                        }
                                                                    } catch (Throwable th12) {
                                                                        th = th12;
                                                                        cursorQuery = cursorQuery;
                                                                    }
                                                                } catch (SQLiteDatabaseLockedException unused18) {
                                                                    cursorQuery = cursorQuery;
                                                                    str4 = str4;
                                                                    str3 = str3;
                                                                } catch (SQLiteFullException e34) {
                                                                    e = e34;
                                                                    cursorQuery = cursorQuery;
                                                                    str4 = str4;
                                                                    str3 = str3;
                                                                } catch (SQLiteException e35) {
                                                                    e = e35;
                                                                    cursorQuery = cursorQuery;
                                                                    str4 = str4;
                                                                    str3 = str3;
                                                                }
                                                            }
                                                            cursorQuery = cursorQuery;
                                                            str4 = str4;
                                                            str3 = str3;
                                                            i11 = 0;
                                                            sQLiteDatabaseM = sQLiteDatabaseM;
                                                            try {
                                                                if (sQLiteDatabaseM.delete("messages", "rowid <= ?", new String[]{Long.toString(j14)}) < arrayList.size()) {
                                                                    zzgu zzguVar23 = zzicVar4.f13099f;
                                                                    zzic.m(zzguVar23);
                                                                    zzguVar23.f12942f.a("Fewer entries removed from local database than expected");
                                                                }
                                                                sQLiteDatabaseM.setTransactionSuccessful();
                                                                sQLiteDatabaseM.endTransaction();
                                                                cursorQuery.close();
                                                                sQLiteDatabaseM.close();
                                                            } catch (SQLiteDatabaseLockedException unused19) {
                                                                i13 = 5;
                                                                SystemClock.sleep(i25);
                                                                i25 += 20;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                if (sQLiteDatabaseM != null) {
                                                                    sQLiteDatabaseM.close();
                                                                }
                                                                i24 = i12 + 1;
                                                                i23 = i13;
                                                                str4 = str4;
                                                                str3 = str3;
                                                                str5 = str5;
                                                            } catch (SQLiteFullException e36) {
                                                                e = e36;
                                                                i13 = 5;
                                                                zzgu zzguVar115 = zzicVar4.f13099f;
                                                                zzic.m(zzguVar115);
                                                                zzguVar115.f12942f.b(e, "Error reading entries from local database");
                                                                zzglVarO.f12917d = true;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                if (sQLiteDatabaseM != null) {
                                                                    sQLiteDatabaseM.close();
                                                                }
                                                                i24 = i12 + 1;
                                                                i23 = i13;
                                                                str4 = str4;
                                                                str3 = str3;
                                                                str5 = str5;
                                                            } catch (SQLiteException e37) {
                                                                e = e37;
                                                                i13 = 5;
                                                                if (sQLiteDatabaseM != null) {
                                                                    sQLiteDatabaseM.endTransaction();
                                                                }
                                                                zzgu zzguVar116 = zzicVar4.f13099f;
                                                                zzic.m(zzguVar116);
                                                                zzguVar116.f12942f.b(e, "Error reading entries from local database");
                                                                zzglVarO.f12917d = true;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                if (sQLiteDatabaseM != null) {
                                                                    sQLiteDatabaseM.close();
                                                                }
                                                                i24 = i12 + 1;
                                                                i23 = i13;
                                                                str4 = str4;
                                                                str3 = str3;
                                                                str5 = str5;
                                                            }
                                                        } catch (SQLiteDatabaseLockedException unused20) {
                                                            str3 = str3;
                                                            sQLiteDatabaseM = sQLiteDatabaseM;
                                                            str4 = str4;
                                                            i13 = i14;
                                                            cursorQuery = null;
                                                            SystemClock.sleep(i25);
                                                            i25 += 20;
                                                            if (cursorQuery != null) {
                                                                cursorQuery.close();
                                                            }
                                                            if (sQLiteDatabaseM != null) {
                                                                sQLiteDatabaseM.close();
                                                            }
                                                            i24 = i12 + 1;
                                                            i23 = i13;
                                                            str4 = str4;
                                                            str3 = str3;
                                                            str5 = str5;
                                                        }
                                                    } catch (SQLiteDatabaseLockedException unused21) {
                                                        str3 = str3;
                                                        sQLiteDatabaseM = sQLiteDatabaseM;
                                                        str4 = str4;
                                                        i13 = 5;
                                                        cursorQuery = null;
                                                        SystemClock.sleep(i25);
                                                        i25 += 20;
                                                        if (cursorQuery != null) {
                                                            cursorQuery.close();
                                                        }
                                                        if (sQLiteDatabaseM != null) {
                                                            sQLiteDatabaseM.close();
                                                        }
                                                        i24 = i12 + 1;
                                                        i23 = i13;
                                                        str4 = str4;
                                                        str3 = str3;
                                                        str5 = str5;
                                                    }
                                                } catch (SQLiteFullException e38) {
                                                    e = e38;
                                                    str3 = str3;
                                                    sQLiteDatabaseM = sQLiteDatabaseM;
                                                    str4 = str4;
                                                    i13 = 5;
                                                    cursorQuery = null;
                                                    zzgu zzguVar117 = zzicVar4.f13099f;
                                                    zzic.m(zzguVar117);
                                                    zzguVar117.f12942f.b(e, "Error reading entries from local database");
                                                    zzglVarO.f12917d = true;
                                                    if (cursorQuery != null) {
                                                        cursorQuery.close();
                                                    }
                                                    if (sQLiteDatabaseM != null) {
                                                        sQLiteDatabaseM.close();
                                                    }
                                                    i24 = i12 + 1;
                                                    i23 = i13;
                                                    str4 = str4;
                                                    str3 = str3;
                                                    str5 = str5;
                                                } catch (SQLiteException e39) {
                                                    e = e39;
                                                    str3 = str3;
                                                    sQLiteDatabaseM = sQLiteDatabaseM;
                                                    str4 = str4;
                                                    i13 = 5;
                                                    cursorQuery = null;
                                                    if (sQLiteDatabaseM != null) {
                                                        sQLiteDatabaseM.endTransaction();
                                                    }
                                                    zzgu zzguVar118 = zzicVar4.f13099f;
                                                    zzic.m(zzguVar118);
                                                    zzguVar118.f12942f.b(e, "Error reading entries from local database");
                                                    zzglVarO.f12917d = true;
                                                    if (cursorQuery != null) {
                                                        cursorQuery.close();
                                                    }
                                                    if (sQLiteDatabaseM != null) {
                                                        sQLiteDatabaseM.close();
                                                    }
                                                    i24 = i12 + 1;
                                                    i23 = i13;
                                                    str4 = str4;
                                                    str3 = str3;
                                                    str5 = str5;
                                                }
                                            } catch (SQLiteDatabaseLockedException unused22) {
                                                str5 = str5;
                                            } catch (SQLiteFullException e40) {
                                                e = e40;
                                                str5 = str5;
                                            } catch (SQLiteException e41) {
                                                e = e41;
                                                str5 = str5;
                                            }
                                        } catch (Throwable th13) {
                                            th = th13;
                                            i12 = i24;
                                        }
                                    } catch (Throwable th14) {
                                        th = th14;
                                        i12 = i24;
                                        i13 = 5;
                                        cursorQuery2 = null;
                                    }
                                }
                            } catch (SQLiteDatabaseLockedException unused23) {
                                str5 = str5;
                                i12 = i24;
                                str4 = str4;
                                str3 = str3;
                                i13 = 5;
                                sQLiteDatabaseM = null;
                            } catch (SQLiteFullException e42) {
                                e = e42;
                                str5 = str5;
                                i12 = i24;
                                str4 = str4;
                                str3 = str3;
                                i13 = 5;
                                sQLiteDatabaseM = null;
                            } catch (SQLiteException e43) {
                                e = e43;
                                str5 = str5;
                                i12 = i24;
                                str4 = str4;
                                str3 = str3;
                                i13 = 5;
                                sQLiteDatabaseM = null;
                            } catch (Throwable th15) {
                                th = th15;
                                sQLiteDatabaseM = null;
                            }
                        } else {
                            i11 = 0;
                            zzgu zzguVar24 = zzicVar4.f13099f;
                            zzic.m(zzguVar24);
                            zzguVar24.f12945i.a("Failed to read events from database in reasonable time");
                            arrayList = null;
                        }
                        i24 = i12 + 1;
                        i23 = i13;
                        str4 = str4;
                        str3 = str3;
                        str5 = str5;
                    }
                } else {
                    context = context3;
                    zzguVar = zzguVar3;
                    i11 = 0;
                }
                if (arrayList != null) {
                    arrayList2.addAll(arrayList);
                    size = arrayList.size();
                } else {
                    size = i11;
                }
                if (abstractSafeParcelable != null && size < i21) {
                    arrayList2.add(new zzgk(abstractSafeParcelable, zzrVar2.f13659c, zzrVar2.L));
                }
                i16 = i11;
                for (size2 = arrayList2.size(); i16 < size2; size2 = size2) {
                    zzgkVar = (zzgk) arrayList2.get(i16);
                    abstractSafeParcelable2 = zzgkVar.f12912a;
                    zzfxVar2 = zzfy.W0;
                    if (zzalVar.r(null, zzfxVar2)) {
                        str2 = zzgkVar.f12913b;
                        if (!TextUtils.isEmpty(str2)) {
                            zzrVar2 = new zzr(zzrVar2.f13655a, zzrVar2.f13657b, str2, zzgkVar.f12914c, zzrVar2.f13661d, zzrVar2.f13663e, zzrVar2.f13665f, zzrVar2.f13669t, zzrVar2.H, zzrVar2.K, zzrVar2.M, zzrVar2.N, zzrVar2.O, zzrVar2.P, zzrVar2.Q, zzrVar2.R, zzrVar2.S, zzrVar2.T, zzrVar2.U, zzrVar2.V, zzrVar2.W, zzrVar2.X, zzrVar2.Y, zzrVar2.Z, zzrVar2.f13656a0, zzrVar2.f13658b0, zzrVar2.f13660c0, zzrVar2.f13662d0, zzrVar2.f13664e0, zzrVar2.f13666f0, zzrVar2.f13667g0, zzrVar2.f13668h0);
                        }
                    }
                    if (abstractSafeParcelable2 instanceof zzbh) {
                        try {
                            defaultClock2.getClass();
                            jCurrentTimeMillis = System.currentTimeMillis();
                            try {
                                defaultClock2.getClass();
                                jElapsedRealtime = SystemClock.elapsedRealtime();
                                try {
                                    try {
                                        zzgbVar.W0((zzbh) abstractSafeParcelable2, zzrVar2);
                                        zzic.m(zzguVar);
                                        zzguVar2 = zzguVar;
                                        try {
                                            zzguVar2.f12949n.a("Logging telemetry for logEvent from database");
                                            if (zzgq.f12924d == null) {
                                                zzicVar2 = zzicVar;
                                                context2 = context;
                                                try {
                                                    zzgq.f12924d = new zzgq(context2, zzicVar2);
                                                } catch (RemoteException e44) {
                                                    e = e44;
                                                    j13 = jCurrentTimeMillis;
                                                    zzic.m(zzguVar2);
                                                    zzguVar2.f12942f.b(e, "Failed to send event to the service");
                                                    if (j13 != 0) {
                                                        if (zzgq.f12924d == null) {
                                                            zzgq.f12924d = new zzgq(context2, zzicVar2);
                                                        }
                                                        zzgq zzgqVar = zzgq.f12924d;
                                                        defaultClock2.getClass();
                                                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                                                        defaultClock2.getClass();
                                                        zzgqVar.a(13, (int) (SystemClock.elapsedRealtime() - jElapsedRealtime), j13, jCurrentTimeMillis2);
                                                    }
                                                }
                                            } else {
                                                zzicVar2 = zzicVar;
                                                context2 = context;
                                            }
                                            zzgq zzgqVar2 = zzgq.f12924d;
                                            defaultClock2.getClass();
                                            long jCurrentTimeMillis3 = System.currentTimeMillis();
                                            defaultClock2.getClass();
                                            zzgqVar2.a(0, (int) (SystemClock.elapsedRealtime() - jElapsedRealtime), jCurrentTimeMillis, jCurrentTimeMillis3);
                                        } catch (RemoteException e45) {
                                            e = e45;
                                            zzicVar2 = zzicVar;
                                            context2 = context;
                                        }
                                    } catch (RemoteException e46) {
                                        e = e46;
                                        zzicVar2 = zzicVar;
                                        context2 = context;
                                        zzguVar2 = zzguVar;
                                        j13 = jCurrentTimeMillis;
                                        zzic.m(zzguVar2);
                                        zzguVar2.f12942f.b(e, "Failed to send event to the service");
                                        if (j13 != 0) {
                                            if (zzgq.f12924d == null) {
                                                zzgq.f12924d = new zzgq(context2, zzicVar2);
                                            }
                                            zzgq zzgqVar3 = zzgq.f12924d;
                                            defaultClock2.getClass();
                                            long jCurrentTimeMillis4 = System.currentTimeMillis();
                                            defaultClock2.getClass();
                                            zzgqVar3.a(13, (int) (SystemClock.elapsedRealtime() - jElapsedRealtime), j13, jCurrentTimeMillis4);
                                        }
                                        i16++;
                                        zzguVar = zzguVar2;
                                        context = context2;
                                        zzicVar = zzicVar2;
                                    }
                                } catch (RemoteException e47) {
                                    e = e47;
                                }
                            } catch (RemoteException e48) {
                                e = e48;
                                zzicVar2 = zzicVar;
                                context2 = context;
                                zzguVar2 = zzguVar;
                                jElapsedRealtime = 0;
                            }
                        } catch (RemoteException e49) {
                            e = e49;
                            zzicVar2 = zzicVar;
                            context2 = context;
                            zzguVar2 = zzguVar;
                            jElapsedRealtime = 0;
                            j13 = 0;
                        }
                    } else {
                        zzicVar2 = zzicVar;
                        context2 = context;
                        zzguVar2 = zzguVar;
                        if (abstractSafeParcelable2 instanceof zzpl) {
                            try {
                                zzgbVar.w0((zzpl) abstractSafeParcelable2, zzrVar2);
                            } catch (RemoteException e50) {
                                zzic.m(zzguVar2);
                                zzguVar2.f12942f.b(e50, "Failed to send user property to the service");
                            }
                        } else {
                            if (abstractSafeParcelable2 instanceof zzah) {
                                try {
                                    zzgbVar.t((zzah) abstractSafeParcelable2, zzrVar2);
                                } catch (RemoteException e51) {
                                    zzic.m(zzguVar2);
                                    zzguVar2.f12942f.b(e51, "Failed to send conditional user property to the service");
                                }
                            } else if (zzalVar.r(null, zzfxVar2) || !(abstractSafeParcelable2 instanceof zzbf)) {
                                zzic.m(zzguVar2);
                                zzguVar2.f12942f.a("Discarding data. Unrecognized parcel type.");
                            } else {
                                try {
                                    zzgbVar.z0(((zzbf) abstractSafeParcelable2).G1(), zzrVar2);
                                } catch (RemoteException e52) {
                                    zzic.m(zzguVar2);
                                    zzguVar2.f12942f.b(e52, "Failed to send default event parameters to the service");
                                }
                            }
                            i16++;
                            zzguVar = zzguVar2;
                            context = context2;
                            zzicVar = zzicVar2;
                        }
                    }
                    i16++;
                    zzguVar = zzguVar2;
                    context = context2;
                    zzicVar = zzicVar2;
                }
                zzguVar3 = zzguVar;
                context3 = context;
                zzicVar3 = zzicVar;
                defaultClock = defaultClock2;
                i17 = 100;
                i18 = i22 + 1;
            }
            i11 = 0;
            arrayList = null;
            if (arrayList != null) {
                arrayList2.addAll(arrayList);
                size = arrayList.size();
            } else {
                size = i11;
            }
            if (abstractSafeParcelable != null) {
                arrayList2.add(new zzgk(abstractSafeParcelable, zzrVar2.f13659c, zzrVar2.L));
            }
            i16 = i11;
            while (i16 < size2) {
                zzgkVar = (zzgk) arrayList2.get(i16);
                abstractSafeParcelable2 = zzgkVar.f12912a;
                zzfxVar2 = zzfy.W0;
                if (zzalVar.r(null, zzfxVar2)) {
                    str2 = zzgkVar.f12913b;
                    if (!TextUtils.isEmpty(str2)) {
                        zzrVar2 = new zzr(zzrVar2.f13655a, zzrVar2.f13657b, str2, zzgkVar.f12914c, zzrVar2.f13661d, zzrVar2.f13663e, zzrVar2.f13665f, zzrVar2.f13669t, zzrVar2.H, zzrVar2.K, zzrVar2.M, zzrVar2.N, zzrVar2.O, zzrVar2.P, zzrVar2.Q, zzrVar2.R, zzrVar2.S, zzrVar2.T, zzrVar2.U, zzrVar2.V, zzrVar2.W, zzrVar2.X, zzrVar2.Y, zzrVar2.Z, zzrVar2.f13656a0, zzrVar2.f13658b0, zzrVar2.f13660c0, zzrVar2.f13662d0, zzrVar2.f13664e0, zzrVar2.f13666f0, zzrVar2.f13667g0, zzrVar2.f13668h0);
                    }
                }
                if (abstractSafeParcelable2 instanceof zzbh) {
                    defaultClock2.getClass();
                    jCurrentTimeMillis = System.currentTimeMillis();
                    defaultClock2.getClass();
                    jElapsedRealtime = SystemClock.elapsedRealtime();
                    zzgbVar.W0((zzbh) abstractSafeParcelable2, zzrVar2);
                    zzic.m(zzguVar);
                    zzguVar2 = zzguVar;
                    zzguVar2.f12949n.a("Logging telemetry for logEvent from database");
                    if (zzgq.f12924d == null) {
                        zzicVar2 = zzicVar;
                        context2 = context;
                        zzgq.f12924d = new zzgq(context2, zzicVar2);
                    } else {
                        zzicVar2 = zzicVar;
                        context2 = context;
                    }
                    zzgq zzgqVar4 = zzgq.f12924d;
                    defaultClock2.getClass();
                    long jCurrentTimeMillis5 = System.currentTimeMillis();
                    defaultClock2.getClass();
                    zzgqVar4.a(0, (int) (SystemClock.elapsedRealtime() - jElapsedRealtime), jCurrentTimeMillis, jCurrentTimeMillis5);
                } else {
                    zzicVar2 = zzicVar;
                    context2 = context;
                    zzguVar2 = zzguVar;
                    if (abstractSafeParcelable2 instanceof zzpl) {
                        zzgbVar.w0((zzpl) abstractSafeParcelable2, zzrVar2);
                    } else {
                        if (abstractSafeParcelable2 instanceof zzah) {
                            zzgbVar.t((zzah) abstractSafeParcelable2, zzrVar2);
                        } else if (zzalVar.r(null, zzfxVar2)) {
                            zzic.m(zzguVar2);
                            zzguVar2.f12942f.a("Discarding data. Unrecognized parcel type.");
                        } else {
                            zzic.m(zzguVar2);
                            zzguVar2.f12942f.a("Discarding data. Unrecognized parcel type.");
                        }
                        i16++;
                        zzguVar = zzguVar2;
                        context = context2;
                        zzicVar = zzicVar2;
                    }
                }
                i16++;
                zzguVar = zzguVar2;
                context = context2;
                zzicVar = zzicVar2;
            }
            zzguVar3 = zzguVar;
            context3 = context;
            zzicVar3 = zzicVar;
            defaultClock = defaultClock2;
            i17 = 100;
            i18 = i22 + 1;
        }
    }

    public final void z(zzah zzahVar) {
        boolean zN;
        g();
        h();
        zzic zzicVar = this.f13202a;
        zzicVar.getClass();
        zzgl zzglVarO = zzicVar.o();
        zzic zzicVar2 = zzglVarO.f13202a;
        zzic.k(zzicVar2.f13102i);
        byte[] bArrQ = zzpp.Q(zzahVar);
        if (bArrQ.length > 131072) {
            zzgu zzguVar = zzicVar2.f13099f;
            zzic.m(zzguVar);
            zzguVar.f12943g.a("Conditional user property too long for local database. Sending directly to service");
            zN = false;
        } else {
            zN = zzglVarO.n(bArrQ, 2);
        }
        u(new zzmu(this, w(true), zN, new zzah(zzahVar)));
    }

    public final boolean n() {
        Boolean boolValueOf;
        g();
        h();
        if (this.f13490e == null) {
            g();
            h();
            zzic zzicVar = this.f13202a;
            zzhh zzhhVar = zzicVar.f13098e;
            zzic.k(zzhhVar);
            zzhhVar.g();
            SharedPreferences sharedPreferencesK = zzhhVar.k();
            String str = scqhIrGXy.nAvvrMIEBSum;
            boolean z11 = false;
            if (!sharedPreferencesK.contains(str)) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(zzhhVar.k().getBoolean(str, false));
            }
            boolean z12 = true;
            if (boolValueOf == null || !boolValueOf.booleanValue()) {
                zzgi zzgiVarR = this.f13202a.r();
                zzgiVarR.h();
                if (zzgiVarR.f12906n == 1) {
                    z11 = true;
                } else {
                    zzgu zzguVar = zzicVar.f13099f;
                    zzic.m(zzguVar);
                    zzguVar.f12949n.a("Checking service availability");
                    zzpp zzppVar = zzicVar.f13102i;
                    zzic.k(zzppVar);
                    int iC = GoogleApiAvailabilityLight.f8646b.c(zzppVar.f13202a.f13094a, 12451000);
                    if (iC != 0) {
                        if (iC != 1) {
                            if (iC != 2) {
                                if (iC != 3) {
                                    if (iC != 9) {
                                        if (iC != 18) {
                                            zzgu zzguVar2 = zzicVar.f13099f;
                                            zzic.m(zzguVar2);
                                            zzguVar2.f12945i.b(Integer.valueOf(iC), "Unexpected service status");
                                        } else {
                                            zzgu zzguVar3 = zzicVar.f13099f;
                                            zzic.m(zzguVar3);
                                            zzguVar3.f12945i.a("Service updating");
                                        }
                                    } else {
                                        zzgu zzguVar4 = zzicVar.f13099f;
                                        zzic.m(zzguVar4);
                                        zzguVar4.f12945i.a("Service invalid");
                                    }
                                } else {
                                    zzgu zzguVar5 = zzicVar.f13099f;
                                    zzic.m(zzguVar5);
                                    zzguVar5.f12945i.a("Service disabled");
                                }
                                z12 = false;
                            } else {
                                zzgu zzguVar6 = zzicVar.f13099f;
                                zzic.m(zzguVar6);
                                zzguVar6.m.a("Service container out of date");
                                zzpp zzppVar2 = zzicVar.f13102i;
                                zzic.k(zzppVar2);
                                if (zzppVar2.S() >= 17443) {
                                    if (boolValueOf != null) {
                                        z12 = false;
                                    }
                                    z11 = z12;
                                    z12 = false;
                                }
                            }
                        } else {
                            zzgu zzguVar7 = zzicVar.f13099f;
                            zzic.m(zzguVar7);
                            zzguVar7.f12949n.a("Service missing");
                        }
                    } else {
                        zzgu zzguVar8 = zzicVar.f13099f;
                        zzic.m(zzguVar8);
                        zzguVar8.f12949n.a("Service available");
                    }
                    z11 = true;
                }
                if (!z11 && zzicVar.f13097d.j()) {
                    zzgu zzguVar9 = zzicVar.f13099f;
                    zzic.m(zzguVar9);
                    zzguVar9.f12942f.a("No way to upload. Consider using the full version of Analytics");
                } else if (z12) {
                    zzhh zzhhVar2 = zzicVar.f13098e;
                    zzic.k(zzhhVar2);
                    zzhhVar2.g();
                    SharedPreferences.Editor editorEdit = zzhhVar2.k().edit();
                    editorEdit.putBoolean(str, z11);
                    editorEdit.apply();
                }
                z12 = z11;
            }
            this.f13490e = Boolean.valueOf(z12);
        }
        return this.f13490e.booleanValue();
    }
}
