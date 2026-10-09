package androidx.lifecycle.compose;

import androidx.lifecycle.LifecycleOwner;
import l1.n;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f2036c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fz.c f2037d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2038e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2039f;

    public /* synthetic */ b(Object obj, LifecycleOwner lifecycleOwner, fz.c cVar, int i11, int i12, int i13) {
        this.f2034a = i13;
        this.f2035b = obj;
        this.f2036c = lifecycleOwner;
        this.f2037d = cVar;
        this.f2038e = i11;
        this.f2039f = i12;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2034a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return LifecycleEffectKt.LifecycleStartEffect$lambda$7(this.f2035b, this.f2036c, this.f2037d, this.f2038e, this.f2039f, (n) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return LifecycleEffectKt.LifecycleResumeEffect$lambda$22(this.f2035b, this.f2036c, this.f2037d, this.f2038e, this.f2039f, (n) obj, iIntValue2);
        }
    }
}
