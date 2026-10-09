package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@CheckReturnValue
final class MapFieldSchemas {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final MapFieldSchema f21319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final MapFieldSchemaLite f21320b;

    static {
        MapFieldSchema mapFieldSchema = null;
        try {
            mapFieldSchema = (MapFieldSchema) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f21319a = mapFieldSchema;
        f21320b = new MapFieldSchemaLite();
    }
}
