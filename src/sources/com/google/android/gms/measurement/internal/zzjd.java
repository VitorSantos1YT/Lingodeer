package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.Binder;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.GoogleSignatureVerifier;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.UidVerifier;
import com.google.android.gms.internal.measurement.zzaeh;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzjd extends zzga {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzpg f13199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Boolean f13200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f13201c;

    public zzjd(zzpg zzpgVar) {
        Preconditions.g(zzpgVar);
        this.f13199a = zzpgVar;
        this.f13201c = null;
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void F0(zzr zzrVar) {
        j(zzrVar);
        i1(new zzie(this, zzrVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void M(long j11, String str, String str2, String str3) {
        i1(new zzig(this, str2, str3, str, j11));
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void O(zzr zzrVar) {
        String str = zzrVar.f13655a;
        Preconditions.d(str);
        h1(str, false);
        i1(new zzio(this, zzrVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void O0(zzr zzrVar) {
        j(zzrVar);
        i1(new zzif(this, zzrVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final List R0(String str, String str2, boolean z11, zzr zzrVar) {
        j(zzrVar);
        String str3 = zzrVar.f13655a;
        Preconditions.g(str3);
        zzpg zzpgVar = this.f13199a;
        try {
            List<zzpn> list = (List) ((FutureTask) zzpgVar.e().n(new zzij(this, str3, str, str2))).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (zzpn zzpnVar : list) {
                if (z11 || !zzpp.L(zzpnVar.f13642c)) {
                    arrayList.add(new zzpl(zzpnVar));
                }
            }
            return arrayList;
        } catch (InterruptedException e8) {
            e = e8;
            zzpgVar.b().f12942f.c(zzgu.o(str3), e, "Failed to query user properties. appId");
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e10) {
            e = e10;
            zzpgVar.b().f12942f.c(zzgu.o(str3), e, "Failed to query user properties. appId");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void W0(zzbh zzbhVar, zzr zzrVar) {
        Preconditions.g(zzbhVar);
        j(zzrVar);
        i1(new zzir(this, zzbhVar, zzrVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final List X(String str, String str2, String str3) {
        h1(str, true);
        zzpg zzpgVar = this.f13199a;
        try {
            return (List) ((FutureTask) zzpgVar.e().n(new zzim(this, str, str2, str3))).get();
        } catch (InterruptedException | ExecutionException e8) {
            zzpgVar.b().f12942f.b(e8, "Failed to get conditional user properties as");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final String Y0(zzr zzrVar) {
        j(zzrVar);
        zzpg zzpgVar = this.f13199a;
        try {
            return (String) ((FutureTask) zzpgVar.e().n(new zzoz(zzpgVar, zzrVar))).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e8) {
            zzpgVar.b().f12942f.c(zzgu.o(zzrVar.f13655a), e8, "Failed to get app instance id. appId");
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final List Z0(String str, String str2, zzr zzrVar) {
        j(zzrVar);
        String str3 = zzrVar.f13655a;
        Preconditions.g(str3);
        zzpg zzpgVar = this.f13199a;
        try {
            return (List) ((FutureTask) zzpgVar.e().n(new zzil(this, str3, str, str2))).get();
        } catch (InterruptedException | ExecutionException e8) {
            zzpgVar.b().f12942f.b(e8, "Failed to get conditional user properties");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final byte[] d0(zzbh zzbhVar, String str) {
        Preconditions.d(str);
        Preconditions.g(zzbhVar);
        h1(str, true);
        zzpg zzpgVar = this.f13199a;
        zzgs zzgsVar = zzpgVar.b().m;
        zzic zzicVar = zzpgVar.f13606l;
        zzgn zzgnVar = zzicVar.f13103j;
        String str2 = zzbhVar.f12702a;
        zzgsVar.b(zzgnVar.a(str2), "Log and bundle. event");
        ((DefaultClock) zzpgVar.c()).getClass();
        long jNanoTime = System.nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) ((FutureTask) zzpgVar.e().o(new zzit(this, zzbhVar, str))).get();
            if (bArr == null) {
                zzpgVar.b().f12942f.b(zzgu.o(str), "Log and bundle returned null. appId");
                bArr = new byte[0];
            }
            ((DefaultClock) zzpgVar.c()).getClass();
            zzpgVar.b().m.d("Log and bundle processed. event, size, time_ms", zzicVar.f13103j.a(str2), Integer.valueOf(bArr.length), Long.valueOf((System.nanoTime() / 1000000) - jNanoTime));
            return bArr;
        } catch (InterruptedException e8) {
            e = e8;
            zzpgVar.b().f12942f.d("Failed to log and bundle. appId, event, error", zzgu.o(str), zzicVar.f13103j.a(str2), e);
            return null;
        } catch (ExecutionException e10) {
            e = e10;
            zzpgVar.b().f12942f.d("Failed to log and bundle. appId, event, error", zzgu.o(str), zzicVar.f13103j.a(str2), e);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void e0(final zzr zzrVar) {
        Preconditions.d(zzrVar.f13655a);
        Preconditions.g(zzrVar.U);
        h(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzjc
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzpg zzpgVar = this.f13197a.f13199a;
                zzpgVar.W();
                zzpgVar.n0(zzrVar);
            }
        });
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void e1(zzr zzrVar) {
        Preconditions.d(zzrVar.f13655a);
        Preconditions.g(zzrVar.U);
        h(new zzip(this, zzrVar));
    }

    public final void h(Runnable runnable) {
        zzpg zzpgVar = this.f13199a;
        if (zzpgVar.e().m()) {
            runnable.run();
        } else {
            zzpgVar.e().r(runnable);
        }
    }

    public final void h1(String str, boolean z11) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        zzpg zzpgVar = this.f13199a;
        if (zIsEmpty) {
            zzpgVar.b().f12942f.a("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z11) {
            try {
                if (this.f13200b == null) {
                    boolean z12 = true;
                    if (!"com.google.android.gms".equals(this.f13201c) && !UidVerifier.a(zzpgVar.f13606l.f13094a, Binder.getCallingUid()) && !GoogleSignatureVerifier.a(zzpgVar.f13606l.f13094a).b(Binder.getCallingUid())) {
                        z12 = false;
                    }
                    this.f13200b = Boolean.valueOf(z12);
                }
                if (this.f13200b.booleanValue()) {
                    return;
                }
            } catch (SecurityException e8) {
                zzpgVar.b().f12942f.b(zzgu.o(str), "Measurement Service called with invalid calling package. appId");
                throw e8;
            }
        }
        if (this.f13201c == null) {
            Context context = zzpgVar.f13606l.f13094a;
            int callingUid = Binder.getCallingUid();
            AtomicBoolean atomicBoolean = GooglePlayServicesUtilLight.f8650a;
            if (UidVerifier.b(callingUid, context, str)) {
                this.f13201c = str;
            }
        }
        if (str.equals(this.f13201c)) {
            return;
        }
        throw new SecurityException("Unknown calling package name '" + str + "'.");
    }

    public final void i1(Runnable runnable) {
        zzpg zzpgVar = this.f13199a;
        if (zzpgVar.e().m()) {
            runnable.run();
        } else {
            zzpgVar.e().p(runnable);
        }
    }

    public final void j(zzr zzrVar) {
        Preconditions.g(zzrVar);
        String str = zzrVar.f13655a;
        Preconditions.d(str);
        h1(str, false);
        this.f13199a.l0().m(zzrVar.f13657b);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void m0(final zzr zzrVar, final Bundle bundle, final zzge zzgeVar) {
        j(zzrVar);
        final String str = zzrVar.f13655a;
        Preconditions.g(str);
        this.f13199a.e().p(new Runnable() { // from class: com.google.android.gms.measurement.internal.zziy
            @Override // java.lang.Runnable
            public final void run() {
                zzge zzgeVar2 = zzgeVar;
                zzpg zzpgVar = this.f13177a.f13199a;
                zzpgVar.W();
                try {
                    zzgeVar2.Q0(zzpgVar.e0(bundle, zzrVar));
                } catch (RemoteException e8) {
                    zzpgVar.b().f12942f.c(str, e8, "Failed to return trigger URIs for app");
                }
            }
        });
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void n(zzr zzrVar, final zzoo zzooVar, final zzgh zzghVar) {
        j(zzrVar);
        final String str = zzrVar.f13655a;
        Preconditions.g(str);
        this.f13199a.e().p(new Runnable() { // from class: com.google.android.gms.measurement.internal.zziz
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                String str2;
                String str3;
                zzom zzomVar;
                zzgh zzghVar2 = zzghVar;
                zzpg zzpgVar = this.f13182a.f13199a;
                zzpgVar.W();
                zzpgVar.e().g();
                zzpgVar.m0();
                zzaw zzawVar = zzpgVar.f13597c;
                zzpg.U(zzawVar);
                Object obj = null;
                int iIntValue = ((Integer) zzfy.B.a(null)).intValue();
                String str4 = str;
                List<zzpj> listL = zzawVar.l(str4, zzooVar, iIntValue);
                ArrayList arrayList = new ArrayList();
                for (zzpj zzpjVar : listL) {
                    String str5 = zzpjVar.f13624c;
                    long j11 = zzpjVar.f13629h;
                    long j12 = zzpjVar.f13622a;
                    if (zzpgVar.s(str4, str5)) {
                        int i11 = zzpjVar.f13630i;
                        try {
                            if (i11 <= 0) {
                                str2 = str4;
                            } else {
                                if (i11 > ((Integer) zzfy.f12893z.a(obj)).intValue()) {
                                    str3 = str4;
                                } else {
                                    str2 = str4;
                                    long jMin = Math.min(((Long) zzfy.f12889x.a(obj)).longValue() * (1 << (i11 - 1)), ((Long) zzfy.f12891y.a(obj)).longValue());
                                    ((DefaultClock) zzpgVar.c()).getClass();
                                    if (System.currentTimeMillis() < jMin + j11) {
                                        str3 = str2;
                                    }
                                    obj = null;
                                }
                                zzpgVar.b().f12949n.d("[sgtm] batch skipped waiting for next retry. appId, rowId, lastUploadMillis", str3, Long.valueOf(j12), Long.valueOf(j11));
                                str4 = str3;
                                obj = null;
                            }
                            com.google.android.gms.internal.measurement.zzhz zzhzVar = (com.google.android.gms.internal.measurement.zzhz) zzpk.R(com.google.android.gms.internal.measurement.zzib.F(), zzomVar.f13554b);
                            for (int i12 = 0; i12 < ((com.google.android.gms.internal.measurement.zzib) zzhzVar.f11266b).z(); i12++) {
                                com.google.android.gms.internal.measurement.zzic zzicVar = (com.google.android.gms.internal.measurement.zzic) ((com.google.android.gms.internal.measurement.zzib) zzhzVar.f11266b).A(i12).q();
                                ((DefaultClock) zzpgVar.c()).getClass();
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                zzicVar.m();
                                ((com.google.android.gms.internal.measurement.zzid) zzicVar.f11266b).o0(jCurrentTimeMillis);
                                zzhzVar.m();
                                ((com.google.android.gms.internal.measurement.zzib) zzhzVar.f11266b).H(i12, (com.google.android.gms.internal.measurement.zzid) zzicVar.p());
                            }
                            zzomVar.f13554b = ((com.google.android.gms.internal.measurement.zzib) zzhzVar.p()).b();
                            if (Log.isLoggable(zzpgVar.b().q(), 2)) {
                                zzpk zzpkVar = zzpgVar.f13601g;
                                zzpg.U(zzpkVar);
                                zzomVar.f13559t = zzpkVar.H((com.google.android.gms.internal.measurement.zzib) zzhzVar.p());
                            }
                            arrayList.add(zzomVar);
                            str4 = str2;
                        } catch (zzaeh unused) {
                            str3 = str2;
                            zzpgVar.b().f12945i.b(str3, "Failed to parse queued batch. appId");
                            str4 = str3;
                        }
                        Bundle bundle = new Bundle();
                        for (Map.Entry entry : zzpjVar.f13625d.entrySet()) {
                            bundle.putString((String) entry.getKey(), (String) entry.getValue());
                        }
                        long j13 = zzpjVar.f13622a;
                        com.google.android.gms.internal.measurement.zzib zzibVar = zzpjVar.f13623b;
                        zzomVar = new zzom(j13, zzibVar.b(), zzpjVar.f13624c, bundle, zzpjVar.f13626e.zza(), zzpjVar.f13628g, BuildConfig.VERSION_NAME);
                        obj = null;
                    } else {
                        zzpgVar.b().f12949n.d("[sgtm] batch skipped due to destination in backoff. appId, rowId, url", str4, Long.valueOf(j12), zzpjVar.f13624c);
                    }
                }
                String str6 = str4;
                zzoq zzoqVar = new zzoq(arrayList);
                try {
                    zzghVar2.J0(zzoqVar);
                    zzpgVar.b().f12949n.c(str6, Integer.valueOf(zzoqVar.f13561a.size()), "[sgtm] Sending queued upload batches to client. appId, count");
                } catch (RemoteException e8) {
                    zzpgVar.b().f12942f.c(str6, e8, "[sgtm] Failed to return upload batches for app");
                }
            }
        });
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void p0(zzr zzrVar) {
        j(zzrVar);
        i1(new zzin(this, zzrVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final List q(String str, String str2, String str3, boolean z11) {
        h1(str, true);
        zzpg zzpgVar = this.f13199a;
        try {
            List<zzpn> list = (List) ((FutureTask) zzpgVar.e().n(new zzik(this, str, str2, str3))).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (zzpn zzpnVar : list) {
                if (z11 || !zzpp.L(zzpnVar.f13642c)) {
                    arrayList.add(new zzpl(zzpnVar));
                }
            }
            return arrayList;
        } catch (InterruptedException e8) {
            e = e8;
            zzpgVar.b().f12942f.c(zzgu.o(str), e, "Failed to get user properties as. appId");
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e10) {
            e = e10;
            zzpgVar.b().f12942f.c(zzgu.o(str), e, "Failed to get user properties as. appId");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void q0(final zzr zzrVar) {
        Preconditions.d(zzrVar.f13655a);
        Preconditions.g(zzrVar.U);
        h(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzix
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzpg zzpgVar = this.f13175a.f13199a;
                zzpgVar.W();
                zzpgVar.o0(zzrVar);
            }
        });
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void t(zzah zzahVar, zzr zzrVar) {
        Preconditions.g(zzahVar);
        Preconditions.g(zzahVar.f12622c);
        j(zzrVar);
        zzah zzahVar2 = new zzah(zzahVar);
        zzahVar2.f12620a = zzrVar.f13655a;
        i1(new zzih(this, zzahVar2, zzrVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void t0(final zzr zzrVar, final zzaf zzafVar) {
        j(zzrVar);
        i1(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzja
            /* JADX WARN: Code duplicated, block: B:35:0x0123  */
            /* JADX WARN: Code duplicated, block: B:67:0x025f  */
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                zzaf zzafVar2;
                long j11;
                int i11;
                Cursor cursorQuery;
                Cursor cursor;
                zzpg zzpgVar = this.f13190a.f13199a;
                zzpgVar.W();
                String str = zzrVar.f13655a;
                Preconditions.g(str);
                HashMap map = zzpgVar.E;
                zzpgVar.e().g();
                zzpgVar.m0();
                zzaw zzawVar = zzpgVar.f13597c;
                zzpg.U(zzawVar);
                zzaf zzafVar3 = zzafVar;
                long j12 = zzafVar3.f12617a;
                long j13 = zzafVar3.f12619c;
                int i12 = zzafVar3.f12618b;
                zzawVar.g();
                zzawVar.h();
                Cursor cursor2 = null;
                zzpjVarJ = null;
                zzpj zzpjVarJ = null;
                try {
                    cursorQuery = zzawVar.X().query("upload_queue", new String[]{"rowId", "app_id", "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", "creation_timestamp", "associated_row_id", "last_upload_timestamp"}, "rowId=?", new String[]{String.valueOf(j12)}, null, null, null, "1");
                    try {
                        try {
                            if (cursorQuery.moveToFirst()) {
                                try {
                                    String string = cursorQuery.getString(1);
                                    Preconditions.g(string);
                                    try {
                                        i11 = i12;
                                        zzafVar2 = zzafVar3;
                                        cursor = cursorQuery;
                                        j11 = j13;
                                        try {
                                            zzpjVarJ = zzawVar.J(string, j12, cursorQuery.getBlob(2), cursorQuery.getString(3), cursorQuery.getString(4), cursorQuery.getInt(5), cursorQuery.getInt(6), cursorQuery.getLong(7), cursorQuery.getLong(8), cursorQuery.getLong(9));
                                            cursor.close();
                                        } catch (SQLiteException e8) {
                                            e = e8;
                                            cursorQuery = cursor;
                                            try {
                                                zzgu zzguVar = zzawVar.f13202a.f13099f;
                                                zzic.m(zzguVar);
                                                zzguVar.f12942f.c(Long.valueOf(j12), e, "Error to querying MeasurementBatch from upload_queue. rowId");
                                                if (cursorQuery != null) {
                                                    cursorQuery.close();
                                                }
                                            } catch (Throwable th2) {
                                                th = th2;
                                                cursor2 = cursorQuery;
                                                if (cursor2 != null) {
                                                    cursor2.close();
                                                }
                                                throw th;
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            cursor2 = cursor;
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                            throw th;
                                        }
                                    } catch (SQLiteException e10) {
                                        e = e10;
                                        j11 = j13;
                                        i11 = i12;
                                        cursor = cursorQuery;
                                        zzafVar2 = zzafVar3;
                                    }
                                } catch (SQLiteException e11) {
                                    e = e11;
                                    j11 = j13;
                                    i11 = i12;
                                    cursor = cursorQuery;
                                    zzafVar2 = zzafVar3;
                                }
                            } else {
                                zzafVar2 = zzafVar3;
                                j11 = j13;
                                i11 = i12;
                                if (cursorQuery != null) {
                                    cursorQuery.close();
                                }
                            }
                        } catch (SQLiteException e12) {
                            e = e12;
                            zzafVar2 = zzafVar3;
                            j11 = j13;
                            i11 = i12;
                            cursor = cursorQuery;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        cursor = cursorQuery;
                    }
                } catch (SQLiteException e13) {
                    e = e13;
                    zzafVar2 = zzafVar3;
                    j11 = j13;
                    i11 = i12;
                    cursorQuery = null;
                } catch (Throwable th5) {
                    th = th5;
                }
                zzpj zzpjVar = zzpjVarJ;
                if (zzpjVar == null) {
                    zzpgVar.b().f12945i.c(str, Long.valueOf(j12), "[sgtm] Queued batch doesn't exist. appId, rowId");
                    return;
                }
                String str2 = zzpjVar.f13624c;
                if (i11 != zzlr.SUCCESS.zza()) {
                    if (i11 == zzlr.BACKOFF.zza()) {
                        zzpe zzpeVar = (zzpe) map.get(str2);
                        if (zzpeVar == null) {
                            zzpeVar = new zzpe(zzpgVar);
                            map.put(str2, zzpeVar);
                        } else {
                            zzpeVar.f13592b++;
                            zzpeVar.f13593c = zzpeVar.a();
                        }
                        ((DefaultClock) zzpgVar.c()).getClass();
                        zzpgVar.b().f12949n.d("[sgtm] Putting sGTM server in backoff mode. appId, destination, nextRetryInSeconds", str, str2, Long.valueOf((zzpeVar.f13593c - System.currentTimeMillis()) / 1000));
                    }
                    zzaw zzawVar2 = zzpgVar.f13597c;
                    zzpg.U(zzawVar2);
                    Long lValueOf = Long.valueOf(zzafVar2.f12617a);
                    zzawVar2.s(lValueOf);
                    zzpgVar.b().f12949n.c(str, lValueOf, "[sgtm] increased batch retry count after failed client upload. appId, rowId");
                    return;
                }
                if (map.containsKey(str2)) {
                    map.remove(str2);
                }
                zzaw zzawVar3 = zzpgVar.f13597c;
                zzpg.U(zzawVar3);
                Long lValueOf2 = Long.valueOf(j12);
                zzawVar3.n(lValueOf2);
                zzpgVar.b().f12949n.c(str, lValueOf2, "[sgtm] queued batch deleted after successful client upload. appId, rowId");
                if (j11 > 0) {
                    zzaw zzawVar4 = zzpgVar.f13597c;
                    zzpg.U(zzawVar4);
                    zzic zzicVar = zzawVar4.f13202a;
                    zzawVar4.g();
                    zzawVar4.h();
                    Long lValueOf3 = Long.valueOf(j11);
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("upload_type", Integer.valueOf(zzls.GOOGLE_SIGNAL.zza()));
                    DefaultClock defaultClock = zzicVar.f13104k;
                    zzgu zzguVar2 = zzicVar.f13099f;
                    defaultClock.getClass();
                    contentValues.put("creation_timestamp", Long.valueOf(System.currentTimeMillis()));
                    try {
                        if (zzawVar4.X().update("upload_queue", contentValues, "rowid=? AND app_id=? AND upload_type=?", new String[]{String.valueOf(j11), str, String.valueOf(zzls.GOOGLE_SIGNAL_PENDING.zza())}) != 1) {
                            zzic.m(zzguVar2);
                            zzguVar2.f12945i.c(str, lValueOf3, "Google Signal pending batch not updated. appId, rowId");
                        }
                        zzpgVar.b().f12949n.c(str, Long.valueOf(j11), "[sgtm] queued Google Signal batch updated. appId, signalRowId");
                        zzpgVar.t(str);
                    } catch (SQLiteException e14) {
                        zzic.m(zzguVar2);
                        zzguVar2.f12942f.d("Failed to update google Signal pending batch. appid, rowId", str, Long.valueOf(j11), e14);
                        throw e14;
                    }
                }
            }
        });
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void w0(zzpl zzplVar, zzr zzrVar) {
        Preconditions.g(zzplVar);
        j(zzrVar);
        i1(new zziu(this, zzplVar, zzrVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final zzao y0(zzr zzrVar) {
        j(zzrVar);
        String str = zzrVar.f13655a;
        Preconditions.d(str);
        zzpg zzpgVar = this.f13199a;
        try {
            return (zzao) ((FutureTask) zzpgVar.e().o(new zziq(this, zzrVar))).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e8) {
            zzpgVar.b().f12942f.c(zzgu.o(str), e8, "Failed to get consent. appId");
            return new zzao(null);
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void z0(final Bundle bundle, final zzr zzrVar) {
        j(zzrVar);
        final String str = zzrVar.f13655a;
        Preconditions.g(str);
        i1(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzjb
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                zzpg zzpgVar = this.f13193a.f13199a;
                Bundle bundle2 = bundle;
                boolean zIsEmpty = bundle2.isEmpty();
                String str2 = str;
                if (zIsEmpty) {
                    zzaw zzawVar = zzpgVar.f13597c;
                    zzpg.U(zzawVar);
                    zzawVar.g();
                    zzawVar.h();
                    try {
                        zzawVar.X().execSQL("delete from default_event_params where app_id=?", new String[]{str2});
                        return;
                    } catch (SQLiteException e8) {
                        zzgu zzguVar = zzawVar.f13202a.f13099f;
                        zzic.m(zzguVar);
                        zzguVar.f12942f.b(e8, "Error clearing default event params");
                        return;
                    }
                }
                zzaw zzawVar2 = zzpgVar.f13597c;
                zzpg.U(zzawVar2);
                zzic zzicVar = zzawVar2.f13202a;
                zzawVar2.g();
                zzawVar2.h();
                zzbc zzbcVar = new zzbc(zzawVar2.f13202a, BuildConfig.VERSION_NAME, str2, "dep", 0L, 0L, 0L, bundle2);
                zzpk zzpkVar = zzawVar2.f13552b.f13601g;
                zzpg.U(zzpkVar);
                byte[] bArrB = zzpkVar.G(zzbcVar).b();
                zzgu zzguVar2 = zzicVar.f13099f;
                zzic.m(zzguVar2);
                zzguVar2.f12949n.c(str2, Integer.valueOf(bArrB.length), "Saving default event parameters, appId, data size");
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", str2);
                contentValues.put("parameters", bArrB);
                try {
                    if (zzawVar2.X().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                        zzic.m(zzguVar2);
                        zzguVar2.f12942f.b(zzgu.o(str2), "Failed to insert default event parameters (got -1). appId");
                    }
                } catch (SQLiteException e10) {
                    zzic.m(zzguVar2);
                    zzguVar2.f12942f.c(zzgu.o(str2), e10, "Error storing default event parameters. appId");
                }
                zzaw zzawVar3 = zzpgVar.f13597c;
                zzpg.U(zzawVar3);
                long j11 = zzrVar.f13666f0;
                try {
                    if (zzawVar3.D("select count(*) from raw_events where app_id=? and timestamp >= ? and name not like '!_%' escape '!' limit 1;", new String[]{str2, String.valueOf(j11)}, 0L) <= 0 && zzawVar3.D("select count(*) from raw_events where app_id=? and timestamp >= ? and name like '!_%' escape '!' limit 1;", new String[]{str2, String.valueOf(j11)}, 0L) > 0) {
                        zzaw zzawVar4 = zzpgVar.f13597c;
                        zzpg.U(zzawVar4);
                        zzawVar4.z(str2, Long.valueOf(j11), null, bundle2);
                    }
                } catch (SQLiteException e11) {
                    zzgu zzguVar3 = zzawVar3.f13202a.f13099f;
                    zzic.m(zzguVar3);
                    zzguVar3.f12942f.b(e11, "Error checking backfill conditions");
                }
            }
        });
    }
}
