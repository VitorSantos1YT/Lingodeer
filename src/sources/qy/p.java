package qy;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class p implements h, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f48499c = AtomicReferenceFieldUpdater.newUpdater(p.class, Object.class, "b");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile fz.a f48500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f48501b;

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return new f(getValue());
    }

    @Override // qy.h
    public final Object getValue() {
        Object obj = this.f48501b;
        y yVar = y.f48514a;
        if (obj != yVar) {
            return obj;
        }
        fz.a aVar = this.f48500a;
        if (aVar != null) {
            Object objInvoke = aVar.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f48499c;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, yVar, objInvoke)) {
                if (atomicReferenceFieldUpdater.get(this) != yVar) {
                }
            }
            this.f48500a = null;
            return objInvoke;
        }
        return this.f48501b;
    }

    public final String toString() {
        return this.f48501b != y.f48514a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
