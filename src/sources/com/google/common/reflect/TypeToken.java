package com.google.common.reflect;

import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ForwardingSet;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import com.google.common.collect.Ordering;
import com.google.common.collect.UnmodifiableListIterator;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public abstract class TypeToken<T> extends TypeCapture<T> implements Serializable {
    private static final long serialVersionUID = 3637540370352322684L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Type f17543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient TypeResolver f17544b;

    /* JADX INFO: renamed from: com.google.common.reflect.TypeToken$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass1 extends Invokable.MethodInvokable<Object> {
        @Override // com.google.common.reflect.Invokable
        public final TypeToken a() {
            return null;
        }

        @Override // com.google.common.reflect.Invokable
        public final String toString() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.common.reflect.TypeToken$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass2 extends Invokable.ConstructorInvokable<Object> {
        @Override // com.google.common.reflect.Invokable
        public final TypeToken a() {
            return null;
        }

        @Override // com.google.common.reflect.Invokable
        public final String toString() {
            new Joiner(", ");
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.common.reflect.TypeToken$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass3 extends TypeVisitor {
        @Override // com.google.common.reflect.TypeVisitor
        public final void c(GenericArrayType genericArrayType) {
            a(genericArrayType.getGenericComponentType());
        }

        @Override // com.google.common.reflect.TypeVisitor
        public final void d(ParameterizedType parameterizedType) {
            a(parameterizedType.getActualTypeArguments());
            a(parameterizedType.getOwnerType());
        }

        @Override // com.google.common.reflect.TypeVisitor
        public final void e(TypeVariable typeVariable) {
            throw null;
        }

        @Override // com.google.common.reflect.TypeVisitor
        public final void f(WildcardType wildcardType) {
            a(wildcardType.getLowerBounds());
            a(wildcardType.getUpperBounds());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Bounds {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public final class ClassSet extends TypeToken<T>.TypeSet {
        private static final long serialVersionUID = 0;

        private Object readResolve() {
            throw null;
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        /* JADX INFO: renamed from: j0 */
        public final /* bridge */ /* synthetic */ Object o0() {
            o0();
            throw null;
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection
        public final /* bridge */ /* synthetic */ Collection o0() {
            o0();
            throw null;
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet, com.google.common.collect.ForwardingSet
        /* JADX INFO: renamed from: w0 */
        public final Set o0() {
            TypeCollector.AnonymousClass1 anonymousClass1 = TypeCollector.f17547a;
            anonymousClass1.getClass();
            new TypeCollector.AnonymousClass3(anonymousClass1);
            throw null;
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet
        public final Set z0() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public final class InterfaceSet extends TypeToken<T>.TypeSet {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public transient ImmutableSet f17546c;

        private Object readResolve() {
            throw null;
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection
        /* JADX INFO: renamed from: w0, reason: merged with bridge method [inline-methods] */
        public final Set o0() {
            ImmutableSet immutableSet = this.f17546c;
            if (immutableSet != null) {
                return immutableSet;
            }
            FluentIterable fluentIterableB = FluentIterable.b(null);
            ImmutableSet immutableSetE = FluentIterable.b(Iterables.b(fluentIterableB.d(), TypeFilter.INTERFACE_ONLY)).e();
            this.f17546c = immutableSetE;
            return immutableSetE;
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet
        public final Set z0() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class SimpleTypeToken<T> extends TypeToken<T> {
        private static final long serialVersionUID = 0;
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static abstract class TypeCollector<K> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AnonymousClass1 f17547a = new TypeCollector<TypeToken<?>>() { // from class: com.google.common.reflect.TypeToken.TypeCollector.1
            @Override // com.google.common.reflect.TypeToken.TypeCollector
            public final Iterable c(Object obj) {
                TypeToken typeToken = (TypeToken) obj;
                Type type = typeToken.f17543a;
                if (type instanceof TypeVariable) {
                    return TypeToken.b(((TypeVariable) type).getBounds());
                }
                if (type instanceof WildcardType) {
                    return TypeToken.b(((WildcardType) type).getUpperBounds());
                }
                UnmodifiableListIterator unmodifiableListIterator = ImmutableList.f16771b;
                ImmutableList.Builder builder = new ImmutableList.Builder();
                for (Type type2 : typeToken.c().getGenericInterfaces()) {
                    builder.h(typeToken.f(type2));
                }
                return builder.j();
            }

            @Override // com.google.common.reflect.TypeToken.TypeCollector
            public final Class d(Object obj) {
                return ((TypeToken) obj).c();
            }

            @Override // com.google.common.reflect.TypeToken.TypeCollector
            public final Object e(Object obj) {
                TypeToken typeToken = (TypeToken) obj;
                Type type = typeToken.f17543a;
                if (type instanceof TypeVariable) {
                    SimpleTypeToken simpleTypeToken = new SimpleTypeToken(((TypeVariable) type).getBounds()[0]);
                    if (simpleTypeToken.c().isInterface()) {
                        return null;
                    }
                    return simpleTypeToken;
                }
                if (type instanceof WildcardType) {
                    SimpleTypeToken simpleTypeToken2 = new SimpleTypeToken(((WildcardType) type).getUpperBounds()[0]);
                    if (simpleTypeToken2.c().isInterface()) {
                        return null;
                    }
                    return simpleTypeToken2;
                }
                Type genericSuperclass = typeToken.c().getGenericSuperclass();
                if (genericSuperclass == null) {
                    return null;
                }
                return typeToken.f(genericSuperclass);
            }
        };

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final AnonymousClass2 f17548b = new TypeCollector<Class<?>>() { // from class: com.google.common.reflect.TypeToken.TypeCollector.2
            @Override // com.google.common.reflect.TypeToken.TypeCollector
            public final Iterable c(Object obj) {
                return Arrays.asList(((Class) obj).getInterfaces());
            }

            @Override // com.google.common.reflect.TypeToken.TypeCollector
            public final Class d(Object obj) {
                return (Class) obj;
            }

            @Override // com.google.common.reflect.TypeToken.TypeCollector
            public final Object e(Object obj) {
                return ((Class) obj).getSuperclass();
            }
        };

        /* JADX INFO: renamed from: com.google.common.reflect.TypeToken$TypeCollector$3, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        class AnonymousClass3 extends ForwardingTypeCollector<Object> {
            @Override // com.google.common.reflect.TypeToken.TypeCollector
            public final ImmutableList b(ImmutableCollection immutableCollection) {
                UnmodifiableListIterator unmodifiableListIterator = ImmutableList.f16771b;
                ImmutableList.Builder builder = new ImmutableList.Builder();
                for (Object obj : immutableCollection) {
                    if (!this.f17551c.d(obj).isInterface()) {
                        builder.h(obj);
                    }
                }
                return super.b(builder.j());
            }

            @Override // com.google.common.reflect.TypeToken.TypeCollector.ForwardingTypeCollector, com.google.common.reflect.TypeToken.TypeCollector
            public final Iterable c(Object obj) {
                return ImmutableSet.s();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public static class ForwardingTypeCollector<K> extends TypeCollector<K> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final TypeCollector f17551c;

            public ForwardingTypeCollector(TypeCollector typeCollector) {
                super(0);
                this.f17551c = typeCollector;
            }

            @Override // com.google.common.reflect.TypeToken.TypeCollector
            public Iterable c(Object obj) {
                return this.f17551c.c(obj);
            }

            @Override // com.google.common.reflect.TypeToken.TypeCollector
            public final Class d(Object obj) {
                return this.f17551c.d(obj);
            }

            @Override // com.google.common.reflect.TypeToken.TypeCollector
            public final Object e(Object obj) {
                return this.f17551c.e(obj);
            }
        }

        private TypeCollector() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final int a(Object obj, HashMap map) {
            Integer num = (Integer) map.get(obj);
            if (num != null) {
                return num.intValue();
            }
            boolean zIsInterface = d(obj).isInterface();
            Iterator<T> it = c(obj).iterator();
            int iMax = zIsInterface;
            while (it.hasNext()) {
                iMax = Math.max(iMax, a(it.next(), map));
            }
            Object objE = e(obj);
            int iMax2 = iMax;
            if (objE != null) {
                iMax2 = Math.max(iMax, a(objE, map));
            }
            int i11 = iMax2 + 1;
            map.put(obj, Integer.valueOf(i11));
            return i11;
        }

        public ImmutableList b(ImmutableCollection immutableCollection) {
            final HashMap map = new HashMap();
            Iterator<E> it = immutableCollection.iterator();
            while (it.hasNext()) {
                a(it.next(), map);
            }
            final Ordering orderingG = Ordering.c().g();
            return ImmutableList.z(new Ordering<Object>() { // from class: com.google.common.reflect.TypeToken.TypeCollector.4
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    HashMap map2 = map;
                    Object obj3 = map2.get(obj);
                    Objects.requireNonNull(obj3);
                    Object obj4 = map2.get(obj2);
                    Objects.requireNonNull(obj4);
                    return orderingG.compare(obj3, obj4);
                }
            }, map.keySet());
        }

        public abstract Iterable c(Object obj);

        public abstract Class d(Object obj);

        public abstract Object e(Object obj);

        public /* synthetic */ TypeCollector(int i11) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public enum TypeFilter implements Predicate<TypeToken<?>> {
        IGNORE_TYPE_VARIABLE_OR_WILDCARD { // from class: com.google.common.reflect.TypeToken.TypeFilter.1
            @Override // com.google.common.base.Predicate
            public final boolean apply(Object obj) {
                Type type = ((TypeToken) obj).f17543a;
                return ((type instanceof TypeVariable) || (type instanceof WildcardType)) ? false : true;
            }
        },
        INTERFACE_ONLY { // from class: com.google.common.reflect.TypeToken.TypeFilter.2
            @Override // com.google.common.base.Predicate
            public final boolean apply(Object obj) {
                return ((TypeToken) obj).c().isInterface();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class TypeSet extends ForwardingSet<TypeToken<? super T>> implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public transient ImmutableSet f17552a;

        public TypeSet() {
        }

        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection
        /* JADX INFO: renamed from: w0 */
        public Set o0() {
            ImmutableSet immutableSet = this.f17552a;
            if (immutableSet != null) {
                return immutableSet;
            }
            TypeCollector.AnonymousClass1 anonymousClass1 = TypeCollector.f17547a;
            anonymousClass1.getClass();
            FluentIterable fluentIterableB = FluentIterable.b(anonymousClass1.b(ImmutableList.u(TypeToken.this)));
            ImmutableSet immutableSetE = FluentIterable.b(Iterables.b(fluentIterableB.d(), TypeFilter.IGNORE_TYPE_VARIABLE_OR_WILDCARD)).e();
            this.f17552a = immutableSetE;
            return immutableSetE;
        }

        public Set z0() {
            return ImmutableSet.m(TypeCollector.f17548b.b(TypeToken.this.d()));
        }
    }

    public TypeToken() {
        Type typeA = a();
        this.f17543a = typeA;
        Preconditions.q("Cannot construct a TypeToken for a type variable.\nYou probably meant to call new TypeToken<%s>(getClass()) that can resolve the type variable for you.\nIf you do need to create a TypeToken of a type variable, please use TypeToken.of() instead.", !(typeA instanceof TypeVariable), typeA);
    }

    public static ImmutableList b(Type[] typeArr) {
        UnmodifiableListIterator unmodifiableListIterator = ImmutableList.f16771b;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        for (Type type : typeArr) {
            SimpleTypeToken simpleTypeToken = new SimpleTypeToken(type);
            if (simpleTypeToken.c().isInterface()) {
                builder.h(simpleTypeToken);
            }
        }
        return builder.j();
    }

    public static TypeToken e(Class cls) {
        return new SimpleTypeToken(cls);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Class c() {
        return (Class) d().iterator().next();
    }

    public final ImmutableSet d() {
        int i11 = ImmutableSet.f16842c;
        final ImmutableSet.Builder builder = new ImmutableSet.Builder();
        new TypeVisitor() { // from class: com.google.common.reflect.TypeToken.4
            @Override // com.google.common.reflect.TypeVisitor
            public final void b(Class cls) {
                builder.a(cls);
            }

            @Override // com.google.common.reflect.TypeVisitor
            public final void c(GenericArrayType genericArrayType) {
                Class clsC = new SimpleTypeToken(genericArrayType.getGenericComponentType()).c();
                Joiner joiner = Types.f17555a;
                builder.a(Array.newInstance((Class<?>) clsC, 0).getClass());
            }

            @Override // com.google.common.reflect.TypeVisitor
            public final void d(ParameterizedType parameterizedType) {
                builder.a((Class) parameterizedType.getRawType());
            }

            @Override // com.google.common.reflect.TypeVisitor
            public final void e(TypeVariable typeVariable) {
                a(typeVariable.getBounds());
            }

            @Override // com.google.common.reflect.TypeVisitor
            public final void f(WildcardType wildcardType) {
                a(wildcardType.getUpperBounds());
            }
        }.a(this.f17543a);
        return builder.k();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof TypeToken) {
            return this.f17543a.equals(((TypeToken) obj).f17543a);
        }
        return false;
    }

    public final TypeToken f(Type type) {
        boolean zA;
        TypeResolver typeResolver = this.f17544b;
        if (typeResolver == null) {
            TypeResolver typeResolver2 = new TypeResolver();
            ImmutableMap immutableMapG = TypeResolver.TypeMappingIntrospector.g(this.f17543a);
            TypeResolver.TypeTable typeTable = typeResolver2.f17537a;
            typeTable.getClass();
            ImmutableMap.Builder builder = new ImmutableMap.Builder();
            builder.e(typeTable.f17539a);
            Iterator it = immutableMapG.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                TypeResolver.TypeVariableKey typeVariableKey = (TypeResolver.TypeVariableKey) entry.getKey();
                Type type2 = (Type) entry.getValue();
                if (type2 instanceof TypeVariable) {
                    zA = typeVariableKey.a((TypeVariable) type2);
                } else {
                    typeVariableKey.getClass();
                    zA = false;
                }
                Preconditions.f("Type variable %s bound to itself", true ^ zA, typeVariableKey);
                builder.c(typeVariableKey, type2);
            }
            TypeResolver typeResolver3 = new TypeResolver(new TypeResolver.TypeTable(builder.a(true)));
            this.f17544b = typeResolver3;
            typeResolver = typeResolver3;
        }
        SimpleTypeToken simpleTypeToken = new SimpleTypeToken(typeResolver.a(type));
        simpleTypeToken.f17544b = this.f17544b;
        return simpleTypeToken;
    }

    public final int hashCode() {
        return this.f17543a.hashCode();
    }

    public final String toString() {
        Joiner joiner = Types.f17555a;
        Type type = this.f17543a;
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    public Object writeReplace() {
        return new SimpleTypeToken(new TypeResolver().a(this.f17543a));
    }

    public TypeToken(Type type) {
        type.getClass();
        this.f17543a = type;
    }
}
