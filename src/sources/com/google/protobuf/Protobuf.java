package com.google.protobuf;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@CheckReturnValue
final class Protobuf {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Protobuf f21349c = new Protobuf();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f21351b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ManifestSchemaFactory f21350a = new ManifestSchemaFactory();

    private Protobuf() {
    }

    public final Schema a(Class cls) {
        Schema schemaY;
        Class cls2;
        Internal.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f21351b;
        Schema schema = (Schema) concurrentHashMap.get(cls);
        if (schema != null) {
            return schema;
        }
        ManifestSchemaFactory manifestSchemaFactory = this.f21350a;
        manifestSchemaFactory.getClass();
        Class cls3 = SchemaUtil.f21373a;
        if (!GeneratedMessageLite.class.isAssignableFrom(cls) && (cls2 = SchemaUtil.f21373a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
        MessageInfo messageInfoA = manifestSchemaFactory.f21308a.a(cls);
        if (messageInfoA.a()) {
            if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
                schemaY = new MessageSetSchema(SchemaUtil.f21375c, ExtensionSchemas.f21246a, messageInfoA.b());
            } else {
                UnknownFieldSchema unknownFieldSchema = SchemaUtil.f21374b;
                ExtensionSchema extensionSchema = ExtensionSchemas.f21247b;
                if (extensionSchema == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                schemaY = new MessageSetSchema(unknownFieldSchema, extensionSchema, messageInfoA.b());
            }
        } else if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
            schemaY = ManifestSchemaFactory.AnonymousClass2.f21309a[messageInfoA.c().ordinal()] != 1 ? MessageSchema.y(messageInfoA, NewInstanceSchemas.f21346b, ListFieldSchema.f21301b, SchemaUtil.f21375c, ExtensionSchemas.f21246a, MapFieldSchemas.f21320b) : MessageSchema.y(messageInfoA, NewInstanceSchemas.f21346b, ListFieldSchema.f21301b, SchemaUtil.f21375c, null, MapFieldSchemas.f21320b);
        } else if (ManifestSchemaFactory.AnonymousClass2.f21309a[messageInfoA.c().ordinal()] != 1) {
            NewInstanceSchema newInstanceSchema = NewInstanceSchemas.f21345a;
            ListFieldSchema.ListFieldSchemaFull listFieldSchemaFull = ListFieldSchema.f21300a;
            UnknownFieldSchema unknownFieldSchema2 = SchemaUtil.f21374b;
            ExtensionSchema extensionSchema2 = ExtensionSchemas.f21247b;
            if (extensionSchema2 == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            schemaY = MessageSchema.y(messageInfoA, newInstanceSchema, listFieldSchemaFull, unknownFieldSchema2, extensionSchema2, MapFieldSchemas.f21319a);
        } else {
            schemaY = MessageSchema.y(messageInfoA, NewInstanceSchemas.f21345a, ListFieldSchema.f21300a, SchemaUtil.f21374b, null, MapFieldSchemas.f21319a);
        }
        Schema schema2 = (Schema) concurrentHashMap.putIfAbsent(cls, schemaY);
        return schema2 != null ? schema2 : schemaY;
    }
}
