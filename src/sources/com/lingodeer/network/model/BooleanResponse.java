package com.lingodeer.network.model;

import ep.a;
import kotlin.jvm.internal.f;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class BooleanResponse {
    private boolean success;

    public BooleanResponse() {
        this(false, 1, null);
    }

    public static /* synthetic */ BooleanResponse copy$default(BooleanResponse booleanResponse, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = booleanResponse.success;
        }
        return booleanResponse.copy(z11);
    }

    public final boolean component1() {
        return this.success;
    }

    public final BooleanResponse copy(boolean z11) {
        return new BooleanResponse(z11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BooleanResponse) && this.success == ((BooleanResponse) obj).success;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        return Boolean.hashCode(this.success);
    }

    public final void setSuccess(boolean z11) {
        this.success = z11;
    }

    public String toString() {
        return a.i("BooleanResponse(success=", ")", this.success);
    }

    public BooleanResponse(boolean z11) {
        this.success = z11;
    }

    public /* synthetic */ BooleanResponse(boolean z11, int i11, f fVar) {
        this((i11 & 1) != 0 ? false : z11);
    }
}
