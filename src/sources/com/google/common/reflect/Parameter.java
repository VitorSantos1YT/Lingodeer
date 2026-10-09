package com.google.common.reflect;

import com.google.common.base.Optional;
import com.google.common.base.Predicates;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public final class Parameter implements AnnotatedElement {
    public final boolean equals(Object obj) {
        if (obj instanceof Parameter) {
            throw null;
        }
        return false;
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final Annotation getAnnotation(Class cls) {
        cls.getClass();
        throw null;
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final Annotation[] getAnnotations() {
        throw null;
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final Annotation[] getAnnotationsByType(Class cls) {
        return getDeclaredAnnotationsByType(cls);
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final Annotation getDeclaredAnnotation(Class cls) {
        cls.getClass();
        Iterable iterableD = FluentIterable.b(null).d();
        iterableD.getClass();
        Iterator it = FluentIterable.b(Iterables.b(iterableD, Predicates.g(cls))).d().iterator();
        return (Annotation) (it.hasNext() ? Optional.d(it.next()) : Optional.a()).g();
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final Annotation[] getDeclaredAnnotations() {
        throw null;
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final Annotation[] getDeclaredAnnotationsByType(Class cls) {
        Iterable iterableD = FluentIterable.b(null).d();
        iterableD.getClass();
        cls.getClass();
        Iterable iterableD2 = FluentIterable.b(Iterables.b(iterableD, Predicates.g(cls))).d();
        return (Annotation[]) (iterableD2 instanceof Collection ? (Collection) iterableD2 : Lists.a(iterableD2.iterator())).toArray((Object[]) Array.newInstance((Class<?>) cls, 0));
    }

    public final int hashCode() {
        return 0;
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final boolean isAnnotationPresent(Class cls) {
        cls.getClass();
        throw null;
    }

    public final String toString() {
        return "null arg0";
    }
}
