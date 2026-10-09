package com.google.common.collect;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.Enum;
import java.util.EnumMap;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public final class EnumBiMap<K extends Enum<K>, V extends Enum<V>> extends AbstractBiMap<K, V> {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public transient Class f16706f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public transient Class f16707t;

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Object object = objectInputStream.readObject();
        Objects.requireNonNull(object);
        this.f16706f = (Class) object;
        Object object2 = objectInputStream.readObject();
        Objects.requireNonNull(object2);
        this.f16707t = (Class) object2;
        z0(new EnumMap(this.f16706f), new EnumMap(this.f16707t));
        Serialization.b(this, objectInputStream, objectInputStream.readInt());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f16706f);
        objectOutputStream.writeObject(this.f16707t);
        Serialization.e(this, objectOutputStream);
    }

    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.BiMap
    public final BiMap Z() {
        return this.f16543b;
    }

    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.ForwardingMap, java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f16543b.containsKey(obj);
    }

    @Override // com.google.common.collect.AbstractBiMap
    public final Object r0(Object obj) {
        Enum r9 = (Enum) obj;
        r9.getClass();
        return r9;
    }

    @Override // com.google.common.collect.AbstractBiMap
    public final Object w0(Object obj) {
        Enum r9 = (Enum) obj;
        r9.getClass();
        return r9;
    }
}
