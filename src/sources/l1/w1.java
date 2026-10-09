package l1;

import kotlin.KotlinNothingValueException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v1 f39488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f39489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v2 f39490c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f39491d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f39492e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f39493f = true;

    public w1(v1 v1Var, Object obj, boolean z11, v2 v2Var, boolean z12) {
        this.f39488a = v1Var;
        this.f39489b = z11;
        this.f39490c = v2Var;
        this.f39491d = z12;
        this.f39492e = obj;
    }

    public final Object a() {
        if (this.f39489b) {
            return null;
        }
        Object obj = this.f39492e;
        if (obj != null) {
            return obj;
        }
        u.b("Unexpected form of a provided value");
        throw new KotlinNothingValueException();
    }
}
