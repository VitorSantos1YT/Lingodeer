package com.google.firebase.encoders.proto;

import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.config.EncoderConfig;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class ProtobufEncoder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f19658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f19659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ObjectEncoder f19660c;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder implements EncoderConfig<Builder> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f19661d = new a(1);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HashMap f19662a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final HashMap f19663b = new HashMap();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a f19664c = f19661d;

        public final EncoderConfig a(Class cls, ObjectEncoder objectEncoder) {
            this.f19662a.put(cls, objectEncoder);
            this.f19663b.remove(cls);
            return this;
        }
    }

    public ProtobufEncoder(HashMap map, HashMap map2, a aVar) {
        this.f19658a = map;
        this.f19659b = map2;
        this.f19660c = aVar;
    }

    public final void a(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap map = this.f19659b;
        ObjectEncoder objectEncoder = this.f19660c;
        HashMap map2 = this.f19658a;
        ProtobufDataEncoderContext protobufDataEncoderContext = new ProtobufDataEncoderContext(byteArrayOutputStream, map2, map, objectEncoder);
        if (obj == null) {
            return;
        }
        ObjectEncoder objectEncoder2 = (ObjectEncoder) map2.get(obj.getClass());
        if (objectEncoder2 != null) {
            objectEncoder2.a(obj, protobufDataEncoderContext);
        } else {
            throw new EncodingException("No encoder for " + obj.getClass());
        }
    }
}
