package com.google.firebase.encoders.json;

import android.util.Base64;
import android.util.JsonWriter;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.ValueEncoder;
import com.google.firebase.encoders.ValueEncoderContext;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class JsonValueObjectEncoderContext implements ObjectEncoderContext, ValueEncoderContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f19636a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JsonWriter f19637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f19638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f19639d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ObjectEncoder f19640e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f19641f;

    public JsonValueObjectEncoderContext(Writer writer, HashMap map, HashMap map2, a aVar, boolean z11) {
        this.f19637b = new JsonWriter(writer);
        this.f19638c = map;
        this.f19639d = map2;
        this.f19640e = aVar;
        this.f19641f = z11;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext a(FieldDescriptor fieldDescriptor, boolean z11) throws IOException {
        String str = fieldDescriptor.f19622a;
        j();
        JsonWriter jsonWriter = this.f19637b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(z11);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext b(FieldDescriptor fieldDescriptor, long j11) throws IOException {
        String str = fieldDescriptor.f19622a;
        j();
        JsonWriter jsonWriter = this.f19637b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(j11);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext c(FieldDescriptor fieldDescriptor, int i11) throws IOException {
        String str = fieldDescriptor.f19622a;
        j();
        JsonWriter jsonWriter = this.f19637b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(i11);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext d(FieldDescriptor fieldDescriptor, double d5) throws IOException {
        String str = fieldDescriptor.f19622a;
        j();
        JsonWriter jsonWriter = this.f19637b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(d5);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public final ValueEncoderContext e(String str) throws IOException {
        j();
        this.f19637b.value(str);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public final ValueEncoderContext f(boolean z11) throws IOException {
        j();
        this.f19637b.value(z11);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext g(FieldDescriptor fieldDescriptor, Object obj) throws IOException {
        i(obj, fieldDescriptor.f19622a);
        return this;
    }

    public final JsonValueObjectEncoderContext h(Object obj) throws IOException {
        JsonWriter jsonWriter = this.f19637b;
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return this;
        }
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                jsonWriter.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    h(it.next());
                }
                jsonWriter.endArray();
                return this;
            }
            if (obj instanceof Map) {
                jsonWriter.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        i(entry.getValue(), (String) key);
                    } catch (ClassCastException e8) {
                        throw new EncodingException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e8);
                    }
                }
                jsonWriter.endObject();
                return this;
            }
            ObjectEncoder objectEncoder = (ObjectEncoder) this.f19638c.get(obj.getClass());
            if (objectEncoder != null) {
                jsonWriter.beginObject();
                objectEncoder.a(obj, this);
                jsonWriter.endObject();
                return this;
            }
            ValueEncoder valueEncoder = (ValueEncoder) this.f19639d.get(obj.getClass());
            if (valueEncoder != null) {
                valueEncoder.a(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                jsonWriter.beginObject();
                this.f19640e.a(obj, this);
                jsonWriter.endObject();
                return this;
            }
            if (obj instanceof NumberedEnum) {
                int iD = ((NumberedEnum) obj).d();
                j();
                jsonWriter.value(iD);
                return this;
            }
            String strName = ((Enum) obj).name();
            j();
            jsonWriter.value(strName);
            return this;
        }
        if (obj instanceof byte[]) {
            j();
            jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
            return this;
        }
        jsonWriter.beginArray();
        int i11 = 0;
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int length = iArr.length;
            while (i11 < length) {
                jsonWriter.value(iArr[i11]);
                i11++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i11 < length2) {
                long j11 = jArr[i11];
                j();
                jsonWriter.value(j11);
                i11++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i11 < length3) {
                jsonWriter.value(dArr[i11]);
                i11++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i11 < length4) {
                jsonWriter.value(zArr[i11]);
                i11++;
            }
        } else if (obj instanceof Number[]) {
            Number[] numberArr = (Number[]) obj;
            int length5 = numberArr.length;
            while (i11 < length5) {
                h(numberArr[i11]);
                i11++;
            }
        } else {
            Object[] objArr = (Object[]) obj;
            int length6 = objArr.length;
            while (i11 < length6) {
                h(objArr[i11]);
                i11++;
            }
        }
        jsonWriter.endArray();
        return this;
    }

    public final JsonValueObjectEncoderContext i(Object obj, String str) throws IOException {
        boolean z11 = this.f19641f;
        JsonWriter jsonWriter = this.f19637b;
        if (z11) {
            if (obj == null) {
                return this;
            }
            j();
            jsonWriter.name(str);
            h(obj);
            return this;
        }
        j();
        jsonWriter.name(str);
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        h(obj);
        return this;
    }

    public final void j() {
        if (!this.f19636a) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
    }
}
