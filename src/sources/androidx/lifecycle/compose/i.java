package androidx.lifecycle.compose;

import androidx.lifecycle.LifecycleOwner;
import l1.n;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2071c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f2072d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fz.c f2073e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2074f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f2075t;

    public /* synthetic */ i(Object obj, Object obj2, LifecycleOwner lifecycleOwner, fz.c cVar, int i11, int i12, int i13) {
        this.f2069a = i13;
        this.f2070b = obj;
        this.f2071c = obj2;
        this.f2072d = lifecycleOwner;
        this.f2073e = cVar;
        this.f2074f = i11;
        this.f2075t = i12;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2069a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return LifecycleEffectKt.LifecycleStartEffect$lambda$9(this.f2070b, this.f2071c, this.f2072d, this.f2073e, this.f2074f, this.f2075t, (n) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return LifecycleEffectKt.LifecycleResumeEffect$lambda$24(this.f2070b, this.f2071c, this.f2072d, this.f2073e, this.f2074f, this.f2075t, (n) obj, iIntValue2);
        }
    }
}
