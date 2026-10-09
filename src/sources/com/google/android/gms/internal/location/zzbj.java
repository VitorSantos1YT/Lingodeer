package com.google.android.gms.internal.location;

import android.os.Looper;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbj {
    public static Looper a() {
        Preconditions.i("Can't create handler inside thread that has not called Looper.prepare()", Looper.myLooper() != null);
        return Looper.myLooper();
    }
}
