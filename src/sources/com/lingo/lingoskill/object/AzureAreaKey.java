package com.lingo.lingoskill.object;

import c00.e;
import e00.g;
import f00.b;
import g00.d1;
import g00.o1;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@e
public final class AzureAreaKey {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String serviceRegion;
    private final String speechSubscriptionKey;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        private Companion() {
        }

        public final c00.a serializer() {
            return AzureAreaKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public /* synthetic */ AzureAreaKey(int i11, String str, String str2, o1 o1Var) {
        if (3 != (i11 & 3)) {
            d1.k(i11, 3, AzureAreaKey$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.speechSubscriptionKey = str;
        this.serviceRegion = str2;
    }

    public static /* synthetic */ AzureAreaKey copy$default(AzureAreaKey azureAreaKey, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = azureAreaKey.speechSubscriptionKey;
        }
        if ((i11 & 2) != 0) {
            str2 = azureAreaKey.serviceRegion;
        }
        return azureAreaKey.copy(str, str2);
    }

    public static final /* synthetic */ void write$Self$app_release(AzureAreaKey azureAreaKey, b bVar, g gVar) {
        bVar.w(gVar, 0, azureAreaKey.speechSubscriptionKey);
        bVar.w(gVar, 1, azureAreaKey.serviceRegion);
    }

    public final String component1() {
        return this.speechSubscriptionKey;
    }

    public final String component2() {
        return this.serviceRegion;
    }

    public final AzureAreaKey copy(String speechSubscriptionKey, String serviceRegion) {
        m.f(speechSubscriptionKey, "speechSubscriptionKey");
        m.f(serviceRegion, "serviceRegion");
        return new AzureAreaKey(speechSubscriptionKey, serviceRegion);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AzureAreaKey)) {
            return false;
        }
        AzureAreaKey azureAreaKey = (AzureAreaKey) obj;
        return m.a(this.speechSubscriptionKey, azureAreaKey.speechSubscriptionKey) && m.a(this.serviceRegion, azureAreaKey.serviceRegion);
    }

    public final String getServiceRegion() {
        return this.serviceRegion;
    }

    public final String getSpeechSubscriptionKey() {
        return this.speechSubscriptionKey;
    }

    public int hashCode() {
        return this.serviceRegion.hashCode() + (this.speechSubscriptionKey.hashCode() * 31);
    }

    public String toString() {
        return ep.a.h("AzureAreaKey(speechSubscriptionKey=", this.speechSubscriptionKey, ", serviceRegion=", this.serviceRegion, ")");
    }

    public AzureAreaKey(String speechSubscriptionKey, String serviceRegion) {
        m.f(speechSubscriptionKey, "speechSubscriptionKey");
        m.f(serviceRegion, "serviceRegion");
        this.speechSubscriptionKey = speechSubscriptionKey;
        this.serviceRegion = serviceRegion;
    }
}
