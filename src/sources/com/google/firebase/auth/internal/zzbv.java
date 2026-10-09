package com.google.firebase.auth.internal;

import com.google.android.gms.internal.p002firebaseauthapi.zzahe;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzbv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f17987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f17988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public zzahe f17989c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FirebaseApp f17990d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final FirebaseAuth f17991e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final zzbu f17992f;

    public zzbv(FirebaseApp firebaseApp, FirebaseAuth firebaseAuth) {
        zzbt zzbtVar = new zzbt();
        this.f17987a = new Object();
        this.f17988b = new HashMap();
        this.f17990d = firebaseApp;
        this.f17991e = firebaseAuth;
        this.f17992f = zzbtVar;
    }

    public final Task a(String str, Boolean bool, RecaptchaAction recaptchaAction) {
        Task taskB;
        if (com.google.android.gms.internal.p002firebaseauthapi.zzac.d(str)) {
            str = "*";
        }
        Task taskB2 = b(str);
        if (bool.booleanValue() || taskB2 == null) {
            if (com.google.android.gms.internal.p002firebaseauthapi.zzac.d(str)) {
                str = "*";
            }
            if (bool.booleanValue() || (taskB = b(str)) == null) {
                FirebaseAuth firebaseAuth = this.f17991e;
                taskB2 = firebaseAuth.f17882e.h(firebaseAuth.f17886i).continueWithTask(new zzby(this, str));
            } else {
                taskB2 = taskB;
            }
        }
        return taskB2.continueWithTask(new zzbx(this, recaptchaAction));
    }

    public final Task b(String str) {
        Task task;
        synchronized (this.f17987a) {
            task = (Task) this.f17988b.get(str);
        }
        return task;
    }
}
