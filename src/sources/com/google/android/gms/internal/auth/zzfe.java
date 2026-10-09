package com.google.android.gms.internal.auth;

import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfe extends zzdr implements RandomAccess, zzff {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f9503b;

    static {
        new zzfe((Object) null);
    }

    public zzfe() {
        this(10);
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i11, Object obj) {
        zza();
        this.f9503b.add(i11, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final boolean addAll(int i11, Collection collection) {
        zza();
        if (collection instanceof zzff) {
            collection = ((zzff) collection).zzg();
        }
        boolean zAddAll = this.f9503b.addAll(i11, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final String get(int i11) {
        List list = this.f9503b;
        Object obj = list.get(i11);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzef) {
            zzef zzefVar = (zzef) obj;
            String strH = zzefVar.e() == 0 ? BuildConfig.VERSION_NAME : zzefVar.h(zzfa.f9501a);
            if (zzefVar.j()) {
                list.set(i11, strH);
            }
            return strH;
        }
        byte[] bArr = (byte[]) obj;
        String str = new String(bArr, zzfa.f9501a);
        if (zzhn.f9576a.b(bArr, 0, bArr.length)) {
            list.set(i11, str);
        }
        return str;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        zza();
        this.f9503b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final Object remove(int i11) {
        zza();
        Object objRemove = this.f9503b.remove(i11);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (!(objRemove instanceof zzef)) {
            return new String((byte[]) objRemove, zzfa.f9501a);
        }
        zzef zzefVar = (zzef) objRemove;
        return zzefVar.e() == 0 ? BuildConfig.VERSION_NAME : zzefVar.h(zzfa.f9501a);
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final Object set(int i11, Object obj) {
        zza();
        Object obj2 = this.f9503b.set(i11, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof zzef)) {
            return new String((byte[]) obj2, zzfa.f9501a);
        }
        zzef zzefVar = (zzef) obj2;
        return zzefVar.e() == 0 ? BuildConfig.VERSION_NAME : zzefVar.h(zzfa.f9501a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9503b.size();
    }

    @Override // com.google.android.gms.internal.auth.zzez
    public final zzez zzd(int i11) {
        List list = this.f9503b;
        if (i11 < list.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i11);
        arrayList.addAll(list);
        return new zzfe(arrayList);
    }

    @Override // com.google.android.gms.internal.auth.zzff
    public final zzff zze() {
        return this.f9470a ? new zzhe(this) : this;
    }

    @Override // com.google.android.gms.internal.auth.zzff
    public final List zzg() {
        return Collections.unmodifiableList(this.f9503b);
    }

    public zzfe(int i11) {
        ArrayList arrayList = new ArrayList(i11);
        super(true);
        this.f9503b = arrayList;
    }

    public zzfe(ArrayList arrayList) {
        super(true);
        this.f9503b = arrayList;
    }

    public zzfe(Object obj) {
        super(false);
        this.f9503b = Collections.EMPTY_LIST;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f9503b.size(), collection);
    }
}
