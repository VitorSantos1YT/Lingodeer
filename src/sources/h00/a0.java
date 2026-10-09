package h00;

import g00.f0;
import g00.t1;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a0 implements e00.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a0 f29910b = new a0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f29911c = "kotlinx.serialization.json.JsonObject";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f0 f29912a;

    public a0() {
        t1 t1Var = t1.f28468a;
        o oVar = o.f29939a;
        t1 t1Var2 = t1.f28468a;
        o oVar2 = o.f29939a;
        e00.g keyDesc = t1Var2.getDescriptor();
        e00.g valueDesc = oVar2.getDescriptor();
        kotlin.jvm.internal.m.f(keyDesc, "keyDesc");
        kotlin.jvm.internal.m.f(valueDesc, "valueDesc");
        this.f29912a = new f0("kotlin.collections.LinkedHashMap", keyDesc, valueDesc);
    }

    @Override // e00.g
    public final String a() {
        return f29911c;
    }

    @Override // e00.g
    public final boolean c() {
        this.f29912a.getClass();
        return false;
    }

    @Override // e00.g
    public final int d(String name) {
        kotlin.jvm.internal.m.f(name, "name");
        return this.f29912a.d(name);
    }

    @Override // e00.g
    public final o00.a e() {
        this.f29912a.getClass();
        return e00.m.f24702e;
    }

    @Override // e00.g
    public final int f() {
        this.f29912a.getClass();
        return 2;
    }

    @Override // e00.g
    public final String g(int i11) {
        this.f29912a.getClass();
        return String.valueOf(i11);
    }

    @Override // e00.g
    public final List getAnnotations() {
        this.f29912a.getClass();
        return ry.r.f50854a;
    }

    @Override // e00.g
    public final List h(int i11) {
        this.f29912a.h(i11);
        return ry.r.f50854a;
    }

    @Override // e00.g
    public final e00.g i(int i11) {
        return this.f29912a.i(i11);
    }

    @Override // e00.g
    public final boolean isInline() {
        this.f29912a.getClass();
        return false;
    }

    @Override // e00.g
    public final boolean j(int i11) {
        this.f29912a.j(i11);
        return false;
    }
}
