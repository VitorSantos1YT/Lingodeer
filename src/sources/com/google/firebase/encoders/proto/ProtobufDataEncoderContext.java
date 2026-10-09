package com.google.firebase.encoders.proto;

import b7.e0;
import com.adjust.sdk.Constants;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.ValueEncoder;
import com.yalantis.ucrop.view.CropImageView;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class ProtobufDataEncoderContext implements ObjectEncoderContext {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Charset f19648f = Charset.forName(Constants.ENCODING);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final FieldDescriptor f19649g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final FieldDescriptor f19650h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f19651i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public OutputStream f19652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f19653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f19654c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ObjectEncoder f19655d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ProtobufValueEncoderContext f19656e = new ProtobufValueEncoderContext(this);

    /* JADX INFO: renamed from: com.google.firebase.encoders.proto.ProtobufDataEncoderContext$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19657a;

        static {
            int[] iArr = new int[Protobuf.IntEncoding.values().length];
            f19657a = iArr;
            try {
                iArr[Protobuf.IntEncoding.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19657a[Protobuf.IntEncoding.SIGNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19657a[Protobuf.IntEncoding.FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        FieldDescriptor.Builder builder = new FieldDescriptor.Builder("key");
        AtProtobuf atProtobuf = new AtProtobuf();
        atProtobuf.f19643a = 1;
        f19649g = e0.h(atProtobuf, builder);
        FieldDescriptor.Builder builder2 = new FieldDescriptor.Builder("value");
        AtProtobuf atProtobuf2 = new AtProtobuf();
        atProtobuf2.f19643a = 2;
        f19650h = e0.h(atProtobuf2, builder2);
        f19651i = new a(0);
    }

    public ProtobufDataEncoderContext(ByteArrayOutputStream byteArrayOutputStream, HashMap map, HashMap map2, ObjectEncoder objectEncoder) {
        this.f19652a = byteArrayOutputStream;
        this.f19653b = map;
        this.f19654c = map2;
        this.f19655d = objectEncoder;
    }

    public static int k(FieldDescriptor fieldDescriptor) {
        Protobuf protobuf = (Protobuf) ((Annotation) fieldDescriptor.f19623b.get(Protobuf.class));
        if (protobuf != null) {
            return protobuf.tag();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext a(FieldDescriptor fieldDescriptor, boolean z11) {
        f(fieldDescriptor, z11 ? 1 : 0, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext b(FieldDescriptor fieldDescriptor, long j11) throws IOException {
        h(fieldDescriptor, j11, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext c(FieldDescriptor fieldDescriptor, int i11) {
        f(fieldDescriptor, i11, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext d(FieldDescriptor fieldDescriptor, double d5) throws IOException {
        e(fieldDescriptor, d5, true);
        return this;
    }

    public final void e(FieldDescriptor fieldDescriptor, double d5, boolean z11) throws IOException {
        if (z11 && d5 == 0.0d) {
            return;
        }
        l((k(fieldDescriptor) << 3) | 1);
        this.f19652a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d5).array());
    }

    public final void f(FieldDescriptor fieldDescriptor, int i11, boolean z11) {
        if (z11 && i11 == 0) {
            return;
        }
        Protobuf protobuf = (Protobuf) ((Annotation) fieldDescriptor.f19623b.get(Protobuf.class));
        if (protobuf == null) {
            throw new EncodingException("Field has no @Protobuf config");
        }
        int i12 = AnonymousClass1.f19657a[protobuf.intEncoding().ordinal()];
        if (i12 == 1) {
            l(protobuf.tag() << 3);
            l(i11);
        } else if (i12 == 2) {
            l(protobuf.tag() << 3);
            l((i11 << 1) ^ (i11 >> 31));
        } else {
            if (i12 != 3) {
                return;
            }
            l((protobuf.tag() << 3) | 5);
            this.f19652a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i11).array());
        }
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext g(FieldDescriptor fieldDescriptor, Object obj) {
        i(fieldDescriptor, obj, true);
        return this;
    }

    public final void h(FieldDescriptor fieldDescriptor, long j11, boolean z11) throws IOException {
        if (z11 && j11 == 0) {
            return;
        }
        Protobuf protobuf = (Protobuf) ((Annotation) fieldDescriptor.f19623b.get(Protobuf.class));
        if (protobuf == null) {
            throw new EncodingException("Field has no @Protobuf config");
        }
        int i11 = AnonymousClass1.f19657a[protobuf.intEncoding().ordinal()];
        if (i11 == 1) {
            l(protobuf.tag() << 3);
            m(j11);
        } else if (i11 == 2) {
            l(protobuf.tag() << 3);
            m((j11 >> 63) ^ (j11 << 1));
        } else {
            if (i11 != 3) {
                return;
            }
            l((protobuf.tag() << 3) | 1);
            this.f19652a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j11).array());
        }
    }

    public final void i(FieldDescriptor fieldDescriptor, Object obj, boolean z11) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z11 && charSequence.length() == 0) {
                return;
            }
            l((k(fieldDescriptor) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f19648f);
            l(bytes.length);
            this.f19652a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                i(fieldDescriptor, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                j(f19651i, fieldDescriptor, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            e(fieldDescriptor, ((Double) obj).doubleValue(), z11);
            return;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (z11 && fFloatValue == CropImageView.DEFAULT_ASPECT_RATIO) {
                return;
            }
            l((k(fieldDescriptor) << 3) | 5);
            this.f19652a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(fFloatValue).array());
            return;
        }
        if (obj instanceof Number) {
            h(fieldDescriptor, ((Number) obj).longValue(), z11);
            return;
        }
        if (obj instanceof Boolean) {
            f(fieldDescriptor, ((Boolean) obj).booleanValue() ? 1 : 0, z11);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z11 && bArr.length == 0) {
                return;
            }
            l((k(fieldDescriptor) << 3) | 2);
            l(bArr.length);
            this.f19652a.write(bArr);
            return;
        }
        ObjectEncoder objectEncoder = (ObjectEncoder) this.f19653b.get(obj.getClass());
        if (objectEncoder != null) {
            j(objectEncoder, fieldDescriptor, obj, z11);
            return;
        }
        ValueEncoder valueEncoder = (ValueEncoder) this.f19654c.get(obj.getClass());
        if (valueEncoder != null) {
            ProtobufValueEncoderContext protobufValueEncoderContext = this.f19656e;
            protobufValueEncoderContext.f19665a = false;
            protobufValueEncoderContext.f19667c = fieldDescriptor;
            protobufValueEncoderContext.f19666b = z11;
            valueEncoder.a(obj, protobufValueEncoderContext);
            return;
        }
        if (obj instanceof ProtoEnum) {
            f(fieldDescriptor, ((ProtoEnum) obj).d(), true);
        } else if (obj instanceof Enum) {
            f(fieldDescriptor, ((Enum) obj).ordinal(), true);
        } else {
            j(this.f19655d, fieldDescriptor, obj, z11);
        }
    }

    public final void j(ObjectEncoder objectEncoder, FieldDescriptor fieldDescriptor, Object obj, boolean z11) throws IOException {
        LengthCountingOutputStream lengthCountingOutputStream = new LengthCountingOutputStream();
        try {
            OutputStream outputStream = this.f19652a;
            this.f19652a = lengthCountingOutputStream;
            try {
                objectEncoder.a(obj, this);
                this.f19652a = outputStream;
                long j11 = lengthCountingOutputStream.f19647a;
                lengthCountingOutputStream.close();
                if (z11 && j11 == 0) {
                    return;
                }
                l((k(fieldDescriptor) << 3) | 2);
                m(j11);
                objectEncoder.a(obj, this);
            } catch (Throwable th2) {
                this.f19652a = outputStream;
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                lengthCountingOutputStream.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public final void l(int i11) throws IOException {
        while ((i11 & (-128)) != 0) {
            this.f19652a.write((i11 & 127) | 128);
            i11 >>>= 7;
        }
        this.f19652a.write(i11 & 127);
    }

    public final void m(long j11) throws IOException {
        while (((-128) & j11) != 0) {
            this.f19652a.write((((int) j11) & 127) | 128);
            j11 >>>= 7;
        }
        this.f19652a.write(((int) j11) & 127);
    }
}
