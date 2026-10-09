package com.facebook;

import kotlin.jvm.internal.m;
import re.b0;
import re.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class FacebookGraphResponseException extends FacebookException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0 f7718b;

    public FacebookGraphResponseException(b0 b0Var, String str) {
        super(str);
        this.f7718b = b0Var;
    }

    @Override // com.facebook.FacebookException, java.lang.Throwable
    public final String toString() {
        b0 b0Var = this.f7718b;
        r rVar = b0Var != null ? b0Var.f49125c : null;
        StringBuilder sb2 = new StringBuilder("{FacebookGraphResponseException: ");
        String message = getMessage();
        if (message != null) {
            sb2.append(message);
            sb2.append(" ");
        }
        if (rVar != null) {
            sb2.append("httpResponseCode: ");
            sb2.append(rVar.f49194a);
            sb2.append(", facebookErrorCode: ");
            sb2.append(rVar.f49195b);
            sb2.append(", facebookErrorType: ");
            sb2.append(rVar.f49197d);
            sb2.append(", message: ");
            sb2.append(rVar.a());
            sb2.append("}");
        }
        String string = sb2.toString();
        m.e(string, "errorStringBuilder.toString()");
        return string;
    }
}
