package o20;

import java.lang.annotation.Annotation;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import okhttp3.Call;
import okhttp3.HttpUrl;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f44610a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Call.Factory f44611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HttpUrl f44612c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f44613d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f44614e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Executor f44615f;

    public v0(Call.Factory factory, HttpUrl httpUrl, List list, List list2, Executor executor) {
        this.f44611b = factory;
        this.f44612c = httpUrl;
        this.f44613d = list;
        this.f44614e = list2;
        this.f44615f = executor;
    }

    public final g a(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List list = this.f44614e;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i11 = iIndexOf; i11 < size; i11++) {
            g gVarA = ((f) list.get(i11)).a(type, annotationArr);
            if (gVarA != null) {
                return gVarA;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate call adapter for ");
        sb2.append(type);
        sb2.append(".\n  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(((f) list.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public final Object b(Class cls) {
        if (!cls.isInterface()) {
            throw new IllegalArgumentException("API declarations must be interfaces.");
        }
        ArrayDeque arrayDeque = new ArrayDeque(1);
        arrayDeque.add(cls);
        while (!arrayDeque.isEmpty()) {
            Class cls2 = (Class) arrayDeque.removeFirst();
            if (cls2.getTypeParameters().length != 0) {
                StringBuilder sb2 = new StringBuilder("Type parameters are unsupported on ");
                sb2.append(cls2.getName());
                if (cls2 != cls) {
                    sb2.append(" which is an interface of ");
                    sb2.append(cls.getName());
                }
                throw new IllegalArgumentException(sb2.toString());
            }
            Collections.addAll(arrayDeque, cls2.getInterfaces());
        }
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new cf.k(this, cls));
    }

    public final m c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        List list = this.f44613d;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i11 = iIndexOf; i11 < size; i11++) {
            m mVarA = ((l) list.get(i11)).a(type);
            if (mVarA != null) {
                return mVarA;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate RequestBody converter for ");
        sb2.append(type);
        sb2.append(".\n  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(((l) list.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public final m d(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List list = this.f44613d;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i11 = iIndexOf; i11 < size; i11++) {
            m mVarB = ((l) list.get(i11)).b(type, annotationArr, this);
            if (mVarB != null) {
                return mVarB;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate ResponseBody converter for ");
        sb2.append(type);
        sb2.append(".\n  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(((l) list.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public final void e(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        List list = this.f44613d;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((l) list.get(i11)).getClass();
        }
    }
}
