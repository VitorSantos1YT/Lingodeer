package fb;

import fr.j3;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f27095b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f27096a;

    static {
        j jVar = new j(new LinkedHashMap());
        j3.V(jVar);
        f27095b = jVar;
    }

    public j(j other) {
        kotlin.jvm.internal.m.f(other, "other");
        this.f27096a = new HashMap(other.f27096a);
    }

    public static final j a(byte[] bytes) {
        kotlin.jvm.internal.m.f(bytes, "bytes");
        if (bytes.length > 10240) {
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        }
        if (bytes.length == 0) {
            return f27095b;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
            byte[] bArr = new byte[2];
            byteArrayInputStream.read(bArr);
            int i11 = 0;
            boolean z11 = bArr[0] == ((byte) 16777132) && bArr[1] == ((byte) (-21267));
            byteArrayInputStream.reset();
            if (z11) {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int i12 = objectInputStream.readInt();
                    while (i11 < i12) {
                        String utf = objectInputStream.readUTF();
                        kotlin.jvm.internal.m.e(utf, "readUTF()");
                        linkedHashMap.put(utf, objectInputStream.readObject());
                        i11++;
                    }
                    objectInputStream.close();
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        ns.o.m(objectInputStream, th2);
                        throw th3;
                    }
                }
            } else {
                DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
                try {
                    short s3 = dataInputStream.readShort();
                    if (s3 != -21521) {
                        throw new IllegalStateException(nv.p.j(s3, "Magic number doesn't match: ").toString());
                    }
                    short s11 = dataInputStream.readShort();
                    if (s11 != 1) {
                        throw new IllegalStateException(nv.p.j(s11, "Unsupported version number: ").toString());
                    }
                    int i13 = dataInputStream.readInt();
                    while (i11 < i13) {
                        Serializable serializableR = j3.r(dataInputStream, dataInputStream.readByte());
                        String key = dataInputStream.readUTF();
                        kotlin.jvm.internal.m.e(key, "key");
                        linkedHashMap.put(key, serializableR);
                        i11++;
                    }
                    dataInputStream.close();
                } catch (Throwable th4) {
                    try {
                        throw th4;
                    } catch (Throwable th5) {
                        ns.o.m(dataInputStream, th4);
                        throw th5;
                    }
                }
            }
        } catch (IOException unused) {
            int i14 = k.f27097a;
            l.b().getClass();
        } catch (ClassNotFoundException unused2) {
            int i15 = k.f27097a;
            l.b().getClass();
        }
        return new j(linkedHashMap);
    }

    public final boolean b(String str) {
        Object obj = this.f27096a.get(str);
        return obj != null && String.class.isAssignableFrom(obj.getClass());
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0059  */
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this != obj) {
            if (obj != null && j.class.equals(obj.getClass())) {
                HashMap map = ((j) obj).f27096a;
                HashMap map2 = this.f27096a;
                Set<String> setKeySet = map2.keySet();
                if (kotlin.jvm.internal.m.a(setKeySet, map.keySet())) {
                    for (String str : setKeySet) {
                        Object obj2 = map2.get(str);
                        Object obj3 = map.get(str);
                        if (obj2 == null || obj3 == null) {
                            zEquals = obj2 == obj3;
                        } else if (obj2 instanceof Object[]) {
                            Object[] objArr = (Object[]) obj2;
                            if (obj3 instanceof Object[]) {
                                zEquals = ry.l.E(objArr, (Object[]) obj3);
                            } else {
                                zEquals = obj2.equals(obj3);
                            }
                        } else {
                            zEquals = obj2.equals(obj3);
                        }
                        if (!zEquals) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = 0;
        for (Map.Entry entry : this.f27096a.entrySet()) {
            Object value = entry.getValue();
            iHashCode += value instanceof Object[] ? Objects.hashCode(entry.getKey()) ^ Arrays.deepHashCode((Object[]) value) : entry.hashCode();
        }
        return iHashCode * 31;
    }

    public final String toString() {
        String str = "Data {" + ry.m.y0(this.f27096a.entrySet(), null, null, null, i.f27093a, 31) + "}";
        kotlin.jvm.internal.m.e(str, "StringBuilder().apply(builderAction).toString()");
        return str;
    }

    public j(LinkedHashMap values) {
        kotlin.jvm.internal.m.f(values, "values");
        this.f27096a = new HashMap(values);
    }
}
