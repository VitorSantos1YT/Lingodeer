package com.google.firebase.components;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComponentDiscovery<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f18098a;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class MetadataRegistrarNameRetriever implements RegistrarNameRetriever<Context> {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface RegistrarNameRetriever<T> {
    }

    public ComponentDiscovery(Context context, MetadataRegistrarNameRetriever metadataRegistrarNameRetriever) {
        this.f18098a = context;
    }

    public static ComponentDiscovery a(Context context) {
        return new ComponentDiscovery(context, new MetadataRegistrarNameRetriever());
    }
}
