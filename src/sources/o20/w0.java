package o20;

import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.net.URI;
import java.util.Map;
import okhttp3.Call;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Response;
import sz.xej.iFLeRCXvYCGdPW;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class w0 {
    /* JADX WARN: Code duplicated, block: B:386:0x0900 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:387:0x0902  */
    /* JADX WARN: Code duplicated, block: B:588:0x0919 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:595:0x0904 A[SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static t a(v0 v0Var, Class cls, Method method) {
        Type genericReturnType;
        boolean z11;
        boolean z12;
        boolean z13;
        c1 c1Var;
        int i11;
        int i12;
        c1[] c1VarArr;
        int i13;
        int i14;
        c1 l0Var;
        c1 h0Var;
        c0 c0Var;
        c0 c0Var2;
        r0 r0Var = new r0(v0Var, cls, method);
        Annotation[] annotationArr = r0Var.f44562d;
        int length = annotationArr.length;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            String str = "HEAD";
            boolean z14 = true;
            c1 c1Var2 = null;
            if (i16 >= length) {
                if (r0Var.f44572o == null) {
                    throw c1.l(method, null, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
                }
                if (!r0Var.f44573p) {
                    if (r0Var.f44575r) {
                        throw c1.l(method, null, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                    if (r0Var.f44574q) {
                        throw c1.l(method, null, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                }
                Annotation[][] annotationArr2 = r0Var.f44563e;
                int length2 = annotationArr2.length;
                r0Var.f44580w = new c1[length2];
                int i17 = length2 - 1;
                int i18 = 0;
                while (i18 < length2) {
                    c1[] c1VarArr2 = r0Var.f44580w;
                    Type type = r0Var.f44564f[i18];
                    Annotation[] annotationArr3 = annotationArr2[i18];
                    int i19 = i18 == i17 ? 1 : i15;
                    if (annotationArr3 != null) {
                        int length3 = annotationArr3.length;
                        c1Var = c1Var2;
                        int i21 = i15;
                        while (i21 < length3) {
                            Annotation annotation = annotationArr3[i21];
                            Annotation[][] annotationArr4 = annotationArr2;
                            int i22 = length2;
                            if (annotation instanceof r20.y) {
                                r0Var.c(i18, type);
                                if (r0Var.f44571n) {
                                    throw c1.m(method, i18, "Multiple @Url method annotations found.", new Object[0]);
                                }
                                if (r0Var.f44568j) {
                                    throw c1.m(method, i18, "@Path parameters may not be used with @Url.", new Object[0]);
                                }
                                if (r0Var.f44569k) {
                                    throw c1.m(method, i18, "A @Url parameter must not come after a @Query.", new Object[0]);
                                }
                                if (r0Var.f44570l) {
                                    throw c1.m(method, i18, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                                }
                                if (r0Var.m) {
                                    throw c1.m(method, i18, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                                }
                                if (r0Var.f44576s != null) {
                                    throw c1.m(method, i18, "@Url cannot be used with @%s URL", r0Var.f44572o);
                                }
                                r0Var.f44571n = true;
                                if (type != HttpUrl.class && type != String.class && type != URI.class && (!(type instanceof Class) || !"android.net.Uri".equals(((Class) type).getName()))) {
                                    throw c1.m(method, i18, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
                                }
                                l0Var = new g0(method, i18, 1);
                                i11 = i17;
                            } else {
                                i11 = i17;
                                boolean z15 = annotation instanceof r20.s;
                                v0 v0Var2 = r0Var.f44559a;
                                if (z15) {
                                    r0Var.c(i18, type);
                                    if (r0Var.f44569k) {
                                        throw c1.m(method, i18, "A @Path parameter must not come after a @Query.", new Object[0]);
                                    }
                                    if (r0Var.f44570l) {
                                        throw c1.m(method, i18, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                                    }
                                    if (r0Var.m) {
                                        throw c1.m(method, i18, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                                    }
                                    if (r0Var.f44571n) {
                                        throw c1.m(method, i18, "@Path parameters may not be used with @Url.", new Object[0]);
                                    }
                                    if (r0Var.f44576s == null) {
                                        throw c1.m(method, i18, "@Path can only be used with relative url on @%s", r0Var.f44572o);
                                    }
                                    r0Var.f44568j = true;
                                    r20.s sVar = (r20.s) annotation;
                                    String strValue = sVar.value();
                                    if (!r0.f44558z.matcher(strValue).matches()) {
                                        throw c1.m(method, i18, iFLeRCXvYCGdPW.ymbdpjGMAe, r0.f44557y.pattern(), strValue);
                                    }
                                    if (!r0Var.f44579v.contains(strValue)) {
                                        throw c1.m(method, i18, "URL \"%s\" does not contain \"{%s}\".", r0Var.f44576s, strValue);
                                    }
                                    v0Var2.e(type, annotationArr3);
                                    l0Var = new i0(r0Var.f44561c, i18, strValue, sVar.encoded());
                                } else {
                                    i12 = i21;
                                    c1VarArr = c1VarArr2;
                                    if (annotation instanceof r20.t) {
                                        r0Var.c(i18, type);
                                        r20.t tVar = (r20.t) annotation;
                                        String strValue2 = tVar.value();
                                        boolean zEncoded = tVar.encoded();
                                        i13 = i19;
                                        Class clsH = c1.h(type);
                                        i14 = length3;
                                        r0Var.f44569k = true;
                                        if (!Iterable.class.isAssignableFrom(clsH)) {
                                            if (clsH.isArray()) {
                                                v0Var2.e(r0.a(clsH.getComponentType()), annotationArr3);
                                                c0Var2 = new c0(new e0(2, strValue2, zEncoded), 1);
                                            } else {
                                                v0Var2.e(type, annotationArr3);
                                                l0Var = new e0(2, strValue2, zEncoded);
                                            }
                                            str = str;
                                        } else {
                                            if (!(type instanceof ParameterizedType)) {
                                                throw c1.m(method, i18, clsH.getSimpleName() + " must include generic type (e.g., " + clsH.getSimpleName() + "<String>)", new Object[0]);
                                            }
                                            v0Var2.e(c1.g(0, (ParameterizedType) type), annotationArr3);
                                            c0Var2 = new c0(new e0(2, strValue2, zEncoded), 0);
                                        }
                                        l0Var = c0Var2;
                                        str = str;
                                    } else {
                                        i13 = i19;
                                        i14 = length3;
                                        if (annotation instanceof r20.v) {
                                            r0Var.c(i18, type);
                                            boolean zEncoded2 = ((r20.v) annotation).encoded();
                                            Class clsH2 = c1.h(type);
                                            r0Var.f44570l = true;
                                            if (Iterable.class.isAssignableFrom(clsH2)) {
                                                if (!(type instanceof ParameterizedType)) {
                                                    throw c1.m(method, i18, clsH2.getSimpleName() + " must include generic type (e.g., " + clsH2.getSimpleName() + "<String>)", new Object[0]);
                                                }
                                                v0Var2.e(c1.g(0, (ParameterizedType) type), annotationArr3);
                                                c0Var2 = new c0(new j0(zEncoded2), 0);
                                            } else if (clsH2.isArray()) {
                                                v0Var2.e(r0.a(clsH2.getComponentType()), annotationArr3);
                                                c0Var2 = new c0(new j0(zEncoded2), 1);
                                            } else {
                                                v0Var2.e(type, annotationArr3);
                                                l0Var = new j0(zEncoded2);
                                            }
                                            l0Var = c0Var2;
                                        } else if (annotation instanceof r20.u) {
                                            r0Var.c(i18, type);
                                            Class clsH3 = c1.h(type);
                                            r0Var.m = true;
                                            if (!Map.class.isAssignableFrom(clsH3)) {
                                                throw c1.m(method, i18, "@QueryMap parameter type must be Map.", new Object[0]);
                                            }
                                            Type typeI = c1.i(type, clsH3);
                                            if (!(typeI instanceof ParameterizedType)) {
                                                throw c1.m(method, i18, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                            }
                                            ParameterizedType parameterizedType = (ParameterizedType) typeI;
                                            Type typeG = c1.g(0, parameterizedType);
                                            if (String.class != typeG) {
                                                throw c1.m(method, i18, "@QueryMap keys must be of type String: " + typeG, new Object[0]);
                                            }
                                            v0Var2.e(c1.g(1, parameterizedType), annotationArr3);
                                            l0Var = new f0(method, i18, ((r20.u) annotation).encoded(), 2);
                                        } else {
                                            str = str;
                                            if (annotation instanceof r20.i) {
                                                r0Var.c(i18, type);
                                                r20.i iVar = (r20.i) annotation;
                                                String strValue3 = iVar.value();
                                                Class clsH4 = c1.h(type);
                                                if (Iterable.class.isAssignableFrom(clsH4)) {
                                                    if (!(type instanceof ParameterizedType)) {
                                                        throw c1.m(method, i18, clsH4.getSimpleName() + " must include generic type (e.g., " + clsH4.getSimpleName() + "<String>)", new Object[0]);
                                                    }
                                                    v0Var2.e(c1.g(0, (ParameterizedType) type), annotationArr3);
                                                    h0Var = new c0(new e0(1, strValue3, iVar.allowUnsafeNonAsciiValues()), 0);
                                                } else if (clsH4.isArray()) {
                                                    v0Var2.e(r0.a(clsH4.getComponentType()), annotationArr3);
                                                    h0Var = new c0(new e0(1, strValue3, iVar.allowUnsafeNonAsciiValues()), 1);
                                                } else {
                                                    v0Var2.e(type, annotationArr3);
                                                    l0Var = new e0(1, strValue3, iVar.allowUnsafeNonAsciiValues());
                                                }
                                                l0Var = h0Var;
                                            } else if (annotation instanceof r20.j) {
                                                if (type == Headers.class) {
                                                    l0Var = new g0(method, i18, 0);
                                                } else {
                                                    r0Var.c(i18, type);
                                                    Class clsH5 = c1.h(type);
                                                    if (!Map.class.isAssignableFrom(clsH5)) {
                                                        throw c1.m(method, i18, "@HeaderMap parameter type must be Map or Headers.", new Object[0]);
                                                    }
                                                    Type typeI2 = c1.i(type, clsH5);
                                                    if (!(typeI2 instanceof ParameterizedType)) {
                                                        throw c1.m(method, i18, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                    }
                                                    ParameterizedType parameterizedType2 = (ParameterizedType) typeI2;
                                                    Type typeG2 = c1.g(0, parameterizedType2);
                                                    if (String.class != typeG2) {
                                                        throw c1.m(method, i18, "@HeaderMap keys must be of type String: " + typeG2, new Object[0]);
                                                    }
                                                    v0Var2.e(c1.g(1, parameterizedType2), annotationArr3);
                                                    l0Var = new f0(method, i18, ((r20.j) annotation).allowUnsafeNonAsciiValues(), 1);
                                                }
                                            } else if (annotation instanceof r20.c) {
                                                r0Var.c(i18, type);
                                                if (!r0Var.f44574q) {
                                                    throw c1.m(method, i18, "@Field parameters can only be used with form encoding.", new Object[0]);
                                                }
                                                r20.c cVar = (r20.c) annotation;
                                                String strValue4 = cVar.value();
                                                boolean zEncoded3 = cVar.encoded();
                                                r0Var.f44565g = true;
                                                Class clsH6 = c1.h(type);
                                                if (Iterable.class.isAssignableFrom(clsH6)) {
                                                    if (!(type instanceof ParameterizedType)) {
                                                        throw c1.m(method, i18, clsH6.getSimpleName() + " must include generic type (e.g., " + clsH6.getSimpleName() + "<String>)", new Object[0]);
                                                    }
                                                    v0Var2.e(c1.g(0, (ParameterizedType) type), annotationArr3);
                                                    h0Var = new c0(new e0(0, strValue4, zEncoded3), 0);
                                                } else if (clsH6.isArray()) {
                                                    v0Var2.e(r0.a(clsH6.getComponentType()), annotationArr3);
                                                    h0Var = new c0(new e0(0, strValue4, zEncoded3), 1);
                                                } else {
                                                    v0Var2.e(type, annotationArr3);
                                                    l0Var = new e0(0, strValue4, zEncoded3);
                                                }
                                                l0Var = h0Var;
                                            } else if (annotation instanceof r20.d) {
                                                r0Var.c(i18, type);
                                                if (!r0Var.f44574q) {
                                                    throw c1.m(method, i18, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                                                }
                                                Class clsH7 = c1.h(type);
                                                if (!Map.class.isAssignableFrom(clsH7)) {
                                                    throw c1.m(method, i18, "@FieldMap parameter type must be Map.", new Object[0]);
                                                }
                                                Type typeI3 = c1.i(type, clsH7);
                                                if (!(typeI3 instanceof ParameterizedType)) {
                                                    throw c1.m(method, i18, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                }
                                                ParameterizedType parameterizedType3 = (ParameterizedType) typeI3;
                                                int i23 = 0;
                                                Type typeG3 = c1.g(0, parameterizedType3);
                                                if (String.class != typeG3) {
                                                    throw c1.m(method, i18, "@FieldMap keys must be of type String: " + typeG3, new Object[0]);
                                                }
                                                v0Var2.e(c1.g(1, parameterizedType3), annotationArr3);
                                                r0Var.f44565g = true;
                                                l0Var = new f0(method, i18, ((r20.d) annotation).encoded(), i23);
                                            } else if (annotation instanceof r20.q) {
                                                r0Var.c(i18, type);
                                                if (!r0Var.f44575r) {
                                                    throw c1.m(method, i18, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                                                }
                                                r20.q qVar = (r20.q) annotation;
                                                r0Var.f44566h = true;
                                                String strValue5 = qVar.value();
                                                Class clsH8 = c1.h(type);
                                                if (strValue5.isEmpty()) {
                                                    boolean zIsAssignableFrom = Iterable.class.isAssignableFrom(clsH8);
                                                    k0 k0Var = k0.f44531c;
                                                    if (zIsAssignableFrom) {
                                                        if (!(type instanceof ParameterizedType)) {
                                                            throw c1.m(method, i18, clsH8.getSimpleName() + " must include generic type (e.g., " + clsH8.getSimpleName() + "<String>)", new Object[0]);
                                                        }
                                                        if (!MultipartBody.Part.class.isAssignableFrom(c1.h(c1.g(0, (ParameterizedType) type)))) {
                                                            throw c1.m(method, i18, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                        }
                                                        l0Var = new c0(k0Var, 0);
                                                    } else if (clsH8.isArray()) {
                                                        if (!MultipartBody.Part.class.isAssignableFrom(clsH8.getComponentType())) {
                                                            throw c1.m(method, i18, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                        }
                                                        l0Var = new c0(k0Var, 1);
                                                    } else {
                                                        if (!MultipartBody.Part.class.isAssignableFrom(clsH8)) {
                                                            throw c1.m(method, i18, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                        }
                                                        l0Var = k0Var;
                                                    }
                                                } else {
                                                    String[] strArr = {HttpHeaders.CONTENT_DISPOSITION, ep.a.g("form-data; name=\"", strValue5, "\""), "Content-Transfer-Encoding", qVar.encoding()};
                                                    Headers.f45040b.getClass();
                                                    Headers headersA = Headers.Companion.a(strArr);
                                                    if (Iterable.class.isAssignableFrom(clsH8)) {
                                                        if (!(type instanceof ParameterizedType)) {
                                                            throw c1.m(method, i18, clsH8.getSimpleName() + " must include generic type (e.g., " + clsH8.getSimpleName() + "<String>)", new Object[0]);
                                                        }
                                                        Type typeG4 = c1.g(0, (ParameterizedType) type);
                                                        if (MultipartBody.Part.class.isAssignableFrom(c1.h(typeG4))) {
                                                            throw c1.m(method, i18, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                        }
                                                        c0Var = new c0(new h0(method, i18, headersA, v0Var2.c(typeG4, annotationArr3, annotationArr)), 0);
                                                    } else if (clsH8.isArray()) {
                                                        Class clsA = r0.a(clsH8.getComponentType());
                                                        if (MultipartBody.Part.class.isAssignableFrom(clsA)) {
                                                            throw c1.m(method, i18, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                        }
                                                        c0Var = new c0(new h0(method, i18, headersA, v0Var2.c(clsA, annotationArr3, annotationArr)), 1);
                                                    } else {
                                                        if (MultipartBody.Part.class.isAssignableFrom(clsH8)) {
                                                            throw c1.m(method, i18, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                        }
                                                        h0Var = new h0(method, i18, headersA, v0Var2.c(type, annotationArr3, annotationArr));
                                                        l0Var = h0Var;
                                                    }
                                                    l0Var = c0Var;
                                                }
                                            } else if (annotation instanceof r20.r) {
                                                r0Var.c(i18, type);
                                                if (!r0Var.f44575r) {
                                                    throw c1.m(method, i18, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                                                }
                                                r0Var.f44566h = true;
                                                Class clsH9 = c1.h(type);
                                                if (!Map.class.isAssignableFrom(clsH9)) {
                                                    throw c1.m(method, i18, "@PartMap parameter type must be Map.", new Object[0]);
                                                }
                                                Type typeI4 = c1.i(type, clsH9);
                                                if (!(typeI4 instanceof ParameterizedType)) {
                                                    throw c1.m(method, i18, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                }
                                                ParameterizedType parameterizedType4 = (ParameterizedType) typeI4;
                                                Type typeG5 = c1.g(0, parameterizedType4);
                                                if (String.class != typeG5) {
                                                    throw c1.m(method, i18, "@PartMap keys must be of type String: " + typeG5, new Object[0]);
                                                }
                                                Type typeG6 = c1.g(1, parameterizedType4);
                                                if (MultipartBody.Part.class.isAssignableFrom(c1.h(typeG6))) {
                                                    throw c1.m(method, i18, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                                                }
                                                l0Var = new h0(method, i18, v0Var2.c(typeG6, annotationArr3, annotationArr), ((r20.r) annotation).encoding());
                                            } else if (annotation instanceof r20.a) {
                                                r0Var.c(i18, type);
                                                if (r0Var.f44574q || r0Var.f44575r) {
                                                    throw c1.m(method, i18, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                                                }
                                                if (r0Var.f44567i) {
                                                    throw c1.m(method, i18, "Multiple @Body method annotations found.", new Object[0]);
                                                }
                                                try {
                                                    m mVarC = v0Var2.c(type, annotationArr3, annotationArr);
                                                    r0Var.f44567i = true;
                                                    l0Var = new d0(method, i18, mVarC);
                                                } catch (RuntimeException e8) {
                                                    throw c1.n(method, e8, i18, "Unable to create @Body converter for %s", type);
                                                }
                                            } else if (annotation instanceof r20.x) {
                                                r0Var.c(i18, type);
                                                Class clsA2 = r0.a(c1.h(type));
                                                for (int i24 = i18 - 1; i24 >= 0; i24--) {
                                                    c1 c1Var3 = r0Var.f44580w[i24];
                                                    if ((c1Var3 instanceof l0) && ((l0) c1Var3).f44532c.equals(clsA2)) {
                                                        throw c1.m(method, i18, "@Tag type " + clsA2.getName() + " is duplicate of " + m0.f44534b.c(method, i24) + " and would always overwrite its value.", new Object[0]);
                                                    }
                                                }
                                                l0Var = new l0(clsA2);
                                            } else {
                                                l0Var = null;
                                            }
                                        }
                                        str = str;
                                    }
                                }
                                if (l0Var != null) {
                                    if (c1Var == null) {
                                        throw c1.m(method, i18, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                                    }
                                    c1Var = l0Var;
                                }
                                i21 = i12 + 1;
                                annotationArr2 = annotationArr4;
                                i17 = i11;
                                length2 = i22;
                                i19 = i13;
                                str = str;
                                c1VarArr2 = c1VarArr;
                                length3 = i14;
                            }
                            i12 = i21;
                            c1VarArr = c1VarArr2;
                            i13 = i19;
                            i14 = length3;
                            if (l0Var != null) {
                                if (c1Var == null) {
                                    throw c1.m(method, i18, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                                }
                                c1Var = l0Var;
                            }
                            i21 = i12 + 1;
                            annotationArr2 = annotationArr4;
                            i17 = i11;
                            length2 = i22;
                            i19 = i13;
                            str = str;
                            c1VarArr2 = c1VarArr;
                            length3 = i14;
                        }
                    } else {
                        c1Var = null;
                    }
                    Annotation[][] annotationArr5 = annotationArr2;
                    int i25 = length2;
                    String str2 = str;
                    int i26 = i17;
                    c1[] c1VarArr3 = c1VarArr2;
                    int i27 = i19;
                    if (c1Var == null) {
                        if (i27 != 0) {
                            try {
                                if (c1.h(type) == vy.d.class) {
                                    r0Var.f44581x = true;
                                    c1Var = null;
                                }
                            } catch (NoClassDefFoundError unused) {
                            }
                        }
                        throw c1.m(method, i18, "No Retrofit annotation found.", new Object[0]);
                    }
                    c1VarArr3[i18] = c1Var;
                    i18++;
                    annotationArr2 = annotationArr5;
                    i17 = i26;
                    length2 = i25;
                    str = str2;
                    i15 = 0;
                    c1Var2 = null;
                }
                String str3 = str;
                if (r0Var.f44576s == null && !r0Var.f44571n) {
                    throw c1.l(method, null, "Missing either @%s URL or @Url parameter.", r0Var.f44572o);
                }
                boolean z16 = r0Var.f44574q;
                if (!z16 && !r0Var.f44575r && !r0Var.f44573p && r0Var.f44567i) {
                    throw c1.l(method, null, "Non-body HTTP method cannot contain @Body.", new Object[0]);
                }
                if (z16 && !r0Var.f44565g) {
                    throw c1.l(method, null, "Form-encoded method must contain at least one @Field.", new Object[0]);
                }
                if (r0Var.f44575r && !r0Var.f44566h) {
                    throw c1.l(method, null, "Multipart method must contain at least one @Part.", new Object[0]);
                }
                s0 s0Var = new s0(r0Var);
                Type genericReturnType2 = method.getGenericReturnType();
                if (c1.j(genericReturnType2)) {
                    throw c1.l(method, null, "Method return type must not include a type variable or wildcard: %s", genericReturnType2);
                }
                if (genericReturnType2 == Void.TYPE) {
                    throw c1.l(method, null, "Service methods cannot return void.", new Object[0]);
                }
                Annotation[] annotations = method.getAnnotations();
                boolean z17 = s0Var.f44594l;
                if (z17) {
                    Type[] genericParameterTypes = method.getGenericParameterTypes();
                    Type typeG7 = ((ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]).getActualTypeArguments()[0];
                    if (typeG7 instanceof WildcardType) {
                        typeG7 = ((WildcardType) typeG7).getLowerBounds()[0];
                    }
                    if (c1.h(typeG7) == t0.class && (typeG7 instanceof ParameterizedType)) {
                        typeG7 = c1.g(0, (ParameterizedType) typeG7);
                        z12 = true;
                        z13 = false;
                    } else {
                        if (c1.h(typeG7) == e.class) {
                            throw c1.l(method, null, "Suspend functions should not return Call, as they already execute asynchronously.\nChange its return type to %s", c1.g(0, (ParameterizedType) typeG7));
                        }
                        z13 = c1.f44501b && typeG7 == qy.b0.class;
                        z12 = false;
                    }
                    genericReturnType = new a1(null, e.class, typeG7);
                    if (!c1.k(annotations, x0.class)) {
                        Annotation[] annotationArr6 = new Annotation[annotations.length + 1];
                        annotationArr6[0] = y0.f44622b;
                        System.arraycopy(annotations, 0, annotationArr6, 1, annotations.length);
                        annotations = annotationArr6;
                    }
                    z11 = z13;
                } else {
                    genericReturnType = method.getGenericReturnType();
                    z11 = false;
                    z12 = false;
                }
                try {
                    g gVarA = v0Var.a(genericReturnType, annotations);
                    Type typeK = gVarA.k();
                    if (typeK == Response.class) {
                        throw c1.l(method, null, "'" + c1.h(typeK).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
                    }
                    if (typeK == t0.class) {
                        throw c1.l(method, null, "Response must include generic type (e.g., Response<String>)", new Object[0]);
                    }
                    if (s0Var.f44586d.equals(str3) && !Void.class.equals(typeK) && (!c1.f44501b || typeK != qy.b0.class)) {
                        throw c1.l(method, null, "HEAD method must use Void or Unit as response type.", new Object[0]);
                    }
                    try {
                        m mVarD = v0Var.d(typeK, method.getAnnotations());
                        Call.Factory factory = v0Var.f44611b;
                        if (z17) {
                            return z12 ? new s(s0Var, factory, mVarD, gVarA) : new r(s0Var, factory, mVarD, gVarA, z11);
                        }
                        return new q(s0Var, factory, mVarD, gVarA);
                    } catch (RuntimeException e10) {
                        throw c1.l(method, e10, "Unable to create converter for %s", typeK);
                    }
                } catch (RuntimeException e11) {
                    throw c1.l(method, e11, "Unable to create call adapter for %s", genericReturnType);
                }
            }
            Annotation annotation2 = annotationArr[i16];
            if (annotation2 instanceof r20.b) {
                r0Var.b("DELETE", ((r20.b) annotation2).value(), false);
            } else if (annotation2 instanceof r20.f) {
                r0Var.b("GET", ((r20.f) annotation2).value(), false);
            } else if (annotation2 instanceof r20.g) {
                r0Var.b("HEAD", ((r20.g) annotation2).value(), false);
            } else if (annotation2 instanceof r20.n) {
                r0Var.b("PATCH", ((r20.n) annotation2).value(), true);
            } else if (annotation2 instanceof r20.o) {
                r0Var.b("POST", ((r20.o) annotation2).value(), true);
            } else if (annotation2 instanceof r20.p) {
                r0Var.b("PUT", ((r20.p) annotation2).value(), true);
            } else if (annotation2 instanceof r20.m) {
                r0Var.b("OPTIONS", ((r20.m) annotation2).value(), false);
            } else if (annotation2 instanceof r20.h) {
                r20.h hVar = (r20.h) annotation2;
                r0Var.b(hVar.method(), hVar.path(), hVar.hasBody());
            } else if (annotation2 instanceof r20.k) {
                r20.k kVar = (r20.k) annotation2;
                String[] strArrValue = kVar.value();
                if (strArrValue.length == 0) {
                    throw c1.l(method, null, "@Headers annotation is empty.", new Object[0]);
                }
                boolean zAllowUnsafeNonAsciiValues = kVar.allowUnsafeNonAsciiValues();
                Headers.Builder builder = new Headers.Builder();
                int length4 = strArrValue.length;
                int i28 = 0;
                while (i28 < length4) {
                    String str4 = strArrValue[i28];
                    int iIndexOf = str4.indexOf(58);
                    boolean z18 = z14;
                    if (iIndexOf == -1 || iIndexOf == 0 || iIndexOf == str4.length() - 1) {
                        throw c1.l(method, null, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str4);
                    }
                    String strSubstring = str4.substring(0, iIndexOf);
                    String strTrim = str4.substring(iIndexOf + 1).trim();
                    if (HttpHeaders.CONTENT_TYPE.equalsIgnoreCase(strSubstring)) {
                        try {
                            MediaType.f45062e.getClass();
                            r0Var.f44578u = MediaType.Companion.a(strTrim);
                        } catch (IllegalArgumentException e12) {
                            throw c1.l(method, e12, "Malformed content type: %s", strTrim);
                        }
                    } else if (zAllowUnsafeNonAsciiValues) {
                        builder.c(strSubstring, strTrim);
                    } else {
                        builder.a(strSubstring, strTrim);
                    }
                    i28++;
                    z14 = z18;
                }
                r0Var.f44577t = builder.d();
            } else if (annotation2 instanceof r20.l) {
                if (r0Var.f44574q) {
                    throw c1.l(method, null, "Only one encoding annotation is allowed.", new Object[0]);
                }
                r0Var.f44575r = true;
            } else if (!(annotation2 instanceof r20.e)) {
                continue;
            } else {
                if (r0Var.f44575r) {
                    throw c1.l(method, null, "Only one encoding annotation is allowed.", new Object[0]);
                }
                r0Var.f44574q = true;
            }
            i16++;
        }
    }
}
