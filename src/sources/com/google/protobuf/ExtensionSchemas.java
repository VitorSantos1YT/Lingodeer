package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@CheckReturnValue
final class ExtensionSchemas {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ExtensionSchemaLite f21246a = new ExtensionSchemaLite();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ExtensionSchema f21247b;

    static {
        ExtensionSchema extensionSchema = null;
        try {
            extensionSchema = (ExtensionSchema) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f21247b = extensionSchema;
    }
}
