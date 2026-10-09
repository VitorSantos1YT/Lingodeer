package com.google.firebase.heartbeatinfo;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_HeartBeatResult extends HeartBeatResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f19671b;

    public AutoValue_HeartBeatResult(ArrayList arrayList, String str) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.f19670a = str;
        this.f19671b = arrayList;
    }

    @Override // com.google.firebase.heartbeatinfo.HeartBeatResult
    public final List a() {
        return this.f19671b;
    }

    @Override // com.google.firebase.heartbeatinfo.HeartBeatResult
    public final String b() {
        return this.f19670a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HeartBeatResult)) {
            return false;
        }
        HeartBeatResult heartBeatResult = (HeartBeatResult) obj;
        return this.f19670a.equals(heartBeatResult.b()) && this.f19671b.equals(heartBeatResult.a());
    }

    public final int hashCode() {
        return ((this.f19670a.hashCode() ^ 1000003) * 1000003) ^ this.f19671b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f19670a + ", usedDates=" + this.f19671b + "}";
    }
}
