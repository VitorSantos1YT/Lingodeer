package o20;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.Headers;
import okhttp3.MediaType;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class r0 {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final Pattern f44557y = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final Pattern f44558z = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v0 f44559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f44560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Method f44561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Annotation[] f44562d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Annotation[][] f44563e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Type[] f44564f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f44565g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f44566h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f44567i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f44568j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f44569k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f44570l;
    public boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f44571n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f44572o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f44573p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f44574q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f44575r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f44576s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Headers f44577t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public MediaType f44578u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public LinkedHashSet f44579v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public c1[] f44580w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f44581x;

    public r0(v0 v0Var, Class cls, Method method) {
        this.f44559a = v0Var;
        this.f44560b = cls;
        this.f44561c = method;
        this.f44562d = method.getAnnotations();
        this.f44564f = method.getGenericParameterTypes();
        this.f44563e = method.getParameterAnnotations();
    }

    public static Class a(Class cls) {
        if (Boolean.TYPE == cls) {
            return Boolean.class;
        }
        if (Byte.TYPE == cls) {
            return Byte.class;
        }
        if (Character.TYPE == cls) {
            return Character.class;
        }
        if (Double.TYPE == cls) {
            return Double.class;
        }
        if (Float.TYPE == cls) {
            return Float.class;
        }
        if (Integer.TYPE == cls) {
            return Integer.class;
        }
        if (Long.TYPE == cls) {
            return Long.class;
        }
        return Short.TYPE == cls ? Short.class : cls;
    }

    public final void b(String str, String str2, boolean z11) {
        String str3 = this.f44572o;
        Method method = this.f44561c;
        if (str3 != null) {
            throw c1.l(method, null, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
        }
        this.f44572o = str;
        this.f44573p = z11;
        if (str2.isEmpty()) {
            return;
        }
        int iIndexOf = str2.indexOf(63);
        Pattern pattern = f44557y;
        if (iIndexOf != -1 && iIndexOf < str2.length() - 1) {
            String strSubstring = str2.substring(iIndexOf + 1);
            if (pattern.matcher(strSubstring).find()) {
                throw c1.l(method, null, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", strSubstring);
            }
        }
        this.f44576s = str2;
        Matcher matcher = pattern.matcher(str2);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (matcher.find()) {
            linkedHashSet.add(matcher.group(1));
        }
        this.f44579v = linkedHashSet;
    }

    public final void c(int i11, Type type) {
        if (c1.j(type)) {
            throw c1.m(this.f44561c, i11, "Parameter type must not include a type variable or wildcard: %s", type);
        }
    }
}
