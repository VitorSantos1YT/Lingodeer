package org.greenrobot.eventbus.android;

import ay.k0;
import tw.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public class AndroidComponentsImpl {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AndroidComponentsImpl f45717c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f45718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k0 f45719b;

    static {
        AndroidComponentsImpl androidComponentsImpl = null;
        if (v10.c.z()) {
            try {
                androidComponentsImpl = (AndroidComponentsImpl) AndroidComponentsImpl.class.getConstructor(null).newInstance(null);
            } catch (Throwable unused) {
            }
        }
        f45717c = androidComponentsImpl;
    }

    public AndroidComponentsImpl() {
        c cVar = new c(10);
        k0 k0Var = new k0(11);
        this.f45718a = cVar;
        this.f45719b = k0Var;
    }
}
