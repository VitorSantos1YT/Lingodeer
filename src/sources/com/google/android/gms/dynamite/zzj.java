package com.google.android.gms.dynamite;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzj implements DynamiteModule.VersionPolicy {
    /* JADX WARN: Code duplicated, block: B:7:0x001b A[DONT_INVERT, PHI: r4
      0x001b: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:3:0x0014, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy
    public final DynamiteModule.VersionPolicy.SelectionResult a(Context context, String str, DynamiteModule.VersionPolicy.IVersions iVersions) {
        DynamiteModule.VersionPolicy.SelectionResult selectionResult = new DynamiteModule.VersionPolicy.SelectionResult();
        selectionResult.f9208a = iVersions.b(context, str);
        int i11 = 1;
        int iA = iVersions.a(context, str, true);
        selectionResult.f9209b = iA;
        int i12 = selectionResult.f9208a;
        if (i12 == 0) {
            i12 = 0;
            if (iA == 0) {
                i11 = 0;
            } else if (i12 >= iA) {
                i11 = -1;
            }
        } else if (i12 >= iA) {
            i11 = -1;
        }
        selectionResult.f9210c = i11;
        return selectionResult;
    }
}
