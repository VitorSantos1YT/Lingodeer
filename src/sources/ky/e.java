package ky;

import dy.j;
import dy.x;
import gy.f;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final dy.e f38936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f38937b;

    static {
        try {
            Objects.requireNonNull(d.f38935a, "Scheduler Supplier result can't be null");
            try {
                dy.e eVar = a.f38932a;
                Objects.requireNonNull(eVar, "Scheduler Supplier result can't be null");
                f38936a = eVar;
                try {
                    j jVar = b.f38933a;
                    Objects.requireNonNull(jVar, "Scheduler Supplier result can't be null");
                    f38937b = jVar;
                    int i11 = x.f24628c;
                    try {
                        Objects.requireNonNull(c.f38934a, "Scheduler Supplier result can't be null");
                    } catch (Throwable th2) {
                        throw f.b(th2);
                    }
                } catch (Throwable th3) {
                    throw f.b(th3);
                }
            } catch (Throwable th4) {
                throw f.b(th4);
            }
        } catch (Throwable th5) {
            throw f.b(th5);
        }
    }
}
