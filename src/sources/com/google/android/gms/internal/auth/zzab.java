package com.google.android.gms.internal.auth;

import android.os.Parcelable;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzab extends GoogleApi implements zzg {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Logger f9425l;

    static {
        new Api.ClientKey();
        new zzv();
        f9425l = new Logger("Auth", "GoogleAuthServiceClient");
    }

    public static void c(Status status, Parcelable parcelable, TaskCompletionSource taskCompletionSource) {
        if (TaskUtil.b(status, parcelable, taskCompletionSource)) {
            return;
        }
        f9425l.b("The task is already complete.", new Object[0]);
    }
}
