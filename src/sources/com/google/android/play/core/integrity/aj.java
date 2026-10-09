package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import vf.eq.EHjhWcesDUIsIw;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class aj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final com.google.android.play.integrity.internal.ae f16110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.s f16111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f16112c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Context f16113d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final at f16114e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final k f16115f;

    public aj(Context context, com.google.android.play.integrity.internal.s sVar, at atVar, k kVar) {
        this.f16112c = context.getPackageName();
        this.f16111b = sVar;
        this.f16114e = atVar;
        this.f16115f = kVar;
        this.f16113d = context;
        com.google.android.play.integrity.internal.s sVar2 = com.google.android.play.integrity.internal.ai.f16240a;
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                try {
                    if (com.google.android.play.integrity.internal.ai.b(context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures)) {
                        this.f16110a = new com.google.android.play.integrity.internal.ae(context, sVar, "IntegrityService", ak.f16116a, new com.google.android.play.integrity.internal.z() { // from class: com.google.android.play.core.integrity.ae
                            @Override // com.google.android.play.integrity.internal.z
                            public final Object a(IBinder iBinder) {
                                int i11 = com.google.android.play.integrity.internal.m.f16264t;
                                if (iBinder == null) {
                                    return null;
                                }
                                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IIntegrityService");
                                return iInterfaceQueryLocalInterface instanceof com.google.android.play.integrity.internal.n ? (com.google.android.play.integrity.internal.n) iInterfaceQueryLocalInterface : new com.google.android.play.integrity.internal.l(iBinder, "com.google.android.play.core.integrity.protocol.IIntegrityService");
                            }
                        });
                        return;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    sVar2.c("Play Store package is not found.", new Object[0]);
                }
            } else {
                sVar2.c("Play Store package is disabled.", new Object[0]);
            }
        } catch (PackageManager.NameNotFoundException unused2) {
            sVar2.c("Play Store package is not found.", new Object[0]);
        }
        Object[] objArr = new Object[0];
        if (Log.isLoggable("PlayCore", 6)) {
            com.google.android.play.integrity.internal.s.d(sVar.f16265a, "Phonesky is not installed.", objArr);
        } else {
            sVar.getClass();
        }
        this.f16110a = null;
    }

    public static /* bridge */ /* synthetic */ Bundle a(aj ajVar, byte[] bArr, Long l9, Parcelable parcelable) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", ajVar.f16112c);
        bundle.putByteArray("nonce", bArr);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 4);
        bundle.putInt("playcore.integrity.version.patch", 0);
        if (l9 != null) {
            bundle.putLong("cloud.prj", l9.longValue());
        }
        if (parcelable != null) {
            bundle.putParcelable("network", parcelable);
        }
        ArrayList arrayList = new ArrayList();
        com.google.android.play.integrity.internal.d.b(3, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(com.google.android.play.integrity.internal.d.a(arrayList)));
        return bundle;
    }

    public final Task c(IntegrityTokenRequest integrityTokenRequest) {
        if (this.f16110a == null) {
            return Tasks.forException(new IntegrityServiceException(-2, null));
        }
        if (com.google.android.play.integrity.internal.ai.a(this.f16113d) < 82380000) {
            return Tasks.forException(new IntegrityServiceException(-14, null));
        }
        try {
            byte[] bArrDecode = Base64.decode(integrityTokenRequest.nonce(), 10);
            Long lCloudProjectNumber = integrityTokenRequest.cloudProjectNumber();
            if (integrityTokenRequest instanceof ao) {
            }
            this.f16111b.b("requestIntegrityToken(%s)", integrityTokenRequest);
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.f16110a.c(new af(this, taskCompletionSource, bArrDecode, lCloudProjectNumber, null, taskCompletionSource, integrityTokenRequest), taskCompletionSource);
            return taskCompletionSource.getTask();
        } catch (IllegalArgumentException e8) {
            return Tasks.forException(new IntegrityServiceException(-13, e8));
        }
    }

    public final Task b(Activity activity, Bundle bundle) {
        if (this.f16110a == null) {
            return Tasks.forException(new IntegrityServiceException(-2, null));
        }
        int i11 = bundle.getInt("dialog.intent.type");
        this.f16111b.b(EHjhWcesDUIsIw.qFgVRkbpAY, this.f16112c, Integer.valueOf(i11));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f16110a.c(new ag(this, taskCompletionSource, bundle, activity, taskCompletionSource, i11), taskCompletionSource);
        return taskCompletionSource.getTask();
    }
}
