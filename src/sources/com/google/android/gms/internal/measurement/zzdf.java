package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzdf extends zzeo {
    public final /* synthetic */ boolean H;
    public final /* synthetic */ zzez K;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f11505e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f11506f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f11507t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdf(zzez zzezVar, String str, String str2, Object obj, boolean z11) {
        super(zzezVar, true);
        this.f11505e = str;
        this.f11506f = str2;
        this.f11507t = obj;
        this.H = z11;
        Objects.requireNonNull(zzezVar);
        this.K = zzezVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeo
    public final void a() {
        zzcp zzcpVar = this.K.f11589g;
        Preconditions.g(zzcpVar);
        zzcpVar.setUserProperty(this.f11505e, this.f11506f, new ObjectWrapper(this.f11507t), this.H, this.f11560a);
    }
}
