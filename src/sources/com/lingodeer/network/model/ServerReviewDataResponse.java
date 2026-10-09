package com.lingodeer.network.model;

import java.util.List;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class ServerReviewDataResponse {
    private final long current_sync_timestamp;
    private final List<ServerReviewDataItem> m_new_items;

    public ServerReviewDataResponse(long j11, List<ServerReviewDataItem> m_new_items) {
        m.f(m_new_items, "m_new_items");
        this.current_sync_timestamp = j11;
        this.m_new_items = m_new_items;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ServerReviewDataResponse copy$default(ServerReviewDataResponse serverReviewDataResponse, long j11, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = serverReviewDataResponse.current_sync_timestamp;
        }
        if ((i11 & 2) != 0) {
            list = serverReviewDataResponse.m_new_items;
        }
        return serverReviewDataResponse.copy(j11, list);
    }

    public final long component1() {
        return this.current_sync_timestamp;
    }

    public final List<ServerReviewDataItem> component2() {
        return this.m_new_items;
    }

    public final ServerReviewDataResponse copy(long j11, List<ServerReviewDataItem> m_new_items) {
        m.f(m_new_items, "m_new_items");
        return new ServerReviewDataResponse(j11, m_new_items);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServerReviewDataResponse)) {
            return false;
        }
        ServerReviewDataResponse serverReviewDataResponse = (ServerReviewDataResponse) obj;
        return this.current_sync_timestamp == serverReviewDataResponse.current_sync_timestamp && m.a(this.m_new_items, serverReviewDataResponse.m_new_items);
    }

    public final long getCurrent_sync_timestamp() {
        return this.current_sync_timestamp;
    }

    public final List<ServerReviewDataItem> getM_new_items() {
        return this.m_new_items;
    }

    public int hashCode() {
        return this.m_new_items.hashCode() + (Long.hashCode(this.current_sync_timestamp) * 31);
    }

    public String toString() {
        return "ServerReviewDataResponse(current_sync_timestamp=" + this.current_sync_timestamp + ", m_new_items=" + this.m_new_items + ")";
    }
}
