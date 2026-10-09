package com.google.android.gms.dynamite;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzg implements DynamiteModule.VersionPolicy {
    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy
    public final DynamiteModule.VersionPolicy.SelectionResult a(Context context, String str, DynamiteModule.VersionPolicy.IVersions iVersions) {
        DynamiteModule.VersionPolicy.SelectionResult selectionResult = new DynamiteModule.VersionPolicy.SelectionResult();
        int iA = iVersions.a(context, str, true);
        selectionResult.f9209b = iA;
        if (iA != 0) {
            selectionResult.f9210c = 1;
            return selectionResult;
        }
        int iB = iVersions.b(context, str);
        selectionResult.f9208a = iB;
        if (iB != 0) {
            selectionResult.f9210c = -1;
        }
        return selectionResult;
    }
}
