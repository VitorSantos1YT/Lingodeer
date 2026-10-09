package qy;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c0 implements h, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public fz.a f48489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f48490b;

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return new f(getValue());
    }

    @Override // qy.h
    public final Object getValue() {
        if (this.f48490b == y.f48514a) {
            fz.a aVar = this.f48489a;
            kotlin.jvm.internal.m.c(aVar);
            this.f48490b = aVar.invoke();
            this.f48489a = null;
        }
        return this.f48490b;
    }

    public final String toString() {
        return this.f48490b != y.f48514a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
