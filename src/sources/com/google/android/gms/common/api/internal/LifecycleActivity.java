package com.google.android.gms.common.api.internal;

import android.app.Activity;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class LifecycleActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f8739a;

    public LifecycleActivity(Activity activity) {
        Preconditions.h(activity, "Activity must not be null");
        this.f8739a = activity;
    }
}
