package com.google.common.collect;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
final class Serialization {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class FieldSetter<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Field f17181a;

        public FieldSetter(Field field) {
            this.f17181a = field;
            field.setAccessible(true);
        }

        public final void a(Serializable serializable, Object obj) {
            try {
                this.f17181a.set(serializable, obj);
            } catch (IllegalAccessException e8) {
                throw new AssertionError(e8);
            }
        }
    }

    private Serialization() {
    }

    public static FieldSetter a(Class cls, String str) {
        try {
            return new FieldSetter(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e8) {
            throw new AssertionError(e8);
        }
    }

    public static void b(Map map, ObjectInputStream objectInputStream, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            map.put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    public static void c(Multimap multimap, ObjectInputStream objectInputStream, int i11) throws IOException {
        for (int i12 = 0; i12 < i11; i12++) {
            Collection collection = multimap.get(objectInputStream.readObject());
            int i13 = objectInputStream.readInt();
            for (int i14 = 0; i14 < i13; i14++) {
                collection.add(objectInputStream.readObject());
            }
        }
    }

    public static void d(Multiset multiset, ObjectInputStream objectInputStream, int i11) throws ClassNotFoundException, IOException {
        for (int i12 = 0; i12 < i11; i12++) {
            multiset.add(objectInputStream.readInt(), objectInputStream.readObject());
        }
    }

    public static void e(Map map, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    public static void f(Multimap multimap, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(multimap.Y().size());
        for (Map.Entry entry : multimap.Y().entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(((Collection) entry.getValue()).size());
            Iterator it = ((Collection) entry.getValue()).iterator();
            while (it.hasNext()) {
                objectOutputStream.writeObject(it.next());
            }
        }
    }

    public static void g(Multiset multiset, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(multiset.entrySet().size());
        for (Multiset.Entry entry : multiset.entrySet()) {
            objectOutputStream.writeObject(entry.a());
            objectOutputStream.writeInt(entry.getCount());
        }
    }
}
