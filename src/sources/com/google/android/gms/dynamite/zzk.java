package com.google.android.gms.dynamite;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzk implements DynamiteModule.VersionPolicy {
    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy
    public final DynamiteModule.VersionPolicy.SelectionResult a(Context context, String str, DynamiteModule.VersionPolicy.IVersions iVersions) {
        int iA;
        DynamiteModule.VersionPolicy.SelectionResult selectionResult = new DynamiteModule.VersionPolicy.SelectionResult();
        int iB = iVersions.b(context, str);
        selectionResult.f9208a = iB;
        int i11 = 1;
        int i12 = 0;
        if (iB != 0) {
            iA = iVersions.a(context, str, false);
            selectionResult.f9209b = iA;
        } else {
            iA = iVersions.a(context, str, true);
            selectionResult.f9209b = iA;
        }
        int i13 = selectionResult.f9208a;
        if (i13 == 0) {
            if (iA == 0) {
                i11 = 0;
            }
            selectionResult.f9210c = i11;
            return selectionResult;
        }
        i12 = i13;
        if (i12 >= iA) {
            i11 = -1;
        }
        selectionResult.f9210c = i11;
        return selectionResult;
    }
}
