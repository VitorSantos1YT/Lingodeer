package com.google.android.gms.internal.measurement;

import android.content.Context;
import com.google.common.base.Function;
import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzagr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zzph f11359a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final zzom f11360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile String f11361c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final zzog f11362d;

    static {
        zzpj zzpjVar = new zzpj(new Function() { // from class: com.google.android.gms.internal.measurement.zzagq
            @Override // com.google.common.base.Function
            public final Object apply(Object obj) {
                String strB;
                Context context = (Context) obj;
                String str = zzagr.f11361c;
                if (str != null) {
                    return str;
                }
                synchronized (zzagr.class) {
                    try {
                        strB = zzagr.f11361c;
                        if (strB == null) {
                            strB = zzlg.b(context, "com.google.android.gms.measurement");
                            zzagr.f11361c = strB;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return strB;
            }
        });
        zzon zzonVar = new zzon(zzpjVar.f11820a, true, zzpjVar.f11821b);
        zzpi zzpiVar = new zzpi();
        zzpiVar.f11818a = zzonVar;
        f11362d = new zzog(zzpiVar);
        f11360b = new zzod("__phenotype_server_token", zzpiVar, BuildConfig.VERSION_NAME);
        f11361c = null;
    }

    private zzagr() {
    }

    public static String a() {
        return (String) ((zznp) f11360b).get();
    }
}
