package com.google.protobuf;

import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class LazyStringArrayList extends AbstractProtobufList<String> implements LazyStringList, RandomAccess {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f21298c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f21299b;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class ByteArrayListView extends AbstractList<byte[]> implements RandomAccess {
        @Override // java.util.AbstractList, java.util.List
        public final void add(int i11, Object obj) {
            int i12 = LazyStringArrayList.f21298c;
            throw null;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i11) {
            throw null;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object remove(int i11) {
            throw null;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object set(int i11, Object obj) {
            int i12 = LazyStringArrayList.f21298c;
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class ByteStringListView extends AbstractList<ByteString> implements RandomAccess {
        @Override // java.util.AbstractList, java.util.List
        public final void add(int i11, Object obj) {
            int i12 = LazyStringArrayList.f21298c;
            throw null;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i11) {
            throw null;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object remove(int i11) {
            throw null;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object set(int i11, Object obj) {
            int i12 = LazyStringArrayList.f21298c;
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            throw null;
        }
    }

    static {
        new LazyStringArrayList((Object) null);
    }

    public LazyStringArrayList() {
        this(10);
    }

    @Override // com.google.protobuf.LazyStringList
    public final void F(ByteString byteString) {
        b();
        this.f21299b.add(byteString);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.LazyStringList
    public final LazyStringList X0() {
        return this.f21142a ? new UnmodifiableLazyStringList(this) : this;
    }

    @Override // com.google.protobuf.Internal.ProtobufList, com.google.protobuf.Internal.BooleanList
    public final Internal.ProtobufList a(int i11) {
        List list = this.f21299b;
        if (i11 < list.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i11);
        arrayList.addAll(list);
        return new LazyStringArrayList(arrayList);
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final void add(int i11, Object obj) {
        b();
        this.f21299b.add(i11, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f21299b.size(), collection);
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        b();
        this.f21299b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i11) {
        List list = this.f21299b;
        Object obj = list.get(i11);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            String strU = byteString.size() == 0 ? BuildConfig.VERSION_NAME : byteString.u(Internal.f21282a);
            if (byteString.l()) {
                list.set(i11, strU);
            }
            return strU;
        }
        byte[] bArr = (byte[]) obj;
        String str = new String(bArr, Internal.f21282a);
        if (Utf8.f21424a.e(bArr, 0, bArr.length)) {
            list.set(i11, str);
        }
        return str;
    }

    @Override // com.google.protobuf.LazyStringList
    public final Object j1(int i11) {
        return this.f21299b.get(i11);
    }

    @Override // com.google.protobuf.LazyStringList
    public final List q() {
        return Collections.unmodifiableList(this.f21299b);
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final Object remove(int i11) {
        b();
        Object objRemove = this.f21299b.remove(i11);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (!(objRemove instanceof ByteString)) {
            return new String((byte[]) objRemove, Internal.f21282a);
        }
        ByteString byteString = (ByteString) objRemove;
        return byteString.size() == 0 ? BuildConfig.VERSION_NAME : byteString.u(Internal.f21282a);
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final Object set(int i11, Object obj) {
        b();
        Object obj2 = this.f21299b.set(i11, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof ByteString)) {
            return new String((byte[]) obj2, Internal.f21282a);
        }
        ByteString byteString = (ByteString) obj2;
        return byteString.size() == 0 ? BuildConfig.VERSION_NAME : byteString.u(Internal.f21282a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f21299b.size();
    }

    @Override // com.google.protobuf.AbstractProtobufList, com.google.protobuf.Internal.ProtobufList
    public final boolean y1() {
        return this.f21142a;
    }

    public LazyStringArrayList(Object obj) {
        super(false);
        this.f21299b = Collections.EMPTY_LIST;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final boolean addAll(int i11, Collection collection) {
        b();
        if (collection instanceof LazyStringList) {
            collection = ((LazyStringList) collection).q();
        }
        boolean zAddAll = this.f21299b.addAll(i11, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    public LazyStringArrayList(int i11) {
        this(new ArrayList(i11));
    }

    public LazyStringArrayList(ArrayList arrayList) {
        this.f21299b = arrayList;
    }
}
