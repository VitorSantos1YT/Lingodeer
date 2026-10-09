package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.util.AbstractList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzaed {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f11274a;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class zza<T> extends AbstractList<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zzaeb f11275a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final zzaec f11276b;

        public zza(zzaeb zzaebVar, zzaec zzaecVar) {
            this.f11275a = zzaebVar;
            this.f11276b = zzaecVar;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i11) {
            return this.f11276b.zza(this.f11275a.U(i11));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f11275a.size();
        }
    }

    static {
        byte[] bArr = new byte[0];
        f11274a = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new zzact(bArr).a(0);
        } catch (zzaeh e8) {
            throw new IllegalArgumentException(e8);
        }
    }

    public static int a(int i11, byte[] bArr, int i12, int i13) {
        for (int i14 = i12; i14 < i12 + i13; i14++) {
            i11 = (i11 * 31) + bArr[i14];
        }
        return i11;
    }
}
