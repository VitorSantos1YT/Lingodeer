package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzcb extends SQLiteOpenHelper {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcb(Context context, String str) {
        super(context, true == str.equals(BuildConfig.VERSION_NAME) ? null : str, (SQLiteDatabase.CursorFactory) null, 1);
        int i11 = zzcd.f11489a;
        zzbz zzbzVar = zzby.f11484a;
    }
}
