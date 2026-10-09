package com.lingo.lingoskill.object;

import c00.e;
import com.tbruyelle.rxpermissions3.BuildConfig;
import e00.g;
import f00.b;
import g00.o1;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@e
public final class PurchaseAdVideoConfig {
    private int minIntervalDay;
    private String videoURL;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        private Companion() {
        }

        public final c00.a serializer() {
            return PurchaseAdVideoConfig$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PurchaseAdVideoConfig() {
        this(0, (String) null, 3, (f) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ PurchaseAdVideoConfig copy$default(PurchaseAdVideoConfig purchaseAdVideoConfig, int i11, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = purchaseAdVideoConfig.minIntervalDay;
        }
        if ((i12 & 2) != 0) {
            str = purchaseAdVideoConfig.videoURL;
        }
        return purchaseAdVideoConfig.copy(i11, str);
    }

    public static final /* synthetic */ void write$Self$app_release(PurchaseAdVideoConfig purchaseAdVideoConfig, b bVar, g gVar) {
        if (bVar.G(gVar) || purchaseAdVideoConfig.minIntervalDay != 3) {
            bVar.g(0, purchaseAdVideoConfig.minIntervalDay, gVar);
        }
        if (!bVar.G(gVar) && m.a(purchaseAdVideoConfig.videoURL, BuildConfig.VERSION_NAME)) {
            return;
        }
        bVar.w(gVar, 1, purchaseAdVideoConfig.videoURL);
    }

    public final int component1() {
        return this.minIntervalDay;
    }

    public final String component2() {
        return this.videoURL;
    }

    public final PurchaseAdVideoConfig copy(int i11, String videoURL) {
        m.f(videoURL, "videoURL");
        return new PurchaseAdVideoConfig(i11, videoURL);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchaseAdVideoConfig)) {
            return false;
        }
        PurchaseAdVideoConfig purchaseAdVideoConfig = (PurchaseAdVideoConfig) obj;
        return this.minIntervalDay == purchaseAdVideoConfig.minIntervalDay && m.a(this.videoURL, purchaseAdVideoConfig.videoURL);
    }

    public final int getMinIntervalDay() {
        return this.minIntervalDay;
    }

    public final String getVideoURL() {
        return this.videoURL;
    }

    public int hashCode() {
        return this.videoURL.hashCode() + (Integer.hashCode(this.minIntervalDay) * 31);
    }

    public final void setMinIntervalDay(int i11) {
        this.minIntervalDay = i11;
    }

    public final void setVideoURL(String str) {
        m.f(str, "<set-?>");
        this.videoURL = str;
    }

    public String toString() {
        return "PurchaseAdVideoConfig(minIntervalDay=" + this.minIntervalDay + ", videoURL=" + this.videoURL + ")";
    }

    public /* synthetic */ PurchaseAdVideoConfig(int i11, int i12, String str, o1 o1Var) {
        this.minIntervalDay = (i11 & 1) == 0 ? 3 : i12;
        if ((i11 & 2) == 0) {
            this.videoURL = BuildConfig.VERSION_NAME;
        } else {
            this.videoURL = str;
        }
    }

    public PurchaseAdVideoConfig(int i11, String videoURL) {
        m.f(videoURL, "videoURL");
        this.minIntervalDay = i11;
        this.videoURL = videoURL;
    }

    public /* synthetic */ PurchaseAdVideoConfig(int i11, String str, int i12, f fVar) {
        this((i12 & 1) != 0 ? 3 : i11, (i12 & 2) != 0 ? BuildConfig.VERSION_NAME : str);
    }
}
