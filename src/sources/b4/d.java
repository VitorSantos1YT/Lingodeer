package b4;

import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class d implements y4.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f3908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3909b;

    public d(int i11) {
        if (i11 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f3908a = new Object[i11];
    }

    public void a(b bVar) {
        int i11 = this.f3909b;
        Object[] objArr = this.f3908a;
        if (i11 < objArr.length) {
            objArr[i11] = bVar;
            this.f3909b = i11 + 1;
        }
    }

    @Override // y4.c
    public Object acquire() {
        int i11 = this.f3909b;
        if (i11 <= 0) {
            return null;
        }
        int i12 = i11 - 1;
        Object[] objArr = this.f3908a;
        Object obj = objArr[i12];
        m.d(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        objArr[i12] = null;
        this.f3909b--;
        return obj;
    }

    @Override // y4.c
    public boolean c(Object instance) {
        Object[] objArr;
        boolean z11;
        m.f(instance, "instance");
        int i11 = this.f3909b;
        int i12 = 0;
        while (true) {
            objArr = this.f3908a;
            if (i12 >= i11) {
                z11 = false;
                break;
            }
            if (objArr[i12] == instance) {
                z11 = true;
                break;
            }
            i12++;
        }
        if (z11) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i13 = this.f3909b;
        if (i13 >= objArr.length) {
            return false;
        }
        objArr[i13] = instance;
        this.f3909b = i13 + 1;
        return true;
    }

    public d() {
        this.f3908a = new Object[256];
    }
}
