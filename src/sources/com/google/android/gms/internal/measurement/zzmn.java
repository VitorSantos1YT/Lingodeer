package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.api.internal.RegisterListenerMethod;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.api.internal.UnregisterListenerMethod;
import com.google.android.gms.common.api.internal.zacc;
import com.google.android.gms.common.api.internal.zacd;
import com.google.android.gms.common.api.internal.zaf;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.android.gms.internal.base.zao;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.common.util.concurrent.AsyncFunction;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzmn implements zzmj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzkk f11735a;

    public zzmn(zzkk zzkkVar) {
        this.f11735a = zzkkVar;
    }

    public static ListenableFuture c(Task task) {
        final zzkz zzkzVar = new zzkz();
        zzkzVar.H = task;
        task.addOnCompleteListener(MoreExecutors.a(), new OnCompleteListener() { // from class: com.google.android.gms.internal.measurement.zzla
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final /* synthetic */ void onComplete(Task task2) {
                boolean zIsCanceled = task2.isCanceled();
                zzkz zzkzVar2 = zzkzVar;
                if (zIsCanceled) {
                    zzkzVar2.cancel(false);
                    return;
                }
                if (task2.isSuccessful()) {
                    zzkzVar2.m(task2.getResult());
                    return;
                }
                Exception exception = task2.getException();
                if (exception == null) {
                    throw new IllegalStateException();
                }
                zzkzVar2.n(exception);
            }
        });
        return Futures.c(zzkzVar, ApiException.class, new AsyncFunction() { // from class: com.google.android.gms.internal.measurement.zzml
            @Override // com.google.common.util.concurrent.AsyncFunction
            public final /* synthetic */ ListenableFuture apply(Object obj) {
                ApiException apiException = (ApiException) obj;
                throw new zzmk(apiException.getStatusCode(), apiException.getMessage(), apiException);
            }
        }, MoreExecutors.a());
    }

    @Override // com.google.android.gms.internal.measurement.zzmj
    public final ListenableFuture a(zzpm zzpmVar) throws Throwable {
        final String string;
        final zzkk zzkkVar = this.f11735a;
        final ListenerHolder listenerHolderA = ListenerHolders.a(zzkkVar.f8682g, zzpmVar, "zzku");
        String strA = ProcessUtils.a();
        if (strA == null) {
            string = "__PH_INTERNAL__NO_PROCESS__";
        } else {
            int length = strA.length() + 1;
            int iIdentityHashCode = System.identityHashCode(zzku.class);
            StringBuilder sb2 = new StringBuilder(length + String.valueOf(iIdentityHashCode).length());
            sb2.append(strA);
            sb2.append("|");
            sb2.append(iIdentityHashCode);
            string = sb2.toString();
        }
        RemoteCall remoteCall = new RemoteCall() { // from class: com.google.android.gms.internal.measurement.zzkg
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void a(Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) {
                zzkt zzktVar = (zzkt) ((zzku) anyClient).y();
                zzka zzkaVar = new zzka(zzkkVar, listenerHolderA);
                Parcel parcelH = zzktVar.h();
                parcelH.writeString(string);
                zzbn.c(parcelH, zzkaVar);
                zzktVar.j(parcelH, 28);
            }
        };
        zzkh zzkhVar = new RemoteCall() { // from class: com.google.android.gms.internal.measurement.zzkh
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void a(Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) {
                int i11 = zzkk.f11671l;
            }
        };
        RegistrationMethods.Builder builderA = RegistrationMethods.a();
        builderA.f8754d = listenerHolderA;
        builderA.f8751a = remoteCall;
        builderA.f8752b = zzkhVar;
        builderA.f8755e = new Feature[]{zzjn.f11636b};
        builderA.f8756f = false;
        RegistrationMethods registrationMethodsA = builderA.a();
        Preconditions.h(registrationMethodsA.f8748a.f8744a.f8741b, "Listener has already been released.");
        UnregisterListenerMethod unregisterListenerMethod = registrationMethodsA.f8749b;
        Preconditions.h(unregisterListenerMethod.f8765a, "Listener has already been released.");
        RegisterListenerMethod registerListenerMethod = registrationMethodsA.f8748a;
        Runnable runnable = registrationMethodsA.f8750c;
        GoogleApiManager googleApiManager = zzkkVar.f8686k;
        googleApiManager.getClass();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        googleApiManager.b(taskCompletionSource, registerListenerMethod.f8747d, zzkkVar);
        zacc zaccVar = new zacc(new zaf(new zacd(registerListenerMethod, unregisterListenerMethod, runnable), taskCompletionSource), googleApiManager.K.get(), zzkkVar);
        zao zaoVar = googleApiManager.P;
        zaoVar.sendMessage(zaoVar.obtainMessage(8, zaccVar));
        return c(taskCompletionSource.getTask());
    }

    @Override // com.google.android.gms.internal.measurement.zzmj
    public final ListenableFuture b(final zzme zzmeVar) {
        TaskApiCall.Builder builderA = TaskApiCall.a();
        builderA.f8761a = new RemoteCall() { // from class: com.google.android.gms.internal.measurement.zzkd
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void a(Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) {
                int i11 = zzkk.f11671l;
                zzkj zzkjVar = new zzkj(taskCompletionSource);
                zzkt zzktVar = (zzkt) ((zzku) anyClient).y();
                byte[] bArrB = zzmeVar.b();
                Parcel parcelH = zzktVar.h();
                zzbn.c(parcelH, zzkjVar);
                parcelH.writeByteArray(bArrB);
                zzktVar.j(parcelH, 31);
            }
        };
        builderA.f8763c = new Feature[]{zzjn.f11635a};
        builderA.f8762b = false;
        TaskApiCall taskApiCallA = builderA.a();
        final zzkk zzkkVar = this.f11735a;
        return c(zzkkVar.b(0, taskApiCallA).continueWithTask(MoreExecutors.a(), new Continuation() { // from class: com.google.android.gms.internal.measurement.zzke
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                boolean z11 = task.getException() instanceof UnsupportedApiCallException;
                zzme zzmeVar2 = zzmeVar;
                zzkk zzkkVar2 = zzkkVar;
                if (z11) {
                    return zzkkVar2.d(zzmeVar2.y());
                }
                if (!(task.getException() instanceof ApiException)) {
                    return task;
                }
                ApiException apiException = (ApiException) task.getException();
                apiException.getClass();
                return apiException.getStatusCode() == 29514 ? zzkkVar2.d(zzmeVar2.y()) : task;
            }
        }));
    }

    @Override // com.google.android.gms.internal.measurement.zzmj
    public final ListenableFuture zza(final String str) {
        str.getClass();
        TaskApiCall.Builder builderA = TaskApiCall.a();
        builderA.f8761a = new RemoteCall() { // from class: com.google.android.gms.internal.measurement.zzkb
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void a(Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) {
                int i11 = zzkk.f11671l;
                zzkj zzkjVar = new zzkj(taskCompletionSource);
                zzkt zzktVar = (zzkt) ((zzku) anyClient).y();
                Parcel parcelH = zzktVar.h();
                zzbn.c(parcelH, zzkjVar);
                parcelH.writeString(str);
                parcelH.writeString(BuildConfig.VERSION_NAME);
                parcelH.writeString(null);
                zzktVar.j(parcelH, 11);
            }
        };
        return c(this.f11735a.b(0, builderA.a()).continueWith(MoreExecutors.a(), new zzmm()));
    }

    @Override // com.google.android.gms.internal.measurement.zzmj
    public final ListenableFuture zzb(String str) {
        str.getClass();
        return c(this.f11735a.d(str));
    }

    @Override // com.google.android.gms.internal.measurement.zzmj
    public final ListenableFuture zzd() {
        TaskApiCall.Builder builderA = TaskApiCall.a();
        final zzkk zzkkVar = this.f11735a;
        builderA.f8761a = new RemoteCall() { // from class: com.google.android.gms.internal.measurement.zzkf
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void a(Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) {
                zzkt zzktVar = (zzkt) ((zzku) anyClient).y();
                zzjy zzjyVar = new zzjy(zzkkVar, taskCompletionSource);
                Parcel parcelH = zzktVar.h();
                zzbn.c(parcelH, zzjyVar);
                zzktVar.j(parcelH, 27);
            }
        };
        builderA.f8763c = new Feature[]{zzjn.f11637c};
        builderA.f8762b = false;
        return c(zzkkVar.b(0, builderA.a()));
    }
}
