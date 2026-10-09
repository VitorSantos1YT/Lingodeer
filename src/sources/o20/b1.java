package o20;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b1 implements WildcardType {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Type f44495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Type f44496b;

    public b1(Type[] typeArr, Type[] typeArr2) {
        if (typeArr2.length > 1) {
            throw new IllegalArgumentException();
        }
        if (typeArr.length != 1) {
            throw new IllegalArgumentException();
        }
        if (typeArr2.length != 1) {
            typeArr[0].getClass();
            c1.d(typeArr[0]);
            this.f44496b = null;
            this.f44495a = typeArr[0];
            return;
        }
        typeArr2[0].getClass();
        c1.d(typeArr2[0]);
        if (typeArr[0] != Object.class) {
            throw new IllegalArgumentException();
        }
        this.f44496b = typeArr2[0];
        this.f44495a = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && c1.e(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f44496b;
        return type != null ? new Type[]{type} : c1.f44500a;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.f44495a};
    }

    public final int hashCode() {
        Type type = this.f44496b;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.f44495a.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.f44496b;
        if (type != null) {
            return "? super " + c1.r(type);
        }
        Type type2 = this.f44495a;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + c1.r(type2);
    }
}
