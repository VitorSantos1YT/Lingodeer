package com.google.common.reflect;

import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicates;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterables;
import com.google.common.collect.UnmodifiableListIterator;
import com.lingo.lingoskill.ui.base.ENO.MzwEyWCkjXL;
import java.io.Serializable;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.security.AccessControlException;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
final class Types {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Joiner f17555a = new Joiner(", ").e();

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public enum ClassOwnership {
        OWNED_BY_ENCLOSING_CLASS { // from class: com.google.common.reflect.Types.ClassOwnership.1
            @Override // com.google.common.reflect.Types.ClassOwnership
            public final Class a(Class cls) {
                return cls.getEnclosingClass();
            }
        },
        LOCAL_CLASS_HAS_NO_OWNER { // from class: com.google.common.reflect.Types.ClassOwnership.2
            @Override // com.google.common.reflect.Types.ClassOwnership
            public final Class a(Class cls) {
                if (cls.isLocalClass()) {
                    return null;
                }
                return cls.getEnclosingClass();
            }
        };

        static final ClassOwnership JVM_BEHAVIOR;

        static {
            new C1LocalClass<String>() { // from class: com.google.common.reflect.Types.ClassOwnership.3
            };
            ParameterizedType parameterizedType = (ParameterizedType) AnonymousClass3.class.getGenericSuperclass();
            Objects.requireNonNull(parameterizedType);
            for (ClassOwnership classOwnership : values()) {
                if (classOwnership.a(C1LocalClass.class) == parameterizedType.getOwnerType()) {
                    JVM_BEHAVIOR = classOwnership;
                    return;
                }
            }
            throw new AssertionError();
        }

        public abstract Class a(Class cls);
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class GenericArrayTypeImpl implements GenericArrayType, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Type f17557a;

        public GenericArrayTypeImpl(Type type) {
            this.f17557a = JavaVersion.CURRENT.e(type);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof GenericArrayType) {
                return com.google.common.base.Objects.a(this.f17557a, ((GenericArrayType) obj).getGenericComponentType());
            }
            return false;
        }

        @Override // java.lang.reflect.GenericArrayType
        public final Type getGenericComponentType() {
            return this.f17557a;
        }

