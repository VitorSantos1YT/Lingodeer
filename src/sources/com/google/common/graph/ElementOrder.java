package com.google.common.graph;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.errorprone.annotations.Immutable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@Immutable
@ElementTypesAreNonnullByDefault
public final class ElementOrder<T> {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Type {
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type INSERTION;
        public static final Type SORTED;
        public static final Type STABLE;
        public static final Type UNORDERED;

        static {
            Type type = new Type("UNORDERED", 0);
            UNORDERED = type;
            Type type2 = new Type("STABLE", 1);
            STABLE = type2;
            Type type3 = new Type("INSERTION", 2);
            INSERTION = type3;
            Type type4 = new Type("SORTED", 3);
            SORTED = type4;
            $VALUES = new Type[]{type, type2, type3, type4};
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof ElementOrder) && Objects.a(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, null});
    }

    public final String toString() {
        MoreObjects.ToStringHelper toStringHelperB = MoreObjects.b(this);
        toStringHelperB.c(null, "type");
        return toStringHelperB.toString();
    }
}
