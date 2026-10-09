package com.google.common.base;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public final class Predicates {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class AndPredicate<T> implements Predicate<T>, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f16376a;

        public AndPredicate(List list) {
            this.f16376a = list;
        }

        @Override // com.google.common.base.Predicate
        public final boolean apply(Object obj) {
            int i11 = 0;
            while (true) {
                List list = this.f16376a;
                if (i11 >= list.size()) {
                    return true;
                }
                if (!((Predicate) list.get(i11)).apply(obj)) {
                    return false;
                }
                i11++;
            }
        }

        @Override // com.google.common.base.Predicate
        public final boolean equals(Object obj) {
            if (obj instanceof AndPredicate) {
                return this.f16376a.equals(((AndPredicate) obj).f16376a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f16376a.hashCode() + 306654252;
        }

        public final String toString() {
            return Predicates.a("and", this.f16376a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class CompositionPredicate<A, B> implements Predicate<A>, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Predicate f16377a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Function f16378b;

        public CompositionPredicate(Predicate predicate, Function function) {
            predicate.getClass();
            this.f16377a = predicate;
            function.getClass();
            this.f16378b = function;
        }

        @Override // com.google.common.base.Predicate
        public final boolean apply(Object obj) {
            return this.f16377a.apply(this.f16378b.apply(obj));
        }

        @Override // com.google.common.base.Predicate
        public final boolean equals(Object obj) {
            if (obj instanceof CompositionPredicate) {
                CompositionPredicate compositionPredicate = (CompositionPredicate) obj;
                if (this.f16378b.equals(compositionPredicate.f16378b) && this.f16377a.equals(compositionPredicate.f16377a)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.f16378b.hashCode() ^ this.f16377a.hashCode();
        }

        public final String toString() {
            return this.f16377a + "(" + this.f16378b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class ContainsPatternFromStringPredicate extends ContainsPatternPredicate {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.base.Predicates.ContainsPatternPredicate
        public final String toString() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class ContainsPatternPredicate implements Predicate<CharSequence>, Serializable {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.base.Predicate
        public final boolean apply(Object obj) {
            throw null;
        }

        @Override // com.google.common.base.Predicate
        public final boolean equals(Object obj) {
            if (obj instanceof ContainsPatternPredicate) {
                throw null;
            }
            return false;
        }

        public final int hashCode() {
            throw null;
        }

        public String toString() {
            MoreObjects.b(null);
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class InPredicate<T> implements Predicate<T>, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Collection f16379a;

        public InPredicate(Collection collection) {
            collection.getClass();
            this.f16379a = collection;
        }

        @Override // com.google.common.base.Predicate
        public final boolean apply(Object obj) {
            try {
                return this.f16379a.contains(obj);
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }

        @Override // com.google.common.base.Predicate
        public final boolean equals(Object obj) {
            if (obj instanceof InPredicate) {
                return this.f16379a.equals(((InPredicate) obj).f16379a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f16379a.hashCode();
        }

        public final String toString() {
            return "Predicates.in(" + this.f16379a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class InstanceOfPredicate<T> implements Predicate<T>, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class f16380a;

        public InstanceOfPredicate(Class cls) {
            cls.getClass();
            this.f16380a = cls;
        }

        @Override // com.google.common.base.Predicate
        public final boolean apply(Object obj) {
            return this.f16380a.isInstance(obj);
        }

        @Override // com.google.common.base.Predicate
        public final boolean equals(Object obj) {
            return (obj instanceof InstanceOfPredicate) && this.f16380a == ((InstanceOfPredicate) obj).f16380a;
        }

        public final int hashCode() {
            return this.f16380a.hashCode();
        }

        public final String toString() {
            return "Predicates.instanceOf(" + this.f16380a.getName() + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class IsEqualToPredicate implements Predicate<Object>, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f16381a;

        public IsEqualToPredicate(Object obj) {
            this.f16381a = obj;
        }

        @Override // com.google.common.base.Predicate
        public final boolean apply(Object obj) {
            return this.f16381a.equals(obj);
        }

        @Override // com.google.common.base.Predicate
        public final boolean equals(Object obj) {
            if (obj instanceof IsEqualToPredicate) {
                return this.f16381a.equals(((IsEqualToPredicate) obj).f16381a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f16381a.hashCode();
        }

        public final String toString() {
            return "Predicates.equalTo(" + this.f16381a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class NotPredicate<T> implements Predicate<T>, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f16382a;

        public NotPredicate(Predicate predicate) {
            this.f16382a = predicate;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.google.common.base.Predicate, java.lang.Object] */
        @Override // com.google.common.base.Predicate
        public final boolean apply(Object obj) {
            return !this.f16382a.apply(obj);
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [com.google.common.base.Predicate, java.lang.Object] */
        @Override // com.google.common.base.Predicate
        public final boolean equals(Object obj) {
            if (obj instanceof NotPredicate) {
                return this.f16382a.equals(((NotPredicate) obj).f16382a);
            }
            return false;
        }

        public final int hashCode() {
            return ~this.f16382a.hashCode();
        }

        public final String toString() {
            return "Predicates.not(" + this.f16382a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public enum ObjectPredicate implements Predicate<Object> {
        ALWAYS_TRUE { // from class: com.google.common.base.Predicates.ObjectPredicate.1
            @Override // com.google.common.base.Predicate
            public final boolean apply(Object obj) {
                return true;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Predicates.alwaysTrue()";
            }
        },
        ALWAYS_FALSE { // from class: com.google.common.base.Predicates.ObjectPredicate.2
            @Override // com.google.common.base.Predicate
            public final boolean apply(Object obj) {
                return false;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Predicates.alwaysFalse()";
            }
        },
        IS_NULL { // from class: com.google.common.base.Predicates.ObjectPredicate.3
            @Override // com.google.common.base.Predicate
            public final boolean apply(Object obj) {
                return obj == null;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Predicates.isNull()";
            }
        },
        NOT_NULL { // from class: com.google.common.base.Predicates.ObjectPredicate.4
            @Override // com.google.common.base.Predicate
            public final boolean apply(Object obj) {
                return obj != null;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Predicates.notNull()";
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class OrPredicate<T> implements Predicate<T>, Serializable {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.base.Predicate
        public final boolean apply(Object obj) {
            throw null;
        }

        @Override // com.google.common.base.Predicate
        public final boolean equals(Object obj) {
            if (obj instanceof OrPredicate) {
                throw null;
            }
            return false;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return Predicates.a("or", null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class SubtypeOfPredicate implements Predicate<Class<?>>, Serializable {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.base.Predicate
        public final boolean apply(Object obj) {
            throw null;
        }

        @Override // com.google.common.base.Predicate
        public final boolean equals(Object obj) {
            return obj instanceof SubtypeOfPredicate;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            throw null;
        }
    }

    private Predicates() {
    }

    public static String a(String str, Iterable iterable) {
        StringBuilder sb2 = new StringBuilder("Predicates.");
        sb2.append(str);
        sb2.append('(');
        boolean z11 = true;
        for (Object obj : iterable) {
            if (!z11) {
                sb2.append(',');
            }
            sb2.append(obj);
            z11 = false;
        }
        sb2.append(')');
        return sb2.toString();
    }

    public static Predicate b() {
        ObjectPredicate objectPredicate = ObjectPredicate.ALWAYS_TRUE;
        objectPredicate.getClass();
        return objectPredicate;
    }

    public static Predicate c(Predicate predicate, Predicate predicate2) {
        predicate.getClass();
        predicate2.getClass();
        return new AndPredicate(Arrays.asList(predicate, predicate2));
    }

    public static Predicate d(Predicate predicate, Function function) {
        return new CompositionPredicate(predicate, function);
    }

    public static Predicate e(Object obj) {
        return new IsEqualToPredicate(obj);
    }

    public static Predicate f(Collection collection) {
        return new InPredicate(collection);
    }

    public static Predicate g(Class cls) {
        return new InstanceOfPredicate(cls);
    }

    public static Predicate h(Predicate predicate) {
        return new NotPredicate(predicate);
    }
}