        public final int hashCode() {
            return this.f17557a.hashCode();
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder();
            Joiner joiner = Types.f17555a;
            Type type = this.f17557a;
            return ep.a.k(sb2, type instanceof Class ? ((Class) type).getName() : type.toString(), "[]");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public enum JavaVersion {
        JAVA6 { // from class: com.google.common.reflect.Types.JavaVersion.1
            @Override // com.google.common.reflect.Types.JavaVersion
            public final Type a(Type type) {
                return new GenericArrayTypeImpl(type);
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            public final Type e(Type type) {
                type.getClass();
                if (!(type instanceof Class)) {
                    return type;
                }
                Class cls = (Class) type;
                return cls.isArray() ? new GenericArrayTypeImpl(cls.getComponentType()) : type;
            }
        },
        JAVA7 { // from class: com.google.common.reflect.Types.JavaVersion.2
            @Override // com.google.common.reflect.Types.JavaVersion
            public final Type a(Type type) {
                if (!(type instanceof Class)) {
                    return new GenericArrayTypeImpl(type);
                }
                Joiner joiner = Types.f17555a;
                return Array.newInstance((Class<?>) type, 0).getClass();
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            public final Type e(Type type) {
                type.getClass();
                return type;
            }
        },
        JAVA8 { // from class: com.google.common.reflect.Types.JavaVersion.3
            @Override // com.google.common.reflect.Types.JavaVersion
            public final Type a(Type type) {
                return JavaVersion.JAVA7.a(type);
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            public final String b(Type type) {
                try {
                    return (String) Type.class.getMethod("getTypeName", null).invoke(type, null);
                } catch (IllegalAccessException e8) {
                    e = e8;
                    throw new RuntimeException(e);
                } catch (NoSuchMethodException unused) {
                    throw new AssertionError("Type.getTypeName should be available in Java 8");
                } catch (InvocationTargetException e10) {
                    e = e10;
                    throw new RuntimeException(e);
                }
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            public final Type e(Type type) {
                return JavaVersion.JAVA7.e(type);
            }
        },
        JAVA9 { // from class: com.google.common.reflect.Types.JavaVersion.4
            @Override // com.google.common.reflect.Types.JavaVersion
            public final Type a(Type type) {
                return JavaVersion.JAVA8.a(type);
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            public final String b(Type type) {
                return JavaVersion.JAVA8.b(type);
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            public final Type e(Type type) {
                return JavaVersion.JAVA8.e(type);
            }
        };

        static final JavaVersion CURRENT;

        static {
            JavaVersion javaVersion = JAVA6;
            JavaVersion javaVersion2 = JAVA7;
            JavaVersion javaVersion3 = JAVA8;
            JavaVersion javaVersion4 = JAVA9;
            if (AnnotatedElement.class.isAssignableFrom(TypeVariable.class)) {
                if (new TypeCapture<Map.Entry<String, int[][]>>() { // from class: com.google.common.reflect.Types.JavaVersion.5
                }.a().toString().contains("java.util.Map.java.util.Map")) {
                    CURRENT = javaVersion3;
                    return;
                } else {
                    CURRENT = javaVersion4;
                    return;
                }
            }
            if (new TypeCapture<int[]>() { // from class: com.google.common.reflect.Types.JavaVersion.6
            }.a() instanceof Class) {
                CURRENT = javaVersion2;
            } else {
                CURRENT = javaVersion;
            }
        }

        public abstract Type a(Type type);

        public String b(Type type) {
            Joiner joiner = Types.f17555a;
            return type instanceof Class ? ((Class) type).getName() : type.toString();
        }

        public final ImmutableList c(Type[] typeArr) {
            UnmodifiableListIterator unmodifiableListIterator = ImmutableList.f16771b;
            ImmutableList.Builder builder = new ImmutableList.Builder();
            for (Type type : typeArr) {
                builder.h(e(type));
            }
            return builder.j();
        }

        public abstract Type e(Type type);
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class NativeTypeVariableEquals<X> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final boolean f17558a = !NativeTypeVariableEquals.class.getTypeParameters()[0].equals(Types.d(NativeTypeVariableEquals.class, "X", new Type[0]));
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class ParameterizedTypeImpl implements ParameterizedType, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Type f17559a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ImmutableList f17560b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Class f17561c;

        public ParameterizedTypeImpl(Type type, Class cls, Type[] typeArr) {
            cls.getClass();
            Preconditions.g(typeArr.length == cls.getTypeParameters().length);
            Types.b(typeArr, "type parameter");
            this.f17559a = type;
            this.f17561c = cls;
            this.f17560b = JavaVersion.CURRENT.c(typeArr);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) obj;
                if (this.f17561c.equals(parameterizedType.getRawType()) && com.google.common.base.Objects.a(this.f17559a, parameterizedType.getOwnerType())) {
                    Joiner joiner = Types.f17555a;
                    if (Arrays.equals((Type[]) this.f17560b.toArray(new Type[0]), parameterizedType.getActualTypeArguments())) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type[] getActualTypeArguments() {
            Joiner joiner = Types.f17555a;
            return (Type[]) this.f17560b.toArray(new Type[0]);
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getOwnerType() {
            return this.f17559a;
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getRawType() {
            return this.f17561c;
        }

        public final int hashCode() {
            Type type = this.f17559a;
            return ((type == null ? 0 : type.hashCode()) ^ this.f17560b.hashCode()) ^ this.f17561c.hashCode();
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder();
            Type type = this.f17559a;
            if (type != null) {
                JavaVersion javaVersion = JavaVersion.CURRENT;
                javaVersion.getClass();
                if (!(javaVersion instanceof JavaVersion.AnonymousClass4)) {
                    sb2.append(javaVersion.b(type));
                    sb2.append('.');
                }
            }
            sb2.append(this.f17561c.getName());
            sb2.append('<');
            Joiner joiner = Types.f17555a;
            final JavaVersion javaVersion2 = JavaVersion.CURRENT;
            Objects.requireNonNull(javaVersion2);
            sb2.append(joiner.c(Iterables.h(this.f17560b, new Function() { // from class: com.google.common.reflect.b
                @Override // com.google.common.base.Function
                public final Object apply(Object obj) {
                    return javaVersion2.b((Type) obj);
                }
            })));
            sb2.append('>');
            return sb2.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class TypeVariableImpl<D extends GenericDeclaration> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final GenericDeclaration f17562a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f17563b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ImmutableList f17564c;

        public TypeVariableImpl(GenericDeclaration genericDeclaration, String str, Type[] typeArr) {
            Types.b(typeArr, "bound for type variable");
            genericDeclaration.getClass();
            this.f17562a = genericDeclaration;
            str.getClass();
            this.f17563b = str;
            this.f17564c = ImmutableList.o(typeArr);
        }

        public final boolean equals(Object obj) {
            boolean z11 = NativeTypeVariableEquals.f17558a;
            GenericDeclaration genericDeclaration = this.f17562a;
            String str = this.f17563b;
            if (!z11) {
                if (obj instanceof TypeVariable) {
                    TypeVariable typeVariable = (TypeVariable) obj;
                    if (str.equals(typeVariable.getName()) && genericDeclaration.equals(typeVariable.getGenericDeclaration())) {
                        return true;
                    }
                }
                return false;
            }
            if (obj != null && Proxy.isProxyClass(obj.getClass()) && (Proxy.getInvocationHandler(obj) instanceof TypeVariableInvocationHandler)) {
                TypeVariableImpl typeVariableImpl = ((TypeVariableInvocationHandler) Proxy.getInvocationHandler(obj)).f17566a;
                if (str.equals(typeVariableImpl.f17563b) && genericDeclaration.equals(typeVariableImpl.f17562a) && this.f17564c.equals(typeVariableImpl.f17564c)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.f17562a.hashCode() ^ this.f17563b.hashCode();
        }

        public final String toString() {
            return this.f17563b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class TypeVariableInvocationHandler implements InvocationHandler {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final ImmutableMap f17565b;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TypeVariableImpl f17566a;

        static {
            ImmutableMap.Builder builder = new ImmutableMap.Builder();
            for (Method method : TypeVariableImpl.class.getMethods()) {
                if (method.getDeclaringClass().equals(TypeVariableImpl.class)) {
                    try {
                        method.setAccessible(true);
                    } catch (AccessControlException unused) {
                    }
                    builder.c(method.getName(), method);
                }
            }
            f17565b = builder.a(false);
        }

        public TypeVariableInvocationHandler(TypeVariableImpl typeVariableImpl) {
            this.f17566a = typeVariableImpl;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            String name = method.getName();
            Method method2 = (Method) f17565b.get(name);
            if (method2 == null) {
                throw new UnsupportedOperationException(name);
            }
            try {
                return method2.invoke(this.f17566a, objArr);
            } catch (InvocationTargetException e8) {
                throw e8.getCause();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class WildcardTypeImpl implements WildcardType, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ImmutableList f17567a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ImmutableList f17568b;

        public WildcardTypeImpl(Type[] typeArr, Type[] typeArr2) {
            Types.b(typeArr, "lower bound for wildcard");
            Types.b(typeArr2, "upper bound for wildcard");
            JavaVersion javaVersion = JavaVersion.CURRENT;
            this.f17567a = javaVersion.c(typeArr);
            this.f17568b = javaVersion.c(typeArr2);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) obj;
                if (this.f17567a.equals(Arrays.asList(wildcardType.getLowerBounds()))) {
                    if (this.f17568b.equals(Arrays.asList(wildcardType.getUpperBounds()))) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getLowerBounds() {
            Joiner joiner = Types.f17555a;
            return (Type[]) this.f17567a.toArray(new Type[0]);
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getUpperBounds() {
            Joiner joiner = Types.f17555a;
            return (Type[]) this.f17568b.toArray(new Type[0]);
        }

        public final int hashCode() {
            return this.f17567a.hashCode() ^ this.f17568b.hashCode();
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("?");
            UnmodifiableListIterator unmodifiableListIteratorListIterator = this.f17567a.listIterator(0);
            while (unmodifiableListIteratorListIterator.hasNext()) {
                Type type = (Type) unmodifiableListIteratorListIterator.next();
                sb2.append(" super ");
                sb2.append(JavaVersion.CURRENT.b(type));
            }
            Joiner joiner = Types.f17555a;
            for (Type type2 : Iterables.b(this.f17568b, Predicates.h(Predicates.e(Object.class)))) {
                sb2.append(" extends ");
                sb2.append(JavaVersion.CURRENT.b(type2));
            }
            return sb2.toString();
        }
    }

    private Types() {
    }

    public static Type a(Type[] typeArr) {
        for (Type type : typeArr) {
            type.getClass();
            final AtomicReference atomicReference = new AtomicReference();
            new TypeVisitor() { // from class: com.google.common.reflect.Types.1
                @Override // com.google.common.reflect.TypeVisitor
                public final void b(Class cls) {
                    atomicReference.set(cls.getComponentType());
                }

                @Override // com.google.common.reflect.TypeVisitor
                public final void c(GenericArrayType genericArrayType) {
                    atomicReference.set(genericArrayType.getGenericComponentType());
                }

                @Override // com.google.common.reflect.TypeVisitor
                public final void e(TypeVariable typeVariable) {
                    atomicReference.set(Types.a(typeVariable.getBounds()));
                }

                @Override // com.google.common.reflect.TypeVisitor
                public final void f(WildcardType wildcardType) {
                    atomicReference.set(Types.a(wildcardType.getUpperBounds()));
                }
            }.a(type);
            Type type2 = (Type) atomicReference.get();
            if (type2 != null) {
                if (type2 instanceof Class) {
                    Class cls = (Class) type2;
                    if (cls.isPrimitive()) {
                        return cls;
                    }
                }
                return new WildcardTypeImpl(new Type[0], new Type[]{type2});
            }
        }
        return null;
    }

    public static void b(Type[] typeArr, String str) {
        for (Type type : typeArr) {
            if (type instanceof Class) {
                Class cls = (Class) type;
                Preconditions.h(!cls.isPrimitive(), MzwEyWCkjXL.Wkq, cls, str);
            }
        }
    }

    public static Type c(Type type) {
        if (!(type instanceof WildcardType)) {
            return JavaVersion.CURRENT.a(type);
        }
        WildcardType wildcardType = (WildcardType) type;
        Type[] lowerBounds = wildcardType.getLowerBounds();
        Preconditions.e("Wildcard cannot have more than one lower bounds.", lowerBounds.length <= 1);
        if (lowerBounds.length == 1) {
            return new WildcardTypeImpl(new Type[]{c(lowerBounds[0])}, new Type[]{Object.class});
        }
        Type[] upperBounds = wildcardType.getUpperBounds();
        Preconditions.e("Wildcard should have only one upper bound.", upperBounds.length == 1);
        return new WildcardTypeImpl(new Type[0], new Type[]{c(upperBounds[0])});
    }

    public static TypeVariable d(GenericDeclaration genericDeclaration, String str, Type... typeArr) {
        if (typeArr.length == 0) {
            typeArr = new Type[]{Object.class};
        }
        TypeVariableInvocationHandler typeVariableInvocationHandler = new TypeVariableInvocationHandler(new TypeVariableImpl(genericDeclaration, str, typeArr));
        Preconditions.f("%s is not an interface", TypeVariable.class.isInterface(), TypeVariable.class);
        return (TypeVariable) TypeVariable.class.cast(Proxy.newProxyInstance(TypeVariable.class.getClassLoader(), new Class[]{TypeVariable.class}, typeVariableInvocationHandler));
    }

    public static ParameterizedType e(Type type, Class cls, Type... typeArr) {
        if (type == null) {
            return new ParameterizedTypeImpl(ClassOwnership.JVM_BEHAVIOR.a(cls), cls, typeArr);
        }
        Preconditions.f("Owner type for unenclosed %s", cls.getEnclosingClass() != null, cls);
        return new ParameterizedTypeImpl(type, cls, typeArr);
    }
}
