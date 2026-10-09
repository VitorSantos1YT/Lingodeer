package qy;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class q implements h, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public fz.a f48502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f48503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f48504c;

    public q(fz.a initializer) {
        kotlin.jvm.internal.m.f(initializer, "initializer");
        this.f48502a = initializer;
        this.f48503b = y.f48514a;
        this.f48504c = this;
    }

    private final Object writeReplace() {
        return new f(getValue());
    }

    public final boolean a() {
        return this.f48503b != y.f48514a;
    }

    @Override // qy.h
    public final Object getValue() {
        Object objInvoke;
        Object obj = this.f48503b;
        y yVar = y.f48514a;
        if (obj != yVar) {
            return obj;
        }
        synchronized (this.f48504c) {
            objInvoke = this.f48503b;
            if (objInvoke == yVar) {
                fz.a aVar = this.f48502a;
                kotlin.jvm.internal.m.c(aVar);
                objInvoke = aVar.invoke();
                this.f48503b = objInvoke;
                this.f48502a = null;
            }
        }
        return objInvoke;
    }

    public final String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
