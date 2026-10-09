package com.google.firebase;

import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.StatusExceptionMapper;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class FirebaseExceptionMapper implements StatusExceptionMapper {
    @Override // com.google.android.gms.common.api.internal.StatusExceptionMapper
    public final Exception a(Status status) {
        int i11 = status.f8706a;
        int i12 = status.f8706a;
        String strA = status.f8707b;
        if (i11 == 8) {
            if (strA == null) {
                strA = CommonStatusCodes.a(i12);
            }
            return new FirebaseException(strA);
        }
        if (strA == null) {
            strA = CommonStatusCodes.a(i12);
        }
        return new FirebaseApiNotAvailableException(strA);
    }
}
