package o20;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class k extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44530a;

    public /* synthetic */ k(int i11) {
        this.f44530a = i11;
    }

    @Override // o20.f
    public final g a(Type type, Annotation[] annotationArr) {
        g qVar;
        Type typeG;
        boolean z11;
        boolean z12;
        String str;
        switch (this.f44530a) {
            case 0:
                if (c1.h(type) != CompletableFuture.class) {
                    return null;
                }
                if (!(type instanceof ParameterizedType)) {
                    throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
                }
                Type typeG2 = c1.g(0, (ParameterizedType) type);
                if (c1.h(typeG2) != t0.class) {
                    qVar = new lp.j(typeG2, 3);
                } else {
                    if (!(typeG2 instanceof ParameterizedType)) {
                        throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
                    }
                    qVar = new n9.q(c1.g(0, (ParameterizedType) typeG2), 2);
                }
                return qVar;
            default:
                Class clsH = c1.h(type);
                if (clsH == qx.b.class) {
                    return new p20.d(Void.class, false, true, false, false, false, true);
                }
                boolean z13 = clsH == qx.d.class;
                boolean z14 = clsH == qx.p.class;
                boolean z15 = clsH == ay.k0.class;
                if (clsH != qx.h.class && !z13 && !z14 && !z15) {
                    return null;
                }
                if (!(type instanceof ParameterizedType)) {
                    if (z13) {
                        str = "Flowable";
                    } else if (z14) {
                        str = "Single";
                    } else {
                        str = z15 ? "Maybe" : "Observable";
                    }
                    StringBuilder sbQ = b7.e0.q(str, " return type must be parameterized as ", str, "<Foo> or ", str);
                    sbQ.append("<? extends Foo>");
                    throw new IllegalStateException(sbQ.toString());
                }
                Type typeG3 = c1.g(0, (ParameterizedType) type);
                Class clsH2 = c1.h(typeG3);
                if (clsH2 == t0.class) {
                    if (!(typeG3 instanceof ParameterizedType)) {
                        throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
                    }
                    typeG = c1.g(0, (ParameterizedType) typeG3);
                    z12 = false;
                    z11 = false;
                } else if (clsH2 != p20.c.class) {
                    typeG = typeG3;
                    z11 = true;
                    z12 = false;
                } else {
                    if (!(typeG3 instanceof ParameterizedType)) {
                        throw new IllegalStateException("Result must be parameterized as Result<Foo> or Result<? extends Foo>");
                    }
                    typeG = c1.g(0, (ParameterizedType) typeG3);
                    z12 = true;
                    z11 = false;
                }
                return new p20.d(typeG, z12, z11, z13, z14, z15, false);
        }
    }
}
