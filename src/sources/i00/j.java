package i00;

import com.google.android.gms.internal.stats.RC.ualZoVVCQs;
import com.tbruyelle.rxpermissions3.BuildConfig;
import hh.p0;
import java.lang.annotation.Annotation;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.internal.JsonDecodingException;
import kotlinx.serialization.json.internal.JsonEncodingException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f33909a = new k();

    public static final JsonEncodingException a(String str, Number number) {
        return new JsonEncodingException("Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) m(str, -1)));
    }

    public static final JsonEncodingException b(e00.g keyDescriptor) {
        kotlin.jvm.internal.m.f(keyDescriptor, "keyDescriptor");
        return new JsonEncodingException("Value of type '" + keyDescriptor.a() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + keyDescriptor.e() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    public static final JsonDecodingException c(int i11, CharSequence input, String message) {
        kotlin.jvm.internal.m.f(message, "message");
        kotlin.jvm.internal.m.f(input, "input");
        return d(i11, message + "\nJSON input: " + ((Object) m(input, i11)));
    }

    public static final JsonDecodingException d(int i11, String message) {
        kotlin.jvm.internal.m.f(message, "message");
        if (i11 >= 0) {
            message = "Unexpected JSON token at offset " + i11 + ": " + message;
        }
        return new JsonDecodingException(message);
    }

    public static final e00.g e(e00.g gVar, com.android.billingclient.api.h module) {
        e00.g gVarE;
        c00.a aVarI;
        kotlin.jvm.internal.m.f(gVar, "<this>");
        kotlin.jvm.internal.m.f(module, "module");
        if (!kotlin.jvm.internal.m.a(gVar.e(), e00.k.f24698c)) {
            return gVar.isInline() ? e(gVar.i(0), module) : gVar;
        }
        mz.c cVarL = md.a.l(gVar);
        e00.g descriptor = null;
        if (cVarL != null && (aVarI = module.i(cVarL, ry.r.f50854a)) != null) {
            descriptor = aVarI.getDescriptor();
        }
        return (descriptor == null || (gVarE = e(descriptor, module)) == null) ? gVar : gVarE;
    }

    public static final byte f(char c11) {
        if (c11 < '~') {
            return e.f33902b[c11];
        }
        return (byte) 0;
    }

    public static final void g(o00.a kind) {
        kotlin.jvm.internal.m.f(kind, "kind");
        if (kind instanceof e00.l) {
            throw new IllegalStateException("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        }
        if (kind instanceof e00.f) {
            throw new IllegalStateException("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        }
        if (kind instanceof e00.d) {
            throw new IllegalStateException("Actual serializer for polymorphic cannot be polymorphic itself");
        }
    }

    public static final String h(e00.g gVar, h00.c json) {
        kotlin.jvm.internal.m.f(gVar, "<this>");
        kotlin.jvm.internal.m.f(json, "json");
        for (Annotation annotation : gVar.getAnnotations()) {
            if (annotation instanceof h00.i) {
                return ((h00.i) annotation).discriminator();
            }
        }
        return json.f29916a.f29935f;
    }

    public static final int i(e00.g gVar, h00.c json, String name) {
        kotlin.jvm.internal.m.f(gVar, "<this>");
        kotlin.jvm.internal.m.f(json, "json");
        kotlin.jvm.internal.m.f(name, "name");
        n(gVar, json);
        int iD = gVar.d(name);
        if (iD != -3 || !json.f29916a.f29936g) {
            return iD;
        }
        a5.j jVar = json.f29918c;
        fp.f fVar = new fp.f(11, gVar, json);
        jVar.getClass();
        k kVar = f33909a;
        Object objK = jVar.k(gVar, kVar);
        if (objK == null) {
            objK = fVar.invoke();
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) jVar.f385b;
            Object concurrentHashMap2 = concurrentHashMap.get(gVar);
            if (concurrentHashMap2 == null) {
                concurrentHashMap2 = new ConcurrentHashMap(2);
                concurrentHashMap.put(gVar, concurrentHashMap2);
            }
            ((Map) concurrentHashMap2).put(kVar, objK);
        }
        Integer num = (Integer) ((Map) objK).get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public static final int j(e00.g gVar, h00.c json, String name, String suffix) {
        kotlin.jvm.internal.m.f(gVar, "<this>");
        kotlin.jvm.internal.m.f(json, "json");
        kotlin.jvm.internal.m.f(name, "name");
        kotlin.jvm.internal.m.f(suffix, "suffix");
        int i11 = i(gVar, json, name);
        if (i11 != -3) {
            return i11;
        }
        throw new SerializationException(gVar.a() + " does not contain element with name '" + name + '\'' + suffix);
    }

    public static final boolean k(e00.g gVar, h00.c json) {
        kotlin.jvm.internal.m.f(gVar, "<this>");
        kotlin.jvm.internal.m.f(json, "json");
        if (json.f29916a.f29930a) {
            return true;
        }
        List annotations = gVar.getAnnotations();
        if (annotations != null && annotations.isEmpty()) {
            return false;
        }
        Iterator it = annotations.iterator();
        while (it.hasNext()) {
            if (((Annotation) it.next()) instanceof h00.r) {
                return true;
            }
        }
        return false;
    }

    public static final void l(a.a aVar, String str) {
        aVar.t(aVar.f5b - 1, "Trailing comma before the end of JSON ".concat(str), "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingComma = true' in 'Json {}' builder to support them.");
        throw null;
    }

    public static final CharSequence m(CharSequence charSequence, int i11) {
        kotlin.jvm.internal.m.f(charSequence, "<this>");
        if (charSequence.length() >= 200) {
            if (i11 != -1) {
                int i12 = i11 - 30;
                int i13 = i11 + 30;
                String str = i12 <= 0 ? BuildConfig.VERSION_NAME : ".....";
                String str2 = i13 >= charSequence.length() ? BuildConfig.VERSION_NAME : ".....";
                StringBuilder sbN = ep.a.n(str);
                if (i12 < 0) {
                    i12 = 0;
                }
                int length = charSequence.length();
                if (i13 > length) {
                    i13 = length;
                }
                sbN.append(charSequence.subSequence(i12, i13).toString());
                sbN.append(str2);
                return sbN.toString();
            }
            int length2 = charSequence.length() - 60;
            if (length2 > 0) {
                return "....." + charSequence.subSequence(length2, charSequence.length()).toString();
            }
        }
        return charSequence;
    }

    public static final void n(e00.g gVar, h00.c json) {
        kotlin.jvm.internal.m.f(gVar, "<this>");
        kotlin.jvm.internal.m.f(json, "json");
        kotlin.jvm.internal.m.a(gVar.e(), e00.m.f24700c);
    }

    public static final Object o(h00.c cVar, String discriminator, h00.z zVar, c00.a aVar) {
        kotlin.jvm.internal.m.f(cVar, "<this>");
        kotlin.jvm.internal.m.f(discriminator, "discriminator");
        return new n(cVar, zVar, discriminator, aVar.getDescriptor()).x(aVar);
    }

    public static final a0 p(e00.g desc, h00.c cVar) {
        kotlin.jvm.internal.m.f(desc, "desc");
        o00.a aVarE = desc.e();
        if (aVarE instanceof e00.d) {
            return a0.POLY_OBJ;
        }
        if (kotlin.jvm.internal.m.a(aVarE, e00.m.f24701d)) {
            return a0.LIST;
        }
        if (!kotlin.jvm.internal.m.a(aVarE, e00.m.f24702e)) {
            return a0.OBJ;
        }
        e00.g gVarE = e(desc.i(0), cVar.f29917b);
        o00.a aVarE2 = gVarE.e();
        if ((aVarE2 instanceof e00.f) || kotlin.jvm.internal.m.a(aVarE2, e00.l.f24699c)) {
            return a0.MAP;
        }
        throw b(gVarE);
    }

    public static final void q(a.a aVar, Number number) {
        a.a.u(aVar, "Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
        throw null;
    }

    public static final void r(h00.m element, String str) {
        kotlin.jvm.internal.m.f(element, "element");
        StringBuilder sbQ = p0.q("Class with serial name ", str, " cannot be serialized polymorphically because it is represented as ");
        sbQ.append(kotlin.jvm.internal.z.a(element.getClass()).g());
        sbQ.append(". Make sure that its JsonTransformingSerializer returns JsonObject, so class discriminator can be added to it.");
        throw new JsonEncodingException(sbQ.toString());
    }

    public static final String s(byte b3) {
        if (b3 == 1) {
            return "quotation mark '\"'";
        }
        if (b3 == 2) {
            return "string escape sequence '\\'";
        }
        if (b3 == 4) {
            return "comma ','";
        }
        if (b3 == 5) {
            return "colon ':'";
        }
        if (b3 == 6) {
            return ualZoVVCQs.FBaeANrunEpxOlU;
        }
        if (b3 == 7) {
            return "end of the object '}'";
        }
        if (b3 == 8) {
            return "start of the array '['";
        }
        if (b3 == 9) {
            return "end of the array ']'";
        }
        if (b3 == 10) {
            return "end of the input";
        }
        return b3 == 127 ? "invalid token" : "valid token";
    }

    public static final String t(Number number, String str, String str2) {
        return "Unexpected special floating-point value " + number + " with key " + str + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) m(str2, -1));
    }
}
