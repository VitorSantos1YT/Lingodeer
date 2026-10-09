package kotlin.jvm.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class e implements mz.c, d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f38352b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f38353a;

    static {
        List listL = ns.o.L(fz.a.class, fz.c.class, fz.e.class, fz.f.class, fz.g.class, fz.h.class, fz.i.class, fz.j.class, t1.c.class, t1.c.class, t1.c.class, t1.c.class, fz.b.class, t1.c.class, t1.c.class, t1.c.class, t1.c.class, t1.c.class, t1.c.class, t1.c.class, t1.c.class, t1.c.class, fz.d.class);
        ArrayList arrayList = new ArrayList(ry.n.W(listL, 10));
        int i11 = 0;
        for (Object obj : listL) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                ns.o.V();
                throw null;
            }
            arrayList.add(new qy.l((Class) obj, Integer.valueOf(i11)));
            i11 = i12;
        }
        f38352b = ry.x.g0(arrayList);
    }

    public e(Class jClass) {
        m.f(jClass, "jClass");
        this.f38353a = jClass;
    }

    @Override // kotlin.jvm.internal.d
    public final Class e() {
        return this.f38353a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof e) && qx.b.q(this).equals(qx.b.q((mz.c) obj));
    }

    public final String f() {
        String strG;
        Class jClass = this.f38353a;
        m.f(jClass, "jClass");
        String strConcat = null;
        if (jClass.isAnonymousClass() || jClass.isLocalClass()) {
            return null;
        }
        if (!jClass.isArray()) {
            String strG2 = m.g(jClass.getName());
            return strG2 == null ? jClass.getCanonicalName() : strG2;
        }
        Class<?> componentType = jClass.getComponentType();
        if (componentType.isPrimitive() && (strG = m.g(componentType.getName())) != null) {
            strConcat = strG.concat("Array");
        }
        return strConcat == null ? "kotlin.Array" : strConcat;
    }

    public final String g() {
        String strK;
        Class jClass = this.f38353a;
        m.f(jClass, "jClass");
        String strConcat = null;
        if (jClass.isAnonymousClass()) {
            return null;
        }
        if (!jClass.isLocalClass()) {
            if (!jClass.isArray()) {
                String strK2 = m.k(jClass.getName());
                return strK2 == null ? jClass.getSimpleName() : strK2;
            }
            Class<?> componentType = jClass.getComponentType();
            if (componentType.isPrimitive() && (strK = m.k(componentType.getName())) != null) {
                strConcat = strK.concat("Array");
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String simpleName = jClass.getSimpleName();
        Method enclosingMethod = jClass.getEnclosingMethod();
        if (enclosingMethod != null) {
            return oz.q.a1(simpleName, enclosingMethod.getName() + '$', simpleName);
        }
        Constructor<?> enclosingConstructor = jClass.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            return oz.q.Z0(simpleName, simpleName, '$');
        }
        return oz.q.a1(simpleName, enclosingConstructor.getName() + '$', simpleName);
    }

    public final boolean h(Object obj) {
        Class jClass = this.f38353a;
        m.f(jClass, "jClass");
        Map map = f38352b;
        m.d(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Integer num = (Integer) map.get(jClass);
        if (num != null) {
            return c0.e(num.intValue(), obj);
        }
        if (jClass.isPrimitive()) {
            jClass = qx.b.q(z.a(jClass));
        }
        return jClass.isInstance(obj);
    }

    public final int hashCode() {
        return qx.b.q(this).hashCode();
    }

    public final String toString() {
        return this.f38353a + " (Kotlin reflection is not available)";
    }
}
