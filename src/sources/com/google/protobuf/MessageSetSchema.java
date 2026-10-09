package com.google.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@CheckReturnValue
final class MessageSetSchema<T> implements Schema<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MessageLite f21339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UnknownFieldSchema f21340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f21341c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ExtensionSchema f21342d;

    public MessageSetSchema(UnknownFieldSchema unknownFieldSchema, ExtensionSchema extensionSchema, MessageLite messageLite) {
        this.f21340b = unknownFieldSchema;
        this.f21341c = extensionSchema.e(messageLite);
        this.f21342d = extensionSchema;
        this.f21339a = messageLite;
    }

    @Override // com.google.protobuf.Schema
    public final void a(Object obj, Object obj2) {
        Class cls = SchemaUtil.f21373a;
        UnknownFieldSchema unknownFieldSchema = this.f21340b;
        unknownFieldSchema.o(obj, unknownFieldSchema.k(unknownFieldSchema.g(obj), unknownFieldSchema.g(obj2)));
        if (this.f21341c) {
            SchemaUtil.l(this.f21342d, obj, obj2);
        }
    }

    @Override // com.google.protobuf.Schema
    public final void b(Object obj) {
        this.f21340b.j(obj);
        this.f21342d.f(obj);
    }

    @Override // com.google.protobuf.Schema
    public final boolean c(Object obj) {
        return this.f21342d.c(obj).g();
    }

    @Override // com.google.protobuf.Schema
    public final Object d() {
        MessageLite messageLite = this.f21339a;
        return messageLite instanceof GeneratedMessageLite ? ((GeneratedMessageLite) messageLite).A() : messageLite.i().O0();
    }

    @Override // com.google.protobuf.Schema
    public final void e(Object obj, Writer writer) {
        Iterator itI = this.f21342d.c(obj).i();
        while (itI.hasNext()) {
            Map.Entry entry = (Map.Entry) itI.next();
            FieldSet.FieldDescriptorLite fieldDescriptorLite = (FieldSet.FieldDescriptorLite) entry.getKey();
            if (fieldDescriptorLite.l1() != WireFormat.JavaType.MESSAGE || fieldDescriptorLite.x() || fieldDescriptorLite.m1()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof LazyField.LazyEntry) {
                writer.e(fieldDescriptorLite.d(), ((LazyField) ((LazyField.LazyEntry) entry).f21294a.getValue()).b());
            } else {
                writer.e(fieldDescriptorLite.d(), entry.getValue());
            }
        }
        UnknownFieldSchema unknownFieldSchema = this.f21340b;
        unknownFieldSchema.q(unknownFieldSchema.g(obj), writer);
    }

    @Override // com.google.protobuf.Schema
    public final void f(Object obj, Reader reader, ExtensionRegistryLite extensionRegistryLite) {
        UnknownFieldSchema unknownFieldSchema = this.f21340b;
        UnknownFieldSetLite unknownFieldSetLiteF = unknownFieldSchema.f(obj);
        ExtensionSchema extensionSchema = this.f21342d;
        FieldSet fieldSetD = extensionSchema.d(obj);
        while (reader.B() != Integer.MAX_VALUE) {
            try {
                Reader reader2 = reader;
                ExtensionRegistryLite extensionRegistryLite2 = extensionRegistryLite;
                if (!j(reader2, extensionRegistryLite2, extensionSchema, fieldSetD, unknownFieldSchema, unknownFieldSetLiteF)) {
                    return;
                }
                reader = reader2;
                extensionRegistryLite = extensionRegistryLite2;
            } finally {
                unknownFieldSchema.n(obj, unknownFieldSetLiteF);
            }
        }
    }

    @Override // com.google.protobuf.Schema
    public final int g(GeneratedMessageLite generatedMessageLite) {
        int iHashCode = this.f21340b.g(generatedMessageLite).hashCode();
        return this.f21341c ? (iHashCode * 53) + this.f21342d.c(generatedMessageLite).f21252a.hashCode() : iHashCode;
    }

    @Override // com.google.protobuf.Schema
    public final boolean h(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2) {
        UnknownFieldSchema unknownFieldSchema = this.f21340b;
        if (!unknownFieldSchema.g(generatedMessageLite).equals(unknownFieldSchema.g(generatedMessageLite2))) {
            return false;
        }
        if (!this.f21341c) {
            return true;
        }
        ExtensionSchema extensionSchema = this.f21342d;
        return extensionSchema.c(generatedMessageLite).equals(extensionSchema.c(generatedMessageLite2));
    }

    @Override // com.google.protobuf.Schema
    public final int i(AbstractMessageLite abstractMessageLite) {
        UnknownFieldSchema unknownFieldSchema = this.f21340b;
        int i11 = unknownFieldSchema.i(unknownFieldSchema.g(abstractMessageLite));
        if (!this.f21341c) {
            return i11;
        }
        SmallSortedMap.AnonymousClass1 anonymousClass1 = this.f21342d.c(abstractMessageLite).f21252a;
        int iF = 0;
        for (int i12 = 0; i12 < anonymousClass1.f21377b.size(); i12++) {
            iF += FieldSet.f(anonymousClass1.c(i12));
        }
        Iterator<T> it = anonymousClass1.d().iterator();
        while (it.hasNext()) {
            iF += FieldSet.f((Map.Entry) it.next());
        }
        return i11 + iF;
    }

    public final boolean j(Reader reader, ExtensionRegistryLite extensionRegistryLite, ExtensionSchema extensionSchema, FieldSet fieldSet, UnknownFieldSchema unknownFieldSchema, Object obj) throws InvalidProtocolBufferException {
        int iU = reader.u();
        int iO = 0;
        MessageLite messageLite = this.f21339a;
        if (iU != 11) {
            if ((iU & 7) != 2) {
                return reader.J();
            }
            GeneratedMessageLite.GeneratedExtension generatedExtensionB = extensionSchema.b(extensionRegistryLite, messageLite, iU >>> 3);
            if (generatedExtensionB == null) {
                return unknownFieldSchema.l(0, reader, obj);
            }
            extensionSchema.h(reader, generatedExtensionB, extensionRegistryLite, fieldSet);
            return true;
        }
        GeneratedMessageLite.GeneratedExtension generatedExtensionB2 = null;
        ByteString byteStringG = null;
        while (reader.B() != Integer.MAX_VALUE) {
            int iU2 = reader.u();
            if (iU2 == 16) {
                iO = reader.o();
                generatedExtensionB2 = extensionSchema.b(extensionRegistryLite, messageLite, iO);
            } else if (iU2 == 26) {
                if (generatedExtensionB2 != null) {
                    extensionSchema.h(reader, generatedExtensionB2, extensionRegistryLite, fieldSet);
                } else {
                    byteStringG = reader.G();
                }
            } else if (!reader.J()) {
                break;
            }
        }
        if (reader.u() != 12) {
            throw InvalidProtocolBufferException.a();
        }
        if (byteStringG != null) {
            if (generatedExtensionB2 != null) {
                extensionSchema.i(byteStringG, generatedExtensionB2, extensionRegistryLite, fieldSet);
                return true;
            }
            unknownFieldSchema.d(obj, iO, byteStringG);
        }
        return true;
    }
}
