package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.common.internal.Preconditions;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzau {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f12650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzaw f12651c;

    public zzau(zzaw zzawVar, String str) {
        this.f12651c = zzawVar;
        Preconditions.d(str);
        this.f12649a = str;
        this.f12650b = -1L;
    }

    public final List a() {
        List list;
        List list2;
        zzaw zzawVar = this.f12651c;
        ArrayList arrayList = new ArrayList();
        String strValueOf = String.valueOf(this.f12650b);
        String str = this.f12649a;
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = zzawVar.X().query("raw_events", new String[]{"rowid", "name", "timestamp", "metadata_fingerprint", "data", "realtime", "elapsed_time"}, "app_id = ? and rowid > ?", new String[]{str, strValueOf}, null, null, "rowid", "1000");
                if (cursorQuery.moveToFirst()) {
                    do {
                        long j11 = cursorQuery.getLong(0);
                        long j12 = cursorQuery.getLong(3);
                        boolean z11 = cursorQuery.getLong(5) == 1;
                        long j13 = cursorQuery.getLong(6);
                        byte[] blob = cursorQuery.getBlob(4);
                        if (j11 > this.f12650b) {
                            this.f12650b = j11;
                        }
                        try {
                            com.google.android.gms.internal.measurement.zzhr zzhrVar = (com.google.android.gms.internal.measurement.zzhr) zzpk.R(com.google.android.gms.internal.measurement.zzhs.O(), blob);
                            String string = cursorQuery.getString(1);
                            if (string == null) {
                                string = BuildConfig.VERSION_NAME;
                            }
                            zzhrVar.z(string);
                            long j14 = cursorQuery.getLong(2);
                            zzhrVar.m();
                            ((com.google.android.gms.internal.measurement.zzhs) zzhrVar.f11266b).V(j14);
                            zzhrVar.m();
                            ((com.google.android.gms.internal.measurement.zzhs) zzhrVar.f11266b).y(j13);
                            arrayList.add(new zzat(j11, j12, z11, (com.google.android.gms.internal.measurement.zzhs) zzhrVar.p()));
                        } catch (IOException e8) {
                            zzgu zzguVar = zzawVar.f13202a.f13099f;
                            zzic.m(zzguVar);
                            zzguVar.f12942f.c(zzgu.o(str), e8, "Data loss. Failed to merge raw event. appId");
                        }
                    } while (cursorQuery.moveToNext());
                    list = arrayList;
                } else {
                    list2 = Collections.EMPTY_LIST;
                }
            } catch (SQLiteException e10) {
                zzgu zzguVar2 = zzawVar.f13202a.f13099f;
                zzic.m(zzguVar2);
                zzguVar2.f12942f.c(zzgu.o(str), e10, "Data loss. Error querying raw events batch. appId");
                list = arrayList;
            }
            list = list2;
            return list;
        } finally {
            if (0 != 0) {
                cursorQuery.close();
            }
        }
    }

    public zzau(zzaw zzawVar, String str, long j11) {
        this.f12651c = zzawVar;
        Preconditions.d(str);
        this.f12649a = str;
        this.f12650b = zzawVar.D("select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1", new String[]{str, String.valueOf(j11)}, -1L);
    }
}
