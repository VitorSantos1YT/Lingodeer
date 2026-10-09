package com.google.android.gms.measurement.internal;

import am.rVFB.LwKl;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.drawerlayout.widget.ktFt.FpIL;
import androidx.lifecycle.livedata.HeRS.DytezVyM;
import androidx.lifecycle.viewmodel.compose.NP.IMCc;
import b7.e0;
import com.alibaba.sdk.android.oss.common.OSSHeaders;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.internal.measurement.zzahk;
import com.google.android.gms.internal.measurement.zzahl;
import com.google.android.gms.internal.measurement.zzaif;
import com.google.android.material.datepicker.d;
import com.google.zxing.pdf417.decoder.vBn.xTCJ;
import com.tbruyelle.rxpermissions3.BuildConfig;
import defpackage.e;
import ep.a;
import i0.pKy.shrCcjmOhAmRC;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import l0.Eeqr.HOBXIlHxIkMBEA;
import lt.AJC.PQgum;
import nv.p;
import su.Mbl.tcppUUQxZjFdy;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzaw extends zzos {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String[] f12653f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", LwKl.FYcBsjooXV, "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String[] f12654g = {"associated_row_id", "ALTER TABLE upload_queue ADD COLUMN associated_row_id INTEGER;", "last_upload_timestamp", "ALTER TABLE upload_queue ADD COLUMN last_upload_timestamp INTEGER;"};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String[] f12655h = {OSSHeaders.ORIGIN, "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String[] f12656i = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;", "ad_campaign_info", "ALTER TABLE apps ADD COLUMN ad_campaign_info BLOB;", "daily_registered_triggers_count", "ALTER TABLE apps ADD COLUMN daily_registered_triggers_count INTEGER;", "client_upload_eligibility", "ALTER TABLE apps ADD COLUMN client_upload_eligibility INTEGER;", "gmp_version_for_remote_config", "ALTER TABLE apps ADD COLUMN gmp_version_for_remote_config INTEGER;", "last_diagnostics_signal_upload_timestamp", "ALTER TABLE apps ADD COLUMN last_diagnostics_signal_upload_timestamp INTEGER;"};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String[] f12657j = {xTCJ.OLqHAOjylkocxLv, "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;", "elapsed_time", "ALTER TABLE raw_events ADD COLUMN elapsed_time INTEGER;"};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String[] f12658k = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String[] f12659l = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    public static final String[] m = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String[] f12660n = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String[] f12661o = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String[] f12662p = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zzav f12663d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final zzog f12664e;

    public zzaw(zzpg zzpgVar) {
        super(zzpgVar);
        this.f12664e = new zzog(this.f13202a.f13104k);
        this.f13202a.getClass();
        this.f12663d = new zzav(this, this.f13202a.f13094a);
    }

    public static final String L(List list) {
        return list.isEmpty() ? BuildConfig.VERSION_NAME : a.g(" AND (upload_type IN (", TextUtils.join(", ", list), "))");
    }

    public static final void T(ContentValues contentValues, Object obj) {
        Preconditions.d("value");
        Preconditions.g(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            contentValues.put("value", (Double) obj);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005c  */
    /* JADX WARN: Code duplicated, block: B:26:0x005f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x0062  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v9, types: [android.database.Cursor] */
    public final zzjl A(String str) {
        Throwable th2;
        SQLiteException e8;
        zzic zzicVar = this.f13202a;
        Preconditions.g(str);
        g();
        h();
        ?? RawQuery = {str};
        ?? r9 = 0;
        zzjlVarC = null;
        zzjlVarC = null;
        zzjl zzjlVarC = null;
        try {
            try {
                RawQuery = X().rawQuery("select consent_state, consent_source from consent_settings where app_id=? limit 1;", RawQuery);
                try {
                    if (RawQuery.moveToFirst()) {
                        zzjlVarC = zzjl.c(RawQuery.getInt(1), RawQuery.getString(0));
                    } else {
                        zzgu zzguVar = zzicVar.f13099f;
                        zzic.m(zzguVar);
                        zzguVar.f12949n.a("No data found");
                    }
                } catch (SQLiteException e10) {
                    e8 = e10;
                    zzgu zzguVar2 = zzicVar.f13099f;
                    zzic.m(zzguVar2);
                    zzguVar2.f12942f.b(e8, "Error querying database.");
                    if (RawQuery != 0) {
                    }
                    if (zzjlVarC == null) {
                        return zzjl.f13204c;
                    }
                    return zzjlVarC;
                }
            } catch (Throwable th3) {
                th2 = th3;
                r9 = RawQuery;
                if (r9 != 0) {
                    r9.close();
                }
                throw th2;
            }
        } catch (SQLiteException e11) {
            e8 = e11;
            RawQuery = 0;
        } catch (Throwable th4) {
            th2 = th4;
            if (r9 != 0) {
                r9.close();
            }
            throw th2;
        }
        RawQuery.close();
        if (zzjlVarC == null) {
            return zzjl.f13204c;
        }
        return zzjlVarC;
    }

    public final long C(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = X().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j11 = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j11;
            } catch (SQLiteException e8) {
                zzgu zzguVar = this.f13202a.f13099f;
                zzic.m(zzguVar);
                zzguVar.f12942f.c(str, e8, "Database error");
                throw e8;
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                cursor.close();
            }
            throw th2;
        }
    }

    public final long D(String str, String[] strArr, long j11) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = X().rawQuery(str, strArr);
                if (cursorRawQuery.moveToFirst()) {
                    j11 = cursorRawQuery.getLong(0);
                }
                cursorRawQuery.close();
                return j11;
            } catch (SQLiteException e8) {
                zzgu zzguVar = this.f13202a.f13099f;
                zzic.m(zzguVar);
                zzguVar.f12942f.c(str, e8, "Database error");
                throw e8;
            }
        } catch (Throwable th2) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0032  */
    public final String E(String str, String[] strArr) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = X().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    cursorRawQuery.close();
                    return BuildConfig.VERSION_NAME;
                }
                String string = cursorRawQuery.getString(0);
                cursorRawQuery.close();
                return string;
            } catch (SQLiteException e8) {
                zzgu zzguVar = this.f13202a.f13099f;
                zzic.m(zzguVar);
                zzguVar.f12942f.c(str, e8, "Database error");
                throw e8;
            }
        } catch (Throwable th2) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th2;
        }
        if (cursorRawQuery != null) {
            cursorRawQuery.close();
        }
        throw th2;
    }

    public final void F(ContentValues contentValues) {
        zzic zzicVar = this.f13202a;
        try {
            SQLiteDatabase sQLiteDatabaseX = X();
            String asString = contentValues.getAsString("app_id");
            if (asString == null) {
                zzgu zzguVar = zzicVar.f13099f;
                zzic.m(zzguVar);
                zzguVar.f12944h.b(zzgu.o("app_id"), "Value of the primary key is not set.");
                return;
            }
            StringBuilder sb2 = new StringBuilder(10);
            sb2.append("app_id = ?");
            if (sQLiteDatabaseX.update("consent_settings", contentValues, sb2.toString(), new String[]{asString}) == 0 && sQLiteDatabaseX.insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                zzgu zzguVar2 = zzicVar.f13099f;
                zzic.m(zzguVar2);
                zzguVar2.f12942f.c(zzgu.o("consent_settings"), zzgu.o("app_id"), "Failed to insert/update table (got -1). key");
            }
        } catch (SQLiteException e8) {
            zzgu zzguVar3 = zzicVar.f13099f;
            zzic.m(zzguVar3);
            zzguVar3.f12942f.d("Error storing into table. key", zzgu.o("consent_settings"), zzgu.o("app_id"), e8);
        }
    }

    public final void I(String str, String str2) {
        Preconditions.d(str2);
        g();
        h();
        try {
            X().delete(str, "app_id=?", new String[]{str2});
        } catch (SQLiteException e8) {
            zzgu zzguVar = this.f13202a.f13099f;
            zzic.m(zzguVar);
            zzguVar.f12942f.c(zzgu.o(str2), e8, "Error deleting snapshot. appId");
        }
    }

    public final zzpj J(String str, long j11, byte[] bArr, String str2, String str3, int i11, int i12, long j12, long j13, long j14) {
        boolean zIsEmpty = TextUtils.isEmpty(str2);
        zzic zzicVar = this.f13202a;
        if (zIsEmpty) {
            zzgu zzguVar = zzicVar.f13099f;
            zzic.m(zzguVar);
            zzguVar.m.a("Upload uri is null or empty. Destination is unknown. Dropping batch. ");
            return null;
        }
        try {
            com.google.android.gms.internal.measurement.zzhz zzhzVar = (com.google.android.gms.internal.measurement.zzhz) zzpk.R(com.google.android.gms.internal.measurement.zzib.F(), bArr);
            zzls zzlsVarA = zzls.a(i11);
            if (zzlsVarA != zzls.GOOGLE_SIGNAL && zzlsVarA != zzls.GOOGLE_SIGNAL_PENDING && i12 > 0) {
                ArrayList arrayList = new ArrayList();
                Iterator it = Collections.unmodifiableList(((com.google.android.gms.internal.measurement.zzib) zzhzVar.f11266b).y()).iterator();
                while (it.hasNext()) {
                    com.google.android.gms.internal.measurement.zzic zzicVar2 = (com.google.android.gms.internal.measurement.zzic) ((com.google.android.gms.internal.measurement.zzid) it.next()).q();
                    zzicVar2.m();
                    ((com.google.android.gms.internal.measurement.zzid) zzicVar2.f11266b).d1(i12);
                    arrayList.add((com.google.android.gms.internal.measurement.zzid) zzicVar2.p());
                }
                zzhzVar.m();
                ((com.google.android.gms.internal.measurement.zzib) zzhzVar.f11266b).K();
                zzhzVar.m();
                ((com.google.android.gms.internal.measurement.zzib) zzhzVar.f11266b).J(arrayList);
            }
            HashMap map = new HashMap();
            if (str3 != null) {
                for (String str4 : str3.split("\r\n")) {
                    if (str4.isEmpty()) {
                        break;
                    }
                    String[] strArrSplit = str4.split("=", 2);
                    if (strArrSplit.length != 2) {
                        zzgu zzguVar2 = zzicVar.f13099f;
                        zzic.m(zzguVar2);
                        zzguVar2.f12942f.b(str4, "Invalid upload header: ");
                        break;
                    }
                    map.put(strArrSplit[0], strArrSplit[1]);
                }
            }
            zzpi zzpiVar = new zzpi();
            zzpiVar.f13621a = j11;
            try {
                return new zzpj(zzpiVar.f13621a, (com.google.android.gms.internal.measurement.zzib) zzhzVar.p(), str2, map, zzlsVarA, j12, j13, j14, i12);
            } catch (IOException e8) {
                e = e8;
                zzgu zzguVar3 = zzicVar.f13099f;
                zzic.m(zzguVar3);
                zzguVar3.f12942f.c(str, e, "Failed to queued MeasurementBatch from upload_queue. appId");
                return 0;
            }
        } catch (IOException e10) {
            e = e10;
        }
    }

    public final String K() {
        this.f13202a.f13104k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        Locale locale = Locale.US;
        zzls zzlsVar = zzls.GOOGLE_SIGNAL;
        int iZza = zzlsVar.zza();
        Long l9 = (Long) zzfy.S.a(null);
        l9.getClass();
        String str = "(upload_type = " + iZza + " AND ABS(creation_timestamp - " + jCurrentTimeMillis + ") > " + l9 + ")";
        int iZza2 = zzlsVar.zza();
        long jLongValue = ((Long) zzfy.R.a(null)).longValue();
        StringBuilder sbO = e0.o(iZza2, "(upload_type != ", " AND ABS(creation_timestamp - ", jCurrentTimeMillis);
        sbO.append(") > ");
        sbO.append(jLongValue);
        sbO.append(")");
        String string = sbO.toString();
        StringBuilder sb2 = new StringBuilder(str.length() + 5 + string.length() + 1);
        d.w(sb2, "(", str, " OR ", string);
        sb2.append(")");
        return sb2.toString();
    }

    public final void M(String str, zzjl zzjlVar) {
        Preconditions.g(str);
        Preconditions.g(zzjlVar);
        g();
        h();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", zzjlVar.g());
        contentValues.put("consent_source", Integer.valueOf(zzjlVar.f13206b));
        F(contentValues);
    }

    public final List N(String str) {
        List list;
        String string;
        zzic zzicVar = this.f13202a;
        g();
        h();
        ArrayList arrayList = new ArrayList();
        try {
            SQLiteDatabase sQLiteDatabaseX = X();
            sQLiteDatabaseX.beginTransaction();
            Cursor cursorQuery = null;
            try {
                try {
                    cursorQuery = sQLiteDatabaseX.query("diagnostic_signals", new String[]{"signal_name", "metadata", "count"}, "app_id=?", new String[]{str}, null, null, "rowid", null);
                    if (cursorQuery.moveToFirst()) {
                        boolean zIsEmpty = str.isEmpty();
                        do {
                            String string2 = cursorQuery.getString(0);
                            if (cursorQuery.isNull(1)) {
                                string = BuildConfig.VERSION_NAME;
                            } else {
                                string = cursorQuery.getString(1);
                                Preconditions.g(string);
                            }
                            if (string2 == null) {
                                zzgu zzguVar = zzicVar.f13099f;
                                zzic.m(zzguVar);
                                zzguVar.f12942f.b(zzgu.o(str), "Read null value from diagnostic signals table, ignoring it. appId");
                            } else {
                                long j11 = cursorQuery.getLong(2);
                                com.google.android.gms.internal.measurement.zzfa zzfaVarY = com.google.android.gms.internal.measurement.zzfb.y();
                                zzfaVarY.m();
                                ((com.google.android.gms.internal.measurement.zzfb) zzfaVarY.f11266b).z(string2);
                                zzfaVarY.m();
                                ((com.google.android.gms.internal.measurement.zzfb) zzfaVarY.f11266b).C(j11);
                                zzfaVarY.m();
                                ((com.google.android.gms.internal.measurement.zzfb) zzfaVarY.f11266b).B(string);
                                if (zIsEmpty) {
                                    zzfaVarY.m();
                                    ((com.google.android.gms.internal.measurement.zzfb) zzfaVarY.f11266b).A();
                                }
                                arrayList.add((com.google.android.gms.internal.measurement.zzfb) zzfaVarY.p());
                            }
                        } while (cursorQuery.moveToNext());
                        sQLiteDatabaseX.delete("diagnostic_signals", "app_id=?", new String[]{str});
                        sQLiteDatabaseX.setTransactionSuccessful();
                        list = arrayList;
                    } else {
                        sQLiteDatabaseX.setTransactionSuccessful();
                    }
                } catch (Throwable th2) {
                    if (0 != 0) {
                        cursorQuery.close();
                    }
                    sQLiteDatabaseX.endTransaction();
                    throw th2;
                }
            } catch (SQLiteException e8) {
                zzgu zzguVar2 = zzicVar.f13099f;
                zzic.m(zzguVar2);
                zzguVar2.f12942f.c(zzgu.o(str), e8, "Error querying or deleting diagnostic signals. appId");
                list = Collections.EMPTY_LIST;
            }
            if (cursorQuery != null) {
                list = arrayList;
                cursorQuery.close();
            }
            list = arrayList;
            sQLiteDatabaseX.endTransaction();
            return list;
        } catch (SQLiteException e10) {
            zzgu zzguVar3 = zzicVar.f13099f;
            zzic.m(zzguVar3);
            zzguVar3.f12942f.c(zzgu.o(str), e10, "Error opening database for diagnostic signals. appId");
            return Collections.EMPTY_LIST;
        }
    }

    public final void O(String str, zzjl zzjlVar) {
        Preconditions.g(str);
        g();
        h();
        M(str, A(str));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("storage_consent_at_bundling", zzjlVar.g());
        F(contentValues);
    }

    public final zzjl P(String str) {
        Preconditions.g(str);
        g();
        h();
        return zzjl.c(100, E("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new String[]{str}));
    }

    public final zzbd Q(String str, com.google.android.gms.internal.measurement.zzhs zzhsVar, String str2) {
        zzbd zzbdVarG = G("events", str, zzhsVar.D());
        if (zzbdVarG != null) {
            long j11 = zzbdVarG.f12693e + 1;
            long j12 = zzbdVarG.f12692d + 1;
            return new zzbd(zzbdVarG.f12689a, zzbdVarG.f12690b, zzbdVarG.f12691c + 1, j12, j11, zzbdVarG.f12694f, zzbdVarG.f12695g, zzbdVarG.f12696h, zzbdVarG.f12697i, zzbdVarG.f12698j, zzbdVarG.f12699k);
        }
        zzic zzicVar = this.f13202a;
        zzgu zzguVar = zzicVar.f13099f;
        zzic.m(zzguVar);
        zzguVar.f12945i.c(zzgu.o(str), zzicVar.f13103j.a(str2), "Event aggregate wasn't created during raw event logging. appId, event");
        return new zzbd(str, zzhsVar.D(), 1L, 1L, 1L, zzhsVar.F(), 0L, null, null, null, null);
    }

    public final boolean R() {
        return this.f13202a.f13094a.getDatabasePath("google_app_measurement.db").exists();
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00ed A[Catch: all -> 0x0077, SQLiteException -> 0x007a, TryCatch #1 {SQLiteException -> 0x007a, blocks: (B:19:0x006f, B:40:0x00c7, B:42:0x00ed, B:43:0x00ff, B:44:0x0103, B:45:0x0113, B:47:0x0119, B:48:0x0129, B:60:0x0157, B:63:0x015f, B:64:0x016a, B:66:0x018a, B:67:0x0198, B:68:0x01a2, B:73:0x01e0, B:72:0x01d0, B:76:0x01e7, B:53:0x0144, B:78:0x01f9), top: B:91:0x006f }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00ff A[Catch: all -> 0x0077, SQLiteException -> 0x007a, TRY_LEAVE, TryCatch #1 {SQLiteException -> 0x007a, blocks: (B:19:0x006f, B:40:0x00c7, B:42:0x00ed, B:43:0x00ff, B:44:0x0103, B:45:0x0113, B:47:0x0119, B:48:0x0129, B:60:0x0157, B:63:0x015f, B:64:0x016a, B:66:0x018a, B:67:0x0198, B:68:0x01a2, B:73:0x01e0, B:72:0x01d0, B:76:0x01e7, B:53:0x0144, B:78:0x01f9), top: B:91:0x006f }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0119 A[Catch: all -> 0x0077, SQLiteException -> 0x007a, TryCatch #1 {SQLiteException -> 0x007a, blocks: (B:19:0x006f, B:40:0x00c7, B:42:0x00ed, B:43:0x00ff, B:44:0x0103, B:45:0x0113, B:47:0x0119, B:48:0x0129, B:60:0x0157, B:63:0x015f, B:64:0x016a, B:66:0x018a, B:67:0x0198, B:68:0x01a2, B:73:0x01e0, B:72:0x01d0, B:76:0x01e7, B:53:0x0144, B:78:0x01f9), top: B:91:0x006f }] */
    /* JADX WARN: Code duplicated, block: B:50:0x013e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0142  */
    /* JADX WARN: Code duplicated, block: B:53:0x0144 A[Catch: all -> 0x0077, SQLiteException -> 0x007a, TryCatch #1 {SQLiteException -> 0x007a, blocks: (B:19:0x006f, B:40:0x00c7, B:42:0x00ed, B:43:0x00ff, B:44:0x0103, B:45:0x0113, B:47:0x0119, B:48:0x0129, B:60:0x0157, B:63:0x015f, B:64:0x016a, B:66:0x018a, B:67:0x0198, B:68:0x01a2, B:73:0x01e0, B:72:0x01d0, B:76:0x01e7, B:53:0x0144, B:78:0x01f9), top: B:91:0x006f }] */
    /* JADX WARN: Code duplicated, block: B:55:0x014d  */
    /* JADX WARN: Code duplicated, block: B:61:0x015c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x015e  */
    /* JADX WARN: Code duplicated, block: B:66:0x018a A[Catch: all -> 0x0077, SQLiteException -> 0x007a, LOOP:0: B:66:0x018a->B:101:?, LOOP_START, TRY_LEAVE, TryCatch #1 {SQLiteException -> 0x007a, blocks: (B:19:0x006f, B:40:0x00c7, B:42:0x00ed, B:43:0x00ff, B:44:0x0103, B:45:0x0113, B:47:0x0119, B:48:0x0129, B:60:0x0157, B:63:0x015f, B:64:0x016a, B:66:0x018a, B:67:0x0198, B:68:0x01a2, B:73:0x01e0, B:72:0x01d0, B:76:0x01e7, B:53:0x0144, B:78:0x01f9), top: B:91:0x006f }] */
    /* JADX WARN: Code duplicated, block: B:73:0x01e0 A[Catch: all -> 0x0077, SQLiteException -> 0x007a, TryCatch #1 {SQLiteException -> 0x007a, blocks: (B:19:0x006f, B:40:0x00c7, B:42:0x00ed, B:43:0x00ff, B:44:0x0103, B:45:0x0113, B:47:0x0119, B:48:0x0129, B:60:0x0157, B:63:0x015f, B:64:0x016a, B:66:0x018a, B:67:0x0198, B:68:0x01a2, B:73:0x01e0, B:72:0x01d0, B:76:0x01e7, B:53:0x0144, B:78:0x01f9), top: B:91:0x006f }] */
    /* JADX WARN: Code duplicated, block: B:76:0x01e7 A[Catch: all -> 0x0077, SQLiteException -> 0x007a, TryCatch #1 {SQLiteException -> 0x007a, blocks: (B:19:0x006f, B:40:0x00c7, B:42:0x00ed, B:43:0x00ff, B:44:0x0103, B:45:0x0113, B:47:0x0119, B:48:0x0129, B:60:0x0157, B:63:0x015f, B:64:0x016a, B:66:0x018a, B:67:0x0198, B:68:0x01a2, B:73:0x01e0, B:72:0x01d0, B:76:0x01e7, B:53:0x0144, B:78:0x01f9), top: B:91:0x006f }] */
    /* JADX WARN: Code duplicated, block: B:99:0x01ce A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public final void S(String str, long j11, long j12, zzpc zzpcVar) {
        ?? IsEmpty;
        ?? string;
        String str2;
        String[] strArr;
        String string2;
        ?? r9;
        long jD;
        long j13;
        String str3;
        String[] strArr2;
        long j14;
        com.google.android.gms.internal.measurement.zzhr zzhrVar;
        zzic zzicVar = this.f13202a;
        g();
        h();
        Cursor cursorRawQuery = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseX = X();
                IsEmpty = TextUtils.isEmpty(str);
                String str4 = BuildConfig.VERSION_NAME;
                if (IsEmpty != 0) {
                    String[] strArr3 = j12 != -1 ? new String[]{String.valueOf(j12), String.valueOf(j11)} : new String[]{String.valueOf(j11)};
                    if (j12 != -1) {
                        str4 = "rowid <= ? and ";
                    }
                    StringBuilder sb2 = new StringBuilder(str4.length() + 148);
                    sb2.append("select app_id, metadata_fingerprint from raw_events where ");
                    sb2.append(str4);
                    sb2.append("app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;");
                    cursorRawQuery = sQLiteDatabaseX.rawQuery(sb2.toString(), strArr3);
                    try {
                        if (cursorRawQuery.moveToFirst()) {
                            string = cursorRawQuery.getString(0);
                            try {
                                string2 = cursorRawQuery.getString(1);
                                cursorRawQuery.close();
                                r9 = string;
                                cursorRawQuery = sQLiteDatabaseX.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{r9, string2}, null, null, "rowid", "2");
                                if (cursorRawQuery.moveToFirst()) {
                                    try {
                                        com.google.android.gms.internal.measurement.zzid zzidVar = (com.google.android.gms.internal.measurement.zzid) ((com.google.android.gms.internal.measurement.zzic) zzpk.R(com.google.android.gms.internal.measurement.zzid.d0(), cursorRawQuery.getBlob(0))).p();
                                        if (cursorRawQuery.moveToNext()) {
                                            zzgu zzguVar = zzicVar.f13099f;
                                            zzic.m(zzguVar);
                                            zzguVar.f12945i.b(zzgu.o(r9), "Get multiple raw event metadata records, expected one. appId");
                                        }
                                        cursorRawQuery.close();
                                        zzpcVar.f13584a = zzidVar;
                                        jD = D("select (rowid - 1) as max_rowid from raw_events where app_id = ? and metadata_fingerprint != ? order by rowid limit 1;", new String[]{r9, string2}, -1L);
                                        if (j12 == -1) {
                                            if (jD != -1) {
                                                j13 = -1;
                                            } else {
                                                strArr2 = new String[]{r9, string2};
                                                str3 = "app_id = ? and metadata_fingerprint = ?";
                                            }
                                            cursorRawQuery = sQLiteDatabaseX.query("raw_events", new String[]{"rowid", "name", "timestamp", "data", "elapsed_time"}, str3, strArr2, null, null, "rowid", null);
                                            if (cursorRawQuery.moveToFirst()) {
                                                do {
                                                    j14 = cursorRawQuery.getLong(0);
                                                    byte[] blob = cursorRawQuery.getBlob(3);
                                                    long j15 = cursorRawQuery.getLong(4);
                                                    try {
                                                        zzhrVar = (com.google.android.gms.internal.measurement.zzhr) zzpk.R(com.google.android.gms.internal.measurement.zzhs.O(), blob);
                                                        zzhrVar.z(cursorRawQuery.getString(1));
                                                        long j16 = cursorRawQuery.getLong(2);
                                                        zzhrVar.m();
                                                        ((com.google.android.gms.internal.measurement.zzhs) zzhrVar.f11266b).V(j16);
                                                        zzhrVar.m();
                                                        ((com.google.android.gms.internal.measurement.zzhs) zzhrVar.f11266b).y(j15);
                                                        if (!zzpcVar.a(j14, (com.google.android.gms.internal.measurement.zzhs) zzhrVar.p())) {
                                                            break;
                                                        }
                                                    } catch (IOException e8) {
                                                        zzgu zzguVar2 = zzicVar.f13099f;
                                                        zzic.m(zzguVar2);
                                                        zzguVar2.f12942f.c(zzgu.o(r9), e8, "Data loss. Failed to merge raw event. appId");
                                                    }
                                                } while (cursorRawQuery.moveToNext());
                                            } else {
                                                zzgu zzguVar3 = zzicVar.f13099f;
                                                zzic.m(zzguVar3);
                                                zzguVar3.f12945i.b(zzgu.o(r9), "Raw event data disappeared while in transaction. appId");
                                            }
                                        } else {
                                            j13 = j12;
                                        }
                                        if (j13 == -1 && jD != -1) {
                                            jD = Math.min(j13, jD);
                                        } else if (j13 != -1) {
                                            jD = j13;
                                        }
                                        str3 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                        strArr2 = new String[]{r9, string2, String.valueOf(jD)};
                                        cursorRawQuery = sQLiteDatabaseX.query("raw_events", new String[]{"rowid", "name", "timestamp", "data", "elapsed_time"}, str3, strArr2, null, null, "rowid", null);
                                        if (cursorRawQuery.moveToFirst()) {
                                            do {
                                                j14 = cursorRawQuery.getLong(0);
                                                byte[] blob2 = cursorRawQuery.getBlob(3);
                                                long j17 = cursorRawQuery.getLong(4);
                                                zzhrVar = (com.google.android.gms.internal.measurement.zzhr) zzpk.R(com.google.android.gms.internal.measurement.zzhs.O(), blob2);
                                                zzhrVar.z(cursorRawQuery.getString(1));
                                                long j18 = cursorRawQuery.getLong(2);
                                                zzhrVar.m();
                                                ((com.google.android.gms.internal.measurement.zzhs) zzhrVar.f11266b).V(j18);
                                                zzhrVar.m();
                                                ((com.google.android.gms.internal.measurement.zzhs) zzhrVar.f11266b).y(j17);
                                                if (!zzpcVar.a(j14, (com.google.android.gms.internal.measurement.zzhs) zzhrVar.p())) {
                                                    break;
                                                    break;
                                                }
                                            } while (cursorRawQuery.moveToNext());
                                        } else {
                                            zzgu zzguVar4 = zzicVar.f13099f;
                                            zzic.m(zzguVar4);
                                            zzguVar4.f12945i.b(zzgu.o(r9), "Raw event data disappeared while in transaction. appId");
                                        }
                                    } catch (IOException e10) {
                                        zzgu zzguVar5 = zzicVar.f13099f;
                                        zzic.m(zzguVar5);
                                        zzguVar5.f12942f.c(zzgu.o(r9), e10, "Data loss. Failed to merge raw event metadata. appId");
                                    }
                                } else {
                                    zzgu zzguVar6 = zzicVar.f13099f;
                                    zzic.m(zzguVar6);
                                    zzguVar6.f12942f.b(zzgu.o(r9), "Raw event metadata record is missing. appId");
                                }
                            } catch (SQLiteException e11) {
                                e = e11;
                                zzgu zzguVar7 = zzicVar.f13099f;
                                zzic.m(zzguVar7);
                                zzguVar7.f12942f.c(zzgu.o(string), e, "Data loss. Error selecting raw event. appId");
                            }
                        }
                    } catch (SQLiteException e12) {
                        e = e12;
                        string = str;
                    }
                } else {
                    try {
                        if (j12 != -1) {
                            String str5 = str;
                            strArr = new String[]{str5, String.valueOf(j12)};
                            IsEmpty = str5;
                        } else {
                            str2 = str;
                            strArr = new String[]{str2};
                        }
                        if (j12 != -1) {
                            IsEmpty = str2;
                            str4 = " and rowid <= ?";
                        }
                        IsEmpty = str2;
                        StringBuilder sb3 = new StringBuilder(str4.length() + 84);
                        sb3.append("select metadata_fingerprint from raw_events where app_id = ?");
                        sb3.append(str4);
                        sb3.append(" order by rowid limit 1;");
                        cursorRawQuery = sQLiteDatabaseX.rawQuery(sb3.toString(), strArr);
                        if (cursorRawQuery.moveToFirst()) {
                            string2 = cursorRawQuery.getString(0);
                            cursorRawQuery.close();
                            r9 = IsEmpty;
                            cursorRawQuery = sQLiteDatabaseX.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{r9, string2}, null, null, "rowid", "2");
                            if (cursorRawQuery.moveToFirst()) {
                                zzgu zzguVar8 = zzicVar.f13099f;
                                zzic.m(zzguVar8);
                                zzguVar8.f12942f.b(zzgu.o(r9), "Raw event metadata record is missing. appId");
                            } else {
                                com.google.android.gms.internal.measurement.zzid zzidVar2 = (com.google.android.gms.internal.measurement.zzid) ((com.google.android.gms.internal.measurement.zzic) zzpk.R(com.google.android.gms.internal.measurement.zzid.d0(), cursorRawQuery.getBlob(0))).p();
                                if (cursorRawQuery.moveToNext()) {
                                    zzgu zzguVar9 = zzicVar.f13099f;
                                    zzic.m(zzguVar9);
                                    zzguVar9.f12945i.b(zzgu.o(r9), "Get multiple raw event metadata records, expected one. appId");
                                }
                                cursorRawQuery.close();
                                zzpcVar.f13584a = zzidVar2;
                                jD = D("select (rowid - 1) as max_rowid from raw_events where app_id = ? and metadata_fingerprint != ? order by rowid limit 1;", new String[]{r9, string2}, -1L);
                                if (j12 == -1) {
                                    if (jD != -1) {
                                        j13 = -1;
                                    } else {
                                        strArr2 = new String[]{r9, string2};
                                        str3 = "app_id = ? and metadata_fingerprint = ?";
                                    }
                                    cursorRawQuery = sQLiteDatabaseX.query("raw_events", new String[]{"rowid", "name", "timestamp", "data", "elapsed_time"}, str3, strArr2, null, null, "rowid", null);
                                    if (cursorRawQuery.moveToFirst()) {
                                        do {
                                            j14 = cursorRawQuery.getLong(0);
                                            byte[] blob3 = cursorRawQuery.getBlob(3);
                                            long j19 = cursorRawQuery.getLong(4);
                                            zzhrVar = (com.google.android.gms.internal.measurement.zzhr) zzpk.R(com.google.android.gms.internal.measurement.zzhs.O(), blob3);
                                            zzhrVar.z(cursorRawQuery.getString(1));
                                            long j110 = cursorRawQuery.getLong(2);
                                            zzhrVar.m();
                                            ((com.google.android.gms.internal.measurement.zzhs) zzhrVar.f11266b).V(j110);
                                            zzhrVar.m();
                                            ((com.google.android.gms.internal.measurement.zzhs) zzhrVar.f11266b).y(j19);
                                            if (!zzpcVar.a(j14, (com.google.android.gms.internal.measurement.zzhs) zzhrVar.p())) {
                                                break;
                                                break;
                                            }
                                        } while (cursorRawQuery.moveToNext());
                                    } else {
                                        zzgu zzguVar10 = zzicVar.f13099f;
                                        zzic.m(zzguVar10);
                                        zzguVar10.f12945i.b(zzgu.o(r9), "Raw event data disappeared while in transaction. appId");
                                    }
                                } else {
                                    j13 = j12;
                                }
                                if (j13 == -1) {
                                    if (j13 != -1) {
                                        jD = j13;
                                    }
                                } else if (j13 != -1) {
                                    jD = j13;
                                }
                                str3 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                strArr2 = new String[]{r9, string2, String.valueOf(jD)};
                                cursorRawQuery = sQLiteDatabaseX.query("raw_events", new String[]{"rowid", "name", "timestamp", "data", "elapsed_time"}, str3, strArr2, null, null, "rowid", null);
                                if (cursorRawQuery.moveToFirst()) {
                                    do {
                                        j14 = cursorRawQuery.getLong(0);
                                        byte[] blob4 = cursorRawQuery.getBlob(3);
                                        long j111 = cursorRawQuery.getLong(4);
                                        zzhrVar = (com.google.android.gms.internal.measurement.zzhr) zzpk.R(com.google.android.gms.internal.measurement.zzhs.O(), blob4);
                                        zzhrVar.z(cursorRawQuery.getString(1));
                                        long j112 = cursorRawQuery.getLong(2);
                                        zzhrVar.m();
                                        ((com.google.android.gms.internal.measurement.zzhs) zzhrVar.f11266b).V(j112);
                                        zzhrVar.m();
                                        ((com.google.android.gms.internal.measurement.zzhs) zzhrVar.f11266b).y(j111);
                                        if (!zzpcVar.a(j14, (com.google.android.gms.internal.measurement.zzhs) zzhrVar.p())) {
                                            break;
                                            break;
                                        }
                                    } while (cursorRawQuery.moveToNext());
                                } else {
                                    zzgu zzguVar11 = zzicVar.f13099f;
                                    zzic.m(zzguVar11);
                                    zzguVar11.f12945i.b(zzgu.o(r9), "Raw event data disappeared while in transaction. appId");
                                }
                            }
                        }
                    } catch (SQLiteException e13) {
                        e = e13;
                        string = IsEmpty;
                        zzgu zzguVar12 = zzicVar.f13099f;
                        zzic.m(zzguVar12);
                        zzguVar12.f12942f.c(zzgu.o(string), e, "Data loss. Error selecting raw event. appId");
                    }
                }
            } catch (SQLiteException e14) {
                e = e14;
                IsEmpty = str;
            }
        } finally {
            if (0 != 0) {
                cursorRawQuery.close();
            }
        }
    }

    public final void U() {
        h();
        X().beginTransaction();
    }

    public final void V() {
        h();
        X().setTransactionSuccessful();
    }

    public final void W() {
        h();
        X().endTransaction();
    }

    public final SQLiteDatabase X() {
        g();
        try {
            return this.f12663d.getWritableDatabase();
        } catch (SQLiteException e8) {
            zzgu zzguVar = this.f13202a.f13099f;
            zzic.m(zzguVar);
            zzguVar.f12945i.b(e8, "Error opening database");
            throw e8;
        }
    }

    public final void Y(String str) {
        zzbd zzbdVarG;
        I("events_snapshot", str);
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = X().query("events", (String[]) Collections.singletonList("name").toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
                if (cursorQuery.moveToFirst()) {
                    do {
                        String string = cursorQuery.getString(0);
                        if (string != null && (zzbdVarG = G("events", str, string)) != null) {
                            H("events_snapshot", zzbdVarG);
                        }
                    } while (cursorQuery.moveToNext());
                }
            } catch (SQLiteException e8) {
                zzgu zzguVar = this.f13202a.f13099f;
                zzic.m(zzguVar);
                zzguVar.f12942f.c(zzgu.o(str), e8, "Error creating snapshot. appId");
            }
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00d7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:7:0x0054  */
    /* JADX WARN: Code duplicated, block: B:9:0x005b  */
    public final void Z(String str) throws Throwable {
        boolean z11;
        zzbd zzbdVarG;
        ArrayList arrayList = new ArrayList(Arrays.asList("name", "lifetime_count"));
        zzbd zzbdVarG2 = G("events", str, "_f");
        zzbd zzbdVarG3 = G("events", str, "_v");
        I("events", str);
        Cursor cursorQuery = null;
        boolean z12 = false;
        try {
            cursorQuery = X().query("events_snapshot", (String[]) arrayList.toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
            if (cursorQuery.moveToFirst()) {
                boolean z13 = false;
                z11 = false;
                do {
                    try {
                        String string = cursorQuery.getString(0);
                        if (cursorQuery.getLong(1) >= 1) {
                            if ("_f".equals(string)) {
                                z13 = true;
                            } else if ("_v".equals(string)) {
                                z11 = true;
                            }
                        }
                        if (string != null && (zzbdVarG = G("events_snapshot", str, string)) != null) {
                            H("events", zzbdVarG);
                        }
                    } catch (SQLiteException e8) {
                        e = e8;
                        z12 = z13;
                        try {
                            zzgu zzguVar = this.f13202a.f13099f;
                            zzic.m(zzguVar);
                            zzguVar.f12942f.c(zzgu.o(str), e, "Error querying snapshot. appId");
                            z13 = z12;
                        } catch (Throwable th2) {
                            th = th2;
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            if (z12 && zzbdVarG2 != null) {
                                H("events", zzbdVarG2);
                            } else if (!z11 && zzbdVarG3 != null) {
                                H("events", zzbdVarG3);
                            }
                            I("events_snapshot", str);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        z12 = z13;
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        if (z12) {
                            if (!z11) {
                                H("events", zzbdVarG3);
                            }
                        } else if (!z11) {
                            H("events", zzbdVarG3);
                        }
                        I("events_snapshot", str);
                        throw th;
                    }
                } while (cursorQuery.moveToNext());
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                if (!z13 && zzbdVarG2 != null) {
                    H("events", zzbdVarG2);
                } else if (!z11 && zzbdVarG3 != null) {
                    H("events", zzbdVarG3);
                }
            } else {
                cursorQuery.close();
                if (zzbdVarG2 != null) {
                    H("events", zzbdVarG2);
                } else if (zzbdVarG3 != null) {
                    H("events", zzbdVarG3);
                }
            }
        } catch (SQLiteException e10) {
            e = e10;
            z11 = false;
        } catch (Throwable th4) {
            th = th4;
            z11 = false;
        }
        I("events_snapshot", str);
    }

    public final void a0(String str, String str2) {
        Preconditions.d(str);
        Preconditions.d(str2);
        g();
        h();
        try {
            X().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e8) {
            zzic zzicVar = this.f13202a;
            zzgu zzguVar = zzicVar.f13099f;
            zzic.m(zzguVar);
            zzguVar.f12942f.d("Error deleting user property. appId", zzgu.o(str), zzicVar.f13103j.c(str2), e8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009a  */
    /* JADX WARN: Code duplicated, block: B:43:? A[SYNTHETIC] */
    public final zzpn c0(String str, String str2) {
        Throwable th2;
        String str3;
        String str4;
        SQLiteException sQLiteException;
        Cursor cursorQuery;
        zzic zzicVar = this.f13202a;
        Preconditions.d(str);
        Preconditions.d(str2);
        g();
        h();
        Cursor cursor = null;
        try {
            cursorQuery = X().query("user_attributes", new String[]{"set_timestamp", "value", OSSHeaders.ORIGIN}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        long j11 = cursorQuery.getLong(0);
                        Object objT = t(cursorQuery, 1);
                        if (objT != null) {
                            str3 = str;
                            str4 = str2;
                            try {
                                zzpn zzpnVar = new zzpn(str3, cursorQuery.getString(2), str4, j11, objT);
                                if (cursorQuery.moveToNext()) {
                                    zzgu zzguVar = zzicVar.f13099f;
                                    zzic.m(zzguVar);
                                    zzguVar.f12942f.b(zzgu.o(str3), "Got multiple records for user property, expected one. appId");
                                }
                                cursorQuery.close();
                                return zzpnVar;
                            } catch (SQLiteException e8) {
                                e = e8;
                            }
                        }
                        sQLiteException = e;
                        zzgu zzguVar2 = zzicVar.f13099f;
                        zzic.m(zzguVar2);
                        zzguVar2.f12942f.d("Error querying user property. appId", zzgu.o(str3), zzicVar.f13103j.c(str4), sQLiteException);
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        throw th2;
                    }
                    cursor.close();
                    throw th2;
                }
            } catch (SQLiteException e10) {
                e = e10;
                str3 = str;
                str4 = str2;
            }
        } catch (SQLiteException e11) {
            str3 = str;
            str4 = str2;
            sQLiteException = e11;
            cursorQuery = null;
        } catch (Throwable th4) {
            th2 = th4;
            if (cursor != null) {
                throw th2;
            }
            cursor.close();
            throw th2;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List] */
    public final List d0(String str) {
        String str2;
        zzic zzicVar = this.f13202a;
        Preconditions.d(str);
        g();
        h();
        ?? arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                zzicVar.getClass();
                cursorQuery = X().query("user_attributes", new String[]{"name", OSSHeaders.ORIGIN, "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                try {
                    if (cursorQuery.moveToFirst()) {
                        while (true) {
                            String string = cursorQuery.getString(0);
                            String string2 = cursorQuery.getString(1);
                            if (string2 == null) {
                                string2 = BuildConfig.VERSION_NAME;
                            }
                            String str3 = string2;
                            long j11 = cursorQuery.getLong(2);
                            Object objT = t(cursorQuery, 3);
                            if (objT == null) {
                                zzgu zzguVar = zzicVar.f13099f;
                                zzic.m(zzguVar);
                                zzguVar.f12942f.b(zzgu.o(str), "Read invalid user property value, ignoring it. appId");
                                str2 = str;
                            } else {
                                str2 = str;
                                arrayList.add(new zzpn(str2, str3, string, j11, objT));
                            }
                            try {
                                if (!cursorQuery.moveToNext()) {
                                    break;
                                }
                                str = str2;
                            } catch (SQLiteException e8) {
                                e = e8;
                                zzgu zzguVar2 = zzicVar.f13099f;
                                zzic.m(zzguVar2);
                                zzguVar2.f12942f.c(zzgu.o(str2), e, "Error querying user properties. appId");
                                arrayList = Collections.EMPTY_LIST;
                            }
                        }
                    }
                } catch (SQLiteException e10) {
                    e = e10;
                    str2 = str;
                }
            } catch (SQLiteException e11) {
                e = e11;
                str2 = str;
            }
            return arrayList;
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x012c  */
    /* JADX WARN: Code duplicated, block: B:53:0x0133  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
    public final List e0(String str, String str2, String str3) throws Throwable {
        Cursor cursor;
        String str4;
        Cursor cursorQuery;
        String str5;
        zzic zzicVar = this.f13202a;
        Preconditions.d(str);
        g();
        h();
        ?? arrayList = new ArrayList();
        try {
            ArrayList arrayList2 = new ArrayList(3);
            String str6 = str;
            arrayList2.add(str6);
            StringBuilder sb2 = new StringBuilder("app_id=?");
            if (!TextUtils.isEmpty(str2)) {
                arrayList2.add(str2);
                sb2.append(" and origin=?");
            }
            if (!TextUtils.isEmpty(str3)) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + 1);
                sb3.append(str3);
                sb3.append("*");
                arrayList2.add(sb3.toString());
                sb2.append(" and name glob ?");
            }
            String[] strArr = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
            SQLiteDatabase sQLiteDatabaseX = X();
            String[] strArr2 = {"name", "set_timestamp", "value", OSSHeaders.ORIGIN};
            String string = sb2.toString();
            zzicVar.getClass();
            zzgu zzguVar = zzicVar.f13099f;
            cursorQuery = sQLiteDatabaseX.query("user_attributes", strArr2, string, strArr, null, null, "rowid", "1001");
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        str4 = str2;
                        while (true) {
                            try {
                                if (arrayList.size() >= 1000) {
                                    zzic.m(zzguVar);
                                    zzguVar.f12942f.b(1000, "Read more than the max allowed user properties, ignoring excess");
                                    break;
                                }
                                String string2 = cursorQuery.getString(0);
                                long j11 = cursorQuery.getLong(1);
                                Object objT = t(cursorQuery, 2);
                                String string3 = cursorQuery.getString(3);
                                if (objT == null) {
                                    try {
                                        zzic.m(zzguVar);
                                        zzguVar.f12942f.d("(2)Read invalid user property value, ignoring it", zzgu.o(str6), string3, str3);
                                        str5 = string3;
                                    } catch (SQLiteException e8) {
                                        e = e8;
                                        str5 = string3;
                                        cursor = cursorQuery;
                                        str4 = str5;
                                        try {
                                            zzgu zzguVar2 = zzicVar.f13099f;
                                            zzic.m(zzguVar2);
                                            zzguVar2.f12942f.d("(2)Error querying user properties", zzgu.o(str), str4, e);
                                            arrayList = Collections.EMPTY_LIST;
                                            cursorQuery = cursor;
                                            if (cursorQuery != null) {
                                                cursorQuery.close();
                                            }
                                            return arrayList;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            throw th;
                                        }
                                    }
                                } else {
                                    str5 = string3;
                                    arrayList.add(new zzpn(str, str5, string2, j11, objT));
                                }
                                try {
                                    if (!cursorQuery.moveToNext()) {
                                        break;
                                    }
                                    str6 = str;
                                    str4 = str5;
                                } catch (SQLiteException e10) {
                                    e = e10;
                                    cursor = cursorQuery;
                                    str4 = str5;
                                    zzgu zzguVar3 = zzicVar.f13099f;
                                    zzic.m(zzguVar3);
                                    zzguVar3.f12942f.d("(2)Error querying user properties", zzgu.o(str), str4, e);
                                    arrayList = Collections.EMPTY_LIST;
                                    cursorQuery = cursor;
                                }
                            } catch (SQLiteException e11) {
                                e = e11;
                                cursor = cursorQuery;
                                zzgu zzguVar4 = zzicVar.f13099f;
                                zzic.m(zzguVar4);
                                zzguVar4.f12942f.d("(2)Error querying user properties", zzgu.o(str), str4, e);
                                arrayList = Collections.EMPTY_LIST;
                                cursorQuery = cursor;
                                if (cursorQuery != null) {
                                    cursorQuery.close();
                                }
                                return arrayList;
                            }
                        }
                    }
                } catch (SQLiteException e12) {
                    e = e12;
                    str4 = str2;
                }
            } catch (Throwable th3) {
                th = th3;
                cursor = cursorQuery;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e13) {
            e = e13;
            str4 = str2;
            cursor = null;
        } catch (Throwable th4) {
            th = th4;
            cursor = null;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return arrayList;
    }

    public final void h0(String str, String str2) {
        Preconditions.d(str);
        Preconditions.d(str2);
        g();
        h();
        try {
            X().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e8) {
            zzic zzicVar = this.f13202a;
            zzgu zzguVar = zzicVar.f13099f;
            zzic.m(zzguVar);
            zzguVar.f12942f.d("Error deleting conditional property", zzgu.o(str), zzicVar.f13103j.c(str2), e8);
        }
    }

    public final List i0(String str, String str2, String str3) {
        Preconditions.d(str);
        g();
        h();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb2 = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb2.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb2.append(" and name glob ?");
        }
        return j0(sb2.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    @Override // com.google.android.gms.measurement.internal.zzos
    public final void j() {
        zzic zzicVar = this.f13202a;
        if (zzicVar.f13097d.r(null, zzfy.e1)) {
            zzhz zzhzVar = zzicVar.f13100g;
            zzic.m(zzhzVar);
            zzhzVar.p(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzas
                @Override // java.lang.Runnable
                public final void run() {
                    zzaw zzawVar = this.f12644a;
                    try {
                        SQLiteDatabase sQLiteDatabaseX = zzawVar.X();
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("elapsed_time", (Long) 0L);
                        sQLiteDatabaseX.update("raw_events", contentValues, null, null);
                    } catch (SQLiteException e8) {
                        zzgu zzguVar = zzawVar.f13202a.f13099f;
                        zzic.m(zzguVar);
                        zzguVar.f12942f.b(e8, "Failed to remove elapsed times from raw events table");
                    }
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    public final List j0(String str, String[] strArr) {
        zzic zzicVar = this.f13202a;
        g();
        h();
        ?? arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseX = X();
                String[] strArr2 = {"app_id", OSSHeaders.ORIGIN, "name", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"};
                zzicVar.getClass();
                cursorQuery = sQLiteDatabaseX.query("conditional_properties", strArr2, str, strArr, null, null, "rowid", "1001");
                if (cursorQuery.moveToFirst()) {
                    do {
                        if (arrayList.size() >= 1000) {
                            zzgu zzguVar = zzicVar.f13099f;
                            zzic.m(zzguVar);
                            zzguVar.f12942f.b(1000, "Read more than the max allowed conditional properties, ignoring extra");
                            break;
                        }
                        String string = cursorQuery.getString(0);
                        String string2 = cursorQuery.getString(1);
                        String string3 = cursorQuery.getString(2);
                        Object objT = t(cursorQuery, 3);
                        boolean z11 = cursorQuery.getInt(4) != 0;
                        String string4 = cursorQuery.getString(5);
                        long j11 = cursorQuery.getLong(6);
                        zzpk zzpkVar = this.f13552b.f13601g;
                        zzpg.U(zzpkVar);
                        byte[] blob = cursorQuery.getBlob(7);
                        Parcelable.Creator<zzbh> creator = zzbh.CREATOR;
                        zzbh zzbhVar = (zzbh) zzpkVar.J(blob, creator);
                        long j12 = cursorQuery.getLong(8);
                        zzpg.U(zzpkVar);
                        zzbh zzbhVar2 = (zzbh) zzpkVar.J(cursorQuery.getBlob(9), creator);
                        long j13 = cursorQuery.getLong(10);
                        long j14 = cursorQuery.getLong(11);
                        zzpg.U(zzpkVar);
                        arrayList.add(new zzah(string, string2, new zzpl(j13, objT, string3, string2), j12, z11, string4, zzbhVar, j11, zzbhVar2, j14, (zzbh) zzpkVar.J(cursorQuery.getBlob(12), creator)));
                    } while (cursorQuery.moveToNext());
                }
            } catch (SQLiteException e8) {
                zzgu zzguVar2 = zzicVar.f13099f;
                zzic.m(zzguVar2);
                zzguVar2.f12942f.b(e8, "Error querying conditional user property value");
                arrayList = Collections.EMPTY_LIST;
            }
            return arrayList;
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }

    public final long k(String str, com.google.android.gms.internal.measurement.zzib zzibVar, String str2, Map map, zzls zzlsVar, Long l9) {
        int iDelete;
        g();
        h();
        Preconditions.g(zzibVar);
        Preconditions.d(str);
        g();
        h();
        boolean zR = R();
        zzic zzicVar = this.f13202a;
        if (zR) {
            zzpg zzpgVar = this.f13552b;
            long jA = zzpgVar.f13603i.f13501f.a();
            DefaultClock defaultClock = zzicVar.f13104k;
            zzgu zzguVar = zzicVar.f13099f;
            defaultClock.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(jElapsedRealtime - jA) > ((Long) zzfy.M.a(null)).longValue()) {
                zzpgVar.f13603i.f13501f.b(jElapsedRealtime);
                g();
                h();
                if (R() && (iDelete = X().delete("upload_queue", K(), new String[0])) > 0) {
                    zzic.m(zzguVar);
                    zzguVar.f12949n.b(Integer.valueOf(iDelete), "Deleted stale MeasurementBatch rows from upload_queue. rowsDeleted");
                }
                Preconditions.d(str);
                g();
                h();
                try {
                    int iP = zzicVar.f13097d.p(str, zzfy.A);
                    if (iP > 0) {
                        X().delete("upload_queue", "rowid in (SELECT rowid FROM upload_queue WHERE app_id=? ORDER BY rowid DESC LIMIT -1 OFFSET ?)", new String[]{str, String.valueOf(iP)});
                    }
                } catch (SQLiteException e8) {
                    zzic.m(zzguVar);
                    zzguVar.f12942f.c(zzgu.o(str), e8, "Error deleting over the limit queued batches. appId");
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            String str3 = (String) entry.getKey();
            String str4 = (String) entry.getValue();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str4).length());
            sb2.append(str3);
            sb2.append("=");
            sb2.append(str4);
            arrayList.add(sb2.toString());
        }
        byte[] bArrB = zzibVar.b();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("measurement_batch", bArrB);
        contentValues.put("upload_uri", str2);
        contentValues.put("upload_headers", TextUtils.join("\r\n", arrayList));
        contentValues.put("upload_type", Integer.valueOf(zzlsVar.zza()));
        DefaultClock defaultClock2 = zzicVar.f13104k;
        zzgu zzguVar2 = zzicVar.f13099f;
        defaultClock2.getClass();
        contentValues.put("creation_timestamp", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("retry_count", (Integer) 0);
        if (l9 != null) {
            contentValues.put("associated_row_id", l9);
        }
        try {
            long jInsert = X().insert("upload_queue", null, contentValues);
            if (jInsert != -1) {
                return jInsert;
            }
            zzic.m(zzguVar2);
            zzguVar2.f12942f.b(str, "Failed to insert MeasurementBatch (got -1) to upload_queue. appId");
            return -1L;
        } catch (SQLiteException e10) {
            zzic.m(zzguVar2);
            zzguVar2.f12942f.c(str, e10, "Error storing MeasurementBatch to upload_queue. appId");
            return -1L;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00dc  */
    public final List l(String str, zzoo zzooVar, int i11) throws Throwable {
        List list;
        Preconditions.d(str);
        g();
        h();
        Cursor cursorQuery = null;
        try {
            SQLiteDatabase sQLiteDatabaseX = X();
            String[] strArr = {"rowId", "app_id", "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", "creation_timestamp", "associated_row_id", "last_upload_timestamp"};
            String strL = L(zzooVar.f13560a);
            String strK = K();
            StringBuilder sb2 = new StringBuilder(strL.length() + 17 + strK.length());
            sb2.append("app_id=?");
            sb2.append(strL);
            sb2.append(" AND NOT ");
            sb2.append(strK);
            cursorQuery = sQLiteDatabaseX.query("upload_queue", strArr, sb2.toString(), new String[]{str}, null, null, "creation_timestamp ASC", i11 > 0 ? String.valueOf(i11) : null);
            ArrayList arrayList = new ArrayList();
            while (cursorQuery.moveToNext()) {
                zzpj zzpjVarJ = J(str, cursorQuery.getLong(0), cursorQuery.getBlob(2), cursorQuery.getString(3), cursorQuery.getString(4), cursorQuery.getInt(5), cursorQuery.getInt(6), cursorQuery.getLong(7), cursorQuery.getLong(8), cursorQuery.getLong(9));
                if (zzpjVarJ != null) {
                    arrayList.add(zzpjVarJ);
                }
            }
            list = arrayList;
        } catch (SQLiteException e8) {
            try {
                zzgu zzguVar = this.f13202a.f13099f;
                zzic.m(zzguVar);
                zzguVar.f12942f.c(str, e8, "Error to querying MeasurementBatch from upload_queue. appId");
                list = Collections.EMPTY_LIST;
            } catch (Throwable th2) {
                th = th2;
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return list;
    }

    public final boolean m(String str) {
        zzls[] zzlsVarArr = {zzls.GOOGLE_SIGNAL};
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(zzlsVarArr[0].zza()));
        String strL = L(arrayList);
        String strK = K();
        return C(e.p(new StringBuilder((strL.length() + 61) + strK.length()), "SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=?", strL, " AND NOT ", strK), new String[]{str}) != 0;
    }

    public final zzar m0(long j11, String str, boolean z11, boolean z12, boolean z13, boolean z14) {
        return n0(j11, str, 1L, false, false, z11, false, z12, z13, z14);
    }

    public final void n(Long l9) {
        zzic zzicVar = this.f13202a;
        g();
        h();
        try {
            if (X().delete("upload_queue", "rowid=?", new String[]{l9.toString()}) != 1) {
                zzgu zzguVar = zzicVar.f13099f;
                zzic.m(zzguVar);
                zzguVar.f12945i.a("Deleted fewer rows from upload_queue than expected");
            }
        } catch (SQLiteException e8) {
            zzgu zzguVar2 = zzicVar.f13099f;
            zzic.m(zzguVar2);
            zzguVar2.f12942f.b(e8, "Failed to delete a MeasurementBatch in a upload_queue table");
            throw e8;
        }
    }

    public final zzar n0(long j11, String str, long j12, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17) {
        zzic zzicVar = this.f13202a;
        Preconditions.d(str);
        g();
        h();
        String[] strArr = {str};
        zzar zzarVar = new zzar();
        Cursor cursorQuery = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseX = X();
                cursorQuery = sQLiteDatabaseX.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count", "daily_realtime_dcu_count", "daily_registered_triggers_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (cursorQuery.moveToFirst()) {
                    if (cursorQuery.getLong(0) == j11) {
                        zzarVar.f12638b = cursorQuery.getLong(1);
                        zzarVar.f12637a = cursorQuery.getLong(2);
                        zzarVar.f12639c = cursorQuery.getLong(3);
                        zzarVar.f12640d = cursorQuery.getLong(4);
                        zzarVar.f12641e = cursorQuery.getLong(5);
                        zzarVar.f12642f = cursorQuery.getLong(6);
                        zzarVar.f12643g = cursorQuery.getLong(7);
                    }
                    if (z11) {
                        zzarVar.f12638b += j12;
                    }
                    if (z12) {
                        zzarVar.f12637a += j12;
                    }
                    if (z13) {
                        zzarVar.f12639c += j12;
                    }
                    if (z14) {
                        zzarVar.f12640d += j12;
                    }
                    if (z15) {
                        zzarVar.f12641e += j12;
                    }
                    if (z16) {
                        zzarVar.f12642f += j12;
                    }
                    if (z17) {
                        zzarVar.f12643g += j12;
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("day", Long.valueOf(j11));
                    contentValues.put("daily_public_events_count", Long.valueOf(zzarVar.f12637a));
                    contentValues.put("daily_events_count", Long.valueOf(zzarVar.f12638b));
                    contentValues.put("daily_conversions_count", Long.valueOf(zzarVar.f12639c));
                    contentValues.put("daily_error_events_count", Long.valueOf(zzarVar.f12640d));
                    contentValues.put("daily_realtime_events_count", Long.valueOf(zzarVar.f12641e));
                    contentValues.put("daily_realtime_dcu_count", Long.valueOf(zzarVar.f12642f));
                    contentValues.put("daily_registered_triggers_count", Long.valueOf(zzarVar.f12643g));
                    sQLiteDatabaseX.update("apps", contentValues, "app_id=?", strArr);
                } else {
                    zzgu zzguVar = zzicVar.f13099f;
                    zzic.m(zzguVar);
                    zzguVar.f12945i.b(zzgu.o(str), "Not updating daily counts, app is not known. appId");
                }
            } catch (SQLiteException e8) {
                zzgu zzguVar2 = zzicVar.f13099f;
                zzic.m(zzguVar2);
                zzguVar2.f12942f.c(zzgu.o(str), e8, "Error updating daily counts. appId");
            }
            return zzarVar;
        } finally {
            if (0 != 0) {
                cursorQuery.close();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v3 */
    public final String o() throws Throwable {
        SQLiteException e8;
        Cursor cursorRawQuery;
        SQLiteDatabase sQLiteDatabaseX = X();
        ?? r9 = 0;
        try {
            try {
                cursorRawQuery = sQLiteDatabaseX.rawQuery("select app_id from queue order by has_realtime desc, rowid asc limit 1;", null);
                try {
                    if (cursorRawQuery.moveToFirst()) {
                        String string = cursorRawQuery.getString(0);
                        cursorRawQuery.close();
                        return string;
                    }
                } catch (SQLiteException e10) {
                    e8 = e10;
                    zzgu zzguVar = this.f13202a.f13099f;
                    zzic.m(zzguVar);
                    zzguVar.f12942f.b(e8, "Database error getting next bundle app id");
                }
            } catch (Throwable th2) {
                r9 = sQLiteDatabaseX;
                th = th2;
                if (r9 != 0) {
                    r9.close();
                }
                throw th;
            }
        } catch (SQLiteException e11) {
            e8 = e11;
            cursorRawQuery = null;
        } catch (Throwable th3) {
            th = th3;
            if (r9 != 0) {
                r9.close();
            }
            throw th;
        }
        if (cursorRawQuery != null) {
            cursorRawQuery.close();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0086  */
    /* JADX WARN: Code duplicated, block: B:36:? A[SYNTHETIC] */
    public final zzaq o0(String str) throws Throwable {
        Throwable th2;
        Cursor cursorQuery;
        zzic zzicVar = this.f13202a;
        Preconditions.d(str);
        g();
        h();
        Cursor cursor = null;
        try {
            cursorQuery = X().query("apps", new String[]{"remote_config", "config_last_modified_time", "e_tag"}, "app_id=?", new String[]{str}, null, null, null);
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        byte[] blob = cursorQuery.getBlob(0);
                        String string = cursorQuery.getString(1);
                        String string2 = cursorQuery.getString(2);
                        if (cursorQuery.moveToNext()) {
                            zzgu zzguVar = zzicVar.f13099f;
                            zzic.m(zzguVar);
                            zzguVar.f12942f.b(zzgu.o(str), "Got multiple records for app config, expected one. appId");
                        }
                        if (blob != null) {
                            zzaq zzaqVar = new zzaq(string, string2, blob);
                            cursorQuery.close();
                            return zzaqVar;
                        }
                    }
                } catch (SQLiteException e8) {
                    e = e8;
                    zzgu zzguVar2 = zzicVar.f13099f;
                    zzic.m(zzguVar2);
                    zzguVar2.f12942f.c(zzgu.o(str), e, "Error querying remote config. appId");
                }
            } catch (Throwable th3) {
                th2 = th3;
                cursor = cursorQuery;
                if (cursor != null) {
                    throw th2;
                }
                cursor.close();
                throw th2;
            }
        } catch (SQLiteException e10) {
            e = e10;
            cursorQuery = null;
        } catch (Throwable th4) {
            th2 = th4;
            if (cursor != null) {
                throw th2;
            }
            cursor.close();
            throw th2;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    public final void p(long j11) {
        g();
        h();
        try {
            if (X().delete("queue", "rowid=?", new String[]{String.valueOf(j11)}) == 1) {
            } else {
                throw new SQLiteException("Deleted fewer rows from queue than expected");
            }
        } catch (SQLiteException e8) {
            zzgu zzguVar = this.f13202a.f13099f;
            zzic.m(zzguVar);
            zzguVar.f12942f.b(e8, "Failed to delete a bundle in a queue table");
            throw e8;
        }
    }

    public final void p0(com.google.android.gms.internal.measurement.zzid zzidVar, boolean z11) {
        g();
        h();
        Preconditions.d(zzidVar.y());
        Preconditions.j(zzidVar.m2());
        q();
        zzic zzicVar = this.f13202a;
        DefaultClock defaultClock = zzicVar.f13104k;
        zzgu zzguVar = zzicVar.f13099f;
        defaultClock.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jN2 = zzidVar.n2();
        zzfx zzfxVar = zzfy.R;
        if (jN2 < jCurrentTimeMillis - ((Long) zzfxVar.a(null)).longValue() || zzidVar.n2() > ((Long) zzfxVar.a(null)).longValue() + jCurrentTimeMillis) {
            zzic.m(zzguVar);
            zzguVar.f12945i.d("Storing bundle outside of the max uploading time span. appId, now, timestamp", zzgu.o(zzidVar.y()), Long.valueOf(jCurrentTimeMillis), Long.valueOf(zzidVar.n2()));
        }
        byte[] bArrB = zzidVar.b();
        try {
            zzpk zzpkVar = this.f13552b.f13601g;
            zzpg.U(zzpkVar);
            byte[] bArrQ = zzpkVar.Q(bArrB);
            zzic.m(zzguVar);
            zzguVar.f12949n.b(Integer.valueOf(bArrQ.length), "Saving bundle, size");
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", zzidVar.y());
            contentValues.put("bundle_end_timestamp", Long.valueOf(zzidVar.n2()));
            contentValues.put("data", bArrQ);
            contentValues.put("has_realtime", Integer.valueOf(z11 ? 1 : 0));
            if (zzidVar.y0()) {
                contentValues.put("retry_count", Integer.valueOf(zzidVar.z0()));
            }
            try {
                if (X().insert("queue", null, contentValues) == -1) {
                    zzic.m(zzguVar);
                    zzguVar.f12942f.b(zzgu.o(zzidVar.y()), "Failed to insert bundle (got -1). appId");
                }
            } catch (SQLiteException e8) {
                zzic.m(zzguVar);
                zzguVar.f12942f.c(zzgu.o(zzidVar.y()), e8, "Error storing bundle. appId");
            }
        } catch (IOException e10) {
            zzic.m(zzguVar);
            zzguVar.f12942f.c(zzgu.o(zzidVar.y()), e10, "Data loss. Failed to serialize bundle. appId");
        }
    }

    public final void q() {
        g();
        h();
        if (R()) {
            zzpg zzpgVar = this.f13552b;
            long jA = zzpgVar.f13603i.f13500e.a();
            zzic zzicVar = this.f13202a;
            zzicVar.f13104k.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(jElapsedRealtime - jA) > ((Long) zzfy.M.a(null)).longValue()) {
                zzpgVar.f13603i.f13500e.b(jElapsedRealtime);
                g();
                h();
                if (R()) {
                    SQLiteDatabase sQLiteDatabaseX = X();
                    zzicVar.f13104k.getClass();
                    int iDelete = sQLiteDatabaseX.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(((Long) zzfy.R.a(null)).longValue())});
                    if (iDelete > 0) {
                        zzgu zzguVar = zzicVar.f13099f;
                        zzic.m(zzguVar);
                        zzguVar.f12949n.b(Integer.valueOf(iDelete), "Deleted stale rows. rowsDeleted");
                    }
                }
            }
        }
    }

    public final void r(ArrayList arrayList) {
        g();
        h();
        Preconditions.g(arrayList);
        if (arrayList.size() == 0) {
            throw new IllegalArgumentException("Given Integer is zero");
        }
        if (R()) {
            String strJoin = TextUtils.join(",", arrayList);
            String strU = p.u(new StringBuilder(String.valueOf(strJoin).length() + 2), "(", strJoin, ")");
            long jC = C(p.u(new StringBuilder(strU.length() + 80), "SELECT COUNT(1) FROM queue WHERE rowid IN ", strU, " AND retry_count =  2147483647 LIMIT 1"), null);
            zzic zzicVar = this.f13202a;
            if (jC > 0) {
                zzgu zzguVar = zzicVar.f13099f;
                zzic.m(zzguVar);
                zzguVar.f12945i.a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase sQLiteDatabaseX = X();
                StringBuilder sb2 = new StringBuilder(strU.length() + 127);
                sb2.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb2.append(strU);
                sb2.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
                sQLiteDatabaseX.execSQL(sb2.toString());
            } catch (SQLiteException e8) {
                zzgu zzguVar2 = zzicVar.f13099f;
                zzic.m(zzguVar2);
                zzguVar2.f12942f.b(e8, "Error incrementing retry count. error");
            }
        }
    }

    public final void s(Long l9) {
        g();
        h();
        if (R()) {
            StringBuilder sb2 = new StringBuilder(l9.toString().length() + 86);
            sb2.append("SELECT COUNT(1) FROM upload_queue WHERE rowid = ");
            sb2.append(l9);
            sb2.append(" AND retry_count =  2147483647 LIMIT 1");
            long jC = C(sb2.toString(), null);
            zzic zzicVar = this.f13202a;
            if (jC > 0) {
                zzgu zzguVar = zzicVar.f13099f;
                zzic.m(zzguVar);
                zzguVar.f12945i.a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase sQLiteDatabaseX = X();
                zzicVar.f13104k.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                StringBuilder sb3 = new StringBuilder(String.valueOf(jCurrentTimeMillis).length() + 60);
                sb3.append(" SET retry_count = retry_count + 1, last_upload_timestamp = ");
                sb3.append(jCurrentTimeMillis);
                String string = sb3.toString();
                StringBuilder sb4 = new StringBuilder(string.length() + 34 + l9.toString().length() + 29);
                sb4.append("UPDATE upload_queue");
                sb4.append(string);
                sb4.append(" WHERE rowid = ");
                sb4.append(l9);
                sb4.append(" AND retry_count < 2147483647");
                sQLiteDatabaseX.execSQL(sb4.toString());
            } catch (SQLiteException e8) {
                zzgu zzguVar2 = zzicVar.f13099f;
                zzic.m(zzguVar2);
                zzguVar2.f12942f.b(e8, "Error incrementing retry count. error");
            }
        }
    }

    public final Object t(Cursor cursor, int i11) {
        int type = cursor.getType(i11);
        zzic zzicVar = this.f13202a;
        if (type == 0) {
            zzgu zzguVar = zzicVar.f13099f;
            zzic.m(zzguVar);
            zzguVar.f12942f.a("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i11));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i11));
        }
        if (type == 3) {
            return cursor.getString(i11);
        }
        if (type != 4) {
            zzgu zzguVar2 = zzicVar.f13099f;
            zzic.m(zzguVar2);
            zzguVar2.f12942f.b(Integer.valueOf(type), "Loaded invalid unknown value type, ignoring it");
            return null;
        }
        zzgu zzguVar3 = zzicVar.f13099f;
        zzic.m(zzguVar3);
        zzguVar3.f12942f.a("Loaded invalid blob type value, ignoring it");
        return null;
    }

    public final boolean v(String str, String str2) {
        return C("select count(1) from raw_events where app_id = ? and name = ?", new String[]{str, str2}) > 0;
    }

    public final void w(List list) {
        Preconditions.g(list);
        g();
        h();
        StringBuilder sb2 = new StringBuilder("rowid in (");
        for (int i11 = 0; i11 < list.size(); i11++) {
            if (i11 != 0) {
                sb2.append(",");
            }
            sb2.append(((Long) list.get(i11)).longValue());
        }
        sb2.append(")");
        int iDelete = X().delete("raw_events", sb2.toString(), null);
        if (iDelete != list.size()) {
            zzgu zzguVar = this.f13202a.f13099f;
            zzic.m(zzguVar);
            zzguVar.f12942f.c(Integer.valueOf(iDelete), Integer.valueOf(list.size()), "Deleted fewer rows from raw events table than expected");
        }
    }

    public final long x(String str) {
        Preconditions.d(str);
        return D("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    public final void y(String str, Long l9, long j11, com.google.android.gms.internal.measurement.zzhs zzhsVar) {
        g();
        h();
        Preconditions.g(zzhsVar);
        Preconditions.d(str);
        byte[] bArrB = zzhsVar.b();
        zzic zzicVar = this.f13202a;
        zzgu zzguVar = zzicVar.f13099f;
        zzgu zzguVar2 = zzicVar.f13099f;
        zzic.m(zzguVar);
        zzguVar.f12949n.c(zzicVar.f13103j.a(str), Integer.valueOf(bArrB.length), "Saving complex main event, appId, data size");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l9);
        contentValues.put("children_to_process", Long.valueOf(j11));
        contentValues.put("main_event", bArrB);
        try {
            if (X().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                zzic.m(zzguVar2);
                zzguVar2.f12942f.b(zzgu.o(str), "Failed to insert complex main event (got -1). appId");
            }
        } catch (SQLiteException e8) {
            zzic.m(zzguVar2);
            zzguVar2.f12942f.c(zzgu.o(str), e8, "Error storing complex main event. appId");
        }
    }

    /* JADX WARN: Code duplicated, block: B:122:0x0114 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x0114 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x002e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:? A[LOOP:2: B:51:0x00fa->B:127:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:53:0x0100  */
    public final void z(String str, Long l9, String str2, Bundle bundle) throws Throwable {
        zzgu zzguVar;
        Bundle bundle2;
        long j11;
        String str3;
        ContentValues contentValues;
        zzgu zzguVar2;
        com.google.android.gms.internal.measurement.zzid zzidVar;
        Iterator<E> it;
        zzaw zzawVar = this;
        String str4 = str;
        Preconditions.g(bundle);
        zzawVar.g();
        zzawVar.h();
        zzau zzauVar = l9 != null ? new zzau(zzawVar, str4, l9.longValue()) : new zzau(zzawVar, str4);
        List<zzat> listA = zzauVar.a();
        while (!listA.isEmpty()) {
            for (zzat zzatVar : listA) {
                boolean zIsEmpty = TextUtils.isEmpty(str2);
                zzic zzicVar = zzawVar.f13202a;
                try {
                    if (!zIsEmpty) {
                        Cursor cursor = null;
                        com.google.android.gms.internal.measurement.zzid zzidVar2 = null;
                        Cursor cursor2 = null;
                        try {
                            try {
                                Cursor cursorQuery = zzawVar.X().query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{str4, Long.toString(zzatVar.f12646b)}, null, null, "rowid", "2");
                                try {
                                    try {
                                        if (cursorQuery.moveToFirst()) {
                                            try {
                                                zzidVar = (com.google.android.gms.internal.measurement.zzid) ((com.google.android.gms.internal.measurement.zzic) zzpk.R(com.google.android.gms.internal.measurement.zzid.d0(), cursorQuery.getBlob(0))).p();
                                                try {
                                                    if (cursorQuery.moveToNext()) {
                                                        zzgu zzguVar3 = zzicVar.f13099f;
                                                        zzic.m(zzguVar3);
                                                        zzguVar3.f12945i.b(zzgu.o(str4), "Get multiple raw event metadata records, expected one. appId");
                                                    }
                                                    cursorQuery.close();
                                                    cursorQuery.close();
                                                } catch (SQLiteException e8) {
                                                    e = e8;
                                                    cursor2 = cursorQuery;
                                                    zzgu zzguVar4 = zzicVar.f13099f;
                                                    zzic.m(zzguVar4);
                                                    zzguVar4.f12942f.c(zzgu.o(str4), e, "Data loss. Error selecting raw event. appId");
                                                    if (cursor2 != null) {
                                                        cursor2.close();
                                                    }
                                                }
                                                zzidVar2 = zzidVar;
                                            } catch (IOException e10) {
                                                zzgu zzguVar5 = zzicVar.f13099f;
                                                zzic.m(zzguVar5);
                                                zzguVar5.f12942f.c(zzgu.o(str4), e10, "Data loss. Failed to merge raw event metadata. appId");
                                                cursorQuery.close();
                                            }
                                            if (zzidVar2 != null) {
                                                it = zzidVar2.f2().iterator();
                                                while (true) {
                                                    if (it.hasNext()) {
                                                        if (((com.google.android.gms.internal.measurement.zziu) it.next()).A().equals(str2)) {
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            zzgu zzguVar6 = zzicVar.f13099f;
                                            zzic.m(zzguVar6);
                                            zzguVar6.f12942f.b(zzgu.o(str4), "Raw event metadata record is missing. appId");
                                        }
                                        cursorQuery.close();
                                    } catch (Throwable th2) {
                                        th = th2;
                                        cursor = cursorQuery;
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        throw th;
                                    }
                                } catch (SQLiteException e11) {
                                    e = e11;
                                    zzidVar = null;
                                }
                            } catch (SQLiteException e12) {
                                e = e12;
                                zzidVar = null;
                            }
                            if (zzidVar2 != null) {
                                it = zzidVar2.f2().iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if (((com.google.android.gms.internal.measurement.zziu) it.next()).A().equals(str2)) {
                                        }
                                    }
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    }
                    long jUpdate = X().update("raw_events", contentValues, "rowid = ?", new String[]{String.valueOf(j11)});
                    if (jUpdate != 1) {
                        zzic.m(zzguVar);
                        zzguVar2 = zzguVar;
                        try {
                            zzguVar2.f12942f.c(zzgu.o(str3), Long.valueOf(jUpdate), "Failed to update raw event. appId, updatedRows");
                        } catch (SQLiteException e13) {
                            e = e13;
                            zzic.m(zzguVar2);
                            zzguVar2.f12942f.c(zzgu.o(str3), e, "Error updating raw event. appId");
                        }
                    }
                } catch (SQLiteException e14) {
                    e = e14;
                    zzguVar2 = zzguVar;
                }
                zzpg zzpgVar = zzawVar.f13552b;
                zzpk zzpkVar = zzpgVar.f13601g;
                zzpg.U(zzpkVar);
                com.google.android.gms.internal.measurement.zzhs zzhsVar = zzatVar.f12648d;
                Bundle bundle3 = new Bundle();
                for (com.google.android.gms.internal.measurement.zzhw zzhwVar : zzhsVar.A()) {
                    if (zzhwVar.G()) {
                        bundle3.putDouble(zzhwVar.z(), zzhwVar.H());
                    } else if (zzhwVar.E()) {
                        bundle3.putFloat(zzhwVar.z(), zzhwVar.F());
                    } else if (zzhwVar.C()) {
                        bundle3.putLong(zzhwVar.z(), zzhwVar.D());
                    } else if (zzhwVar.A()) {
                        bundle3.putString(zzhwVar.z(), zzhwVar.B());
                    } else if (zzhwVar.I().isEmpty()) {
                        zzgu zzguVar7 = zzpkVar.f13202a.f13099f;
                        zzic.m(zzguVar7);
                        zzguVar7.f12942f.b(zzhwVar, "Unexpected parameter type for parameter");
                    } else {
                        bundle3.putParcelableArray(zzhwVar.z(), zzpk.T(zzhwVar.I()));
                    }
                }
                String string = bundle3.getString("_o");
                bundle3.remove("_o");
                String strD = zzhsVar.D();
                if (string == null) {
                    string = BuildConfig.VERSION_NAME;
                }
                zzgv zzgvVar = new zzgv(zzhsVar.F(), zzhsVar.N(), bundle3, strD, string);
                zzpp zzppVar = zzicVar.f13102i;
                zzguVar = zzicVar.f13099f;
                zzic.k(zzppVar);
                if (strD.equals("_cmp")) {
                    bundle2 = new Bundle(bundle);
                    for (String str5 : bundle.keySet()) {
                        zzat zzatVar2 = zzatVar;
                        if (str5.startsWith("gad_")) {
                            bundle2.remove(str5);
                        }
                        zzatVar = zzatVar2;
                    }
                } else {
                    bundle2 = bundle;
                }
                zzat zzatVar3 = zzatVar;
                zzppVar.t(bundle3, bundle2);
                zzbc zzbcVar = new zzbc(zzawVar.f13202a, zzgvVar.f12951b, str4, zzhsVar.D(), zzhsVar.F(), zzhsVar.N(), zzhsVar.H(), bundle3);
                j11 = zzatVar3.f12645a;
                long j12 = zzatVar3.f12646b;
                boolean z11 = zzatVar3.f12647c;
                g();
                h();
                str3 = zzbcVar.f12682a;
                Preconditions.d(str3);
                zzpk zzpkVar2 = zzpgVar.f13601g;
                zzpg.U(zzpkVar2);
                byte[] bArrB = zzpkVar2.G(zzbcVar).b();
                contentValues = new ContentValues();
                contentValues.put("app_id", str3);
                contentValues.put("name", zzbcVar.f12683b);
                contentValues.put("timestamp", Long.valueOf(zzbcVar.f12685d));
                contentValues.put("metadata_fingerprint", Long.valueOf(j12));
                contentValues.put("data", bArrB);
                contentValues.put("realtime", Integer.valueOf(z11 ? 1 : 0));
                contentValues.put("elapsed_time", Long.valueOf(zzbcVar.f12686e));
                zzawVar = this;
                str4 = str;
            }
            listA = zzauVar.a();
            zzawVar = this;
            str4 = str;
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x012b  */
    public final zzbd G(String str, String str2, String str3) {
        Cursor cursorQuery;
        Boolean boolValueOf;
        zzic zzicVar = this.f13202a;
        Preconditions.d(str2);
        Preconditions.d(str3);
        g();
        h();
        Cursor cursor = null;
        try {
            cursorQuery = X().query(str, (String[]) new ArrayList(Arrays.asList("lifetime_count", "current_bundle_count", "last_fire_timestamp", "last_bundled_timestamp", "last_bundled_day", "last_sampled_complex_event_id", shrCcjmOhAmRC.kDtVMuZAQnf, "last_exempt_from_sampling", "current_session_count")).toArray(new String[0]), "app_id=? and name=?", new String[]{str2, str3}, null, null, null);
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        long j11 = cursorQuery.getLong(0);
                        long j12 = cursorQuery.getLong(1);
                        long j13 = cursorQuery.getLong(2);
                        long j14 = cursorQuery.isNull(3) ? 0L : cursorQuery.getLong(3);
                        Long lValueOf = cursorQuery.isNull(4) ? null : Long.valueOf(cursorQuery.getLong(4));
                        Long lValueOf2 = cursorQuery.isNull(5) ? null : Long.valueOf(cursorQuery.getLong(5));
                        Long lValueOf3 = cursorQuery.isNull(6) ? null : Long.valueOf(cursorQuery.getLong(6));
                        if (cursorQuery.isNull(7)) {
                            boolValueOf = null;
                        } else {
                            boolValueOf = Boolean.valueOf(cursorQuery.getLong(7) == 1);
                        }
                        zzbd zzbdVar = new zzbd(str2, str3, j11, j12, cursorQuery.isNull(8) ? 0L : cursorQuery.getLong(8), j13, j14, lValueOf, lValueOf2, lValueOf3, boolValueOf);
                        if (cursorQuery.moveToNext()) {
                            zzgu zzguVar = zzicVar.f13099f;
                            zzic.m(zzguVar);
                            zzguVar.f12942f.b(zzgu.o(str2), "Got multiple records for event aggregates, expected one. appId");
                        }
                        cursorQuery.close();
                        return zzbdVar;
                    }
                } catch (SQLiteException e8) {
                    e = e8;
                    zzgu zzguVar2 = zzicVar.f13099f;
                    zzic.m(zzguVar2);
                    zzguVar2.f12942f.d("Error querying events. appId", zzgu.o(str2), zzicVar.f13103j.a(str3), e);
                }
            } catch (Throwable th2) {
                th = th2;
                cursor = cursorQuery;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e10) {
            e = e10;
            cursorQuery = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    public final void H(String str, zzbd zzbdVar) {
        zzic zzicVar = this.f13202a;
        Preconditions.g(zzbdVar);
        g();
        h();
        ContentValues contentValues = new ContentValues();
        String str2 = zzbdVar.f12689a;
        contentValues.put("app_id", str2);
        contentValues.put("name", zzbdVar.f12690b);
        contentValues.put(IMCc.KNMioZDUsT, Long.valueOf(zzbdVar.f12691c));
        contentValues.put("current_bundle_count", Long.valueOf(zzbdVar.f12692d));
        contentValues.put("last_fire_timestamp", Long.valueOf(zzbdVar.f12694f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(zzbdVar.f12695g));
        contentValues.put("last_bundled_day", zzbdVar.f12696h);
        contentValues.put("last_sampled_complex_event_id", zzbdVar.f12697i);
        contentValues.put("last_sampling_rate", zzbdVar.f12698j);
        contentValues.put("current_session_count", Long.valueOf(zzbdVar.f12693e));
        Boolean bool = zzbdVar.f12699k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (X().insertWithOnConflict(str, null, contentValues, 5) == -1) {
                zzgu zzguVar = zzicVar.f13099f;
                zzic.m(zzguVar);
                zzguVar.f12942f.b(zzgu.o(str2), "Failed to insert/update event aggregates (got -1). appId");
            }
        } catch (SQLiteException e8) {
            zzgu zzguVar2 = zzicVar.f13099f;
            zzic.m(zzguVar2);
            zzguVar2.f12942f.c(zzgu.o(str2), e8, "Error storing event aggregates. appId");
        }
    }

    public final boolean b0(zzpn zzpnVar) {
        String str = zzpnVar.f13641b;
        g();
        h();
        String str2 = zzpnVar.f13640a;
        String str3 = zzpnVar.f13642c;
        zzpn zzpnVarC0 = c0(str2, str3);
        zzic zzicVar = this.f13202a;
        if (zzpnVarC0 == null) {
            if (zzpp.h0(str3)) {
                if (C("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{str2}) >= Math.max(Math.min(zzicVar.f13097d.p(str2, zzfy.V), 100), 25)) {
                    return false;
                }
            } else if (!"_npa".equals(str3)) {
                long jC = C("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{str2, str});
                zzicVar.getClass();
                if (jC >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str2);
        contentValues.put(OSSHeaders.ORIGIN, str);
        contentValues.put(DytezVyM.DHKZUSViDCxt, str3);
        contentValues.put("set_timestamp", Long.valueOf(zzpnVar.f13643d));
        T(contentValues, zzpnVar.f13644e);
        try {
            if (X().insertWithOnConflict("user_attributes", null, contentValues, 5) != -1) {
                return true;
            }
            zzgu zzguVar = zzicVar.f13099f;
            zzic.m(zzguVar);
            zzguVar.f12942f.b(zzgu.o(str2), "Failed to insert/update user property (got -1). appId");
            return true;
        } catch (SQLiteException e8) {
            zzgu zzguVar2 = zzicVar.f13099f;
            zzic.m(zzguVar2);
            zzguVar2.f12942f.c(zzgu.o(str2), e8, "Error storing user property. appId");
            return true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0115  */
    /* JADX WARN: Code duplicated, block: B:39:0x011b  */
    /* JADX WARN: Not initialized variable reg: 10, insn: 0x00f5: MOVE (r9 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]) (LINE:244), block:B:29:0x00f5 */
    public final zzah g0(String str, String str2) throws Throwable {
        String str3;
        Cursor cursorQuery;
        Cursor cursor;
        zzic zzicVar = this.f13202a;
        Preconditions.d(str);
        Preconditions.d(str2);
        g();
        h();
        Cursor cursor2 = null;
        try {
            try {
                cursorQuery = X().query("conditional_properties", new String[]{OSSHeaders.ORIGIN, "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", FpIL.wvt, "time_to_live", "expired_event"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
                try {
                    if (!cursorQuery.moveToFirst()) {
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return null;
                    }
                    String string = cursorQuery.getString(0);
                    if (string == null) {
                        string = BuildConfig.VERSION_NAME;
                    }
                    String str4 = string;
                    Object objT = t(cursorQuery, 1);
                    boolean z11 = cursorQuery.getInt(2) != 0;
                    String string2 = cursorQuery.getString(3);
                    long j11 = cursorQuery.getLong(4);
                    zzpk zzpkVar = this.f13552b.f13601g;
                    zzpg.U(zzpkVar);
                    byte[] blob = cursorQuery.getBlob(5);
                    Parcelable.Creator<zzbh> creator = zzbh.CREATOR;
                    zzbh zzbhVar = (zzbh) zzpkVar.J(blob, creator);
                    long j12 = cursorQuery.getLong(6);
                    zzpg.U(zzpkVar);
                    zzbh zzbhVar2 = (zzbh) zzpkVar.J(cursorQuery.getBlob(7), creator);
                    long j13 = cursorQuery.getLong(8);
                    long j14 = cursorQuery.getLong(9);
                    zzpg.U(zzpkVar);
                    str3 = str2;
                    try {
                        zzah zzahVar = new zzah(str, str4, new zzpl(j13, objT, str3, str4), j12, z11, string2, zzbhVar, j11, zzbhVar2, j14, (zzbh) zzpkVar.J(cursorQuery.getBlob(10), creator));
                        if (cursorQuery.moveToNext()) {
                            zzgu zzguVar = zzicVar.f13099f;
                            zzic.m(zzguVar);
                            zzguVar.f12942f.c(zzgu.o(str), zzicVar.f13103j.c(str3), "Got multiple records for conditional property, expected one");
                        }
                        cursorQuery.close();
                        return zzahVar;
                    } catch (SQLiteException e8) {
                        e = e8;
                    }
                } catch (SQLiteException e10) {
                    e = e10;
                    str3 = str2;
                }
            } catch (Throwable th2) {
                th = th2;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e11) {
            e = e11;
            str3 = str2;
            cursorQuery = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
        zzgu zzguVar2 = zzicVar.f13099f;
        zzic.m(zzguVar2);
        zzguVar2.f12942f.d("Error querying conditional property", zzgu.o(str), zzicVar.f13103j.c(str3), e);
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:131:0x0407  */
    public final zzh k0(String str) {
        Cursor cursorQuery;
        Boolean boolValueOf;
        String string;
        zzic zzicVar = this.f13202a;
        Preconditions.d(str);
        g();
        h();
        Cursor cursor = null;
        try {
            cursorQuery = X().query("apps", new String[]{"app_instance_id", "gmp_app_id", "resettable_device_id_hash", "last_bundle_index", "last_bundle_start_timestamp", "last_bundle_end_timestamp", "app_version", "app_store", "gmp_version", "dev_cert_hash", FpIL.qSpErQPQhquMUG, "day", "daily_public_events_count", "daily_events_count", "daily_conversions_count", "config_fetched_time", "failed_config_fetch_time", "app_version_int", "firebase_instance_id", "daily_error_events_count", "daily_realtime_events_count", "health_monitor_sample", "android_id", "adid_reporting_enabled", "admob_app_id", "dynamite_version", "safelisted_events", "ga_app_id", "session_stitching_token", "sgtm_upload_enabled", "target_os_version", "session_stitching_token_hash", "ad_services_version", "unmatched_first_open_without_ad_id", "npa_metadata_value", "attribution_eligibility_status", "sgtm_preview_key", "dma_consent_state", "daily_realtime_dcu_count", "bundle_delivery_index", "serialized_npa_metadata", "unmatched_pfo", "unmatched_uwa", "ad_campaign_info", "client_upload_eligibility", "last_diagnostics_signal_upload_timestamp"}, "app_id=?", new String[]{str}, null, null, null);
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        zzpg zzpgVar = this.f13552b;
                        zzh zzhVar = new zzh(zzpgVar.f13606l, str);
                        zzic zzicVar2 = zzhVar.f12967a;
                        zzjl zzjlVarD = zzpgVar.d(str);
                        zzjk zzjkVar = zzjk.ANALYTICS_STORAGE;
                        if (zzjlVarD.i(zzjkVar)) {
                            zzhVar.G(cursorQuery.getString(0));
                        }
                        boolean z11 = true;
                        zzhVar.I(cursorQuery.getString(1));
                        if (zzpgVar.d(str).i(zzjk.AD_STORAGE)) {
                            zzhVar.J(cursorQuery.getString(2));
                        }
                        zzhVar.e(cursorQuery.getLong(3));
                        zzhVar.M(cursorQuery.getLong(4));
                        zzhVar.N(cursorQuery.getLong(5));
                        zzhVar.P(cursorQuery.getString(6));
                        zzhVar.S(cursorQuery.getString(7));
                        zzhVar.T(cursorQuery.getLong(8));
                        zzhVar.a(cursorQuery.getLong(9));
                        zzhVar.d(cursorQuery.isNull(10) || cursorQuery.getInt(10) != 0);
                        zzhVar.i(cursorQuery.getLong(11));
                        zzhVar.j(cursorQuery.getLong(12));
                        zzhVar.k(cursorQuery.getLong(13));
                        zzhVar.l(cursorQuery.getLong(14));
                        zzhVar.f(cursorQuery.getLong(15));
                        zzhVar.g(cursorQuery.getLong(16));
                        zzhVar.R(cursorQuery.isNull(17) ? -2147483648L : cursorQuery.getInt(17));
                        zzhVar.L(cursorQuery.getString(18));
                        zzhVar.n(cursorQuery.getLong(19));
                        zzhVar.m(cursorQuery.getLong(20));
                        zzhVar.w(cursorQuery.getString(21));
                        boolean z12 = cursorQuery.isNull(23) || cursorQuery.getInt(23) != 0;
                        zzhz zzhzVar = zzicVar2.f13100g;
                        zzic.m(zzhzVar);
                        zzhzVar.g();
                        zzhVar.R |= zzhVar.f12981p != z12;
                        zzhVar.f12981p = z12;
                        zzhVar.c(cursorQuery.isNull(25) ? 0L : cursorQuery.getLong(25));
                        if (!cursorQuery.isNull(26)) {
                            zzhVar.y(Arrays.asList(cursorQuery.getString(26).split(",", -1)));
                        }
                        if (zzpgVar.d(str).i(zzjkVar)) {
                            String string2 = cursorQuery.getString(28);
                            zzhz zzhzVar2 = zzicVar2.f13100g;
                            zzic.m(zzhzVar2);
                            zzhzVar2.g();
                            zzhVar.R |= !Objects.equals(zzhVar.f12985t, string2);
                            zzhVar.f12985t = string2;
                        }
                        boolean z13 = (cursorQuery.isNull(29) || cursorQuery.getInt(29) == 0) ? false : true;
                        zzhz zzhzVar3 = zzicVar2.f13100g;
                        zzic.m(zzhzVar3);
                        zzhzVar3.g();
                        zzhVar.R |= zzhVar.f12986u != z13;
                        zzhVar.f12986u = z13;
                        zzhVar.r(cursorQuery.getLong(39));
                        String string3 = cursorQuery.getString(36);
                        zzhz zzhzVar4 = zzicVar2.f13100g;
                        zzic.m(zzhzVar4);
                        zzhzVar4.g();
                        zzhVar.R |= zzhVar.C != string3;
                        zzhVar.C = string3;
                        zzhVar.A(cursorQuery.getLong(30));
                        zzhVar.B(cursorQuery.getLong(31));
                        zzaif.a();
                        if (zzicVar.f13097d.r(str, zzfy.O0)) {
                            int i11 = cursorQuery.getInt(32);
                            zzhz zzhzVar5 = zzicVar2.f13100g;
                            zzic.m(zzhzVar5);
                            zzhzVar5.g();
                            zzhVar.R |= zzhVar.f12989x != i11;
                            zzhVar.f12989x = i11;
                            zzhVar.C(cursorQuery.getLong(35));
                        }
                        boolean z14 = (cursorQuery.isNull(33) || cursorQuery.getInt(33) == 0) ? false : true;
                        zzhz zzhzVar6 = zzicVar2.f13100g;
                        zzic.m(zzhzVar6);
                        zzhzVar6.g();
                        zzhVar.R |= zzhVar.f12990y != z14;
                        zzhVar.f12990y = z14;
                        if (cursorQuery.isNull(34)) {
                            boolValueOf = null;
                        } else {
                            boolValueOf = Boolean.valueOf(cursorQuery.getInt(34) != 0);
                        }
                        zzhz zzhzVar7 = zzicVar2.f13100g;
                        zzic.m(zzhzVar7);
                        zzhzVar7.g();
                        zzhVar.R |= !Objects.equals(zzhVar.f12982q, boolValueOf);
                        zzhVar.f12982q = boolValueOf;
                        zzhVar.p(cursorQuery.getInt(37));
                        zzhVar.q(cursorQuery.getInt(38));
                        if (cursorQuery.isNull(40)) {
                            string = BuildConfig.VERSION_NAME;
                        } else {
                            string = cursorQuery.getString(40);
                            Preconditions.g(string);
                        }
                        zzhz zzhzVar8 = zzicVar2.f13100g;
                        zzic.m(zzhzVar8);
                        zzhzVar8.g();
                        zzhVar.R |= zzhVar.G != string;
                        zzhVar.G = string;
                        if (!cursorQuery.isNull(41)) {
                            Long lValueOf = Long.valueOf(cursorQuery.getLong(41));
                            zzhz zzhzVar9 = zzicVar2.f13100g;
                            zzic.m(zzhzVar9);
                            zzhzVar9.g();
                            zzhVar.R |= !Objects.equals(zzhVar.f12991z, lValueOf);
                            zzhVar.f12991z = lValueOf;
                        }
                        if (!cursorQuery.isNull(42)) {
                            Long lValueOf2 = Long.valueOf(cursorQuery.getLong(42));
                            zzhz zzhzVar10 = zzicVar2.f13100g;
                            zzic.m(zzhzVar10);
                            zzhzVar10.g();
                            zzhVar.R |= !Objects.equals(zzhVar.A, lValueOf2);
                            zzhVar.A = lValueOf2;
                        }
                        byte[] blob = cursorQuery.getBlob(43);
                        zzhz zzhzVar11 = zzicVar2.f13100g;
                        zzic.m(zzhzVar11);
                        zzhzVar11.g();
                        zzhVar.R |= zzhVar.H != blob;
                        zzhVar.H = blob;
                        if (!cursorQuery.isNull(44)) {
                            int i12 = cursorQuery.getInt(44);
                            zzhz zzhzVar12 = zzicVar2.f13100g;
                            zzic.m(zzhzVar12);
                            zzhzVar12.g();
                            boolean z15 = zzhVar.R;
                            if (zzhVar.I == i12) {
                                z11 = false;
                            }
                            zzhVar.R = z11 | z15;
                            zzhVar.I = i12;
                        }
                        if (zzicVar.f13097d.r(str, zzfy.f12863j1) && !cursorQuery.isNull(45)) {
                            zzhVar.u(cursorQuery.getLong(45));
                        }
                        zzhz zzhzVar13 = zzicVar2.f13100g;
                        zzic.m(zzhzVar13);
                        zzhzVar13.g();
                        zzhVar.R = false;
                        if (cursorQuery.moveToNext()) {
                            zzgu zzguVar = zzicVar.f13099f;
                            zzic.m(zzguVar);
                            zzguVar.f12942f.b(zzgu.o(str), "Got multiple records for app, expected one. appId");
                        }
                        cursorQuery.close();
                        return zzhVar;
                    }
                } catch (SQLiteException e8) {
                    e = e8;
                    zzgu zzguVar2 = zzicVar.f13099f;
                    zzic.m(zzguVar2);
                    zzguVar2.f12942f.c(zzgu.o(str), e, "Error querying app. appId");
                }
            } catch (Throwable th2) {
                th = th2;
                cursor = cursorQuery;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e10) {
            e = e10;
            cursorQuery = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    public final void l0(zzh zzhVar, boolean z11) {
        zzic zzicVar = zzhVar.f12967a;
        g();
        h();
        String strE = zzhVar.E();
        Preconditions.g(strE);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", strE);
        zzpg zzpgVar = this.f13552b;
        if (z11) {
            contentValues.put("app_instance_id", (String) null);
        } else if (zzpgVar.d(strE).i(zzjk.ANALYTICS_STORAGE)) {
            contentValues.put("app_instance_id", zzhVar.F());
        }
        contentValues.put("gmp_app_id", zzhVar.H());
        if (zzpgVar.d(strE).i(zzjk.AD_STORAGE)) {
            zzhz zzhzVar = zzicVar.f13100g;
            zzic.m(zzhzVar);
            zzhzVar.g();
            contentValues.put("resettable_device_id_hash", zzhVar.f12971e);
        }
        zzhz zzhzVar2 = zzicVar.f13100g;
        zzic.m(zzhzVar2);
        zzhzVar2.g();
        contentValues.put("last_bundle_index", Long.valueOf(zzhVar.f12973g));
        zzhz zzhzVar3 = zzicVar.f13100g;
        zzic.m(zzhzVar3);
        zzhzVar3.g();
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(zzhVar.f12974h));
        zzhz zzhzVar4 = zzicVar.f13100g;
        zzic.m(zzhzVar4);
        zzhzVar4.g();
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(zzhVar.f12975i));
        contentValues.put("app_version", zzhVar.O());
        zzhz zzhzVar5 = zzicVar.f13100g;
        zzic.m(zzhzVar5);
        zzhzVar5.g();
        contentValues.put("app_store", zzhVar.f12978l);
        zzhz zzhzVar6 = zzicVar.f13100g;
        zzic.m(zzhzVar6);
        zzhzVar6.g();
        contentValues.put("gmp_version", Long.valueOf(zzhVar.m));
        zzhz zzhzVar7 = zzicVar.f13100g;
        zzic.m(zzhzVar7);
        zzhzVar7.g();
        contentValues.put(HOBXIlHxIkMBEA.VLv, Long.valueOf(zzhVar.f12979n));
        zzhz zzhzVar8 = zzicVar.f13100g;
        zzic.m(zzhzVar8);
        zzhzVar8.g();
        contentValues.put("measurement_enabled", Boolean.valueOf(zzhVar.f12980o));
        zzhz zzhzVar9 = zzicVar.f13100g;
        zzhz zzhzVar10 = zzicVar.f13100g;
        zzic.m(zzhzVar9);
        zzhzVar9.g();
        contentValues.put("day", Long.valueOf(zzhVar.K));
        zzic.m(zzhzVar10);
        zzhzVar10.g();
        contentValues.put("daily_public_events_count", Long.valueOf(zzhVar.L));
        zzic.m(zzhzVar10);
        zzhzVar10.g();
        contentValues.put("daily_events_count", Long.valueOf(zzhVar.M));
        zzic.m(zzhzVar10);
        zzhzVar10.g();
        contentValues.put("daily_conversions_count", Long.valueOf(zzhVar.N));
        zzhz zzhzVar11 = zzicVar.f13100g;
        zzic.m(zzhzVar11);
        zzhzVar11.g();
        contentValues.put("config_fetched_time", Long.valueOf(zzhVar.S));
        zzhz zzhzVar12 = zzicVar.f13100g;
        zzic.m(zzhzVar12);
        zzhzVar12.g();
        contentValues.put("failed_config_fetch_time", Long.valueOf(zzhVar.T));
        contentValues.put("app_version_int", Long.valueOf(zzhVar.Q()));
        contentValues.put("firebase_instance_id", zzhVar.K());
        zzic.m(zzhzVar10);
        zzhzVar10.g();
        contentValues.put("daily_error_events_count", Long.valueOf(zzhVar.O));
        zzic.m(zzhzVar10);
        zzhzVar10.g();
        contentValues.put("daily_realtime_events_count", Long.valueOf(zzhVar.P));
        zzic.m(zzhzVar10);
        zzhzVar10.g();
        contentValues.put("health_monitor_sample", zzhVar.Q);
        contentValues.put("android_id", (Long) 0L);
        zzhz zzhzVar13 = zzicVar.f13100g;
        zzic.m(zzhzVar13);
        zzhzVar13.g();
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(zzhVar.f12981p));
        contentValues.put("dynamite_version", Long.valueOf(zzhVar.b()));
        if (zzpgVar.d(strE).i(zzjk.ANALYTICS_STORAGE)) {
            zzhz zzhzVar14 = zzicVar.f13100g;
            zzic.m(zzhzVar14);
            zzhzVar14.g();
            contentValues.put("session_stitching_token", zzhVar.f12985t);
        }
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(zzhVar.z()));
        zzhz zzhzVar15 = zzicVar.f13100g;
        zzic.m(zzhzVar15);
        zzhzVar15.g();
        contentValues.put("target_os_version", Long.valueOf(zzhVar.f12987v));
        zzhz zzhzVar16 = zzicVar.f13100g;
        zzic.m(zzhzVar16);
        zzhzVar16.g();
        contentValues.put("session_stitching_token_hash", Long.valueOf(zzhVar.f12988w));
        zzaif.a();
        zzic zzicVar2 = this.f13202a;
        zzal zzalVar = zzicVar2.f13097d;
        zzgu zzguVar = zzicVar2.f13099f;
        if (zzalVar.r(strE, zzfy.O0)) {
            zzhz zzhzVar17 = zzicVar.f13100g;
            zzic.m(zzhzVar17);
            zzhzVar17.g();
            contentValues.put("ad_services_version", Integer.valueOf(zzhVar.f12989x));
            zzhz zzhzVar18 = zzicVar.f13100g;
            zzic.m(zzhzVar18);
            zzhzVar18.g();
            contentValues.put("attribution_eligibility_status", Long.valueOf(zzhVar.B));
        }
        zzhz zzhzVar19 = zzicVar.f13100g;
        zzic.m(zzhzVar19);
        zzhzVar19.g();
        contentValues.put("unmatched_first_open_without_ad_id", Boolean.valueOf(zzhVar.f12990y));
        contentValues.put("npa_metadata_value", zzhVar.x());
        zzhz zzhzVar20 = zzicVar.f13100g;
        zzic.m(zzhzVar20);
        zzhzVar20.g();
        contentValues.put("bundle_delivery_index", Long.valueOf(zzhVar.F));
        contentValues.put("sgtm_preview_key", zzhVar.D());
        zzic.m(zzhzVar10);
        zzhzVar10.g();
        contentValues.put("dma_consent_state", Integer.valueOf(zzhVar.D));
        zzic.m(zzhzVar10);
        zzhzVar10.g();
        contentValues.put("daily_realtime_dcu_count", Integer.valueOf(zzhVar.E));
        contentValues.put("serialized_npa_metadata", zzhVar.s());
        contentValues.put("client_upload_eligibility", Integer.valueOf(zzhVar.t()));
        zzhz zzhzVar21 = zzicVar.f13100g;
        zzic.m(zzhzVar21);
        zzhzVar21.g();
        ArrayList arrayList = zzhVar.f12984s;
        if (arrayList != null) {
            if (arrayList.isEmpty()) {
                zzic.m(zzguVar);
                zzguVar.f12945i.b(strE, "Safelisted events should not be an empty list. appId");
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", arrayList));
            }
        }
        ((zzahl) zzahk.f11385b.f11386a.get()).getClass();
        if (zzalVar.r(null, zzfy.K0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        zzhz zzhzVar22 = zzicVar.f13100g;
        zzic.m(zzhzVar22);
        zzhzVar22.g();
        contentValues.put("unmatched_pfo", zzhVar.f12991z);
        zzhz zzhzVar23 = zzicVar.f13100g;
        zzic.m(zzhzVar23);
        zzhzVar23.g();
        contentValues.put("unmatched_uwa", zzhVar.A);
        zzhz zzhzVar24 = zzicVar.f13100g;
        zzic.m(zzhzVar24);
        zzhzVar24.g();
        contentValues.put("ad_campaign_info", zzhVar.H);
        if (zzalVar.r(strE, zzfy.f12863j1)) {
            zzhz zzhzVar25 = zzicVar.f13100g;
            zzic.m(zzhzVar25);
            zzhzVar25.g();
            contentValues.put("last_diagnostics_signal_upload_timestamp", Long.valueOf(zzhVar.J));
        }
        try {
            SQLiteDatabase sQLiteDatabaseX = X();
            if (sQLiteDatabaseX.update("apps", contentValues, "app_id = ?", new String[]{strE}) == 0 && sQLiteDatabaseX.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                zzic.m(zzguVar);
                zzguVar.f12942f.b(zzgu.o(strE), "Failed to insert/update app (got -1). appId");
            }
        } catch (SQLiteException e8) {
            zzic.m(zzguVar);
            zzguVar.f12942f.c(zzgu.o(strE), e8, "Error storing app. appId");
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0092 A[Catch: all -> 0x006c, SQLiteException -> 0x00a3, TryCatch #0 {SQLiteException -> 0x00a3, blocks: (B:15:0x0071, B:17:0x0092, B:20:0x00a5), top: B:30:0x0071 }] */
    /* JADX WARN: Code duplicated, block: B:20:0x00a5 A[Catch: all -> 0x006c, SQLiteException -> 0x00a3, TRY_LEAVE, TryCatch #0 {SQLiteException -> 0x00a3, blocks: (B:15:0x0071, B:17:0x0092, B:20:0x00a5), top: B:30:0x0071 }] */
    public final long u(String str) {
        long j11;
        ContentValues contentValues;
        zzic zzicVar = this.f13202a;
        Preconditions.d(str);
        String str2 = IMCc.eyCYvDdscG;
        Preconditions.d(str2);
        g();
        h();
        SQLiteDatabase sQLiteDatabaseX = X();
        sQLiteDatabaseX.beginTransaction();
        long j12 = 0;
        try {
            try {
                StringBuilder sb2 = new StringBuilder(48);
                sb2.append("select first_open_count from app2 where app_id=?");
                j11 = -1;
                long jD = D(sb2.toString(), new String[]{str}, -1L);
                if (jD == -1) {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("app_id", str);
                    contentValues2.put(str2, (Integer) 0);
                    contentValues2.put("previous_install_count", (Integer) 0);
                    if (sQLiteDatabaseX.insertWithOnConflict("app2", null, contentValues2, 5) == -1) {
                        zzgu zzguVar = zzicVar.f13099f;
                        zzic.m(zzguVar);
                        zzguVar.f12942f.c(zzgu.o(str), str2, "Failed to insert column (got -1). appId");
                    } else {
                        jD = 0;
                        try {
                            contentValues = new ContentValues();
                            contentValues.put("app_id", str);
                            contentValues.put(str2, Long.valueOf(1 + jD));
                            if (sQLiteDatabaseX.update("app2", contentValues, "app_id = ?", new String[]{str}) == 0) {
                                zzgu zzguVar2 = zzicVar.f13099f;
                                zzic.m(zzguVar2);
                                zzguVar2.f12942f.c(zzgu.o(str), str2, "Failed to update column (got 0). appId");
                            } else {
                                sQLiteDatabaseX.setTransactionSuccessful();
                                j11 = jD;
                            }
                        } catch (SQLiteException e8) {
                            e = e8;
                            j12 = jD;
                            zzgu zzguVar3 = zzicVar.f13099f;
                            zzic.m(zzguVar3);
                            zzguVar3.f12942f.d("Error inserting column. appId", zzgu.o(str), str2, e);
                            j11 = j12;
                        }
                    }
                } else {
                    contentValues = new ContentValues();
                    contentValues.put("app_id", str);
                    contentValues.put(str2, Long.valueOf(1 + jD));
                    if (sQLiteDatabaseX.update("app2", contentValues, "app_id = ?", new String[]{str}) == 0) {
                        zzgu zzguVar4 = zzicVar.f13099f;
                        zzic.m(zzguVar4);
                        zzguVar4.f12942f.c(zzgu.o(str), str2, "Failed to update column (got 0). appId");
                    } else {
                        sQLiteDatabaseX.setTransactionSuccessful();
                        j11 = jD;
                    }
                }
            } finally {
                sQLiteDatabaseX.endTransaction();
            }
        } catch (SQLiteException e10) {
            e = e10;
        }
        return j11;
    }

    public final void B(String str, zzoh zzohVar) {
        g();
        h();
        Preconditions.d(str);
        zzic zzicVar = this.f13202a;
        DefaultClock defaultClock = zzicVar.f13104k;
        zzgu zzguVar = zzicVar.f13099f;
        defaultClock.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        zzfx zzfxVar = zzfy.f12884u0;
        long jLongValue = jCurrentTimeMillis - ((Long) zzfxVar.a(null)).longValue();
        long j11 = zzohVar.f13546b;
        if (j11 < jLongValue || j11 > ((Long) zzfxVar.a(null)).longValue() + jCurrentTimeMillis) {
            zzic.m(zzguVar);
            zzguVar.f12945i.d("Storing trigger URI outside of the max retention time span. appId, now, timestamp", zzgu.o(str), Long.valueOf(jCurrentTimeMillis), Long.valueOf(j11));
        }
        zzic.m(zzguVar);
        zzguVar.f12949n.a("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("trigger_uri", zzohVar.f13545a);
        contentValues.put(PQgum.OLAVOfHGwpux, Integer.valueOf(zzohVar.f13547c));
        contentValues.put("timestamp_millis", Long.valueOf(j11));
        try {
            if (X().insert("trigger_uris", null, contentValues) == -1) {
                zzic.m(zzguVar);
                zzguVar.f12942f.b(zzgu.o(str), "Failed to insert trigger URI (got -1). appId");
            }
        } catch (SQLiteException e8) {
            zzic.m(zzguVar);
            zzguVar.f12942f.c(zzgu.o(str), e8, "Error storing trigger URI. appId");
        }
    }

    public final boolean f0(zzah zzahVar) {
        g();
        h();
        String str = zzahVar.f12620a;
        Preconditions.g(str);
        zzpn zzpnVarC0 = c0(str, zzahVar.f12622c.f13634b);
        zzic zzicVar = this.f13202a;
        if (zzpnVarC0 == null) {
            long jC = C("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            zzicVar.getClass();
            if (jC >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put(OSSHeaders.ORIGIN, zzahVar.f12621b);
        contentValues.put("name", zzahVar.f12622c.f13634b);
        Object objZza = zzahVar.f12622c.zza();
        Preconditions.g(objZza);
        T(contentValues, objZza);
        contentValues.put("active", Boolean.valueOf(zzahVar.f12624e));
        contentValues.put("trigger_event_name", zzahVar.f12625f);
        contentValues.put("trigger_timeout", Long.valueOf(zzahVar.H));
        zzbh zzbhVar = zzahVar.f12626t;
        zzpp zzppVar = zzicVar.f13102i;
        zzgu zzguVar = zzicVar.f13099f;
        zzic.k(zzppVar);
        contentValues.put("timed_out_event", zzpp.Q(zzbhVar));
        contentValues.put("creation_timestamp", Long.valueOf(zzahVar.f12623d));
        zzic.k(zzppVar);
        contentValues.put("triggered_event", zzpp.Q(zzahVar.K));
        contentValues.put("triggered_timestamp", Long.valueOf(zzahVar.f12622c.f13635c));
        contentValues.put("time_to_live", Long.valueOf(zzahVar.L));
        contentValues.put("expired_event", zzpp.Q(zzahVar.M));
        try {
            if (X().insertWithOnConflict("conditional_properties", null, contentValues, 5) == -1) {
                zzic.m(zzguVar);
                zzguVar.f12942f.b(zzgu.o(str), "Failed to insert/update conditional user property (got -1)");
                return true;
            }
            return true;
        } catch (SQLiteException e8) {
            zzic.m(zzguVar);
            zzguVar.f12942f.c(zzgu.o(str), e8, tcppUUQxZjFdy.LFtQFACsPsu);
            return true;
        }
    }
}
