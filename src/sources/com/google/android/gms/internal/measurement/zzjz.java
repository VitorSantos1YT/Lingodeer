package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.api.internal.ListenerHolder;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzjz implements ListenerHolder.Notifier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte[] f11655a;

    public zzjz(zzka zzkaVar, byte[] bArr) {
        this.f11655a = bArr;
        Objects.requireNonNull(zzkaVar);
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final void a(Object obj) {
        zzpm zzpmVar = (zzpm) obj;
        try {
            byte[] bArr = this.f11655a;
            zzadf zzadfVar = zzadf.f11253b;
            int i11 = zzacf.f11197a;
            zzpmVar.a(zzpl.z(bArr, zzadf.f11254c));
        } catch (zzaeh unused) {
            zzpmVar.getClass();
        }
    }
}
