package com.google.protobuf;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@CheckReturnValue
final class ExtensionSchemaLite extends ExtensionSchema<GeneratedMessageLite.ExtensionDescriptor> {

    /* JADX INFO: renamed from: com.google.protobuf.ExtensionSchemaLite$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21245a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f21245a = iArr;
            try {
                iArr[WireFormat.FieldType.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21245a[WireFormat.FieldType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21245a[WireFormat.FieldType.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21245a[WireFormat.FieldType.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21245a[WireFormat.FieldType.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21245a[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21245a[WireFormat.FieldType.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f21245a[WireFormat.FieldType.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f21245a[WireFormat.FieldType.UINT32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f21245a[WireFormat.FieldType.SFIXED32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f21245a[WireFormat.FieldType.SFIXED64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f21245a[WireFormat.FieldType.SINT32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f21245a[WireFormat.FieldType.SINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f21245a[WireFormat.FieldType.ENUM.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f21245a[WireFormat.FieldType.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f21245a[WireFormat.FieldType.STRING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f21245a[WireFormat.FieldType.GROUP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f21245a[WireFormat.FieldType.MESSAGE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    @Override // com.google.protobuf.ExtensionSchema
    public final int a(Map.Entry entry) {
        return ((GeneratedMessageLite.ExtensionDescriptor) entry.getKey()).f21269b;
    }

    @Override // com.google.protobuf.ExtensionSchema
    public final GeneratedMessageLite.GeneratedExtension b(ExtensionRegistryLite extensionRegistryLite, MessageLite messageLite, int i11) {
        return (GeneratedMessageLite.GeneratedExtension) extensionRegistryLite.f21242a.get(new ExtensionRegistryLite.ObjectIntPair(i11, messageLite));
    }

    @Override // com.google.protobuf.ExtensionSchema
    public final FieldSet c(Object obj) {
        return ((GeneratedMessageLite.ExtendableMessage) obj).extensions;
    }

    @Override // com.google.protobuf.ExtensionSchema
    public final FieldSet d(Object obj) {
        GeneratedMessageLite.ExtendableMessage extendableMessage = (GeneratedMessageLite.ExtendableMessage) obj;
        FieldSet<GeneratedMessageLite.ExtensionDescriptor> fieldSet = extendableMessage.extensions;
        if (fieldSet.f21253b) {
            extendableMessage.extensions = fieldSet.clone();
        }
        return extendableMessage.extensions;
    }

    @Override // com.google.protobuf.ExtensionSchema
    public final boolean e(MessageLite messageLite) {
        return messageLite instanceof GeneratedMessageLite.ExtendableMessage;
    }

    @Override // com.google.protobuf.ExtensionSchema
    public final void f(Object obj) {
        ((GeneratedMessageLite.ExtendableMessage) obj).extensions.j();
    }

    @Override // com.google.protobuf.ExtensionSchema
    public final Object g(Object obj, Reader reader, Object obj2, ExtensionRegistryLite extensionRegistryLite, FieldSet fieldSet, Object obj3, UnknownFieldSchema unknownFieldSchema) {
        Object objValueOf;
        Object objE;
        List arrayList;
        ArrayList arrayList2;
        GeneratedMessageLite.GeneratedExtension generatedExtension = (GeneratedMessageLite.GeneratedExtension) obj2;
        GeneratedMessageLite.ExtensionDescriptor extensionDescriptor = generatedExtension.f21276d;
        MessageLite messageLite = generatedExtension.f21275c;
        int i11 = extensionDescriptor.f21269b;
        WireFormat.FieldType fieldType = extensionDescriptor.f21270c;
        if (extensionDescriptor.f21271d && extensionDescriptor.f21272e) {
            switch (AnonymousClass1.f21245a[fieldType.ordinal()]) {
                case 1:
                    arrayList2 = new ArrayList();
                    reader.M(arrayList2);
                    break;
                case 2:
                    arrayList2 = new ArrayList();
                    reader.H(arrayList2);
                    break;
                case 3:
                    arrayList2 = new ArrayList();
                    reader.p(arrayList2);
                    break;
                case 4:
                    arrayList2 = new ArrayList();
                    reader.n(arrayList2);
                    break;
                case 5:
                    arrayList2 = new ArrayList();
                    reader.r(arrayList2);
                    break;
                case 6:
                    arrayList2 = new ArrayList();
                    reader.P(arrayList2);
                    break;
                case 7:
                    arrayList2 = new ArrayList();
                    reader.v(arrayList2);
                    break;
                case 8:
                    arrayList2 = new ArrayList();
                    reader.y(arrayList2);
                    break;
                case 9:
                    arrayList2 = new ArrayList();
                    reader.g(arrayList2);
                    break;
                case 10:
                    arrayList2 = new ArrayList();
                    reader.d(arrayList2);
                    break;
                case 11:
                    arrayList2 = new ArrayList();
                    reader.q(arrayList2);
                    break;
                case 12:
                    arrayList2 = new ArrayList();
                    reader.a(arrayList2);
                    break;
                case 13:
                    arrayList2 = new ArrayList();
                    reader.e(arrayList2);
                    break;
                case 14:
                    arrayList2 = new ArrayList();
                    reader.s(arrayList2);
                    obj3 = SchemaUtil.j(obj, i11, arrayList2, extensionDescriptor.f21268a, obj3, unknownFieldSchema);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + extensionDescriptor.f21270c);
            }
            fieldSet.l(extensionDescriptor, arrayList2);
            return obj3;
        }
        if (fieldType != WireFormat.FieldType.ENUM) {
            switch (AnonymousClass1.f21245a[fieldType.ordinal()]) {
                case 1:
                    objValueOf = Double.valueOf(reader.readDouble());
                    break;
                case 2:
                    objValueOf = Float.valueOf(reader.readFloat());
                    break;
                case 3:
                    objValueOf = Long.valueOf(reader.N());
                    break;
                case 4:
                    objValueOf = Long.valueOf(reader.b());
                    break;
                case 5:
                    objValueOf = Integer.valueOf(reader.I());
                    break;
                case 6:
                    objValueOf = Long.valueOf(reader.c());
                    break;
                case 7:
                    objValueOf = Integer.valueOf(reader.j());
                    break;
                case 8:
                    objValueOf = Boolean.valueOf(reader.k());
                    break;
                case 9:
                    objValueOf = Integer.valueOf(reader.o());
                    break;
                case 10:
                    objValueOf = Integer.valueOf(reader.K());
                    break;
                case 11:
                    objValueOf = Long.valueOf(reader.m());
                    break;
                case 12:
                    objValueOf = Integer.valueOf(reader.w());
                    break;
                case 13:
                    objValueOf = Long.valueOf(reader.x());
                    break;
                case 14:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 15:
                    objValueOf = reader.G();
                    break;
                case 16:
                    objValueOf = reader.z();
                    break;
                case 17:
                    if (!extensionDescriptor.f21271d) {
                        Object objE2 = fieldSet.e(extensionDescriptor);
                        if (objE2 instanceof GeneratedMessageLite) {
                            Protobuf protobuf = Protobuf.f21349c;
                            protobuf.getClass();
                            Schema schemaA = protobuf.a(objE2.getClass());
                            if (!((GeneratedMessageLite) objE2).x()) {
                                Object objD = schemaA.d();
                                schemaA.a(objD, objE2);
                                fieldSet.l(extensionDescriptor, objD);
                                objE2 = objD;
                            }
                            reader.i(objE2, schemaA, extensionRegistryLite);
                            return obj3;
                        }
                    }
                    objValueOf = reader.A(messageLite.getClass(), extensionRegistryLite);
                    break;
                case 18:
                    if (!extensionDescriptor.f21271d) {
                        Object objE3 = fieldSet.e(extensionDescriptor);
                        if (objE3 instanceof GeneratedMessageLite) {
                            Protobuf protobuf2 = Protobuf.f21349c;
                            protobuf2.getClass();
                            Schema schemaA2 = protobuf2.a(objE3.getClass());
                            if (!((GeneratedMessageLite) objE3).x()) {
                                Object objD2 = schemaA2.d();
                                schemaA2.a(objD2, objE3);
                                fieldSet.l(extensionDescriptor, objD2);
                                objE3 = objD2;
                            }
                            reader.D(objE3, schemaA2, extensionRegistryLite);
                            return obj3;
                        }
                    }
                    objValueOf = reader.h(messageLite.getClass(), extensionRegistryLite);
                    break;
                default:
                    objValueOf = null;
                    break;
            }
        } else {
            int I = reader.I();
            if (extensionDescriptor.f21268a.a(I) == null) {
                return SchemaUtil.n(obj, i11, I, obj3, unknownFieldSchema);
            }
            objValueOf = Integer.valueOf(I);
        }
        if (extensionDescriptor.f21271d) {
            fieldSet.getClass();
            if (!extensionDescriptor.f21271d) {
                throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
            }
            FieldSet.m(extensionDescriptor, objValueOf);
            Object objE4 = fieldSet.e(extensionDescriptor);
            if (objE4 == null) {
                arrayList = new ArrayList();
                fieldSet.f21252a.put(extensionDescriptor, arrayList);
            } else {
                arrayList = (List) objE4;
            }
            arrayList.add(objValueOf);
            return obj3;
        }
        int i12 = AnonymousClass1.f21245a[extensionDescriptor.f21270c.ordinal()];
        if ((i12 == 17 || i12 == 18) && (objE = fieldSet.e(extensionDescriptor)) != null) {
            GeneratedMessageLite.Builder builderA = ((MessageLite) objE).a();
            MessageLite messageLite2 = (MessageLite) objValueOf;
            if (!builderA.f21265a.getClass().isInstance(messageLite2)) {
                throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
            }
            builderA.getClass();
            builderA.p((GeneratedMessageLite) ((AbstractMessageLite) messageLite2));
            objValueOf = builderA.O0();
        }
        fieldSet.l(extensionDescriptor, objValueOf);
        return obj3;
    }

    @Override // com.google.protobuf.ExtensionSchema
    public final void h(Reader reader, Object obj, ExtensionRegistryLite extensionRegistryLite, FieldSet fieldSet) {
        GeneratedMessageLite.GeneratedExtension generatedExtension = (GeneratedMessageLite.GeneratedExtension) obj;
        fieldSet.l(generatedExtension.f21276d, reader.h(generatedExtension.f21275c.getClass(), extensionRegistryLite));
    }

    @Override // com.google.protobuf.ExtensionSchema
    public final void i(ByteString byteString, Object obj, ExtensionRegistryLite extensionRegistryLite, FieldSet fieldSet) throws IOException {
        GeneratedMessageLite.GeneratedExtension generatedExtension = (GeneratedMessageLite.GeneratedExtension) obj;
        GeneratedMessageLite.Builder builderI = generatedExtension.f21275c.i();
        CodedInputStream codedInputStreamN = byteString.n();
        builderI.n();
        try {
            Protobuf protobuf = Protobuf.f21349c;
            GeneratedMessageLite generatedMessageLite = builderI.f21266b;
            protobuf.getClass();
            Schema schemaA = protobuf.a(generatedMessageLite.getClass());
            GeneratedMessageLite generatedMessageLite2 = builderI.f21266b;
            CodedInputStreamReader codedInputStreamReader = codedInputStreamN.f21173d;
            if (codedInputStreamReader == null) {
                codedInputStreamReader = new CodedInputStreamReader(codedInputStreamN);
            }
            schemaA.f(generatedMessageLite2, codedInputStreamReader, extensionRegistryLite);
            fieldSet.l(generatedExtension.f21276d, builderI.O0());
            codedInputStreamN.a(0);
        } catch (RuntimeException e8) {
            if (!(e8.getCause() instanceof IOException)) {
                throw e8;
            }
            throw ((IOException) e8.getCause());
        }
    }

    @Override // com.google.protobuf.ExtensionSchema
    public final void j(Writer writer, Map.Entry entry) {
        GeneratedMessageLite.ExtensionDescriptor extensionDescriptor = (GeneratedMessageLite.ExtensionDescriptor) entry.getKey();
        boolean z11 = extensionDescriptor.f21271d;
        WireFormat.FieldType fieldType = extensionDescriptor.f21270c;
        boolean z12 = extensionDescriptor.f21272e;
        int i11 = extensionDescriptor.f21269b;
        if (!z11) {
            switch (AnonymousClass1.f21245a[fieldType.ordinal()]) {
                case 1:
                    writer.g(i11, ((Double) entry.getValue()).doubleValue());
                    break;
                case 2:
                    writer.H(i11, ((Float) entry.getValue()).floatValue());
                    break;
                case 3:
                    writer.r(i11, ((Long) entry.getValue()).longValue());
                    break;
                case 4:
                    writer.o(i11, ((Long) entry.getValue()).longValue());
                    break;
                case 5:
                    writer.x(i11, ((Integer) entry.getValue()).intValue());
                    break;
                case 6:
                    writer.k(i11, ((Long) entry.getValue()).longValue());
                    break;
                case 7:
                    writer.f(i11, ((Integer) entry.getValue()).intValue());
                    break;
                case 8:
                    writer.s(i11, ((Boolean) entry.getValue()).booleanValue());
                    break;
                case 9:
                    writer.d(i11, ((Integer) entry.getValue()).intValue());
                    break;
                case 10:
                    writer.u(i11, ((Integer) entry.getValue()).intValue());
                    break;
                case 11:
                    writer.A(i11, ((Long) entry.getValue()).longValue());
                    break;
                case 12:
                    writer.O(i11, ((Integer) entry.getValue()).intValue());
                    break;
                case 13:
                    writer.G(i11, ((Long) entry.getValue()).longValue());
                    break;
                case 14:
                    writer.x(i11, ((Integer) entry.getValue()).intValue());
                    break;
                case 15:
                    writer.w(i11, (ByteString) entry.getValue());
                    break;
                case 16:
                    writer.n(i11, (String) entry.getValue());
                    break;
                case 17:
                    writer.t(i11, entry.getValue(), Protobuf.f21349c.a(entry.getValue().getClass()));
                    break;
                case 18:
                    writer.j(i11, entry.getValue(), Protobuf.f21349c.a(entry.getValue().getClass()));
                    break;
            }
        }
        switch (AnonymousClass1.f21245a[fieldType.ordinal()]) {
            case 1:
                SchemaUtil.p(i11, (List) entry.getValue(), writer, z12);
                break;
            case 2:
                SchemaUtil.s(i11, (List) entry.getValue(), writer, z12);
                break;
            case 3:
                SchemaUtil.u(i11, (List) entry.getValue(), writer, z12);
                break;
            case 4:
                SchemaUtil.A(i11, (List) entry.getValue(), writer, z12);
                break;
            case 5:
                SchemaUtil.t(i11, (List) entry.getValue(), writer, z12);
                break;
            case 6:
                SchemaUtil.r(i11, (List) entry.getValue(), writer, z12);
                break;
            case 7:
                SchemaUtil.q(i11, (List) entry.getValue(), writer, z12);
                break;
            case 8:
                SchemaUtil.o(i11, (List) entry.getValue(), writer, z12);
                break;
            case 9:
                SchemaUtil.z(i11, (List) entry.getValue(), writer, z12);
                break;
            case 10:
                SchemaUtil.v(i11, (List) entry.getValue(), writer, z12);
                break;
            case 11:
                SchemaUtil.w(i11, (List) entry.getValue(), writer, z12);
                break;
            case 12:
                SchemaUtil.x(i11, (List) entry.getValue(), writer, z12);
                break;
            case 13:
                SchemaUtil.y(i11, (List) entry.getValue(), writer, z12);
                break;
            case 14:
                SchemaUtil.t(i11, (List) entry.getValue(), writer, z12);
                break;
            case 15:
                List list = (List) entry.getValue();
                Class cls = SchemaUtil.f21373a;
                if (list != null && !list.isEmpty()) {
                    writer.P(i11, list);
                    break;
                }
                break;
            case 16:
                List list2 = (List) entry.getValue();
                Class cls2 = SchemaUtil.f21373a;
                if (list2 != null && !list2.isEmpty()) {
                    writer.m(i11, list2);
                    break;
                }
                break;
            case 17:
                List list3 = (List) entry.getValue();
                if (list3 != null && !list3.isEmpty()) {
                    List list4 = (List) entry.getValue();
                    Schema schemaA = Protobuf.f21349c.a(list3.get(0).getClass());
                    Class cls3 = SchemaUtil.f21373a;
                    if (list4 != null && !list4.isEmpty()) {
                        writer.b(i11, list4, schemaA);
                        break;
                    }
                }
                break;
            case 18:
                List list5 = (List) entry.getValue();
                if (list5 != null && !list5.isEmpty()) {
                    List list6 = (List) entry.getValue();
                    Schema schemaA2 = Protobuf.f21349c.a(list5.get(0).getClass());
                    Class cls4 = SchemaUtil.f21373a;
                    if (list6 != null && !list6.isEmpty()) {
                        writer.a(i11, list6, schemaA2);
                        break;
                    }
                }
                break;
        }
    }
}
