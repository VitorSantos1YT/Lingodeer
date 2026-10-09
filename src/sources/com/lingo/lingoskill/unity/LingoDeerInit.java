package com.lingo.lingoskill.unity;

import android.content.Context;
import av.d;
import bq.l;
import bq.o;
import e7.f;
import java.util.List;
import kotlin.jvm.internal.m;
import na.b;
import qx.p;
import qy.b0;
import ry.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class LingoDeerInit implements b {
    @Override // na.b
    public final Object create(Context context) {
        m.f(context, "context");
        o oVar = new o(context);
        System.currentTimeMillis();
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler != null) {
            Thread.setDefaultUncaughtExceptionHandler(new l(defaultUncaughtExceptionHandler, 0));
        }
        p.f48482a = bq.m.f4953a;
        System.currentTimeMillis();
        new f(new d(oVar, 11)).start();
        return b0.f48488a;
    }

    @Override // na.b
    public final List dependencies() {
        return r.f50854a;
    }
}
