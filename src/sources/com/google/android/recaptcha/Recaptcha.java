package com.google.android.recaptcha;

import android.app.Application;
import com.bumptech.glide.e;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.internal.zzcq;
import com.google.android.recaptcha.internal.zzdc;
import qy.c;
import qy.o;
import vy.d;
import wy.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class Recaptcha {
    public static final Recaptcha INSTANCE = new Recaptcha();

    private Recaptcha() {
    }

    public static final Task<RecaptchaTasksClient> fetchTaskClient(Application application, String str) {
        return zzcq.zze(application, str);
    }

    /* JADX INFO: renamed from: getClient-BWLJW6A$default, reason: not valid java name */
    public static /* synthetic */ Object m205getClientBWLJW6A$default(Recaptcha recaptcha, Application application, String str, long j11, d dVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            j11 = 10000;
        }
        return recaptcha.m206getClientBWLJW6A(application, str, j11, dVar);
    }

    @c
    public static final Task<RecaptchaTasksClient> getTasksClient(Application application, String str) {
        return zzcq.zzc(application, str, 10000L);
    }

    public final Object fetchClient(Application application, String str, d<? super RecaptchaClient> dVar) {
        return zzcq.zzd(application, str, dVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @c
    /* JADX INFO: renamed from: getClient-BWLJW6A, reason: not valid java name */
    public final Object m206getClientBWLJW6A(Application application, String str, long j11, d<? super o> dVar) {
        Recaptcha$getClient$1 recaptcha$getClient$1;
        if (dVar instanceof Recaptcha$getClient$1) {
            recaptcha$getClient$1 = (Recaptcha$getClient$1) dVar;
            int i11 = recaptcha$getClient$1.zzc;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                recaptcha$getClient$1.zzc = i11 - Integer.MIN_VALUE;
            } else {
                recaptcha$getClient$1 = new Recaptcha$getClient$1(this, dVar);
            }
        } else {
            recaptcha$getClient$1 = new Recaptcha$getClient$1(this, dVar);
        }
        Object objZzb = recaptcha$getClient$1.zza;
        a aVar = a.COROUTINE_SUSPENDED;
        int i12 = recaptcha$getClient$1.zzc;
        try {
            if (i12 == 0) {
                e.F(objZzb);
                recaptcha$getClient$1.zzc = 1;
                objZzb = zzcq.zzb(application, str, j11, recaptcha$getClient$1);
                if (objZzb == aVar) {
                    return aVar;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e.F(objZzb);
            }
            return (zzdc) objZzb;
        } catch (Throwable th2) {
            return e.l(th2);
        }
    }

    @c
    public static final Task<RecaptchaTasksClient> getTasksClient(Application application, String str, long j11) {
        return zzcq.zzc(application, str, j11);
    }
}
