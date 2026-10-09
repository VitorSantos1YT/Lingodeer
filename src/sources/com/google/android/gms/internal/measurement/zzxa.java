package com.google.android.gms.internal.measurement;

import com.google.common.util.concurrent.AsyncCallable;
import java.util.HashMap;
import java.util.Random;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzxa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f12143a = 0;

    static {
        Math.abs(new Random().nextInt());
        new HashMap();
    }

    public static final zzwx a(AsyncCallable asyncCallable) {
        m.f(asyncCallable, "asyncCallable");
        return new zzwx(zzvy.a(), asyncCallable);
    }
}
