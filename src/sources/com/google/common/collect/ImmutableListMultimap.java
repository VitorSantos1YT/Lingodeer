package com.google.common.collect;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public class ImmutableListMultimap<K, V> extends ImmutableMultimap<K, V> implements ListMultimap<K, V> {
    private static final long serialVersionUID = 0;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder<K, V> extends ImmutableMultimap.Builder<K, V> {
    }

    public static ImmutableListMultimap p() {
        return EmptyImmutableListMultimap.H;
    }

    public static ImmutableListMultimap q(String str) {
        Builder builder = new Builder();
        CollectPreconditions.a("charset", str);
        Map compactHashMap = builder.f16805a;
        if (compactHashMap == null) {
            compactHashMap = new CompactHashMap();
            builder.f16805a = compactHashMap;
        }
        ImmutableCollection.Builder builderL = (ImmutableCollection.Builder) compactHashMap.get("charset");
        if (builderL == null) {
            builderL = ImmutableList.l(4);
            Map compactHashMap2 = builder.f16805a;
            if (compactHashMap2 == null) {
                compactHashMap2 = new CompactHashMap();
                builder.f16805a = compactHashMap2;
            }
            compactHashMap2.put("charset", builderL);
        }
        builderL.c(str);
        Map map = builder.f16805a;
        if (map == null) {
            return EmptyImmutableListMultimap.H;
        }
        Collection collectionEntrySet = ((CompactHashMap) map).entrySet();
        if (((AbstractCollection) collectionEntrySet).isEmpty()) {
            return EmptyImmutableListMultimap.H;
        }
        CompactHashMap.EntrySetView<Map.Entry> entrySetView = (CompactHashMap.EntrySetView) collectionEntrySet;
        ImmutableMap.Builder builder2 = new ImmutableMap.Builder(CompactHashMap.this.size());
        int i11 = 0;
        for (Map.Entry entry : entrySetView) {
            Object key = entry.getKey();
            ImmutableList immutableListJ = ((ImmutableList.Builder) entry.getValue()).j();
            builder2.c(key, immutableListJ);
            i11 += ((RegularImmutableList) immutableListJ).f17149d;
        }
        return new ImmutableListMultimap(builder2.a(true), i11);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i11 = objectInputStream.readInt();
        if (i11 < 0) {
            throw new InvalidObjectException(p.j(i11, "Invalid key count "));
        }
        ImmutableMap.Builder builder = new ImmutableMap.Builder();
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            Object object = objectInputStream.readObject();
            Objects.requireNonNull(object);
            int i14 = objectInputStream.readInt();
            if (i14 <= 0) {
                throw new InvalidObjectException(p.j(i14, "Invalid value count "));
            }
            UnmodifiableListIterator unmodifiableListIterator = ImmutableList.f16771b;
            ImmutableList.Builder builder2 = new ImmutableList.Builder();
            for (int i15 = 0; i15 < i14; i15++) {
                Object object2 = objectInputStream.readObject();
                Objects.requireNonNull(object2);
                builder2.h(object2);
            }
            builder.c(object, builder2.j());
            i12 += i14;
        }
        try {
            ImmutableMultimap.FieldSettersHolder.f16807a.a(this, builder.a(true));
            Serialization.FieldSetter fieldSetter = ImmutableMultimap.FieldSettersHolder.f16808b;
            fieldSetter.getClass();
            try {
                fieldSetter.f17181a.set(this, Integer.valueOf(i12));
            } catch (IllegalAccessException e8) {
                throw new AssertionError(e8);
            }
        } catch (IllegalArgumentException e10) {
            throw ((InvalidObjectException) new InvalidObjectException(e10.getMessage()).initCause(e10));
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        Serialization.f(this, objectOutputStream);
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public final Collection b(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public final Collection get(Object obj) {
        ImmutableList immutableList = (ImmutableList) this.f16798f.get(obj);
        if (immutableList != null) {
            return immutableList;
        }
        UnmodifiableListIterator unmodifiableListIterator = ImmutableList.f16771b;
        return RegularImmutableList.f17147e;
    }

    @Override // com.google.common.collect.ImmutableMultimap
    /* JADX INFO: renamed from: m */
    public final ImmutableCollection get(Object obj) {
        ImmutableList immutableList = (ImmutableList) this.f16798f.get(obj);
        if (immutableList != null) {
            return immutableList;
        }
        UnmodifiableListIterator unmodifiableListIterator = ImmutableList.f16771b;
        return RegularImmutableList.f17147e;
    }

    @Override // com.google.common.collect.ImmutableMultimap
    public final ImmutableCollection o() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public final List b(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public final List get(Object obj) {
        ImmutableList immutableList = (ImmutableList) this.f16798f.get(obj);
        if (immutableList != null) {
            return immutableList;
        }
        UnmodifiableListIterator unmodifiableListIterator = ImmutableList.f16771b;
        return RegularImmutableList.f17147e;
    }
}
