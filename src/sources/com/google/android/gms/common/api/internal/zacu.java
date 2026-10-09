package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zacu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f8831a = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));

    static {
        new Status(8, "The connection to Google Play services was lost", null, null);
    }
}
