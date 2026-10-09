package ue;

import hh.p0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f52937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f52938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f52939c;

    public o(String str, String cloudBridgeURL, String str2) {
        kotlin.jvm.internal.m.f(cloudBridgeURL, "cloudBridgeURL");
        this.f52937a = str;
        this.f52938b = cloudBridgeURL;
        this.f52939c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return kotlin.jvm.internal.m.a(this.f52937a, oVar.f52937a) && kotlin.jvm.internal.m.a(this.f52938b, oVar.f52938b) && kotlin.jvm.internal.m.a(this.f52939c, oVar.f52939c);
    }

    public final int hashCode() {
        return this.f52939c.hashCode() + defpackage.e.d(this.f52937a.hashCode() * 31, 31, this.f52938b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CloudBridgeCredentials(datasetID=");
        sb2.append(this.f52937a);
        sb2.append(", cloudBridgeURL=");
        sb2.append(this.f52938b);
        sb2.append(", accessKey=");
        return p0.o(sb2, this.f52939c, ')');
    }
}
