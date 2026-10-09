package g00;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.SerializationException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e00.g[] f28374a = new e00.g[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c00.a[] f28375b = new c00.a[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f28376c = new Object();

    public static final h0 a(c00.a aVar, String str) {
        return new h0(str, new i0(aVar));
    }

    public static final Set b(e00.g gVar) {
        kotlin.jvm.internal.m.f(gVar, "<this>");
        if (gVar instanceof l) {
            return ((l) gVar).b();
        }
        HashSet hashSet = new HashSet(gVar.f());
        int iF = gVar.f();
        for (int i11 = 0; i11 < iF; i11++) {
            hashSet.add(gVar.g(i11));
        }
        return hashSet;
    }

    public static final e00.g[] c(List list) {
        e00.g[] gVarArr;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        return (list == null || (gVarArr = (e00.g[]) list.toArray(new e00.g[0])) == null) ? f28374a : gVarArr;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00cd  */
    public static final c00.a d(mz.c cVar, c00.a... args) throws IllegalAccessException, InvocationTargetException {
        Object obj;
        c00.a aVar;
        Class<?> cls;
        Object obj2;
        c00.a aVarH;
        Field field;
        c00.e eVar;
        kotlin.jvm.internal.m.f(cVar, "<this>");
        kotlin.jvm.internal.m.f(args, "args");
        Class clsP = qx.b.p(cVar);
        c00.a[] args2 = (c00.a[]) Arrays.copyOf(args, args.length);
        kotlin.jvm.internal.m.f(args2, "args");
        if (clsP.isEnum() && clsP.getAnnotation(c00.e.class) == null && clsP.getAnnotation(c00.b.class) == null) {
            Object[] enumConstants = clsP.getEnumConstants();
            String canonicalName = clsP.getCanonicalName();
            kotlin.jvm.internal.m.e(canonicalName, "getCanonicalName(...)");
            kotlin.jvm.internal.m.d(enumConstants, "null cannot be cast to non-null type kotlin.Array<out kotlin.Enum<*>>");
            return new a0(canonicalName, (Enum[]) enumConstants);
        }
        c00.a[] aVarArr = (c00.a[]) Arrays.copyOf(args2, args2.length);
        c00.c cVar2 = null;
        try {
            Field declaredField = clsP.getDeclaredField("Companion");
            declaredField.setAccessible(true);
            obj = declaredField.get(null);
        } catch (Throwable unused) {
            obj = null;
        }
        c00.a aVarH2 = obj == null ? null : h(obj, (c00.a[]) Arrays.copyOf(aVarArr, aVarArr.length));
        if (aVarH2 != null) {
            return aVarH2;
        }
        String canonicalName2 = clsP.getCanonicalName();
        if (canonicalName2 == null || oz.x.s0(canonicalName2, "java.", false) || oz.x.s0(canonicalName2, "kotlin.", false)) {
            aVar = null;
        } else {
            Field[] declaredFields = clsP.getDeclaredFields();
            kotlin.jvm.internal.m.e(declaredFields, "getDeclaredFields(...)");
            int length = declaredFields.length;
            Field field2 = null;
            int i11 = 0;
            boolean z11 = false;
            while (true) {
                if (i11 >= length) {
                    if (!z11) {
                        break;
                    }
                    break;
                }
                Field field3 = declaredFields[i11];
                if (kotlin.jvm.internal.m.a(field3.getName(), "INSTANCE") && kotlin.jvm.internal.m.a(field3.getType(), clsP) && Modifier.isStatic(field3.getModifiers())) {
                    if (!z11) {
                        z11 = true;
                        field2 = field3;
                    }
                }
                i11++;
                field2 = null;
                break;
            }
            if (field2 == null) {
                aVar = null;
            } else {
                Object obj3 = field2.get(null);
                Method[] methods = clsP.getMethods();
                kotlin.jvm.internal.m.e(methods, "getMethods(...)");
                int length2 = methods.length;
                Method method = null;
                int i12 = 0;
                boolean z12 = false;
                while (true) {
                    if (i12 >= length2) {
                        if (!z12) {
                            break;
                        }
                        break;
                    }
                    Method method2 = methods[i12];
                    if (kotlin.jvm.internal.m.a(method2.getName(), "serializer")) {
                        Class<?>[] parameterTypes = method2.getParameterTypes();
                        kotlin.jvm.internal.m.e(parameterTypes, "getParameterTypes(...)");
                        if (parameterTypes.length == 0 && kotlin.jvm.internal.m.a(method2.getReturnType(), c00.a.class)) {
                            if (!z12) {
                                z12 = true;
                                method = method2;
                            }
                        }
                    }
                    i12++;
                    method = null;
                    break;
                }
                if (method == null) {
                    aVar = null;
                } else {
                    Object objInvoke = method.invoke(obj3, null);
                    if (objInvoke instanceof c00.a) {
                        aVar = (c00.a) objInvoke;
                    } else {
                        aVar = null;
                    }
                }
            }
        }
        if (aVar != null) {
            return aVar;
        }
        c00.a[] aVarArr2 = (c00.a[]) Arrays.copyOf(args2, args2.length);
        Class<?>[] declaredClasses = clsP.getDeclaredClasses();
        kotlin.jvm.internal.m.e(declaredClasses, "getDeclaredClasses(...)");
        int length3 = declaredClasses.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length3) {
                cls = null;
                break;
            }
            cls = declaredClasses[i13];
            if (cls.getAnnotation(w0.class) != null) {
                break;
            }
            i13++;
        }
        if (cls == null) {
            obj2 = null;
        } else {
            try {
                Field declaredField2 = clsP.getDeclaredField(cls.getSimpleName());
                declaredField2.setAccessible(true);
                obj2 = declaredField2.get(null);
            } catch (Throwable unused2) {
                obj2 = null;
            }
        }
        if (obj2 == null || (aVarH = h(obj2, (c00.a[]) Arrays.copyOf(aVarArr2, aVarArr2.length))) == null) {
            try {
                Class<?>[] declaredClasses2 = clsP.getDeclaredClasses();
                kotlin.jvm.internal.m.e(declaredClasses2, "getDeclaredClasses(...)");
                int length4 = declaredClasses2.length;
                Class<?> cls2 = null;
                int i14 = 0;
                boolean z13 = false;
                while (true) {
                    if (i14 < length4) {
                        Class<?> cls3 = declaredClasses2[i14];
                        if (cls3.getSimpleName().equals("$serializer")) {
                            if (!z13) {
                                z13 = true;
                                cls2 = cls3;
                            }
                        }
                        i14++;
                    } else if (!z13) {
                    }
                    cls2 = null;
                    break;
                }
                Object obj4 = (cls2 == null || (field = cls2.getField("INSTANCE")) == null) ? null : field.get(null);
                aVarH = obj4 instanceof c00.a ? (c00.a) obj4 : null;
            } catch (NoSuchFieldException unused3) {
            }
        }
        if (aVarH != null) {
            return aVarH;
        }
        if (clsP.getAnnotation(c00.b.class) != null || ((eVar = (c00.e) clsP.getAnnotation(c00.e.class)) != null && kotlin.jvm.internal.z.a(eVar.with()).equals(kotlin.jvm.internal.z.a(c00.c.class)))) {
            cVar2 = new c00.c(kotlin.jvm.internal.z.a(clsP));
        }
        return cVar2;
    }

    public static final a0 e(String str, Enum[] values, String[] strArr, Annotation[][] annotationArr) {
        kotlin.jvm.internal.m.f(values, "values");
        z zVar = new z(str, values.length);
        int length = values.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            Enum r9 = values[i11];
            int i13 = i12 + 1;
            String strName = (String) ry.l.Y(i12, strArr);
            if (strName == null) {
                strName = r9.name();
            }
            zVar.k(strName, false);
            Annotation[] annotationArr2 = (Annotation[]) ry.l.Y(i12, annotationArr);
            if (annotationArr2 != null) {
                for (Annotation annotation : annotationArr2) {
                    kotlin.jvm.internal.m.f(annotation, "annotation");
                    int i14 = zVar.f28392d;
                    List[] listArr = zVar.f28394f;
                    List arrayList = listArr[i14];
                    if (arrayList == null) {
                        arrayList = new ArrayList(1);
                        listArr[zVar.f28392d] = arrayList;
                    }
                    arrayList.add(annotation);
                }
            }
            i11++;
            i12 = i13;
        }
        a0 a0Var = new a0(str, values);
        a0Var.f28357b = zVar;
        return a0Var;
    }

    public static final a0 f(String str, Enum[] values) {
        kotlin.jvm.internal.m.f(values, "values");
        return new a0(str, values);
    }

    public static final int g(e00.g gVar, e00.g[] typeParams) {
        kotlin.jvm.internal.m.f(typeParams, "typeParams");
        int iHashCode = (gVar.a().hashCode() * 31) + Arrays.hashCode(typeParams);
        int iF = gVar.f();
        int i11 = 1;
        while (true) {
            int iHashCode2 = 0;
            if (!(iF > 0)) {
                break;
            }
            int i12 = iF - 1;
            int i13 = i11 * 31;
            String strA = gVar.i(gVar.f() - iF).a();
            if (strA != null) {
                iHashCode2 = strA.hashCode();
            }
            i11 = i13 + iHashCode2;
            iF = i12;
        }
        int iF2 = gVar.f();
        int iHashCode3 = 1;
        while (true) {
            if (!(iF2 > 0)) {
                return (((iHashCode * 31) + i11) * 31) + iHashCode3;
            }
            int i14 = iF2 - 1;
            int i15 = iHashCode3 * 31;
            o00.a aVarE = gVar.i(gVar.f() - iF2).e();
            iHashCode3 = i15 + (aVarE != null ? aVarE.hashCode() : 0);
            iF2 = i14;
        }
    }

    public static final c00.a h(Object obj, c00.a... aVarArr) throws IllegalAccessException, InvocationTargetException {
        Class[] clsArr;
        try {
            if (aVarArr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = aVarArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i11 = 0; i11 < length; i11++) {
                    clsArr2[i11] = c00.a.class;
                }
                clsArr = clsArr2;
            }
            Object objInvoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(aVarArr, aVarArr.length));
            if (objInvoke instanceof c00.a) {
                return (c00.a) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e8) {
            Throwable cause = e8.getCause();
            if (cause == null) {
                throw e8;
            }
            String message = cause.getMessage();
            if (message == null) {
                message = e8.getMessage();
            }
            throw new InvocationTargetException(cause, message);
        }
    }

    public static final boolean i(mz.c cVar) {
        kotlin.jvm.internal.m.f(cVar, "<this>");
        return qx.b.p(cVar).isInterface();
    }

    public static final mz.c j(mz.k kVar) {
        mz.c cVarD = kVar.d();
        if (cVarD instanceof mz.c) {
            return cVarD;
        }
        throw new IllegalArgumentException("Only KClass supported as classifier, got " + cVarD);
    }

    public static final void k(int i11, int i12, e00.g descriptor) {
        kotlin.jvm.internal.m.f(descriptor, "descriptor");
        ArrayList arrayList = new ArrayList();
        int i13 = (~i11) & i12;
        for (int i14 = 0; i14 < 32; i14++) {
            if ((i13 & 1) != 0) {
                arrayList.add(descriptor.g(i14));
            }
            i13 >>>= 1;
        }
        String serialName = descriptor.a();
        kotlin.jvm.internal.m.f(serialName, "serialName");
        throw new MissingFieldException(arrayList, arrayList.size() == 1 ? defpackage.e.p(new StringBuilder("Field '"), (String) arrayList.get(0), "' is required for type with serial name '", serialName, "', but it was missing") : "Fields " + arrayList + " are required for type with serial name '" + serialName + "', but they were missing", null);
    }

    public static final void l(String str, mz.c baseClass) {
        String string;
        kotlin.jvm.internal.m.f(baseClass, "baseClass");
        StringBuilder sb2 = new StringBuilder("in the polymorphic scope of '");
        kotlin.jvm.internal.e eVar = (kotlin.jvm.internal.e) baseClass;
        sb2.append(eVar.g());
        sb2.append('\'');
        String string2 = sb2.toString();
        if (str == null) {
            string = nv.p.q("Class discriminator was missing and no default serializers were registered ", string2, '.');
        } else {
            StringBuilder sbS = defpackage.e.s("Serializer for subclass '", str, "' is not found ", string2, ".\nCheck if class with serial name '");
            com.google.android.material.datepicker.d.w(sbS, str, "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '", str, "' has to be '@Serializable', and the base class '");
            sbS.append(eVar.g());
            sbS.append("' has to be sealed and '@Serializable'.");
            string = sbS.toString();
        }
        throw new SerializationException(string);
    }

    public static final String m(e00.g gVar) {
        return ry.m.y0(hz.b.U(0, gVar.f()), ", ", gVar.a() + '(', ")", new g1(gVar, 0), 24);
    }
}
