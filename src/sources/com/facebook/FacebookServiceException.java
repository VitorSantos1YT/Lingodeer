package com.facebook;

import kotlin.jvm.internal.m;
import re.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class FacebookServiceException extends FacebookException {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f7719b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FacebookServiceException(r requestError, String str) {
        super(str);
        m.f(requestError, "requestError");
        this.f7719b = requestError;
    }

    @Override // com.facebook.FacebookException, java.lang.Throwable
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("{FacebookServiceException: httpResponseCode: ");
        r rVar = this.f7719b;
        sb2.append(rVar.f49194a);
        sb2.append(", facebookErrorCode: ");
        sb2.append(rVar.f49195b);
        sb2.append(", facebookErrorType: ");
        sb2.append(rVar.f49197d);
        sb2.append(", message: ");
        sb2.append(rVar.a());
        sb2.append("}");
        String string = sb2.toString();
        m.e(string, "StringBuilder()\n        …(\"}\")\n        .toString()");
        return string;
    }
}
