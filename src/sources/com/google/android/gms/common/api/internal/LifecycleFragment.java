package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public interface LifecycleFragment {
    void c(String str, LifecycleCallback lifecycleCallback);

    LifecycleCallback e(Class cls, String str);

    Activity f();

    void startActivityForResult(Intent intent, int i11);
}
