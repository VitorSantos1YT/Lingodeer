package androidx.lifecycle.compose;

import androidx.lifecycle.LifecycleOwner;
import l1.n;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object[] f2056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f2057c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fz.c f2058d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2059e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2060f;

    public /* synthetic */ f(Object[] objArr, LifecycleOwner lifecycleOwner, fz.c cVar, int i11, int i12, int i13) {
        this.f2055a = i13;
        this.f2056b = objArr;
        this.f2057c = lifecycleOwner;
        this.f2058d = cVar;
        this.f2059e = i11;
        this.f2060f = i12;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2055a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return LifecycleEffectKt.LifecycleResumeEffect$lambda$28(this.f2056b, this.f2057c, this.f2058d, this.f2059e, this.f2060f, (n) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return LifecycleEffectKt.LifecycleStartEffect$lambda$13(this.f2056b, this.f2057c, this.f2058d, this.f2059e, this.f2060f, (n) obj, iIntValue2);
        }
    }
}
