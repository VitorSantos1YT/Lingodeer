package com.lingodeer.data.model;

import defpackage.e;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class AckCollectionItem {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final String f22283id;
    private final boolean isFav;
    private final long time;

    public AckCollectionItem(String id2, boolean z11, long j11) {
        m.f(id2, "id");
        this.f22283id = id2;
        this.isFav = z11;
        this.time = j11;
    }

    public static /* synthetic */ AckCollectionItem copy$default(AckCollectionItem ackCollectionItem, String str, boolean z11, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = ackCollectionItem.f22283id;
        }
        if ((i11 & 2) != 0) {
            z11 = ackCollectionItem.isFav;
        }
        if ((i11 & 4) != 0) {
            j11 = ackCollectionItem.time;
        }
        return ackCollectionItem.copy(str, z11, j11);
    }

    public final String component1() {
        return this.f22283id;
    }

    public final boolean component2() {
        return this.isFav;
    }

    public final long component3() {
        return this.time;
    }

    public final AckCollectionItem copy(String id2, boolean z11, long j11) {
        m.f(id2, "id");
        return new AckCollectionItem(id2, z11, j11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AckCollectionItem)) {
            return false;
        }
        AckCollectionItem ackCollectionItem = (AckCollectionItem) obj;
        return m.a(this.f22283id, ackCollectionItem.f22283id) && this.isFav == ackCollectionItem.isFav && this.time == ackCollectionItem.time;
    }

    public final String getId() {
        return this.f22283id;
    }

    public final long getTime() {
        return this.time;
    }

    public int hashCode() {
        return Long.hashCode(this.time) + e.e(this.f22283id.hashCode() * 31, 31, this.isFav);
    }

    public final boolean isFav() {
        return this.isFav;
    }

    public String toString() {
        String str = this.f22283id;
        boolean z11 = this.isFav;
        long j11 = this.time;
        StringBuilder sb2 = new StringBuilder("AckCollectionItem(id=");
        sb2.append(str);
        sb2.append(", isFav=");
        sb2.append(z11);
        sb2.append(", time=");
        return e.i(j11, ")", sb2);
    }
}
