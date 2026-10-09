package com.google.firebase.encoders.json;

import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ValueEncoder;
import com.google.firebase.encoders.ValueEncoderContext;
import com.google.firebase.encoders.config.EncoderConfig;
import j$.util.DesugarTimeZone;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class JsonDataEncoderBuilder implements EncoderConfig<JsonDataEncoderBuilder> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f19627f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f19628g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f19630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f19631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f19632c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f19633d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f19626e = new a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final TimestampEncoder f19629h = new TimestampEncoder(0);

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class TimestampEncoder implements ValueEncoder<Date> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SimpleDateFormat f19635a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f19635a = simpleDateFormat;
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        }

        private TimestampEncoder() {
        }

        @Override // com.google.firebase.encoders.ValueEncoder
        public final void a(Object obj, Object obj2) {
            ((ValueEncoderContext) obj2).e(f19635a.format((Date) obj));
        }

        public /* synthetic */ TimestampEncoder(int i11) {
            this();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.firebase.encoders.json.b] */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.firebase.encoders.json.b] */
    static {
        final int i11 = 0;
        f19627f = new ValueEncoder() { // from class: com.google.firebase.encoders.json.b
            @Override // com.google.firebase.encoders.ValueEncoder
            public final void a(Object obj, Object obj2) {
                switch (i11) {
                    case 0:
                        a aVar = JsonDataEncoderBuilder.f19626e;
                        ((ValueEncoderContext) obj2).e((String) obj);
                        break;
                    default:
                        a aVar2 = JsonDataEncoderBuilder.f19626e;
                        ((ValueEncoderContext) obj2).f(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
        final int i12 = 1;
        f19628g = new ValueEncoder() { // from class: com.google.firebase.encoders.json.b
            @Override // com.google.firebase.encoders.ValueEncoder
            public final void a(Object obj, Object obj2) {
                switch (i12) {
                    case 0:
                        a aVar = JsonDataEncoderBuilder.f19626e;
                        ((ValueEncoderContext) obj2).e((String) obj);
                        break;
                    default:
                        a aVar2 = JsonDataEncoderBuilder.f19626e;
                        ((ValueEncoderContext) obj2).f(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
    }

    public JsonDataEncoderBuilder() {
        HashMap map = new HashMap();
        this.f19630a = map;
        HashMap map2 = new HashMap();
        this.f19631b = map2;
        this.f19632c = f19626e;
        this.f19633d = false;
        map2.put(String.class, f19627f);
        map.remove(String.class);
        map2.put(Boolean.class, f19628g);
        map.remove(Boolean.class);
        map2.put(Date.class, f19629h);
        map.remove(Date.class);
    }

    public final DataEncoder a() {
        return new DataEncoder() { // from class: com.google.firebase.encoders.json.JsonDataEncoderBuilder.1
            @Override // com.google.firebase.encoders.DataEncoder
            public final void a(Writer writer, Object obj) throws IOException {
                JsonDataEncoderBuilder jsonDataEncoderBuilder = JsonDataEncoderBuilder.this;
                JsonValueObjectEncoderContext jsonValueObjectEncoderContext = new JsonValueObjectEncoderContext(writer, jsonDataEncoderBuilder.f19630a, jsonDataEncoderBuilder.f19631b, jsonDataEncoderBuilder.f19632c, jsonDataEncoderBuilder.f19633d);
                jsonValueObjectEncoderContext.h(obj);
                jsonValueObjectEncoderContext.j();
                jsonValueObjectEncoderContext.f19637b.flush();
            }

            @Override // com.google.firebase.encoders.DataEncoder
            public final String b(Object obj) {
                StringWriter stringWriter = new StringWriter();
                try {
                    a(stringWriter, obj);
                } catch (IOException unused) {
                }
                return stringWriter.toString();
            }
        };
    }

    public final EncoderConfig b(Class cls, ObjectEncoder objectEncoder) {
        this.f19630a.put(cls, objectEncoder);
        this.f19631b.remove(cls);
        return this;
    }
}
