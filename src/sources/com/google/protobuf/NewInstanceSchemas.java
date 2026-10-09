package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@CheckReturnValue
final class NewInstanceSchemas {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final NewInstanceSchema f21345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final NewInstanceSchemaLite f21346b;

    static {
        NewInstanceSchema newInstanceSchema = null;
        try {
            newInstanceSchema = (NewInstanceSchema) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f21345a = newInstanceSchema;
        f21346b = new NewInstanceSchemaLite();
    }
}
