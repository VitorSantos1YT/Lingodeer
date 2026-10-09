package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzhv;
import com.google.android.gms.internal.play_billing.zzhx;
import com.google.android.gms.internal.play_billing.zzhz;
import com.google.android.gms.internal.play_billing.zzib;
import com.google.android.gms.internal.play_billing.zzic;
import com.google.android.gms.internal.play_billing.zzie;
import com.google.android.gms.internal.play_billing.zzig;
import com.google.android.gms.internal.play_billing.zzil;
import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f7514a = 0;

    static {
        int i11 = i0.f7518g;
    }

    public static String a(Exception exc) {
        if (exc == null) {
            return null;
        }
        try {
            String simpleName = exc.getClass().getSimpleName();
            String message = exc.getMessage();
            if (message == null) {
                message = BuildConfig.VERSION_NAME;
            }
            String str = simpleName + ":" + message;
            int i11 = zzc.f12272a;
            return str.length() > 40 ? str.substring(0, 40) : str;
        } catch (Throwable unused) {
            int i12 = zzc.f12272a;
            return null;
        }
    }

    public static zzhx b(zzie zzieVar, int i11, j jVar, String str, zzil zzilVar) {
        try {
            zzic zzicVarU = zzig.u();
            int i12 = jVar.f7519a;
            zzicVarU.h();
            zzig.t((zzig) zzicVarU.f12378b, i12);
            String str2 = jVar.f7521c;
            zzicVarU.h();
            zzig.q((zzig) zzicVarU.f12378b, str2);
            int i13 = jVar.f7520b;
            if (i13 != 0) {
                zzicVarU.h();
                zzig.r((zzig) zzicVarU.f12378b, i13);
            }
            if (zzieVar != null) {
                zzicVarU.i(zzieVar);
            }
            if (str != null) {
                zzicVarU.h();
                zzig.p((zzig) zzicVarU.f12378b, str);
            }
            zzhv zzhvVarW = zzhx.w();
            zzhvVarW.i(zzicVarU);
            zzhvVarW.k(i11);
            if (!zzilVar.equals(zzil.BROADCAST_ACTION_UNSPECIFIED)) {
                zzhvVarW.h();
                zzhx.r((zzhx) zzhvVarW.f12378b, zzilVar);
            }
            return (zzhx) zzhvVarW.f();
        } catch (Throwable unused) {
            int i14 = zzc.f12272a;
            return null;
        }
    }

    public static zzib c(int i11, zzil zzilVar) {
        try {
            zzhz zzhzVarU = zzib.u();
            zzhzVarU.h();
            zzib.t((zzib) zzhzVarU.f12378b, i11);
            if (!zzilVar.equals(zzil.BROADCAST_ACTION_UNSPECIFIED)) {
                zzhzVarU.h();
                zzib.q((zzib) zzhzVarU.f12378b, zzilVar);
            }
            return (zzib) zzhzVarU.f();
        } catch (Exception unused) {
            int i12 = zzc.f12272a;
            return null;
        }
    }
}
