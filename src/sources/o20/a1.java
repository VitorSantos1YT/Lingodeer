package o20;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a1 implements ParameterizedType {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Type f44478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Type f44479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Type[] f44480c;

    public a1(Type type, Type type2, Type... typeArr) {
        if (type2 instanceof Class) {
            if ((type == null) != (((Class) type2).getEnclosingClass() == null)) {
                throw new IllegalArgumentException();
            }
        }
        for (Type type3 : typeArr) {
            Objects.requireNonNull(type3, "typeArgument == null");
            c1.d(type3);
        }
        this.f44478a = type;
        this.f44479b = type2;
        this.f44480c = (Type[]) typeArr.clone();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && c1.e(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f44480c.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f44478a;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f44479b;
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.f44480c) ^ this.f44479b.hashCode();
        Type type = this.f44478a;
        return iHashCode ^ (type != null ? type.hashCode() : 0);
    }

    public final String toString() {
        Type[] typeArr = this.f44480c;
        int length = typeArr.length;
        Type type = this.f44479b;
        if (length == 0) {
            return c1.r(type);
        }
        StringBuilder sb2 = new StringBuilder((typeArr.length + 1) * 30);
        sb2.append(c1.r(type));
        sb2.append("<");
        sb2.append(c1.r(typeArr[0]));
        for (int i11 = 1; i11 < typeArr.length; i11++) {
            sb2.append(", ");
            sb2.append(c1.r(typeArr[i11]));
        }
        sb2.append(">");
        return sb2.toString();
    }
}
