package com.google.firebase.database.android;

import android.os.Handler;
import android.os.Looper;
import com.google.firebase.database.core.EventTarget;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class AndroidEventTarget implements EventTarget {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f19005a = new Handler(Looper.getMainLooper());
}
