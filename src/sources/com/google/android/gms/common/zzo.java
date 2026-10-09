package com.google.android.gms.common;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzo {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile com.google.android.gms.common.internal.zzad f9167g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static Context f9169i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zzd f9161a = new zzd(zzj.j("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u007f¢fú§p\u0085xb±"));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final zze f9162b = new zze(zzj.j("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014QÕÛ\u0004÷XçB\u0086<"));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final zzf f9163c = new zzf(zzj.j("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final zzg f9164d = new zzg(zzj.j("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final zzh f9165e = new zzh(zzj.j("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final zzi f9166f = new zzi(zzj.j("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f9168h = new Object();

    public static void a() {
        com.google.android.gms.common.internal.zzad zzabVar;
        if (f9167g != null) {
            return;
        }
        Preconditions.g(f9169i);
        synchronized (f9168h) {
            try {
                if (f9167g == null) {
                    IBinder iBinderB = DynamiteModule.c(f9169i, DynamiteModule.f9197d, "com.google.android.gms.googlecertificates").b("com.google.android.gms.common.GoogleCertificatesImpl");
                    int i11 = com.google.android.gms.common.internal.zzac.f9003a;
                    if (iBinderB == null) {
                        zzabVar = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                        zzabVar = iInterfaceQueryLocalInterface instanceof com.google.android.gms.common.internal.zzad ? (com.google.android.gms.common.internal.zzad) iInterfaceQueryLocalInterface : new com.google.android.gms.common.internal.zzab(iBinderB, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
                    }
                    f9167g = zzabVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static zzy b(String str, zzk zzkVar, boolean z11, boolean z12) {
        try {
            a();
            Preconditions.g(f9169i);
            try {
                return f9167g.C(new zzt(str, zzkVar, z11, z12), new ObjectWrapper(f9169i.getPackageManager())) ? zzy.f9188c : new zzx(new zzl(z11, str, zzkVar));
            } catch (RemoteException e8) {
                return zzy.c("module call", e8);
            }
        } catch (DynamiteModule.LoadingException e10) {
            return zzy.c("module init: ".concat(String.valueOf(e10.getMessage())), e10);
        }
    }
}
