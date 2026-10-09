package com.google.common.reflect;

import com.google.common.base.Preconditions;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public abstract class TypeParameter<T> extends TypeCapture<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TypeVariable f17536a;

    public TypeParameter() {
        Type typeA = a();
        Preconditions.f("%s should be a type variable.", typeA instanceof TypeVariable, typeA);
        this.f17536a = (TypeVariable) typeA;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof TypeParameter) {
            return this.f17536a.equals(((TypeParameter) obj).f17536a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17536a.hashCode();
    }

    public final String toString() {
        return this.f17536a.toString();
    }
}
