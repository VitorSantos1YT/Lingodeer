package com.google.protobuf;

import com.google.api.ResourceDescriptor;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.Builder;
import defpackage.e;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class GeneratedMessageLite<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends Builder<MessageType, BuilderType>> extends AbstractMessageLite<MessageType, BuilderType> {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, GeneratedMessageLite<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected UnknownFieldSetLite unknownFields = UnknownFieldSetLite.f21406f;

    /* JADX INFO: renamed from: com.google.protobuf.GeneratedMessageLite$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21264a;

        static {
            int[] iArr = new int[WireFormat.JavaType.values().length];
            f21264a = iArr;
            try {
                iArr[WireFormat.JavaType.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21264a[WireFormat.JavaType.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static abstract class Builder<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends Builder<MessageType, BuilderType>> extends AbstractMessageLite.Builder<MessageType, BuilderType> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final GeneratedMessageLite f21265a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public GeneratedMessageLite f21266b;

        public Builder(GeneratedMessageLite generatedMessageLite) {
            this.f21265a = generatedMessageLite;
            if (generatedMessageLite.x()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.f21266b = generatedMessageLite.A();
        }

        public static void q(Object obj, Object obj2) {
            Protobuf protobuf = Protobuf.f21349c;
            protobuf.getClass();
            protobuf.a(obj.getClass()).a(obj, obj2);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder
        public final boolean c() {
            return GeneratedMessageLite.w(this.f21266b, false);
        }

        @Override // com.google.protobuf.AbstractMessageLite.Builder
        public final Object clone() {
            Builder builder = (Builder) this.f21265a.q(MethodToInvoke.NEW_BUILDER, null);
            builder.f21266b = O0();
            return builder;
        }

        @Override // com.google.protobuf.AbstractMessageLite.Builder
        /* JADX INFO: renamed from: k */
        public final Builder clone() {
            Builder builder = (Builder) this.f21265a.q(MethodToInvoke.NEW_BUILDER, null);
            builder.f21266b = O0();
            return builder;
        }

        public final GeneratedMessageLite l() {
            GeneratedMessageLite generatedMessageLiteO0 = O0();
            generatedMessageLiteO0.getClass();
            if (GeneratedMessageLite.w(generatedMessageLiteO0, true)) {
                return generatedMessageLiteO0;
            }
            throw new UninitializedMessageException();
        }

        @Override // com.google.protobuf.MessageLite.Builder
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public GeneratedMessageLite O0() {
            if (!this.f21266b.x()) {
                return this.f21266b;
            }
            GeneratedMessageLite generatedMessageLite = this.f21266b;
            generatedMessageLite.getClass();
            Protobuf protobuf = Protobuf.f21349c;
            protobuf.getClass();
            protobuf.a(generatedMessageLite.getClass()).b(generatedMessageLite);
            generatedMessageLite.y();
            return this.f21266b;
        }

        public final void n() {
            if (this.f21266b.x()) {
                return;
            }
            o();
        }

        public void o() {
            GeneratedMessageLite generatedMessageLiteA = this.f21265a.A();
            q(generatedMessageLiteA, this.f21266b);
            this.f21266b = generatedMessageLiteA;
        }

        public final void p(GeneratedMessageLite generatedMessageLite) {
            if (this.f21265a.equals(generatedMessageLite)) {
                return;
            }
            n();
            q(this.f21266b, generatedMessageLite);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class DefaultInstanceBasedParser<T extends GeneratedMessageLite<T, ?>> extends AbstractParser<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final GeneratedMessageLite f21267b;

        public DefaultInstanceBasedParser(GeneratedMessageLite generatedMessageLite) {
            this.f21267b = generatedMessageLite;
        }

        public final GeneratedMessageLite d(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            int i11 = GeneratedMessageLite.UNINITIALIZED_SERIALIZED_SIZE;
            GeneratedMessageLite generatedMessageLiteA = this.f21267b.A();
            try {
                Protobuf protobuf = Protobuf.f21349c;
                protobuf.getClass();
                Schema schemaA = protobuf.a(generatedMessageLiteA.getClass());
                CodedInputStreamReader codedInputStreamReader = codedInputStream.f21173d;
                if (codedInputStreamReader == null) {
                    codedInputStreamReader = new CodedInputStreamReader(codedInputStream);
                }
                schemaA.f(generatedMessageLiteA, codedInputStreamReader, extensionRegistryLite);
                schemaA.b(generatedMessageLiteA);
                return generatedMessageLiteA;
            } catch (InvalidProtocolBufferException e8) {
                if (e8.f21286b) {
                    throw new InvalidProtocolBufferException(e8.getMessage(), e8);
                }
                throw e8;
            } catch (UninitializedMessageException e10) {
                throw new InvalidProtocolBufferException(e10.getMessage());
            } catch (IOException e11) {
                if (e11.getCause() instanceof InvalidProtocolBufferException) {
                    throw ((InvalidProtocolBufferException) e11.getCause());
                }
                throw new InvalidProtocolBufferException(e11.getMessage(), e11);
            } catch (RuntimeException e12) {
                if (e12.getCause() instanceof InvalidProtocolBufferException) {
                    throw ((InvalidProtocolBufferException) e12.getCause());
                }
                throw e12;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static abstract class ExtendableBuilder<MessageType extends ExtendableMessage<MessageType, BuilderType>, BuilderType extends ExtendableBuilder<MessageType, BuilderType>> extends Builder<MessageType, BuilderType> implements ExtendableMessageOrBuilder<MessageType, BuilderType> {
        @Override // com.google.protobuf.GeneratedMessageLite.Builder
        public final void o() {
            super.o();
            GeneratedMessageLite generatedMessageLite = this.f21266b;
            if (((ExtendableMessage) generatedMessageLite).extensions != FieldSet.f21251d) {
                ((ExtendableMessage) generatedMessageLite).extensions = ((ExtendableMessage) generatedMessageLite).extensions.clone();
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite.Builder
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public final ExtendableMessage O0() {
            if (!((ExtendableMessage) this.f21266b).x()) {
                return (ExtendableMessage) this.f21266b;
            }
            ((ExtendableMessage) this.f21266b).extensions.j();
            return (ExtendableMessage) super.O0();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static abstract class ExtendableMessage<MessageType extends ExtendableMessage<MessageType, BuilderType>, BuilderType extends ExtendableBuilder<MessageType, BuilderType>> extends GeneratedMessageLite<MessageType, BuilderType> implements ExtendableMessageOrBuilder<MessageType, BuilderType> {
        protected FieldSet<ExtensionDescriptor> extensions = FieldSet.f21251d;

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public class ExtensionWriter {
        }

        @Override // com.google.protobuf.GeneratedMessageLite, com.google.protobuf.MessageLite
        public final Builder a() {
            Builder builder = (Builder) q(MethodToInvoke.NEW_BUILDER, null);
            builder.p(this);
            return builder;
        }

        @Override // com.google.protobuf.GeneratedMessageLite, com.google.protobuf.MessageLiteOrBuilder
        public final GeneratedMessageLite f() {
            return (GeneratedMessageLite) q(MethodToInvoke.GET_DEFAULT_INSTANCE, null);
        }

        @Override // com.google.protobuf.GeneratedMessageLite, com.google.protobuf.MessageLite
        public final Builder i() {
            return (Builder) q(MethodToInvoke.NEW_BUILDER, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface ExtendableMessageOrBuilder<MessageType extends ExtendableMessage<MessageType, BuilderType>, BuilderType extends ExtendableBuilder<MessageType, BuilderType>> extends MessageLiteOrBuilder {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class ExtensionDescriptor implements FieldSet.FieldDescriptorLite<ExtensionDescriptor> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Internal.EnumLiteMap f21268a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f21269b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final WireFormat.FieldType f21270c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f21271d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f21272e;

        public ExtensionDescriptor(Internal.EnumLiteMap enumLiteMap, int i11, WireFormat.FieldType fieldType, boolean z11, boolean z12) {
            this.f21268a = enumLiteMap;
            this.f21269b = i11;
            this.f21270c = fieldType;
            this.f21271d = z11;
            this.f21272e = z12;
        }

        @Override // com.google.protobuf.FieldSet.FieldDescriptorLite
        public final WireFormat.FieldType D() {
            return this.f21270c;
        }

        @Override // com.google.protobuf.FieldSet.FieldDescriptorLite
        public final Builder W(MessageLite.Builder builder, MessageLite messageLite) {
            Builder builder2 = (Builder) builder;
            builder2.p((GeneratedMessageLite) messageLite);
            return builder2;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            return this.f21269b - ((ExtensionDescriptor) obj).f21269b;
        }

        @Override // com.google.protobuf.FieldSet.FieldDescriptorLite
        public final int d() {
            return this.f21269b;
        }

        @Override // com.google.protobuf.FieldSet.FieldDescriptorLite
        public final WireFormat.JavaType l1() {
            return this.f21270c.a();
        }

        @Override // com.google.protobuf.FieldSet.FieldDescriptorLite
        public final boolean m1() {
            return this.f21272e;
        }

        @Override // com.google.protobuf.FieldSet.FieldDescriptorLite
        public final boolean x() {
            return this.f21271d;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class GeneratedExtension<ContainingType extends MessageLite, Type> extends ExtensionLite<ContainingType, Type> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MessageLite f21273a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f21274b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final MessageLite f21275c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ExtensionDescriptor f21276d;

        public GeneratedExtension(MessageLite messageLite, Object obj, MessageLite messageLite2, ExtensionDescriptor extensionDescriptor) {
            if (messageLite == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            }
            if (extensionDescriptor.f21270c == WireFormat.FieldType.MESSAGE && messageLite2 == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            }
            this.f21273a = messageLite;
            this.f21274b = obj;
            this.f21275c = messageLite2;
            this.f21276d = extensionDescriptor;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class MethodToInvoke {
        private static final /* synthetic */ MethodToInvoke[] $VALUES;
        public static final MethodToInvoke BUILD_MESSAGE_INFO;
        public static final MethodToInvoke GET_DEFAULT_INSTANCE;
        public static final MethodToInvoke GET_MEMOIZED_IS_INITIALIZED;
        public static final MethodToInvoke GET_PARSER;
        public static final MethodToInvoke NEW_BUILDER;
        public static final MethodToInvoke NEW_MUTABLE_INSTANCE;
        public static final MethodToInvoke SET_MEMOIZED_IS_INITIALIZED;

        static {
            MethodToInvoke methodToInvoke = new MethodToInvoke("GET_MEMOIZED_IS_INITIALIZED", 0);
            GET_MEMOIZED_IS_INITIALIZED = methodToInvoke;
            MethodToInvoke methodToInvoke2 = new MethodToInvoke("SET_MEMOIZED_IS_INITIALIZED", 1);
            SET_MEMOIZED_IS_INITIALIZED = methodToInvoke2;
            MethodToInvoke methodToInvoke3 = new MethodToInvoke("BUILD_MESSAGE_INFO", 2);
            BUILD_MESSAGE_INFO = methodToInvoke3;
            MethodToInvoke methodToInvoke4 = new MethodToInvoke("NEW_MUTABLE_INSTANCE", 3);
            NEW_MUTABLE_INSTANCE = methodToInvoke4;
            MethodToInvoke methodToInvoke5 = new MethodToInvoke("NEW_BUILDER", 4);
            NEW_BUILDER = methodToInvoke5;
            MethodToInvoke methodToInvoke6 = new MethodToInvoke("GET_DEFAULT_INSTANCE", 5);
            GET_DEFAULT_INSTANCE = methodToInvoke6;
            MethodToInvoke methodToInvoke7 = new MethodToInvoke("GET_PARSER", 6);
            GET_PARSER = methodToInvoke7;
            $VALUES = new MethodToInvoke[]{methodToInvoke, methodToInvoke2, methodToInvoke3, methodToInvoke4, methodToInvoke5, methodToInvoke6, methodToInvoke7};
        }

        public static MethodToInvoke valueOf(String str) {
            return (MethodToInvoke) java.lang.Enum.valueOf(MethodToInvoke.class, str);
        }

        public static MethodToInvoke[] values() {
            return (MethodToInvoke[]) $VALUES.clone();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;

        public Object readResolve() {
            try {
                try {
                    java.lang.reflect.Field declaredField = Class.forName(null).getDeclaredField("DEFAULT_INSTANCE");
                    declaredField.setAccessible(true);
                    ((MessageLite) declaredField.get(null)).i().getClass();
                    throw null;
                } catch (InvalidProtocolBufferException e8) {
                    throw new RuntimeException("Unable to understand proto buffer", e8);
                } catch (ClassNotFoundException e10) {
                    throw new RuntimeException("Unable to find proto buffer class: null", e10);
                } catch (IllegalAccessException e11) {
                    throw new RuntimeException("Unable to call parsePartialFrom", e11);
                } catch (NoSuchFieldException unused) {
                    java.lang.reflect.Field declaredField2 = Class.forName(null).getDeclaredField("defaultInstance");
                    declaredField2.setAccessible(true);
                    ((MessageLite) declaredField2.get(null)).i().getClass();
                    throw null;
                } catch (SecurityException e12) {
                    throw new RuntimeException("Unable to call DEFAULT_INSTANCE in null", e12);
                }
            } catch (InvalidProtocolBufferException e13) {
                throw new RuntimeException("Unable to understand proto buffer", e13);
            } catch (ClassNotFoundException e14) {
                throw new RuntimeException("Unable to find proto buffer class: null", e14);
            } catch (IllegalAccessException e15) {
                throw new RuntimeException("Unable to call parsePartialFrom", e15);
            } catch (NoSuchFieldException e16) {
                throw new RuntimeException("Unable to find defaultInstance in null", e16);
            } catch (SecurityException e17) {
                throw new RuntimeException("Unable to call defaultInstance in null", e17);
            }
        }
    }

    public static void B(ExtendableMessage extendableMessage, ResourceDescriptor resourceDescriptor, Internal.EnumLiteMap enumLiteMap, int i11, WireFormat.FieldType fieldType, boolean z11) {
        new GeneratedExtension(extendableMessage, Collections.EMPTY_LIST, resourceDescriptor, new ExtensionDescriptor(enumLiteMap, i11, fieldType, true, z11));
    }

    public static void C(ExtendableMessage extendableMessage, Object obj, GeneratedMessageLite generatedMessageLite, int i11, WireFormat.FieldType fieldType) {
        new GeneratedExtension(extendableMessage, obj, generatedMessageLite, new ExtensionDescriptor(null, i11, fieldType, false, false));
    }

    public static void D(Class cls, GeneratedMessageLite generatedMessageLite) {
        generatedMessageLite.y();
        defaultInstanceMap.put(cls, generatedMessageLite);
    }

    public static Internal.DoubleList r() {
        return DoubleArrayList.f21231d;
    }

    public static Internal.LongList s() {
        return LongArrayList.f21304d;
    }

    public static Internal.ProtobufList t() {
        return ProtobufArrayList.f21352d;
    }

    public static GeneratedMessageLite u(Class cls) {
        GeneratedMessageLite<?, ?> generatedMessageLite = defaultInstanceMap.get(cls);
        if (generatedMessageLite == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                generatedMessageLite = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e8) {
                throw new IllegalStateException("Class initialization cannot fail.", e8);
            }
        }
        if (generatedMessageLite != null) {
            return generatedMessageLite;
        }
        GeneratedMessageLite<?, ?> generatedMessageLite2 = (GeneratedMessageLite) ((GeneratedMessageLite) UnsafeUtil.c(cls)).q(MethodToInvoke.GET_DEFAULT_INSTANCE, null);
        if (generatedMessageLite2 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, generatedMessageLite2);
        return generatedMessageLite2;
    }

    public static Object v(java.lang.reflect.Method method, GeneratedMessageLite generatedMessageLite, Object... objArr) {
        try {
            return method.invoke(generatedMessageLite, objArr);
        } catch (IllegalAccessException e8) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e8);
        } catch (InvocationTargetException e10) {
            Throwable cause = e10.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static final boolean w(GeneratedMessageLite generatedMessageLite, boolean z11) {
        byte bByteValue = ((Byte) generatedMessageLite.q(MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        Protobuf protobuf = Protobuf.f21349c;
        protobuf.getClass();
        boolean zC = protobuf.a(generatedMessageLite.getClass()).c(generatedMessageLite);
        if (z11) {
            generatedMessageLite.q(MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED, zC ? generatedMessageLite : null);
        }
        return zC;
    }

    public static Object z(MessageLite messageLite, String str, Object[] objArr) {
        return new RawMessageInfo(messageLite, str, objArr);
    }

    public final GeneratedMessageLite A() {
        return (GeneratedMessageLite) q(MethodToInvoke.NEW_MUTABLE_INSTANCE, null);
    }

    @Override // com.google.protobuf.MessageLite
    public Builder a() {
        Builder builder = (Builder) q(MethodToInvoke.NEW_BUILDER, null);
        builder.p(this);
        return builder;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder
    public final boolean c() {
        return w(this, true);
    }

    @Override // com.google.protobuf.MessageLite
    public final void d(CodedOutputStream codedOutputStream) {
        Protobuf protobuf = Protobuf.f21349c;
        protobuf.getClass();
        Schema schemaA = protobuf.a(getClass());
        CodedOutputStreamWriter codedOutputStreamWriter = codedOutputStream.f21213a;
        if (codedOutputStreamWriter == null) {
            codedOutputStreamWriter = new CodedOutputStreamWriter(codedOutputStream);
        }
        schemaA.e(this, codedOutputStreamWriter);
    }

    @Override // com.google.protobuf.AbstractMessageLite
    public final int e() {
        return this.memoizedSerializedSize & MEMOIZED_SERIALIZED_SIZE_MASK;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Protobuf protobuf = Protobuf.f21349c;
        protobuf.getClass();
        return protobuf.a(getClass()).h(this, (GeneratedMessageLite) obj);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder
    public GeneratedMessageLite f() {
        return (GeneratedMessageLite) q(MethodToInvoke.GET_DEFAULT_INSTANCE, null);
    }

    @Override // com.google.protobuf.MessageLite
    public final int h() {
        return k(null);
    }

    public final int hashCode() {
        if (x()) {
            Protobuf protobuf = Protobuf.f21349c;
            protobuf.getClass();
            return protobuf.a(getClass()).g(this);
        }
        if (this.memoizedHashCode == 0) {
            Protobuf protobuf2 = Protobuf.f21349c;
            protobuf2.getClass();
            this.memoizedHashCode = protobuf2.a(getClass()).g(this);
        }
        return this.memoizedHashCode;
    }

    @Override // com.google.protobuf.MessageLite
    public Builder i() {
        return (Builder) q(MethodToInvoke.NEW_BUILDER, null);
    }

    @Override // com.google.protobuf.MessageLite
    public final Parser j() {
        return (Parser) q(MethodToInvoke.GET_PARSER, null);
    }

    @Override // com.google.protobuf.AbstractMessageLite
    public final int k(Schema schema) {
        int i11;
        int i12;
        if (x()) {
            if (schema == null) {
                Protobuf protobuf = Protobuf.f21349c;
                protobuf.getClass();
                i12 = protobuf.a(getClass()).i(this);
            } else {
                i12 = schema.i(this);
            }
            if (i12 >= 0) {
                return i12;
            }
            throw new IllegalStateException(p.j(i12, "serialized size must be non-negative, was "));
        }
        if (e() != MEMOIZED_SERIALIZED_SIZE_MASK) {
            return e();
        }
        if (schema == null) {
            Protobuf protobuf2 = Protobuf.f21349c;
            protobuf2.getClass();
            i11 = protobuf2.a(getClass()).i(this);
        } else {
            i11 = schema.i(this);
        }
        m(i11);
        return i11;
    }

    @Override // com.google.protobuf.AbstractMessageLite
    public final void m(int i11) {
        if (i11 < 0) {
            throw new IllegalStateException(p.j(i11, "serialized size must be non-negative, was "));
        }
        this.memoizedSerializedSize = (i11 & MEMOIZED_SERIALIZED_SIZE_MASK) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
    }

    public final Builder p() {
        return (Builder) q(MethodToInvoke.NEW_BUILDER, null);
    }

    public abstract Object q(MethodToInvoke methodToInvoke, GeneratedMessageLite generatedMessageLite);

    public final String toString() {
        String string = super.toString();
        char[] cArr = MessageLiteToString.f21321a;
        StringBuilder sbR = e.r("# ", string);
        MessageLiteToString.c(this, sbR, 0);
        return sbR.toString();
    }

    public final boolean x() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    public final void y() {
        this.memoizedSerializedSize &= MEMOIZED_SERIALIZED_SIZE_MASK;
    }
}
