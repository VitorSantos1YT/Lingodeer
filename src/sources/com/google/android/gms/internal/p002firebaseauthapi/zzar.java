package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzar<K, V> extends zzal<K, V> {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f10238t = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Object f10239d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient Object[] f10240e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient int f10241f;

    static {
        new zzar(0, null, new Object[0]);
    }

    public zzar(int i11, Object obj, Object[] objArr) {
        this.f10239d = obj;
        this.f10240e = objArr;
        this.f10241f = i11;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzal
    public final zzag a() {
        return new zzav(1, this.f10241f, this.f10240e);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzal
    public final zzaq c() {
        return new zzau(this, this.f10240e, this.f10241f);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzal
    public final zzaq d() {
        return new zzaw(this, new zzav(0, this.f10241f, this.f10240e));
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0003  */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzal, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        if (obj == null) {
            obj2 = null;
        } else {
            Object[] objArr = this.f10240e;
            if (this.f10241f == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    Objects.requireNonNull(obj2);
                } else {
                    obj2 = null;
                }
            } else {
                Object obj4 = this.f10239d;
                if (obj4 == null) {
                    obj2 = null;
                } else if (obj4 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj4;
                    int length = bArr.length - 1;
                    int iA = zzad.a(obj.hashCode());
                    while (true) {
                        int i11 = iA & length;
                        int i12 = bArr[i11] & 255;
                        if (i12 == 255) {
                            break;
                        }
                        if (obj.equals(objArr[i12])) {
                            obj2 = objArr[i12 ^ 1];
                        } else {
                            iA = i11 + 1;
                        }
                    }
                    obj2 = null;
                } else if (obj4 instanceof short[]) {
                    short[] sArr = (short[]) obj4;
                    int length2 = sArr.length - 1;
                    int iA2 = zzad.a(obj.hashCode());
                    while (true) {
                        int i13 = iA2 & length2;
                        int i14 = sArr[i13] & 65535;
                        if (i14 == 65535) {
                            break;
                        }
                        if (obj.equals(objArr[i14])) {
                            obj2 = objArr[i14 ^ 1];
                        } else {
                            iA2 = i13 + 1;
                        }
                    }
                    obj2 = null;
                } else {
                    int[] iArr = (int[]) obj4;
                    int length3 = iArr.length - 1;
                    int iA3 = zzad.a(obj.hashCode());
                    while (true) {
                        int i15 = iA3 & length3;
                        int i16 = iArr[i15];
                        if (i16 == -1) {
                            break;
                        }
                        if (obj.equals(objArr[i16])) {
                            obj2 = objArr[i16 ^ 1];
                        } else {
                            iA3 = i15 + 1;
                        }
                    }
                    obj2 = null;
                }
            }
        }
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f10241f;
    }
}
