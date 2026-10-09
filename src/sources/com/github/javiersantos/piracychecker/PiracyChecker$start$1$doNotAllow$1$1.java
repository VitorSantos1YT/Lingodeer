package com.github.javiersantos.piracychecker;

import android.util.Log;
import fz.a;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class PiracyChecker$start$1$doNotAllow$1$1 extends n implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PiracyChecker$start$1$doNotAllow$1$1 f7766a = new PiracyChecker$start$1$doNotAllow$1$1();

    public PiracyChecker$start$1$doNotAllow$1$1() {
        super(0);
    }

    @Override // fz.a
    public final Object invoke() {
        return Integer.valueOf(Log.e("PiracyChecker", "Unlicensed dialog was not built properly. Make sure your context is an instance of Activity"));
    }
}
